package xsna;

import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutNavgo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.lwv;
import xsna.mwv;
import xsna.tyv;

/* compiled from: ImChannelNavGoAnalytics.kt */
/* loaded from: classes5.dex */
public final class syv extends cxv<tyv> implements lwv.b {
    public static final a b = new a();

    /* compiled from: ImChannelNavGoAnalytics.kt */
    public static final class a implements lwv.a {
        @Override // xsna.lwv.a
        public final boolean a(mwv.a aVar) {
            return aVar instanceof tyv;
        }
    }

    @Override // xsna.lwv.b
    public final boolean b(mwv.a aVar) {
        if (!(aVar instanceof tyv)) {
            return false;
        }
        a((tyv) aVar);
        return true;
    }

    @Override // xsna.mwv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(tyv tyvVar) {
        SchemeStat$TypeNavgo a2;
        if (!(tyvVar instanceof tyv.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair = new Pair(new SchemeStat$EventItem(SchemeStat$EventItem.Type.EVENT, null, Long.valueOf(((tyv.a) tyvVar).a), null, null, null, 58, null), new CommonCommunitiesStat$TypeDonutNavgo(CommonCommunitiesStat$TypeDonutNavgo.EventType.OPEN_DONATION_CREATION, null, null, 6, null));
        SchemeStat$EventItem schemeStat$EventItem = (SchemeStat$EventItem) pair.d();
        CommonCommunitiesStat$TypeDonutNavgo commonCommunitiesStat$TypeDonutNavgo = (CommonCommunitiesStat$TypeDonutNavgo) pair.g();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNEL;
        a2 = SchemeStat$TypeNavgo.a.a(SchemeStat$TypeNavgo.Subtype.GO, MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE, "", null, schemeStat$EventItem, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null, commonCommunitiesStat$TypeDonutNavgo);
        vk6<SchemeStat$TypeNavgo> vk6Var = this.a;
        vk6Var.f = mobileOfficialAppsCoreNavStat$EventScreen;
        vk6Var.g = a2;
        vk6Var.q();
    }
}
