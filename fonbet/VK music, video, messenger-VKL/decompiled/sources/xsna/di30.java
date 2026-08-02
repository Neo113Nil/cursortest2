package xsna;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.superapp.core.perf.BrowserPerfState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.gv30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class di30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ di30(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                fi30 fi30Var = (fi30) this.e;
                w2w w2wVar = (w2w) this.f;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    long j = fi30Var.b.b;
                    gv30.a aVar = new gv30.a();
                    aVar.a = j;
                    aVar.a();
                    aVar.b();
                    aVar.c();
                    aVar.b = Integer.valueOf(intValue);
                    new zd20(new gv30(aVar), new utb(w2wVar.I0(), w2wVar.getExperiments()), true, false).a(w2wVar);
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((ResumableAttachUploadInfo) it2.next()).d()));
                }
                w2wVar.I0().upload().f(arrayList2);
                break;
            case 1:
                yp80 yp80Var = (yp80) this.c;
                String str = (String) this.d;
                BrowserPerfState browserPerfState = (BrowserPerfState) this.e;
                Uri uri = (Uri) this.f;
                Throwable th = (Throwable) obj;
                boolean z = th instanceof VKApiExecutionException;
                if (!z || ((VKApiExecutionException) th).s() != 104) {
                    com.vk.common.links.c.c(str, browserPerfState, th);
                    boolean z2 = false;
                    if (z && ((VKApiExecutionException) th).s() == Integer.MIN_VALUE) {
                        String path = uri.getPath();
                        if (path != null ? drm0.D(path, "/app", false) : false) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        h03.b(th);
                    } else if (yp80Var != null) {
                        yp80Var.onError(th);
                    }
                } else if (yp80Var != null) {
                    yp80Var.U();
                }
                break;
            default:
                vcr vcrVar = (vcr) this.c;
                god0 god0Var = (god0) this.d;
                u9 u9Var = (u9) this.e;
                FragmentActivity fragmentActivity = (FragmentActivity) this.f;
                MarketBridgeCategory marketBridgeCategory = (MarketBridgeCategory) obj;
                rka rkaVar = (rka) vcrVar;
                List<wqd0> list = rkaVar.j;
                wqd0 wqd0Var = null;
                if (list != null) {
                    int i = marketBridgeCategory.b;
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            wqd0 wqd0Var2 = (wqd0) it3.next();
                            while (true) {
                                wqd0 wqd0Var3 = wqd0Var2.f;
                                if (wqd0Var3 != null) {
                                    wqd0Var2 = wqd0Var3;
                                } else {
                                    wqd0 c = god0.c(wqd0Var2, i);
                                    if (c != null) {
                                        wqd0Var = c;
                                    }
                                }
                            }
                        }
                    }
                }
                rkaVar.e = wqd0Var;
                u9Var.invoke(vcrVar);
                god0Var.a.g(fragmentActivity);
                break;
        }
        return s3q0.a;
    }
}
