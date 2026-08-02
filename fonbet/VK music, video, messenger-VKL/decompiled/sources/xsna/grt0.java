package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;
import androidx.media3.datasource.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.media.player.video.VideoSourceType;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.mediastore.storage.MediaStorage;
import com.vk.toggle.features.StoriesFeatures;
import java.io.File;
import kotlin.text.Regex;
import xsna.nov;

/* compiled from: VideoViewSticker.kt */
/* loaded from: classes6.dex */
public abstract class grt0 extends nxt0 implements oit0, vov {
    public final f0j0 f;
    public final SimpleVideoView.k g;
    public l7s0 h;
    public String i;
    public boolean j;
    public ryc k;
    public final VKImageView l;
    public final boolean m;
    public a n;
    public Bitmap o;
    public Bitmap p;
    public int q;
    public final SimpleVideoView r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    /* compiled from: VideoViewSticker.kt */
    public static final class a {
        public String a;
        public final String b;
        public boolean c;
        public int d;
        public int e;
        public final boolean f;
        public final long g;

        public a(int i, int i2, boolean z, boolean z2, String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = i2;
            this.f = z2;
            this.g = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return Long.hashCode(this.g) + qoy.b(shy.a(this.e, shy.a(this.d, qoy.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoSettings(videoUrl=");
            sb.append(this.a);
            sb.append(", serverVideoUrl=");
            sb.append(this.b);
            sb.append(", isLocalVideoPath=");
            sb.append(this.c);
            sb.append(", width=");
            sb.append(this.d);
            sb.append(", height=");
            sb.append(this.e);
            sb.append(", isPermanentMute=");
            sb.append(this.f);
            sb.append(", durationMs=");
            return vu5.a(')', this.g, sb);
        }
    }

    /* compiled from: VideoViewSticker.kt */
    public static final class b implements l7s0 {
        public final /* synthetic */ j7q b;

        public b(j7q j7qVar) {
            this.b = j7qVar;
        }

        @Override // xsna.l7s0
        public final void a(float f) {
            l7s0 l7s0Var = grt0.this.h;
            if (l7s0Var != null) {
                l7s0Var.a(f);
            }
        }

        @Override // xsna.l7s0
        public final void b(String str, String str2) {
            i0q0.f(new qx(grt0.this, this.b, str, str2, 5));
        }

        @Override // xsna.l7s0
        public final void c() {
            l7s0 l7s0Var = grt0.this.h;
            if (l7s0Var != null) {
                l7s0Var.c();
            }
        }

        @Override // xsna.l7s0
        public final void d() {
            l7s0 l7s0Var = grt0.this.h;
            if (l7s0Var != null) {
                l7s0Var.d();
            }
        }
    }

    public /* synthetic */ grt0(Context context, Uri uri, Bitmap bitmap, SimpleVideoView.m mVar, SimpleVideoView.j jVar, boolean z, int i) {
        this(context, uri, (i & 4) != 0 ? null : bitmap, (i & 8) != 0 ? null : mVar, (SimpleVideoView.k) null, (i & 32) != 0 ? null : jVar, true, z, true);
    }

    private final Runnable getFirstFrameRunnable() {
        if (this.k == null) {
            this.k = new ryc(this, 14);
        }
        return this.k;
    }

    public static void o(grt0 grt0Var) {
        if (i0q0.b()) {
            grt0Var.getFirstFrameRunnable().run();
        } else {
            i0q0.d(32L, grt0Var.getFirstFrameRunnable());
        }
    }

    @Override // xsna.nxt0, xsna.nov
    public nov E0(nov novVar) {
        grt0 grt0Var = (grt0) novVar;
        grt0Var.setShowOnlyFirstFrame(this.u);
        grt0Var.i = this.i;
        SimpleVideoView simpleVideoView = grt0Var.r;
        SimpleVideoView simpleVideoView2 = this.r;
        if (simpleVideoView != null) {
            simpleVideoView.setVideoSourceType(simpleVideoView2 != null ? simpleVideoView2.getVideoSourceType() : null);
        }
        if (simpleVideoView != null) {
            simpleVideoView.s(simpleVideoView2 != null ? simpleVideoView2.getVideoData() : null, true, 0L, true);
        }
        grt0Var.o = this.o;
        grt0Var.p = this.p;
        grt0Var.z();
        MediaStorage mediaStorage = MediaStorage.b;
        a.InterfaceC0045a d = MediaStorage.c(MediaStorage.VideoCacheType.ALL).d();
        if (simpleVideoView != null) {
            simpleVideoView.setDataSourceFactory(d);
        }
        return super.E0(grt0Var);
    }

    @Override // xsna.nxt0, xsna.nov
    public void F0(Canvas canvas, final boolean z) {
        final SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            i0q0.i(0L, new Runnable() { // from class: xsna.frt0
                @Override // java.lang.Runnable
                public final void run() {
                    bwt0.p0(SimpleVideoView.this, !z && this.s);
                }
            });
        }
        nov.a.a(this, canvas, z);
    }

    @Override // xsna.vps0
    @SuppressLint({"CheckResult"})
    public final void b() {
        StoriesFeatures storiesFeatures = StoriesFeatures.OPTIMIZE_PLAYERS_RELEASE;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            new io.reactivex.rxjava3.internal.operators.observable.s0(new ivz(this, 2)).r0(asu0.a.d()).a();
        }
    }

    public long getCurrentPosition() {
        SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            return simpleVideoView.getCurrentPosition();
        }
        return 0L;
    }

