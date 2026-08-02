package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.ui.VideoChevronMode;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Pair;
import xsna.a78;
import xsna.g4x;
import xsna.hgs0;

/* compiled from: LinearPlayerViewHolderDelegate.kt */
/* loaded from: classes7.dex */
public final class k8z implements g5b0 {
    public final b a;
    public final hgs0 b;
    public final dbj0 c;
    public final ebs0 d;
    public final rcg0 e;
    public final etn f = gsi0.b();

    /* compiled from: LinearPlayerViewHolderDelegate.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InsetsConfig(isLandscape=");
            sb.append(this.a);
            sb.append(", isTablet=");
            sb.append(this.b);
            sb.append(", isHorizontalRedesignEnabled=");
            sb.append(this.c);
            sb.append(", isVerticalEntryPointEnabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: LinearPlayerViewHolderDelegate.kt */
    public static final class b {
        public final VideoToolbarView a;
        public final VideoBottomPanelView b;
        public final VideoFullscreenBottomBarView c;
        public final VideoTopBarView d;

        public b(ViewGroup viewGroup) {
            this.a = (VideoToolbarView) viewGroup.findViewById(R.id.toolbar);
            this.b = (VideoBottomPanelView) viewGroup.findViewById(R.id.bottom_panel);
            this.c = (VideoFullscreenBottomBarView) viewGroup.findViewById(R.id.fullscreen_bottom_controls);
            this.d = (VideoTopBarView) viewGroup.findViewById(R.id.top_controls);
        }
    }

    public k8z(b bVar, hgs0 hgs0Var, dbj0 dbj0Var, ebs0 ebs0Var, rcg0 rcg0Var) {
        this.a = bVar;
        this.b = hgs0Var;
        this.c = dbj0Var;
        this.d = ebs0Var;
        this.e = rcg0Var;
    }

    public static boolean d(VideoMinimizableState videoMinimizableState) {
        return videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal ? !com.vk.toggle.d.v().b : videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical ? !com.vk.toggle.d.w().b : ((videoMinimizableState instanceof VideoMinimizableState.Expanded) && com.vk.toggle.d.u().b) ? false : true;
    }

