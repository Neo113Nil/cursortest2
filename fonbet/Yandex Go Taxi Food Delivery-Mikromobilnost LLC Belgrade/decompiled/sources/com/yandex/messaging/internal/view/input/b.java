package com.yandex.messaging.internal.view.input;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.bubbles.BubblePopupWindow;
import com.yandex.bubbles.BubbleStyle;
import defpackage.ci;
import defpackage.d5b0;
import defpackage.di;
import defpackage.dmg0;
import defpackage.e3n;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.kp50;
import defpackage.ksg0;
import defpackage.lkh0;
import defpackage.mgh0;
import defpackage.mgu;
import defpackage.nxg0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.sls;
import defpackage.ug;
import defpackage.v6e0;
import defpackage.w0w;
import defpackage.w511;
import defpackage.w6e0;
import defpackage.xwg;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public final class b {
    public static final long e;
    public static final /* synthetic */ int f = 0;
    public final SharedPreferences a;
    public final String b;
    public final int c;
    public com.yandex.bubbles.b d;

    static {
        o430 o430Var = e3n.b;
        e = kp50.U(8, DurationUnit.SECONDS);
    }

    public b(int i, SharedPreferences sharedPreferences, String str) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = i;
    }

    public final void a(boolean z) {
        BubblePopupWindow bubblePopupWindow;
        com.yandex.bubbles.b bVar = this.d;
        if (z) {
            if (bVar != null && (bubblePopupWindow = bVar.e) != null) {
                bubblePopupWindow.forceDismiss();
            }
        } else if (bVar != null) {
            bVar.a();
        }
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(w0w w0wVar, ContinuationImpl continuationImpl) {
        InputTooltipController$showTooltip$2 inputTooltipController$showTooltip$2;
        int i;
        zy11 zy11Var;
        boolean z;
        b bVar = this;
        if (continuationImpl instanceof InputTooltipController$showTooltip$2) {
            inputTooltipController$showTooltip$2 = (InputTooltipController$showTooltip$2) continuationImpl;
            int i2 = inputTooltipController$showTooltip$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inputTooltipController$showTooltip$2.label = i2 - Integer.MIN_VALUE;
                Object obj = inputTooltipController$showTooltip$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inputTooltipController$showTooltip$2.label;
                zy11 zy11Var2 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bVar.a.getBoolean(bVar.b, false)) {
                        return zy11Var2;
                    }
                    bVar.a(false);
                    View view = w0wVar.a;
                    Context context = view.getContext();
                    com.yandex.bubbles.c cVar = new com.yandex.bubbles.c(0);
                    Integer num = w0wVar.b;
                    if (num == null) {
                        num = Integer.valueOf(bVar.c);
                    }
                    cVar.a = num;
                    Integer valueOf = Integer.valueOf(fxa1.c(jng0.messagingTooltipColor, view.getContext()).data);
                    mgu mguVar = new mgu(9, w0wVar, bVar);
                    Integer num2 = cVar.a;
                    Point point = cVar.c;
                    sls slsVar = cVar.d;
                    BubbleStyle bubbleStyle = cVar.b;
                    com.yandex.bubbles.b bVar2 = new com.yandex.bubbles.b(context, num2, bubbleStyle, valueOf, point, slsVar, mguVar);
                    bVar2.g = view;
                    final View inflate = LayoutInflater.from(context).inflate(lkh0.bubble_content, (ViewGroup) null);
                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(mgh0.bubble_background);
                    TextView textView = (TextView) inflate.findViewById(mgh0.bubble_message);
                    Button button = (Button) inflate.findViewById(mgh0.bubble_positive);
                    Button button2 = (Button) inflate.findViewById(mgh0.bubble_negative);
                    View findViewById = inflate.findViewById(mgh0.bubble_divider);
                    ImageView imageView = (ImageView) inflate.findViewById(mgh0.bubble_arrow);
                    zy11Var = zy11Var2;
                    LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(mgh0.bubble_layout_buttons);
                    ImageView imageView2 = (ImageView) inflate.findViewById(mgh0.bubble_close);
                    if (num2 == null) {
                        ny61.g("message or messageId should be specified");
                        return null;
                    }
                    textView.setText(num2.intValue());
                    int i3 = w6e0.a[bubbleStyle.ordinal()];
                    int i4 = 2;
                    InputTooltipController$showTooltip$2 inputTooltipController$showTooltip$22 = inputTooltipController$showTooltip$2;
                    if (i3 == 1) {
                        int intValue = valueOf.intValue();
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                        imageView.setColorFilter(intValue, mode);
                        linearLayout.getBackground().setColorFilter(intValue, mode);
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        imageView.setVisibility(8);
                        linearLayout.setBackgroundResource(nxg0.bubble_style_dark);
                    }
                    button.setVisibility(8);
                    button2.setVisibility(8);
                    findViewById.setVisibility(8);
                    linearLayout2.setGravity(17);
                    ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                    layoutParams.width = -1;
                    button.setLayoutParams(layoutParams);
                    bVar2.f = new v6e0(bVar2, imageView, view, inflate, 0);
                    inflate.startAnimation(AnimationUtils.loadAnimation(context, dmg0.popup_in));
                    inflate.setOnClickListener(new d5b0(16, bVar2));
                    imageView2.setVisibility(8);
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = context.getResources().getDimensionPixelSize(ksg0.bubble_text_horizontal_padding);
                    imageView2.setOnClickListener(null);
                    inflate.getViewTreeObserver().addOnPreDrawListener(bVar2.f);
                    view.getViewTreeObserver().addOnPreDrawListener(bVar2.f);
                    int i5 = (int) ((context.getResources().getDisplayMetrics().widthPixels * 4.0d) / 5.0d);
                    if (imageView2.getWidth() + textView.getMaxWidth() > i5) {
                        textView.setMaxWidth(i5 - imageView2.getWidth());
                    }
                    mguVar.invoke(textView);
                    BubblePopupWindow bubblePopupWindow = new BubblePopupWindow(inflate, -2, -2);
                    bubblePopupWindow.setInputMethodMode(2);
                    bubblePopupWindow.setOutsideTouchable(false);
                    bubblePopupWindow.setFocusable(false);
                    bubblePopupWindow.setBackgroundDrawable(null);
                    bubblePopupWindow.setOnDismissListener(new xwg(1, bVar2));
                    bubblePopupWindow.showAtLocation(view, 0, 0, 0);
                    androidx.core.view.b.p(inflate, new ug(inflate, i4));
                    int i6 = di.a;
                    if (inflate.isAttachedToWindow()) {
                        inflate.postDelayed(new ci(inflate, 0), 100L);
                    } else {
                        inflate.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.alicekit.core.accessibility.AccessibilityUtils$gainAccessibilityFocusWhenAttached$$inlined$doOnAttach$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View view2) {
                                inflate.removeOnAttachStateChangeListener(this);
                                View view3 = inflate;
                                view3.postDelayed(new ci(view3, 0), 100L);
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View view2) {
                            }
                        });
                    }
                    bVar2.e = bubblePopupWindow;
                    bVar.d = bVar2;
                    long j = w0wVar.c;
                    inputTooltipController$showTooltip$22.L$0 = bVar;
                    inputTooltipController$showTooltip$22.label = 1;
                    if (kotlinx.coroutines.a.j(j, inputTooltipController$showTooltip$22) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z = false;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) inputTooltipController$showTooltip$2.L$0;
                    kotlin.b.b(obj);
                    zy11Var = zy11Var2;
                    z = false;
                }
                bVar.a(z);
                return zy11Var;
            }
        }
        inputTooltipController$showTooltip$2 = new InputTooltipController$showTooltip$2(bVar, continuationImpl);
        Object obj2 = inputTooltipController$showTooltip$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inputTooltipController$showTooltip$2.label;
        zy11 zy11Var22 = zy11.a;
        if (i != 0) {
        }
        bVar.a(z);
        return zy11Var;
    }
}
