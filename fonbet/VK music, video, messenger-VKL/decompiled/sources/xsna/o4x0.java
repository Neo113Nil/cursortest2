package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.voip.ui.onboarding.features.FeatureId;
import java.util.Collections;
import ru.ok.android.externcalls.sdk.asr.AsrInfo;
import xsna.nv3;

/* compiled from: VoipViewModelAsrRecordDelegate.kt */
/* loaded from: classes7.dex */
public final class o4x0 implements l19 {
    public final com.vk.voip.ui.c a;
    public final com.vk.voip.b b;
    public final pvw0 c;
    public final gzs<Context> d;
    public final d2c0 e;
    public mew0 f;
    public boolean g;
    public boolean h;
    public final io.reactivex.rxjava3.subjects.f<nv3> i = new io.reactivex.rxjava3.subjects.f<>();
    public final ov3 j = new ov3(this);

    public o4x0(com.vk.voip.ui.c cVar, com.vk.voip.b bVar, pvw0 pvw0Var, gzs gzsVar, d2c0 d2c0Var) {
        this.a = cVar;
        this.b = bVar;
        this.c = pvw0Var;
        this.d = gzsVar;
        this.e = d2c0Var;
    }

    public final boolean a() {
        return this.g || this.b.isMeCreatorOrAdmin();
    }

    public final boolean b() {
        this.a.getClass();
        return !(((Boolean) new eu2(18).invoke()).booleanValue() && !this.b.isMeCreatorOrAdmin());
    }

    public final void c(VoipViewModelState voipViewModelState, VoipViewModelState voipViewModelState2) {
        if (!voipViewModelState.h() || voipViewModelState2.i()) {
            return;
        }
        this.f = null;
        this.g = false;
        this.i.onNext(nv3.b.a);
    }

    @Override // xsna.l19
    public final void onAsrRecordStarted(AsrInfo asrInfo) {
        CallMemberId E = mnh0.E(asrInfo.getInitiator().getExternalId());
        CallMemberId a = this.b.a();
        boolean f = epx.f(E.b, a != null ? a.b : null);
        this.g = f;
        this.i.onNext(new nv3.c(f, a()));
        CallMemberId E2 = mnh0.E(asrInfo.getInitiator().getExternalId());
        this.a.getClass();
        VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
        io.reactivex.rxjava3.kotlin.c.e((voipDataProvider != null ? voipDataProvider : null).j(Collections.singletonList(E2)), new jvl0(13), new kfw0(this, 5));
        FeatureId featureId = FeatureId.ASR;
        UserId userId = (UserId) this.e.invoke();
        pla.e().b().b(featureId.h());
        SharedPreferences e = Preference.e(userId.b, featureId.h());
        Boolean bool = Boolean.TRUE;
        qaj0.c(e, "banner_disposed", bool);
        qaj0.c(Preference.e(userId.b, featureId.h()), "feature_used", bool);
    }

    @Override // xsna.l19
    public final void onAsrRecordStopped() {
        mew0 mew0Var = this.f;
        if (mew0Var == null) {
            return;
        }
        mew0 mew0Var2 = new mew0(mew0Var.a, mew0Var.b, mew0Var.c, Boolean.valueOf(this.h));
        this.f = null;
        this.h = false;
        this.g = false;
        this.i.onNext(new nv3.d(mew0Var2));
    }
}
