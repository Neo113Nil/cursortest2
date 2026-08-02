package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedRequestContext;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded;
import xsna.ak90;
import xsna.jzf0;

/* compiled from: FeedApiTimelineLoadingBuilderFace.kt */
/* loaded from: classes4.dex */
public final class bwq extends kx6 implements awq {
    public awq g;

    public /* synthetic */ bwq() {
        this(null);
    }

    @Override // xsna.awq
    public final NewsEntry a(String str, izs<? super ak90, ? extends NewsEntry> izsVar) {
        NewsEntry a = this.g.a(str, izsVar);
        return a == null ? izsVar.invoke(ak90.a.a.getSTUB()) : a;
    }

    @Override // xsna.awq
    public final void b(int i, String str) {
        this.g.b(i, str);
    }

    @Override // xsna.awq
    public final void c() {
        this.g.c();
    }

    @Override // xsna.awq
    public final void d() {
        onRequestSent();
        this.g.d();
    }

    @Override // xsna.awq
    public final void e() {
        this.g.e();
    }

    @Override // xsna.awq
    public final <R> R f(NewsEntry newsEntry, izs<? super jzf0, ? extends R> izsVar) {
        R r = (R) this.g.f(newsEntry, izsVar);
        return r == null ? izsVar.invoke(jzf0.a.a.getSTUB()) : r;
    }

    @Override // xsna.awq
    public final void g() {
        this.g.g();
    }

    @Override // xsna.awq
    public final void h() {
        this.g.h();
    }

    @Override // xsna.awq
    public final void i() {
        this.g.i();
    }

    @Override // xsna.awq
    public final void j(Throwable th) {
        this.g.j(th);
    }

    @Override // xsna.awq
    public final void k(int i, MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason reason) {
        this.g.k(i, reason);
    }

    @Override // xsna.awq
    public final void l(int i, boolean z) {
        this.g.l(i, z);
    }

    @Override // xsna.awq
    public final void m(NewsEntry newsEntry) {
        this.g.m(newsEntry);
    }

    @Override // xsna.awq
    public final void n(boolean z, boolean z2, boolean z3) {
        this.g.n(z, z2, z3);
    }

    @Override // xsna.awq
    public final void o(Throwable th) {
        this.g.o(th);
    }

    @Override // xsna.awq
    public final boolean onRequestSent() {
        return this.g.onRequestSent();
    }

    public final void u(awq awqVar) {
        this.g.h();
        this.g = awqVar;
    }

    public bwq(MobileOfficialAppsFeedStat$FeedRequestContext mobileOfficialAppsFeedStat$FeedRequestContext) {
        this.g = mobileOfficialAppsFeedStat$FeedRequestContext != null ? new iwq(mobileOfficialAppsFeedStat$FeedRequestContext) : new zvq();
    }
}
