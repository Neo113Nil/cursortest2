package xsna;

import com.ironsource.C4343h2;
import com.ironsource.W8;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.my.tracker.campaign.CampaignService;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.ArrayList;
import org.chromium.net.impl.JavaUploadDataSinkBase;
import org.chromium.net.impl.JavaUrlRequestUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ac3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ac3(int i, Object obj, Object obj2, String str) {
        this.b = i;
        this.d = obj;
        this.c = str;
        this.e = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [Input, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                o25.a().O(new t200(44, (UserId) this.e, str, (String) this.d, true, false, false));
                return;
            case 1:
                ((CampaignService) this.d).a((String) this.c, (hv2) this.e);
                return;
            case 2:
                ((JavaUploadDataSinkBase) this.d).lambda$executeOnUploadExecutor$5((String) this.c, (JavaUrlRequestUtils.CheckedRunnable) this.e);
                return;
            case 3:
                xy0 xy0Var = (xy0) this.c;
                fg00 fg00Var = (fg00) this.d;
                ?? r2 = this.e;
                xy0Var.invoke();
                fg00Var.b = r2;
                fg00Var.c = null;
                return;
            case 4:
                r6e0 r6e0Var = (r6e0) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                L.d(new dj60(arrayList, 18));
                r6e0.b().c(arrayList);
                synchronized (r6e0Var.a) {
                    r6e0Var.a.addAll(arrayList2);
                    s3q0 s3q0Var = s3q0.a;
                }
                return;
            default:
                C4343h2.a((C4343h2) this.c, (ImpressionDataListener) this.d, (W8) this.e);
                return;
        }
    }

    public /* synthetic */ ac3(UserId userId, String str, String str2) {
        this.b = 0;
        this.c = str;
        this.e = userId;
        this.d = str2;
    }

    public /* synthetic */ ac3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
