package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: EndBroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class yjp implements wjp {
    public final VideoFile c;
    public final Group d;
    public final xjp e;
    public final Set<UserProfile> f;
    public final liz g;
    public final List<UserProfile> i;
    public final int j;
    public qh8 k;
    public final int l;
    public final anz b = fxc0.B().T();
    public a h = null;

    /* compiled from: EndBroadcastPresenter.java */
    public class a extends io.reactivex.rxjava3.observers.a<Boolean> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            cvk.u(R.string.live_broadcast_video_deleted, false);
            yjp yjpVar = yjp.this;
            yjpVar.h = null;
            liz lizVar = yjpVar.g;
            if (lizVar != null) {
                lizVar.F();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            cvk.u(R.string.live_broadcast_video_deleted_error, false);
            yjp.this.h = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    public yjp(VideoFile videoFile, Group group, Set set, liz lizVar, int i, ArrayList arrayList, int i2, int i3, xjp xjpVar) {
        this.d = group;
        this.c = videoFile;
        this.f = set;
        this.i = arrayList;
        this.j = i2;
        this.l = i3;
        this.e = xjpVar;
        this.g = lizVar;
    }

    @Override // xsna.wjp
    public final void F() {
        liz lizVar = this.g;
        if (lizVar != null) {
            lizVar.F();
        }
    }

    @Override // xsna.wjp
    public final void Z1() {
        VideoFile videoFile = this.c;
        io.reactivex.rxjava3.core.q<Boolean> A = this.b.A(videoFile.o0(), videoFile.I0());
        a aVar = new a();
        A.subscribe(aVar);
        this.h = aVar;
    }

    @Override // xsna.wjp
    public final void h0() {
        boolean t = fxc0.B().T().t();
        boolean y = fxc0.B().T().y();
        int i = 1;
        Group group = this.d;
        if (group != null) {
            t = t && group.E;
        }
        VideoFile videoFile = this.c;
        io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(this.b.Y(videoFile.o0(), videoFile.I0()), new uq(12));
        UserId I0 = videoFile.I0();
        fs fsVar = new fs("wall.delete");
        fsVar.F(I0, "owner_id");
        int i2 = this.l;
        fsVar.C(i2, "post_id");
        io.reactivex.rxjava3.internal.operators.observable.p1 p1Var2 = new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.T(fsVar), new uq(12));
        UiTracker uiTracker = UiTracker.a;
        String d = UiTracker.d();
        UserId I02 = videoFile.I0();
        int o0 = videoFile.o0();
        if20 if20Var = new if20("wall.post", 1);
        if20Var.F(I02, "owner_id");
        if20Var.K("attachments", "video" + I02.b + BundleUtil.UNDERLINE_TAG + o0);
        if (d.equals(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE))) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Posting entryPoint screen is not set for UiTracker"));
        } else {
            if20Var.K("entry_point", d);
        }
        io.reactivex.rxjava3.internal.operators.observable.p1 p1Var3 = new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.T(if20Var), new vq(14));
        if (t && y) {
            if (i2 > 0) {
                p1Var.subscribe(new zjp(this));
                return;
            } else {
                io.reactivex.rxjava3.core.q.I0(p1Var3, p1Var, new wq(15)).subscribe(new akp(this));
                return;
            }
        }
        if (t) {
            if (i2 > 0) {
                io.reactivex.rxjava3.core.q.I0(p1Var2, p1Var, new xq(14)).subscribe(new bkp(this));
                return;
            } else {
                p1Var.subscribe(new ckp(this));
                return;
            }
        }
        if (y) {
            if (i2 <= 0) {
                p1Var3.subscribe(new dkp(this));
            }
        } else {
            if (i2 > 0) {
                p1Var2.subscribe(new rh8(this, i));
            }
            cvk.u(R.string.live_story_end_published_video, false);
        }
    }

    @Override // xsna.wjp
    public final void k0() {
        String string;
        String string2;
        boolean t = fxc0.B().T().t();
        boolean y = fxc0.B().T().y();
        Group group = this.d;
        if (group != null) {
            t = t && group.E;
        }
        xjp xjpVar = this.e;
        if (t && y) {
            string = xjpVar.getViewContext().getString(R.string.live_story_end_publish_settings_story) + ", " + xjpVar.getViewContext().getString(R.string.live_story_end_publish_settings_wall).toLowerCase();
            string2 = xjpVar.getViewContext().getString(R.string.live_story_end_share_video);
        } else if (t) {
            string = xjpVar.getViewContext().getString(R.string.live_story_end_publish_settings_story);
            string2 = xjpVar.getViewContext().getString(R.string.live_story_end_share_video);
        } else if (y) {
            string = xjpVar.getViewContext().getString(R.string.live_story_end_publish_settings_wall);
            string2 = xjpVar.getViewContext().getString(R.string.live_story_end_share_video);
        } else {
            string = xjpVar.getViewContext().getString(R.string.live_story_end_publish_settings_no);
            string2 = group != null ? xjpVar.getViewContext().getString(R.string.live_story_end_share_video_community) : xjpVar.getViewContext().getString(R.string.live_story_end_share_video_my);
        }
        xjpVar.setPublishButtonText(string2);
        xjpVar.setPublishSettings(string);
    }

    @Override // xsna.wjp
    public final void q() {
        qh8 qh8Var = this.k;
        if (qh8Var != null) {
            qh8Var.q();
        }
    }

    @Override // xsna.wjp
    public final void r1() {
        fxc0.B().Y().k(this.e.getViewContext(), this.c, null, null, null, null, false, new ob(this, 24), null, null, true, false, false, false, -1L, null, null, false, null);
    }

    @Override // xsna.pk6
    public final void release() {
        hg1.f(this.h);
    }

    @Override // xsna.pk6
    public final void start() {
        xjp xjpVar = this.e;
        List<UserProfile> list = this.i;
        if (list == null || list.size() <= 0) {
            Set<UserProfile> set = this.f;
            if (set != null) {
                set.size();
                xjpVar.getClass();
            } else {
                new HashSet();
                xjpVar.getClass();
            }
        } else {
            new HashSet(list);
            xjpVar.getClass();
        }
        int i = this.j;
        xjpVar.setOpenButtonVisibility(i > 3);
        xjpVar.setPublishButtonVisibility(i > 3);
        xjpVar.setDeleteButtonVisibility(i > 0);
        xjpVar.setPublishSettingsVisibility(i > 3);
        k0();
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }
}
