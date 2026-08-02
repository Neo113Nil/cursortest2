package xsna;

import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.dto.common.VideoFile;
import com.vk.uxpolls.domain.exception.NotConfiguredError;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger;
import xsna.d5r0;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class w1j implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w1j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        String a;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((a2j) obj).C(v1j.l.b);
                break;
            case 1:
                blq0 blq0Var = l4r0.a;
                String h = ((ExternalNpsCondition) obj).h();
                d4e0 d4e0Var = l4r0.b;
                if (d4e0Var != null && (a = d4e0Var.a()) != null) {
                    blq0 blq0Var2 = l4r0.a;
                    if (blq0Var2 == null) {
                        blq0Var2 = null;
                    }
                    d5r0.a.b bVar = new d5r0.a.b(h, a, blq0Var2);
                    if (!znk0.C()) {
                        new NotConfiguredError("interacted() was called before configure()");
                        break;
                    } else {
                        ((Boolean) myc0.i(EmptyCoroutineContext.b, new k4r0(bVar, null))).getClass();
                        break;
                    }
                }
                break;
            case 2:
                P2pRelaySwitchTrigger.getConfigDisposable$lambda$0((P2pRelaySwitchTrigger) obj);
                break;
            default:
                w1s0.d.remove(((VideoFile) obj).a1());
                break;
        }
    }
}
