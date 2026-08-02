package xsna;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.SocialButtonType;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import xsna.gd60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ttx implements gzs {
    public final /* synthetic */ utx b;
    public final /* synthetic */ View c;
    public final /* synthetic */ NewsEntry d;
    public final /* synthetic */ String e;

    public /* synthetic */ ttx(utx utxVar, View view, NewsEntry newsEntry, String str) {
        this.b = utxVar;
        this.c = view;
        this.d = newsEntry;
        this.e = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint = MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint.HEADER_FOLLOW_ALERT;
        utx utxVar = this.b;
        utxVar.getClass();
        NewsEntry newsEntry = this.d;
        EntryHeader d = na60.d(newsEntry);
        gd60 a = hd60.a();
        UserId l = sni.l(newsEntry);
        boolean q = sni.q(newsEntry);
        String str = newsEntry.Cb().b;
        boolean z = !sni.m(newsEntry).i(16);
        SocialButtonType socialButtonType = d != null ? d.i : null;
        ku1 ku1Var = new ku1(15, utxVar, newsEntry);
        gd60.a aVar = gd60.a;
        a.q1(this.c, l, q, this.e, str, z, ku1Var, socialButtonType);
        String str2 = com.vk.newsfeed.common.util.k.a;
        com.vk.newsfeed.common.util.k.n(newsEntry);
        utxVar.b(newsEntry, entryPoint);
        return s3q0.a;
    }
}
