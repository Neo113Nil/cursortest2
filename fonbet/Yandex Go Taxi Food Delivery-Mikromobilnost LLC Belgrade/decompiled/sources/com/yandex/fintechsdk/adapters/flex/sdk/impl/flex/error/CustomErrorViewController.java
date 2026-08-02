package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.error;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.error.CustomErrorViewController;
import defpackage.azl;
import defpackage.bbh;
import defpackage.dmh0;
import defpackage.jxl;
import defpackage.l1o;
import defpackage.mao;
import defpackage.n751;
import defpackage.np31;
import defpackage.op31;
import defpackage.pao;
import defpackage.sls;
import defpackage.tgh0;
import defpackage.u1w;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/error/CustomErrorViewController;", "Lmao;", "Ll1o;", "engineContext", "Lpao;", "errorViewFactory", "Lkotlin/Function0;", "Lzy11;", "onClose", "", "isBottomSheetWithOwnTopInset", "<init>", "(Ll1o;Lpao;Lsls;Lsls;)V", "Landroid/view/View;", "view", "applyWindowInsets", "(Landroid/view/View;)V", "Lu1w;", "systemBars", "applyInsetsToView", "(Landroid/view/View;Lu1w;)V", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "onDestroyView", "Lazl;", "errorDocument", "onDocumentError", "(Lazl;)V", "update", "onUpdateState", "(Lzy11;)V", "Ll1o;", "Lpao;", "Lsls;", "retryButton", "Landroid/view/View;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomErrorViewController extends mao {

    @Deprecated
    public static final int BOTTOM_PADDING_DP = 12;
    private static final Companion Companion = new Companion(null);
    private final l1o engineContext;
    private final pao errorViewFactory;
    private final sls isBottomSheetWithOwnTopInset;
    private final sls onClose;
    private View retryButton;

    public CustomErrorViewController(l1o l1oVar, pao paoVar, sls slsVar, sls slsVar2) {
        this.engineContext = l1oVar;
        this.errorViewFactory = paoVar;
        this.onClose = slsVar;
        this.isBottomSheetWithOwnTopInset = slsVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyInsetsToView(View view, u1w systemBars) {
        int i = (int) (12.0f * view.getContext().getResources().getDisplayMetrics().density);
        view.setPadding(view.getPaddingLeft(), ((Boolean) this.isBottomSheetWithOwnTopInset.invoke()).booleanValue() ? view.getPaddingTop() : systemBars.b, view.getPaddingRight(), i + systemBars.d);
    }

    private final void applyWindowInsets(final View view) {
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.error.CustomErrorViewController$applyWindowInsets$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    WeakHashMap weakHashMap = b.a;
                    n751 a = op31.a(view2);
                    if (a != null) {
                        this.applyInsetsToView(view2, a.a.g(519));
                    }
                    ViewCompat$Api21Impl.o(view2, new CustomErrorViewController$applyWindowInsets$1$2(this, view2));
                    np31.c(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
            return;
        }
        WeakHashMap weakHashMap = b.a;
        n751 a = op31.a(view);
        if (a != null) {
            applyInsetsToView(view, a.a.g(519));
        }
        ViewCompat$Api21Impl.o(view, new CustomErrorViewController$applyWindowInsets$1$2(this, view));
        np31.c(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(CustomErrorViewController customErrorViewController, View view) {
        customErrorViewController.onClose.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1(CustomErrorViewController customErrorViewController, View view) {
        view.setEnabled(false);
        customErrorViewController.engineContext.b.a(new jxl(true));
    }

    @Override // defpackage.ws11
    public View onCreateView(ViewGroup container) {
        ((bbh) this.errorViewFactory).getClass();
        final int i = 0;
        View inflate = LayoutInflater.from(container.getContext()).inflate(dmh0.finsdk_error_view_default, container, false);
        ViewGroup viewGroup = (ViewGroup) inflate;
        View findViewById = inflate.findViewById(tgh0.finsdkCloseButton);
        View findViewById2 = inflate.findViewById(tgh0.finsdkTryAgainButton);
        applyWindowInsets(viewGroup);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: hjf
                public final /* synthetic */ CustomErrorViewController b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    CustomErrorViewController customErrorViewController = this.b;
                    switch (i2) {
                        case 0:
                            CustomErrorViewController.onCreateView$lambda$0(customErrorViewController, view);
                            break;
                        default:
                            CustomErrorViewController.onCreateView$lambda$1(customErrorViewController, view);
                            break;
                    }
                }
            });
        }
        if (findViewById2 != null) {
            final int i2 = 1;
            findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: hjf
                public final /* synthetic */ CustomErrorViewController b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i2;
                    CustomErrorViewController customErrorViewController = this.b;
                    switch (i22) {
                        case 0:
                            CustomErrorViewController.onCreateView$lambda$0(customErrorViewController, view);
                            break;
                        default:
                            CustomErrorViewController.onCreateView$lambda$1(customErrorViewController, view);
                            break;
                    }
                }
            });
        }
        this.retryButton = findViewById2;
        return viewGroup;
    }

    @Override // defpackage.ws11
    public void onDestroyView(View view) {
        View view2 = this.retryButton;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        this.retryButton = null;
    }

    @Override // defpackage.mao
    public void onDocumentError(azl errorDocument) {
    }

    @Override // defpackage.ws11
    public void onUpdateState(zy11 update) {
        View view = this.retryButton;
        if (view != null) {
            view.setEnabled(true);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/error/CustomErrorViewController$Companion;", "", "<init>", "()V", "BOTTOM_PADDING_DP", "", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
