package xsna;

import android.os.Parcelable;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import java.util.ArrayList;
import java.util.List;
import xsna.kyh;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pch implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pch(int i, com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar, vzh vzhVar, wk50.a aVar2) {
        this.d = aVar2;
        this.e = aVar;
        this.f = vzhVar;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        int i;
        switch (this.b) {
            case 0:
                wk50.a aVar = (wk50.a) this.d;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar2 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) this.e;
                vzh vzhVar = (vzh) this.f;
                qma0 qma0Var = (qma0) obj;
                aVar.b(new e.k(qma0Var.e, qma0Var.g));
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d(aVar, false);
                aVar2.c.b(new kyh.a.C3215a(vzhVar.b.b, this.c, qma0Var.c, qma0Var.d, qma0Var.a, qma0Var.b, qma0Var.g));
                return s3q0.a;
            default:
                String str = (String) this.d;
                String str2 = (String) this.e;
                List<Parcelable> list = (List) this.f;
                int i2 = this.c;
                qyg0 V0 = ((hyg0) obj).V0(str);
                try {
                    V0.D3(1, str2);
                    int i3 = 2;
                    for (Parcelable parcelable : list) {
                        vuu vuuVar = parcelable instanceof vuu ? (vuu) parcelable : null;
                        if (vuuVar != null) {
                            i = vuuVar.g5();
                        } else {
                            DownloadingState.NotLoaded.b.getClass();
                            i = 0;
                        }
                        V0.bindLong(i3, i);
                        i3++;
                    }
                    V0.D3(i2 + 2, "-2147483648");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        UserId b = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i4 = (int) V0.getLong(3);
                        if (i4 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i4 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i4 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i4 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i4 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        arrayList.add(new ic50((int) V0.getLong(5), downloadingState, b, l2, V0.l2(4)));
                    }
                    V0.close();
                    return arrayList;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ pch(String str, String str2, List list, fb50 fb50Var, int i) {
        this.d = str;
        this.e = str2;
        this.f = list;
        this.c = i;
    }
}
