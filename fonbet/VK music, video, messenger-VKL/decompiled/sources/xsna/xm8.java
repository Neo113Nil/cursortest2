package xsna;

import com.google.android.ump.ConsentInformation;
import java.util.Iterator;
import java.util.List;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.webrtc.topology.server.ServerCallTopology;
import xsna.lau;
import xsna.nau;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class xm8 implements ConsentInformation.b, StatsObserver, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xm8(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // org.webrtc.StatsObserver
    public void onComplete(StatsReport[] statsReportArr) {
        ((ServerCallTopology) this.b).a((ru.ok.android.webrtc.topology.StatsObserver) this.c, statsReportArr);
    }

    @Override // com.google.android.ump.ConsentInformation.b
    public void onConsentInfoUpdateSuccess() {
        nau nauVar = (nau) this.b;
        rau rauVar = new rau((ConsentInformation) this.c, new h1j(nauVar, 17));
        List<lau.a> a = nauVar.c.a();
        nauVar.c = new nau.a.c(rauVar);
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            ((lau.a) it.next()).a(rauVar);
        }
    }
}
