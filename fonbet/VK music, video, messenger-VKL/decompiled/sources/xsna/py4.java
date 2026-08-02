package xsna;

import android.util.Range;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.timeline.AudioFragment;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.k0h0;
import xsna.qy4;
import xsna.sz4;

/* compiled from: AudioTimelineReader.kt */
/* loaded from: classes3.dex */
public final class py4 {
    public el4 a;
    public final b b;
    public final f100 c;
    public boolean d;
    public a e;

    /* compiled from: AudioTimelineReader.kt */
    public static final class a {
        public final f100 a;
        public final el4 b;
        public boolean c;
        public final List<AudioFragmentItem> d;
        public final List<xx4> e;
        public final qy4[] f;
        public final sz4 g;

        public a(f100 f100Var, el4 el4Var, long j) {
            this.a = f100Var;
            this.b = el4Var;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (Object obj : el4Var.a) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                arrayList.add(this.b.b.b.get(i2));
                arrayList2.add((xx4) obj);
                i2 = i3;
            }
            this.d = Collections.unmodifiableList(arrayList);
            this.e = Collections.unmodifiableList(arrayList2);
            int size = arrayList2.size();
            qy4[] qy4VarArr = new qy4[size];
            for (int i4 = 0; i4 < size; i4++) {
                qy4VarArr[i4] = qy4.a.a;
            }
            this.f = qy4VarArr;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                ((xx4) next).seekTo(((AudioFragmentItem) arrayList.get(i)).b.c);
                i = i5;
            }
            f100 f100Var2 = this.a;
            Iterator it2 = arrayList.iterator();
            ArrayList arrayList3 = new ArrayList(Math.min(c5g.u(arrayList, 10), c5g.u(arrayList2, 10)));
            for (Iterator it3 = arrayList2.iterator(); it2.hasNext() && it3.hasNext(); it3 = it3) {
                Object next2 = it2.next();
                xx4 xx4Var = (xx4) it3.next();
                AudioFragmentItem audioFragmentItem = (AudioFragmentItem) next2;
                AudioFragment audioFragment = this.b.b;
                AudioItem audioItem = audioFragmentItem.b;
                long j2 = audioFragment.d - audioFragment.c;
                arrayList3.add(new kz4(audioFragmentItem.c, audioItem.c, Math.min(xx4Var.f(), Math.min(audioItem.d, audioItem.c + ((long) ((j2 - r14) * audioItem.e)))), audioItem.f, audioItem.e, audioItem.g, xx4Var instanceof rmj0));
                it2 = it2;
            }
            this.g = new sz4(f100Var2, arrayList3, new Range(Long.valueOf(this.b.b.c), Long.valueOf(this.b.b.d)), j);
        }
    }

    /* compiled from: AudioTimelineReader.kt */
    public interface b {
        void a(long j);

        void b(List list, qy4[] qy4VarArr);

        void c();

        void d(el4 el4Var, List<AudioFragmentItem> list, List<? extends xx4> list2);
    }

    public py4(el4 el4Var, b bVar, f100 f100Var) {
        this.a = el4Var;
        this.b = bVar;
        this.c = f100Var;
        if (f100Var != null) {
            f100Var.d("AudioTimelineReader", "create audio timeline reader");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        a aVar;
        boolean z = this.d;
        boolean z2 = true;
        b bVar = this.b;
        qy4 qy4Var = null;
        if (!z) {
            aVar = this.e;
            if (aVar == null || aVar.c) {
                if (aVar == null) {
                    el4 el4Var = this.a;
                    aVar = new a(this.c, el4Var, 0L);
                    this.e = aVar;
                    bVar.d(el4Var, aVar.d, aVar.e);
                } else {
                    this.e = null;
                    this.d = true;
                    bVar.c();
                }
            }
            if (aVar != null) {
                return;
            }
            List<xx4> list = aVar.e;
            qy4[] qy4VarArr = aVar.f;
            sz4 sz4Var = aVar.g;
            if (!aVar.c) {
                long j = Long.MAX_VALUE;
                Integer num = null;
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    boolean z3 = z2;
                    long j2 = sz4Var.d[i];
                    if (j > j2) {
                        num = Integer.valueOf(i);
                        j = j2;
                    }
                    qy4VarArr[i] = qy4.a.a;
                    z2 = z3;
                    i = i2;
                }
                boolean z4 = z2;
                if (num != null) {
                    int intValue = num.intValue();
                    xx4 xx4Var = list.get(intValue);
                    long[] jArr = sz4Var.d;
                    Boolean[] boolArr = sz4Var.g;
                    Range<Long> range = sz4Var.c;
                    if (!boolArr[intValue].booleanValue()) {
                        if (xx4Var instanceof rmj0) {
                            boolArr[intValue] = Boolean.TRUE;
                            sz4Var.c(intValue, range.getUpper().longValue());
                            qy4Var = new qy4.c(range.getUpper().longValue());
                        } else if (sz4Var.b(intValue)) {
                            k0h0.b g = xx4Var.g();
                            if (g != null) {
                                sz4Var.d(intValue, g.a());
                                if (sz4Var.b(intValue)) {
                                    long j3 = jArr[intValue];
                                    ByteBuffer data = g.getData();
                                    ByteBuffer allocate = ByteBuffer.allocate(data.remaining());
                                    allocate.put(data);
                                    allocate.flip();
                                    data.flip();
                                    tll tllVar = new tll(allocate, j3, g.getSize(), g.getFlags(), g.c(), g.b());
                                    sz4Var.f[intValue] = sz4.a.EXTRACTOR;
                                    if (!xx4Var.i()) {
                                        sz4Var.h[intValue] = Boolean.TRUE;
                                    }
                                    qy4Var = new qy4.b(tllVar);
                                } else {
                                    qy4Var = sz4Var.a(intValue);
                                }
                            } else {
                                qy4Var = sz4Var.a(intValue);
                            }
                        } else {
                            sz4Var.d(intValue, -2L);
                            long j4 = jArr[intValue];
                            boolArr[intValue] = Boolean.valueOf(!((j4 < 0 || j4 >= range.getUpper().longValue() - range.getLower().longValue()) ? false : z4));
                            if (!boolArr[intValue].booleanValue()) {
                                qy4Var = sz4Var.a(intValue);
                            }
                        }
                    }
                    qy4VarArr[intValue] = qy4Var == null ? qy4.a.a : qy4Var;
                    r11 = qy4Var == null ? z4 : false;
                    aVar.c = r11;
                    r11 = !r11;
                }
            }
            if (r11) {
                bVar.b(list, qy4VarArr);
                return;
            }
            return;
        }
        aVar = null;
        if (aVar != null) {
        }
    }
}
