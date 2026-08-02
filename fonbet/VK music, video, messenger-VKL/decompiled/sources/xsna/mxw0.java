package xsna;

import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import xsna.ddv;

/* compiled from: VoipScheduleCallView.kt */
/* loaded from: classes7.dex */
public final class mxw0 implements ddv.a<hfz> {
    @Override // xsna.ddv.a
    public final boolean a(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar2;
        return (hfzVar3 instanceof VoipScheduleCallViewState.ScreenState.Item.Setting) && ((VoipScheduleCallViewState.ScreenState.Item.Setting) hfzVar3).b == VoipScheduleCallViewState.ScreenState.Item.Setting.Type.TIME_ZONE;
    }
}
