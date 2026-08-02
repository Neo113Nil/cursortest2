package xsna;

import android.database.Cursor;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* compiled from: FolderToSublistAssociationDb.kt */
/* loaded from: classes2.dex */
public final class f0s {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FolderToSublistAssociationDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FOLDER_ID;
        public static final a SUBLIST_TYPE;
        private final String key;

        static {
            a aVar = new a("FOLDER_ID", 0, "folder_id");
            FOLDER_ID = aVar;
            a aVar2 = new a("SUBLIST_TYPE", 1, "sublist_type");
            SUBLIST_TYPE = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.key = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // xsna.qgl0
        public final String getKey() {
            return this.key;
        }
    }

    public f0s() {
        throw null;
    }

    public f0s(tgl0 tgl0Var) {
        this.a = new sgl0("folder_to_sublist", a.class);
        this.b = tgl0Var;
    }

    public final Collection<Integer> a(Collection<String> collection) {
        if (collection.isEmpty()) {
            return EmptyList.b;
        }
        String g0 = j5g.g0(collection, null, "(", ")", 0, new per(1), 25);
        Cursor b = this.b.b().b(this.a.a, new String[]{a.FOLDER_ID.getKey()}, a.SUBLIST_TYPE + " in " + g0, null);
        ArrayList arrayList = new ArrayList(b.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (b.moveToFirst()) {
                    while (!b.isAfterLast()) {
                        arrayList.add(Integer.valueOf(fl3.A(b, a.FOLDER_ID.getKey())));
                        b.moveToNext();
                    }
                }
                Trace.endSection();
                return arrayList;
            } finally {
                b.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final ArrayList b(int i) {
        Cursor d = this.b.b().d(this.a.a(a.FOLDER_ID, Integer.valueOf(i)), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(fl3.E(d, a.SUBLIST_TYPE.getKey()));
                        d.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }
}
