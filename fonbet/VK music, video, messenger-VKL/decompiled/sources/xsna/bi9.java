package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.mj9;

/* compiled from: CameraDownloadDelegate.kt */
/* loaded from: classes16.dex */
public final class bi9 {
    public final com.vk.cameraui.impl.a a;
    public final CameraUIView b;
    public boolean d;
    public boolean g;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 e = new bpn0(new f4(3));
    public final bpn0 f = new bpn0(new com.vk.movika.sdk.base.model.props.c(7));

    /* compiled from: CameraDownloadDelegate.kt */
    public static final class a implements izs {
        public final /* synthetic */ StoryMusicInfo c;

        public a(StoryMusicInfo storyMusicInfo) {
            this.c = storyMusicInfo;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke(Object obj) {
            float f;
            mj9 mj9Var = (mj9) obj;
            boolean z = mj9Var instanceof mj9.a;
            File file = null;
            if (z) {
                mj9.a aVar = (mj9.a) mj9Var;
                if (aVar.a.d()) {
                    f = aVar.a.b;
                    bi9 bi9Var = bi9.this;
                    if (file != null) {
                        bi9Var.d = false;
                        StoryMusicInfo storyMusicInfo = this.c;
                        bi9Var.f(storyMusicInfo, storyMusicInfo.c, file);
                    } else {
                        bi9Var.b.setShutterLoadingProgress(f);
                    }
                    return s3q0.a;
                }
            }
            if (!(mj9Var instanceof mj9.b)) {
                if (z) {
                    mj9.a aVar2 = (mj9.a) mj9Var;
                    if (aVar2.a.c()) {
                        file = aVar2.a.c;
                    }
                }
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                bi9 bi9Var2 = bi9.this;
                if (file != null) {
                }
                return s3q0.a;
            }
            file = ((mj9.b) mj9Var).a;
            f = 1.0f;
            bi9 bi9Var22 = bi9.this;
            if (file != null) {
            }
            return s3q0.a;
        }
    }

