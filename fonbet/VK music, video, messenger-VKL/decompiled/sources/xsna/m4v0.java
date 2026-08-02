package xsna;

import com.vk.stat.scheme.CommonAudioStat$AudioListeningStopEvent;
import xsna.hr90;

/* compiled from: VkMixPauseSubtypeResolveStrategy.kt */
/* loaded from: classes3.dex */
public final class m4v0 extends bkl {
    @Override // xsna.bkl, xsna.ir90
    public final CommonAudioStat$AudioListeningStopEvent.Subtype a(hr90 hr90Var) {
        return hr90Var.equals(hr90.e.a) ? CommonAudioStat$AudioListeningStopEvent.Subtype.PAUSE_BTN : super.a(hr90Var);
    }
}
