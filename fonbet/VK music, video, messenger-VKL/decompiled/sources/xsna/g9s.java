package xsna;

import android.util.Log;
import java.util.ArrayList;
import xsna.jqj;

/* compiled from: ForwardingControllerListener2.kt */
/* loaded from: classes12.dex */
public final class g9s<I> extends ec6<I> {
    public final ArrayList a = new ArrayList(2);

    @Override // xsna.jqj
    public final void a(Object obj, String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((jqj) arrayList.get(i)).a(obj, str);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // xsna.jqj
    public final void b(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((jqj) arrayList.get(i)).b(str);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // xsna.jqj
    public final void c(String str, Object obj, jqj.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((jqj) arrayList.get(i)).c(str, obj, aVar);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // xsna.jqj
    public final void d(String str, jqj.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((jqj) arrayList.get(i)).d(str, aVar);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // xsna.jqj
    public final void e(String str, Throwable th, jqj.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((jqj) arrayList.get(i)).e(str, th, aVar);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // xsna.jqj
    public final void f(String str, I i, jqj.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    ((jqj) arrayList.get(i2)).f(str, i, aVar);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
