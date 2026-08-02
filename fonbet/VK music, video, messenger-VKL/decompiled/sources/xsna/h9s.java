package xsna;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: ForwardingControllerListener.java */
/* loaded from: classes12.dex */
public class h9s<INFO> implements kqj<INFO> {
    public final ArrayList b = new ArrayList(2);

    @Override // xsna.kqj
    public final void a(Object obj, String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                kqj kqjVar = (kqj) arrayList.get(i);
                if (kqjVar != null) {
                    kqjVar.a(obj, str);
                }
            } catch (Exception e) {
                h(e, "InternalListener exception in onIntermediateImageSet");
            }
        }
    }

    @Override // xsna.kqj
    public final synchronized void b(String str, Throwable th) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                kqj kqjVar = (kqj) this.b.get(i);
                if (kqjVar != null) {
                    kqjVar.b(str, th);
                }
            } catch (Exception e) {
                h(e, "InternalListener exception in onFailure");
            }
        }
    }

    @Override // xsna.kqj
    public final void c(String str, Throwable th) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                kqj kqjVar = (kqj) arrayList.get(i);
                if (kqjVar != null) {
                    kqjVar.c(str, th);
                }
            } catch (Exception e) {
                h(e, "InternalListener exception in onIntermediateImageFailed");
            }
        }
    }

    @Override // xsna.kqj
    public final synchronized void d(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                kqj kqjVar = (kqj) this.b.get(i);
                if (kqjVar != null) {
                    kqjVar.d(str);
                }
            } catch (Exception e) {
                h(e, "InternalListener exception in onRelease");
            }
        }
    }

    @Override // xsna.kqj
    public final synchronized void e(String str, INFO info, Animatable animatable) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                kqj kqjVar = (kqj) this.b.get(i);
                if (kqjVar != null) {
                    kqjVar.e(str, info, animatable);
                }
            } catch (Exception e) {
                h(e, "InternalListener exception in onFinalImageSet");
            }
        }
    }

    @Override // xsna.kqj
    public final synchronized void f(Object obj, String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                kqj kqjVar = (kqj) this.b.get(i);
                if (kqjVar != null) {
                    kqjVar.f(obj, str);
                }
            } catch (Exception e) {
                h(e, "InternalListener exception in onSubmit");
            }
        }
    }

    public final synchronized void g(kqj<? super INFO> kqjVar) {
        this.b.add(kqjVar);
    }

    public final synchronized void h(Exception exc, String str) {
        Log.e("FdingControllerListener", str, exc);
    }
}
