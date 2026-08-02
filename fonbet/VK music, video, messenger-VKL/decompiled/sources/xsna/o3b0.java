package xsna;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.audioeffect.AudioEffectSettingsComponent;
import com.vk.music.player.api.di.EqualizerControllerComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSourceEnum;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.h3b0;
import xsna.k840;
import xsna.mk50;
import xsna.ztp;

/* compiled from: PlayerSettingsMviBottomSheet.kt */
/* loaded from: classes3.dex */
public final class o3b0 extends tl50<g3b0, m3b0, h3b0> {
    public static final /* synthetic */ qcy<Object>[] m1;
    public final nf3 i1 = new nf3();
    public final com.vk.music.player.d j1;
    public final k3b0 k1;
    public final bpn0 l1;

    /* compiled from: PlayerSettingsMviBottomSheet.kt */
    public static final class a extends kmu0 {
        public boolean h;
        public boolean i;
        public boolean j;
        public CommonAudioStat$TypeAudioSourceEnum k;

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            o3b0 o3b0Var = new o3b0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("FORCE_DARK_THEME", this.h);
            CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum = this.k;
            bundle.putInt("STAT_AUDIO_SOURCE", commonAudioStat$TypeAudioSourceEnum != null ? commonAudioStat$TypeAudioSourceEnum.ordinal() : -1);
            bundle.putBoolean("SETTINGS_ANIMATION_NEED_TO_PLAY", this.i);
            bundle.putBoolean("FROM_TRACK_MENU_LAUNCH", this.j);
            o3b0Var.setArguments(bundle);
            return o3b0Var;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(o3b0.class, "contentView", "getContentView()Lcom/vk/music/bottomsheets/playermenu/PlayerSettingsMviView;", 0);
        fpf0.a.getClass();
        m1 = new qcy[]{mutablePropertyReference1Impl};
    }

    public o3b0() {
        com.vk.music.player.d dVar = k840.a.f;
        dVar = dVar == null ? null : dVar;
        this.j1 = dVar;
        this.k1 = new k3b0(new l3b0(false, false, false, ztp.j.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dVar.b() ? Long.valueOf(dVar.d.b) : null, false, false, false, false));
        this.l1 = new bpn0(new cr20(this, 19));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        a4b0 a4b0Var = new a4b0(this, requireContext(), requireArguments().getBoolean("FORCE_DARK_THEME", false), requireArguments().getBoolean("SETTINGS_ANIMATION_NEED_TO_PLAY", false));
        qcy<Object> qcyVar = m1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = a4b0Var;
        return new mk50.c(((a4b0) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((a4b0) this.i1.getValue(this, m1[0])).f((m3b0) ao50Var, new vw4(1, this, o3b0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 12));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((g3b0) vk50Var).t.a(new n3b0(this, 0), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        h3b0.d dVar = h3b0.d.b;
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        s750 s750Var2 = s750Var;
        Bundle requireArguments = requireArguments();
        return new g3b0(dVar, this.k1, s750Var2, (CommonAudioStat$TypeAudioSourceEnum) j5g.b0(requireArguments.getInt("STAT_AUDIO_SOURCE", -1), CommonAudioStat$TypeAudioSourceEnum.h()), this.j1, ((EqualizerControllerComponent) m7m.d(this).a(fpf0.a(EqualizerControllerComponent.class))).F9(), ((MusicPrefsComponent) m7m.d(this).a(fpf0.a(MusicPrefsComponent.class))).Q0(), requireArguments().getBoolean("FROM_TRACK_MENU_LAUNCH", false), ((AudioEffectSettingsComponent) m7m.d(this).a(fpf0.a(AudioEffectSettingsComponent.class))).f0());
    }
}
