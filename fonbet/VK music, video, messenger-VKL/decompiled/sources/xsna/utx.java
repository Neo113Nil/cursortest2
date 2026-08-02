package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.user.SocialButtonType;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.ActionButtonType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import kotlin.NoWhenBranchMatchedException;
import xsna.gd60;
import xsna.h7u0;
import xsna.yo60;

/* compiled from: ItemActionSideEffectHandler.kt */
/* loaded from: classes4.dex */
public final class utx {
    public final FullSourceJoinApi.EntryServiceType a;
    public final bpn0 b = new bpn0(new sv0(21));

    public utx(FullSourceJoinApi.EntryServiceType entryServiceType) {
        this.a = entryServiceType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        if ((r8 != null ? r8.i(512) : false) != false) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(yo60.a aVar) {
        SocialButtonType socialButtonType;
        boolean z;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        if (aVar instanceof yo60.a.C4113a) {
            yo60.a.C4113a c4113a = (yo60.a.C4113a) aVar;
            NewsEntry newsEntry = c4113a.b;
            EntryHeader d = na60.d(newsEntry);
            gd60 a = hd60.a();
            View view = c4113a.a;
            UserId l = sni.l(newsEntry);
            boolean q = sni.q(newsEntry);
            String str = c4113a.c;
            String str2 = newsEntry.Cb().b;
            boolean z2 = !sni.m(newsEntry).i(16);
            SocialButtonType socialButtonType2 = d != null ? d.i : null;
            ku1 ku1Var = new ku1(15, this, newsEntry);
            gd60.a aVar2 = gd60.a;
            a.q1(view, l, q, str, str2, z2, ku1Var, socialButtonType2);
            com.vk.newsfeed.common.util.k.n(newsEntry);
            b(newsEntry, c4113a.d);
            return;
        }
        if (aVar instanceof yo60.a.c) {
            yo60.a.c cVar = (yo60.a.c) aVar;
            NewsEntry newsEntry2 = cVar.b;
            EntryHeader d2 = na60.d(newsEntry2);
            String str3 = com.vk.newsfeed.common.util.k.a;
            com.vk.newsfeed.common.util.k.n(newsEntry2);
            b(newsEntry2, cVar.d);
            long j = cVar.e == ActionButtonType.SUBSCRIBE_TEXT_WITH_BG ? 1000L : 300L;
            gd60 a2 = hd60.a();
            Context context = cVar.a;
            UserId l2 = sni.l(newsEntry2);
            boolean q2 = sni.q(newsEntry2);
            String str4 = cVar.c;
            String str5 = newsEntry2.Cb().b;
            boolean z3 = !sni.m(newsEntry2).i(16);
            UiTracker uiTracker = UiTracker.a;
            String name = UiTracker.c().name();
            UiTrackingScreen b = UiTracker.j.b();
            String name2 = (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) ? null : mobileOfficialAppsCoreNavStat$EventScreen.name();
            String Db = newsEntry2.Db();
            String Db2 = newsEntry2.Db();
            FullSourceJoinApi.EntryServiceType entryServiceType = this.a;
            String i = entryServiceType != null ? entryServiceType.i() : null;
            a2.e(j, context, l2, d2 != null ? d2.i : null, (r29 & 64) != 0 ? null : new FullSourceJoinApi(cqm0.m(name), name2 != null ? cqm0.m(name2) : null, Db != null ? cqm0.m(Db) : null, Db2 != null ? cqm0.m(Db2) : null, i != null ? cqm0.m(i) : null, null), str4, str5, (r29 & 128) != 0 ? null : null, (r29 & 256) != 0 ? null : null, q2, z3);
            return;
        }
        if (!(aVar instanceof yo60.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        yo60.a.b bVar = (yo60.a.b) aVar;
        View view2 = bVar.a;
        Context context2 = bVar.b;
        NewsEntry newsEntry3 = bVar.c;
        String str6 = bVar.d;
        l490 l490Var = newsEntry3 instanceof l490 ? (l490) newsEntry3 : null;
        Owner s = l490Var != null ? l490Var.s() : null;
        EntryHeader d3 = na60.d(newsEntry3);
        if (d3 == null || (socialButtonType = d3.i) == null) {
            socialButtonType = s != null ? s.s : null;
        }
        String str7 = s != null ? s.j : null;
        if (socialButtonType != SocialButtonType.ADD) {
            z = false;
        }
        z = true;
        boolean b2 = fkq0.b(sni.l(newsEntry3));
        ttx ttxVar = new ttx(this, view2, newsEntry3, str6);
        String string = (b2 || !z) ? (b2 || z) ? context2.getString(R.string.subscribe_confirmation_dialog_title_group_subscribe) : (str7 == null || !(drm0.N(str7) ^ true)) ? context2.getString(R.string.subscribe_confirmation_dialog_title_subscribe) : context2.getString(R.string.subscribe_confirmation_dialog_title_subscribe_with_name, str7) : (str7 == null || !(drm0.N(str7) ^ true)) ? context2.getString(R.string.subscribe_confirmation_dialog_title_add_to_friends) : context2.getString(R.string.subscribe_confirmation_dialog_title_add_to_friends_with_name, str7);
        int i2 = (b2 || !z) ? R.string.modal_dialog_option_subscribe : R.string.subscribe_confirmation_dialog_option_add_to_friends;
        int i3 = h7u0.p;
        h7u0.a c = h7u0.b.c(context2);
        c.h0(string);
        c.c0(i2, new rm1(ttxVar, 2));
        c.W(R.string.cancel, new o1c());
        c.m();
        b(newsEntry3, bVar.e);
    }

    public final void b(NewsEntry newsEntry, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint) {
        Long l;
        VideoFile videoFile;
        String str;
        Long l2;
        VideoFile videoFile2;
        boolean q = sni.q(newsEntry);
        bpn0 bpn0Var = this.b;
        long j = 0;
        if (q) {
            p2r p2rVar = (p2r) bpn0Var.getValue();
            if (newsEntry instanceof Post) {
                l2 = Long.valueOf(((Post) newsEntry).n);
            } else if (newsEntry instanceof PromoPost) {
                l2 = Long.valueOf(((PromoPost) newsEntry).n.n);
            } else if (newsEntry instanceof Photos) {
                l2 = Long.valueOf(((Photos) newsEntry).m);
            } else if (newsEntry instanceof Videos) {
                VideoAttachment Nb = ((Videos) newsEntry).Nb();
                if (Nb != null && (videoFile2 = Nb.k) != null) {
                    j = videoFile2.o0();
                }
                l2 = Long.valueOf(j);
            } else {
                l2 = null;
            }
            Long valueOf = Long.valueOf(k9q0.o(newsEntry).b);
            String str2 = newsEntry.Cb().b;
            str = str2 != null ? str2 : "";
            p2rVar.getClass();
            p2r.g(l2, valueOf, str, entryPoint, null);
            return;
        }
        p2r p2rVar2 = (p2r) bpn0Var.getValue();
        if (newsEntry instanceof Post) {
            l = Long.valueOf(((Post) newsEntry).n);
        } else if (newsEntry instanceof PromoPost) {
            l = Long.valueOf(((PromoPost) newsEntry).n.n);
        } else if (newsEntry instanceof Photos) {
            l = Long.valueOf(((Photos) newsEntry).m);
        } else if (newsEntry instanceof Videos) {
            VideoAttachment Nb2 = ((Videos) newsEntry).Nb();
            if (Nb2 != null && (videoFile = Nb2.k) != null) {
                j = videoFile.o0();
            }
            l = Long.valueOf(j);
        } else {
            l = null;
        }
        Long valueOf2 = Long.valueOf(k9q0.o(newsEntry).b);
        String str3 = newsEntry.Cb().b;
        str = str3 != null ? str3 : "";
        p2rVar2.getClass();
        p2r.b(l, valueOf2, str, entryPoint, null);
    }
}
