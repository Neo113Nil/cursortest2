package ru.ok.tracer.base.drop;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.random.Random;
import org.json.JSONArray;
import org.json.JSONException;
import ru.ok.tracer.base.io.FileUtils;
import xsna.e43;
import xsna.emb;
import xsna.iky;
import xsna.j5g;
import xsna.nbr;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DropManager.kt */
/* loaded from: classes9.dex */
public final class DropManager {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_MAX_RECORDS_SIZE = 15;
    private static final String EVENT_UNKNOWN = "unknown";
    private static final String REASON_MAX_SIZE_EXCEEDED = "max_size_exceeded";
    private final File dir;
    private final File file;
    private final Object lock;
    private volatile State state;
    private final File takenFile;
    private final File tmpFile;

    /* compiled from: DropManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int compareRecord(DropRecord dropRecord, String str, String str2) {
            int compareTo = dropRecord.getEvent$tracer_base_release().compareTo(str);
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = dropRecord.getReason$tracer_base_release().compareTo(str2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return 0;
        }

        public static /* synthetic */ List merge$tracer_base_release$default(Companion companion, List list, Collection collection, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 15;
            }
            return companion.merge$tracer_base_release(list, collection, i);
        }

        private final void mergeInto(List<DropRecord> list, DropRecord dropRecord) {
            int i;
            DropRecordComparator dropRecordComparator = DropRecordComparator.INSTANCE;
            int size = list.size();
            e43.q(list.size(), size);
            int i2 = size - 1;
            int i3 = 0;
            while (true) {
                if (i3 > i2) {
                    i = -(i3 + 1);
                    break;
                }
                i = (i3 + i2) >>> 1;
                int compare = dropRecordComparator.compare(list.get(i), dropRecord);
                if (compare >= 0) {
                    if (compare <= 0) {
                        break;
                    } else {
                        i2 = i - 1;
                    }
                } else {
                    i3 = i + 1;
                }
            }
            if (i >= 0) {
                list.set(i, list.get(i).copyIncrementCount$tracer_base_release(dropRecord.getCount$tracer_base_release()));
            } else {
                list.add((-i) - 1, dropRecord);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final List<DropRecord> merge$tracer_base_release(List<DropRecord> list, Collection<DropRecord> collection, int i) {
            if (i <= 0) {
                throw new IllegalStateException("maxRecordsCount <= 0");
            }
            if (list.isEmpty()) {
                return j5g.D0(DropRecordComparator.INSTANCE, collection);
            }
            if (collection.isEmpty()) {
                return list;
            }
            ListBuilder e = e43.e();
            e.addAll(list);
            Iterator<DropRecord> it = collection.iterator();
            while (it.hasNext()) {
                DropManager.Companion.mergeInto(e, it.next());
            }
            if (e.size() > i) {
                iky ikyVar = new iky(Random.b);
                int i2 = 0;
                while (e.size() > i - 1) {
                    i2 += ((DropRecord) e.remove(ikyVar.nextInt(e.size()))).getCount$tracer_base_release();
                }
                DropManager.Companion.mergeInto(e, new DropRecord("unknown", DropManager.REASON_MAX_SIZE_EXCEEDED, i2));
            }
            return e.g();
        }

        private Companion() {
        }
    }

    /* compiled from: DropManager.kt */
    public static final class DropRecordComparator implements Comparator<DropRecord> {
        public static final DropRecordComparator INSTANCE = new DropRecordComparator();

        private DropRecordComparator() {
        }

        @Override // java.util.Comparator
        public int compare(DropRecord dropRecord, DropRecord dropRecord2) {
            return DropManager.Companion.compareRecord(dropRecord, dropRecord2.getEvent$tracer_base_release(), dropRecord2.getReason$tracer_base_release());
        }
    }

    /* compiled from: DropManager.kt */
    public static abstract class State {

        /* compiled from: DropManager.kt */
        public static final class Loaded extends State {
            private final List<DropRecord> records;

            public Loaded(List<DropRecord> list) {
                super(null);
                this.records = list;
            }

            public final List<DropRecord> getRecords() {
                return this.records;
            }
        }

        /* compiled from: DropManager.kt */
        public static final class None extends State {
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        /* compiled from: DropManager.kt */
        public static final class Taken extends State {
            private final WeakReference<List<DropRecord>> weakRecords;

            public Taken(List<DropRecord> list) {
                super(null);
                this.weakRecords = new WeakReference<>(list);
            }

            public final List<DropRecord> getRecords() {
                return this.weakRecords.get();
            }
        }

        public /* synthetic */ State(zcl zclVar) {
            this();
        }

        private State() {
        }
    }

    public DropManager(File file) {
        this.file = file;
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IllegalStateException(("File " + file + " not in directory").toString());
        }
        this.dir = parentFile;
        this.tmpFile = nbr.t(parentFile, file.getName() + ".tmp");
        this.takenFile = nbr.t(parentFile, file.getName() + ".taken");
        this.state = State.None.INSTANCE;
        this.lock = new Object();
    }

    public static /* synthetic */ void drop$default(DropManager dropManager, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        dropManager.drop(str, str2, i);
    }

    private final List<DropRecord> load() {
        if (!this.file.exists()) {
            return EmptyList.b;
        }
        try {
            return DropRecordSerializer.INSTANCE.fromJsonArray$tracer_base_release(new JSONArray(nbr.r(this.file, emb.b)));
        } catch (IOException e) {
            Log.e("Tracer", "Couldn't read " + this.file, e);
            return EmptyList.b;
        } catch (JSONException e2) {
            Log.e("Tracer", "Couldn't read " + this.file, e2);
            try {
                FileUtils.deleteChecked(this.file);
            } catch (IOException unused) {
                Log.e("Tracer", "Couldn't delete " + this.file);
            }
            return EmptyList.b;
        }
    }

    private final void save(List<DropRecord> list) {
        String jSONArray = DropRecordSerializer.INSTANCE.toJsonArray(list).toString();
        try {
            FileUtils.mkdirsChecked(this.dir);
            nbr.w(this.tmpFile, jSONArray, emb.b);
            FileUtils.renameToChecked(this.tmpFile, this.file);
        } catch (IOException e) {
            Log.e("Tracer", "Couldn't write " + this.file, e);
            try {
                FileUtils.deleteChecked(this.file);
            } catch (IOException unused) {
                Log.e("Tracer", "Couldn't delete " + this.file);
            }
        }
    }

    public final void drop(String str, String str2) {
        drop$default(this, str, str2, 0, 4, null);
    }

    public final Collection<DropRecord> take() {
        List<DropRecord> records;
        State state = this.state;
        if ((state instanceof State.Loaded) && ((State.Loaded) state).getRecords().isEmpty()) {
            return EmptyList.b;
        }
        if (state instanceof State.Taken) {
            return EmptyList.b;
        }
        synchronized (this.lock) {
            try {
                State state2 = this.state;
                if (state2 instanceof State.None) {
                    records = load();
                } else {
                    if (!(state2 instanceof State.Loaded)) {
                        if (!(state2 instanceof State.Taken)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return EmptyList.b;
                    }
                    records = ((State.Loaded) state2).getRecords();
                }
                if (records.isEmpty()) {
                    this.state = new State.Loaded(EmptyList.b);
                } else {
                    this.file.renameTo(this.takenFile);
                    this.state = new State.Taken(records);
                }
                return records;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void drop(String str, String str2, int i) {
        drop(Collections.singletonList(new DropRecord(str, str2, i)));
    }

    public final void drop(Collection<DropRecord> collection) {
        List<DropRecord> list;
        if (collection.isEmpty()) {
            return;
        }
        synchronized (this.lock) {
            State state = this.state;
            if ((state instanceof State.Taken) && collection == ((State.Taken) state).getRecords()) {
                this.dir.mkdirs();
                this.takenFile.renameTo(this.file);
                this.state = new State.Loaded((List) collection);
                return;
            }
            State state2 = this.state;
            if (state2 instanceof State.None) {
                list = load();
            } else if (state2 instanceof State.Loaded) {
                list = ((State.Loaded) state2).getRecords();
            } else if (state2 instanceof State.Taken) {
                list = EmptyList.b;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            List<DropRecord> merge$tracer_base_release$default = Companion.merge$tracer_base_release$default(Companion, list, collection, 0, 4, null);
            save(merge$tracer_base_release$default);
            this.state = new State.Loaded(merge$tracer_base_release$default);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
