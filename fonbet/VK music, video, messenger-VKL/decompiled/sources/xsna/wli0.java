package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.Iterator;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.lnt0;
import xsna.ye0;

/* compiled from: SequentialPlayDelegate.kt */
/* loaded from: classes2.dex */
public final class wli0 implements lnt0 {
    public final RecyclerView b;
    public final ai5 c;
    public final hbt0 d;
    public boolean e;
    public int f = -1;
    public int g = -1;
    public yg5 h;
    public final xws i;
    public final Rect j;
    public final bva0 k;
    public final a l;

    public wli0(RecyclerView recyclerView, ai5 ai5Var, hbt0 hbt0Var, boolean z) {
        this.b = recyclerView;
        this.c = ai5Var;
        this.d = hbt0Var;
        tev tevVar = tev.a;
        this.i = new xws();
        this.j = new Rect();
        this.k = z ? new kzc() : new xli0(recyclerView);
        this.l = new a();
    }

    @Override // xsna.lnt0
    public final RecyclerView getRecyclerView() {
        return this.b;
    }

    @Override // xsna.dnt0
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // xsna.dnt0
    public final boolean getVideoFocused() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    @Override // xsna.lnt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xh5 i() {
        int i;
        RecyclerView recyclerView = this.b;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        xh5 xh5Var = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            Rect rect = this.j;
            if (recyclerView.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                int childCount = linearLayoutManager.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        i = -1;
                        break;
                    }
                    View childAt = linearLayoutManager.getChildAt(i2);
                    if (childAt != null) {
                        childAt.getGlobalVisibleRect(rect);
                        if (rect.height() == childAt.getHeight() && rect.width() == childAt.getWidth()) {
                            i = recyclerView.getChildAdapterPosition(childAt);
                            break;
                        }
                    }
                    i2++;
                }
                if (i != -1) {
                    List<xh5> c = this.i.c(this.c, i, (linearLayoutManager.x() - i) + 1);
                    if (!c.isEmpty()) {
                        if (this.g != -1) {
                            Iterator<T> it = c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                RecyclerView.e0 d = ((xh5) next).d();
                                if (d != null && d.getAdapterPosition() == this.g) {
                                    xh5Var = next;
                                    break;
                                }
                            }
                            xh5Var = xh5Var;
                            if (xh5Var != null) {
                                this.g = -1;
                                if (xh5Var != null) {
                                    RecyclerView.e0 d2 = xh5Var.d();
                                    yg5 yg5Var = xh5Var.a;
                                    if (d2 != null) {
                                        i = d2.getAdapterPosition();
                                    }
                                    this.f = i;
                                    if (!epx.f(this.h, yg5Var)) {
                                        yg5 yg5Var2 = this.h;
                                        a aVar = this.l;
                                        if (yg5Var2 != null) {
                                            yg5Var2.T(aVar);
                                        }
                                        if (yg5Var != null) {
                                            yg5Var.f0(aVar);
                                        }
                                        this.h = yg5Var;
                                    }
                                }
                            }
                        }
                        xh5Var = (xh5) j5g.a0(c);
                        if (xh5Var != null) {
                        }
                    }
                }
            }
        }
        return xh5Var;
    }

    @Override // xsna.dnt0
    public final void setVideoFocused(boolean z) {
        this.e = z;
    }

    @Override // xsna.lnt0
    public final lnt0.a y4() {
        RecyclerView.Adapter adapter = this.b.getAdapter();
        if (adapter == null || adapter.getItemCount() < 2) {
            return null;
        }
        int i = this.g;
        if (i == -1) {
            int i2 = this.f;
            i = i2 != -1 ? (i2 + 1) % adapter.getItemCount() : 0;
        }
        y9t0 Eh = this.c.Eh(i);
        yg5 yg5Var = Eh != null ? Eh.a : null;
        if (yg5Var != null) {
            return new lnt0.a(yg5Var, i);
        }
        return null;
    }

    /* compiled from: SequentialPlayDelegate.kt */
    public static final class a implements hnt0 {
        public a() {
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
            RecyclerView recyclerView;
            RecyclerView.Adapter<?> adapter;
            int i;
            wli0 wli0Var = wli0.this;
            if (!yg5Var.equals(wli0Var.h) || (adapter = (recyclerView = wli0Var.b).getAdapter()) == null || adapter.getItemCount() == 0 || (i = wli0Var.f) == -1) {
                return;
            }
            wli0Var.g = wli0Var.k.a(i, adapter);
            recyclerView.post(new oh(wli0Var, 12));
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
        }

        @Override // xsna.hnt0
        public final void j() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }
}