    @Override // xsna.oit0
    public long getDuration() {
        SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            return simpleVideoView.getDuration();
        }
        return 0L;
    }

    public final Bitmap getFirstFrameBitmap() {
        return this.o;
    }

    public final SimpleVideoView.k getIntFirstFrameListenter() {
        return this.f;
    }

    public final Bitmap getLastFrameBitmap() {
        return this.p;
    }

    @Override // xsna.nxt0, xsna.nov
    public abstract /* synthetic */ float getOriginalHeight();

    @Override // xsna.nxt0, xsna.nov
    public abstract /* synthetic */ float getOriginalWidth();

    public final int getPrevMode() {
        return this.q;
    }

    public final VKImageView getPreviewImageView() {
        return this.l;
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerAlpha() {
        return super.getStickerAlpha();
    }

    @Override // xsna.oit0
    public Uri getUri() {
        return super.getUri();
    }

    @Override // xsna.oit0
    public abstract /* synthetic */ wds0 getVideoData();

    @Override // xsna.oit0
    public int getVideoRadius() {
        return 0;
    }

    public final a getVideoSettings() {
        return this.n;
    }

    public final SimpleVideoView getVideoView() {
        return this.r;
    }

    @Override // xsna.oit0
    public boolean n() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        VKImageView vKImageView = this.l;
        if (vKImageView != null) {
            vKImageView.layout(i, i2, i3, i4);
        }
        SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            simpleVideoView.layout(i, i2, i3, i4);
        }
    }

    public final boolean q() {
        SimpleVideoView simpleVideoView = this.r;
        return simpleVideoView == null || simpleVideoView.N == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void r() {
        this.j = false;
        SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            simpleVideoView.setPlayWhenReady(false);
        }
    }

    public final void setDownloadListener(l7s0 l7s0Var) {
        this.h = l7s0Var;
    }

    public final void setFirstFrameBitmap(Bitmap bitmap) {
        this.o = bitmap;
    }

    public final void setLastFrameBitmap(Bitmap bitmap) {
        this.p = bitmap;
    }

    public void setMute(boolean z) {
        SimpleVideoView simpleVideoView;
        if ((!n() || z) && (simpleVideoView = this.r) != null) {
            simpleVideoView.setMute(z);
        }
    }

    public final void setNeedRequestAudioFocus(boolean z) {
        SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            simpleVideoView.setNeedRequestAudioFocus(z);
        }
    }

    public void setPermanentMute(boolean z) {
        this.v = z;
        SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            simpleVideoView.setMute(true);
        }
    }

    public final void setPlayWhenReady(boolean z) {
        this.j = z;
    }

    public final void setPrevMode(int i) {
        this.q = i;
    }

    @Override // xsna.vov
    public void setPreviewMode(int i) {
        this.q = i;
    }

    public final void setShowOnlyFirstFrame(boolean z) {
        this.u = z;
        SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            bwt0.p0(simpleVideoView, !z);
        }
        setMute(z);
    }

    @Override // xsna.nxt0, xsna.nov
    public void setStickerAlpha(int i) {
        VKImageView vKImageView = this.l;
        if (vKImageView != null) {
            bwt0.p0(vKImageView, i >= 255);
        }
        super.setStickerAlpha(i);
    }

    public final void setVideoSettings(a aVar) {
        this.n = aVar;
    }

    public final void setVolume(float f) {
        SimpleVideoView simpleVideoView;
        if (n() || (simpleVideoView = this.r) == null) {
            return;
        }
        simpleVideoView.setSoundVolume(f);
    }

    @Override // xsna.nxt0, xsna.nov
    public final void stopEncoding() {
        SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            simpleVideoView.r(new gh1(simpleVideoView, 6));
        }
    }

    public final void u() {
        SimpleVideoView simpleVideoView = this.r;
        if (simpleVideoView != null) {
            L.e("SimpleVideoView", "initPlayer");
            if (simpleVideoView.p()) {
                simpleVideoView.r(new sc4(simpleVideoView, 13));
            }
        }
        if (simpleVideoView != null) {
            simpleVideoView.setPlayWhenReady(true);
        }
        i0q0.i(400L, new x52(this, 15));
        this.t = false;
    }

    public final void w() {
        StoriesFeatures storiesFeatures = StoriesFeatures.OPTIMIZE_PLAYERS_RELEASE;
        storiesFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(storiesFeatures);
        SimpleVideoView simpleVideoView = this.r;
        if (a2) {
            if (this.t) {
                return;
            }
            String str = kd7.a;
            Bitmap bitmap = null;
            if (simpleVideoView != null) {
                try {
                    bitmap = simpleVideoView.getBitmap();
                } catch (Throwable unused) {
                    lht.a.a();
                    try {
                        bitmap = simpleVideoView.getBitmap();
                    } catch (Throwable unused2) {
                    }
                }
            }
            this.p = bitmap;
            if (bitmap == null) {
                bitmap = this.o;
            }
            VKImageView vKImageView = this.l;
            if (bitmap != null && vKImageView != null) {
                vKImageView.setImageBitmap(bitmap);
            }
            if (simpleVideoView != null) {
                bwt0.p0(simpleVideoView, false);
            }
            if (vKImageView != null) {
                bwt0.p0(vKImageView, true);
            }
        }
        if (simpleVideoView != null) {
            simpleVideoView.r(new gh1(simpleVideoView, 6));
        }
        this.t = true;
    }

    public final void x() {
        wds0 videoData = getVideoData();
        if (videoData != null) {
            SimpleVideoView simpleVideoView = this.r;
            if (simpleVideoView != null) {
                simpleVideoView.r(new qnz(simpleVideoView, videoData.c, 1));
            }
            if (simpleVideoView != null) {
                simpleVideoView.setPlayWhenReady(true);
            }
        }
    }

    public void z() {
        Uri parse;
        a aVar = this.n;
        if (aVar != null) {
            String str = aVar.b;
            SimpleVideoView simpleVideoView = this.r;
            if (simpleVideoView != null) {
                simpleVideoView.setVideoSourceType(VideoSourceType.MP4);
            }
            String str2 = aVar.a;
            if (aVar.c) {
                Context context = getContext();
                String str3 = aVar.a;
                if (str3 == null) {
                    str3 = "";
                }
                String b2 = r9r.b(context, Uri.parse(str3));
                if (b2 == null) {
                    b2 = "";
                }
                File file = new File(b2);
                Regex regex = com.vk.core.files.a.a;
                if (vhk0.g(file)) {
                    if (simpleVideoView != null) {
                        simpleVideoView.s(new wds0(Uri.parse(b2), 0L, 0L, 0L, false), true, 0L, this.m);
                    }
                    l7s0 l7s0Var = this.h;
                    if (l7s0Var != null) {
                        l7s0Var.b(b2, b2);
                        return;
                    }
                } else {
                    str2 = str;
                }
            }
            if (str2 != null && str2.length() != 0) {
                MediaStorage mediaStorage = MediaStorage.b;
                j7q c = MediaStorage.c(MediaStorage.VideoCacheType.ALL);
                if (!c.j(Uri.parse(str2))) {
                    Uri parse2 = Uri.parse(str2);
                    String lastPathSegment = parse2.getLastPathSegment();
                    File u = (lastPathSegment == null || lastPathSegment.length() == 0) ? com.vk.core.files.a.u() : PrivateFiles.e(e8r.a, PrivateSubdir.TEMP_UPLOADS, lastPathSegment, null, 28);
                    if (simpleVideoView != null) {
                        simpleVideoView.setPlayWhenReady(this.j);
                    }
                    Regex regex2 = com.vk.core.files.a.a;
                    if (vhk0.g(u)) {
                        String absolutePath = u.getAbsolutePath();
                        i0q0.f(new qx(this, c, absolutePath, absolutePath, 5));
                        return;
                    }
                    if (str != null && (parse = Uri.parse(str)) != null) {
                        parse2 = parse;
                    }
                    io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.q(new yhs0(parse2, getContext(), u)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                    ehm0 ehm0Var = new ehm0(this, 12);
                    emh0 emh0Var = new emh0(this, 20);
                    com.vk.movika.sdk.base.logic.interactor.n nVar = new com.vk.movika.sdk.base.logic.interactor.n(u, this, c, 7);
                    l7x l7xVar = itg0.a;
                    a0.subscribe(new mx50(ehm0Var, 1), new gd9(emh0Var, 3), new etg0(nVar));
                    return;
                }
                String a2 = k020.a(str2);
                b bVar = new b(c);
                if (str2.length() != 0) {
                    c.f(str2, bVar, a2);
                }
            }
        }
    }

    public grt0(Context context, Uri uri, Bitmap bitmap, SimpleVideoView.m mVar, SimpleVideoView.k kVar, SimpleVideoView.j jVar, boolean z, boolean z2, boolean z3) {
        this(context, new a(0, 0, true, false, uri.toString(), null, 0L), bitmap, mVar, kVar, jVar, z, z2, z3);
    }

    public grt0(Context context, a aVar, Bitmap bitmap, SimpleVideoView.m mVar, SimpleVideoView.k kVar, SimpleVideoView.j jVar, boolean z, boolean z2, boolean z3) {
        super(context);
        f0j0 f0j0Var = new f0j0(this, 9);
        this.f = f0j0Var;
        this.i = "";
        this.q = -1;
        this.j = z;
        this.n = aVar;
        this.o = bitmap;
        this.g = kVar;
        this.m = z3;
        SimpleVideoView simpleVideoView = null;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        vKImageView.setImageBitmap(bitmap);
        addView(vKImageView);
        this.l = vKImageView;
        if (!z2) {
            simpleVideoView = new SimpleVideoView(context);
            simpleVideoView.setOnPreparedListener(new k7j(mVar, this));
            simpleVideoView.setOnFirstFrameRenderedListener(f0j0Var);
            simpleVideoView.setOnErrorListener(jVar);
            simpleVideoView.setLoop(true);
            simpleVideoView.setPlayWhenReady(true);
            simpleVideoView.setVisibility(4);
            addView(simpleVideoView);
        }
        this.r = simpleVideoView;
    }

    public static /* synthetic */ void getPrevMode$annotations() {
    }

    public void p() {
    }

    public void s() {
    }

    public void y() {
    }

    public void t(long j) {
    }

    public Bitmap v(Bitmap bitmap) {
        return bitmap;
    }
}
