package com.yandex.go.vault.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.VaultStoreErrorScreenPayload;
import defpackage.b9h0;
import defpackage.cma1;
import defpackage.llh0;
import defpackage.n751;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.r3k0;
import defpackage.u1w;
import defpackage.u2y;
import defpackage.vmu0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/go/vault/ui/VaultStoreErrorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "onCloseListener", "Ljava/lang/Runnable;", "onReloadListener", "payload", "Lcom/yandex/go/vault/flexsdk/descriptors/widget/actions/VaultStoreErrorScreenPayload;", "errorImageBitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/content/Context;Ljava/lang/Runnable;Ljava/lang/Runnable;Lcom/yandex/go/vault/flexsdk/descriptors/widget/actions/VaultStoreErrorScreenPayload;Landroid/graphics/Bitmap;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VaultStoreErrorView extends FrameLayout {
    private final Bitmap errorImageBitmap;
    private final Runnable onCloseListener;
    private final Runnable onReloadListener;
    private final VaultStoreErrorScreenPayload payload;

    public VaultStoreErrorView(Context context, Runnable runnable, Runnable runnable2, VaultStoreErrorScreenPayload vaultStoreErrorScreenPayload, Bitmap bitmap) {
        super(context);
        this.onCloseListener = runnable;
        this.onReloadListener = runnable2;
        this.payload = vaultStoreErrorScreenPayload;
        this.errorImageBitmap = bitmap;
        View inflate = LayoutInflater.from(context).inflate(llh0.layout_vault_store_error_container, (ViewGroup) this, false);
        addView(inflate);
        int i = b9h0.back_float_btn;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null) {
            i = b9h0.close_btn;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = b9h0.error_icon;
                GoImageView goImageView2 = (GoImageView) cma1.O(i, inflate);
                if (goImageView2 != null) {
                    i = b9h0.error_icon_subtitle;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = b9h0.reload_btn;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent2 != null) {
                            i = b9h0.top_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView2 != null) {
                                GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
                                u2y u2yVar = new u2y(goConstraintLayout, goImageView, buttonComponent, goImageView2, robotoTextView, buttonComponent2, robotoTextView2);
                                if (vaultStoreErrorScreenPayload != null) {
                                    String str = vaultStoreErrorScreenPayload.e;
                                    String str2 = vaultStoreErrorScreenPayload.d;
                                    Integer S = q5z.S(vaultStoreErrorScreenPayload.h);
                                    if (S != null) {
                                        goConstraintLayout.setBackgroundColor(S.intValue());
                                    }
                                    robotoTextView2.setText(vaultStoreErrorScreenPayload.a);
                                    Integer S2 = q5z.S(vaultStoreErrorScreenPayload.f);
                                    if (S2 != null) {
                                        robotoTextView2.setTextColor(S2.intValue());
                                    }
                                    robotoTextView.setText(vaultStoreErrorScreenPayload.b);
                                    Integer S3 = q5z.S(vaultStoreErrorScreenPayload.g);
                                    if (S3 != null) {
                                        robotoTextView.setTextColor(S3.intValue());
                                    }
                                    Integer S4 = q5z.S(vaultStoreErrorScreenPayload.i);
                                    goImageView.setImageTintList(S4 != null ? ColorStateList.valueOf(S4.intValue()) : null);
                                    Integer S5 = q5z.S(vaultStoreErrorScreenPayload.j);
                                    goImageView.setBackgroundTintList(S5 != null ? ColorStateList.valueOf(S5.intValue()) : null);
                                    if (bitmap != null) {
                                        goImageView2.setImageBitmap(bitmap);
                                    }
                                    r3k0 r3k0Var = new r3k0(25, u2yVar, this);
                                    WeakHashMap weakHashMap = b.a;
                                    ViewCompat$Api21Impl.o(goConstraintLayout, r3k0Var);
                                    buttonComponent2.setText(str2);
                                    buttonComponent2.setContentDescription(str2);
                                    Integer S6 = q5z.S(vaultStoreErrorScreenPayload.n);
                                    if (S6 != null) {
                                        buttonComponent2.setTextColor(S6.intValue());
                                    }
                                    Integer S7 = q5z.S(vaultStoreErrorScreenPayload.m);
                                    buttonComponent2.setBackgroundTintList(S7 != null ? ColorStateList.valueOf(S7.intValue()) : null);
                                    buttonComponent.setText(str);
                                    buttonComponent.setContentDescription(str);
                                    Integer S8 = q5z.S(vaultStoreErrorScreenPayload.l);
                                    if (S8 != null) {
                                        buttonComponent.setTextColor(S8.intValue());
                                    }
                                    Integer S9 = q5z.S(vaultStoreErrorScreenPayload.k);
                                    buttonComponent.setBackgroundTintList(S9 != null ? ColorStateList.valueOf(S9.intValue()) : null);
                                }
                                goImageView.setOnClickListener(new vmu0(27, this));
                                buttonComponent2.setOnClickListener(runnable2);
                                buttonComponent.setOnClickListener(runnable);
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 lambda$0$0$4(u2y u2yVar, VaultStoreErrorView vaultStoreErrorView, View view, n751 n751Var) {
        u1w g = n751Var.a.g(519);
        ButtonComponent buttonComponent = u2yVar.b;
        ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) (c.i(8.0f, vaultStoreErrorView) + g.d);
        buttonComponent.setLayoutParams(layoutParams2);
        return n751.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$1(VaultStoreErrorView vaultStoreErrorView, View view) {
        vaultStoreErrorView.onCloseListener.run();
    }
}
