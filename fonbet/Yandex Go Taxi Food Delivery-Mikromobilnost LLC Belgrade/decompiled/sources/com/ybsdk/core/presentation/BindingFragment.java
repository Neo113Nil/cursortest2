package com.ybsdk.core.presentation;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.presentation.BindingFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.akf;
import defpackage.be4;
import defpackage.bkf;
import defpackage.bnp0;
import defpackage.bx60;
import defpackage.c5b1;
import defpackage.d8u0;
import defpackage.dab1;
import defpackage.ee4;
import defpackage.f8u0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.jw5;
import defpackage.k650;
import defpackage.kw5;
import defpackage.lrp0;
import defpackage.m650;
import defpackage.n751;
import defpackage.nlp0;
import defpackage.p5t0;
import defpackage.p7b1;
import defpackage.quz;
import defpackage.r5t0;
import defpackage.sls;
import defpackage.tfl0;
import defpackage.tls;
import defpackage.ung0;
import defpackage.wqq0;
import defpackage.x4c;
import defpackage.xa8;
import defpackage.xdr;
import defpackage.xx60;
import defpackage.yfl0;
import defpackage.yqq0;
import defpackage.z1x0;
import defpackage.za8;
import defpackage.zjf;
import defpackage.zo31;
import defpackage.zqq0;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000bBO\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH$¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J+\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u00020'*\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010.J\u001b\u00101\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020'0/¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020'0/¢\u0006\u0004\b3\u00102J#\u00106\u001a\u00020'2\u0006\u00105\u001a\u0002042\f\u00100\u001a\b\u0012\u0004\u0012\u00020'0/¢\u0006\u0004\b6\u00107J%\u00109\u001a\u00020'*\u00020$2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020'08¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020'*\u00020$2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020'08¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020'H\u0002¢\u0006\u0004\b<\u0010)J\u000f\u0010=\u001a\u00020'H\u0002¢\u0006\u0004\b=\u0010)J\u000f\u0010>\u001a\u00020'H\u0002¢\u0006\u0004\b>\u0010)J\u000f\u0010?\u001a\u00020'H\u0002¢\u0006\u0004\b?\u0010)J\u000f\u0010@\u001a\u00020'H\u0002¢\u0006\u0004\b@\u0010)J\u000f\u0010A\u001a\u00020'H\u0002¢\u0006\u0004\bA\u0010)J\u000f\u0010B\u001a\u00020'H\u0002¢\u0006\u0004\bB\u0010)R\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020L8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010UR*\u0010X\u001a\u00020\f2\u0006\u0010W\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010D\u001a\u0004\bX\u0010.\"\u0004\bY\u0010ZR.\u0010[\u001a\u0004\u0018\u00010\u000e2\b\u0010W\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010\u0015\u001a\u00020\f2\u0006\u0010W\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010D\u001a\u0004\b\u0015\u0010.\"\u0004\ba\u0010ZR*\u0010b\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR*\u0010i\u001a\u00020h2\u0006\u0010W\u001a\u00020h8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR*\u0010o\u001a\u00020h2\u0006\u0010W\u001a\u00020h8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010j\u001a\u0004\bp\u0010l\"\u0004\bq\u0010nR*\u0010\u0014\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR*\u0010x\u001a\u00020w2\u0006\u0010W\u001a\u00020w8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0013\u0010\u0081\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010.¨\u0006\u0082\u0001"}, d2 = {"Lcom/ybsdk/core/presentation/BindingFragment;", "Lzo31;", "VB", "Lcom/ybsdk/core/presentation/BaseThemeFragment;", "Lbe4;", "Lp5t0;", "Ld8u0;", "Lk650;", "Lxdr;", "Lwqq0;", "Lnlp0;", "Lzjf;", "", "backVisible", "", "softInputMode", "Lcom/ybsdk/core/utils/ColorModel;", "statusBarColor", "navigationBarColor", "Lyqq0;", "sensitiveDataMode", "isBackButtonEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;Lyqq0;Ljava/lang/Boolean;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lzo31;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lzy11;", "onDestroyView", "()V", "Landroidx/appcompat/app/AlertDialog$a;", "showAlertDialog", "(Landroidx/appcompat/app/AlertDialog$a;)V", "isViewDestroyed", "()Z", "Lkotlin/Function0;", "block", "doOnViewIsNotDestroyed", "(Lsls;)V", "safePost", "", "delayMillis", "safePostDelayed", "(JLsls;)V", "Lkotlin/Function1;", "safeDoOnLayout", "(Landroid/view/View;Ltls;)V", "safeDoOnNextLayout", "notifyBackButtonChanged", "notifyChangeSoftInputMode", "notifyChangeStatusBarColor", "notifyChangeNavigationBarColor", "notifyChangeSensitiveDataMode", "notifyCardBackgroundChanged", "reportWrongState", "isFragmentViewDestroyed", "Z", "_binding", "Lzo31;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "Lbkf;", "customHandlingInsetsBehaviourProvider$delegate", "Li3y;", "getCustomHandlingInsetsBehaviourProvider", "()Lbkf;", "customHandlingInsetsBehaviourProvider", "Ltfl0;", "router$delegate", "getRouter", "()Ltfl0;", "router", "value", "isBackButtonVisible", "setBackButtonVisible", "(Z)V", "backButtonColor", "Ljava/lang/Integer;", "getBackButtonColor", "()Ljava/lang/Integer;", "setBackButtonColor", "(Ljava/lang/Integer;)V", "setBackButtonEnabled", "softInputModeFlag", CA20Status.STATUS_USER_I, "getSoftInputModeFlag", "()I", "setSoftInputModeFlag", "(I)V", "Lz1x0;", "statusBarColorModel", "Lz1x0;", "getStatusBarColorModel", "()Lz1x0;", "setStatusBarColorModel", "(Lz1x0;)V", "navigationBarColorModel", "getNavigationBarColorModel", "setNavigationBarColorModel", "Lyqq0;", "getSensitiveDataMode", "()Lyqq0;", "setSensitiveDataMode", "(Lyqq0;)V", "Lza8;", "sdkBackground", "Lza8;", "getSdkBackground", "()Lza8;", "setSdkBackground", "(Lza8;)V", "getBinding", "()Lzo31;", "binding", "isNewInsetsHandlingEnabled", "core-presentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BindingFragment<VB extends zo31> extends BaseThemeFragment implements be4, p5t0, d8u0, k650, xdr, wqq0, nlp0, zjf {
    private VB _binding;
    private Integer backButtonColor;

    /* renamed from: customHandlingInsetsBehaviourProvider$delegate, reason: from kotlin metadata */
    private final i3y customHandlingInsetsBehaviourProvider;
    private final Handler handler;
    private boolean isBackButtonEnabled;
    private boolean isBackButtonVisible;
    private boolean isFragmentViewDestroyed;
    private z1x0 navigationBarColorModel;

    /* renamed from: router$delegate, reason: from kotlin metadata */
    private final i3y router;
    private za8 sdkBackground;
    private yqq0 sensitiveDataMode;
    private int softInputModeFlag;
    private z1x0 statusBarColorModel;

    public BindingFragment(Boolean bool, Integer num, ColorModel colorModel, ColorModel colorModel2, yqq0 yqq0Var, Boolean bool2) {
        this.handler = new Handler(Looper.getMainLooper());
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.customHandlingInsetsBehaviourProvider = a.b(lazyThreadSafetyMode, new sls(this) { // from class: hw5
            public final /* synthetic */ BindingFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                bkf customHandlingInsetsBehaviourProvider_delegate$lambda$1;
                tfl0 router_delegate$lambda$2;
                int i2 = i;
                BindingFragment bindingFragment = this.b;
                switch (i2) {
                    case 0:
                        customHandlingInsetsBehaviourProvider_delegate$lambda$1 = BindingFragment.customHandlingInsetsBehaviourProvider_delegate$lambda$1(bindingFragment);
                        return customHandlingInsetsBehaviourProvider_delegate$lambda$1;
                    default:
                        router_delegate$lambda$2 = BindingFragment.router_delegate$lambda$2(bindingFragment);
                        return router_delegate$lambda$2;
                }
            }
        });
        final char c = 1 == true ? 1 : 0;
        this.router = a.b(lazyThreadSafetyMode, new sls(this) { // from class: hw5
            public final /* synthetic */ BindingFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                bkf customHandlingInsetsBehaviourProvider_delegate$lambda$1;
                tfl0 router_delegate$lambda$2;
                int i2 = c;
                BindingFragment bindingFragment = this.b;
                switch (i2) {
                    case 0:
                        customHandlingInsetsBehaviourProvider_delegate$lambda$1 = BindingFragment.customHandlingInsetsBehaviourProvider_delegate$lambda$1(bindingFragment);
                        return customHandlingInsetsBehaviourProvider_delegate$lambda$1;
                    default:
                        router_delegate$lambda$2 = BindingFragment.router_delegate$lambda$2(bindingFragment);
                        return router_delegate$lambda$2;
                }
            }
        });
        this.isBackButtonVisible = bool != null ? bool.booleanValue() : true;
        this.isBackButtonEnabled = bool2 != null ? bool2.booleanValue() : true;
        this.softInputModeFlag = num != null ? num.intValue() : 16;
        this.statusBarColorModel = new z1x0(colorModel == null ? new ColorModel.Attr(ung0.ybColor_background_primary) : colorModel, null);
        this.navigationBarColorModel = new z1x0(colorModel2 == null ? new ColorModel.Attr(ung0.ybColor_background_primary) : colorModel2, null);
        this.sensitiveDataMode = yqq0Var == null ? dab1.Q : yqq0Var;
        this.sdkBackground = xa8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bkf customHandlingInsetsBehaviourProvider_delegate$lambda$1(BindingFragment bindingFragment) {
        Object obj;
        BindingFragment bindingFragment2 = bindingFragment;
        while (true) {
            if (bindingFragment2 != null) {
                try {
                    if (bindingFragment2 instanceof bkf) {
                        obj = bindingFragment2;
                        break;
                    }
                    bindingFragment2 = bindingFragment2.getParentFragment();
                } catch (Throwable th) {
                    x4c.g("Can`t find Fragment or Activity with CustomInsetsHandlingFlagProvider", th, null, Collections.singletonList(lrp0.m), 4);
                    return akf.a;
                }
            } else {
                FragmentActivity activity = bindingFragment.getActivity();
                if (!(activity instanceof bkf)) {
                    activity = null;
                }
                bkf bkfVar = (bkf) activity;
                obj = bkfVar;
                if (bkfVar == null) {
                    throw new IllegalStateException(("No " + bkf.class.getSimpleName() + " found").toString());
                }
            }
        }
        return (bkf) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private final void notifyBackButtonChanged() {
        ?? r0 = this;
        while (true) {
            if (r0 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof ee4)) {
                    activity = null;
                }
                ee4 ee4Var = (ee4) activity;
                r0 = ee4Var == null ? 0 : ee4Var;
            } else if (r0 instanceof ee4) {
                break;
            } else {
                r0 = r0.getParentFragment();
            }
        }
        ee4 ee4Var2 = (ee4) r0;
        if (ee4Var2 != null) {
            ee4Var2.invalidateBackButton();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private final void notifyCardBackgroundChanged() {
        ?? r0 = this;
        while (true) {
            if (r0 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof bnp0)) {
                    activity = null;
                }
                bnp0 bnp0Var = (bnp0) activity;
                r0 = bnp0Var == null ? 0 : bnp0Var;
            } else if (r0 instanceof bnp0) {
                break;
            } else {
                r0 = r0.getParentFragment();
            }
        }
        bnp0 bnp0Var2 = (bnp0) r0;
        if (bnp0Var2 != null) {
            bnp0Var2.updateBackground();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private final void notifyChangeNavigationBarColor() {
        ?? r0 = this;
        while (true) {
            if (r0 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof m650)) {
                    activity = null;
                }
                m650 m650Var = (m650) activity;
                r0 = m650Var == null ? 0 : m650Var;
            } else if (r0 instanceof m650) {
                break;
            } else {
                r0 = r0.getParentFragment();
            }
        }
        m650 m650Var2 = (m650) r0;
        if (m650Var2 != null) {
            m650Var2.updateNavigationBarColor();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [zqq0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private final void notifyChangeSensitiveDataMode() {
        ?? r0 = this;
        while (true) {
            if (r0 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof zqq0)) {
                    activity = null;
                }
                r0 = (zqq0) activity;
                if (r0 == 0) {
                    r0 = 0;
                }
            } else if (r0 instanceof zqq0) {
                break;
            } else {
                r0 = r0.getParentFragment();
            }
        }
        zqq0 zqq0Var = (zqq0) r0;
        if (zqq0Var != null) {
            zqq0Var.updateSensitiveDataMode(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private final void notifyChangeSoftInputMode() {
        ?? r0 = this;
        while (true) {
            if (r0 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof r5t0)) {
                    activity = null;
                }
                r5t0 r5t0Var = (r5t0) activity;
                r0 = r5t0Var == null ? 0 : r5t0Var;
            } else if (r0 instanceof r5t0) {
                break;
            } else {
                r0 = r0.getParentFragment();
            }
        }
        r5t0 r5t0Var2 = (r5t0) r0;
        if (r5t0Var2 != null) {
            r5t0Var2.updateSoftInputMode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private final void notifyChangeStatusBarColor() {
        ?? r0 = this;
        while (true) {
            if (r0 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof f8u0)) {
                    activity = null;
                }
                f8u0 f8u0Var = (f8u0) activity;
                r0 = f8u0Var == null ? 0 : f8u0Var;
            } else if (r0 instanceof f8u0) {
                break;
            } else {
                r0 = r0.getParentFragment();
            }
        }
        f8u0 f8u0Var2 = (f8u0) r0;
        if (f8u0Var2 != null) {
            f8u0Var2.updateStatusBarColor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 onCreateView$lambda$7$lambda$4(BindingFragment bindingFragment, View view, n751 n751Var) {
        n751 onApplyInsets;
        n751 n751Var2 = !n751Var.equals(n751.b) ? n751Var : null;
        return (n751Var2 == null || (onApplyInsets = bindingFragment.onApplyInsets(n751Var2)) == null) ? n751Var : onApplyInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 onCreateView$lambda$7$lambda$6(BindingFragment bindingFragment, View view, n751 n751Var) {
        return bindingFragment.onApplyInsets(n751Var);
    }

    private final void reportWrongState() {
        IllegalStateException illegalStateException = new IllegalStateException("");
        VB vb = this._binding;
        if (vb == null) {
            vb = null;
        }
        x4c.g("Getting binding when fragment view was destroyed", illegalStateException, g8e.o("Screen tag: ", c5b1.b(vb.getRoot())), null, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v4, types: [yfl0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final tfl0 router_delegate$lambda$2(BindingFragment bindingFragment) {
        ?? r0 = bindingFragment;
        while (true) {
            if (r0 == 0) {
                FragmentActivity activity = bindingFragment.getActivity();
                if (!(activity instanceof yfl0)) {
                    activity = null;
                }
                r0 = (yfl0) activity;
                if (r0 == 0) {
                    quz.m("No ", yfl0.class.getSimpleName(), " found");
                    return null;
                }
            } else {
                if (r0 instanceof yfl0) {
                    break;
                }
                r0 = r0.getParentFragment();
            }
        }
        return ((yfl0) r0).getRouter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void safePost$lambda$8(BindingFragment bindingFragment, sls slsVar) {
        if (bindingFragment.getIsFragmentViewDestroyed()) {
            return;
        }
        slsVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void safePostDelayed$lambda$9(BindingFragment bindingFragment, sls slsVar) {
        if (bindingFragment.getIsFragmentViewDestroyed()) {
            return;
        }
        slsVar.invoke();
    }

    public final void doOnViewIsNotDestroyed(sls block) {
        if (getIsFragmentViewDestroyed()) {
            return;
        }
        block.invoke();
    }

    @Override // defpackage.xdr
    public boolean fitsSystemWindow() {
        return true;
    }

    @Override // defpackage.be4
    public final Integer getBackButtonColor() {
        return this.backButtonColor;
    }

    public final VB getBinding() {
        VB vb = this._binding;
        if (vb == null) {
            vb = null;
        }
        if (this.isFragmentViewDestroyed) {
            reportWrongState();
        }
        return vb;
    }

    public final bkf getCustomHandlingInsetsBehaviourProvider() {
        return (bkf) this.customHandlingInsetsBehaviourProvider.getValue();
    }

    public final Handler getHandler() {
        return this.handler;
    }

    @Override // defpackage.k650
    public final z1x0 getNavigationBarColorModel() {
        return this.navigationBarColorModel;
    }

    @Override // defpackage.p5t0
    public boolean getNeedIgnoreKeyboard() {
        return getSoftInputModeFlag() == 48 || getSoftInputModeFlag() == 3;
    }

    public final tfl0 getRouter() {
        return (tfl0) this.router.getValue();
    }

    @Override // defpackage.nlp0
    public final za8 getSdkBackground() {
        return this.sdkBackground;
    }

    @Override // defpackage.wqq0
    public final yqq0 getSensitiveDataMode() {
        return this.sensitiveDataMode;
    }

    @Override // defpackage.p5t0
    public final int getSoftInputModeFlag() {
        return this.softInputModeFlag;
    }

    @Override // defpackage.d8u0
    public final z1x0 getStatusBarColorModel() {
        return this.statusBarColorModel;
    }

    public abstract VB getViewBinding(LayoutInflater inflater, ViewGroup container);

    @Override // defpackage.be4
    /* renamed from: isBackButtonEnabled, reason: from getter */
    public final boolean getIsBackButtonEnabled() {
        return this.isBackButtonEnabled;
    }

    @Override // defpackage.be4
    /* renamed from: isBackButtonVisible, reason: from getter */
    public final boolean getIsBackButtonVisible() {
        return this.isBackButtonVisible;
    }

    @Override // defpackage.zjf
    /* renamed from: isNewInsetsHandlingEnabled */
    public final boolean getIsNewInsetsHandlingEnabled() {
        return getCustomHandlingInsetsBehaviourProvider().isNewFragmentInsetsHandlingEnabled(getTag());
    }

    /* renamed from: isViewDestroyed, reason: from getter */
    public final boolean getIsFragmentViewDestroyed() {
        return this.isFragmentViewDestroyed;
    }

    @Override // defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        View view;
        if (getIsNewInsetsHandlingEnabled() && (view = getView()) != null) {
            view.setPadding(view.getPaddingLeft(), p7b1.f(insets).b, view.getPaddingRight(), p7b1.f(insets).d);
        }
        return insets;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        VB viewBinding = getViewBinding(inflater, container);
        final int i = 0;
        this.isFragmentViewDestroyed = false;
        this._binding = viewBinding;
        if (!getIsNewInsetsHandlingEnabled()) {
            boolean drawSdkUnderSafeArea = getCustomHandlingInsetsBehaviourProvider().getDrawSdkUnderSafeArea();
            boolean isShownAsSlidableView = getCustomHandlingInsetsBehaviourProvider().isShownAsSlidableView();
            if (drawSdkUnderSafeArea && !isShownAsSlidableView) {
                b.w(viewBinding.getRoot(), new bx60(this) { // from class: iw5
                    public final /* synthetic */ BindingFragment b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.bx60
                    public final n751 onApplyWindowInsets(View view, n751 n751Var) {
                        n751 onCreateView$lambda$7$lambda$4;
                        n751 onCreateView$lambda$7$lambda$6;
                        int i2 = i;
                        BindingFragment bindingFragment = this.b;
                        switch (i2) {
                            case 0:
                                onCreateView$lambda$7$lambda$4 = BindingFragment.onCreateView$lambda$7$lambda$4(bindingFragment, view, n751Var);
                                return onCreateView$lambda$7$lambda$4;
                            default:
                                onCreateView$lambda$7$lambda$6 = BindingFragment.onCreateView$lambda$7$lambda$6(bindingFragment, view, n751Var);
                                return onCreateView$lambda$7$lambda$6;
                        }
                    }
                });
            } else if (!drawSdkUnderSafeArea && !fitsSystemWindow()) {
                final int i2 = 1;
                b.w(viewBinding.getRoot(), new bx60(this) { // from class: iw5
                    public final /* synthetic */ BindingFragment b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.bx60
                    public final n751 onApplyWindowInsets(View view, n751 n751Var) {
                        n751 onCreateView$lambda$7$lambda$4;
                        n751 onCreateView$lambda$7$lambda$6;
                        int i22 = i2;
                        BindingFragment bindingFragment = this.b;
                        switch (i22) {
                            case 0:
                                onCreateView$lambda$7$lambda$4 = BindingFragment.onCreateView$lambda$7$lambda$4(bindingFragment, view, n751Var);
                                return onCreateView$lambda$7$lambda$4;
                            default:
                                onCreateView$lambda$7$lambda$6 = BindingFragment.onCreateView$lambda$7$lambda$6(bindingFragment, view, n751Var);
                                return onCreateView$lambda$7$lambda$6;
                        }
                    }
                });
            }
        }
        return viewBinding.getRoot();
    }

    @Override // com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.isFragmentViewDestroyed = true;
    }

    public final void safeDoOnLayout(View view, final tls tlsVar) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ybsdk.core.presentation.BindingFragment$safeDoOnLayout$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    if (BindingFragment.this.getIsFragmentViewDestroyed()) {
                        return;
                    }
                    tlsVar.invoke(view2);
                }
            });
        } else {
            if (getIsFragmentViewDestroyed()) {
                return;
            }
            tlsVar.invoke(view);
        }
    }

    public final void safeDoOnNextLayout(View view, final tls tlsVar) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ybsdk.core.presentation.BindingFragment$safeDoOnNextLayout$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view2.removeOnLayoutChangeListener(this);
                if (BindingFragment.this.getIsFragmentViewDestroyed()) {
                    return;
                }
                tlsVar.invoke(view2);
            }
        });
    }

    public final void safePost(sls block) {
        this.handler.post(new jw5(this, block, 1));
    }

    public final void safePostDelayed(long delayMillis, sls block) {
        this.handler.postDelayed(new jw5(this, block, 0), delayMillis);
    }

    public final void setBackButtonColor(Integer num) {
        this.backButtonColor = num;
        notifyBackButtonChanged();
    }

    public final void setBackButtonEnabled(boolean z) {
        this.isBackButtonEnabled = z;
        notifyBackButtonChanged();
    }

    public final void setBackButtonVisible(boolean z) {
        this.isBackButtonVisible = z;
        notifyBackButtonChanged();
    }

    public final void setNavigationBarColorModel(z1x0 z1x0Var) {
        this.navigationBarColorModel = z1x0Var;
        notifyChangeNavigationBarColor();
    }

    public final void setSdkBackground(za8 za8Var) {
        this.sdkBackground = za8Var;
        notifyCardBackgroundChanged();
    }

    public final void setSensitiveDataMode(yqq0 yqq0Var) {
        this.sensitiveDataMode = yqq0Var;
        notifyChangeSensitiveDataMode();
    }

    public final void setSoftInputModeFlag(int i) {
        this.softInputModeFlag = i;
        notifyChangeSoftInputMode();
    }

    public final void setStatusBarColorModel(z1x0 z1x0Var) {
        this.statusBarColorModel = z1x0Var;
        notifyChangeStatusBarColor();
    }

    public final void showAlertDialog(AlertDialog.a aVar) {
        AlertDialog create = aVar.create();
        create.show();
        getViewLifecycleOwner().getLifecycle().a(new kw5(create));
    }

    public /* synthetic */ BindingFragment(Boolean bool, Integer num, ColorModel colorModel, ColorModel colorModel2, yqq0 yqq0Var, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : colorModel, (i & 8) != 0 ? null : colorModel2, (i & 16) != 0 ? null : yqq0Var, (i & 32) != 0 ? null : bool2);
    }

    public BindingFragment() {
        this(null, null, null, null, null, null, 63, null);
    }
}
