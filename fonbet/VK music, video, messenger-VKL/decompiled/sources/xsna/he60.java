package xsna;

import com.vk.coowners.presentation.util.PostInfoData;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.user.SocialButtonType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.ee60;
import xsna.je60;
import xsna.le60;

/* compiled from: NewsfeedCoownersListFeature.kt */
/* loaded from: classes17.dex */
public final class he60 extends wk50<oe60, me60, ee60, je60> {
    public final p2r f;
    public final f4z g;

    public he60(ee60.b bVar, ke60 ke60Var, p2r p2rVar) {
        super(bVar, ke60Var);
        this.f = p2rVar;
        this.g = new f4z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(me60 me60Var, ee60 ee60Var) {
        me60 me60Var2 = me60Var;
        ee60 ee60Var2 = ee60Var;
        PostInfoData postInfoData = me60Var2.b;
        NewsfeedCoowners newsfeedCoowners = me60Var2.c;
        if (ee60Var2 instanceof ee60.b) {
            T(new je60.a(((ee60.b) ee60Var2).b));
            return;
        }
        boolean z = ee60Var2 instanceof ee60.a.C2799a;
        p2r p2rVar = this.f;
        if (z) {
            UserId userId = ((ee60.a.C2799a) ee60Var2).b;
            Long l = postInfoData.e;
            String str = postInfoData.d;
            Long l2 = postInfoData.c;
            Long l3 = postInfoData.b;
            if (l == null) {
                boolean b = fkq0.b(userId);
                long j = userId.b;
                if (b) {
                    Long valueOf = Long.valueOf(j);
                    MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint = MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.COOWNER_MODAL_CARD;
                    p2rVar.getClass();
                    p2r.c(l3, l2, valueOf, str, entryPoint);
                    return;
                }
                Long valueOf2 = Long.valueOf(j);
                MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint2 = MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.COOWNER_MODAL_CARD;
                p2rVar.getClass();
                p2r.f(l3, l2, valueOf2, str, entryPoint2);
                return;
            }
            boolean b2 = fkq0.b(userId);
            long j2 = userId.b;
            if (b2) {
                Long l4 = postInfoData.e;
                Long l5 = postInfoData.f;
                String str2 = postInfoData.g;
                MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint3 = MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.COOWNER_MODAL_CARD;
                r6 = l3 != null ? Integer.valueOf((int) l3.longValue()) : null;
                Long valueOf3 = Long.valueOf(j2);
                p2rVar.getClass();
                p2r.d(l4, l5, str2, entryPoint3, r6, valueOf3);
                return;
            }
            Long l6 = postInfoData.e;
            Long l7 = postInfoData.f;
            String str3 = postInfoData.g;
            MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint4 = MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.COOWNER_MODAL_CARD;
            r6 = l3 != null ? Integer.valueOf((int) l3.longValue()) : null;
            Long valueOf4 = Long.valueOf(j2);
            p2rVar.getClass();
            p2r.e(l6, l7, str3, entryPoint4, r6, valueOf4);
            return;
        }
        if (ee60Var2 instanceof ee60.c) {
            UserId userId2 = ((ee60.c) ee60Var2).b;
            Iterator<T> it = newsfeedCoowners.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((NewsfeedCoowners.CoownerStatus) next).b.b, userId2)) {
                    r6 = next;
                    break;
                }
            }
            NewsfeedCoowners.CoownerStatus coownerStatus = (NewsfeedCoowners.CoownerStatus) r6;
            if (coownerStatus == null) {
                return;
            }
            boolean z2 = coownerStatus.e;
            long j3 = userId2.b;
            if (z2) {
                Long l8 = postInfoData.b;
                Long l9 = postInfoData.c;
                String str4 = postInfoData.d;
                MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint5 = MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint.HEADER_FOLLOW_TEXT;
                Long valueOf5 = Long.valueOf(j3);
                p2rVar.getClass();
                p2r.g(l8, l9, str4, entryPoint5, valueOf5);
            } else {
                Long l10 = postInfoData.b;
                Long l11 = postInfoData.c;
                String str5 = postInfoData.d;
                MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint6 = MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint.HEADER_FOLLOW_TEXT;
                Long valueOf6 = Long.valueOf(j3);
                p2rVar.getClass();
                p2r.b(l10, l11, str5, entryPoint6, valueOf6);
            }
            this.g.b(new le60.b(userId2, coownerStatus.e, fkq0.d(coownerStatus.b.b) ? SocialButtonType.ADD : SocialButtonType.FOLLOW, postInfoData.d));
            return;
        }
        if (ee60Var2 instanceof ee60.d) {
            Iterator<T> it2 = newsfeedCoowners.f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((NewsfeedCoowners.CoownerStatus) next2).b.b.b == ((ee60.d) ee60Var2).b) {
                    r6 = next2;
                    break;
                }
            }
            NewsfeedCoowners.CoownerStatus coownerStatus2 = (NewsfeedCoowners.CoownerStatus) r6;
            if (coownerStatus2 != null) {
                coownerStatus2.e = true;
            }
            if (coownerStatus2 != null) {
                coownerStatus2.b.g(4, true);
            }
            T(new je60.a(newsfeedCoowners));
            return;
        }
        if (!(ee60Var2 instanceof ee60.e)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it3 = newsfeedCoowners.f.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (((NewsfeedCoowners.CoownerStatus) next3).b.b.b == ((ee60.e) ee60Var2).b) {
                r6 = next3;
                break;
            }
        }
        NewsfeedCoowners.CoownerStatus coownerStatus3 = (NewsfeedCoowners.CoownerStatus) r6;
        if (coownerStatus3 != null) {
            coownerStatus3.e = false;
        }
        if (coownerStatus3 != null) {
            coownerStatus3.b.g(4, false);
        }
        T(new je60.a(newsfeedCoowners));
    }
}
