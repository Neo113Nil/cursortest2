package xsna;

import android.content.Context;
import com.vk.toggle.features.CoreFeatures;

/* compiled from: FamilyDay2026ProgressDrawableFactory.kt */
/* loaded from: classes4.dex */
public final class ekq implements d2e0 {
    public final gkq a;
    public final fll b;
    public xl3 c;
    public final bpn0 d;

    public ekq(Context context, gkq gkqVar) {
        this.a = gkqVar;
        this.b = new fll(context);
        this.d = new bpn0(new dkq(context, 0));
    }

    @Override // xsna.d2e0
    public final c2e0 a() {
        c2e0 c2e0Var = (c2e0) this.d.getValue();
        fll fllVar = this.b;
        if (c2e0Var != null) {
            gkq gkqVar = this.a;
            if (gkqVar.a.a > 0) {
                CoreFeatures coreFeatures = CoreFeatures.MOURNING_MODE;
                coreFeatures.getClass();
                if (!com.vk.toggle.b.A.a(coreFeatures)) {
                    return gkqVar.a() ? c2e0Var : fllVar.a();
                }
            }
        }
        xl3 xl3Var = this.c;
        if (xl3Var != null) {
            return xl3Var;
        }
        c2e0 a = fllVar.a();
        this.c = (xl3) a;
        return a;
    }

    @Override // xsna.d2e0
    public final boolean b() {
        fkq fkqVar = this.a.a;
        int i = fkqVar.a;
        if (i <= 0) {
            return true;
        }
        return i >= 100 && !fkqVar.d;
    }
}
