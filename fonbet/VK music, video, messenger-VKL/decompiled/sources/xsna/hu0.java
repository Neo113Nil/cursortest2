package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.adsint.dto.AdsintEventDto;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeMrcViewPost;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityMrcUrl;
import com.vk.statistic.DeprecatedStatisticUrl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.xt0;

/* compiled from: AdsAnalyticsImpl.kt */
/* loaded from: classes14.dex */
public final class hu0 implements xt0 {
    public final zxc0 a;
    public final com.vk.movika.sdk.base.model.props.c b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;

    public hu0(int i) {
        zxc0 zxc0Var = new zxc0();
        com.vk.movika.sdk.base.model.props.c cVar = new com.vk.movika.sdk.base.model.props.c(2);
        this.a = zxc0Var;
        this.b = cVar;
        this.c = new bpn0(new com.vk.movika.sdk.base.model.props.d(1));
        this.d = new bpn0(new com.vk.movika.tools.controls.seekbar.n(1));
        this.e = new bpn0(new r(1));
        this.f = new bpn0(new gu0(0));
    }

    @Override // xsna.xt0
    public final void a(xt0.b bVar) {
        long j = bVar.a;
        int i = bVar.g;
        int i2 = bVar.b;
        long j2 = bVar.c;
        String str = bVar.h;
        long j3 = bVar.e;
        String valueOf = String.valueOf(j3);
        long j4 = bVar.f;
        String valueOf2 = String.valueOf(j4);
        if (str == null) {
            final MobileOfficialAppsFeedStat$TypeMrcViewPost mobileOfficialAppsFeedStat$TypeMrcViewPost = new MobileOfficialAppsFeedStat$TypeMrcViewPost(j2, i2, bVar.d);
            final String valueOf3 = String.valueOf(j);
            MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime mobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime = new MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime(Collections.singletonList(new Object(mobileOfficialAppsFeedStat$TypeMrcViewPost, valueOf3) { // from class: com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeMrcViewPostTime

                @pmi0("total_view_duration")
                private final String totalViewDuration;

                @pmi0("type_mrc_view_post")
                private final MobileOfficialAppsFeedStat$TypeMrcViewPost typeMrcViewPost;

                {
                    this.typeMrcViewPost = mobileOfficialAppsFeedStat$TypeMrcViewPost;
                    this.totalViewDuration = valueOf3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof MobileOfficialAppsFeedStat$TypeMrcViewPostTime)) {
                        return false;
                    }
                    MobileOfficialAppsFeedStat$TypeMrcViewPostTime mobileOfficialAppsFeedStat$TypeMrcViewPostTime = (MobileOfficialAppsFeedStat$TypeMrcViewPostTime) obj;
                    return epx.f(this.typeMrcViewPost, mobileOfficialAppsFeedStat$TypeMrcViewPostTime.typeMrcViewPost) && epx.f(this.totalViewDuration, mobileOfficialAppsFeedStat$TypeMrcViewPostTime.totalViewDuration);
                }

                public final int hashCode() {
                    return this.totalViewDuration.hashCode() + (this.typeMrcViewPost.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("TypeMrcViewPostTime(typeMrcViewPost=");
                    sb.append(this.typeMrcViewPost);
                    sb.append(", totalViewDuration=");
                    return ho8.a(sb, this.totalViewDuration, ')');
                }
            }));
            UiTracker uiTracker = UiTracker.a;
            new bvt0(UiTracker.c(), SchemeStat$TypeView.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, null, null, null, null, null, 62, null), valueOf, valueOf2, Integer.valueOf(i), mobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime)).q();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append('_');
        sb.append(i2);
        String sb2 = sb.toString();
        d(new xt0.a(AdsintEventTypeDto.MRC_VIEW_POST_TIME, str, sb2, i < 0 ? xt0.c.b.a : new xt0.c.a(i), String.valueOf(j3), String.valueOf(j4), String.valueOf(j)));
    }

    @Override // xsna.xt0
    public final void b(DeprecatedStatisticInterface deprecatedStatisticInterface) {
        Iterator<DeprecatedStatisticUrl> it = deprecatedStatisticInterface.R6("viewin").iterator();
        while (it.hasNext()) {
            com.vkontakte.android.data.b.p(it.next());
        }
    }

    @Override // xsna.xt0
    public final void c(DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl) {
        com.vkontakte.android.data.b.p(deprecatedStatisticPlayheadViewabilityMrcUrl);
    }

    @Override // xsna.xt0
    public final void clearData() {
        ((ConcurrentHashMap) this.c.getValue()).clear();
    }

    @Override // xsna.xt0
    public final void d(xt0.a aVar) {
        List list;
        AdsintEventTypeDto adsintEventTypeDto = aVar.a;
        String str = aVar.c;
        AdsintEventTypeDto adsintEventTypeDto2 = (AdsintEventTypeDto) ((Map) this.e.getValue()).get(adsintEventTypeDto);
        bpn0 bpn0Var = this.c;
        if (adsintEventTypeDto2 != null && ((list = (List) ((ConcurrentHashMap) bpn0Var.getValue()).get(str)) == null || !list.contains(adsintEventTypeDto2))) {
            return;
        }
        Iterator it = ((Set) this.f.getValue()).iterator();
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            AdsintEventTypeDto adsintEventTypeDto3 = (AdsintEventTypeDto) pair.i();
            AdsintEventTypeDto adsintEventTypeDto4 = (AdsintEventTypeDto) pair.j();
            if (adsintEventTypeDto == adsintEventTypeDto3) {
                List list2 = (List) ((ConcurrentHashMap) bpn0Var.getValue()).get(str);
                z = list2 != null && list2.contains(adsintEventTypeDto4);
                if (z) {
                    e(str);
                } else {
                    ((HashSet) ((ConcurrentHashMap) kg30.a.getValue()).computeIfAbsent(str, new e86(new gky(7), 1))).add(aVar);
                }
            } else if (adsintEventTypeDto == adsintEventTypeDto4) {
                f(aVar);
                e(str);
                z = false;
                break;
            }
        }
        if (z) {
            f(aVar);
        }
    }

    public final void e(String str) {
        Set set = (Set) ((ConcurrentHashMap) kg30.a.getValue()).get(str);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                f((xt0.a) it.next());
            }
        }
        HashSet hashSet = (HashSet) ((ConcurrentHashMap) kg30.a.getValue()).get(str);
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    public final void f(xt0.a aVar) {
        long micros = TimeUnit.MILLISECONDS.toMicros(((Number) this.b.invoke()).longValue());
        String str = aVar.e;
        if (str == null) {
            str = String.valueOf(micros);
        }
        String str2 = str;
        String str3 = aVar.f;
        if (str3 == null) {
            str3 = String.valueOf(micros);
        }
        String str4 = str3;
        xt0.c cVar = aVar.d;
        int i = 0;
        rsg0.y0(yfb.x(zxc0.a(this.a, null, Collections.singletonList(new AdsintEventDto(aVar.a, (String) this.d.getValue(), null, null, aVar.b, str2, str4, aVar.g, cVar instanceof xt0.c.a ? Integer.valueOf(((xt0.c.a) cVar).a) : null, null, IronSourceError.ERROR_PLACEMENT_CAPPED, null)), 1)), null, null, 3).subscribe(new eu0(new du0(i, this, aVar), i), new fu0(new pt(2), 0));
    }
}
