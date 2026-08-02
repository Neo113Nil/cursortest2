package xsna;

import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.List;
import xsna.my70;
import xsna.npl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class gpl implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ gpl(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r4 == (-1)) goto L30;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return Integer.compare(((npl.b) ((List) obj).get(0)).g, ((npl.b) ((List) obj2).get(0)).g);
            default:
                my70.b bVar = (my70.b) obj;
                my70.b bVar2 = (my70.b) obj2;
                int i = 0;
                if (bVar == null || bVar2 == null) {
                    return 0;
                }
                String uri = bVar.a.b().toString();
                String uri2 = bVar2.a.b().toString();
                m900<String, WeakReference<h5u0>> m900Var = mlw.a;
                WeakReference<h5u0> weakReference = m900Var.get(uri);
                h5u0 h5u0Var = weakReference != null ? weakReference.get() : null;
                WeakReference<h5u0> weakReference2 = m900Var.get(uri2);
                h5u0 h5u0Var2 = weakReference2 != null ? weakReference2.get() : null;
                if (h5u0Var != h5u0Var2) {
                    if (h5u0Var != null) {
                        if (h5u0Var2 != null) {
                            int visibleArea = h5u0Var.getVisibleArea();
                            int visibleArea2 = h5u0Var2.getVisibleArea();
                            if (visibleArea != -1) {
                                if (visibleArea2 != -1) {
                                    float f = 1000;
                                    i = an10.b(visibleArea2 / f) - an10.b(visibleArea / f);
                                }
                            }
                        }
                        i = -1;
                    }
                    i = 1;
                }
                return i != 0 ? i : bVar.a.g != bVar2.a.g ? Boolean.compare(bVar.a.g, bVar2.a.g) : epx.f(bVar.a.b.getId(), bVar2.a.b.getId()) ? epx.h(bVar.a.e, bVar2.a.e) : epx.h(bVar2.a.e, bVar.a.e);
        }
    }
}
