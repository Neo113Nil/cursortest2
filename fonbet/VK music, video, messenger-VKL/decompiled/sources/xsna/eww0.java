package xsna;

import android.app.Application;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vk.voip.miniapps.impl.di.VoipMiniAppCallComponentImpl;

/* compiled from: VoipRegisterComponentFactories.kt */
/* loaded from: classes11.dex */
public final class eww0 {
    public static final void a(i7m i7mVar, final Application application) {
        final bpn0 bpn0Var = new bpn0(new y56(16));
        final bpn0 bpn0Var2 = new bpn0(new exw(12));
        final bpn0 bpn0Var3 = new bpn0(new ag7(16));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.voip.api.di.VoipCallComponent", new gzs() { // from class: xsna.cww0
            @Override // xsna.gzs
            public final Object invoke() {
                return new VoipCallComponentImpl.a(bpn0.this, bpn0Var3, new kp50(), bpn0Var2, new bpn0(new m(19)));
            }
        });
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.voip.ui.di.VoipFirstCallCacheComponent", new rwe(17));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent", new ihg(17));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.voip.miniapps.api.di.VoipMiniAppCallComponent", new gzs() { // from class: xsna.dww0
            @Override // xsna.gzs
            public final Object invoke() {
                return new VoipMiniAppCallComponentImpl.a(application, bpn0Var);
            }
        });
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.vmoji.storage.api.di.component.VmojiStorageComponent", new g67(application, 10));
        i7mVar.b("com.vk.voip.ui.di.VoipAnalyticsInternalComponent", new zfl(15));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent", new yp6(19));
        i7mVar.b("com.vk.voip.stereo.api.roomlist.di.VoipStereoRoomListRouterComponent", new c24(23));
        i7mVar.b("com.vk.voip.stereo.api.create.di.VoipStereoCreateRoomRouterComponent", new l67(18));
        i7mVar.b("com.vk.voip.stereo.api.create.di.VoipStereoCreateRoomComponent", new jbw(18));
        i7mVar.b("com.vk.voip.stereo.api.selectspeaker.di.VoipStereoSelectSpeakersRouterComponent", new mb8(17));
        i7mVar.b("com.vk.voip.stereo.api.selectspeaker.di.VoipStereoSelectSpeakersComponent", new nb8(26));
        i7mVar.b("com.vk.voip.stereo.api.join.di.VoipStereoJoinRouterComponent", new p5m(16));
        i7mVar.b("com.vk.voip.stereo.api.join.di.VoipStereoJoinComponent", new b55(16));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.voip.stereo.api.room.di.VoipStereoComponent", new pb8(14));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.voip.stereo.api.notifications.di.VoipStereoNotificationsComponent", new kb0(14));
    }
}
