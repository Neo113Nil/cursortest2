package xsna;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vkontakte.android.fragments.videos.VideosFragment;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: SearchHandler.kt */
/* loaded from: classes7.dex */
public final class cuh0 implements fhd0, lao0 {
    public final xk40 a;
    public final NewsfeedRouter b;

    public cuh0(xk40 xk40Var, NewsfeedRouter newsfeedRouter) {
        this.a = xk40Var;
        this.b = newsfeedRouter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r2.equals("auto") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        r2 = new com.vk.search.fragment.DiscoverSearchFragment.a();
        r2.B(r6);
        r2.C();
        r2.z(r1);
        r2.k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r2.equals("all") != false) goto L27;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // xsna.g9l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(fgx fgxVar) {
        Context context = fgxVar.e;
        String a = fgxVar.a("ad_campaign_source");
        String a2 = fgxVar.a("section");
        if (a2 == null) {
            a2 = fgxVar.a("c_section");
        }
        String a3 = fgxVar.a(CampaignEx.JSON_KEY_AD_Q);
        if (a3 == null) {
            a3 = fgxVar.a("c_q");
        }
        String str = a3;
        if (a2 != null) {
            switch (a2.hashCode()) {
                case -991808881:
                    if (a2.equals("people")) {
                        DiscoverSearchFragment.a aVar = new DiscoverSearchFragment.a();
                        aVar.B(str);
                        aVar.F();
                        aVar.k(context);
                        blk.P(fgxVar).onSuccess();
                        return;
                    }
                    break;
                case -885478841:
                    if (a2.equals("communities")) {
                        DiscoverSearchFragment.a aVar2 = new DiscoverSearchFragment.a();
                        aVar2.D();
                        aVar2.z(a);
                        aVar2.B(str);
                        aVar2.k(context);
                        blk.P(fgxVar).onSuccess();
                        return;
                    }
                    break;
                case 96673:
                    break;
                case 3005871:
                    break;
                case 93166550:
                    if (a2.equals("audio")) {
                        yk40 builder = this.a.builder();
                        builder.F(str);
                        builder.B(context);
                        blk.P(fgxVar).onSuccess();
                        return;
                    }
                    break;
                case 112202875:
                    if (a2.equals("video")) {
                        new VideosFragment.e().k(context);
                        blk.P(fgxVar).onSuccess();
                        return;
                    }
                    break;
                case 1318692896:
                    if (a2.equals("statuses")) {
                        NewsfeedRouter.l(this.b, fgxVar.e, str, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        blk.P(fgxVar).onSuccess();
                        return;
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unknown \"section\" query parameter");
    }
}
