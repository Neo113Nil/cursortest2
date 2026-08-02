package xsna;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import xsna.o0r0;

/* compiled from: DetailsPresenter.kt */
/* loaded from: classes3.dex */
public final class t4m implements j4m {
    public final VideoFile b;
    public final oap<UserProfile, Group> c;
    public final k4m d;
    public Integer f;
    public CharSequence i;
    public final ArrayList e = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();

    /* JADX WARN: Multi-variable type inference failed */
    public t4m(VideoFile videoFile, oap<? extends UserProfile, ? extends Group> oapVar, k4m k4mVar) {
        String obj;
        this.b = videoFile;
        this.c = oapVar;
        this.d = k4mVar;
        String j1 = videoFile.j1();
        this.i = (j1 == null || (obj = drm0.p0(j1).toString()) == null) ? "" : obj;
    }

    @Override // xsna.j4m
    public final void S1(Context context) {
        xwk.e().m(context, this.b.I0(), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }

    @Override // xsna.j4m
    public final void j0(Context context) {
        fxc0.B().Y().t(context, this.b);
    }

    @Override // xsna.pk6
    public final void release() {
        this.h.e();
    }

    @Override // xsna.pk6
    public final void start() {
        LikesGetList.Type type = LikesGetList.Type.VIDEO;
        LikesGetList likesGetList = new LikesGetList(type, type, this.b.I0(), this.b.o0(), 2, LikesGetList.LikesOrder.ALL_USERS_FRIENDS_FIRST, e43.l("is_friend", "first_name_dat", "last_name_dat"));
        int i = 1;
        if (!o25.a().b()) {
            likesGetList.d = true;
            likesGetList.c = true;
        }
        io.reactivex.rxjava3.disposables.c subscribe = rsg0.y0(likesGetList, null, null, 3).D(new kl6(new s6k(this, i), 12)).subscribe(new y50(new zqh(this, 7), 19), new st0(new gt(17), 13));
        String j1 = this.b.j1();
        io.reactivex.rxjava3.internal.operators.single.y l = io.reactivex.rxjava3.core.x.k(j1 != null ? drm0.p0(j1).toString() : null).l(new p7(new qm0(17), 24));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.disposables.c subscribe2 = l.q(asu0.i()).m(asu0Var.d()).subscribe(new tf(new u6k(this, 2), 21), new ji3(new nvg(this, 12), 25));
        this.h.e();
        this.h.d(subscribe, subscribe2);
    }

    @Override // xsna.j4m
    public final void v() {
        rjz rjzVar;
        VideoFile videoFile = this.b;
        djz djzVar = new djz(videoFile.L8(), videoFile.B4(), this.i, videoFile.getTitle());
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            rjzVar = null;
        } else {
            ArrayList a = i7o0.a(arrayList);
            Integer num = this.f;
            rjzVar = new rjz(num != null ? num.intValue() : videoFile.l1(), a, i7o0.a(this.g));
        }
        this.d.h2(rl3.I(new hfz[]{djzVar, rjzVar, new giz(this.c)}), videoFile);
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }
}
