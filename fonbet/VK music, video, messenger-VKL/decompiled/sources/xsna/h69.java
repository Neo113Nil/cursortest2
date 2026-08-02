package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.voip.ui.onboarding.features.FeatureId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import xsna.v59;

/* compiled from: CallOnboardingFeature.kt */
/* loaded from: classes7.dex */
public final class h69 {
    public final ihw0 a;
    public final u0d b;
    public final io.reactivex.rxjava3.subjects.d<o69> c = io.reactivex.rxjava3.subjects.d.O0(new o69(0));
    public final io.reactivex.rxjava3.subjects.f<g69> d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final io.reactivex.rxjava3.subjects.f<FeatureId> g;

    public h69(ihw0 ihw0Var, u0d u0dVar) {
        this.a = ihw0Var;
        this.b = u0dVar;
        io.reactivex.rxjava3.subjects.f<g69> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.d = fVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.e = bVar;
        this.f = new io.reactivex.rxjava3.disposables.b();
        this.g = new io.reactivex.rxjava3.subjects.f<>();
        bVar.b(fVar.subscribe(new c60(new wg8(1, this, h69.class, "applyAction", "applyAction(Lcom/vk/voip/ui/onboarding/CallOnboardingAction;)V", 0, 1), 4)));
        bVar.b(ihw0Var.e.b0(v59.c.class).subscribe(new bn3(new r7(this, 15), 5)));
    }

    public final void a(o69 o69Var, FeatureId featureId) {
        UserId userId = (UserId) this.b.invoke();
        pla.e().b().b(featureId.h());
        SharedPreferences e = Preference.e(userId.b, featureId.h());
        Boolean bool = Boolean.TRUE;
        qaj0.c(e, "banner_disposed", bool);
        qaj0.c(Preference.e(userId.b, featureId.h()), "feature_used", bool);
        Map l = pn00.l(featureId, o69Var.b);
        Collection values = l.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((suq) obj).b) {
                arrayList.add(obj);
            }
        }
        this.c.onNext(new o69(l, !arrayList.isEmpty()));
    }
}
