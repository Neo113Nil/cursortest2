package xsna;

import com.vk.superapp.api.dto.app.AppsSection;

/* compiled from: AppItems.kt */
/* loaded from: classes6.dex */
public final class lxu extends d56 {
    public final AppsSection b;

    public lxu(AppsSection appsSection) {
        this.b = appsSection;
    }

    @Override // xsna.d56
    public final boolean a(d56 d56Var) {
        if (!(d56Var instanceof lxu)) {
            return false;
        }
        return epx.f(this.b, ((lxu) d56Var).b);
    }

    @Override // xsna.d56
    public final boolean b(d56 d56Var) {
        return (d56Var instanceof lxu) && ((lxu) d56Var).b.b.equals(this.b.b);
    }

    @Override // xsna.d56
    public final int c() {
        return 0;
    }
}
