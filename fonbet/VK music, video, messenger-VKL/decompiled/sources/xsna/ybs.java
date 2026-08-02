package xsna;

import com.vk.core.fragments.FragmentImpl;

/* compiled from: FragmentManagerImplSimple.kt */
/* loaded from: classes17.dex */
public final class ybs {
    public final vbs a;

    public ybs(vbs vbsVar) {
        this.a = vbsVar;
    }

    public final void a(int i, FragmentImpl fragmentImpl) {
        vbs vbsVar = this.a;
        vbsVar.c();
        vbsVar.a(i, fragmentImpl, "fragment_default_tag", false);
        vbsVar.d();
    }

    public final void b(FragmentImpl fragmentImpl) {
        vbs vbsVar = this.a;
        vbsVar.c();
        vbsVar.k(fragmentImpl);
        vbsVar.d();
    }

    public final void c(int i, FragmentImpl fragmentImpl) {
        vbs vbsVar = this.a;
        vbsVar.c();
        androidx.fragment.app.a aVar = vbsVar.f;
        if (aVar != null) {
            aVar.g(i, fragmentImpl, "fragment_default_tag");
        }
        vbsVar.d();
    }
}
