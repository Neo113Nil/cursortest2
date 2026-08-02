package xsna;

import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsConfig;
import kotlin.NoWhenBranchMatchedException;
import xsna.fyw0;
import xsna.gyw0;
import xsna.iyw0;
import xsna.zxw0;

/* compiled from: VoipScheduledCallSettingsFeature.kt */
/* loaded from: classes7.dex */
public final class cyw0 extends wk50<myw0, iyw0, zxw0, gyw0> {
    public final VoipScheduledCallSettingsConfig f;
    public final n6h0 g;
    public final f4z<fyw0> h;

    public cyw0(VoipScheduledCallSettingsConfig voipScheduledCallSettingsConfig, n6h0 n6h0Var, hyw0 hyw0Var) {
        super(zxw0.b.b, hyw0Var);
        this.f = voipScheduledCallSettingsConfig;
        this.g = n6h0Var;
        this.h = new f4z<>();
    }

    public static void U(iyw0 iyw0Var, izs izsVar) {
        iyw0.a aVar = iyw0Var instanceof iyw0.a ? (iyw0.a) iyw0Var : null;
        if (aVar != null) {
            izsVar.invoke(aVar);
        }
    }

    public static void V(cyw0 cyw0Var, Boolean bool, Boolean bool2, Boolean bool3, ScheduledAudioMuteOption scheduledAudioMuteOption, ScheduledVideoMuteOption scheduledVideoMuteOption, ScheduledWatchTogetherOption scheduledWatchTogetherOption, ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption, Boolean bool4, Boolean bool5, iyw0.a aVar, int i) {
        Boolean bool6 = (i & 1) != 0 ? null : bool;
        Boolean bool7 = (i & 2) != 0 ? null : bool2;
        Boolean bool8 = (i & 4) != 0 ? null : bool3;
        ScheduledAudioMuteOption scheduledAudioMuteOption2 = (i & 8) != 0 ? null : scheduledAudioMuteOption;
        ScheduledVideoMuteOption scheduledVideoMuteOption2 = (i & 16) != 0 ? null : scheduledVideoMuteOption;
        ScheduledWatchTogetherOption scheduledWatchTogetherOption2 = (i & 32) != 0 ? null : scheduledWatchTogetherOption;
        ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption2 = (i & 64) != 0 ? null : scheduledScreenSharingMuteOption;
        Boolean bool9 = (i & 128) != 0 ? null : bool4;
        Boolean bool10 = (i & 256) == 0 ? bool5 : null;
        cyw0Var.getClass();
        boolean booleanValue = bool6 != null ? bool6.booleanValue() : aVar.b;
        boolean booleanValue2 = bool7 != null ? bool7.booleanValue() : aVar.c;
        boolean booleanValue3 = bool8 != null ? bool8.booleanValue() : aVar.d;
        if (scheduledAudioMuteOption2 == null) {
            scheduledAudioMuteOption2 = aVar.e;
        }
        if (scheduledVideoMuteOption2 == null) {
            scheduledVideoMuteOption2 = aVar.f;
        }
        if (scheduledWatchTogetherOption2 == null) {
            scheduledWatchTogetherOption2 = aVar.g;
        }
        if (scheduledScreenSharingMuteOption2 == null) {
            scheduledScreenSharingMuteOption2 = aVar.h.b;
        }
        cyw0Var.g.a = new m6h0(booleanValue, booleanValue2, booleanValue3, scheduledAudioMuteOption2, scheduledVideoMuteOption2, scheduledWatchTogetherOption2, scheduledScreenSharingMuteOption2, bool9 != null ? bool9.booleanValue() : aVar.i, bool10 != null ? bool10.booleanValue() : aVar.j);
    }

    @Override // xsna.wk50
    public final void N(iyw0 iyw0Var, zxw0 zxw0Var) {
        iyw0.a aVar;
        iyw0 iyw0Var2 = iyw0Var;
        zxw0 zxw0Var2 = zxw0Var;
        if (zxw0Var2 instanceof zxw0.b) {
            VoipScheduledCallSettingsConfig voipScheduledCallSettingsConfig = this.f;
            VoipScheduledCallSettingsConfig.CallSettings callSettings = voipScheduledCallSettingsConfig.b;
            this.g.a = new m6h0(callSettings.b, callSettings.c, callSettings.d, callSettings.e, callSettings.f, callSettings.g, callSettings.h, callSettings.i, callSettings.j);
            T(new gyw0.a(voipScheduledCallSettingsConfig));
        } else {
            boolean z = zxw0Var2 instanceof zxw0.a;
            f4z<fyw0> f4zVar = this.h;
            if (z) {
                f4zVar.b(fyw0.b.a);
            } else if (zxw0Var2 instanceof zxw0.c) {
                U(iyw0Var2, new ito0(5, this, zxw0Var2));
            } else {
                if (zxw0Var2 instanceof zxw0.d) {
                    aVar = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
                    if (aVar != null) {
                        f4zVar.b(new fyw0.d(aVar.f));
                        s3q0 s3q0Var = s3q0.a;
                    }
                } else {
                    int i = 11;
                    if (zxw0Var2 instanceof zxw0.f) {
                        U(iyw0Var2, new whi0(i, this, zxw0Var2));
                    } else if (zxw0Var2 instanceof zxw0.g) {
                        aVar = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
                        if (aVar != null) {
                            f4zVar.b(new fyw0.c(aVar.e));
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                    } else {
                        int i2 = 8;
                        if (zxw0Var2 instanceof zxw0.j) {
                            U(iyw0Var2, new zsl0(i2, this, zxw0Var2));
                        } else if (zxw0Var2 instanceof zxw0.k) {
                            U(iyw0Var2, new k82(29, this, zxw0Var2));
                        } else if (zxw0Var2 instanceof zxw0.l) {
                            U(iyw0Var2, new kpk0(i, this, zxw0Var2));
                        } else if (zxw0Var2 instanceof zxw0.m) {
                            U(iyw0Var2, new ydn0(6, this, zxw0Var2));
                        } else if (zxw0Var2 instanceof zxw0.h) {
                            U(iyw0Var2, new c1o0(i, this, zxw0Var2));
                        } else if (zxw0Var2 instanceof zxw0.i) {
                            U(iyw0Var2, new isb0(15, this, zxw0Var2));
                        } else {
                            if (!(zxw0Var2 instanceof zxw0.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            U(iyw0Var2, new snj0(i2, this, zxw0Var2));
                        }
                    }
                }
            }
        }
        s3q0 s3q0Var3 = s3q0.a;
    }
}
