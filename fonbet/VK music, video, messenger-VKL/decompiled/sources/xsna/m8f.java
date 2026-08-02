package xsna;

import android.net.Uri;
import android.util.Size;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.clips.editor.templates.impl.player.VideoScale;
import com.vk.clips.editor.templates.impl.player.VideoSourceType;
import com.vk.clips.editor.templates.impl.player.a;
import com.vk.dto.common.ClipVideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.mediastore.storage.ClipsVideoStorage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.video.player.model.VideoContentType;
import xsna.inf;
import xsna.y7f;

/* compiled from: ClipsTemplateEditorVideoViewHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class m8f extends ysi {
    public final y7f.j c;
    public int d;
    public final a e = new a();
    public final b f = new b();

    /* compiled from: ClipsTemplateEditorVideoViewHandlerImpl.kt */
    public final class a implements a.k {
        public a() {
        }

        @Override // com.vk.clips.editor.templates.impl.player.a.k
        public final void c(long j) {
            y7f.this.e.c(j);
        }
    }

    /* compiled from: ClipsTemplateEditorVideoViewHandlerImpl.kt */
    public final class b implements inf.a {
        public b() {
        }

        @Override // xsna.inf.a
        public final void a(int i) {
            ArrayList arrayList;
            n7f b;
            n7f n7fVar;
            m8f m8fVar = m8f.this;
            m8fVar.j7();
            y7f.j jVar = m8fVar.c;
            z7f B = y7f.this.B();
            Size size = null;
            List<n7f> list = B != null ? B.d : null;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((n7f) obj).c != null) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = (arrayList == null || (n7fVar = (n7f) j5g.b0(i, arrayList)) == null) ? null : n7fVar.c;
            r8f b2 = jVar.b();
            Boolean valueOf = b2 != null ? Boolean.valueOf(((s8f) b2).b) : null;
            a7f h4 = y7f.this.a.h4();
            ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem2 = (h4 == null || (b = h4.b()) == null) ? null : b.c;
            if (epx.f(valueOf, Boolean.TRUE) && clipsTemplateEditorVideoItem2 != null && i == 0) {
                size = new Size(clipsTemplateEditorVideoItem2.c, clipsTemplateEditorVideoItem2.d);
                clipsTemplateEditorVideoItem = clipsTemplateEditorVideoItem2;
            } else if (clipsTemplateEditorVideoItem != null) {
                size = new Size(clipsTemplateEditorVideoItem.c, clipsTemplateEditorVideoItem.d);
            }
            if (size != null) {
                jVar.a().a(size, clipsTemplateEditorVideoItem.j);
            }
        }
    }

    /* compiled from: ClipsTemplateEditorVideoViewHandlerImpl.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.HLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoContentType.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoContentType.MP4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m8f(y7f.j jVar) {
        this.c = jVar;
    }

    public final void j7() {
        com.vk.clips.editor.templates.impl.player.a videoView;
        y7f.j jVar = this.c;
        z7f B = y7f.this.B();
        if (B == null) {
            return;
        }
        r8f b2 = jVar.b();
        yds0 yds0Var = null;
        if (b2 != null && (videoView = ((s8f) b2).a.getVideoView()) != null) {
            yds0Var = videoView.getCurrentVideoItem();
        }
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new t72(2, B, yds0Var));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.b.b(vVar.q(asu0.k()).m(asu0Var.d()).subscribe(new bg1(new lb(this, 25), 17), new hz(new k60(18), 19)));
    }

    public final void u7() {
        y7f.j jVar = this.c;
        r8f b2 = jVar.b();
        y7f y7fVar = y7f.this;
        if (b2 != null) {
            z7f B = y7fVar.B();
            ClipVideoFile clipVideoFile = B != null ? B.b : null;
            if (clipVideoFile != null) {
                s8f s8fVar = (s8f) b2;
                inf infVar = s8fVar.a;
                s8fVar.d(0L);
                ClipsVideoStorage.a.getClass();
                j7q c2 = ClipsVideoStorage.c();
                androidx.media3.datasource.cache.c c3 = c2 != null ? c2.c() : null;
                com.vk.clips.editor.templates.impl.player.a videoView = infVar.getVideoView();
                if (videoView != null) {
                    videoView.N = c3;
                }
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                yg5 e = b.C1208b.a().e(clipVideoFile, null);
                VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                sht0 sht0Var = videoAutoPlay != null ? videoAutoPlay.l0 : null;
                if (sht0Var == null) {
                    m7q e2 = gpt0.e(gpt0.a, clipVideoFile, -1, null, true, false, null, null, false, 480);
                    sht0Var = e2 != null ? jgz.e(e2) : null;
                }
                s8fVar.o(new pi0(this, 16));
                s8fVar.i(this.e);
                s8fVar.j(this.f);
                int i = c.$EnumSwitchMapping$0[sht0Var.a.ordinal()];
                s8fVar.r(i != 1 ? i != 2 ? i != 3 ? VideoSourceType.MP4 : VideoSourceType.MP4 : VideoSourceType.DASH : VideoSourceType.HLS);
                String str = clipVideoFile.j;
                com.vk.clips.editor.templates.impl.player.a videoView2 = infVar.getVideoView();
                if (videoView2 != null) {
                    videoView2.setFailoverHost(str);
                }
                Uri uri = sht0Var.b;
                s8fVar.n(new iw3(this, 5));
                Size size = new Size(clipVideoFile.m0, clipVideoFile.n0);
                inf infVar2 = s8fVar.a;
                float width = size.getWidth();
                float height = size.getHeight();
                infVar2.s = Float.valueOf(width);
                infVar2.t = Float.valueOf(height);
                infVar2.k(null, Collections.EMPTY_LIST);
                com.vk.clips.editor.templates.impl.player.a videoView3 = infVar2.getVideoView();
                if (videoView3 != null) {
                    videoView3.y(uri, true, 0L, true);
                }
                infVar2.requestLayout();
                s8fVar.b = false;
                s8fVar.m(false);
                s8fVar.l(true);
                s8fVar.p(true);
            }
        }
        z7f B2 = y7fVar.B();
        ClipVideoFile clipVideoFile2 = B2 != null ? B2.b : null;
        if (clipVideoFile2 != null) {
            jVar.a().a(new Size(clipVideoFile2.m0, clipVideoFile2.n0), null);
        }
    }

    public final void v7() {
        y7f.j jVar = this.c;
        r8f b2 = jVar.b();
        if (b2 != null) {
            z8d z8dVar = y7f.this.e;
            gv gvVar = new gv(z8dVar, 13);
            s8f s8fVar = (s8f) b2;
            inf infVar = s8fVar.a;
            s8fVar.o(gvVar);
            VideoScale.ScaleType scaleType = VideoScale.ScaleType.FIT_CENTER;
            com.vk.clips.editor.templates.impl.player.a videoView = infVar.getVideoView();
            if (videoView != null) {
                videoView.setScaleType(scaleType);
            }
            s8fVar.r(VideoSourceType.MP4);
            a aVar = this.e;
            s8fVar.i(aVar);
            infVar.r.add(aVar);
            b bVar = this.f;
            s8fVar.j(bVar);
            infVar.q.add(bVar);
            s8fVar.n(new pb(z8dVar, 11));
            kf3 kf3Var = new kf3(z8dVar, 12);
            com.vk.clips.editor.templates.impl.player.a videoView2 = infVar.getVideoView();
            if (videoView2 != null) {
                videoView2.setOnPreparedListener(kf3Var);
            }
            s8fVar.l(false);
            s8fVar.m(true);
        }
    }
}
