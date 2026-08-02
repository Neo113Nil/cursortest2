package xsna;

import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.q4r;
import xsna.qvq;
import xsna.uyq;
import xsna.wk50;

/* compiled from: FeedVideoUpdateActionDelegate.kt */
/* loaded from: classes17.dex */
public final class z4r implements oj50<q4r, qvq, c2r> {
    public final myc a;
    public final f4z b;
    public final hwc c;
    public final boolean d;

    public z4r(ClipFeedTab clipFeedTab, boolean z, myc mycVar, f4z f4zVar, hwc hwcVar) {
        this.a = mycVar;
        this.b = f4zVar;
        this.c = hwcVar;
        this.d = (clipFeedTab instanceof ClipFeedTab.TopVideo) && !z;
    }

    public static void b(wk50.a aVar, q4r.a aVar2, UserId userId) {
        boolean z;
        List<FeedItem> list = aVar2.b.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            FeedItem feedItem = (FeedItem) obj;
            if (feedItem instanceof FeedItem.d) {
                z = epx.f(((FeedItem.d) feedItem).k().I0(), userId);
            } else if (feedItem instanceof FeedItem.m) {
                SdkOwner sdkOwner = ((FeedItem.m) feedItem).d.d;
                z = epx.f(sdkOwner != null ? sdkOwner.b : null, userId);
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeedItem) it.next()).F());
        }
        aVar.b(new d2r(j5g.S0(arrayList2)));
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        hwc hwcVar;
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((qvqVar instanceof qvq.x) && (q4rVar instanceof q4r.a)) {
            llh0 llh0Var = ((qvq.x) qvqVar).b;
            if (llh0Var instanceof xxr0) {
                c(aVar, (q4r.a) q4rVar, ((xxr0) llh0Var).a);
                return;
            }
            if (llh0Var instanceof zwr0) {
                c(aVar, (q4r.a) q4rVar, ((zwr0) llh0Var).a);
                return;
            }
            if (llh0Var instanceof pxr0) {
                c(aVar, (q4r.a) q4rVar, ((pxr0) llh0Var).a);
                return;
            }
            if (llh0Var instanceof ixr0) {
                c1r c1rVar = ((q4r.a) q4rVar).b().get(((ixr0) llh0Var).a.r1());
                if (c1rVar == null || (hwcVar = this.c) == null) {
                    return;
                }
                FeedItem feedItem = c1rVar.a;
                if (hwcVar.b()) {
                    SdkExternalNpsCondition sdkExternalNpsCondition = SdkExternalNpsCondition.CLIP_LIKED;
                    if (hwcVar.a(feedItem, sdkExternalNpsCondition)) {
                        hwcVar.a.c(sdkExternalNpsCondition);
                        return;
                    }
                    return;
                }
                return;
            }
            if (llh0Var instanceof gyr0) {
                aVar.b(new g2r(myc.d(this.a, ((gyr0) llh0Var).a, null, 6)));
                return;
            }
            if (llh0Var instanceof lwr0) {
                q4r.a aVar2 = (q4r.a) q4rVar;
                lwr0 lwr0Var = (lwr0) llh0Var;
                List<FeedItem> list = aVar2.b.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    FeedItem feedItem2 = (FeedItem) obj;
                    if (!(feedItem2 instanceof FeedItem.d)) {
                        if (feedItem2 instanceof FeedItem.m) {
                            SdkOwner sdkOwner = ((FeedItem.m) feedItem2).d.d;
                            if (!epx.f(sdkOwner != null ? sdkOwner.b : null, lwr0Var.a)) {
                            }
                        }
                        arrayList.add(obj);
                    } else if (!epx.f(((FeedItem.d) feedItem2).k().I0(), lwr0Var.a)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty() && !this.d && (aVar2.e.a instanceof PaginationKey.LoadedFull) && (aVar2.d.a instanceof PaginationKey.LoadedFull)) {
                    this.b.b(uyq.a.a);
                } else if (arrayList.isEmpty()) {
                    aVar.a(qvq.n.b);
                } else {
                    b(aVar, aVar2, lwr0Var.a);
                }
            }
        }
    }

    public final void c(wk50.a aVar, q4r.a aVar2, SdkVideoFile sdkVideoFile) {
        String r1 = sdkVideoFile.r1();
        boolean z = false;
        if (aVar2.b.a.size() == 1 && epx.f(aVar2.b.a.get(0).F(), r1)) {
            z = true;
        }
        boolean z2 = this.d;
        if (z2) {
            b(aVar, aVar2, sdkVideoFile.I0());
            return;
        }
        if (z && !z2 && (aVar2.e.a instanceof PaginationKey.LoadedFull) && (aVar2.d.a instanceof PaginationKey.LoadedFull)) {
            this.b.b(uyq.a.a);
        } else {
            aVar.b(new e2r(r1));
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
