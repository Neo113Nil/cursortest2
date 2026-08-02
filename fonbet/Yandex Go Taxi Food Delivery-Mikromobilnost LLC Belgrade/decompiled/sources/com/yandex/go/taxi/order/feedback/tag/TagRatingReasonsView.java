package com.yandex.go.taxi.order.feedback.tag;

import android.content.Context;
import android.view.View;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import defpackage.h7x0;
import defpackage.msq;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ul51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.order.feedback.b;
import ru.yandex.taxi.widget.FlowLayout;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/yandex/go/taxi/order/feedback/tag/TagRatingReasonsView;", "Lru/yandex/taxi/widget/FlowLayout;", "Lru/yandex/taxi/order/feedback/b;", "Landroid/content/Context;", "context", "Lmsq;", "feedbackDependencies", "<init>", "(Landroid/content/Context;Lmsq;)V", "", "Lr8i0;", IssuingDistributionPointExtension.REASONS, "Lh7x0;", "mapToItemModels", "(Ljava/util/List;)Ljava/util/List;", Constants.KEY_DATA, "Lzy11;", "setData", "(Ljava/util/List;)V", "Ls8i0;", "onClickListener", "setOnReasonClickListener", "(Ls8i0;)V", "animateFirstData", "()V", "Lmsq;", "Lcom/yandex/go/taxi/order/feedback/tag/a;", "adapter", "Lcom/yandex/go/taxi/order/feedback/tag/a;", "", "canAnimate", "Z", "Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "getRatingType", "()Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "ratingType", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TagRatingReasonsView extends FlowLayout implements b {
    public static final int $stable = 8;
    private final a adapter;
    private boolean canAnimate;
    private final msq feedbackDependencies;

    public TagRatingReasonsView(Context context, msq msqVar) {
        super(context, null, 0, 6, null);
        this.feedbackDependencies = msqVar;
        this.adapter = new a(this, msqVar);
        setItemSpacing((int) tje.x(getContext(), 4.0f));
        setLineSpacing((int) tje.x(getContext(), 4.0f));
        setPadding(tje.u(16, getContext()), tje.u(0, getContext()), tje.u(16, getContext()), tje.u(8, getContext()));
    }

    private final List<h7x0> mapToItemModels(List<r8i0> reasons) {
        boolean z;
        ((ul51) this.feedbackDependencies.c).getClass();
        List<r8i0> list = reasons;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str = ((r8i0) it.next()).d;
                if (str == null || str.length() == 0) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        List<r8i0> list2 = reasons;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (r8i0 r8i0Var : list2) {
            arrayList.add(new h7x0(r8i0Var, z ? r8i0Var.d : ""));
        }
        return arrayList;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void animateFirstData() {
        this.canAnimate = true;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public FeedbackStrategy.FeedbackType getRatingType() {
        return FeedbackStrategy.FeedbackType.ALL_RATING;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public View getView() {
        return this;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void setData(List<r8i0> data) {
        if (this.canAnimate) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.c = 300L;
            TransitionManager.a(changeBounds, this);
            this.canAnimate = false;
        }
        this.adapter.b(mapToItemModels(data));
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void setOnReasonClickListener(s8i0 onClickListener) {
        this.adapter.g = onClickListener;
    }
}
