package xsna;

import android.os.Parcelable;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.b;
import com.vk.upload.impl.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: BatchUploadTask.kt */
/* loaded from: classes11.dex */
public final class ev6 extends com.vk.upload.impl.b<Parcelable> implements c.a {
    public static final ConcurrentHashMap<Integer, ArrayList<com.vk.upload.impl.b<?>>> n = new ConcurrentHashMap<>();
    public final List<com.vk.upload.impl.b<?>> i;
    public final String j;
    public final ArrayList<com.vk.upload.impl.b<?>> k;
    public int l;
    public Parcelable m;

    /* compiled from: BatchUploadTask.kt */
    public static final class a extends b.a<ev6> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            int c = ny90Var.c("task_id");
            ConcurrentHashMap<Integer, ArrayList<com.vk.upload.impl.b<?>>> concurrentHashMap = ev6.n;
            ArrayList<com.vk.upload.impl.b<?>> arrayList = concurrentHashMap.get(Integer.valueOf(c));
            concurrentHashMap.remove(Integer.valueOf(c));
            ev6 ev6Var = new ev6(arrayList, ny90Var.f("title"));
            ev6Var.d = ny90Var.c("task_id");
            return ev6Var;
        }

        @Override // xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            ev6 ev6Var = (ev6) instantJob;
            ny90Var.l("task_id", ev6Var.d);
            ny90Var.o("title", ev6Var.j);
            ev6.n.put(Integer.valueOf(ev6Var.d), ev6Var.k);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "BatchUploadTask";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ev6(List<? extends com.vk.upload.impl.b<?>> list, String str) {
        this.i = list;
        this.j = str;
        ArrayList<com.vk.upload.impl.b<?>> arrayList = new ArrayList<>();
        this.k = arrayList;
        if (list != 0) {
            arrayList.addAll(list);
        }
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return true;
    }

    @Override // xsna.sp6
    public final void X() {
        ArrayList<com.vk.upload.impl.b<?>> arrayList = this.k;
        UploadNotification uploadNotification = this.h;
        while (this.l < arrayList.size() && !this.e) {
            try {
                try {
                    com.vk.upload.impl.b<?> bVar = arrayList.get(this.l);
                    UploadNotification uploadNotification2 = bVar.h;
                    uploadNotification2.i(this);
                    bVar.X();
                    uploadNotification2.i(null);
                    this.l++;
                } catch (Exception e) {
                    uploadNotification.g(this, e);
                    throw e;
                }
            } catch (Throwable th) {
                uploadNotification.e();
                throw th;
            }
        }
        uploadNotification.f(this, this.m);
        uploadNotification.e();
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
        return new io.reactivex.rxjava3.internal.operators.observable.w0(new io.reactivex.rxjava3.functions.n() { // from class: xsna.dv6
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                return ncq0.d;
            }
        });
    }

    @Override // com.vk.upload.impl.c.a
    public final void d(com.vk.upload.impl.b<?> bVar, int i, int i2, boolean z) {
        int round = Math.round((i / i2) * 100);
        int i3 = this.l;
        ArrayList<com.vk.upload.impl.b<?>> arrayList = this.k;
        if (i3 != 0 && i3 != arrayList.size()) {
            z = false;
        }
        c0((this.l * 100) + round, arrayList.size() * 100, z);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "BatchUploadTask: " + j5g.g0(this.k, ", ", null, null, 0, new n82(7), 30);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean x() {
        List<com.vk.upload.impl.b<?>> list = this.i;
        if (list == null) {
            return false;
        }
        List<com.vk.upload.impl.b<?>> list2 = list;
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
