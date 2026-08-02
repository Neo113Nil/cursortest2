package com.yandex.go.superapp.orders.card.bottom_sections;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.pav;
import defpackage.qe6;
import defpackage.se6;
import defpackage.tls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/superapp/orders/card/bottom_sections/BottomSectionsView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpav;", "imageLoader", "Lzy11;", "init", "(Lpav;)V", "", "Lqe6;", ClidProvider.STATE, "setState", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lke6;", "listener", "setClickListener", "(Ltls;)V", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BottomSectionsView extends RecyclerView {
    public BottomSectionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        setNestedScrollingEnabled(false);
    }

    public final void init(pav imageLoader) {
        setAdapter(new se6(imageLoader));
    }

    public final void setClickListener(tls listener) {
        RecyclerView.Adapter adapter = getAdapter();
        se6 se6Var = adapter instanceof se6 ? (se6) adapter : null;
        if (se6Var != null) {
            se6Var.b = listener;
        }
    }

    public final void setState(List<qe6> state) {
        List<qe6> list = state;
        setVisibility(list == null || list.isEmpty() ? 8 : 0);
        if (state != null) {
            RecyclerView.Adapter adapter = getAdapter();
            se6 se6Var = adapter instanceof se6 ? (se6) adapter : null;
            if (se6Var != null) {
                se6Var.c.b(state, null);
            }
        }
    }

    public BottomSectionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BottomSectionsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BottomSectionsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
