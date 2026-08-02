package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.taxi.auction.analytics.AuctionAnalytics$Source;
import com.yandex.go.zone.dto.objects.AuctionInfo;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class ge3 {
    public final Context a;
    public final tt2 b;
    public final pdc c;
    public final xdf d;
    public final uze0 e;
    public final pd3 f;
    public final yp2 g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final n0 i = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public ge3(Context context, tt2 tt2Var, pdc pdcVar, xdf xdfVar, uze0 uze0Var, pd3 pd3Var, yp2 yp2Var) {
        this.a = context;
        this.b = tt2Var;
        this.c = pdcVar;
        this.d = xdfVar;
        this.e = uze0Var;
        this.f = pd3Var;
        this.g = yp2Var;
    }

    public static final void a(ge3 ge3Var, mi31 mi31Var, boolean z) {
        double min;
        qke.v(ge3Var.a);
        fe3 c = ge3Var.c(mi31Var);
        pd3 pd3Var = ge3Var.f;
        if (z) {
            b1 b1Var = pd3Var.a;
            AuctionAnalytics$Source auctionAnalytics$Source = AuctionAnalytics$Source.Summary;
            b1Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("source", auctionAnalytics$Source.getEventValue());
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            b1Var.a.a(sb2.q("auction_price_decreased", hashMap), hashMap, 1, hashMap2);
            AuctionInfo auctionInfo = c.a;
            min = Math.max(auctionInfo.c, c.b - auctionInfo.b);
        } else {
            b1 b1Var2 = pd3Var.a;
            AuctionAnalytics$Source auctionAnalytics$Source2 = AuctionAnalytics$Source.Summary;
            b1Var2.getClass();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("source", auctionAnalytics$Source2.getEventValue());
            HashMap hashMap4 = new HashMap();
            Regex regex2 = sho.a;
            b1Var2.a.a(sb2.q("auction_price_increased", hashMap3), hashMap3, 1, hashMap4);
            AuctionInfo auctionInfo2 = c.a;
            min = Math.min(auctionInfo2.d, c.b + auctionInfo2.b);
        }
        ge3Var.d(mi31Var, new fe3(c.a, min));
    }

    public final sd3 b(String str) {
        kdc b = ((ufu) this.c).b(str);
        if (b == null) {
            return new rd3(new bdc(xng0.controlMinor), AppColor$Palette.ControlMinor);
        }
        int m = s8o.m(b, this.a);
        return new qd3(scc.g(b, new cdc(Color.argb((int) (Color.alpha(m) * 0.5f), Color.red(m), Color.green(m), Color.blue(m)))), this.g.a(str, AppColor$Palette.ControlMinor));
    }

    public final fe3 c(mi31 mi31Var) {
        return (fe3) this.h.getOrDefault(new Pair(mi31Var.b, mi31Var.f), new fe3(0));
    }

    public final void d(mi31 mi31Var, fe3 fe3Var) {
        Pair pair = new Pair(mi31Var.b, mi31Var.f);
        if (fe3Var == null) {
            AuctionInfo auctionInfo = mi31Var.a.C0;
            fe3Var = new fe3(auctionInfo, auctionInfo.a);
        }
        this.h.put(pair, fe3Var);
        this.i.g(zy11.a);
    }
}
