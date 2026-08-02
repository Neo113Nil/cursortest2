package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.reactions.impl.set_reaction.SetReactionViewHolderDelegate;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.r1f0;
import xsna.z1f0;

/* compiled from: ReactionPickerFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class v1f0 implements r1f0 {
    public static final int[] d = {229, 5, 5, 229};
    public static final float[] e = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.03f, 0.97f, 1.0f};
    public static final Object f;
    public static final Object g;
    public final hbw a;
    public final zaw b;
    public final paw c;

    /* compiled from: ReactionPickerFactoryImpl.kt */
    public static final class a {
    }

    /* compiled from: ReactionPickerFactoryImpl.kt */
    public static final class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), cn70.c(40));
            view.setClipToOutline(true);
        }
    }

    /* compiled from: ReactionPickerFactoryImpl.kt */
    public static final class c extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), cn70.c(40));
            view.setClipToOutline(true);
        }
    }

    static {
        yo80 yo80Var = new yo80(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        f = msy.a(lazyThreadSafetyMode, yo80Var);
        g = msy.a(lazyThreadSafetyMode, new zo80(2));
    }

    public v1f0(hbw hbwVar, cbw cbwVar, uaw uawVar) {
        this.a = hbwVar;
        this.b = cbwVar;
        this.c = uawVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    public static void g(FrameLayout frameLayout, ViewGroup viewGroup, boolean z, int i) {
        View i2 = i(cn70.b(10), frameLayout.getContext());
        i2.setId(((Number) f.getValue()).intValue());
        i2.setTranslationX(-cn70.b(9));
        i2.setTranslationY(z ? i + cn70.b(4) : -cn70.b(14));
        View i3 = i(cn70.b(24), frameLayout.getContext());
        i3.setId(((Number) g.getValue()).intValue());
        i3.setTranslationX(-cn70.b(2));
        i3.setTranslationY(z ? i - cn70.b(22) : -cn70.b(2));
        frameLayout.addView(i2, 0);
        frameLayout.addView(i3, 1);
        frameLayout.setBackground(null);
        frameLayout.setForeground(null);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToOutline(false);
        frameLayout.setOutlineProvider(null);
        frameLayout.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(h(i2), h(i3), h(viewGroup));
        animatorSet.start();
    }

    public static ValueAnimator h(View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(70L);
        ofFloat.addUpdateListener(new qrn(view, 2));
        return ofFloat;
    }

    public static View i(int i, Context context) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        pcc pccVar = new pcc(dhr0.t.c(R.attr.vk_ui_background_modal));
        pccVar.d = false;
        view.setBackground(pccVar);
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return view;
    }

    public static int[] j(Context context) {
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(Integer.valueOf(n8g.l(e3m.f(R.attr.vk_ui_background_modal, context), d[i])));
        }
        return j5g.N0(arrayList);
    }

    public static void k(FrameLayout frameLayout) {
        frameLayout.setBackground(xus.a(cn70.c(40), e3m.f(R.attr.vk_ui_background_modal, frameLayout.getContext()), 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE));
        frameLayout.setOutlineProvider(new c());
        if (Build.VERSION.SDK_INT >= 29) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(j(frameLayout.getContext()), e);
            frameLayout.setForeground(gradientDrawable);
        }
        frameLayout.setVisibility(0);
    }

    @Override // xsna.r1f0
    public final q1f0 a(r1f0.b bVar) {
        FrameLayout frameLayout = bVar.a;
        boolean z = bVar.b;
        onb onbVar = bVar.c;
        String str = bVar.d;
        Msg msg = bVar.e;
        if (bVar.f) {
            FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
            frameLayout2.setElevation(cn70.a() * 3.0f);
            frameLayout.addView(frameLayout2);
            f4m.u(frameLayout2, cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(8));
            SetReactionViewHolderDelegate setReactionViewHolderDelegate = new SetReactionViewHolderDelegate(this.a, this.b, this.c, msg, z, false, true, onbVar, new daz(10), null, str, SetReactionViewHolderDelegate.StaticSizeStyle.AlwaysExpanded, 1024);
            setReactionViewHolderDelegate.a(frameLayout2, new brj0(0, 0, null, 0, null, false, false, null, 0, null, null, null, null, null, 131070), new z6u(16));
            k(frameLayout2);
            return setReactionViewHolderDelegate;
        }
        z1f0 z1f0Var = new z1f0(frameLayout.getContext());
        z1f0Var.setElevation(cn70.a() * 3.0f);
        frameLayout.addView(z1f0Var);
        f4m.u(z1f0Var, cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(8));
        Msg msg2 = bVar.e;
        z1f0Var.E(new z1f0.a(this.b, msg2, bVar.b, true, new u1f0(this, msg2, bVar.d, onbVar, 0), null, null, z1f0.b.C4151b.a, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE));
        z1f0Var.D(j(frameLayout.getContext()), e);
        return z1f0Var;
    }

    @Override // xsna.r1f0
    public final q1f0 b(r1f0.c cVar) {
        FrameLayout frameLayout = cVar.a;
        boolean z = cVar.b;
        boolean z2 = cVar.c;
        boolean z3 = cVar.d;
        wzs<Integer, Integer, s3q0> wzsVar = cVar.e;
        String str = cVar.f;
        Msg msg = cVar.g;
        gzs<s3q0> gzsVar = cVar.h;
        if (cVar.i) {
            FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
            frameLayout2.setElevation(cn70.a() * 3.0f);
            frameLayout.addView(frameLayout2);
            f4m.u(frameLayout2, cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(8));
            SetReactionViewHolderDelegate setReactionViewHolderDelegate = new SetReactionViewHolderDelegate(this.a, this.b, this.c, msg, z, z2, z3, wzsVar, gzsVar, null, str, null, 5120);
            setReactionViewHolderDelegate.a(frameLayout2, new brj0(0, 0, null, 0, null, false, false, null, 0, null, null, null, null, null, 131070), new dam(26));
            k(frameLayout2);
            return setReactionViewHolderDelegate;
        }
        z1f0 z1f0Var = new z1f0(frameLayout.getContext());
        frameLayout.addView(z1f0Var);
        z1f0Var.setElevation(cn70.a() * 3.0f);
        f4m.u(z1f0Var, cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(0));
        Msg msg2 = cVar.g;
        z1f0Var.E(new z1f0.a(this.b, msg2, cVar.b, cVar.d, new u1f0(this, msg2, cVar.f, wzsVar, 0), gzsVar, null, null, 400));
        z1f0Var.D(j(frameLayout.getContext()), e);
        return z1f0Var;
    }

    @Override // xsna.r1f0
    public final q1f0 c(r1f0.d dVar) {
        FrameLayout frameLayout = dVar.a;
        boolean z = dVar.b;
        boolean z2 = dVar.c;
        w70 w70Var = dVar.d;
        String str = dVar.e;
        View view = dVar.f;
        MsgFromUser msgFromUser = dVar.g;
        if (dVar.h) {
            view.getLocationInWindow(new int[2]);
            ViewGroup viewGroup = (ViewGroup) frameLayout.getParent();
            viewGroup.getLocationInWindow(new int[2]);
            float b2 = (r3[1] - r2[1]) - cn70.b(72);
            if (b2 < cn70.b(3)) {
                b2 = cn70.a() * 3.0f;
            }
            frameLayout.setY(b2);
            if (iah0.f().widthPixels > cn70.b(480)) {
                frameLayout.getLayoutParams().width = cn70.b(440);
            } else {
                frameLayout.getLayoutParams().width = -1;
            }
            SetReactionViewHolderDelegate setReactionViewHolderDelegate = new SetReactionViewHolderDelegate(this.a, this.b, this.c, msgFromUser, z, false, z2, w70Var, null, new s1f0(0, frameLayout, viewGroup), str, null, 4608);
            setReactionViewHolderDelegate.a(frameLayout, new brj0(0, 0, null, 0, null, false, false, null, 0, null, null, null, null, null, 131070), new cd10(12));
            k(frameLayout);
            return setReactionViewHolderDelegate;
        }
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.getParent();
        view.getLocationInWindow(new int[2]);
        viewGroup2.getLocationInWindow(new int[2]);
        float b3 = (r3[1] - r2[1]) - cn70.b(56);
        if (b3 < cn70.b(3)) {
            b3 = cn70.a() * 3.0f;
        }
        frameLayout.setY(b3);
        if (iah0.f().widthPixels > cn70.b(480)) {
            frameLayout.getLayoutParams().width = cn70.b(440);
        } else {
            frameLayout.getLayoutParams().width = -1;
        }
        defpackage.b0 b0Var = new defpackage.b0(26, frameLayout, viewGroup2);
        z1f0 z1f0Var = new z1f0(frameLayout.getContext());
        frameLayout.addView(z1f0Var);
        MsgFromUser msgFromUser2 = dVar.g;
        z1f0Var.E(new z1f0.a(this.b, msgFromUser2, dVar.b, dVar.c, new u1f0(this, msgFromUser2, dVar.e, w70Var, 0), null, b0Var, null, 336));
        z1f0Var.D(j(frameLayout.getContext()), e);
        frameLayout.setVisibility(0);
        return z1f0Var;
    }

    @Override // xsna.r1f0
    public final q1f0 d(r1f0.e eVar) {
        mq0 mq0Var = eVar.d;
        MsgFromUser msgFromUser = eVar.g;
        final FrameLayout frameLayout = eVar.a;
        final View view = eVar.f;
        k9b k9bVar = eVar.h;
        Rect e2 = f4m.e(view);
        Rect e3 = f4m.e((ViewGroup) frameLayout.getParent());
        frameLayout.removeAllViews();
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = (cn70.b(4) + (bwt0.O(view) + (view.getMeasuredWidth() + e2.left))) - e3.left;
        frameLayout.setLayoutParams(marginLayoutParams);
        final float f2 = e2.top - e3.top;
        final int b2 = cn70.b(22);
        final int dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(R.dimen.vkim_reactions_items_list_height);
        final boolean z = f2 - ((float) (b2 + dimensionPixelSize)) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        frameLayout.getLayoutParams().width = iah0.f().widthPixels > cn70.b(480) ? cn70.b(440) : -1;
        izs izsVar = new izs() { // from class: xsna.t1f0
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int u0;
                int intValue = ((Integer) obj).intValue();
                int[] iArr = v1f0.d;
                int i = dimensionPixelSize;
                float f3 = f2;
                boolean z2 = z;
                int i2 = b2;
                View view2 = view;
                FrameLayout frameLayout2 = frameLayout;
                if (intValue > i) {
                    float f4 = f3 - (i2 + intValue);
                    boolean z3 = f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (z2 && z3) {
                        View findViewById = frameLayout2.findViewById(((Number) v1f0.f.getValue()).intValue());
                        if (findViewById != null) {
                            findViewById.setTranslationY(intValue + cn70.b(4));
                        }
                        View findViewById2 = frameLayout2.findViewById(((Number) v1f0.g.getValue()).intValue());
                        if (findViewById2 != null) {
                            findViewById2.setTranslationY(intValue - cn70.b(22));
                        }
                        f3 = f4;
                    } else if (z2 && !z3) {
                        f3 = frameLayout2.getY();
                        View findViewById3 = frameLayout2.findViewById(((Number) v1f0.f.getValue()).intValue());
                        if (findViewById3 != null) {
                            bwt0.p0(findViewById3, false);
                        }
                        View findViewById4 = frameLayout2.findViewById(((Number) v1f0.g.getValue()).intValue());
                        if (findViewById4 != null) {
                            bwt0.p0(findViewById4, false);
                        }
                    } else if (!z2 && !z3) {
                        u0 = bwt0.u0(view2);
                        f3 += u0 + i2;
                    }
                } else if (z2) {
                    f3 -= i2 + intValue;
                } else {
                    u0 = bwt0.u0(view2);
                    f3 += u0 + i2;
                }
                frameLayout2.setY(f3);
                return s3q0.a;
            }
        };
        if (!eVar.i) {
            z1f0 z1f0Var = new z1f0(frameLayout.getContext());
            z1f0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            z1f0Var.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            z1f0Var.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            z1f0Var.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            frameLayout.addView(z1f0Var);
            z1f0Var.setOnMoreClicked(new ye80(this, frameLayout, k9bVar, z1f0Var));
            z1f0Var.E(new z1f0.a(this.b, msgFromUser, eVar.b, eVar.c, new u1f0(this, msgFromUser, eVar.e, mq0Var, 0), null, izsVar, null, 320));
            z1f0Var.D(null, null);
            g(frameLayout, z1f0Var, z, dimensionPixelSize);
            return z1f0Var;
        }
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        frameLayout2.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        frameLayout2.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        frameLayout2.setBackground(xus.a(cn70.c(40), dhr0.t.c(R.attr.vk_ui_background_modal), 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE));
        frameLayout2.setOutlineProvider(new b());
        frameLayout.addView(frameLayout2);
        SetReactionViewHolderDelegate setReactionViewHolderDelegate = new SetReactionViewHolderDelegate(this.a, this.b, this.c, msgFromUser, eVar.b, false, eVar.c, mq0Var, null, izsVar, eVar.e, null, 4608);
        setReactionViewHolderDelegate.j = new akd0(this, frameLayout, k9bVar, setReactionViewHolderDelegate);
        setReactionViewHolderDelegate.a(frameLayout2, new brj0(0, 0, null, 0, null, false, false, null, 0, null, null, null, null, null, 131070), new ehu(25));
        g(frameLayout, frameLayout2, z, dimensionPixelSize);
        return setReactionViewHolderDelegate;
    }

    @Override // xsna.r1f0
    public final String e(int i, Context context) {
        return enj.f(R.plurals.im_reacted_peers_count, i, context);
    }

    @Override // xsna.r1f0
    public final q1f0 f(r1f0.a aVar) {
        FrameLayout frameLayout = aVar.a;
        boolean z = aVar.b;
        l6 l6Var = aVar.c;
        String str = aVar.d;
        Msg msg = aVar.e;
        no noVar = aVar.f;
        if (aVar.g) {
            SetReactionViewHolderDelegate setReactionViewHolderDelegate = new SetReactionViewHolderDelegate(this.a, this.b, this.c, msg, z, false, false, l6Var, noVar, null, str, SetReactionViewHolderDelegate.StaticSizeStyle.AlwaysCollapsed, 1024);
            setReactionViewHolderDelegate.a(frameLayout, new brj0(0, 0, null, 0, null, false, false, null, 0, null, null, null, null, null, 131070), new s6x(25));
            return setReactionViewHolderDelegate;
        }
        z1f0 z1f0Var = new z1f0(frameLayout.getContext());
        frameLayout.addView(z1f0Var);
        Msg msg2 = aVar.e;
        z1f0Var.E(new z1f0.a(this.b, msg2, aVar.b, false, new u1f0(this, msg2, aVar.d, l6Var, 0), noVar, null, new z1f0.b.a(cn70.b(48), cn70.b(32), cn70.b(6), cn70.b(8)), 144));
        return z1f0Var;
    }
}
