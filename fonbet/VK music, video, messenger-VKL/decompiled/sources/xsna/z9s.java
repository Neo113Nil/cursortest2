package xsna;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingRequestListener.java */
/* loaded from: classes.dex */
public final class z9s implements v7g0 {
    public final ArrayList a;

    public z9s(Set<v7g0> set) {
        this.a = new ArrayList(set.size());
        for (v7g0 v7g0Var : set) {
            if (v7g0Var != null) {
                this.a.add(v7g0Var);
            }
        }
    }

    public static void l(Exception exc, String str) {
        ahq.e("ForwardingRequestListener", str, exc);
    }

    @Override // xsna.v7g0
    public final void a(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).a(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerStart");
            }
        }
    }

    @Override // xsna.v7g0
    public final void b(String str, String str2, Map<String, String> map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).b(str, str2, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    @Override // xsna.v7g0
    public final void c(String str, String str2, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).c(str, str2, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    @Override // xsna.v7g0
    public final void d(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).d(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestCancellation");
            }
        }
    }

    @Override // xsna.v7g0
    public final void e(ImageRequest imageRequest, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).e(imageRequest, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestSuccess");
            }
        }
    }

    @Override // xsna.v7g0
    public final void f(String str, String str2, Throwable th, Map<String, String> map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).f(str, str2, th, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithFailure");
            }
        }
    }

    @Override // xsna.v7g0
    public final void g(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).g(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithCancellation");
            }
        }
    }

    @Override // xsna.v7g0
    public final void h(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).h(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onIntermediateChunkStart");
            }
        }
    }

    @Override // xsna.v7g0
    public final void i(ImageRequest imageRequest, Object obj, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).i(imageRequest, obj, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestStart");
            }
        }
    }

    @Override // xsna.v7g0
    public final boolean j(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((v7g0) arrayList.get(i)).j(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.v7g0
    public final void k(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((v7g0) arrayList.get(i)).k(imageRequest, str, th, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestFailure");
            }
        }
    }

    public z9s(v7g0... v7g0VarArr) {
        this.a = new ArrayList(v7g0VarArr.length);
        for (v7g0 v7g0Var : v7g0VarArr) {
            if (v7g0Var != null) {
                this.a.add(v7g0Var);
            }
        }
    }
}
