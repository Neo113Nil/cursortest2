package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import xsna.o0r0;

/* compiled from: EndPresenter.java */
/* loaded from: classes3.dex */
public final class wkp implements jkp {
    public final ymz b = ymz.c();
    public final VideoFile c;
    public final UserProfile d;
    public final Group e;
    public final kkp f;
    public niz g;
    public boolean h;
    public sk0 i;
    public nef0 j;
    public pmz k;
    public LiveStatNew l;
    public fjs0 m;

    public wkp(VideoFile videoFile, UserProfile userProfile, Group group, kkp kkpVar) {
        this.d = userProfile;
        this.e = group;
        this.c = videoFile;
        this.f = kkpVar;
    }

    @Override // xsna.jkp
    public final void C0() {
        Activity h = e3m.h(this.f.getViewContext());
        if (h != null) {
            fxc0.B().a0(h, UserId.d, null, null, "story_live_finished", com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.LIVE_CAROUSEL));
        }
    }

    @Override // xsna.jkp
    public final void c() {
        kbj0 b = nr4.b();
        Context viewContext = this.f.getViewContext();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        b.i(viewContext, this.c, false, false, Peer.Unknown.e, null);
    }

    @Override // xsna.pk6
    public final void release() {
        pmz pmzVar = this.k;
        if (pmzVar != null) {
            pmzVar.b.remove(this.j);
        }
    }

    @Override // xsna.pk6
    public final void start() {
        boolean b;
        VideoFile videoFile = this.c;
        ImageSize Cb = videoFile.e1().Cb(ImageScreenSize.SMALL.h(), true, false);
        String str = Cb == null ? null : Cb.d.d;
        boolean b2 = fkq0.b(videoFile.I0());
        ymz ymzVar = this.b;
        Group group = this.e;
        UserProfile userProfile = this.d;
        if (b2) {
            ymzVar.getClass();
            b = ymz.a(group);
            this.f.p(group.d, group.e, str, false, true);
        } else {
            ymzVar.getClass();
            b = ymz.b(userProfile);
            this.f.p(userProfile.e, userProfile.h, str, userProfile.K().booleanValue(), false);
        }
        kkp kkpVar = this.f;
        if (b) {
            sk0 sk0Var = new sk0(videoFile, userProfile, group);
            sk0Var.k = this.m;
            this.i = sk0Var;
            if (kkpVar.getAddButton() != null) {
                this.i.R1(kkpVar.getAddButton());
                kkpVar.getAddButton().setPresenter(this.i);
            }
            if (kkpVar.getImgAddButton() != null) {
                this.i.R1(kkpVar.getImgAddButton());
                kkpVar.getImgAddButton().setPresenter(this.i);
            }
            this.i.d();
        } else {
            if (kkpVar.getAddButton() != null) {
                kkpVar.getAddButton().setVisible(false);
            }
            if (kkpVar.getImgAddButton() != null) {
                kkpVar.getImgAddButton().setVisible(false);
            }
        }
        if (!this.h) {
            kkpVar.F1();
            return;
        }
        wcf0 recommendedView = kkpVar.getRecommendedView();
        if (recommendedView != null) {
            nef0 nef0Var = new nef0(videoFile, true, recommendedView);
            this.j = nef0Var;
            nef0Var.p = this.l;
            recommendedView.setPresenter(nef0Var);
            this.j.start();
            pmz pmzVar = this.k;
            if (pmzVar != null) {
                nef0 nef0Var2 = this.j;
                pmzVar.b.add(nef0Var2);
                ArrayList arrayList = pmzVar.v;
                if (arrayList == null || arrayList.size() <= 1) {
                    return;
                }
                pmzVar.Q(nef0Var2);
            }
        }
    }

    @Override // xsna.jkp
    public final void x() {
        VideoFile videoFile = this.c;
        if (videoFile != null) {
            xwk.e().m(this.f.getViewContext(), videoFile.I0(), new o0r0.a());
        }
    }

    @Override // xsna.jkp
    public final void x0() {
        this.g.t6();
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }
}
