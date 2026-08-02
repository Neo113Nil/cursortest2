package com.yandex.go.vault.flexsdk.descriptors.widget.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.x0;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.i;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.vault.analytics.VaultButtonAction;
import com.yandex.go.vault.analytics.VaultErrorNotificationType;
import com.yandex.go.vault.flexsdk.descriptors.widget.Vault;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView;
import com.yandex.go.vault.flexsdk.shared.VaultPaletteDto;
import com.yandex.go.vault.ui.VaultErrorNotification;
import defpackage.a431;
import defpackage.b431;
import defpackage.b9h0;
import defpackage.bh11;
import defpackage.c431;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.d431;
import defpackage.e431;
import defpackage.h3s0;
import defpackage.h431;
import defpackage.hos0;
import defpackage.i431;
import defpackage.j331;
import defpackage.l431;
import defpackage.llh0;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.ofp0;
import defpackage.q5z;
import defpackage.qke;
import defpackage.scc;
import defpackage.sls;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tls;
import defpackage.v2y;
import defpackage.wx11;
import defpackage.x331;
import defpackage.z231;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010\u0011J\u000f\u0010*\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010\u0011J\u000f\u0010+\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010\u0011J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010\u0011J\u000f\u0010-\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010\u0011J\u0017\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00109R\u0018\u0010;\u001a\u00060:R\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010BR\u001c\u0010E\u001a\n D*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010G\u001a\n D*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u001c\u0010H\u001a\n D*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/view/VaultsPagerView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lc431;", "Landroid/content/Context;", "context", "Lcom/yandex/go/vault/flexsdk/descriptors/widget/view/b;", "presenter", "", "origin", "<init>", "(Landroid/content/Context;Lcom/yandex/go/vault/flexsdk/descriptors/widget/view/b;Ljava/lang/String;)V", "Ll431;", Constants.KEY_DATA, "Lzy11;", "bind", "(Ll431;)V", "showAllContent", "()V", "onAttachedToWindow", "onVaultOpen", "onVaultError", "Landroid/graphics/Bitmap;", "keyImage", "onKeyImageReady", "(Landroid/graphics/Bitmap;)V", "onDetachedFromWindow", "disableUserInput", "enableUserInput", "Lcom/yandex/go/vault/flexsdk/descriptors/widget/VaultRarity;", "rarity", "", "scrollToVault", "(Lcom/yandex/go/vault/flexsdk/descriptors/widget/VaultRarity;)Ljava/lang/Integer;", "openVault", "(Lcom/yandex/go/vault/flexsdk/descriptors/widget/VaultRarity;)V", "position", "", "tryPerformVaultClick", "(I)Z", "waitForVaultPositionAndPerformClick", "(I)V", "setupBottomButtonsPalette", "setupBottomButtonsListeners", "setupPager", "setupValueAnimators", "setupAdapter", "", "Landroid/view/View;", "viewsHidingToBottom", "()Ljava/util/List;", "disableClipChildren", "Landroid/content/Context;", "Lcom/yandex/go/vault/flexsdk/descriptors/widget/view/b;", "Ljava/lang/String;", "Lv2y;", "binding", "Lv2y;", CA20Status.STATUS_USER_I, "Lcom/yandex/go/vault/flexsdk/descriptors/widget/view/a;", "assetsLoader", "Lcom/yandex/go/vault/flexsdk/descriptors/widget/view/a;", "viewsHidingWithAlpha", "Ljava/util/List;", "Landroidx/viewpager2/widget/ViewPager2$a;", "onPageChangeCallback", "Landroidx/viewpager2/widget/ViewPager2$a;", "Ll431;", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "hideAllViewsValueAnimator", "Landroid/animation/ValueAnimator;", "hideLockValueAnimator", "changeScreenValueAnimator", "Le431;", "pageTransformer", "Le431;", "Lb431;", "adapter", "Lb431;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VaultsPagerView extends GoFrameLayout implements c431 {
    private b431 adapter;
    private final a assetsLoader;
    private final v2y binding;
    private final ValueAnimator changeScreenValueAnimator;
    private final Context context;
    private l431 data;
    private final ValueAnimator hideAllViewsValueAnimator;
    private final ValueAnimator hideLockValueAnimator;
    private final ViewPager2.a onPageChangeCallback;
    private final String origin;
    private final e431 pageTransformer;
    private int position;
    private final b presenter;
    private final List<String> viewsHidingWithAlpha;

    public VaultsPagerView(Context context, b bVar, String str) {
        super(context, null, 0, 0, 14, null);
        this.context = context;
        this.presenter = bVar;
        this.origin = str;
        View inflate = LayoutInflater.from(context).inflate(llh0.layout_vaults_pager, (ViewGroup) this, false);
        addView(inflate);
        int i = b9h0.nav_container;
        if (((GoFrameLayout) cma1.O(i, inflate)) != null) {
            i = b9h0.navigate_back;
            GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
            if (goImageView != null) {
                i = b9h0.navigate_forward;
                GoImageView goImageView2 = (GoImageView) cma1.O(i, inflate);
                if (goImageView2 != null) {
                    i = b9h0.pager;
                    ViewPager2 viewPager2 = (ViewPager2) cma1.O(i, inflate);
                    if (viewPager2 != null) {
                        i = b9h0.prize_list_button;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent != null) {
                            this.binding = new v2y((GoLinearLayout) inflate, goImageView, goImageView2, viewPager2, buttonComponent);
                            a aVar = new a(bVar);
                            this.assetsLoader = aVar;
                            this.viewsHidingWithAlpha = Collections.singletonList("vault_header");
                            this.onPageChangeCallback = new h431(this);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.hideAllViewsValueAnimator = ofFloat;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.hideLockValueAnimator = ofFloat2;
                            this.changeScreenValueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.pageTransformer = new e431();
                            this.adapter = new b431(ofFloat, ofFloat2, new VaultsPagerView$adapter$1(1, bVar, b.class, "openVault", "openVault(Lcom/yandex/go/vault/flexsdk/descriptors/widget/VaultRarity;)V", 0), new wx11(21, this), aVar);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(VaultsPagerView vaultsPagerView, int i) {
        b bVar = vaultsPagerView.presenter;
        Context context = vaultsPagerView.context;
        l431 l431Var = vaultsPagerView.data;
        String str = l431Var != null ? l431Var.e : null;
        String str2 = l431Var != null ? l431Var.f : null;
        bVar.getClass();
        qke.E(context, HapticController$Effect.BZZ, false, 12);
        if (str != null && str2 != null) {
            bVar.B.a(VaultErrorNotificationType.NOT_ENOUGH_KEYS, str);
            tj60 tj60Var = bVar.C;
            VaultErrorNotification vaultErrorNotification = new VaultErrorNotification("vault_error", str, cvu0.v(str2, "%u", String.valueOf(i), false), context, true, null, 0, 96, null);
            vaultErrorNotification.startExpiresTimer(5000L);
            vaultErrorNotification.setExpiresListener(new d431(bVar, vaultErrorNotification, 1));
            tj60Var.e(vaultErrorNotification);
        }
        return zy11.a;
    }

    private final void disableClipChildren() {
        this.binding.a.setClipChildren(false);
        ((ViewGroup) this.binding.a.getParent()).setClipChildren(false);
        ((ViewGroup) this.binding.a.getParent().getParent()).setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disableUserInput$lambda$0() {
    }

    private final void setupAdapter() {
        l431 l431Var = this.data;
        if (l431Var != null) {
            this.adapter.C = Integer.valueOf(l431Var.c);
            this.adapter.submitList(l431Var.a);
        }
    }

    private final void setupBottomButtonsListeners() {
        final int i = 0;
        c.z(new sls(this) { // from class: f431
            public final /* synthetic */ VaultsPagerView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 zy11Var;
                zy11 zy11Var2;
                int i2 = i;
                VaultsPagerView vaultsPagerView = this.b;
                switch (i2) {
                    case 0:
                        zy11Var = VaultsPagerView.setupBottomButtonsListeners$lambda$0(vaultsPagerView);
                        return zy11Var;
                    default:
                        zy11Var2 = VaultsPagerView.setupBottomButtonsListeners$lambda$1(vaultsPagerView);
                        return zy11Var2;
                }
            }
        }, this.binding.b);
        final int i2 = 1;
        c.z(new sls(this) { // from class: f431
            public final /* synthetic */ VaultsPagerView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 zy11Var;
                zy11 zy11Var2;
                int i22 = i2;
                VaultsPagerView vaultsPagerView = this.b;
                switch (i22) {
                    case 0:
                        zy11Var = VaultsPagerView.setupBottomButtonsListeners$lambda$0(vaultsPagerView);
                        return zy11Var;
                    default:
                        zy11Var2 = VaultsPagerView.setupBottomButtonsListeners$lambda$1(vaultsPagerView);
                        return zy11Var2;
                }
            }
        }, this.binding.c);
        this.binding.e.setDebounceClickListener(new bh11(18, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupBottomButtonsListeners$lambda$0(VaultsPagerView vaultsPagerView) {
        l431 l431Var = vaultsPagerView.data;
        if (l431Var != null) {
            List list = l431Var.a;
            b bVar = vaultsPagerView.presenter;
            int i = l431Var.c;
            VaultRarity vaultRarity = ((Vault) list.get(vaultsPagerView.position - 1)).a;
            int size = list.size();
            int i2 = vaultsPagerView.position + 1;
            bVar.Lg(new x331(vaultRarity, size > i2 ? ((Vault) list.get(i2)).a : null, i, VaultButtonAction.NEXT_VAULT));
        }
        vaultsPagerView.binding.d.setCurrentItem(vaultsPagerView.position - 1);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupBottomButtonsListeners$lambda$1(VaultsPagerView vaultsPagerView) {
        l431 l431Var = vaultsPagerView.data;
        if (l431Var != null) {
            List list = l431Var.a;
            b bVar = vaultsPagerView.presenter;
            int i = l431Var.c;
            int i2 = vaultsPagerView.position;
            bVar.Lg(new x331(i2 > 0 ? ((Vault) list.get(i2 - 1)).a : null, ((Vault) list.get(vaultsPagerView.position + 1)).a, i, VaultButtonAction.NEXT_VAULT));
        }
        vaultsPagerView.binding.d.setCurrentItem(vaultsPagerView.position + 1);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomButtonsListeners$lambda$2(VaultsPagerView vaultsPagerView) {
        l431 l431Var;
        Vault vault;
        l431 l431Var2 = vaultsPagerView.data;
        if (l431Var2 != null) {
            vaultsPagerView.presenter.Lg(new x331(null, null, l431Var2.c, VaultButtonAction.WHATS_INSIDE));
        }
        l431 l431Var3 = vaultsPagerView.data;
        if ((l431Var3 != null ? l431Var3.a.size() : 0) <= vaultsPagerView.binding.d.getCurrentItem() || (l431Var = vaultsPagerView.data) == null || (vault = (Vault) l431Var.a.get(vaultsPagerView.binding.d.getCurrentItem())) == null) {
            return;
        }
        b bVar = vaultsPagerView.presenter;
        tje.N(bVar.Jg(), null, null, new VaultsPagerPresenter$handleAction$1(bVar, vault.h, null), 3);
    }

    private final void setupBottomButtonsPalette() {
        this.binding.e.setTextTypeface(3);
        VaultPaletteDto vaultPaletteDto = this.assetsLoader.a.E.c;
        Integer S = q5z.S(vaultPaletteDto != null ? vaultPaletteDto.a : null);
        if (S != null) {
            int intValue = S.intValue();
            this.binding.e.setBackgroundTintList(ColorStateList.valueOf(intValue));
            this.binding.b.setBackgroundTintList(ColorStateList.valueOf(intValue));
            this.binding.c.setBackgroundTintList(ColorStateList.valueOf(intValue));
        }
        VaultPaletteDto vaultPaletteDto2 = this.assetsLoader.a.E.c;
        Integer S2 = q5z.S(vaultPaletteDto2 != null ? vaultPaletteDto2.b : null);
        if (S2 != null) {
            int intValue2 = S2.intValue();
            this.binding.e.setButtonTitleColor(intValue2);
            this.binding.b.setImageTintList(ColorStateList.valueOf(intValue2));
            this.binding.c.setImageTintList(ColorStateList.valueOf(intValue2));
        }
    }

    private final void setupPager() {
        this.binding.d.unregisterOnPageChangeCallback(this.onPageChangeCallback);
        l431 l431Var = this.data;
        if (l431Var != null) {
            this.binding.e.setText(l431Var.b);
            this.binding.d.setPageTransformer(this.pageTransformer);
            this.binding.d.setOffscreenPageLimit(3);
            this.binding.d.registerOnPageChangeCallback(this.onPageChangeCallback);
        }
    }

    private final void setupValueAnimators() {
        this.hideAllViewsValueAnimator.setDuration(500L);
        final int i = 0;
        this.hideAllViewsValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g431
            public final /* synthetic */ VaultsPagerView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                VaultsPagerView vaultsPagerView = this.b;
                switch (i2) {
                    case 0:
                        VaultsPagerView.setupValueAnimators$lambda$0(vaultsPagerView, valueAnimator);
                        break;
                    default:
                        VaultsPagerView.setupValueAnimators$lambda$3(vaultsPagerView, valueAnimator);
                        break;
                }
            }
        });
        this.hideAllViewsValueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView$setupValueAnimators$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Handler handler = VaultsPagerView.this.getHandler();
                if (handler != null) {
                    handler.postDelayed(new h3s0(6, VaultsPagerView.this), 450L);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.changeScreenValueAnimator.setDuration(600L);
        this.changeScreenValueAnimator.setInterpolator(new PathInterpolator(0.65f, 0.05f, 0.36f, 1.0f));
        this.changeScreenValueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView$setupValueAnimators$$inlined$doOnEnd$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                VaultsPagerView.this.showAllContent();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        final int i2 = 1;
        this.changeScreenValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g431
            public final /* synthetic */ VaultsPagerView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i2;
                VaultsPagerView vaultsPagerView = this.b;
                switch (i22) {
                    case 0:
                        VaultsPagerView.setupValueAnimators$lambda$0(vaultsPagerView, valueAnimator);
                        break;
                    default:
                        VaultsPagerView.setupValueAnimators$lambda$3(vaultsPagerView, valueAnimator);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupValueAnimators$lambda$0(VaultsPagerView vaultsPagerView, ValueAnimator valueAnimator) {
        Float f = (Float) vaultsPagerView.hideAllViewsValueAnimator.getAnimatedValue();
        float floatValue = f.floatValue();
        ViewParent parent = vaultsPagerView.binding.a.getParent().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    ny61.s();
                    return;
                }
                if (childAt instanceof Div2View) {
                    Div2View div2View = (Div2View) childAt;
                    if (kotlin.collections.a.G(vaultsPagerView.viewsHidingWithAlpha, div2View.getChildAt(0).getTag())) {
                        div2View.setAlpha(1.0f - floatValue);
                    } else {
                        div2View.setTranslationY(ofp0.c * floatValue);
                    }
                }
                i = i2;
            }
        }
        for (View view : vaultsPagerView.viewsHidingToBottom()) {
            if (view != null) {
                view.setTranslationY((ofp0.c - view.getHeight()) * floatValue);
            }
        }
        Iterator it = vaultsPagerView.adapter.A.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupValueAnimators$lambda$3(VaultsPagerView vaultsPagerView, ValueAnimator valueAnimator) {
        vaultsPagerView.binding.d.setScaleX((((Float) valueAnimator.getAnimatedValue()).floatValue() * 5.0f) + 1.0f);
        vaultsPagerView.binding.d.setScaleY((((Float) valueAnimator.getAnimatedValue()).floatValue() * 5.0f) + 1.0f);
        ViewPager2 viewPager2 = vaultsPagerView.binding.d;
        viewPager2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((ofp0.c / 2) - viewPager2.getY()));
        if (((Float) valueAnimator.getAnimatedValue()).floatValue() > 0.7f) {
            b bVar = vaultsPagerView.presenter;
            tje.N(bVar.Jg(), null, null, new VaultsPagerPresenter$navigateToPrize$1(bVar, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryPerformVaultClick(int position) {
        x0 a = i.a(this.binding.d, position);
        a431 a431Var = a instanceof a431 ? (a431) a : null;
        if (a431Var != null) {
            a431Var.W();
        }
        return a431Var != null;
    }

    private final List<View> viewsHidingToBottom() {
        v2y v2yVar = this.binding;
        return scc.g(v2yVar.c, v2yVar.b, v2yVar.e);
    }

    private final void waitForVaultPositionAndPerformClick(int position) {
        this.binding.d.registerOnPageChangeCallback(new i431(this, position));
    }

    public final void bind(l431 data) {
        this.data = data;
        setupPager();
        setupBottomButtonsListeners();
        setupBottomButtonsPalette();
        setupValueAnimators();
        setupAdapter();
    }

    @Override // defpackage.c431
    public void disableUserInput() {
        this.binding.d.setUserInputEnabled(false);
        this.binding.b.setOnClickListener(null);
        this.binding.c.setOnClickListener(null);
        this.binding.e.setDebounceClickListener(new hos0(7));
    }

    @Override // defpackage.c431
    public void enableUserInput() {
        this.binding.d.setUserInputEnabled(true);
        setupBottomButtonsListeners();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        VaultRarity vaultRarity;
        super.onAttachedToWindow();
        disableClipChildren();
        b bVar = this.presenter;
        bVar.Bg(this);
        tje.N(bVar.Jg(), null, null, new VaultsPagerPresenter$collectActions$1(bVar, null), 3);
        this.binding.d.unregisterOnPageChangeCallback(this.onPageChangeCallback);
        this.binding.d.setAdapter(this.adapter);
        l431 l431Var = this.data;
        if (l431Var != null) {
            b bVar2 = this.presenter;
            String str = this.origin;
            bVar2.getClass();
            tje.N(bVar2.Jg(), null, null, new VaultsPagerPresenter$getKeyImage$1(bVar2, l431Var.d, null), 3);
            Vault vault = (Vault) kotlin.collections.a.R(l431Var.a);
            if (vault == null || (vaultRarity = vault.a) == null) {
                vaultRarity = VaultRarity.COMMON;
            }
            int i = l431Var.c;
            z231 z231Var = bVar2.B;
            if (z231Var.c) {
                z231Var.c = false;
                o7r0 o7r0Var = z231Var.a;
                Long l = j331.a;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Long l2 = j331.a;
                if (l2 != null) {
                    j331.b = Long.valueOf(elapsedRealtime - l2.longValue());
                }
                Long l3 = j331.b;
                long longValue = l3 != null ? l3.longValue() : 0L;
                String obj = vaultRarity.toString();
                Integer valueOf = Integer.valueOf(i);
                Double valueOf2 = Double.valueOf(longValue / 1000.0d);
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                if (obj != null) {
                    hashMap.put("default_vault_type", obj);
                }
                hashMap.put("key_amount", valueOf);
                if (str != null) {
                    hashMap.put("origin", str);
                }
                hashMap.put("time_since_init_screen_sec", valueOf2);
                o7r0Var.a.a("Vault.MainScreen.Shown", hashMap, 1, new HashMap());
            }
            this.binding.d.setCurrentItem(this.position);
        }
        this.binding.d.registerOnPageChangeCallback(this.onPageChangeCallback);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.binding.d.unregisterOnPageChangeCallback(this.onPageChangeCallback);
    }

    @Override // defpackage.c431
    public void onKeyImageReady(Bitmap keyImage) {
        b431 b431Var = this.adapter;
        b431Var.B = keyImage;
        b431Var.notifyDataSetChanged();
    }

    @Override // defpackage.c431
    public void onVaultError() {
        Iterator it = this.adapter.z.iterator();
        while (it.hasNext()) {
            ((sls) it.next()).invoke();
        }
    }

    @Override // defpackage.c431
    public void onVaultOpen() {
        ArrayList arrayList = this.adapter.y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sls) it.next()).invoke();
        }
        arrayList.clear();
    }

    @Override // defpackage.c431
    public void openVault(VaultRarity rarity) {
        Integer scrollToVault = scrollToVault(rarity);
        if (scrollToVault == null || tryPerformVaultClick(scrollToVault.intValue())) {
            return;
        }
        waitForVaultPositionAndPerformClick(scrollToVault.intValue());
    }

    @Override // defpackage.c431
    public Integer scrollToVault(VaultRarity rarity) {
        Iterator<Object> it = this.adapter.getCurrentList().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Vault) it.next()).a == rarity) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        this.binding.d.setCurrentItem(valueOf != null ? valueOf.intValue() : 0, true);
        return valueOf;
    }

    public void showAllContent() {
        View findViewWithTag;
        ViewParent parent = this.binding.a.getParent().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && (findViewWithTag = viewGroup.findViewWithTag("vault_header")) != null) {
            findViewWithTag.setAlpha(1.0f);
        }
        ViewParent parent2 = this.binding.a.getParent().getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup2.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup2.getChildAt(i);
                if (childAt == null) {
                    ny61.s();
                    return;
                }
                if (childAt instanceof Div2View) {
                    Div2View div2View = (Div2View) childAt;
                    if (kotlin.collections.a.G(this.viewsHidingWithAlpha, div2View.getChildAt(0).getTag())) {
                        div2View.setAlpha(1.0f);
                    } else {
                        div2View.setTranslationY(0.0f);
                    }
                }
                i = i2;
            }
        }
        for (View view : viewsHidingToBottom()) {
            if (view != null) {
                view.setTranslationY(0.0f);
            }
        }
        setupBottomButtonsListeners();
        this.binding.d.setUserInputEnabled(true);
        Iterator it = this.adapter.A.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(Float.valueOf(0.0f));
        }
        this.binding.d.setScaleX(1.0f);
        this.binding.d.setScaleY(1.0f);
        this.binding.d.setTranslationY(0.0f);
        this.binding.d.setAdapter(null);
        this.binding.d.setAdapter(this.adapter);
        this.binding.d.setCurrentItem(0, false);
    }
}
