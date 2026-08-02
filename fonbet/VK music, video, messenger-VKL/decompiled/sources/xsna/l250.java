package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import xsna.wxi0;

/* compiled from: MusicPrefsInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class l250 extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "MusicPrefsInit";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        final com.vk.music.pref.a Q0 = ((MusicPrefsComponent) c().a(fpf0.a(MusicPrefsComponent.class))).Q0();
        Q0.I(o25.a().c().b);
        ((SessionManagementComponent) c().a(fpf0.a(SessionManagementComponent.class))).J2().f(new ayi0() { // from class: xsna.k250
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                wxi0 a = new vxi0(uxi0Var).a();
                boolean z = a instanceof wxi0.a;
                com.vk.music.pref.a aVar = com.vk.music.pref.a.this;
                if (z) {
                    aVar.I(((wxi0.a) a).a().b);
                } else if (a instanceof wxi0.d) {
                    aVar.I(((wxi0.d) a).a().c().b().b);
                }
            }
        });
        return s3q0.a;
    }
}
