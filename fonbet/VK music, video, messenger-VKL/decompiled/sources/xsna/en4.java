package xsna;

import android.media.audiofx.DynamicsProcessing;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.api.helper.dto.AudioDiscontinuityReason;
import com.vk.music.player.api.helper.dto.AudioPlaybackError;
import com.vk.toggle.features.MusicFeatures;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: AudioEffectsController.kt */
/* loaded from: classes3.dex */
public final class en4 implements rs4 {
    public static final /* synthetic */ qcy<Object>[] g = {new MutablePropertyReference1Impl(en4.class, "loudnessCorrection", "getLoudnessCorrection()F", 0), p5j.a(0, en4.class, "isMusic", "isMusic()Z", fpf0.a)};
    public final otp a;
    public final com.vk.music.audioeffect.a b;
    public bro d;
    public int c = -1;
    public final a e = new a(this);
    public final b f = new b(this);

    /* compiled from: Delegates.kt */
    public static final class a extends wq70<Float> {
        public final /* synthetic */ en4 b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(en4 en4Var) {
            super(r0);
            Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.b = en4Var;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Float f, Float f2) {
            float floatValue = f2.floatValue();
            f.floatValue();
            bro broVar = this.b.d;
            if (broVar != null) {
                broVar.c(floatValue);
            }
        }
    }

    /* compiled from: Delegates.kt */
    public static final class b extends wq70<Boolean> {
        public final /* synthetic */ en4 b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(en4 en4Var) {
            super(r0);
            Boolean bool = Boolean.FALSE;
            this.b = en4Var;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            boolean h = MusicFeatures.AUDIO_LOUDNESS_NORMALIZATION.h();
            en4 en4Var = this.b;
            if (!h || fg40.a() != null) {
                otp otpVar = en4Var.a;
                if (otpVar != null) {
                    otpVar.h(booleanValue);
                    return;
                }
                return;
            }
            bro broVar = en4Var.d;
            if (broVar != null) {
                broVar.e = booleanValue;
                broVar.a();
            }
        }
    }

    public en4(otp otpVar, com.vk.music.audioeffect.a aVar) {
        this.a = otpVar;
        this.b = aVar;
    }

    @Override // xsna.rs4
    public final void a(int i) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{lhg.a(i, "Audio session: ")});
        }
        d();
        if (i < 0 || i == 0) {
            return;
        }
        this.c = i;
        if (!MusicFeatures.AUDIO_LOUDNESS_NORMALIZATION.h() || fg40.a() != null) {
            otp otpVar = this.a;
            if (otpVar != null) {
                otpVar.a(i);
                return;
            }
            return;
        }
        try {
            bro broVar = new bro(i, this.b);
            b bVar = this.f;
            qcy<?>[] qcyVarArr = g;
            broVar.e = bVar.getValue(this, qcyVarArr[1]).booleanValue();
            broVar.a();
            broVar.c(this.e.getValue(this, qcyVarArr[0]).floatValue());
            this.d = broVar;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
    }

    public final boolean b() {
        if (this.d != null) {
            qcy<?>[] qcyVarArr = g;
            if (this.f.getValue(this, qcyVarArr[1]).booleanValue() && ((Boolean) this.b.c().b.getValue()).booleanValue() && this.e.getValue(this, qcyVarArr[0]).floatValue() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        if (this.c != -1) {
            bro broVar = this.d;
            if (broVar != null) {
                DynamicsProcessing dynamicsProcessing = broVar.i;
                if (dynamicsProcessing != null) {
                    dynamicsProcessing.release();
                }
                broVar.i = null;
                iyx.d(broVar.g.b);
            }
            this.d = null;
            otp otpVar = this.a;
            if (otpVar != null) {
                otpVar.release(this.c);
            }
            this.c = -1;
        }
    }

    @Override // xsna.rs4
    public final void e(AudioPlayer.State state) {
        bro broVar = this.d;
        if (broVar != null) {
            broVar.d = state;
        }
    }

    @Override // xsna.rs4
    public final void onIsPlayingChanged(boolean z) {
        bro broVar;
        if (fg40.a() == null || (broVar = this.d) == null) {
            return;
        }
        if (z) {
            broVar.h = myc0.h(broVar.g, null, null, new aro(broVar, null), 3);
            return;
        }
        yok0 yok0Var = broVar.h;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        DynamicsProcessing b2 = broVar.b();
        if (b2 != null) {
            b2.setEnabled(false);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.i, new Object[]{"dynamicsProcessing.enabled = false"});
    }

    @Override // xsna.rs4
    public final void c(AudioPlaybackError audioPlaybackError) {
    }

    @Override // xsna.rs4
    public final void g(AudioDiscontinuityReason audioDiscontinuityReason) {
    }

    @Override // xsna.rs4
    public final void onIsLoadingChanged(boolean z) {
    }
}
