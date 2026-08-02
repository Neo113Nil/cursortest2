package xsna;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.my.target.nativeads.views.CollageView;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.newsfeed.common.presentation.model.items.MyTargetNativeAdSinglePartUiDto;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import xsna.r1g;

/* compiled from: NativeAdCollageDelegate.kt */
/* loaded from: classes4.dex */
public final class dv50 implements ii6 {
    public final View b;
    public MyTargetNativeAdSinglePartUiDto c;
    public final MediaAdView d;
    public final IconAdView e;
    public final FrameLayout f;
    public final FrameLayout g;
    public final a h;
    public boolean i;
    public final FrameLayout.LayoutParams j;
    public final ArrayList<DurationView> k;

    /* compiled from: NativeAdCollageDelegate.kt */
    public final class a implements r1g.a {
        public a() {
        }

        @Override // xsna.r1g.a
        public final Activity getActivity() {
            return bwt0.w(dv50.this.b);
        }

        @Override // xsna.r1g.a
        public final MediaAdView o() {
            return dv50.this.d;
        }

        @Override // xsna.r1g.a
        public final e0g p() {
            cw50 cw50Var;
            MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto = dv50.this.c;
            if (myTargetNativeAdSinglePartUiDto == null || (cw50Var = myTargetNativeAdSinglePartUiDto.i) == null) {
                return null;
            }
            return cw50Var.A;
        }
    }

    public dv50(View view) {
        this.b = view;
        MediaAdView mediaAdView = (MediaAdView) view.findViewById(R.id.mediaView);
        this.d = mediaAdView;
        IconAdView iconAdView = (IconAdView) view.findViewById(R.id.icon);
        this.e = iconAdView;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.cta_button_container);
        this.f = frameLayout;
        this.g = (FrameLayout) view.findViewById(R.id.mediaViewContainer);
        this.h = new a();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 85;
        layoutParams.setMargins(0, 0, cn70.b(4), cn70.b(4));
        this.j = layoutParams;
        this.k = new ArrayList<>();
        iconAdView.setVisibility(8);
        mediaAdView.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i = 0; i < 10; i++) {
            ArrayList<DurationView> arrayList = this.k;
            DurationView durationView = new DurationView(this.b.getContext(), null, 6);
            durationView.setPlayIconVisibility(true);
            arrayList.add(durationView);
        }
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        View view = this.b;
        view.setContentDescription(di60.m(disclaimerData, view.getContext()));
        final n0n n0nVar = new n0n();
        this.d.getImageView().setOnHoverListener(new View.OnHoverListener(n0nVar, this) { // from class: xsna.cv50
            public final /* synthetic */ dv50 a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnHoverListener
            public final boolean onHover(View view2, MotionEvent motionEvent) {
                View view3 = this.a.b;
                boolean b = n0n.b(view3, motionEvent);
                if (b) {
                    awt0.q(view3);
                }
                return b;
            }
        });
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.g;
    }

    @Override // xsna.a1n
    public final void U5() {
        this.i = true;
    }

    @Override // xsna.ii6
    public final void dispose() {
        MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto = this.c;
        zu50 zu50Var = myTargetNativeAdSinglePartUiDto != null ? myTargetNativeAdSinglePartUiDto.h : null;
        if (zu50Var != null) {
            zu50Var.k = null;
            ckz0 ckz0Var = zu50Var.h;
            if (ckz0Var != null) {
                ckz0Var.m(null);
            }
        }
        this.e.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
        if (zu50Var != null) {
            zu50Var.n = null;
            ckz0 ckz0Var2 = zu50Var.h;
            if (ckz0Var2 != null) {
                ckz0Var2.l(null);
            }
        }
        Iterator<DurationView> it = this.k.iterator();
        while (it.hasNext()) {
            DurationView next = it.next();
            ViewParent parent = next.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(next);
            }
        }
    }

    @Override // xsna.ii6
    public final s4e0 j0() {
        return null;
    }

    @Override // xsna.ii6
    public final void j2(NewsEntry newsEntry, MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto) {
        zu50 zu50Var;
        this.c = myTargetNativeAdSinglePartUiDto;
        cw50 cw50Var = myTargetNativeAdSinglePartUiDto.i;
        if (cw50Var == null || (zu50Var = myTargetNativeAdSinglePartUiDto.h) == null) {
            return;
        }
        this.e.setVisibility(0);
        MediaAdView mediaAdView = this.d;
        mediaAdView.setVisibility(0);
        this.f.setVisibility(0);
        mediaAdView.setBackgroundColor(f870.H(l5g.j));
        mediaAdView.getCollageView().setFrameSpace(cn70.b(2));
        CollageView collageView = mediaAdView.getCollageView();
        Map<Integer, String> map = myTargetNativeAdSinglePartUiDto.w;
        if (map != null && !map.isEmpty()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            boolean isLaidOut = collageView.isLaidOut();
            ArrayList<DurationView> arrayList = this.k;
            FrameLayout.LayoutParams layoutParams = this.j;
            if (isLaidOut) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    String value = entry.getValue();
                    FrameLayout a2 = collageView.a(intValue);
                    if (a2 != null) {
                        DurationView durationView = arrayList.get(intValue);
                        if (a2.getWidth() > iah0.a(120)) {
                            durationView.setText(value);
                        } else {
                            durationView.setText("");
                        }
                        ViewParent parent = durationView.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(durationView);
                        }
                        a2.addView(durationView, layoutParams);
                    }
                }
            } else {
                collageView.addOnLayoutChangeListener(new ucq(map, collageView, arrayList, layoutParams));
            }
        }
        CollageView collageView2 = mediaAdView.getCollageView();
        e0g e0gVar = cw50Var.A;
        if (e0gVar != null) {
            ArrayList arrayList2 = e0gVar.a;
            Drawable a3 = dhr0.t.a(R.drawable.my_target_ad_collage_frame_decoration);
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                FrameLayout a4 = collageView2.a(i);
                View a5 = a4 != null ? mxt0.a(0, a4) : null;
                if (a5 instanceof ImageView) {
                    ((ImageView) a5).setForeground(a3);
                }
            }
        }
        r1g r1gVar = new r1g(this.h);
        zu50Var.n = r1gVar;
        ckz0 ckz0Var = zu50Var.h;
        if (ckz0Var != null) {
            ckz0Var.l(r1gVar);
        }
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.i;
    }
}
