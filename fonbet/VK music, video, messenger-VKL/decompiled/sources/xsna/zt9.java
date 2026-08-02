package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.EmptyBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import com.vk.superapp.ui.uniwidgets.dto.CardUniWidget;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.e3m;
import xsna.g4q0;
import xsna.j3q0;
import xsna.w1w0;

/* compiled from: CardUniConstructor.kt */
/* loaded from: classes6.dex */
public final class zt9 extends j3q0<CardUniWidget> {
    public final g4q0.a h;
    public final w1w0.a i;
    public View j;
    public View k;
    public View l;
    public View m;
    public View n;
    public View o;
    public final int p = iah0.a(16);
    public View q;

    public zt9(g4q0.a aVar, w1w0.a aVar2) {
        this.h = aVar;
        this.i = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, xsna.j3q0, xsna.zt9] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View, android.widget.TextView] */
    @Override // xsna.j3q0
    public final cpx0 k(Context context) {
        View view;
        Space space;
        String str;
        String str2;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.vk_uni_widget_card);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a(constraintLayout);
        b(constraintLayout);
        Object obj = this.b;
        if (obj == null) {
            obj = null;
        }
        CardUniWidget.CardData cardData = ((CardUniWidget) obj).s;
        BaseBlock baseBlock = cardData.b;
        ImageBlock imageBlock = cardData.c;
        j3q0.b t = t(baseBlock, cardData.h, context, constraintLayout);
        this.j = t.a;
        Object obj2 = this.b;
        if (obj2 == null) {
            obj2 = null;
        }
        CardUniWidget.Animation animation = ((CardUniWidget) obj2).r.f;
        if (animation == null || (str = animation.b) == null || str.length() <= 0) {
            view = v(imageBlock, constraintLayout);
        } else {
            Object obj3 = this.b;
            if (obj3 == null) {
                obj3 = null;
            }
            CardUniWidget.Animation animation2 = ((CardUniWidget) obj3).r.f;
            View view2 = this.q;
            if (view2 != null) {
                constraintLayout.removeView(view2);
                this.q = null;
            }
            if (animation2 == null || (str2 = animation2.b) == null || str2.length() <= 0) {
                view = v(imageBlock, constraintLayout);
            } else {
                wex0 wex0Var = e370.n;
                if (wex0Var == null) {
                    wex0Var = null;
                }
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                final xt9 xt9Var = new xt9(this, imageBlock, constraintLayout, 0);
                wex0Var.getClass();
                LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
                lottieAnimationView.s0(str2, (String) j5g.i0(drm0.c0(str2, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)));
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.setScaleType(scaleType);
                lottieAnimationView.setFailureListener(new r800() { // from class: xsna.tex0
                    @Override // xsna.r800
                    public final void onResult(Object obj4) {
                        xt9.this.invoke();
                    }
                });
                lottieAnimationView.setId(R.id.vk_uni_widget_card_image);
                e3m.a aVar = e3m.a;
                lottieAnimationView.setBackground(m33.a(R.drawable.vk_bg_skeleton_6dp, context));
                lottieAnimationView.setClipToOutline(true);
                lottieAnimationView.setOutlineProvider(new yt9(iah0.a(6)));
                this.q = lottieAnimationView;
                constraintLayout.addView(lottieAnimationView);
                x(lottieAnimationView, constraintLayout);
                int i = animation2.c;
                if (i == -1) {
                    lottieAnimationView.m0();
                    view = lottieAnimationView;
                } else {
                    lottieAnimationView.setRepeatCount(i - 1);
                    lottieAnimationView.m0();
                    view = lottieAnimationView;
                }
            }
        }
        this.k = view;
        BaseBlock baseBlock2 = cardData.d;
        if (baseBlock2 instanceof TextBlock) {
            ?? textView = new TextView(constraintLayout.getContext());
            textView.setId(R.id.vk_uni_widget_card_title);
            textView.setMaxLines(2);
            TextBlock textBlock = (TextBlock) baseBlock2;
            SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
            if (superappTextStylesBridge == null) {
                superappTextStylesBridge = null;
            }
            i(textView, textBlock, superappTextStylesBridge.i());
            space = textView;
        } else {
            Space space2 = new Space(constraintLayout.getContext());
            space2.setId(View.generateViewId());
            space = space2;
        }
        int a = baseBlock2 instanceof EmptyBlock ? 0 : iah0.a(9);
        constraintLayout.addView(space);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.p(space.getId(), 0);
        int id = space.getId();
        View view3 = this.k;
        if (view3 == null) {
            view3 = null;
        }
        bVar.l(id, 3, view3.getId(), 4, a);
        bVar.l(space.getId(), 6, 0, 6, this.p);
        bVar.l(space.getId(), 7, 0, 7, this.p);
        bVar.b(constraintLayout);
        this.l = space;
        View w = w(cardData.e, constraintLayout, R.id.vk_uni_widget_card_subtitle, space);
        this.m = w;
        this.n = w(cardData.f, constraintLayout, R.id.vk_uni_widget_card_second_subtitle, w);
        Object obj4 = this.b;
        BaseBlock baseBlock3 = ((CardUniWidget) (obj4 != null ? obj4 : null)).s.g;
        Object obj5 = obj4;
        if (obj4 == null) {
            obj5 = null;
        }
        this.o = s(baseBlock3, context, constraintLayout, ((CardUniWidget) obj5).r.e.d, true);
        androidx.constraintlayout.widget.b a2 = pq.a(constraintLayout);
        View view4 = this.n;
        if (view4 == null) {
            view4 = null;
        }
        int id2 = view4.getId();
        View view5 = this.o;
        if (view5 == null) {
            view5 = null;
        }
        a2.k(id2, 4, view5.getId(), 3);
        a2.b(constraintLayout);
        View view6 = this.j;
        return new cpx0(constraintLayout, view6 == null ? null : view6, t.b, t.c, null);
    }

    @Override // xsna.j3q0
    public final u7n0 o() {
        return this.i;
    }

    @Override // xsna.j3q0
    public final g4q0.a r() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View v(ImageBlock imageBlock, ConstraintLayout constraintLayout) {
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(constraintLayout.getContext());
        com.vk.core.ui.image.c cVar = (com.vk.core.ui.image.c) create;
        cVar.getView().setId(R.id.vk_uni_widget_card_image);
        Object obj = this.b;
        uhw uhwVar = new uhw(create, imageBlock.b, ((CardUniWidget) (obj != null ? obj : null)).t ? new VKImageController.b(6.0f, null, false, R.drawable.vk_default_placeholder_6, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 61422) : new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, R.drawable.vk_default_placeholder, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 61423), 0);
        uhwVar.run();
        View view = cVar.getView();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = view.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = view.getMeasuredHeight();
        f4m.a(view, new aab(view, ref$IntRef, ref$IntRef2, uhwVar, 1));
        View view2 = cVar.getView();
        constraintLayout.addView(view2);
        x(view2, constraintLayout);
        return view2;
    }

    public final View w(BaseBlock baseBlock, ConstraintLayout constraintLayout, int i, View view) {
        View view2;
        if (baseBlock instanceof TextBlock) {
            TextView textView = new TextView(constraintLayout.getContext());
            textView.setId(i);
            textView.setMaxLines(3);
            TextBlock textBlock = (TextBlock) baseBlock;
            SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
            if (superappTextStylesBridge == null) {
                superappTextStylesBridge = null;
            }
            i(textView, textBlock, superappTextStylesBridge.g());
            view2 = textView;
        } else {
            Space space = new Space(constraintLayout.getContext());
            space.setId(View.generateViewId());
            view2 = space;
        }
        constraintLayout.addView(view2);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.p(view2.getId(), 0);
        bVar.l(view2.getId(), 3, view.getId(), 4, iah0.a(1));
        bVar.l(view2.getId(), 6, 0, 6, this.p);
        bVar.l(view2.getId(), 7, 0, 7, this.p);
        bVar.b(constraintLayout);
        return view2;
    }

    public final void x(View view, ConstraintLayout constraintLayout) {
        Object obj = this.b;
        if (obj == null) {
            obj = null;
        }
        int i = ((CardUniWidget) obj).t ? this.p : 0;
        androidx.constraintlayout.widget.b a = pq.a(constraintLayout);
        a.p(view.getId(), 0);
        a.n(view.getId(), 0);
        a.C(view.getId(), "5:2");
        int id = view.getId();
        View view2 = this.j;
        a.k(id, 3, (view2 != null ? view2 : null).getId(), 4);
        a.l(view.getId(), 6, 0, 6, i);
        a.l(view.getId(), 7, 0, 7, i);
        a.b(constraintLayout);
    }
}
