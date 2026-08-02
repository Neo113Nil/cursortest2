package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.toggle.Features;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: VideoPaginationDelegate.kt */
/* loaded from: classes4.dex */
public final class t1t0 extends td90 {
    public final ics0 i;
    public final com.vk.lists.c j;
    public final boolean k = true;
    public String l;
    public boolean m;
    public final s170 n;

    public t1t0(com.vk.lists.c cVar, ics0 ics0Var) {
        this.i = ics0Var;
        this.j = cVar;
        Features.Type type = Features.Type.VIDEO_COMMENT_TAB_INTEREST;
        type.getClass();
        this.l = com.vk.toggle.b.A.a(type) ? VideoGetCommentsExtendedSortDto.MOST_INTERESTING_COMMENTS_FIRST.i() : VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST.i();
        s170 s170Var = new s170();
        s170Var.g();
        this.n = s170Var;
    }

    @Override // xsna.td90, xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> Q1(String str) {
        this.l = str;
        return e();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> d() {
        if (this.f == 1) {
            return p0();
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 s = s(this.j.i(), 50, null);
        ow40 ow40Var = new ow40(new ape0(this, 29), 26);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return s.E(ow40Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> e() {
        this.f = 0;
        com.vk.lists.c cVar = this.j;
        cVar.r(true);
        cVar.q(0);
        return d();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.internal.operators.observable.b0 h(int i) {
        this.j.r(true);
        io.reactivex.rxjava3.internal.operators.observable.j1 s = s(-50, 100, Integer.valueOf(i));
        tmz tmzVar = new tmz(new cus0(this, 1), 25);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return s.E(tmzVar, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> l() {
        this.f = 1;
        this.n.e(0);
        this.j.r(false);
        return p0();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q n(io.reactivex.rxjava3.core.q qVar) {
        return this.j.g(qVar, true, false);
    }

    @Override // xsna.td90, xsna.sd90
    public final boolean p() {
        return this.k;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> p0() {
        if (this.m) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        this.m = true;
        return s(this.n.a(), 50, null).F(new hmq0(new q8i0(this, 24), 4));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 s(int i, int i2, Integer num) {
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto;
        int i3 = this.b;
        UserId userId = this.a;
        String str = this.c;
        VideoStatistic videoStatistic = this.g;
        VideoGetCommentsExtendedSortDto[] values = VideoGetCommentsExtendedSortDto.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                videoGetCommentsExtendedSortDto = null;
                break;
            }
            videoGetCommentsExtendedSortDto = values[i4];
            if (epx.f(videoGetCommentsExtendedSortDto.i(), this.l)) {
                break;
            }
            i4++;
        }
        return this.i.c(new owt(i3, userId, str, num, null, i2, Integer.valueOf(i), videoGetCommentsExtendedSortDto, videoStatistic, 48));
    }
}
