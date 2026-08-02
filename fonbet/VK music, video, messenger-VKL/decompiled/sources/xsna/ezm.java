package xsna;

import android.os.Bundle;
import com.vk.log.L;
import com.vk.metrics.performance.memory.LargeTransactionChecker;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$IntRef;
import org.webrtc.StatsReport;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.topology.StatsObserver;
import ru.ok.android.webrtc.topology.direct.DirectCallTopology;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class ezm implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Cloneable d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ezm(Object obj, Cloneable cloneable, Serializable serializable, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = cloneable;
        this.e = serializable;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((DirectCallTopology) this.c).a((StatsReport[]) this.d, (StatsReport[]) this.e, (CallParticipant.ParticipantId) this.f, (StatsObserver) this.g);
                break;
            default:
                String str = (String) this.c;
                Bundle bundle = (Bundle) this.d;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.e;
                LargeTransactionChecker.Type type = (LargeTransactionChecker.Type) this.f;
                Bundle bundle2 = (Bundle) this.g;
                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.LARGE_TRANSACTION.h(), null, str, Integer.valueOf(LargeTransactionChecker.a.a(bundle)), null, Integer.valueOf(ref$IntRef.element), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -46, 3, null);
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
                L.G("WARNING! SO HUGE TRANSACTION DATA!");
                StringBuilder sb = new StringBuilder();
                sb.append(type.name());
                sb.append(" totalSize=");
                sb.append(ref$IntRef.element);
                sb.append('\n');
                LargeTransactionChecker.c cVar = new LargeTransactionChecker.c();
                int a = LargeTransactionChecker.a.a(bundle2);
                LargeTransactionChecker.b bVar = new LargeTransactionChecker.b(str, "Bundle", a);
                cVar.a(bVar, bundle2, a);
                StringBuilder sb2 = new StringBuilder();
                LargeTransactionChecker.c.d(sb2, bVar, 0);
                sb.append(sb2.toString());
                L.G(sb.toString());
                break;
        }
    }
}
