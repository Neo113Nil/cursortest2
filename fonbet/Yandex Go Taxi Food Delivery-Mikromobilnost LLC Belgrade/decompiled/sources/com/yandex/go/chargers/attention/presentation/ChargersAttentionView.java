package com.yandex.go.chargers.attention.presentation;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cma1;
import defpackage.fi91;
import defpackage.khh0;
import defpackage.kn9;
import defpackage.ln9;
import defpackage.msh0;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/chargers/attention/presentation/ChargersAttentionView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkn9;", "attentionUiState", "Lkotlin/Function0;", "Lzy11;", "onClick", "render", "(Lkn9;Lsls;)V", "Landroid/view/View;", "view", "setContent", "(Landroid/view/View;)V", "hideAttention", "()V", "Lln9;", "binding", "Lln9;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAttentionView extends GoFrameLayout {
    public static final int $stable = 8;
    private final ln9 binding;

    public ChargersAttentionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        View inflate = LayoutInflater.from(context).inflate(msh0.chargers_attention_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = khh0.attention_header_icon;
        ImageView imageView = (ImageView) cma1.O(i2, inflate);
        if (imageView != null) {
            i2 = khh0.attention_header_image;
            ImageView imageView2 = (ImageView) cma1.O(i2, inflate);
            if (imageView2 != null) {
                i2 = khh0.attention_header_layout;
                GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i2, inflate);
                if (goConstraintLayout != null) {
                    i2 = khh0.attention_header_text;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                    if (robotoTextView != null) {
                        i2 = khh0.dialogue;
                        DialogueComponent dialogueComponent = (DialogueComponent) cma1.O(i2, inflate);
                        if (dialogueComponent != null) {
                            this.binding = new ln9((GoFrameLayout) inflate, imageView, imageView2, goConstraintLayout, robotoTextView, dialogueComponent);
                            dialogueComponent.setAnimationType(DialogueComponent.AnimationType.CONTENT_SLIDE_BOTTOM);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void hideAttention() {
        this.binding.f.hide();
    }

    public final void render(kn9 attentionUiState, sls onClick) {
        ln9 ln9Var = this.binding;
        RobotoTextView robotoTextView = ln9Var.e;
        DialogueComponent dialogueComponent = ln9Var.f;
        ImageView imageView = ln9Var.c;
        CharSequence charSequence = attentionUiState.a;
        BitmapDrawable bitmapDrawable = attentionUiState.c;
        robotoTextView.setText(charSequence);
        ImageView imageView2 = ln9Var.b;
        BitmapDrawable bitmapDrawable2 = attentionUiState.b;
        imageView2.setVisibility(bitmapDrawable2 != null ? 0 : 8);
        if (bitmapDrawable2 != null) {
            imageView2.setImageDrawable(bitmapDrawable2);
        }
        imageView.setVisibility(bitmapDrawable != null ? 0 : 8);
        if (bitmapDrawable != null) {
            imageView.setImageDrawable(bitmapDrawable);
        }
        Object parent = ln9Var.d.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            fi91.f(view, s8o.m(attentionUiState.d, getContext()), tje.w(24, getContext()));
        }
        c.z(onClick, dialogueComponent);
        dialogueComponent.show();
    }

    public final void setContent(View view) {
        ln9 ln9Var = this.binding;
        ln9Var.f.setHeaderView(ln9Var.d);
        this.binding.f.setContentView(view);
    }

    public ChargersAttentionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChargersAttentionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChargersAttentionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
