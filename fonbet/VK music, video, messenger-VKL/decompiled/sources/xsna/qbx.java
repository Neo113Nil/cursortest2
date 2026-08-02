package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.video.ui.discovery.minimizable.player.views.VideoViewContainer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Pair;
import xsna.dcx;
import xsna.e3m;
import xsna.g4x;

/* compiled from: InteractivePlayerViewHolderDelegate.kt */
/* loaded from: classes7.dex */
public final class qbx implements g5b0 {
    public final View a;
    public final a b;
    public final VideoViewContainer c;
    public final vpj0 d;
    public hbx e;

    /* compiled from: InteractivePlayerViewHolderDelegate.kt */
    public static final class a {
        public final View a;
        public final View b;
        public final View c;
        public final View d;
        public final View e;
        public final View f;

        public a(scx scxVar) {
            this.a = scxVar.e(dcx.e.a);
            this.b = scxVar.e(dcx.f.a);
            this.c = scxVar.e(dcx.a.a);
            this.d = scxVar.e(dcx.b.a);
            this.e = scxVar.e(dcx.c.a);
            this.f = scxVar.e(dcx.d.a);
        }
    }

    public qbx(View view, a aVar, VideoViewContainer videoViewContainer, vpj0 vpj0Var) {
        this.a = view;
        this.b = aVar;
        this.c = videoViewContainer;
        this.d = vpj0Var;
        f4m.j(view.findViewById(R.id.bottom_panel));
    }

    @Override // xsna.g5b0
    public final void Q(VideoMinimizableState videoMinimizableState) {
        FrameLayout frameLayout;
        a aVar = this.b;
        View view = aVar.a;
        View view2 = aVar.c;
        View view3 = aVar.b;
        if (view != null) {
            view.setVisibility(com.vk.libvideo.api.minimizable.a.e(videoMinimizableState) ? 0 : 8);
        }
        if (view3 != null) {
            view3.setVisibility(com.vk.libvideo.api.minimizable.a.j(videoMinimizableState) ? 0 : 8);
        }
        if (view2 != null) {
            view2.setVisibility(com.vk.libvideo.api.minimizable.a.k(videoMinimizableState) ? 0 : 8);
        }
        View view4 = aVar.a;
        if (view4 != null) {
            view4.setEnabled(com.vk.libvideo.api.minimizable.a.e(videoMinimizableState));
        }
        if (view3 != null) {
            view3.setEnabled(com.vk.libvideo.api.minimizable.a.j(videoMinimizableState));
        }
        if (view2 != null) {
            view2.setEnabled(com.vk.libvideo.api.minimizable.a.k(videoMinimizableState));
        }
        hbx hbxVar = this.e;
        if (hbxVar == null || (frameLayout = hbxVar.a) == null) {
            return;
        }
        bwt0.p0(frameLayout, videoMinimizableState instanceof VideoMinimizableState.Collapsed);
    }

    @Override // xsna.g5b0
    public final void a(l4x l4xVar) {
        l4xVar.b.clear();
        ArrayList arrayList = l4xVar.c;
        arrayList.clear();
        a aVar = this.b;
        Pair[] pairArr = {new Pair(aVar.b, new g4x.a.C2912a(0)), new Pair(aVar.c, new g4x.a.C2912a(0))};
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            View view = (View) pair.d();
            g4x g4xVar = (g4x) pair.g();
            if (view != null) {
                l4xVar.a(view, g4xVar);
            }
        }
        Pair[] pairArr2 = {new Pair(aVar.e, new g4x.a.d(0)), new Pair(aVar.f, new g4x.a.c(0)), new Pair(aVar.d, new g4x.a.c(0))};
        for (int i2 = 0; i2 < 3; i2++) {
            Pair pair2 = pairArr2[i2];
            View view2 = (View) pair2.d();
            g4x g4xVar2 = (g4x) pair2.g();
            if (view2 != null) {
                arrayList.add(new qg90(view2, g4xVar2));
            }
        }
    }

    @Override // xsna.g5b0
    public final void init() {
        VideoViewContainer videoViewContainer = this.c;
        Context context = videoViewContainer.getContext();
        hbx hbxVar = new hbx();
        this.e = hbxVar;
        ImageView imageView = new ImageView(context);
        int i = hbx.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.vk_icon_hand_point_up_12);
        Context context2 = imageView.getContext();
        e3m.a aVar = e3m.a;
        imageView.setColorFilter(context2.getColor(R.color.vk_white));
        FrameLayout frameLayout = new FrameLayout(context);
        int i2 = hbx.c;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 8388693;
        frameLayout.setBackground(new wng0(frameLayout.getContext().getColor(R.color.vk_violet_french), hbx.e));
        frameLayout.setLayoutParams(layoutParams2);
        int i3 = hbx.d;
        bwt0.f0(frameLayout, 0, 0, i3, i3, 3);
        hbxVar.a = frameLayout;
        frameLayout.addView(imageView);
        FrameLayout frameLayout2 = hbxVar.a;
        if (frameLayout2 != null) {
            videoViewContainer.addView(frameLayout2);
        }
        Q(((tts0) this.d.c).j);
    }

    @Override // xsna.g5b0
    public final void clear() {
    }
}
