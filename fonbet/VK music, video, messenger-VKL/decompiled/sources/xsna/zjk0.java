package xsna;

import android.content.Context;
import androidx.annotation.Nullable;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveSpectators;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import xsna.wjk0;

/* compiled from: SpectatorsPresenter.java */
/* loaded from: classes3.dex */
public final class zjk0 implements vjk0 {
    public final VideoFile b;
    public final wjk0 c;
    public final boolean d;
    public LiveStatNew e;

    @Nullable
    public vq6 f;

    @Nullable
    public k7y g;

    @Nullable
    public final gzs<s3q0> h;

    @Nullable
    public dlz i;

    public zjk0(VideoFile videoFile, @Nullable UserProfile userProfile, @Nullable Group group, boolean z, wjk0 wjk0Var, @Nullable ecm ecmVar) {
        boolean z2;
        String str;
        String str2;
        VerifyInfo verifyInfo;
        String str3;
        String str4;
        this.b = videoFile;
        this.d = z;
        this.c = wjk0Var;
        this.h = ecmVar;
        if (group != null) {
            VerifyInfo verifyInfo2 = group.y;
            str3 = group.d;
            str4 = group.e;
            boolean z3 = group.n0;
            if (verifyInfo2.Cb()) {
                verifyInfo = verifyInfo2;
                z2 = z3;
                str2 = str4;
                str = str3;
            } else {
                z2 = z3;
                verifyInfo = null;
                str2 = str4;
                str = str3;
            }
        } else if (userProfile != null) {
            VerifyInfo verifyInfo3 = userProfile.B;
            str3 = userProfile.e;
            str4 = userProfile.h;
            z2 = userProfile.Y;
            if (verifyInfo3.Cb()) {
                verifyInfo = verifyInfo3;
                str2 = str4;
                str = str3;
            }
            verifyInfo = null;
            str2 = str4;
            str = str3;
        } else {
            z2 = false;
            str = null;
            str2 = null;
            verifyInfo = null;
        }
        wjk0Var.setUser(new wjk0.a(str, videoFile.getTitle(), videoFile.j1(), str2, z2, verifyInfo));
        if (!z) {
            wjk0Var.X();
        } else {
            wjk0Var.v2(videoFile.A7(), videoFile.aa());
        }
    }

    @Override // xsna.vjk0
    public final boolean G() {
        return !this.d;
    }

    @Override // xsna.vjk0
    public final void U() {
        if (this.f == null) {
            if (this.d) {
                return;
            }
            x();
        } else {
            LiveStatNew liveStatNew = this.e;
            if (liveStatNew != null) {
                liveStatNew.e(this.b.I0());
            }
            this.f.invoke();
        }
    }

    @Override // xsna.vjk0
    public final void a0() {
        ydt0 Y = fxc0.B().Y();
        Context viewContext = this.c.getViewContext();
        VideoFile videoFile = this.b;
        Y.w(videoFile.o0(), viewContext, videoFile.I0());
    }

    public final void d(@Nullable vq6 vq6Var, @Nullable k7y k7yVar) {
        this.f = vq6Var;
        this.g = k7yVar;
    }

    @Override // xsna.vjk0
    public final void f() {
        if (this.f == null) {
            if (this.d) {
                return;
            }
            x();
        } else {
            LiveStatNew liveStatNew = this.e;
            if (liveStatNew != null) {
                liveStatNew.e(this.b.I0());
            }
            this.f.invoke();
        }
    }

    @Override // xsna.vjk0
    public final void l() {
        k7y k7yVar = this.g;
        if (k7yVar != null) {
            k7yVar.invoke();
        }
    }

    @Override // xsna.pk6
    public final void start() {
        throw null;
    }

    public final void t(LiveSpectators liveSpectators) {
        int i = liveSpectators.c;
        if (i == 2 || i == 5) {
            boolean z = this.d;
            wjk0 wjk0Var = this.c;
            if (z) {
                wjk0Var.v2(liveSpectators.e, this.b.aa());
            }
            wjk0Var.setCurrentViewers(liveSpectators.d);
        }
    }

    @Override // xsna.vjk0
    public final void x() {
        dlz dlzVar = this.i;
        if (dlzVar != null) {
            dlzVar.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT);
        }
        LiveStatNew liveStatNew = this.e;
        if (liveStatNew != null) {
            liveStatNew.e(this.b.I0());
        }
        gzs<s3q0> gzsVar = this.h;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        fxc0.B().Y().x(this.c.getViewContext(), this.b, null, null, null);
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void release() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }
}
