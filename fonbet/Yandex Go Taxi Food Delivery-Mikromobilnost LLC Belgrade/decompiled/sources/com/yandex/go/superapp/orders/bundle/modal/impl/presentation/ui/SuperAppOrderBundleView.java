package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.g;
import defpackage.a8h0;
import defpackage.c230;
import defpackage.chw0;
import defpackage.cma1;
import defpackage.cv6;
import defpackage.i3y;
import defpackage.jyw0;
import defpackage.kkh0;
import defpackage.kyw0;
import defpackage.m2w0;
import defpackage.ny61;
import defpackage.ogu0;
import defpackage.qoi0;
import defpackage.r5w0;
import defpackage.rr00;
import defpackage.tls;
import defpackage.veu;
import defpackage.vmu0;
import defpackage.wn70;
import defpackage.xth0;
import defpackage.zl70;
import defpackage.zxs;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\u0012¨\u0006#"}, d2 = {"Lcom/yandex/go/superapp/orders/bundle/modal/impl/presentation/ui/SuperAppOrderBundleView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Ljyw0;", "swipeableTrackingCardItemTypeFactory", "Lcom/yandex/go/superapp/orders/bundle/modal/impl/presentation/ui/f;", "presenter", "<init>", "(Landroid/content/Context;Ljyw0;Lcom/yandex/go/superapp/orders/bundle/modal/impl/presentation/ui/f;)V", "Lc230;", "insetsType", "()Lc230;", "Lcom/yandex/go/design/view/GoLinearLayout;", "contentView", "()Lcom/yandex/go/design/view/GoLinearLayout;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/superapp/orders/bundle/modal/impl/presentation/ui/f;", "Lcv6;", "binding", "Lcv6;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lzl70;", "adapter", "Lzl70;", "getAdapter$annotations", "r5w0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppOrderBundleView extends ModalView {
    private final zl70 adapter;
    private final FloatButtonIconComponent backButton;
    private final cv6 binding;
    private final f presenter;
    private final RecyclerView recyclerView;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundleView$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return (rr00) ((zl70) this.receiver).getItem(((Number) obj).intValue());
        }
    }

    public SuperAppOrderBundleView(Context context, jyw0 jyw0Var, f fVar) {
        super(context);
        this.presenter = fVar;
        View inflate = LayoutInflater.from(context).inflate(kkh0.bundled_orders_modal_view, (ViewGroup) this, false);
        addView(inflate);
        int i = a8h0.back_button;
        FloatButtonIconComponent floatButtonIconComponent = (FloatButtonIconComponent) cma1.O(i, inflate);
        if (floatButtonIconComponent != null) {
            i = a8h0.recycler_view;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                this.binding = new cv6((GoLinearLayout) inflate, floatButtonIconComponent, recyclerView);
                this.backButton = floatButtonIconComponent;
                this.recyclerView = recyclerView;
                wn70 wn70Var = fVar.B;
                i3y i3yVar = fVar.M;
                chw0 chw0Var = (chw0) i3yVar.getValue();
                chw0 chw0Var2 = (chw0) i3yVar.getValue();
                jyw0Var.getClass();
                zl70 zl70Var = new zl70(Collections.singletonList(new zxs(qoi0.a(kyw0.class), xth0.swipeable_tracking_card_item, EmptyList.a, new veu(jyw0Var, wn70Var, chw0Var, chw0Var2, 4))));
                this.adapter = zl70Var;
                floatButtonIconComponent.setOnClickListener(new vmu0(5, this));
                recyclerView.addItemDecoration(m2w0.a);
                recyclerView.setAdapter(zl70Var);
                recyclerView.setItemAnimator(null);
                new s(new g(new AnonymousClass2(1, zl70Var, zl70.class, "getItem", "getItem(I)Ljava/lang/Object;", 0))).f(recyclerView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    private static /* synthetic */ void getAdapter$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(SuperAppOrderBundleView superAppOrderBundleView) {
        return superAppOrderBundleView.binding.b;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new ogu0(28, this), false);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(new r5w0(this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public GoLinearLayout getContent() {
        return this.binding.a;
    }
}
