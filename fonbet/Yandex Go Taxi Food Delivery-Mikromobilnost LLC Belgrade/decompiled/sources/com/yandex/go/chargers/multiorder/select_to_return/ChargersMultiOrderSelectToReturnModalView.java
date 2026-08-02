package com.yandex.go.chargers.multiorder.select_to_return;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import defpackage.d5a;
import defpackage.ej1;
import defpackage.kyh0;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.s3a;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.v4a;
import defpackage.w4a;
import defpackage.w5a;
import defpackage.z4a;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/chargers/multiorder/select_to_return/ChargersMultiOrderSelectToReturnModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lw5a;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lz4a;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Lz4a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw5a;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lz4a;", "Ls3a;", "adapter", "Ls3a;", "w4a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersMultiOrderSelectToReturnModalView extends SlideableBindingModalView<w5a> {
    private final s3a adapter;
    private final z4a presenter;

    public ChargersMultiOrderSelectToReturnModalView(Context context, pav pavVar, z4a z4aVar) {
        super(context, 3);
        this.presenter = z4aVar;
        s3a s3aVar = new s3a(pavVar, new ChargersMultiOrderSelectToReturnModalView$adapter$1(1, z4aVar, z4a.class, "orderClicked", "orderClicked(Lcom/yandex/go/chargers/multiorder/ui/ChargersMultiOrderUiState$MultiOrderTabsConfig$MultiOrderItemUiState;)V", 0));
        this.adapter = s3aVar;
        qdb1.b(this, new v4a(0, z4aVar));
        w5a binding = getBinding();
        binding.e.setText(context.getString(kyh0.chargers_multiorder_select_to_return_title));
        binding.e.setVisibility(0);
        binding.b.setVisibility(8);
        binding.c.setVisibility(8);
        binding.d.setAdapter(s3aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$backClicked(z4a z4aVar) {
        ((ej1) z4aVar.y.b).r(new qu(9));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(true);
        z4a z4aVar = this.presenter;
        w4a w4aVar = new w4a(this);
        z4aVar.Bg(w4aVar);
        d5a d5aVar = z4aVar.x;
        tpr t = e.t(new m0(d5aVar.b.a(), e.d(d5aVar.d.d), new ChargersMultiOrderSelectToReturnUiStateInteractor$uiStateFlow$1(d5aVar, null)));
        d5aVar.a.getClass();
        tje.N(z4aVar.Jg(), null, null, new ChargersMultiOrderSelectToReturnPresenter$attachView$$inlined$collectIn$1(e.F(t, uyj.a), null, w4aVar), 3);
        tje.N(z4aVar.Jg(), null, null, new ChargersMultiOrderSelectToReturnPresenter$attachView$$inlined$collectIn$2(d5aVar.e, null, z4aVar), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public w5a bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        return w5a.o(inflater, parent);
    }
}
