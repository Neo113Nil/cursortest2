package xsna;

import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class wb00 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wb00(long j, String str) {
        this.c = j;
        this.d = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 readyToUse$lambda$0;
        switch (this.b) {
            case 0:
                readyToUse$lambda$0 = MLDownloadStat.readyToUse$lambda$0(this.c, (String) this.d, (CallEventualStatSender) obj);
                return readyToUse$lambda$0;
            default:
                hwp0 hwp0Var = (hwp0) this.d;
                List<ewp0> list = (List) obj;
                kyp0 kyp0Var = hwp0Var.c.a;
                List<ewp0> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (ewp0 ewp0Var : list2) {
                    arrayList.add(new dwp0(ewp0Var.a, ewp0Var.b, ewp0Var.c, ewp0Var.d, ewp0Var.e));
                }
                kyp0Var.a(arrayList);
                hwp0Var.d.put(this.c, list);
                return s3q0.a;
        }
    }

    public /* synthetic */ wb00(hwp0 hwp0Var, long j) {
        this.d = hwp0Var;
        this.c = j;
    }
}