    @Override // xsna.g5b0
    public final void Q(VideoMinimizableState videoMinimizableState) {
        VideoToolbarView videoToolbarView;
        VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
        videoFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(videoFeatures);
        hgs0 hgs0Var = this.b;
        VideoFile videoFile = hgs0Var.getVideoFile();
        boolean z = false;
        boolean T1 = videoFile != null ? videoFile.T1() : false;
        hgs0Var.setShortActionsButtonsVisibility((a2 || T1 || !com.vk.libvideo.api.minimizable.a.e(videoMinimizableState)) ? false : true);
        hgs0Var.setShortActionsAutoPlaySwitchVisibility(d(videoMinimizableState));
        boolean z2 = videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal;
        VideoFile videoFile2 = hgs0Var.getVideoFile();
        Boolean valueOf = videoFile2 != null ? Boolean.valueOf(videoFile2.T1()) : null;
        etn etnVar = this.f;
        boolean j = etnVar.j(z2, valueOf);
        VideoToolbarView videoToolbarView2 = hgs0Var.getViewBinding().H;
        if (videoToolbarView2 != null) {
            videoToolbarView2.setVisibility((!com.vk.libvideo.api.minimizable.a.j(videoMinimizableState) || j) ? 8 : 0);
        }
        VideoTopBarView topBar = hgs0Var.getTopBar();
        if (topBar != null) {
            topBar.setVisibility(com.vk.libvideo.api.minimizable.a.j(videoMinimizableState) ? j : a2 && !T1 ? 0 : 8);
        }
        boolean j2 = com.vk.libvideo.api.minimizable.a.j(videoMinimizableState);
        b bVar = this.a;
        hgs0Var.getViewBinding().H = j2 ? bVar.a : null;
        if (com.vk.libvideo.api.minimizable.a.j(videoMinimizableState) && !j && (videoToolbarView = hgs0Var.getViewBinding().H) != null) {
            videoToolbarView.h(d(videoMinimizableState));
            if (z2) {
                VideoFile videoFile3 = hgs0Var.getVideoFile();
                if (!etnVar.h(videoFile3 != null ? Boolean.valueOf(videoFile3.T1()) : null)) {
                    z = true;
                }
            }
            videoToolbarView.i(z);
        }
        hgs0Var.setWithoutBottomPanel(!com.vk.libvideo.api.minimizable.a.j(videoMinimizableState));
        hgs0Var.setBottomPanelVisibilityMode(new a78.a(new sk(17, this, hgs0Var)));
        bVar.b.setBottomBarVisibility(com.vk.libvideo.api.minimizable.a.k(videoMinimizableState));
        if (videoMinimizableState instanceof VideoMinimizableState.Animating) {
            return;
        }
        hgs0Var.setFullscreenContext(com.vk.libvideo.api.minimizable.a.j(videoMinimizableState));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8 A[ADDED_TO_REGION] */
    @Override // xsna.g5b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(l4x l4xVar) {
        int i;
        int a2;
        Object cVar;
        int i2;
        int a3;
        int i3;
        int a4;
        int i4;
        int a5;
        g4x c2912a;
        b bVar = this.a;
        VideoToolbarView videoToolbarView = bVar.a;
        VideoBottomPanelView videoBottomPanelView = bVar.b;
        l4xVar.b.clear();
        l4xVar.c.clear();
        hgs0 hgs0Var = this.b;
        a b2 = b(hgs0Var);
        boolean z = b2.a;
        boolean z2 = b2.c;
        boolean z3 = b2.d;
        boolean z4 = b2.b;
        Pair[] pairArr = {new Pair(videoToolbarView, new g4x.a.C2912a(0)), new Pair(videoBottomPanelView, new g4x.a.C2912a(0))};
        ArrayList arrayList = l4xVar.b;
        ArrayList arrayList2 = new ArrayList(2);
        for (int i5 = 0; i5 < 2; i5++) {
            Pair pair = pairArr[i5];
            arrayList2.add(new qg90(pair.i(), pair.j()));
        }
        arrayList.addAll(arrayList2);
        VideoTopBarView topBar = hgs0Var.getTopBar();
        if (topBar != null) {
            a b3 = b(hgs0Var);
            boolean z5 = b3.c;
            boolean z6 = b3.d;
            boolean z7 = b3.a;
            boolean z8 = b3.b;
            if (hgs0Var.H && z7) {
                int a6 = iah0.a(8);
                c2912a = new g4x.a.e(new g4x.c(0, 0, a6, a6, 3));
            } else {
                if (z8 && !z7 && z6) {
                    a4 = iah0.a(10);
                } else if (z8 && z7 && z5) {
                    a4 = iah0.a(10);
                } else if (z7 && z5) {
                    a4 = iah0.a(40);
                } else {
                    i3 = 0;
                    if (!z8 && !z7 && z6) {
                        a5 = iah0.a(16);
                    } else if (!z8 && z7 && z5) {
                        a5 = iah0.a(12);
                    } else if (z7 && z6) {
                        a5 = iah0.a(34);
                    } else {
                        i4 = 0;
                        g4x.c cVar2 = new g4x.c(i4, 0, i3, i3, 2);
                        c2912a = (z8 || ((z7 || !z6) && !(z7 && z5))) ? new g4x.a.C2912a(cVar2) : new g4x.a.c(cVar2);
                    }
                    i4 = a5;
                    g4x.c cVar22 = new g4x.c(i4, 0, i3, i3, 2);
                    if (z8) {
                    }
                }
                i3 = a4;
                if (!z8) {
                }
                if (!z8) {
                }
                if (z7) {
                }
                i4 = 0;
                g4x.c cVar222 = new g4x.c(i4, 0, i3, i3, 2);
                if (z8) {
                }
            }
            l4xVar.a(topBar, c2912a);
        }
        VideoFullscreenBottomBarView fullscreenBottomBar = hgs0Var.getFullscreenBottomBar();
        if (fullscreenBottomBar != null) {
            if (z4 && !z && z3) {
                a3 = iah0.a(10);
            } else if (z4 && z && z2) {
                a3 = iah0.a(10);
            } else if (z && z2) {
                a3 = iah0.a(40);
            } else {
                i2 = 0;
                g4x.c cVar3 = new g4x.c(0, (z4 || z || !z3) ? 0 : iah0.a(22), i2, i2, 1);
                l4xVar.a(fullscreenBottomBar, (z4 || ((z || !z3) && !(z && z2))) ? new g4x.a.C2912a(cVar3) : new g4x.a.c(cVar3));
            }
            i2 = a3;
            g4x.c cVar32 = new g4x.c(0, (z4 || z || !z3) ? 0 : iah0.a(22), i2, i2, 1);
            l4xVar.a(fullscreenBottomBar, (z4 || ((z || !z3) && !(z && z2))) ? new g4x.a.C2912a(cVar32) : new g4x.a.c(cVar32));
        }
        View view = hgs0Var.getViewBinding().i;
        g4x.b bVar2 = g4x.b.a;
        Pair pair2 = new Pair(view, bVar2);
        View W3 = hgs0Var.getViewBinding().r.W3(hgs0Var.getContext());
        a b4 = b(hgs0Var);
        boolean z9 = b4.a;
        if (hgs0Var.H && z9) {
            int a7 = iah0.a(8);
            cVar = new g4x.a.b(new g4x.c(0, 0, a7, a7, 3));
        } else {
            boolean z10 = b4.b;
            boolean z11 = b4.c;
            if (z10 && !z9 && b4.d) {
                a2 = iah0.a(10);
            } else if (z10 && z9 && z11) {
                a2 = iah0.a(10);
            } else if (z9 && z11) {
                a2 = iah0.a(40);
            } else {
                i = 0;
                cVar = new g4x.a.c(new g4x.c(0, 0, i, i, 3));
            }
            i = a2;
            cVar = new g4x.a.c(new g4x.c(0, 0, i, i, 3));
        }
        Pair[] pairArr2 = {pair2, new Pair(W3, cVar), new Pair(hgs0Var.getActualEndView(), bVar2), new Pair(hgs0Var.getViewBinding().A, bVar2), new Pair(hgs0Var.getViewBinding().h, bVar2), new Pair(hgs0Var.getViewBinding().o, new g4x.a.C2912a(0)), new Pair(hgs0Var.getViewBinding().p, new g4x.a.c(0)), new Pair(hgs0Var.getViewBinding().q, g4x.d.a), new Pair(hgs0Var.getViewBinding().z, bVar2), new Pair(hgs0Var.getViewBinding().k, bVar2), new Pair(hgs0Var.getViewBinding().j, bVar2)};
        ArrayList arrayList3 = new ArrayList(11);
        for (int i6 = 0; i6 < 11; i6++) {
            Pair pair3 = pairArr2[i6];
            arrayList3.add(new qg90(pair3.i(), pair3.j()));
        }
        arrayList.addAll(arrayList3);
    }

