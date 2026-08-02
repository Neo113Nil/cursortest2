package xsna;

import com.vk.music.player.PlayerMode;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c1b0;
import xsna.j1b0;
import xsna.ztp;

/* compiled from: PlayerEqualizerSettingsFeature.kt */
/* loaded from: classes3.dex */
public final class b1b0 extends wk50<n1b0, m1b0, c1b0, j1b0> {
    public final u750 f;
    public final otp g;

    public b1b0(c1b0 c1b0Var, l1b0 l1b0Var, u750 u750Var, otp otpVar) {
        super(c1b0Var, l1b0Var);
        this.f = u750Var;
        this.g = otpVar;
        otpVar.g("equalizer_settings_bottomsheet");
    }

    @Override // xsna.wk50
    public final void N(m1b0 m1b0Var, c1b0 c1b0Var) {
        c1b0 c1b0Var2 = c1b0Var;
        boolean z = c1b0Var2 instanceof c1b0.c;
        otp otpVar = this.g;
        if (z) {
            boolean isEnabled = otpVar.isEnabled();
            short s = otpVar.j().a;
            short s2 = otpVar.j().b;
            ztp d = otpVar.d();
            List<Short> list = otpVar.e().d;
            i06[] i06VarArr = otpVar.j().c;
            ArrayList arrayList = new ArrayList(i06VarArr.length);
            int length = i06VarArr.length;
            for (int i = 0; i < length; i = tv4.a(arrayList, i06VarArr[i].a, i, 1)) {
            }
            T(new j1b0.a(isEnabled, s, s2, d, list, arrayList));
            return;
        }
        boolean z2 = c1b0Var2 instanceof c1b0.a;
        u750 u750Var = this.f;
        if (z2) {
            boolean isEnabled2 = otpVar.isEnabled();
            boolean z3 = ((c1b0.a) c1b0Var2).b;
            otpVar.setEnabled(z3);
            if (isEnabled2 != otpVar.isEnabled()) {
                u750Var.B0(z3);
            }
            u750Var.k0(isEnabled2 ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_EQUALIZER_OFF_EQUALIZER : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_EQUALIZER_ON_EQUALIZER, PlayerMode.AUDIO);
            T(new j1b0.b(otpVar.isEnabled()));
            return;
        }
        if (!(c1b0Var2 instanceof c1b0.b)) {
            if (c1b0Var2 instanceof c1b0.e) {
                c1b0.e eVar = (c1b0.e) c1b0Var2;
                otpVar.i((short) eVar.b, eVar.c);
                ztp.g e = otpVar.e();
                T(new j1b0.c(e, otpVar.isEnabled(), e.d));
                return;
            }
            if (!c1b0Var2.equals(c1b0.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            otpVar.b(otpVar.e());
            T(new j1b0.c(otpVar.d(), otpVar.isEnabled(), otpVar.e().d));
            return;
        }
        boolean isEnabled3 = otpVar.isEnabled();
        ztp ztpVar = ((c1b0.b) c1b0Var2).b;
        if (ztpVar instanceof ztp.g) {
            otpVar.b(otpVar.k());
        } else {
            otpVar.b(ztpVar);
        }
        if (!isEnabled3 && otpVar.isEnabled()) {
            u750Var.B0(true);
        }
        String str = ztpVar.a;
        u750Var.k0(str.equals("flat") ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_EQUALIZER_DEFAULT_EQUALIZER : str.equals("custom") ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_EQUALIZER_CUSTOM_EQUALIZER : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_EQUALIZER_OTHER_EQUALIZER, PlayerMode.AUDIO);
        T(new j1b0.c(otpVar.d(), otpVar.isEnabled(), otpVar.e().d));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.g.f("equalizer_settings_bottomsheet");
    }
}
