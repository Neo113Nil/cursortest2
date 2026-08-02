package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.media.player.PlayerError;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: VideoApiHelper.kt */
/* loaded from: classes17.dex */
public final class w1s0 implements w8i {
    public static final w1s0 b = new w1s0();
    public static final LinkedHashSet c = new LinkedHashSet();
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final uft0 e = new uft0();
    public static final bpn0 f = new bpn0(new vqf0(10));
    public static final bpn0 g = new bpn0(new zqf0(7));
    public static final bpn0 h = new bpn0(new z0h0(8));

    /* compiled from: VideoApiHelper.kt */
    public static final class a implements ows0 {
        @Override // xsna.ows0
        public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3() {
            return ((VideoMinimizablePlayerComponent) w1s0.g.getValue()).b3();
        }
    }

    static {
        new bpn0(new ko60(9));
    }

    public static final void a(VideoFile videoFile, izs izsVar) {
        if (videoFile.Q0() && videoFile.isEmpty() && !fxc0.B().c(videoFile)) {
            cvk.u(gpt0.n(PlayerError.ERROR_NOT_PROCESSED, false), false);
            return;
        }
        if (videoFile.s5() && !videoFile.isEmpty()) {
            cvk.u(gpt0.n(PlayerError.ERROR_NOT_CONVERTED, false), false);
            izsVar.invoke(videoFile);
        } else if (!videoFile.Z9() || (videoFile instanceof MusicVideoFile) || fxc0.B().c(videoFile)) {
            izsVar.invoke(videoFile);
        } else {
            cvk.u(gpt0.n(PlayerError.ERROR_CONTENT_RESTRICTED, false), false);
        }
    }