    public final a b(VideoView videoView) {
        boolean z = videoView.getContext().getResources().getConfiguration().orientation == 2;
        Context context = videoView.getContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(context);
        VideoFile videoFile = videoView.getVideoFile();
        Boolean valueOf = videoFile != null ? Boolean.valueOf(videoFile.T1()) : null;
        etn etnVar = this.f;
        boolean h = etnVar.h(valueOf);
        VideoFile videoFile2 = videoView.getVideoFile();
        return new a(z, d, h, etnVar.k(videoFile2 != null ? Boolean.valueOf(videoFile2.T1()) : null));
    }

    public final VideoMinimizableState c() {
        return ((tts0) this.c.c).j;
    }

    @Override // xsna.g5b0
    public final void clear() {
        hgs0 hgs0Var = this.b;
        hgs0Var.getViewBinding().H = null;
        hgs0Var.getViewBinding().G = null;
        hgs0Var.setFullscreenBottomBar(null);
        hgs0Var.setTopBar(null);
        b bVar = this.a;
        bVar.a.setVisibility(8);
        bVar.b.setVisibility(8);
        VideoFullscreenBottomBarView videoFullscreenBottomBarView = bVar.c;
        if (videoFullscreenBottomBarView != null) {
            videoFullscreenBottomBarView.setVisibility(8);
        }
        VideoTopBarView videoTopBarView = bVar.d;
        if (videoTopBarView != null) {
            videoTopBarView.setVisibility(8);
        }
    }

    @Override // xsna.g5b0
    public final void init() {
        b bVar = this.a;
        VideoToolbarView videoToolbarView = bVar.a;
        VideoFullscreenBottomBarView videoFullscreenBottomBarView = bVar.c;
        etn etnVar = this.f;
        boolean d = etnVar.d();
        hgs0 hgs0Var = this.b;
        if (d) {
            hgs0Var.setFullscreenBottomBar(videoFullscreenBottomBarView);
        }
        VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
        videoFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(videoFeatures);
        if (etnVar.f || etnVar.a || a2) {
            hgs0Var.setTopBar(bVar.d);
        }
        VideoBottomPanelView videoBottomPanelView = bVar.b;
        videoBottomPanelView.setHideDividerWithBottomBar(true);
        videoBottomPanelView.setBottomBarVisibility(false);
        videoBottomPanelView.C = false;
        bwt0.p0(videoBottomPanelView.w, false);
        hgs0Var.getViewBinding().G = videoBottomPanelView;
        VideoToolbarView.a aVar = videoToolbarView.u;
        videoToolbarView.u = new VideoToolbarView.a(false, VideoChevronMode.Minimize, this.e, true);
        if (videoFullscreenBottomBarView != null) {
            videoFullscreenBottomBarView.setAreCommentsDisabled(false);
        }
        hgs0.a playerViewSettings = hgs0Var.getPlayerViewSettings();
        m3g m3gVar = new m3g(this, 26);
        playerViewSettings.getClass();
        hgs0Var.setPlayerViewSettings(new hgs0.a(m3gVar));
        ebs0 ebs0Var = this.d;
        if (ebs0Var != null) {
            videoToolbarView.setVideoActionsCallback(ebs0Var);
        }
        Q(c());
    }
}
