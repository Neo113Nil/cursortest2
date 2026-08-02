package xsna;

import com.vk.log.L;
import com.vk.voip.dto.call_member.CallMemberId;
import io.jsonwebtoken.JwtParser;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineChunk;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.lew0;

/* compiled from: VoipAsrOnlineDelegateBase.kt */
/* loaded from: classes11.dex */
public abstract class few0 implements AsrOnlineListener {
    public final hew0 a;
    public final ofw0 b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();

    public few0(hew0 hew0Var, ofw0 ofw0Var) {
        this.a = hew0Var;
        this.b = ofw0Var;
    }

    public final io.reactivex.rxjava3.core.q<Boolean> c() {
        return this.b.c();
    }

    public final gew0 getState() {
        return this.b.a();
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener
    public final void onAsrAvailableChanged(boolean z) {
        ofw0 ofw0Var = this.b;
        boolean z2 = z && !((Boolean) ofw0Var.d.invoke()).booleanValue();
        y380 y380Var = ofw0Var.a;
        synchronized (y380Var) {
            if (epx.f(((io.reactivex.rxjava3.subjects.d) y380Var.a).P0(), Boolean.valueOf(z2))) {
                L.p("VoipAsrOnlineEnabledHandlerImpl", "Set isEnabled is the same, isEnabled=" + z2);
                return;
            }
            L.p("VoipAsrOnlineEnabledHandlerImpl", "Set is enabled, isEnabled=" + z2);
            if (z2) {
                ((io.reactivex.rxjava3.subjects.d) y380Var.a).onNext(Boolean.TRUE);
            } else {
                y380Var.a(false);
                ((io.reactivex.rxjava3.subjects.d) y380Var.a).onNext(Boolean.FALSE);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener
    public final void onAsrChunk(AsrOnlineChunk asrOnlineChunk) {
        String str;
        ofw0 ofw0Var = this.b;
        lew0 lew0Var = ofw0Var.b;
        ParticipantId participantId = asrOnlineChunk.getParticipantId();
        CallMemberId E = participantId != null ? mnh0.E(participantId) : null;
        ParticipantId participantId2 = asrOnlineChunk.getParticipantId();
        String str2 = "";
        if (participantId2 != null) {
            whr0 whr0Var = (whr0) ofw0Var.c.invoke(participantId2);
            if ((whr0Var != null ? whr0Var.b() : null) != null) {
                str = rte0.r(whr0Var.b());
            } else if (whr0Var == null) {
                str = "";
            } else {
                String p = brm0.p(whr0Var.c(), Locale.getDefault());
                String p2 = brm0.p(whr0Var.d(), Locale.getDefault());
                boolean z = p2.length() > 1;
                if (z) {
                    p2 = p2.substring(0, 1);
                } else if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                if (drm0.N(p2)) {
                    str = p;
                } else {
                    str = p + ' ' + p2 + JwtParser.SEPARATOR_CHAR;
                }
            }
            if (str != null) {
                str2 = str;
            }
        }
        lew0Var.e.onNext(new lew0.b.c(new eew0(E, str2, asrOnlineChunk.getText())));
    }
}
