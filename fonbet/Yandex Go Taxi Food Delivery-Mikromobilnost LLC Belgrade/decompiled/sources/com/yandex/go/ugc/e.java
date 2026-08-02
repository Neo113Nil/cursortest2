package com.yandex.go.ugc;

import android.net.Uri;
import android.os.SystemClock;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.ag41;
import defpackage.bi41;
import defpackage.cu41;
import defpackage.fui0;
import defpackage.gw00;
import defpackage.hlx0;
import defpackage.i790;
import defpackage.ih01;
import defpackage.is11;
import defpackage.jl40;
import defpackage.m790;
import defpackage.scg;
import defpackage.tje;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes14.dex */
public final class e implements bi41 {
    public final /* synthetic */ is11 a;
    public final /* synthetic */ f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ WebViewFromDeeplinkExperiment.a w;

    public e(is11 is11Var, f fVar, String str, WebViewFromDeeplinkExperiment.a aVar) {
        this.a = is11Var;
        this.b = fVar;
        this.c = str;
        this.w = aVar;
    }

    @Override // defpackage.bi41
    public final void onPageCommitVisible(String str) {
        is11 is11Var = this.a;
        if (is11Var == null || is11Var.i) {
            return;
        }
        is11Var.h = str;
    }

    @Override // defpackage.bi41
    public final void onPageFinished(String str) {
        Long l;
        is11 is11Var = this.a;
        if (is11Var != null && (l = is11Var.e) != null) {
            long longValue = l.longValue();
            if (!is11Var.i && jl40.l(is11Var.h, str)) {
                hlx0 hlx0Var = is11Var.b;
                String str2 = is11Var.a;
                String str3 = is11Var.c;
                String host = Uri.parse(str).getHost();
                long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
                int i = is11Var.k;
                Map p = hlx0Var.p(str2, str3);
                if (host != null && host.length() != 0) {
                    p = kotlin.collections.b.n(p, gw00.e(new Pair(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, host)));
                }
                hlx0Var.A("Ugc.PageLoadingFinished", kotlin.collections.b.n(p, kotlin.collections.b.i(new Pair("duration_ms", Long.valueOf(elapsedRealtime)), new Pair("redirect_count", Integer.valueOf(i)))));
                is11Var.i = true;
            }
        }
        f fVar = this.b;
        ih01 ih01Var = (ih01) fVar.I.x;
        ih01Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("url_id", this.c);
        ih01Var.a.a("Ugc.Successful", hashMap, 1, new HashMap());
        ((ag41) ((scg) fVar.T()).a()).c(cu41.c);
    }

    @Override // defpackage.bi41
    public final void onPageLoadingError(m790 m790Var) {
        f fVar = this.b;
        ((ag41) ((scg) fVar.T()).a()).b(true);
        hlx0 hlx0Var = fVar.I;
        String str = this.c;
        hlx0Var.q(str);
        if (m790Var instanceof i790) {
            hlx0Var.l(str);
            tje.N(fVar.o(), new fui0(fVar, str), null, new UgcDeeplinkRouterImpl$showInternal$loadingListener$1$onPageLoadingError$2(fVar, this.w, null), 2);
        }
    }

    @Override // defpackage.bi41
    public final void onPageStarted(String str) {
        is11 is11Var = this.a;
        if (is11Var != null) {
            String str2 = is11Var.c;
            String str3 = is11Var.a;
            hlx0 hlx0Var = is11Var.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str4 = is11Var.f;
            Long l = is11Var.g;
            if (str4 == null || l == null) {
                is11Var.e = Long.valueOf(elapsedRealtime);
                String host = Uri.parse(str).getHost();
                Map p = hlx0Var.p(str3, str2);
                if (host != null && host.length() != 0) {
                    p = kotlin.collections.b.n(p, gw00.e(new Pair(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, host)));
                }
                hlx0Var.A("Ugc.PageLoadingStarted", p);
            } else if (!str4.equals(str)) {
                int i = is11Var.k + 1;
                is11Var.k = i;
                String host2 = Uri.parse(str4).getHost();
                String host3 = Uri.parse(str).getHost();
                long longValue = elapsedRealtime - l.longValue();
                MapBuilder p2 = hlx0Var.p(str3, str2);
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("redirect_index", Integer.valueOf(i));
                mapBuilder.put("duration_ms", Long.valueOf(longValue));
                if (host2 != null && host2.length() != 0) {
                    mapBuilder.put("from_host", host2);
                }
                if (host3 != null && host3.length() != 0) {
                    mapBuilder.put("to_host", host3);
                }
                hlx0Var.A("Ugc.PageRedirect", kotlin.collections.b.n(p2, mapBuilder.j()));
            }
            is11Var.f = str;
            is11Var.g = Long.valueOf(elapsedRealtime);
        }
        UgcDeeplinkApi ugcDeeplinkApi = this.b.M;
        if (ugcDeeplinkApi != null) {
            ugcDeeplinkApi.onPageStarted(str);
        }
    }
}
