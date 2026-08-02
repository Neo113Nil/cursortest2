package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoOwner;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.gxp0;

/* compiled from: LiveItemViewHolder.kt */
/* loaded from: classes17.dex */
public final class mjz extends vfz<FeedItem.i> implements ent0, pi5, t1b0, e9d, z8e, gxp0.a {
    public final h3d l;
    public final wmf m;
    public final dyz0 n;
    public final defpackage.h o;
    public final gjz p;
    public FeedItem.i q;
    public final ph5 r;
    public final ph5 s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mjz(Context context, h3d h3dVar, wmf wmfVar, dyz0 dyz0Var, defpackage.h hVar) {
        super(r0);
        gjz gjzVar = new gjz(context, (gxp0) dyz0Var.b, (kxc) dyz0Var.a, fxc0.B().T().U(context));
        this.l = h3dVar;
        this.m = wmfVar;
        this.n = dyz0Var;
        this.o = hVar;
        this.p = gjzVar;
        gjzVar.setId(R.id.live_item_view);
        gjzVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ImageView closeView = gjzVar.getCloseView();
        if (closeView != null) {
            f4m.j(closeView);
        }
        ph5 ph5Var = new ph5(new ab("clip_live_vh" + hashCode(), gjzVar, this), this, new jy(gjzVar, 8));
        this.r = ph5Var;
        this.s = ph5Var;
    }

    @Override // xsna.e9d
    public final g64 D4() {
        return this.s;
    }

    @Override // xsna.z8e
    public final List<View> N0() {
        return EmptyList.b;
    }

    @Override // xsna.vfz
    public final void V5() {
        this.p.getPresenter().B0();
        ((gxp0) this.n.b).b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    @Override // xsna.vfz
    /* renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(FeedItem.i iVar) {
        UserProfile userProfile;
        Owner s;
        Group group;
        boolean f;
        Window window;
        nlh0 nlh0Var;
        SdkVideoFile sdkVideoFile;
        FeedItem.i iVar2 = iVar;
        boolean z = iVar2.h;
        SdkVideoFile sdkVideoFile2 = iVar2.d;
        VideoFile A = k15.A(sdkVideoFile2);
        Owner s2 = A.s();
        Window window2 = null;
        if (s2 != null) {
            if (!fkq0.d(s2.b)) {
                s2 = null;
            }
            if (s2 != null) {
                userProfile = new UserProfile(s2);
                s = A.s();
                if (s != null) {
                    if (!fkq0.b(s.b)) {
                        s = null;
                    }
                    if (s != null) {
                        group = new Group(s);
                        VideoOwner videoOwner = new VideoOwner(A, userProfile, group);
                        String r1 = sdkVideoFile2.r1();
                        FeedItem.i iVar3 = this.q;
                        f = epx.f(r1, (iVar3 != null || (sdkVideoFile = iVar3.d) == null) ? null : sdkVideoFile.r1());
                        gjz gjzVar = this.p;
                        if (f) {
                            this.q = iVar2;
                            gjzVar.getPresenter().e1(videoOwner);
                            gjzVar.A1(sdkVideoFile2, EmptyList.b);
                            gjzVar.getPresenter().C(Boolean.valueOf(z));
                            gjzVar.getPresenter().a();
                            return;
                        }
                        FeedItem.i iVar4 = this.q;
                        if (iVar4 != null && (nlh0Var = iVar4.e) != null) {
                            nlh0Var.a(gjzVar);
                        }
                        iVar2.e.b(gjzVar);
                        this.q = iVar2;
                        oiz Q = fxc0.B().T().Q(gjzVar);
                        gjzVar.setPresenter(Q);
                        Q.h2(iVar2.b);
                        Q.H(this.m);
                        Q.e2();
                        Q.T1();
                        Q.Y0();
                        Q.L();
                        Q.K0();
                        Q.J0(false);
                        Q.v0(fxc0.B().T().Z(gjzVar));
                        Q.e1(videoOwner);
                        Q.C(Boolean.valueOf(z));
                        Q.r2(Boolean.valueOf(!((Boolean) this.o.invoke()).booleanValue()));
                        try {
                            window = this.l.getWindow();
                        } catch (Throwable unused) {
                            window = null;
                        }
                        if (window == null) {
                            Activity b = enj.b(this.itemView);
                            if (b != null) {
                                window2 = b.getWindow();
                            }
                        } else {
                            window2 = window;
                        }
                        gjzVar.setWindow(window2);
                        gjzVar.A1(sdkVideoFile2, EmptyList.b);
                        return;
                    }
                }
                group = null;
                VideoOwner videoOwner2 = new VideoOwner(A, userProfile, group);
                String r12 = sdkVideoFile2.r1();
                FeedItem.i iVar32 = this.q;
                f = epx.f(r12, (iVar32 != null || (sdkVideoFile = iVar32.d) == null) ? null : sdkVideoFile.r1());
                gjz gjzVar2 = this.p;
                if (f) {
                }
            }
        }
        userProfile = null;
        s = A.s();
        if (s != null) {
        }
        group = null;
        VideoOwner videoOwner22 = new VideoOwner(A, userProfile, group);
        String r122 = sdkVideoFile2.r1();
        FeedItem.i iVar322 = this.q;
        f = epx.f(r122, (iVar322 != null || (sdkVideoFile = iVar322.d) == null) ? null : sdkVideoFile.r1());
        gjz gjzVar22 = this.p;
        if (f) {
        }
    }

    @Override // xsna.gxp0.a
    public final void X2(ixp0 ixp0Var) {
        this.p.g4(!ixp0Var.b, true);
    }

    @Override // xsna.vfz
    public final void a6() {
        ((gxp0) this.n.b).d(this);
        this.p.pause();
    }

    @Override // xsna.pi5
    public final oi5 e4() {
        FeedItem.i iVar = this.q;
        if (iVar != null) {
            return iVar.g;
        }
        return null;
    }

    @Override // xsna.vfz
    public final void g6() {
        oiz presenter = this.p.getPresenter();
        presenter.reset();
        presenter.release();
    }

    @Override // xsna.t1b0
    public final o0f getAttachedPlayer() {
        return this.r;
    }

    @Override // xsna.pi5
    public final kih0 j() {
        FeedItem.i iVar = this.q;
        if (iVar != null) {
            return iVar.f;
        }
        return null;
    }

    @Override // xsna.z8e
    public final List<View> q1() {
        gjz gjzVar = this.p;
        return rl3.I(new View[]{gjzVar.getPreviewImageView(), gjzVar.mo407getVideoView()});
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.p;
    }

    @Override // xsna.z8e
    public final List<View> w2() {
        return this.p.getFadeTransitionViews();
    }
}
