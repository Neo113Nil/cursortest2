package xsna;

import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.b;
import com.vk.upload.impl.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.ncq0;

/* compiled from: StoryBatchUploadTask.kt */
/* loaded from: classes11.dex */
public final class azl0 extends com.vk.upload.impl.b<Parcelable> implements c.a, w8i {
    public static final ConcurrentHashMap<Integer, ArrayList<com.vk.upload.impl.b<StoryEntry>>> p = new ConcurrentHashMap<>();
    public final List<com.vk.upload.impl.b<StoryEntry>> i;
    public final String j;
    public final UserId k;
    public final ArrayList<com.vk.upload.impl.b<StoryEntry>> l;
    public final avl0 m;
    public final ekm0 n;
    public final bpn0 o;

    /* compiled from: StoryBatchUploadTask.kt */
    public static final class a extends b.a<azl0> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            int c = ny90Var.c("task_id");
            ConcurrentHashMap<Integer, ArrayList<com.vk.upload.impl.b<StoryEntry>>> concurrentHashMap = azl0.p;
            ArrayList<com.vk.upload.impl.b<StoryEntry>> arrayList = concurrentHashMap.get(Integer.valueOf(c));
            concurrentHashMap.remove(Integer.valueOf(c));
            azl0 azl0Var = new azl0(arrayList, ny90Var.f("title"), new UserId(ny90Var.e("uid")));
            azl0Var.d = ny90Var.c("task_id");
            return azl0Var;
        }

        @Override // xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            azl0 azl0Var = (azl0) instantJob;
            ny90Var.l("task_id", azl0Var.d);
            ny90Var.o("title", azl0Var.j);
            ny90Var.n("uid", azl0Var.k.b);
            azl0.p.put(Integer.valueOf(azl0Var.d), azl0Var.l);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "StoryBatchUploadTask";
        }
    }

    public azl0(ArrayList arrayList, String str, UserId userId) {
        this.i = arrayList;
        this.j = str;
        this.k = userId;
        ArrayList<com.vk.upload.impl.b<StoryEntry>> arrayList2 = new ArrayList<>();
        this.l = arrayList2;
        this.m = new avl0();
        this.n = new ekm0();
        new bpn0(new g880(this, 28));
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.o = new bpn0(new kld0(this, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e0(com.vk.upload.impl.b bVar) {
        ncq0 ncq0Var;
        String str;
        bVar.M();
        int i = 0;
        while (i < bVar.O()) {
            i++;
            Exception e = null;
            try {
                ncq0Var = bVar.b0().a();
                try {
                    str = ncq0Var.b();
                } catch (Exception e2) {
                    e = e2;
                    str = null;
                }
            } catch (Exception e3) {
                e = e3;
                ncq0Var = null;
                str = null;
            }
            try {
                laq N = bVar.N();
                if (N != null) {
                    N.e();
                }
                bVar.Z(str);
            } catch (Exception e4) {
                e = e4;
                String a2 = ncq0Var != null ? ncq0Var.a() : null;
                if (a2 == null || a2.equals(str)) {
                    e = e;
                } else {
                    try {
                        bVar.V();
                        bVar.Z(a2);
                    } catch (Exception e5) {
                        e = e5;
                    }
                }
                if (e != null) {
                }
            }
            if (e != null) {
                return;
            }
            laq N2 = bVar.N();
            if (N2 != null) {
                N2.b();
            }
            if (i >= bVar.O()) {
                bVar.W(e);
                throw e;
            }
        }
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return true;
    }

    @Override // xsna.sp6
    public final void X() {
        long currentTimeMillis = System.currentTimeMillis();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.o(io.reactivex.rxjava3.core.q.O(this.l).L(new u9c0(new ape0(this, 10), 6), false).E0().l(new fl40(new q9i0(this, 5), 7)), new le50(new yyl0(ref$IntRef, 0), 14)).l(new e40(new rgl0(4), 29)), new tj60(new rj60(this, 27), 11)), new tl30(new qyi0(this, 5), 25)), new zsb(this, 7)), new wmz(new zyl0(this, 0), 24)).d(new kjs(new j9e0(this, currentTimeMillis, ref$IntRef), 22), new p350(new j5b0(this, 13), 18));
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        return this.j;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        ncq0 ncq0Var = ncq0.d;
        ncq0.a.a();
        return io.reactivex.rxjava3.core.q.T(ncq0.d);
    }

    @Override // com.vk.upload.impl.c.a
    public final void d(com.vk.upload.impl.b<?> bVar, int i, int i2, boolean z) {
        c0(an10.b((i / i2) * 100), this.l.size() * 100, z);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "StoryBatchUploadTask: " + j5g.g0(this.l, ", ", null, null, 0, new e420(25), 30);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean x() {
        List<com.vk.upload.impl.b<StoryEntry>> list = this.i;
        if (list == null) {
            return false;
        }
        List<com.vk.upload.impl.b<StoryEntry>> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((com.vk.upload.impl.b) it.next()).x()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.sp6
    public final void Z(String str) {
    }
}
