package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.d961;
import defpackage.fch0;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.quy0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/widgets/common/TextWithBubbleBadgeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lquy0;", "content", "Lzy11;", "render", "(Lquy0;)V", "showNextItem", "()V", "", "items", "setItems", "(Ljava/util/List;)V", "Ld961;", "binding", "Ld961;", "contentList", "Ljava/util/List;", "currentItem", CA20Status.STATUS_USER_I, "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextWithBubbleBadgeView extends ConstraintLayout {
    private final d961 binding;
    private List<quy0> contentList;
    private int currentItem;

    public TextWithBubbleBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_text_with_badge_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = fch0.text_badge_bubble;
        TextView textView = (TextView) cma1.O(i2, inflate);
        if (textView != null) {
            i2 = fch0.text_badge_description;
            TextView textView2 = (TextView) cma1.O(i2, inflate);
            if (textView2 != null) {
                this.binding = new d961((ConstraintLayout) inflate, textView, textView2);
                this.contentList = EmptyList.a;
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void render(quy0 content) {
    }

    public final void setItems(List<quy0> items) {
        this.currentItem = 0;
        this.contentList = items;
        setVisibility(items.isEmpty() ? 8 : 0);
        if (kotlin.collections.a.R(items) == null) {
            render(null);
        } else {
            ny61.u();
        }
    }

    public final void showNextItem() {
        quy0 quy0Var;
        if (this.contentList.size() > 1) {
            List<quy0> list = this.contentList;
            int i = this.currentItem + 1;
            this.currentItem = i;
            if (i < 0 || i >= list.size()) {
                this.currentItem = 0;
                if (this.contentList.get(0) != null) {
                    ny61.u();
                    return;
                }
                quy0Var = null;
            } else {
                quy0Var = list.get(i);
            }
            if (quy0Var != null) {
                ny61.u();
            } else {
                render(null);
                com.ybsdk.core.utils.ext.view.b.m(this);
            }
        }
    }

    public TextWithBubbleBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TextWithBubbleBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TextWithBubbleBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
