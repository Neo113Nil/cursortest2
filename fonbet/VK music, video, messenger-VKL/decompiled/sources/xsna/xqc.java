package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.C4267cg;
import com.ironsource.C4618w9;
import com.ironsource.S8;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverVh;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.photo.editor.features.filter.a;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Regex;
import org.webrtc.SurfaceTextureHelper;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.media.PublisherImpl;
import xsna.f8h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xqc implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xqc(androidx.media3.exoplayer.d dVar, androidx.media3.exoplayer.i iVar) {
        this.b = 4;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        int i2 = 1;
        switch (this.b) {
            case 0:
                ClipDiscoverVh clipDiscoverVh = (ClipDiscoverVh) this.c;
                g3a.a(clipDiscoverVh.j, clipDiscoverVh);
                return;
            case 1:
                ClipsEditorVoiceOverRecordButton.P4((ClipsEditorVoiceOverRecordButton) this.c);
                return;
            case 2:
                ((com.vk.clips.editor.templates.impl.player.a) this.c).B.b();
                return;
            case 3:
                f8h f8hVar = (f8h) this.c;
                w8h w8hVar = f8hVar.n;
                View view = f8hVar.p;
                i8h i8hVar = f8hVar.l;
                f8h.b bVar = f8hVar.c;
                w8h w8hVar2 = bVar.a;
                View view2 = bVar.b;
                Float c = w8hVar2.c();
                jyg b = w8hVar.b();
                if (b != null) {
                    b.W5(c);
                }
                FrameLayout frameLayout = f8hVar.q;
                frameLayout.setAlpha(1.0f);
                e8h e8hVar = f8hVar.t;
                if (e8hVar != null) {
                    e8hVar.setVisibility(0);
                }
                i8hVar.a(w8hVar, view2, view);
                if (view2 != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    f8hVar.r = viewGroup;
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    frameLayout.addView(view2);
                }
                View view3 = bVar.c;
                if (view3 != null) {
                    f8hVar.s = (ViewGroup) view3.getParent();
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
                    if (dVar != null) {
                        f8hVar.v = Integer.valueOf(dVar.a);
                    }
                    ViewGroup viewGroup2 = f8hVar.s;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view3);
                    }
                    frameLayout.addView(view3);
                }
                i8hVar.m = true;
                i8hVar.b(w8hVar, view2, view, 1.0f);
                q5f q5fVar = new q5f(f8hVar, 5);
                if (i8hVar.l) {
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.addUpdateListener(new h8h(i8hVar, w8hVar, view2, view));
                ofFloat.addListener(new kv1(q5fVar, i2));
                ofFloat.setInterpolator(i8hVar.c);
                ofFloat.setDuration(300L);
                ofFloat.start();
                i8hVar.k = ofFloat;
                return;
            case 4:
                try {
                    androidx.media3.exoplayer.d.h((androidx.media3.exoplayer.i) this.c);
                    return;
                } catch (ExoPlaybackException e) {
                    ahn.o("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 5:
                com.vk.photo.editor.features.filter.b bVar2 = (com.vk.photo.editor.features.filter.b) this.c;
                Iterable iterable = (Iterable) bVar2.c.i().b.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (obj instanceof a.C1457a) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (!((a.C1457a) it.next()).a.d) {
                        i3++;
                    }
                }
                Integer valueOf = i3 != -1 ? Integer.valueOf(i3) : null;
                if (valueOf != null) {
                    bVar2.o.post(new ger(i, bVar2, valueOf));
                    return;
                }
                return;
            case 6:
                ty90 ty90Var = ((o260) this.c).t;
                if (ty90Var != null) {
                    synchronized (ty90Var) {
                        ty90Var.b.b.clear();
                        r27 r27Var = ty90Var.c;
                        r27Var.a.clear();
                        r27Var.b.delete();
                    }
                    return;
                }
                return;
            case 7:
                ((PeerConnectionClient) this.c).i();
                return;
            case 8:
                ((b2e0) this.c).c();
                return;
            case 9:
                ((PublisherImpl) this.c).lambda$startPublishing$8();
                return;
            case 10:
                ((cfh0) this.c).d.setNestedScrollingEnabled(true);
                return;
            case 11:
                ((clh0) this.c).a().add(-1L, clh0.l);
                return;
            case 12:
                ((SurfaceTextureHelper) this.c).lambda$forceFrame$3();
                return;
            case 13:
                ((TextureViewRenderer) this.c).deliverPostponedFrame();
                return;
            case 14:
                File file = (File) this.c;
                Regex regex = com.vk.core.files.a.a;
                vhk0.d(file);
                return;
            case 15:
                WriteBarButtonsBubbleView writeBarButtonsBubbleView = (WriteBarButtonsBubbleView) this.c;
                int i4 = WriteBarButtonsBubbleView.h;
                bwt0.p0(writeBarButtonsBubbleView, true);
                return;
            case 16:
                yads.ad2.a((yads.ad2) this.c);
                return;
            case 17:
                C4267cg.a((S8) this.c);
                return;
            case 18:
                huy0 huy0Var = (huy0) this.c;
                long j = huy0Var.d - 200;
                huy0Var.d = j;
                if (j <= 0) {
                    huy0Var.a();
                    return;
                } else {
                    huy0Var.c();
                    return;
                }
            case 19:
                j8z0 j8z0Var = (j8z0) this.c;
                if (j8z0Var.h) {
                    j8z0Var.d();
                    return;
                } else {
                    j8z0Var.e.h(j8z0Var.f);
                    return;
                }
            default:
                C4618w9.d((C4618w9) this.c);
                return;
        }
    }

    public /* synthetic */ xqc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
