package xsna;

import com.vk.api.generated.likes.dto.LikesGetListExtendedFilterDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFriendsOnlyDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: ClipsSortPaginationDelegate.kt */
/* loaded from: classes4.dex */
public final class s4f extends td90 implements ldp0 {
    public final com.vk.lists.c i;
    public final fae j;
    public String k;
    public final s170 l;
    public boolean m;
    public boolean n;

    public s4f(com.vk.lists.c cVar, fae faeVar) {
        this.i = cVar;
        this.j = faeVar;
        s170 s170Var = new s170();
        s170Var.g();
        this.l = s170Var;
        this.n = true;
    }

    @Override // xsna.td90, xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> Q1(String str) {
        this.k = str;
        return e();
    }

    @Override // xsna.td90, xsna.sd90
    public final int b() {
        String str = this.k;
        if (epx.f(str, VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST.i())) {
            this.f = 0;
        } else if (epx.f(str, VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST.i())) {
            this.f = 1;
        } else if (epx.f(str, VideoGetCommentsExtendedSortDto.MOST_INTERESTING_COMMENTS_FIRST.i())) {
            this.f = 0;
        }
        return this.f;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> d() {
        if (this.f == 1) {
            return p0();
        }
        boolean z = this.n;
        com.vk.lists.c cVar = this.i;
        boolean z2 = z && cVar.t > 0;
        this.n = false;
        int i = cVar.i();
        io.reactivex.rxjava3.internal.operators.observable.m1 s = s(i, 50, null, i == 0);
        if (z2) {
            s = t(s);
        }
        fu0 fu0Var = new fu0(new fre(this, 5), 13);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return s.E(fu0Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> e() {
        this.f = 0;
        com.vk.lists.c cVar = this.i;
        cVar.r(true);
        cVar.q(0);
        return d();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.internal.operators.observable.b0 h(int i) {
        this.i.r(true);
        io.reactivex.rxjava3.internal.operators.observable.m1 s = s(-50, 100, Integer.valueOf(i), true);
        ho1 ho1Var = new ho1(new oce(this, 2), 12);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return s.E(ho1Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> l() {
        this.f = 1;
        this.l.e(0);
        this.i.r(false);
        return p0();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q n(io.reactivex.rxjava3.core.q qVar) {
        return this.i.g(qVar, true, false);
    }

    @Override // xsna.td90, xsna.sd90
    public final boolean p() {
        return this.f != 0;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> p0() {
        if (this.m) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        boolean z = this.n && this.i.t > 0;
        this.n = false;
        this.m = true;
        int a = this.l.a();
        boolean z2 = a == 0;
        io.reactivex.rxjava3.internal.operators.observable.m1 s = s(a, 50, null, z2);
        if (z) {
            s = t(s);
        }
        zva zvaVar = new zva(this, 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(s.E(lVar, lVar, kVar, zvaVar), lVar, new psb(this, 2)).E(new bg1(new f58(z2, this, 2), 16), lVar, kVar, kVar).F(new hz(new ire(this, 1), 18));
    }

    @Override // xsna.ldp0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 q(int i) {
        this.i.r(true);
        io.reactivex.rxjava3.internal.operators.observable.m1 s = s(0, 50, Integer.valueOf(i), true);
        io1 io1Var = new io1(new ul1(this, 27), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return s.E(io1Var, lVar, kVar, kVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 s(int i, int i2, Integer num, boolean z) {
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto;
        uft0 uft0Var = new uft0();
        int i3 = this.b;
        UserId userId = this.a;
        String str = this.c;
        List l = e43.l("photo_base", "verified", "image_status", "is_nft", "is_nft_photo", "oauth_verification", "is_verified", "is_esia_verified", "is_tinkoff_verified", "video_files", "first_name_dat", "last_name_dat", "followers_count", "members_count");
        String str2 = this.k;
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto2 = VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST;
        if (!epx.f(str2, videoGetCommentsExtendedSortDto2.i())) {
            videoGetCommentsExtendedSortDto2 = VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST;
            if (!epx.f(str2, videoGetCommentsExtendedSortDto2.i())) {
                videoGetCommentsExtendedSortDto2 = VideoGetCommentsExtendedSortDto.MOST_INTERESTING_COMMENTS_FIRST;
                if (!epx.f(str2, videoGetCommentsExtendedSortDto2.i())) {
                    videoGetCommentsExtendedSortDto = null;
                    Boolean valueOf = Boolean.valueOf(z);
                    Integer valueOf2 = Integer.valueOf(i);
                    Integer valueOf3 = Integer.valueOf(i2);
                    Boolean bool = Boolean.TRUE;
                    dz2 x = yfb.x(tft0.C(uft0Var, i3, userId, str, valueOf, num, valueOf2, valueOf3, videoGetCommentsExtendedSortDto, l, bool, null, 2, 10496));
                    ahn.D(x);
                    io.reactivex.rxjava3.internal.operators.observable.l2 l0 = rsg0.l0(x, null, 3);
                    dz2 x2 = yfb.x(k0x.f(new k0x(4), "video", this.a, Integer.valueOf(this.b), LikesGetListExtendedFilterDto.LIKES, LikesGetListExtendedFriendsOnlyDto.TYPE_3, 2, bool, Collections.singletonList("photo_base"), 584));
                    ahn.D(x2);
                    return io.reactivex.rxjava3.core.q.I0(l0, rsg0.l0(x2, new la2(13), 1), new v20(r4f.b, 14)).U(new yi2(new zt4(this, 18), 10)).a0(asu0.a.d());
                }
            }
        }
        videoGetCommentsExtendedSortDto = videoGetCommentsExtendedSortDto2;
        Boolean valueOf4 = Boolean.valueOf(z);
        Integer valueOf22 = Integer.valueOf(i);
        Integer valueOf32 = Integer.valueOf(i2);
        Boolean bool2 = Boolean.TRUE;
        dz2 x3 = yfb.x(tft0.C(uft0Var, i3, userId, str, valueOf4, num, valueOf22, valueOf32, videoGetCommentsExtendedSortDto, l, bool2, null, 2, 10496));
        ahn.D(x3);
        io.reactivex.rxjava3.internal.operators.observable.l2 l02 = rsg0.l0(x3, null, 3);
        dz2 x22 = yfb.x(k0x.f(new k0x(4), "video", this.a, Integer.valueOf(this.b), LikesGetListExtendedFilterDto.LIKES, LikesGetListExtendedFriendsOnlyDto.TYPE_3, 2, bool2, Collections.singletonList("photo_base"), 584));
        ahn.D(x22);
        return io.reactivex.rxjava3.core.q.I0(l02, rsg0.l0(x22, new la2(13), 1), new v20(r4f.b, 14)).U(new yi2(new zt4(this, 18), 10)).a0(asu0.a.d());
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 t(io.reactivex.rxjava3.internal.operators.observable.m1 m1Var) {
        return io.reactivex.rxjava3.core.q.I0(m1Var, io.reactivex.rxjava3.core.q.R(this.i.t, TimeUnit.MILLISECONDS), new lq(11, new com.vk.movika.tools.controls.seekbar.o(3))).a0(asu0.a.d());
    }
}
