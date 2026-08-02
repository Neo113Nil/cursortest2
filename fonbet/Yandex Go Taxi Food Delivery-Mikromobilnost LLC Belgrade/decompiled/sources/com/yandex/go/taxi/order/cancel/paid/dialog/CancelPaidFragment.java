package com.yandex.go.taxi.order.cancel.paid.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.df4;
import defpackage.jcs;
import defpackage.p8h0;
import defpackage.qu;
import defpackage.rw7;
import defpackage.tw7;
import defpackage.wk6;
import defpackage.zkh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.fragment.YandexTaxiFragment;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u00023B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\n\u001a\u00120\tR\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010%R\u0018\u0010-\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%R\u0018\u0010.\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010%R\u0018\u0010/\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010%R(\u00100\u001a\u0014\u0018\u00010\tR\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/yandex/go/taxi/order/cancel/paid/dialog/CancelPaidFragment;", "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "Ltw7;", "Ljcs;", "Ldf4;", "<init>", "()V", "Lzy11;", "bindViewsInFields", "Lru/yandex/taxi/fragment/YandexTaxiFragment$SharedClickStateOnClickListener;", "instantiateCommonOnClickListener", "()Lru/yandex/taxi/fragment/YandexTaxiFragment$SharedClickStateOnClickListener;", "onCancelClick", "onDoNotCancelClick", "unbindViewsInFields", "showProgress", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "onBackPressed", "()Z", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/ListItemComponent;", "cancelHeader", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "cancelMessage", "Lru/yandex/taxi/design/ListTextComponent;", "btnLayout", "cancel", "doNotCancel", "progress", "commonClickListener", "Lru/yandex/taxi/fragment/YandexTaxiFragment$SharedClickStateOnClickListener;", "Companion", "rw7", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelPaidFragment extends YandexTaxiFragment<tw7, jcs> implements df4 {
    public static final int $stable = 8;
    private static final String ARGS_MESSAGE = "message";
    private static final String ARGS_TITLE = "title";
    public static final rw7 Companion = new rw7();
    private View btnLayout;
    private View cancel;
    private ListItemComponent cancelHeader;
    private ListTextComponent cancelMessage;
    private YandexTaxiFragment<tw7, jcs>.SharedClickStateOnClickListener commonClickListener;
    private View content;
    private View doNotCancel;
    private View progress;

    private final void bindViewsInFields() {
        this.content = nonNullViewById(p8h0.content);
        this.cancelHeader = (ListItemComponent) nonNullViewById(p8h0.cancel_header);
        this.cancelMessage = (ListTextComponent) nonNullViewById(p8h0.cancel_message);
        this.btnLayout = nonNullViewById(p8h0.btn_layout);
        View nonNullViewById = nonNullViewById(p8h0.cancel);
        this.cancel = nonNullViewById;
        if (nonNullViewById != null) {
            nonNullViewById.setOnClickListener(this.commonClickListener);
        }
        View nonNullViewById2 = nonNullViewById(p8h0.do_not_cancel);
        this.doNotCancel = nonNullViewById2;
        if (nonNullViewById2 != null) {
            nonNullViewById2.setOnClickListener(this.commonClickListener);
        }
        this.progress = nonNullViewById(p8h0.progress);
    }

    private final YandexTaxiFragment<tw7, jcs>.SharedClickStateOnClickListener instantiateCommonOnClickListener() {
        return new YandexTaxiFragment<tw7, jcs>.SharedClickStateOnClickListener() { // from class: com.yandex.go.taxi.order.cancel.paid.dialog.CancelPaidFragment$instantiateCommonOnClickListener$1
            {
                super();
            }

            @Override // ru.yandex.taxi.ui.MultiClickHandler$OnClickListener
            public void performActionsOnClick(View v) {
                int id = v.getId();
                if (id == p8h0.cancel) {
                    CancelPaidFragment.this.onCancelClick();
                } else if (id == p8h0.do_not_cancel) {
                    CancelPaidFragment.this.onDoNotCancelClick();
                }
            }
        };
    }

    public static final CancelPaidFragment newInstance(String str, String str2) {
        Companion.getClass();
        CancelPaidFragment cancelPaidFragment = new CancelPaidFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARGS_TITLE, str);
        bundle.putString("message", str2);
        cancelPaidFragment.setArguments(bundle);
        return cancelPaidFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancelClick() {
        showProgress();
        requireCallback().a.r(new wk6(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDoNotCancelClick() {
        requireCallback().a.r(new qu(9));
    }

    private final void showProgress() {
        View view = this.progress;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.content;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.btnLayout;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    private final void unbindViewsInFields() {
        this.content = null;
        this.cancelHeader = null;
        this.cancelMessage = null;
        this.btnLayout = null;
        View view = this.cancel;
        if (view != null) {
            view.setOnClickListener(null);
        }
        this.cancel = null;
        View view2 = this.doNotCancel;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        this.doNotCancel = null;
        this.progress = null;
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.commonClickListener = instantiateCommonOnClickListener();
    }

    @Override // defpackage.df4
    public boolean onBackPressed() {
        requireCallback().a.r(new qu(9));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(zkh0.cancel_paid, container, false);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        unbindViewsInFields();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViewsInFields();
        ListItemComponent listItemComponent = this.cancelHeader;
        if (listItemComponent != null) {
            listItemComponent.setTitle(requireArguments().getString(ARGS_TITLE));
        }
        ListTextComponent listTextComponent = this.cancelMessage;
        if (listTextComponent != null) {
            listTextComponent.setText(requireArguments().getString("message"));
        }
    }
}
