package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningStopEvent;
import kotlin.NoWhenBranchMatchedException;
import xsna.hr90;

/* compiled from: DefaultPauseSubtypeResolveStrategy.kt */
/* loaded from: classes3.dex */
public class bkl implements ir90 {
    @Override // xsna.ir90
    public CommonAudioStat$AudioListeningStopEvent.Subtype a(hr90 hr90Var) {
        if (hr90Var.equals(hr90.b.a)) {
            return CommonAudioStat$AudioListeningStopEvent.Subtype.PAUSE_BTN;
        }
        if (hr90Var.equals(hr90.h.a)) {
            return CommonAudioStat$AudioListeningStopEvent.Subtype.PAUSE_BY_SYSTEM;
        }
        if (hr90Var.equals(hr90.d.a)) {
            return CommonAudioStat$AudioListeningStopEvent.Subtype.SESSION_TERMINATED;
        }
        if (hr90Var.equals(hr90.j.a)) {
            return CommonAudioStat$AudioListeningStopEvent.Subtype.VOICE;
        }
        if (hr90Var.equals(hr90.c.a)) {
            return CommonAudioStat$AudioListeningStopEvent.Subtype.PAYWALL_PAUSE;
        }
        if (hr90Var.equals(hr90.e.a)) {
            return CommonAudioStat$AudioListeningStopEvent.Subtype.CLIENT_RESTORE;
        }
        if (hr90Var.equals(hr90.a.a)) {
            return CommonAudioStat$AudioListeningStopEvent.Subtype.ERROR;
        }
        if (hr90Var.equals(hr90.f.a)) {
            return CommonAudioStat$AudioListeningStopEvent.Subtype.PREV;
        }
        if (!(hr90Var instanceof hr90.g)) {
            if (hr90Var.equals(hr90.i.a)) {
                return CommonAudioStat$AudioListeningStopEvent.Subtype.UNHANDLED_ON_CLIENT;
            }
            throw new NoWhenBranchMatchedException();
        }
        hr90.g gVar = (hr90.g) hr90Var;
        int i = gVar.b;
        int i2 = gVar.a;
        boolean z = i == 0;
        if (i2 == 0) {
            return z ? CommonAudioStat$AudioListeningStopEvent.Subtype.PULL_SLIDER_FORWARD : CommonAudioStat$AudioListeningStopEvent.Subtype.PULL_SLIDER_BACK;
        }
        if (i2 == 1) {
            return z ? CommonAudioStat$AudioListeningStopEvent.Subtype.SEEK_TAP_FORWARD : CommonAudioStat$AudioListeningStopEvent.Subtype.SEEK_TAP_BACK;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{lhg.a(i2, "Unknown event trigger seek type: ")});
        }
        return CommonAudioStat$AudioListeningStopEvent.Subtype.PULL_SLIDER_FORWARD;
    }
}
