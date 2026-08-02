package xsna;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import xsna.hjl0;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qn1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qn1(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.d).invoke(new hjl0.a.C3003a(this.c));
                return s3q0.a;
            case 1:
                ly3 ly3Var = (ly3) this.d;
                ConcurrentHashMap<Integer, WeakReference<io.reactivex.rxjava3.disposables.b>> concurrentHashMap = ly3Var.b;
                int i = this.c;
                WeakReference<io.reactivex.rxjava3.disposables.b> weakReference = concurrentHashMap.get(Integer.valueOf(i));
                if (weakReference != null) {
                    io.reactivex.rxjava3.disposables.b bVar = weakReference.get();
                    if (bVar != null) {
                        bVar.e();
                    }
                    ly3Var.b.remove(Integer.valueOf(i));
                }
                return s3q0.a;
            default:
                return "state: " + ((zrz.a) this.d) + " missed cache load of " + this.c + " items";
        }
    }
}
