package com.yandex.go.navigator.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import defpackage.tje;
import defpackage.um6;
import defpackage.vl6;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.FlowLayout;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/navigator/ui/BubbleGridView;", "Lru/yandex/taxi/widget/FlowLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lum6;", Constants.KEY_DATA, "Lzy11;", "setData", "(Ljava/util/List;)V", "Lvl6;", "onClickListener", "setOnBubbleClickListener", "(Lvl6;)V", "", "canAnimate", "Z", "Lcom/yandex/go/navigator/ui/a;", "getAdapter", "()Lcom/yandex/go/navigator/ui/a;", "adapter", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BubbleGridView extends FlowLayout {
    public static final int $stable = 8;
    private boolean canAnimate;

    public BubbleGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setItemSpacing((int) tje.x(getContext(), 4.0f));
        setLineSpacing((int) tje.x(getContext(), 4.0f));
        setPadding(tje.u(16, getContext()), tje.u(0, getContext()), tje.u(16, getContext()), tje.u(8, getContext()));
        setGravity(1);
    }

    public abstract a getAdapter();

    public final void setData(List<um6> data) {
        if (this.canAnimate) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.c = 300L;
            TransitionManager.a(changeBounds, this);
            this.canAnimate = false;
        }
        getAdapter().b(data);
    }

    public final void setOnBubbleClickListener(vl6 onClickListener) {
        getAdapter().h = onClickListener;
    }

    public BubbleGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BubbleGridView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BubbleGridView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
