package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;

/* compiled from: VoipAnalyticsCollector.kt */
/* loaded from: classes11.dex */
public final class jdw0 implements kdw0<mdw0> {
    public final ArrayList a;

    /* compiled from: VoipAnalyticsCollector.kt */
    public interface a {
        boolean a(mdw0 mdw0Var);
    }

    /* compiled from: VoipAnalyticsCollector.kt */
    public interface b {
        boolean a(mdw0 mdw0Var);
    }

    public jdw0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // xsna.kdw0
    public final void b(mdw0 mdw0Var) {
        ArrayList<Pair> arrayList = this.a;
        if (!arrayList.isEmpty()) {
            for (Pair pair : arrayList) {
                if (((a) pair.i()).a(mdw0Var) && ((b) ((Lazy) pair.j()).getValue()).a(mdw0Var)) {
                    return;
                }
            }
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{"Analytics event " + mdw0Var + " is lost, there is no necessary collector"});
        }
        if (BuildInfo.h()) {
            cvk.u(R.string.voip_analytical_event_lost, true);
        }
    }
}
