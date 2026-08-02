package com.yandex.go.scooters.promocodes.status;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aki0;
import defpackage.bys;
import defpackage.cjm0;
import defpackage.cma1;
import defpackage.e3o0;
import defpackage.f28;
import defpackage.f3x;
import defpackage.g92;
import defpackage.ino0;
import defpackage.j3x;
import defpackage.jno0;
import defpackage.mrg0;
import defpackage.nno0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.qfh0;
import defpackage.qu;
import defpackage.srh0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v3n0;
import defpackage.wxs;
import defpackage.x770;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001c\u0010\"\u001a\n\u0012\u0006\b\u0000\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/go/scooters/promocodes/status/ScootersPromocodesStatusModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ljno0;", "Landroid/content/Context;", "context", "Lnno0;", "scootersPromocodesStatusPresenter", "<init>", "(Landroid/content/Context;Lnno0;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "prepareDetailsTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "", "detailsItem", "Lzy11;", "bindDetailsItem", "(Lru/yandex/taxi/widget/RobotoTextView;Ljava/lang/CharSequence;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ljno0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lnno0;", "Lbys;", "", "detailsAdapter", "Lbys;", "ino0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPromocodesStatusModalView extends SlideableBindingModalView<jno0> {
    public static final int $stable = 8;
    private final bys detailsAdapter;
    private final nno0 scootersPromocodesStatusPresenter;

    public ScootersPromocodesStatusModalView(Context context, nno0 nno0Var) {
        super(context);
        this.scootersPromocodesStatusPresenter = nno0Var;
        RecyclerView recyclerView = getBinding().c;
        j3x j3xVar = new j3x();
        detailsAdapter$lambda$0(this, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        recyclerView.setLayoutManager(linearLayoutManager == null ? new LinearLayoutManager(recyclerView.getContext(), 1, false) : linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        this.detailsAdapter = bysVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        getBinding().b.setDebounceClickListener(new v3n0(21, nno0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$closeButtonClicked(nno0 nno0Var) {
        ((f28) nno0Var.A.b).r(new qu(9));
    }

    private final void bindDetailsItem(RobotoTextView robotoTextView, CharSequence charSequence) {
        robotoTextView.setText(charSequence);
    }

    private static final zy11 detailsAdapter$lambda$0(ScootersPromocodesStatusModalView scootersPromocodesStatusModalView, j3x j3xVar) {
        ScootersPromocodesStatusModalView$detailsAdapter$1$1 scootersPromocodesStatusModalView$detailsAdapter$1$1 = new ScootersPromocodesStatusModalView$detailsAdapter$1$1(0, scootersPromocodesStatusModalView, ScootersPromocodesStatusModalView.class, "prepareDetailsTextView", "prepareDetailsTextView()Lru/yandex/taxi/widget/RobotoTextView;", 0);
        j3xVar.getClass();
        aki0.b(new f3x(CharSequence.class, j3xVar, scootersPromocodesStatusModalView$detailsAdapter$1$1), new e3o0(5, scootersPromocodesStatusModalView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 detailsAdapter$lambda$0$0(ScootersPromocodesStatusModalView scootersPromocodesStatusModalView, RobotoTextView robotoTextView, CharSequence charSequence) {
        scootersPromocodesStatusModalView.bindDetailsItem(robotoTextView, charSequence);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RobotoTextView prepareDetailsTextView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, 0, 0, tje.r(mrg0.go_design_s_space, robotoTextView.getContext()));
        robotoTextView.setLayoutParams(marginLayoutParams);
        robotoTextView.setTextColorAttr(xng0.textMain);
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_body, robotoTextView.getContext()));
        return robotoTextView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public jno0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_promocodes_status_modal_view, parent, false);
        int i = qfh0.close_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = qfh0.details_recycler_view;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = qfh0.status_image_view;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = qfh0.title_text_view;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        return new jno0((GoLinearLayout) inflate, buttonComponent, recyclerView, goImageView, robotoTextView);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        nno0 nno0Var = this.scootersPromocodesStatusPresenter;
        ino0 ino0Var = new ino0(this);
        nno0Var.Bg(ino0Var);
        cjm0 cjm0Var = nno0Var.y;
        tpr t = e.t(new m0(((pwy0) cjm0Var.c).a(), new g92(2, nno0Var.z), new ScootersPromocodesStatusUiStateInteractor$uiStateFlow$1(3, null)));
        ((tt2) cjm0Var.b).getClass();
        tje.N(nno0Var.Jg(), null, null, new ScootersPromocodesStatusPresenter$attachView$$inlined$collectIn$1(e.F(t, uyj.a), null, ino0Var), 3);
        x770 x770Var = (x770) nno0Var.x.b;
        x770Var.getClass();
        x770Var.a.a("ScootersPromocodesStatus.Shown", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersPromocodesStatusPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.m(getCardContentView(), event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }
}
