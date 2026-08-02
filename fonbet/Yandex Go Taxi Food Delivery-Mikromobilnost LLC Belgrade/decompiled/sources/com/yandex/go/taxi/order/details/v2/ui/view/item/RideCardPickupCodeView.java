package com.yandex.go.taxi.order.details.v2.ui.view.item;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.b;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardPickupCodeView;
import defpackage.c6w;
import defpackage.i3y;
import defpackage.qje;
import defpackage.scc;
import defpackage.sjk0;
import defpackage.sls;
import defpackage.usg0;
import defpackage.vlk0;
import defpackage.w0d;
import defpackage.wlk0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002DI\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000b2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0014¢\u0006\u0004\b#\u0010\rJ\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001b\u00102\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001b\u00105\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u001b\u00108\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010<R\u001b\u0010@\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010)\u001a\u0004\b?\u0010<R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00120A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010)\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010)\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/RideCardPickupCodeView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "initializeView", "()V", "", "char", "Landroid/graphics/drawable/Drawable;", "pinBoxBackground", "Lcom/yandex/go/design/view/GoFrameLayout;", "createPinBox", "(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Lcom/yandex/go/design/view/GoFrameLayout;", "invalidateInternal", "pinCode", "renderCode", "(Ljava/lang/CharSequence;)V", "text", "renderText", "", "shouldInitialize", "setShouldInitializeImmediately", "(Z)V", "Lkotlin/Function0;", "listener", "setClickListener", "(Lsls;)V", "onAttachedToWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "dp4$delegate", "Li3y;", "getDp4", "()I", "dp4", "dp8$delegate", "getDp8", "dp8", "dp16$delegate", "getDp16", "dp16", "dp32$delegate", "getDp32", "dp32", "dp40$delegate", "getDp40", "dp40", "", "pinBoxRadius$delegate", "getPinBoxRadius", "()F", "pinBoxRadius", "codeViewRadius$delegate", "getCodeViewRadius", "codeViewRadius", "", "pinViews", "Ljava/util/List;", "vlk0", "clickableAccessibilityDelegate$delegate", "getClickableAccessibilityDelegate", "()Lvlk0;", "clickableAccessibilityDelegate", "wlk0", "unclickableAccessibilityDelegate$delegate", "getUnclickableAccessibilityDelegate", "()Lwlk0;", "unclickableAccessibilityDelegate", "Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardPickupCodeView extends GoLinearLayout {
    public static final int $stable = 8;

    /* renamed from: clickableAccessibilityDelegate$delegate, reason: from kotlin metadata */
    private final i3y clickableAccessibilityDelegate;

    /* renamed from: codeViewRadius$delegate, reason: from kotlin metadata */
    private final i3y codeViewRadius;

    /* renamed from: dp16$delegate, reason: from kotlin metadata */
    private final i3y dp16;

    /* renamed from: dp32$delegate, reason: from kotlin metadata */
    private final i3y dp32;

    /* renamed from: dp4$delegate, reason: from kotlin metadata */
    private final i3y dp4;

    /* renamed from: dp40$delegate, reason: from kotlin metadata */
    private final i3y dp40;

    /* renamed from: dp8$delegate, reason: from kotlin metadata */
    private final i3y dp8;

    /* renamed from: pinBoxRadius$delegate, reason: from kotlin metadata */
    private final i3y pinBoxRadius;
    private final List<GoFrameLayout> pinViews;
    private final RobotoTextView textView;

    /* renamed from: unclickableAccessibilityDelegate$delegate, reason: from kotlin metadata */
    private final i3y unclickableAccessibilityDelegate;

    public RideCardPickupCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        final int i3 = 0;
        sls slsVar = new sls(this) { // from class: ulk0
            public final /* synthetic */ RideCardPickupCodeView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int dp4_delegate$lambda$0;
                int dp8_delegate$lambda$0;
                int dp16_delegate$lambda$0;
                int dp32_delegate$lambda$0;
                int dp40_delegate$lambda$0;
                float pinBoxRadius_delegate$lambda$0;
                float codeViewRadius_delegate$lambda$0;
                int i4 = i3;
                RideCardPickupCodeView rideCardPickupCodeView = this.b;
                switch (i4) {
                    case 0:
                        dp4_delegate$lambda$0 = RideCardPickupCodeView.dp4_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp4_delegate$lambda$0);
                    case 1:
                        dp8_delegate$lambda$0 = RideCardPickupCodeView.dp8_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp8_delegate$lambda$0);
                    case 2:
                        dp16_delegate$lambda$0 = RideCardPickupCodeView.dp16_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp16_delegate$lambda$0);
                    case 3:
                        dp32_delegate$lambda$0 = RideCardPickupCodeView.dp32_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp32_delegate$lambda$0);
                    case 4:
                        dp40_delegate$lambda$0 = RideCardPickupCodeView.dp40_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp40_delegate$lambda$0);
                    case 5:
                        pinBoxRadius_delegate$lambda$0 = RideCardPickupCodeView.pinBoxRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(pinBoxRadius_delegate$lambda$0);
                    default:
                        codeViewRadius_delegate$lambda$0 = RideCardPickupCodeView.codeViewRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(codeViewRadius_delegate$lambda$0);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.dp4 = a.b(lazyThreadSafetyMode, slsVar);
        final int i4 = 1;
        this.dp8 = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ulk0
            public final /* synthetic */ RideCardPickupCodeView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int dp4_delegate$lambda$0;
                int dp8_delegate$lambda$0;
                int dp16_delegate$lambda$0;
                int dp32_delegate$lambda$0;
                int dp40_delegate$lambda$0;
                float pinBoxRadius_delegate$lambda$0;
                float codeViewRadius_delegate$lambda$0;
                int i42 = i4;
                RideCardPickupCodeView rideCardPickupCodeView = this.b;
                switch (i42) {
                    case 0:
                        dp4_delegate$lambda$0 = RideCardPickupCodeView.dp4_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp4_delegate$lambda$0);
                    case 1:
                        dp8_delegate$lambda$0 = RideCardPickupCodeView.dp8_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp8_delegate$lambda$0);
                    case 2:
                        dp16_delegate$lambda$0 = RideCardPickupCodeView.dp16_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp16_delegate$lambda$0);
                    case 3:
                        dp32_delegate$lambda$0 = RideCardPickupCodeView.dp32_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp32_delegate$lambda$0);
                    case 4:
                        dp40_delegate$lambda$0 = RideCardPickupCodeView.dp40_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp40_delegate$lambda$0);
                    case 5:
                        pinBoxRadius_delegate$lambda$0 = RideCardPickupCodeView.pinBoxRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(pinBoxRadius_delegate$lambda$0);
                    default:
                        codeViewRadius_delegate$lambda$0 = RideCardPickupCodeView.codeViewRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(codeViewRadius_delegate$lambda$0);
                }
            }
        });
        final int i5 = 2;
        this.dp16 = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ulk0
            public final /* synthetic */ RideCardPickupCodeView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int dp4_delegate$lambda$0;
                int dp8_delegate$lambda$0;
                int dp16_delegate$lambda$0;
                int dp32_delegate$lambda$0;
                int dp40_delegate$lambda$0;
                float pinBoxRadius_delegate$lambda$0;
                float codeViewRadius_delegate$lambda$0;
                int i42 = i5;
                RideCardPickupCodeView rideCardPickupCodeView = this.b;
                switch (i42) {
                    case 0:
                        dp4_delegate$lambda$0 = RideCardPickupCodeView.dp4_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp4_delegate$lambda$0);
                    case 1:
                        dp8_delegate$lambda$0 = RideCardPickupCodeView.dp8_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp8_delegate$lambda$0);
                    case 2:
                        dp16_delegate$lambda$0 = RideCardPickupCodeView.dp16_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp16_delegate$lambda$0);
                    case 3:
                        dp32_delegate$lambda$0 = RideCardPickupCodeView.dp32_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp32_delegate$lambda$0);
                    case 4:
                        dp40_delegate$lambda$0 = RideCardPickupCodeView.dp40_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp40_delegate$lambda$0);
                    case 5:
                        pinBoxRadius_delegate$lambda$0 = RideCardPickupCodeView.pinBoxRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(pinBoxRadius_delegate$lambda$0);
                    default:
                        codeViewRadius_delegate$lambda$0 = RideCardPickupCodeView.codeViewRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(codeViewRadius_delegate$lambda$0);
                }
            }
        });
        final int i6 = 3;
        this.dp32 = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ulk0
            public final /* synthetic */ RideCardPickupCodeView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int dp4_delegate$lambda$0;
                int dp8_delegate$lambda$0;
                int dp16_delegate$lambda$0;
                int dp32_delegate$lambda$0;
                int dp40_delegate$lambda$0;
                float pinBoxRadius_delegate$lambda$0;
                float codeViewRadius_delegate$lambda$0;
                int i42 = i6;
                RideCardPickupCodeView rideCardPickupCodeView = this.b;
                switch (i42) {
                    case 0:
                        dp4_delegate$lambda$0 = RideCardPickupCodeView.dp4_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp4_delegate$lambda$0);
                    case 1:
                        dp8_delegate$lambda$0 = RideCardPickupCodeView.dp8_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp8_delegate$lambda$0);
                    case 2:
                        dp16_delegate$lambda$0 = RideCardPickupCodeView.dp16_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp16_delegate$lambda$0);
                    case 3:
                        dp32_delegate$lambda$0 = RideCardPickupCodeView.dp32_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp32_delegate$lambda$0);
                    case 4:
                        dp40_delegate$lambda$0 = RideCardPickupCodeView.dp40_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp40_delegate$lambda$0);
                    case 5:
                        pinBoxRadius_delegate$lambda$0 = RideCardPickupCodeView.pinBoxRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(pinBoxRadius_delegate$lambda$0);
                    default:
                        codeViewRadius_delegate$lambda$0 = RideCardPickupCodeView.codeViewRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(codeViewRadius_delegate$lambda$0);
                }
            }
        });
        final int i7 = 4;
        this.dp40 = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ulk0
            public final /* synthetic */ RideCardPickupCodeView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int dp4_delegate$lambda$0;
                int dp8_delegate$lambda$0;
                int dp16_delegate$lambda$0;
                int dp32_delegate$lambda$0;
                int dp40_delegate$lambda$0;
                float pinBoxRadius_delegate$lambda$0;
                float codeViewRadius_delegate$lambda$0;
                int i42 = i7;
                RideCardPickupCodeView rideCardPickupCodeView = this.b;
                switch (i42) {
                    case 0:
                        dp4_delegate$lambda$0 = RideCardPickupCodeView.dp4_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp4_delegate$lambda$0);
                    case 1:
                        dp8_delegate$lambda$0 = RideCardPickupCodeView.dp8_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp8_delegate$lambda$0);
                    case 2:
                        dp16_delegate$lambda$0 = RideCardPickupCodeView.dp16_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp16_delegate$lambda$0);
                    case 3:
                        dp32_delegate$lambda$0 = RideCardPickupCodeView.dp32_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp32_delegate$lambda$0);
                    case 4:
                        dp40_delegate$lambda$0 = RideCardPickupCodeView.dp40_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp40_delegate$lambda$0);
                    case 5:
                        pinBoxRadius_delegate$lambda$0 = RideCardPickupCodeView.pinBoxRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(pinBoxRadius_delegate$lambda$0);
                    default:
                        codeViewRadius_delegate$lambda$0 = RideCardPickupCodeView.codeViewRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(codeViewRadius_delegate$lambda$0);
                }
            }
        });
        final int i8 = 5;
        this.pinBoxRadius = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ulk0
            public final /* synthetic */ RideCardPickupCodeView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int dp4_delegate$lambda$0;
                int dp8_delegate$lambda$0;
                int dp16_delegate$lambda$0;
                int dp32_delegate$lambda$0;
                int dp40_delegate$lambda$0;
                float pinBoxRadius_delegate$lambda$0;
                float codeViewRadius_delegate$lambda$0;
                int i42 = i8;
                RideCardPickupCodeView rideCardPickupCodeView = this.b;
                switch (i42) {
                    case 0:
                        dp4_delegate$lambda$0 = RideCardPickupCodeView.dp4_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp4_delegate$lambda$0);
                    case 1:
                        dp8_delegate$lambda$0 = RideCardPickupCodeView.dp8_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp8_delegate$lambda$0);
                    case 2:
                        dp16_delegate$lambda$0 = RideCardPickupCodeView.dp16_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp16_delegate$lambda$0);
                    case 3:
                        dp32_delegate$lambda$0 = RideCardPickupCodeView.dp32_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp32_delegate$lambda$0);
                    case 4:
                        dp40_delegate$lambda$0 = RideCardPickupCodeView.dp40_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp40_delegate$lambda$0);
                    case 5:
                        pinBoxRadius_delegate$lambda$0 = RideCardPickupCodeView.pinBoxRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(pinBoxRadius_delegate$lambda$0);
                    default:
                        codeViewRadius_delegate$lambda$0 = RideCardPickupCodeView.codeViewRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(codeViewRadius_delegate$lambda$0);
                }
            }
        });
        final int i9 = 6;
        this.codeViewRadius = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ulk0
            public final /* synthetic */ RideCardPickupCodeView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int dp4_delegate$lambda$0;
                int dp8_delegate$lambda$0;
                int dp16_delegate$lambda$0;
                int dp32_delegate$lambda$0;
                int dp40_delegate$lambda$0;
                float pinBoxRadius_delegate$lambda$0;
                float codeViewRadius_delegate$lambda$0;
                int i42 = i9;
                RideCardPickupCodeView rideCardPickupCodeView = this.b;
                switch (i42) {
                    case 0:
                        dp4_delegate$lambda$0 = RideCardPickupCodeView.dp4_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp4_delegate$lambda$0);
                    case 1:
                        dp8_delegate$lambda$0 = RideCardPickupCodeView.dp8_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp8_delegate$lambda$0);
                    case 2:
                        dp16_delegate$lambda$0 = RideCardPickupCodeView.dp16_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp16_delegate$lambda$0);
                    case 3:
                        dp32_delegate$lambda$0 = RideCardPickupCodeView.dp32_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp32_delegate$lambda$0);
                    case 4:
                        dp40_delegate$lambda$0 = RideCardPickupCodeView.dp40_delegate$lambda$0(rideCardPickupCodeView);
                        return Integer.valueOf(dp40_delegate$lambda$0);
                    case 5:
                        pinBoxRadius_delegate$lambda$0 = RideCardPickupCodeView.pinBoxRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(pinBoxRadius_delegate$lambda$0);
                    default:
                        codeViewRadius_delegate$lambda$0 = RideCardPickupCodeView.codeViewRadius_delegate$lambda$0(rideCardPickupCodeView);
                        return Float.valueOf(codeViewRadius_delegate$lambda$0);
                }
            }
        });
        this.pinViews = new ArrayList();
        this.clickableAccessibilityDelegate = a.a(new sjk0(21));
        this.unclickableAccessibilityDelegate = a.a(new sjk0(22));
        RobotoTextView robotoTextView = new RobotoTextView(context, attributeSet, i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        robotoTextView.setMaxLines(2);
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        robotoTextView.setImportantForAccessibility(2);
        this.textView = robotoTextView;
        b.p(this, getUnclickableAccessibilityDelegate());
        addView(robotoTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vlk0 clickableAccessibilityDelegate_delegate$lambda$0() {
        return new vlk0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float codeViewRadius_delegate$lambda$0(RideCardPickupCodeView rideCardPickupCodeView) {
        return c.d(usg0.ride_card_pickup_code_radius, rideCardPickupCodeView);
    }

    private final GoFrameLayout createPinBox(CharSequence r8, Drawable pinBoxBackground) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 0;
        GoFrameLayout goFrameLayout = new GoFrameLayout(getContext(), null, 0, i, 14, defaultConstructorMarker);
        goFrameLayout.setBackground(pinBoxBackground);
        RobotoTextView robotoTextView = new RobotoTextView(goFrameLayout.getContext(), null, i, 6, defaultConstructorMarker);
        robotoTextView.setGravity(17);
        robotoTextView.setText(r8);
        robotoTextView.setClickable(false);
        goFrameLayout.setClickable(false);
        goFrameLayout.setImportantForAccessibility(2);
        goFrameLayout.addView(robotoTextView);
        return goFrameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp16_delegate$lambda$0(RideCardPickupCodeView rideCardPickupCodeView) {
        return c.h(16, rideCardPickupCodeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp32_delegate$lambda$0(RideCardPickupCodeView rideCardPickupCodeView) {
        return c.h(32, rideCardPickupCodeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp40_delegate$lambda$0(RideCardPickupCodeView rideCardPickupCodeView) {
        return c.h(40, rideCardPickupCodeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp4_delegate$lambda$0(RideCardPickupCodeView rideCardPickupCodeView) {
        return c.h(4, rideCardPickupCodeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp8_delegate$lambda$0(RideCardPickupCodeView rideCardPickupCodeView) {
        return c.h(8, rideCardPickupCodeView);
    }

    private final vlk0 getClickableAccessibilityDelegate() {
        return (vlk0) this.clickableAccessibilityDelegate.getValue();
    }

    private final float getCodeViewRadius() {
        return ((Number) this.codeViewRadius.getValue()).floatValue();
    }

    private final int getDp16() {
        return ((Number) this.dp16.getValue()).intValue();
    }

    private final int getDp32() {
        return ((Number) this.dp32.getValue()).intValue();
    }

    private final int getDp4() {
        return ((Number) this.dp4.getValue()).intValue();
    }

    private final int getDp40() {
        return ((Number) this.dp40.getValue()).intValue();
    }

    private final int getDp8() {
        return ((Number) this.dp8.getValue()).intValue();
    }

    private final float getPinBoxRadius() {
        return ((Number) this.pinBoxRadius.getValue()).floatValue();
    }

    private final wlk0 getUnclickableAccessibilityDelegate() {
        return (wlk0) this.unclickableAccessibilityDelegate.getValue();
    }

    private final void initializeView() {
        setOrientation(0);
        setGravity(17);
        setPaddingRelative(getDp16(), getPaddingTop(), getDp8(), getPaddingBottom());
        invalidateInternal();
    }

    private final void invalidateInternal() {
        w0d w0dVar = new w0d();
        w0dVar.h = getCodeViewRadius();
        w0dVar.a = qje.t(xng0.controlMinor, getContext());
        setBackground(w0dVar.a());
        if (this.pinViews.isEmpty()) {
            return;
        }
        w0d w0dVar2 = new w0d();
        w0dVar2.h = getPinBoxRadius();
        w0dVar2.a = qje.t(xng0.bgInvert, getContext());
        Drawable a = w0dVar2.a();
        Iterator<T> it = this.pinViews.iterator();
        while (it.hasNext()) {
            ((GoFrameLayout) it.next()).setBackground(a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float pinBoxRadius_delegate$lambda$0(RideCardPickupCodeView rideCardPickupCodeView) {
        return c.d(usg0.ride_card_pin_box_radius, rideCardPickupCodeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wlk0 unclickableAccessibilityDelegate_delegate$lambda$0() {
        return new wlk0();
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        invalidateInternal();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        initializeView();
        super.onAttachedToWindow();
    }

    public final void renderCode(CharSequence pinCode) {
        w0d w0dVar = new w0d();
        w0dVar.h = getPinBoxRadius();
        w0dVar.a = qje.t(xng0.bgInvert, getContext());
        Drawable a = w0dVar.a();
        c6w it = (xw31.n(getContext()) ? y6i0.i(pinCode.length() - 1, 0) : y6i0.n(0, pinCode.length())).iterator();
        int i = 0;
        while (it.c) {
            int nextInt = it.nextInt();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            CharSequence subSequence = pinCode.subSequence(nextInt, nextInt + 1);
            if (i < this.pinViews.size()) {
                GoFrameLayout goFrameLayout = this.pinViews.get(i);
                goFrameLayout.setVisibility(0);
                View childAt = goFrameLayout.getChildAt(0);
                RobotoTextView robotoTextView = childAt instanceof RobotoTextView ? (RobotoTextView) childAt : null;
                if (robotoTextView != null) {
                    robotoTextView.setText(subSequence);
                }
            } else {
                GoFrameLayout createPinBox = createPinBox(subSequence, a);
                this.pinViews.add(createPinBox);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getDp32(), getDp40());
                if (i == 0) {
                    int dp16 = getDp16();
                    int dp8 = getDp8();
                    int dp82 = getDp8();
                    layoutParams.setMarginStart(dp16);
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dp8;
                    layoutParams.setMarginEnd(0);
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dp82;
                } else {
                    layoutParams.setMarginStart(getDp4());
                }
                addView(createPinBox, layoutParams);
            }
            i = i2;
        }
        int size = this.pinViews.size();
        for (int length = pinCode.length(); length < size; length++) {
            this.pinViews.get(length).setVisibility(8);
        }
    }

    public final void renderText(CharSequence text) {
        this.textView.setText(text);
    }

    public final void setClickListener(sls listener) {
        if (listener != null) {
            c.z(listener, this);
            b.p(this, getClickableAccessibilityDelegate());
        } else {
            setOnClickListener(null);
            b.p(this, getUnclickableAccessibilityDelegate());
        }
    }

    public final void setShouldInitializeImmediately(boolean shouldInitialize) {
        if (shouldInitialize) {
            initializeView();
        }
    }

    public /* synthetic */ RideCardPickupCodeView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
