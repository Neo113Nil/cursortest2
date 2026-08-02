package xsna;

import android.content.Context;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import xsna.whc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zkt implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zkt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                utb utbVar = (utb) this.c;
                return Boolean.valueOf(((NewsFeedBridgeComponent) ((Lazy) utbVar.c).getValue()).Ad().A((Context) utbVar.b));
            default:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
                int i = SettingsGeneralFragment.z0;
                com.vk.metrics.eventtracking.b.a.n("IM.CLEAR_CACHE");
                r1w N = ((ImEngineLifecycleComponent) j6i.b(m7m.d(settingsGeneralFragment), ImEngineLifecycleComponent.class)).N();
                whc.c cVar = whc.c.c;
                N.d(cVar);
                if (((ImExperimentsComponent) j6i.b(m7m.d(settingsGeneralFragment), ImExperimentsComponent.class)).getExperiments().i()) {
                    a1w a1wVar = q1w.b;
                    if (a1wVar == null) {
                        a1wVar = null;
                    }
                    a1wVar.g(cVar);
                }
                i2w.a().n(settingsGeneralFragment, new pam());
                xal c = vwv.c();
                lza0 lza0Var = jw5.b;
                c.E(lza0Var);
                vwv.c().a(lza0Var);
                return 0;
        }
    }
}