    public static final io.reactivex.rxjava3.disposables.c b(Context context, VideoFile videoFile, String str, String str2, wzs<? super VideoFile, ? super Throwable, s3q0> wzsVar) {
        if (!videoFile.j0() && !o25.a().a(videoFile.I0())) {
            String a1 = videoFile.a1();
            LinkedHashSet linkedHashSet = c;
            if (!linkedHashSet.contains(a1)) {
                linkedHashSet.add(videoFile.a1());
                ros rosVar = new ros(videoFile.I0(), videoFile.o0(), str, str2);
                String r = videoFile.r();
                if (!TextUtils.isEmpty(r)) {
                    rosVar.K("track_code", r);
                }
                return new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.y0(rosVar, null, null, 3).U(new si60(new ev60(17), 15)), new dx3(videoFile, 9)).subscribe(new vk40(new tv7(videoFile, wzsVar, context, 4), 29), new qg60(new erh(context, wzsVar, videoFile, 6), 21));
            }
        }
        return EmptyDisposable.INSTANCE;
    }

    public static final io.reactivex.rxjava3.disposables.c d(final VideoFile videoFile, final int i, final boolean z, final fzp fzpVar) {
        return videoFile.t0() ? rsg0.Z(yfb.x(tft0.m(new uft0(), videoFile.o0(), videoFile.I0(), videoFile.getTitle(), videoFile.j1(), null, null, Integer.valueOf(i), null, null, null, 523248))).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.s1s0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                boolean z2 = z;
                VideoFile videoFile2 = videoFile;
                if (z2) {
                    VideoFileOld copy = videoFile2.copy();
                    copy.A0 = SystemClock.elapsedRealtime();
                    int i2 = i;
                    copy.r = i2;
                    gpt0 gpt0Var = gpt0.a;
                    copy.q = gpt0.b(i2, videoFile2);
                    wjs0.a(new fyr0(copy));
                    if (i2 == 0) {
                        wjs0.a(uxr0.a);
                    }
                }
                izs izsVar = fzpVar;
                if (izsVar != null) {
                    izsVar.invoke(videoFile2);
                }
            }
        }, new ksb0(new jz30(16), 13)) : EmptyDisposable.INSTANCE;
    }

    public static final void e(Context context, VideoFile videoFile, String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        ((rtc0) h.getValue()).f(videoFile.Pa(), context, str, videoFile.r(), new l1k0(3, videoFile, gzsVar), new udl(1, gzsVar2));
    }

    public static v1s0 g(Context context, UserId userId, int i, String str, boolean z, boolean z2, boolean z3, izs izsVar, int i2) {
        boolean z4 = (i2 & 64) != 0 ? true : z2;
        boolean z5 = (i2 & 128) != 0 ? false : z3;
        bpn0 bpn0Var = f;
        io.reactivex.rxjava3.core.q m = hg1.m(z ? ((VideoApiHelperRepository) bpn0Var.getValue()).f(i, userId) : ((VideoApiHelperRepository) bpn0Var.getValue()).b(i, userId, str), context, 500L, false, 60);
        v1s0 v1s0Var = new v1s0(context, z5, z, userId, i, z4, izsVar);
        m.subscribe(v1s0Var);
        return v1s0Var;
    }

    public static final void h(VideoFile videoFile) {
        List singletonList = Collections.singletonList(videoFile.a1());
        e.getClass();
        tfx tfxVar = new tfx("video.removeViewingHistoryRecords", new hgj0(3), new bt(29));
        tfxVar.i("video_ids", singletonList);
        itg0.i(4, rsg0.y0(yfb.x(tfxVar), null, null, 3), null, new hfm0(videoFile, 11), new q520(27));
    }

    public static final io.reactivex.rxjava3.disposables.c i(Context context, VideoFile videoFile, UserId userId, wzs<? super VideoFile, ? super Throwable, s3q0> wzsVar) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U;
        if (videoFile.j0() || videoFile.g1() || (videoFile.C2() && videoFile.Q0())) {
            String a1 = videoFile.a1();
            LinkedHashSet linkedHashSet = d;
            if (!linkedHashSet.contains(a1)) {
                linkedHashSet.add(videoFile.a1());
                if (!fkq0.c(userId)) {
                    userId = o25.a().c();
                }
                if (videoFile.C2()) {
                    int o0 = videoFile.o0();
                    UserId I0 = videoFile.I0();
                    vfx vfxVar = new vfx("shortVideo.delete", new j8(25), new jh(23));
                    vfx.k(vfxVar, "video_id", o0, 0, 8);
                    vfx.l(vfxVar, "owner_id", I0, 12);
                    U = rsg0.y0(yfb.x(vfxVar), null, null, 3).U(new umq0(new kl60(24), 2));
                } else {
                    if (!fkq0.c(userId)) {
                        userId = o25.a().c();
                    }
                    sm4 sm4Var = new sm4(videoFile.o0(), videoFile.I0(), userId);
                    String r = videoFile.r();
                    if (!TextUtils.isEmpty(r)) {
                        sm4Var.K("track_code", r);
                    }
                    U = rsg0.y0(sm4Var, null, null, 3).U(new d4r0(new yaq0(3)));
                }
                return new io.reactivex.rxjava3.internal.operators.observable.a0(U, new w1j(videoFile, 3)).subscribe(new f2u(new p83(videoFile, wzsVar, context, 8), 27), new xj50(new dm(context, wzsVar, videoFile, 3), 23));
            }
        }
        wzsVar.invoke(videoFile, new Throwable("Unable to delete video"));
        return EmptyDisposable.INSTANCE;
    }

    public static void j(Context context, UserId userId, VideoFile videoFile, UserId userId2, int i, gzs gzsVar) {
        if (i > 0) {
            int o0 = videoFile.o0();
            qct0 qct0Var = new qct0("video.removeFromAlbum");
            qct0Var.F(userId, "owner_id");
            qct0Var.C(i, "album_id");
            qct0Var.D(userId2.b, "target_id");
            qct0Var.C(o0, "video_id");
            hg1.m(rsg0.y0(qct0Var, null, null, 3), context, 0L, false, 62).subscribe(new p9p0(new mvl0(gzsVar, 10), 3), new q440(new kdw(27), 26));
        }
    }

    public static final void k(u90 u90Var, VideoFile videoFile, boolean z) {
        nr4.b().g(u90Var, videoFile, z);
    }

    public static void l(ContextWrapper contextWrapper, VideoFile videoFile, String str, String str2, boolean z, int i) {
        boolean z2 = (i & 16) == 0;
        rsg0.y0(yfb.x(tft0.b(new uft0(), videoFile.I0(), videoFile.o0(), Boolean.valueOf(z2), str == null ? videoFile.r() : str, str2, 72)), null, null, 3).subscribe(new pd40(new t1s0(videoFile, z2, (i & 32) != 0 ? false : z, contextWrapper, new irt(26), str, str2), 18), new le50(new wx30(19), 22));
    }
}
