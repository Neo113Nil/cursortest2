package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: ListDataSource.java */
/* loaded from: classes12.dex */
public final class iez<T> extends ae<List<uvf<T>>> {
    public final zuk<uvf<T>>[] h;
    public int i = 0;

    /* compiled from: ListDataSource.java */
    public class a implements vvk<uvf<T>> {
        public boolean a = false;

        public a() {
        }

        @Override // xsna.vvk
        public final void a() {
            iez.this.h(new CancellationException(), null);
        }

        @Override // xsna.vvk
        public final void b(zuk<uvf<T>> zukVar) {
            iez iezVar = iez.this;
            zuk<uvf<T>>[] zukVarArr = iezVar.h;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (zuk<uvf<T>> zukVar2 : zukVarArr) {
                f += zukVar2.getProgress();
            }
            iezVar.i(f / zukVarArr.length);
        }

        @Override // xsna.vvk
        public final void c(zuk<uvf<T>> zukVar) {
            Throwable b = zukVar.b();
            if (b == null) {
                b = new Throwable("Unknown failure cause");
            }
            iez.this.h(b, null);
        }

        @Override // xsna.vvk
        public final void d(zuk<uvf<T>> zukVar) {
            boolean z;
            if (zukVar.c()) {
                synchronized (this) {
                    if (this.a) {
                        return;
                    }
                    this.a = true;
                    iez iezVar = iez.this;
                    synchronized (iezVar) {
                        int i = iezVar.i + 1;
                        iezVar.i = i;
                        z = i == iezVar.h.length;
                    }
                    if (z) {
                        iezVar.j(null, true, null);
                    }
                }
            }
        }
    }

    public iez(zuk<uvf<T>>[] zukVarArr) {
        this.h = zukVarArr;
    }

    public static <T> iez<T> l(zuk<uvf<T>>... zukVarArr) {
        zukVarArr.getClass();
        sex0.f(zukVarArr.length > 0);
        iez<T> iezVar = new iez<>(zukVarArr);
        for (zuk<uvf<T>> zukVar : zukVarArr) {
            if (zukVar != null) {
                zukVar.d(iezVar.new a(), ac9.b);
            }
        }
        return iezVar;
    }

    @Override // xsna.ae, xsna.zuk
    public final synchronized boolean a() {
        boolean z;
        if (!f()) {
            z = this.i == this.h.length;
        }
        return z;
    }

    @Override // xsna.ae, xsna.zuk
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        for (zuk<uvf<T>> zukVar : this.h) {
            zukVar.close();
        }
        return true;
    }

    @Override // xsna.ae, xsna.zuk
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final synchronized ArrayList getResult() {
        if (!a()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.h.length);
        for (zuk<uvf<T>> zukVar : this.h) {
            arrayList.add(zukVar.getResult());
        }
        return arrayList;
    }
}
