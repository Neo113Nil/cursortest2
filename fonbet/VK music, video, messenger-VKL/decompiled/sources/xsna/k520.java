package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;
import one.video.player.model.FrameSize;
import xsna.lwt;

/* compiled from: MenuButtonPresenter.java */
/* loaded from: classes3.dex */
public final class k520 implements g520, ebs0 {
    public final VideoFile d;
    public final UserProfile e;
    public final Group f;
    public final UserProfile g;
    public final h520 h;
    public final yg5 i;
    public final kz20 j;

    @Nullable
    public final FragmentActivity k;
    public boolean l;
    public boolean m;
    public io.reactivex.rxjava3.observers.a p;
    public d q;
    public final boolean r;
    public LiveStatNew s;
    public niz t;
    public dlz u;

    @Nullable
    public com.vk.video.ui.share.api.b v;
    public final anz b = fxc0.B().T();
    public final ymz c = ymz.c();
    public boolean n = false;
    public boolean o = false;

    /* compiled from: MenuButtonPresenter.java */
    public class a extends io.reactivex.rxjava3.observers.a<Integer> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            k520 k520Var = k520.this;
            cvk.w(k520Var.h.getViewContext().getResources().getString(R.string.live_video_add_ok, k520Var.d.getTitle()), false);
            k520Var.p = null;
            LiveStatNew liveStatNew = k520Var.s;
            if (liveStatNew != null) {
                Bundle bundle = new Bundle();
                bundle.putString("action_type", "add_to_my_videos");
                liveStatNew.b(bundle);
                qyk0.a().e("live_action", bundle);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            vhk0.e().a(th);
            k520.this.p = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            k520.this.n = true;
        }
    }

    /* compiled from: MenuButtonPresenter.java */
    public class b extends io.reactivex.rxjava3.observers.a<Boolean> {
        public b() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            k520 k520Var = k520.this;
            cvk.w(k520Var.h.getViewContext().getResources().getString(R.string.live_video_remove_ok, k520Var.d.getTitle()), false);
            k520Var.p = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            vhk0.e().a(th);
            k520.this.p = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            k520.this.n = false;
        }
    }

    /* compiled from: MenuButtonPresenter.java */
    public class c extends io.reactivex.rxjava3.observers.a<Boolean> {
        public final /* synthetic */ boolean c;

        public c(boolean z) {
            this.c = z;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            k520 k520Var = k520.this;
            VideoFile videoFile = k520Var.d;
            h520 h520Var = k520Var.h;
            UserProfile userProfile = k520Var.e;
            Group group = k520Var.f;
            boolean z = this.c;
            if (group != null) {
                cvk.w(h520Var.getViewContext().getResources().getString(z ? R.string.live_video_block_notifications_ok_community : R.string.live_video_unblock_notifications_ok_community, fkq0.d(videoFile.I0()) ? userProfile.e : group.d), false);
            } else if (userProfile != null) {
                cvk.w(h520Var.getViewContext().getResources().getString(z ? R.string.live_video_block_notifications_ok_user : R.string.live_video_unblock_notifications_ok_user, fkq0.d(videoFile.I0()) ? userProfile.e : group.d), false);
            }
            k520Var.p = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            vhk0.e().a(th);
            k520.this.p = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            k520 k520Var = k520.this;
            Group group = k520Var.f;
            boolean z = this.c;
            if (group != null) {
                group.D = z;
                return;
            }
            UserProfile userProfile = k520Var.e;
            if (userProfile != null) {
                userProfile.w = z;
            }
        }
    }

    /* compiled from: MenuButtonPresenter.java */
    public class e implements io.reactivex.rxjava3.functions.c<Boolean, lwt.a, Object> {
        public e() {
        }

        @Override // io.reactivex.rxjava3.functions.c
        public final Object apply(Boolean bool, lwt.a aVar) throws Throwable {
            lwt.a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            k520 k520Var = k520.this;
            k520Var.n = booleanValue;
            k520Var.o = false;
            k520.u2(k520Var, aVar2.b);
            if (!k520Var.o) {
                k520.u2(k520Var, aVar2.a);
            }
            return new Object();
        }
    }

    /* compiled from: MenuButtonPresenter.java */
    public class f extends io.reactivex.rxjava3.observers.a<Boolean> {
        public f() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            k520 k520Var = k520.this;
            Resources resources = k520Var.h.getViewContext().getResources();
            VideoFile videoFile = k520Var.d;
            cvk.w(resources.getString(fkq0.d(videoFile.I0()) ? R.string.live_user_has_been_hidden : R.string.live_community_has_been_hidden, fkq0.d(videoFile.I0()) ? k520Var.e.e : k520Var.f.d), false);
            k520Var.p = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            vhk0.e().a(th);
            k520.this.p = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: MenuButtonPresenter.java */
    public class g extends io.reactivex.rxjava3.observers.a<Boolean> {
        public g() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            k520 k520Var = k520.this;
            Resources resources = k520Var.h.getViewContext().getResources();
            VideoFile videoFile = k520Var.d;
            cvk.w(resources.getString(fkq0.d(videoFile.I0()) ? R.string.live_user_has_been_unhidden : R.string.live_community_has_been_unhidden, fkq0.d(videoFile.I0()) ? k520Var.e.e : k520Var.f.d), false);
            k520Var.p = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            vhk0.e().a(th);
            k520.this.p = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    public k520(VideoFile videoFile, UserProfile userProfile, Group group, UserProfile userProfile2, h520 h520Var) {
        this.g = userProfile2;
        this.e = userProfile;
        this.f = group;
        this.d = videoFile;
        this.h = h520Var;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        a2.getClass();
        this.i = a2.e(videoFile, null);
        this.r = userProfile2.c == videoFile.I0();
        this.j = new kz20(this);
        Activity h = e3m.h(h520Var.getViewContext());
        this.k = h instanceof FragmentActivity ? (FragmentActivity) h : null;
    }

    public static void u2(k520 k520Var, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((UserProfile) it.next()).c == k520Var.d.I0()) {
                k520Var.o = true;
                return;
            }
        }
    }

    @Override // xsna.g520
    public final boolean F0() {
        Group group = this.f;
        if (group != null) {
            return group.D;
        }
        UserProfile userProfile = this.e;
        if (userProfile != null) {
            return userProfile.w;
        }
        return false;
    }

    @Override // xsna.g520
    public final boolean J() {
        return this.r;
    }

    @Override // xsna.g520
    public final boolean J1() {
        ymz ymzVar = this.c;
        UserProfile userProfile = this.e;
        if (userProfile != null) {
            ymzVar.getClass();
            return ymz.b(userProfile);
        }
        Group group = this.f;
        if (group == null) {
            return true;
        }
        ymzVar.getClass();
        return ymz.a(group);
    }

    @Override // xsna.g520
    public final void K1() {
        yg5 yg5Var = this.i;
        d3b0 v0 = yg5Var.v0();
        if (v0 == null || v0.a() == null || this.k == null) {
            return;
        }
        List<one.video.player.tracks.c> k0 = v0.a().k0();
        final ArrayList arrayList = new ArrayList();
        k0.forEach(new Consumer() { // from class: xsna.j520
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add(((cms0) ((one.video.player.tracks.c) obj).c).b());
            }
        });
        sht0 j = v0.a().j();
        VideoFile videoFile = this.d;
        List a2 = bat0.a(videoFile, arrayList, j);
        int g0 = yg5Var.g0();
        LinkedHashMap a3 = videoFile.w4().a();
        kz20 kz20Var = this.j;
        dat0 dat0Var = new dat0(this.k, v0, kz20Var.i, kz20Var.e, g0, a2, a3);
        kz20Var.a = new WeakReference<>(dat0Var);
        dat0Var.c();
    }

    @Override // xsna.g520
    public final void L1() {
        fxc0.B().d0(this.h.getViewContext(), new b5h(this, 29));
    }

    @Override // xsna.g520
    public final void N1() {
        io.reactivex.rxjava3.observers.a aVar = this.p;
        if (aVar != null) {
            aVar.dispose();
            this.p = null;
        }
        io.reactivex.rxjava3.core.q<Boolean> R = this.b.R(this.d.I0());
        f fVar = new f();
        R.subscribe(fVar);
        this.p = fVar;
    }

    @Override // xsna.g520
    public final void P() {
        io.reactivex.rxjava3.observers.a aVar = this.p;
        if (aVar != null) {
            aVar.dispose();
            this.p = null;
        }
        dlz dlzVar = this.u;
        if (dlzVar != null) {
            dlzVar.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME_OUT);
        }
        VideoFile videoFile = this.d;
        io.reactivex.rxjava3.core.q a2 = this.b.a(videoFile.o0(), videoFile.I0());
        a aVar2 = new a();
        a2.subscribe(aVar2);
        this.p = aVar2;
    }

    @Override // xsna.g520
    public final boolean U0() {
        return this.l;
    }

    @Override // xsna.g520
    public final void X() {
        d dVar = this.q;
        if (dVar != null) {
            dVar.dispose();
            this.q = null;
        }
        if (!o25.a().b()) {
            this.h.M0();
            return;
        }
        UserId userId = this.g.c;
        VideoFile videoFile = this.d;
        io.reactivex.rxjava3.core.q I0 = io.reactivex.rxjava3.core.q.I0(this.b.H(videoFile.o0(), userId, videoFile.I0()), rsg0.y0(new lwt("video.liveGetBanned"), null, null, 3), new e());
        d dVar2 = new d();
        I0.subscribe(dVar2);
        this.q = dVar2;
    }

    @Override // xsna.g520
    public final boolean X0() {
        return this.d.ra().contains("vksport.vkvideo");
    }

    @Override // xsna.g520
    public final void X1() {
        FragmentActivity fragmentActivity = this.k;
        if (fragmentActivity != null) {
            dhr0.a.getClass();
            VKTheme u = dhr0.u();
            kz20 kz20Var = this.j;
            kz20Var.getClass();
            s0n s0nVar = new s0n(fragmentActivity, R.string.video_media_license_title, R.string.video_media_license_sport_text, u);
            kz20Var.a = new WeakReference<>(s0nVar);
            s0nVar.c();
        }
    }

    @Override // xsna.g520
    public final void Z() {
        dlz dlzVar = this.u;
        if (dlzVar != null) {
            dlzVar.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT);
        }
        h520 h520Var = this.h;
        mhy.b(h520Var.getViewContext());
        if (!o25.a().b()) {
            nr4.b().y(h520Var.getViewContext(), fss0.a(this.d));
            return;
        }
        kbj0 b2 = nr4.b();
        Context viewContext = h520Var.getViewContext();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        b2.i(viewContext, this.d, false, false, Peer.Unknown.e, null);
    }

    @Override // xsna.g520
    public final void a1() {
        io.reactivex.rxjava3.observers.a aVar = this.p;
        if (aVar != null) {
            aVar.dispose();
            this.p = null;
        }
        dlz dlzVar = this.u;
        if (dlzVar != null) {
            dlzVar.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME_OUT);
        }
        VideoFile videoFile = this.d;
        io.reactivex.rxjava3.core.q<Boolean> P = this.b.P(videoFile.o0(), videoFile.I0(), this.g.c);
        b bVar = new b();
        P.subscribe(bVar);
        this.p = bVar;
    }

    @Override // xsna.ebs0
    public final void bk(@NonNull dbs0 dbs0Var) {
        if (dbs0Var instanceof cat0) {
            int i = ((cat0) dbs0Var).b;
            yg5 yg5Var = this.i;
            if (yg5Var.v0() != null && i != yg5Var.g0() && i != -1) {
                yg5Var.Z(i);
            }
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_OTHER_QUALITY_STICKING_FIX;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                if ((i != 144 ? i != 240 ? i != 360 ? i != 480 ? i != 720 ? i != 1080 ? i != 1440 ? i != 2160 ? i != 4320 ? null : FrameSize._4320p : FrameSize._2160p : FrameSize._1440p : FrameSize._1080p : FrameSize._720p : FrameSize._480p : FrameSize._360p : FrameSize._240p : FrameSize._144p) != null) {
                    fxc0.B().w(i);
                } else {
                    fxc0.B().h0(QualitySettingsType.AUTO);
                }
            }
        }
    }

    @Override // xsna.g520
    public final boolean d0() {
        return this.o;
    }

    @Override // xsna.g520
    public final void d2() {
        io.reactivex.rxjava3.observers.a aVar = this.p;
        if (aVar != null) {
            aVar.dispose();
            this.p = null;
        }
        io.reactivex.rxjava3.core.q<Boolean> G = this.b.G(this.d.I0());
        g gVar = new g();
        G.subscribe(gVar);
        this.p = gVar;
    }

    @Override // xsna.g520
    public final void f1(boolean z) {
        io.reactivex.rxjava3.observers.a aVar = this.p;
        if (aVar != null) {
            aVar.dispose();
            this.p = null;
        }
        io.reactivex.rxjava3.core.q<Boolean> d2 = this.b.d(this.d.I0(), z);
        c cVar = new c(z);
        d2.subscribe(cVar);
        this.p = cVar;
    }

    @Override // xsna.g520
    public final boolean h1() {
        return this.n;
    }

    @Override // xsna.g520
    public final VideoFile k() {
        return this.d;
    }

    @Override // xsna.g520
    public final void s() {
        niz nizVar = this.t;
        if (nizVar != null) {
            nizVar.delete();
        }
    }

    @Override // xsna.g520
    public final void s1() {
        com.vk.video.ui.share.api.b bVar;
        dlz dlzVar = this.u;
        if (dlzVar != null) {
            dlzVar.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK_OUT);
        }
        LiveStatNew liveStatNew = this.s;
        if (liveStatNew != null) {
            Bundle bundle = new Bundle();
            bundle.putString("action_type", "copy_broadcast_link");
            liveStatNew.b(bundle);
            qyk0.a().e("live_action", bundle);
        }
        String a2 = fss0.a(this.d);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures) && (bVar = this.v) != null) {
            a2 = bVar.c(a2);
        }
        ((ClipboardManager) this.h.getViewContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", a2));
        cvk.u(R.string.link_copied, false);
    }

    @Override // xsna.pk6
    public final void start() {
        throw null;
    }

    @Override // xsna.g520
    public final boolean u() {
        return fxc0.B().u();
    }

    @Override // xsna.g520
    public final boolean w() {
        return this.m;
    }

    @Override // xsna.g520
    public final boolean z1() {
        return this.d.Fa();
    }

    /* compiled from: MenuButtonPresenter.java */
    public class d extends io.reactivex.rxjava3.observers.a<Object> {
        public d() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            k520.this.h.M0();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
        }
    }
}
