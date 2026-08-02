package com.yandex.messaging.internal.view.stickers;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.e1k;
import defpackage.egz;
import defpackage.kjs0;
import defpackage.mae0;
import defpackage.ny61;
import defpackage.qdu0;
import defpackage.tje;
import defpackage.wnb0;
import defpackage.xav;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/internal/view/stickers/StickersView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "stickerId", "stickerEmoji", "Lzy11;", "startPreview", "(Ljava/lang/String;Ljava/lang/String;)V", "previewViewChanged", "finishPreview", "()V", "Lmae0;", "value", "stickerPreviewer", "Lmae0;", "getStickerPreviewer", "()Lmae0;", "setStickerPreviewer", "(Lmae0;)V", "qdu0", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StickersView extends RecyclerView {
    public static final int $stable = 8;
    private mae0 stickerPreviewer;

    public StickersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnItemTouchListener(new qdu0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishPreview() {
        getParent().requestDisallowInterceptTouchEvent(false);
        mae0 mae0Var = this.stickerPreviewer;
        if (mae0Var != null) {
            tje.e();
            xav xavVar = mae0Var.b;
            ImageView imageView = mae0Var.g;
            xavVar.c(imageView);
            AnimatorSet animatorSet = mae0Var.k;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            mae0Var.k = null;
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(egz.E(imageView, imageView.getHeight(), mae0Var.f)).with(egz.B(imageView, 1.0f, 0.0f));
            mae0Var.l = animatorSet2;
            animatorSet2.start();
            e1k e1kVar = mae0Var.j;
            if (e1kVar != null) {
                e1kVar.close();
            }
            mae0Var.j = null;
            imageView.postDelayed(new wnb0(22, mae0Var), 150L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void previewViewChanged(String stickerId, String stickerEmoji) {
        mae0 mae0Var = this.stickerPreviewer;
        if (mae0Var != null) {
            tje.e();
            mae0Var.a(stickerId, stickerEmoji, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPreview(String stickerId, String stickerEmoji) {
        getParent().requestDisallowInterceptTouchEvent(true);
        mae0 mae0Var = this.stickerPreviewer;
        if (mae0Var != null) {
            int i = mae0Var.f;
            ImageView imageView = mae0Var.g;
            tje.e();
            if (mae0Var.n == null) {
                ny61.r("to use preview stickersView should be initialized");
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(egz.E(imageView, i, mae0Var.e)).with(egz.B(imageView, 0.0f, 1.0f));
            mae0Var.k = animatorSet;
            int i2 = mae0Var.d;
            LinearLayout linearLayout = mae0Var.i;
            int i3 = mae0Var.a.getResources().getDisplayMetrics().heightPixels;
            StickersView stickersView = mae0Var.n;
            if (stickersView == null) {
                stickersView = null;
            }
            int height = i3 - stickersView.getHeight();
            int b = kjs0.b(20);
            int b2 = kjs0.b(16);
            int i4 = mae0Var.e;
            StickersView stickersView2 = mae0Var.n;
            if (stickersView2 == null) {
                stickersView2 = null;
            }
            if (stickersView2.getHeight() + b + i2 + b2 + i4 < height) {
                StickersView stickersView3 = mae0Var.n;
                if (stickersView3 == null) {
                    stickersView3 = null;
                }
                linearLayout.setPadding(0, 0, 0, stickersView3.getHeight() + b);
                ((LinearLayout.LayoutParams) imageView.getLayoutParams()).topMargin = b2;
            } else if (i2 + b2 + i4 < i3) {
                linearLayout.setPadding(0, 0, 0, (((i3 - i2) - b2) - i4) / 2);
                ((LinearLayout.LayoutParams) imageView.getLayoutParams()).topMargin = b2;
            } else {
                int b3 = kjs0.b(12);
                int b4 = kjs0.b(12);
                linearLayout.setPadding(0, 0, 0, b3);
                if (b3 + i2 + b4 + i4 < i3) {
                    ((LinearLayout.LayoutParams) imageView.getLayoutParams()).topMargin = b4;
                } else {
                    mae0Var.e = Math.max(i, ((i3 - b3) - i2) - b4);
                }
            }
            PopupWindow popupWindow = new PopupWindow(linearLayout, -1, -1);
            StickersView stickersView4 = mae0Var.n;
            popupWindow.showAtLocation(stickersView4 != null ? stickersView4 : null, 17, 0, 0);
            mae0Var.m = popupWindow;
            mae0Var.a(stickerId, stickerEmoji, true);
        }
    }

    public final mae0 getStickerPreviewer() {
        return this.stickerPreviewer;
    }

    public final void setStickerPreviewer(mae0 mae0Var) {
        this.stickerPreviewer = mae0Var;
        if (mae0Var != null) {
            mae0Var.n = this;
        }
    }

    public StickersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StickersView(Context context) {
        this(context, null, 0);
    }
}
