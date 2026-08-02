package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.games.presentation.utils.HapticHelper;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a5u;
import xsna.ic50;
import xsna.o9t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gs1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        b.a aVar = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ms1 ms1Var = (ms1) obj3;
                MusicTrack musicTrack = (MusicTrack) obj2;
                int i2 = 0;
                ms1Var.e1(musicTrack, MusicPlaybackLaunchContext.e, true).subscribe(new is1(new hs1(ms1Var, musicTrack, (Context) obj, i2), i2), new js1(new nj(1), i2));
                return s3q0.a;
            case 1:
                izs izsVar = (izs) obj3;
                nhd nhdVar = (nhd) obj2;
                b.a aVar2 = (b.a) obj;
                if (nhdVar.c.b()) {
                    aVar = aVar2;
                } else if (nhdVar.d) {
                    aVar = nhdVar.e.invoke(aVar2);
                }
                return izsVar.invoke(aVar);
            case 2:
                fdi.D((View) obj3, HapticHelper.SUCCESS);
                ((wh50) obj).setValue(Boolean.TRUE);
                ((izs) obj2).invoke(o9t.e.b);
                return s3q0.a;
            case 3:
                Good good = (Good) obj3;
                a5u.a aVar3 = (a5u.a) obj2;
                cxo cxoVar = (cxo) obj;
                long j = good.b;
                long j2 = good.c.b;
                String str = good.d0;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = aVar3.c;
                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
                String str2 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null;
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(j2), null, str, null, 40, null);
                UiTrackingScreen b = UiTracker.j.b();
                SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, str2, new com.vk.stat.scheme.p(), 41), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b2, uzp0Var.a).q();
                me10.b((me10) cxoVar.a.t.getValue(), aVar3.f, aVar3.d, Long.valueOf(good.b), null, 8);
                return s3q0.a;
            case 4:
                hs50 hs50Var = (hs50) obj2;
                return new rf0((ViewGroup) obj3, (p20) obj, null, hs50Var.E, hs50Var.F);
            default:
                String str3 = (String) obj;
                cb50 cb50Var = ((qgp0) obj3).b;
                String valueOf = String.valueOf(((UserId) obj2).b);
                if (str3 == null) {
                    str3 = "-2147483648";
                }
                List<ic50> y = cb50Var.y(valueOf, str3);
                ArrayList arrayList = new ArrayList(c5g.u(y, 10));
                Iterator<T> it = y.iterator();
                while (it.hasNext()) {
                    arrayList.add(ic50.a.a((ic50) it.next()));
                }
                return arrayList;
        }
    }
}
