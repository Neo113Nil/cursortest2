package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.DownloadState;
import java.util.ArrayList;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ni30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ni30(ArrayList arrayList, int i) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                AttachWithDownload attachWithDownload = (AttachWithDownload) ((Attach) obj).copy();
                attachWithDownload.A6(DownloadState.DOWNLOADING);
                attachWithDownload.a3(null);
                this.c.add(attachWithDownload);
                return attachWithDownload;
            default:
                tra0.a aVar = (tra0.a) obj;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aVar.q((tra0) arrayList.get(i), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return s3q0.a;
        }
    }
}
