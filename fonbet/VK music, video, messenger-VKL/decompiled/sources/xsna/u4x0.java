package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.onboarding.features.FeatureId;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import xsna.suq;

/* compiled from: VoipViewModelFeedbackDelegate.kt */
/* loaded from: classes11.dex */
public final class u4x0 implements f39, dow0 {
    public final com.vk.voip.b b;
    public final lrt c;
    public final cd3 d;
    public boolean e;
    public final io.reactivex.rxjava3.subjects.f<a6r> f = new io.reactivex.rxjava3.subjects.f<>();

    public u4x0(com.vk.voip.b bVar, lrt lrtVar, cd3 cd3Var) {
        this.b = bVar;
        this.c = lrtVar;
        this.d = cd3Var;
    }

    @Override // xsna.dow0
    public final b69 a(String str) {
        return this.c.a(str);
    }

    public final void b(boolean z) {
        this.b.setFeedbackEnabled(z);
        if (z) {
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.j0().m0();
        } else {
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.j0().S();
        }
    }

    @Override // xsna.f39
    public final void c(String str) {
        String str2;
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.K0 == VoipViewModelState.InCall && e()) {
            FeedbackManager feedbackManager = this.b.getFeedbackManager();
            if (feedbackManager != null) {
                str2 = str;
                FeedbackManager.sendFeedback$default(feedbackManager, str2, ParticipantFeedbackSource.GESTURES, null, null, 12, null);
            } else {
                str2 = str;
            }
            com.vk.voip.ui.c.j0().r0(str2);
            suq.a.a(FeatureId.GESTURE_FEEDBACK, (UserId) this.d.invoke());
        }
    }

    public final a69 d() {
        ParticipantFeedback ownCurrentFeedback;
        FeedbackManager feedbackManager = this.b.getFeedbackManager();
        if (feedbackManager == null || (ownCurrentFeedback = feedbackManager.getOwnCurrentFeedback()) == null) {
            return null;
        }
        String key = ownCurrentFeedback.getKey();
        CallMemberId E = mnh0.E(ownCurrentFeedback.getParticipantId());
        ownCurrentFeedback.getFinishTimeMs();
        ownCurrentFeedback.getSource();
        return new a69(key, E);
    }

    public final boolean e() {
        xdw0 b;
        if (!this.b.isFeedbackEnabled()) {
            return false;
        }
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        if (com.vk.voip.ui.c.K0 == VoipViewModelState.WaitingRoom) {
            return false;
        }
        if (!cVar.s0()) {
            if (com.vk.voip.ui.c.J().h()) {
                return false;
            }
            zqk0 zqk0Var = com.vk.voip.ui.c.P;
            if (zqk0Var != null && (b = zqk0Var.b()) != null && b.c()) {
                return false;
            }
        }
        return true;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.y f() {
        f0j0 f0j0Var = new f0j0(new wo40(29), 16);
        io.reactivex.rxjava3.subjects.f<a6r> fVar = this.f;
        fVar.getClass();
        io.reactivex.rxjava3.core.q o0 = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, f0j0Var).U(new hi70(new ixu0(this, 7), 17)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new i7(this, 4)));
        o0.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(o0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.y g() {
        nit nitVar = new nit(new m1x0(1), 27);
        io.reactivex.rxjava3.subjects.f<a6r> fVar = this.f;
        fVar.getClass();
        io.reactivex.rxjava3.core.q o0 = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, nitVar).U(new qat0(new z7t0(this, 12), 5)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new qnb(this, 3)));
        o0.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(o0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public final void h(boolean z) {
        if (this.e != z) {
            this.e = z;
            this.f.onNext(new bhw0(z));
        }
    }

    @Override // xsna.f39
    public final void j(ArrayList arrayList) {
        this.f.onNext(new ahw0(arrayList));
    }

    @Override // xsna.f39
    public final void n(ArrayList arrayList) {
        this.f.onNext(new ygw0(arrayList));
    }

    @Override // xsna.f39
    public final void onFeedbackEnabledChanged(boolean z) {
        if (this.e && !z) {
            h(false);
        }
        this.f.onNext(new zgw0());
    }
}
