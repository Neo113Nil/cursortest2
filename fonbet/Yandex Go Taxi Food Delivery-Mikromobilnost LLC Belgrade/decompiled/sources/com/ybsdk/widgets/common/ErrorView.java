package com.ybsdk.widgets.common;

import android.content.Context;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.bvf0;
import defpackage.c5b1;
import defpackage.cma1;
import defpackage.dv9;
import defpackage.fch0;
import defpackage.h161;
import defpackage.iqp0;
import defpackage.jao;
import defpackage.kao;
import defpackage.lcb1;
import defpackage.ljo;
import defpackage.lzz0;
import defpackage.njb;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rje;
import defpackage.rtu;
import defpackage.sls;
import defpackage.sm91;
import defpackage.tje;
import defpackage.tls;
import defpackage.trp0;
import defpackage.tse;
import defpackage.ung0;
import defpackage.v4b1;
import defpackage.vsn;
import defpackage.vvg0;
import defpackage.x4c;
import defpackage.xty0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ;2\u00020\u0001:\u0002\r<B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\n2\u0016\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/ybsdk/widgets/common/ErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onDetachedFromWindow", "()V", "Lkao;", ClidProvider.STATE, "render", "(Lkao;)V", "Lkotlin/Function1;", "", "listener", "setHyperLinkOnClickListener", "(Ltls;)V", "Lkotlin/Function0;", "setPrimaryButtonOnClickListener", "(Lsls;)V", "setSecondaryButtonClickListener", "setCloseButtonClickListener", "", "throwable", "setErrorIconClickListener", "(Ljava/lang/Throwable;)V", "", "withDelay", "changeVisibility", "(Lkao;Z)V", "wasVisible", "reportVisibility", "(ZLkao;)V", "traceId", "renderTraceId", "(Ljava/lang/String;)V", "changeVisibilityWithDelay", "Z", "getChangeVisibilityWithDelay", "()Z", "setChangeVisibilityWithDelay", "(Z)V", "Ltse;", "mainScope", "Ltse;", "Lh161;", "binding", "Lh161;", "errorViewState", "Lkao;", "Landroid/widget/ImageView;", "getYbLogo", "()Landroid/widget/ImageView;", "ybLogo", "Companion", "jao", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorView extends ConstraintLayout {
    public static final jao Companion = new jao();
    private static final long ERROR_LAYOUT_DELAY = 300;
    private static boolean isCopyingStackTraceEnabled;
    private final h161 binding;
    private boolean changeVisibilityWithDelay;
    private kao errorViewState;
    private final tse mainScope;

    public ErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.changeVisibilityWithDelay = true;
        this.mainScope = bvf0.b();
        LayoutInflater.from(context).inflate(poh0.ybsdk_error_layout, this);
        int i2 = fch0.errorCloseButton;
        CloseButtonView closeButtonView = (CloseButtonView) cma1.O(i2, this);
        if (closeButtonView != null) {
            i2 = fch0.errorIcon;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = fch0.errorRetryButton;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
                if (ybButtonView != null) {
                    i2 = fch0.errorRetryButtonCentral;
                    YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i2, this);
                    if (ybButtonView2 != null) {
                        i2 = fch0.errorSecondaryButton;
                        YbButtonView ybButtonView3 = (YbButtonView) cma1.O(i2, this);
                        if (ybButtonView3 != null) {
                            i2 = fch0.errorText;
                            TextView textView = (TextView) cma1.O(i2, this);
                            if (textView != null) {
                                i2 = fch0.errorTextSubtitle;
                                TextView textView2 = (TextView) cma1.O(i2, this);
                                if (textView2 != null) {
                                    i2 = fch0.errorTextViewTraceId;
                                    TraceIdErrorView traceIdErrorView = (TraceIdErrorView) cma1.O(i2, this);
                                    if (traceIdErrorView != null) {
                                        i2 = fch0.hyperlinkText;
                                        TextView textView3 = (TextView) cma1.O(i2, this);
                                        if (textView3 != null) {
                                            i2 = fch0.ybLogoErrorView;
                                            ImageView imageView2 = (ImageView) cma1.O(i2, this);
                                            if (imageView2 != null) {
                                                this.binding = new h161(this, closeButtonView, imageView, ybButtonView, ybButtonView2, ybButtonView3, textView, textView2, traceIdErrorView, textView3, imageView2);
                                                setVisibility(8);
                                                setClickable(true);
                                                TypedValue typedValue = new TypedValue();
                                                context.getTheme().resolveAttribute(ung0.ybColor_background_primary, typedValue, true);
                                                setBackgroundColor(typedValue.data);
                                                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), com.ybsdk.core.utils.ext.view.b.h(vvg0.ybsdk_screen_footer_space_error_view, this));
                                                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void changeVisibility(kao state, boolean withDelay) {
        tje.N(this.mainScope, null, null, new ErrorView$changeVisibility$1(state != null, this, withDelay, getVisibility() == 0, state, null), 3);
    }

    public static /* synthetic */ void changeVisibility$default(ErrorView errorView, kao kaoVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        errorView.changeVisibility(kaoVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$5$lambda$2(kao kaoVar, YbButtonView.a aVar) {
        return new YbButtonView.a(kaoVar.e, null, null, kaoVar.i, kaoVar.h, null, null, false, false, null, 4070);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$5$lambda$3(kao kaoVar, YbButtonView.a aVar) {
        return new YbButtonView.a(kaoVar.e, null, null, kaoVar.i, kaoVar.h, null, null, false, false, null, 4070);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$5$lambda$4(kao kaoVar, YbButtonView.a aVar) {
        return new YbButtonView.a(kaoVar.f, null, null, kaoVar.k, kaoVar.j, null, null, false, false, null, 4070);
    }

    private final void renderTraceId(String traceId) {
        if (traceId != null) {
            this.binding.i.render(new lzz0(traceId));
        }
        this.binding.i.setVisibility(traceId != null ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportVisibility(boolean wasVisible, kao state) {
        boolean z = state != null;
        if (wasVisible || !z) {
            return;
        }
        String b = c5b1.b(this);
        if (b == null) {
            x4c.g("There is no screen_tag in view hierarchy", null, null, null, 14);
            b = "<no screen tag>";
        }
        trp0 trp0Var = trp0.a;
        trp0.e(new iqp0(state.p, b, state.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCloseButtonClickListener$lambda$10(sls slsVar, View view) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    private final void setErrorIconClickListener(Throwable throwable) {
        h161 h161Var = this.binding;
        if (isCopyingStackTraceEnabled) {
            h161Var.c.setOnClickListener(new vsn(5, throwable, h161Var));
        } else {
            h161Var.c.setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setErrorIconClickListener$lambda$12$lambda$11(Throwable th, h161 h161Var, View view) {
        if (th == null) {
            rje.m(sm91.c(h161Var), "Error description is absent");
        } else {
            rje.b(sm91.c(h161Var), ljo.b(th), "ErrorView stacktrace description");
            rje.m(sm91.c(h161Var), "Error description was copied");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setHyperLinkOnClickListener$lambda$6(tls tlsVar, String str) {
        if (tlsVar != null) {
            tlsVar.invoke(str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPrimaryButtonOnClickListener$lambda$7(sls slsVar, View view) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPrimaryButtonOnClickListener$lambda$8(sls slsVar, View view) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSecondaryButtonClickListener$lambda$9(sls slsVar, View view) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public final boolean getChangeVisibilityWithDelay() {
        return this.changeVisibilityWithDelay;
    }

    public final ImageView getYbLogo() {
        return this.binding.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        kotlinx.coroutines.a.g(this.mainScope.getCoroutineContext(), null);
        super.onDetachedFromWindow();
    }

    public final void render(final kao state) {
        h161 h161Var = this.binding;
        changeVisibility(state, this.changeVisibilityWithDelay);
        if (state == null) {
            return;
        }
        ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity = state.g;
        this.errorViewState = state;
        final int i = 0;
        getYbLogo().setVisibility(state.n ? 0 : 8);
        v4b1.k(state.l, this.binding.c, null, null, 6);
        setErrorIconClickListener(state.a);
        TextView textView = h161Var.g;
        YbButtonView ybButtonView = h161Var.f;
        YbButtonView ybButtonView2 = h161Var.e;
        YbButtonView ybButtonView3 = h161Var.d;
        xty0.d(textView, state.c);
        xty0.d(h161Var.h, state.d);
        ybButtonView3.render(new tls() { // from class: iao
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                YbButtonView.a render$lambda$5$lambda$2;
                YbButtonView.a render$lambda$5$lambda$3;
                YbButtonView.a render$lambda$5$lambda$4;
                int i2 = i;
                kao kaoVar = state;
                YbButtonView.a aVar = (YbButtonView.a) obj;
                switch (i2) {
                    case 0:
                        render$lambda$5$lambda$2 = ErrorView.render$lambda$5$lambda$2(kaoVar, aVar);
                        return render$lambda$5$lambda$2;
                    case 1:
                        render$lambda$5$lambda$3 = ErrorView.render$lambda$5$lambda$3(kaoVar, aVar);
                        return render$lambda$5$lambda$3;
                    default:
                        render$lambda$5$lambda$4 = ErrorView.render$lambda$5$lambda$4(kaoVar, aVar);
                        return render$lambda$5$lambda$4;
                }
            }
        });
        final int i2 = 1;
        ybButtonView2.render(new tls() { // from class: iao
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                YbButtonView.a render$lambda$5$lambda$2;
                YbButtonView.a render$lambda$5$lambda$3;
                YbButtonView.a render$lambda$5$lambda$4;
                int i22 = i2;
                kao kaoVar = state;
                YbButtonView.a aVar = (YbButtonView.a) obj;
                switch (i22) {
                    case 0:
                        render$lambda$5$lambda$2 = ErrorView.render$lambda$5$lambda$2(kaoVar, aVar);
                        return render$lambda$5$lambda$2;
                    case 1:
                        render$lambda$5$lambda$3 = ErrorView.render$lambda$5$lambda$3(kaoVar, aVar);
                        return render$lambda$5$lambda$3;
                    default:
                        render$lambda$5$lambda$4 = ErrorView.render$lambda$5$lambda$4(kaoVar, aVar);
                        return render$lambda$5$lambda$4;
                }
            }
        });
        ybButtonView3.setVisibility((errorView$State$PrimaryButtonGravity == ErrorView$State$PrimaryButtonGravity.BOTTOM && com.ybsdk.core.utils.text.d.b(state.e)) ? 0 : 8);
        ybButtonView2.setVisibility(errorView$State$PrimaryButtonGravity == ErrorView$State$PrimaryButtonGravity.CENTER ? 0 : 8);
        final int i3 = 2;
        ybButtonView.render(new tls() { // from class: iao
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                YbButtonView.a render$lambda$5$lambda$2;
                YbButtonView.a render$lambda$5$lambda$3;
                YbButtonView.a render$lambda$5$lambda$4;
                int i22 = i3;
                kao kaoVar = state;
                YbButtonView.a aVar = (YbButtonView.a) obj;
                switch (i22) {
                    case 0:
                        render$lambda$5$lambda$2 = ErrorView.render$lambda$5$lambda$2(kaoVar, aVar);
                        return render$lambda$5$lambda$2;
                    case 1:
                        render$lambda$5$lambda$3 = ErrorView.render$lambda$5$lambda$3(kaoVar, aVar);
                        return render$lambda$5$lambda$3;
                    default:
                        render$lambda$5$lambda$4 = ErrorView.render$lambda$5$lambda$4(kaoVar, aVar);
                        return render$lambda$5$lambda$4;
                }
            }
        });
        ybButtonView.setVisibility(state.f != null ? 0 : 8);
        h161Var.b.setVisibility(state.o ? 0 : 8);
        renderTraceId(state.b);
        lcb1.d(this);
    }

    public final void setChangeVisibilityWithDelay(boolean z) {
        this.changeVisibilityWithDelay = z;
    }

    public final void setCloseButtonClickListener(sls listener) {
        this.binding.b.setOnClickListener(new njb(7, listener));
    }

    public final void setHyperLinkOnClickListener(tls listener) {
        Text text;
        TextView textView = this.binding.j;
        kao kaoVar = this.errorViewState;
        Spannable spannable = null;
        textView.setVisibility((kaoVar != null ? kaoVar.m : null) != null ? 0 : 8);
        TextView textView2 = this.binding.j;
        kao kaoVar2 = this.errorViewState;
        if (kaoVar2 != null && (text = kaoVar2.m) != null) {
            spannable = rtu.a(new dv9(29, listener), com.ybsdk.core.utils.text.d.a(getContext(), text).toString());
        }
        textView2.setText(spannable);
    }

    public final void setPrimaryButtonOnClickListener(sls listener) {
        this.binding.d.setOnClickListener(new njb(5, listener));
        this.binding.e.setOnClickListener(new njb(6, listener));
    }

    public final void setSecondaryButtonClickListener(sls listener) {
        this.binding.f.setOnClickListener(new njb(8, listener));
    }

    public ErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ErrorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
