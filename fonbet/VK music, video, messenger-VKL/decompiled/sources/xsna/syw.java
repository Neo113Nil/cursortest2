package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.toggle.features.MusicFeatures;
import xsna.k840;

/* compiled from: InitMusicBeforeTaskLogic.kt */
/* loaded from: classes11.dex */
public final class syw extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "InitMusicBefore";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        boolean j;
        com.vk.music.notifications.restriction.a cVar;
        q5v0 q5v0Var;
        s750 s750Var = new s750(new bpn0(new duq(this, 4)));
        k840.a.e = s750Var;
        k840.d = new y6l();
        k840.f = new u370();
        k840.a.h = new r5v0();
        k840.a.g = new q5v0();
        PlayerUIComponent playerUIComponent = (PlayerUIComponent) c().a(fpf0.a(PlayerUIComponent.class));
        new w5v0(playerUIComponent.J9(), new fat(playerUIComponent, 3));
        if (BuildInfo.u()) {
            j = BuildInfo.j() || BuildInfo.k() || (BuildInfo.n() && MusicFeatures.AUDIO_RUSTORE_SUBSCRIPTION.h());
        } else {
            j = BuildInfo.j();
        }
        if (j && !BuildInfo.e()) {
            q5v0 q5v0Var2 = k840.a.g;
            q5v0Var = q5v0Var2 != null ? q5v0Var2 : null;
            r55 r55Var = r55.a;
            q55 q55Var = q55.a;
            cVar = new com.vk.music.notifications.restriction.d(s750Var, q5v0Var, new hp40());
        } else {
            q5v0 q5v0Var3 = k840.a.g;
            q5v0Var = q5v0Var3 != null ? q5v0Var3 : null;
            r55 r55Var2 = r55.a;
            q55 q55Var2 = q55.a;
            cVar = new com.vk.music.notifications.restriction.c(s750Var, q5v0Var);
        }
        k840.a.d = cVar;
        k840.a.c = new s450(cVar, new bpn0(new gat(this, 4)));
        k840.a.b = new ryw(this, 0);
        k840.a.j = new fp01();
        k840.a.k = new c45(1);
        kvf.b = new jp40();
        kvf.a = new lp40(new tib(PlayerService.class), new com.vk.music.track.a());
        k840.b.a.a = Preference.j().getBoolean("__dbg_music_debug_headphone_notification_short_time", false);
        return s3q0.a;
    }
}