    /* compiled from: CameraDownloadDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            i0q0.f(new zh9(0, ((bi9) this.receiver).b, cm9.class, "finishClipsContentLoading", "finishClipsContentLoading(Z)V", 0));
            return s3q0.a;
        }
    }

    public bi9(com.vk.cameraui.impl.a aVar, CameraUIView cameraUIView) {
        this.a = aVar;
        this.b = cameraUIView;
    }

    public final void a(StoryMusicInfo storyMusicInfo, ta40 ta40Var) {
        io.reactivex.rxjava3.core.q T;
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        bVar.e();
        this.d = true;
        i0q0.i(0L, new yh9(this.b, 0));
        MusicTrack musicTrack = storyMusicInfo.b;
        if (storyMusicInfo.k) {
            String str = storyMusicInfo.g;
            T = str != null ? io.reactivex.rxjava3.core.q.T(new mj9.b(new File(str))) : io.reactivex.rxjava3.core.q.H(new RuntimeException("StoryMusicInfo has null localFilePath"));
        } else {
            T = (ta40Var != null ? io.reactivex.rxjava3.core.q.T(ta40Var) : g(musicTrack.Fb()).w()).L(new o7(new com.vk.im.engine.commands.messages.a(2, this, musicTrack), 7), false);
        }
        asu0.a.getClass();
        bVar.b(T.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new h60(new a(storyMusicInfo), 8), new xf1(new gb(4, this, storyMusicInfo), 6)));
    }

    public final io.reactivex.rxjava3.core.q<mj9> b(MusicTrack musicTrack, String str) {
        PrivateFiles.a b2;
        PrivateFiles.a b3;
        PrivateFiles.a b4;
        String Fb = musicTrack.Fb();
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.MUSIC_STICKER;
        b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
        File file = new File(b2.a, Fb);
        try {
            if (file.exists()) {
                if (file.length() > 0) {
                    String Fb2 = musicTrack.Fb();
                    b4 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
                    return io.reactivex.rxjava3.core.q.T(new mj9.b(new File(b4.a, Fb2)));
                }
            }
        } catch (SecurityException unused) {
        }
        i0q0.i(0L, new yh9(this.b, 0));
        String Fb3 = musicTrack.Fb();
        b3 = e8r.a.b(r2, PrivateSubdir.MUSIC_STICKER.h(), true);
        return dug0.a(new File(b3.a, Fb3), str).U(new rt0(new x50(5), 6));
    }

    public final void c(StoryMusicInfo storyMusicInfo, Throwable th) {
        Object obj;
        StickersDrawingViewGroup stickersDrawingViewGroup;
        CameraUIView cameraUIView = this.b;
        i0q0.f(new ai9(0, cameraUIView, cm9.class, "finishShutterLoading", "finishShutterLoading()V", 0));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        cameraUIView.t0(j03.g(context, th, R.string.error));
        com.vk.cameraui.impl.a aVar = this.a;
        if (storyMusicInfo == null) {
            aVar.Q();
            return;
        }
        MusicTrack musicTrack = storyMusicInfo.b;
        UserId userId = musicTrack.c;
        int i = musicTrack.b;
        aVar.Q();
        CameraUIView cameraUIView2 = aVar.b;
        Iterator<nov> it = cameraUIView2.getStickersState().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            nov novVar = (nov) obj;
            if (novVar instanceof sov) {
                sov sovVar = (sov) novVar;
                if (epx.f(sovVar.getInfo().b.c, userId) && sovVar.getInfo().b.b == i) {
                    break;
                }
            }
        }
        sov sovVar2 = obj instanceof sov ? (sov) obj : null;
        if (sovVar2 == null || (stickersDrawingViewGroup = cameraUIView2.p) == null) {
            return;
        }
        stickersDrawingViewGroup.t(sovVar2);
    }

    public final boolean d(StoryCameraMode storyCameraMode) {
        an9 an9Var = this.a.i;
        boolean z = storyCameraMode == StoryCameraMode.CLIPS;
        if (z && (this.d || an9Var.X)) {
            if (!an9Var.X) {
                this.b.t0(y8g0.e(R.string.story_camera_message_wait_audio));
                return true;
            }
        } else if (z || !this.d) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.vk.dto.music.StoryMusicInfo] */
    public final void e(ClipVideoFile clipVideoFile, File file) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        MusicTrack musicTrack = clipVideoFile.D1;
        if (musicTrack != null) {
            ref$ObjectRef.element = new StoryMusicInfo(musicTrack, "", 0, 0, 0, null, false, 0, true, false, null, false, false, 7904, null);
        }
        asu0.a.getClass();
        asu0.h().execute(new xh9(0, clipVideoFile, this, file, ref$ObjectRef));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    public final void f(StoryMusicInfo storyMusicInfo, String str, File file) {
        h7m0 h7m0Var;
        CameraUIView cameraUIView = this.b;
        i0q0.f(new ai9(0, cameraUIView, cm9.class, "finishShutterLoading", "finishShutterLoading()V", 0));
        MusicTrack musicTrack = storyMusicInfo.b;
        UserId userId = musicTrack.c;
        int i = musicTrack.b;
        com.vk.cameraui.impl.a aVar = this.a;
        if (!aVar.c4().i()) {
            Iterator<nov> it = aVar.b.getStickersState().a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    h7m0Var = null;
                    break;
                }
                h7m0Var = it.next();
                nov novVar = (nov) h7m0Var;
                if (novVar instanceof h7m0) {
                    h7m0 h7m0Var2 = (h7m0) novVar;
                    if (epx.f(h7m0Var2.getInfo().b.c, userId) && h7m0Var2.getInfo().b.b == i) {
                        break;
                    }
                }
            }
            h7m0 h7m0Var3 = h7m0Var instanceof h7m0 ? h7m0Var : null;
            if (h7m0Var3 != null) {
                h7m0Var3.setInfo(StoryMusicInfo.zb(h7m0Var3.getInfo(), str, 0, 0, file.getAbsolutePath(), 0, 8157));
            }
            cameraUIView.n0(file, storyMusicInfo.d);
        }
        rgd rgdVar = aVar.p0.z;
        String absolutePath = file.getAbsolutePath();
        ClipsEditorMusicInfo clipsEditorMusicInfo = rgdVar.c;
        rgdVar.c = clipsEditorMusicInfo != null ? ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, null, str, 0, 0, 0, absolutePath, 0, 2013) : null;
        aVar.W0();
        cameraUIView.n0(file, storyMusicInfo.d);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y g(String str) {
        return rsg0.w0(yfb.x(((mgj0) this.e.getValue()).t(str))).l(new aa6(new g60(this, 15), 2));
    }
}
