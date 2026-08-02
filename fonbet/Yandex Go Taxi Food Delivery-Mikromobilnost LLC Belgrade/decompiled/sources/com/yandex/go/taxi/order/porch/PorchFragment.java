package com.yandex.go.taxi.order.porch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.yandex.go.taxi.order.porch.PorchFragment;
import defpackage.a0g;
import defpackage.bk;
import defpackage.evu0;
import defpackage.p8h0;
import defpackage.pho;
import defpackage.r;
import defpackage.sls;
import defpackage.yae0;
import defpackage.yh70;
import defpackage.zae0;
import defpackage.zkh0;
import defpackage.zy11;
import defpackage.zzf;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.fragment.common.EditTextFragment;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u00025B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0005R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0018\u0010'\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u00100\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010+¨\u00066"}, d2 = {"Lcom/yandex/go/taxi/order/porch/PorchFragment;", "Lru/yandex/taxi/fragment/common/EditTextFragment;", "Lzae0;", "La0g;", "<init>", "()V", "Lzy11;", "bindViewsInFields", "unbindViewsInFields", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lyh70;", "orderAnalytics", "Lyh70;", "getOrderAnalytics", "()Lyh70;", "setOrderAnalytics", "(Lyh70;)V", "Landroid/widget/EditText;", "value", "autofocusView", "Landroid/widget/EditText;", "getAutofocusView", "()Landroid/widget/EditText;", "Lru/yandex/taxi/widget/RobotoTextView;", "porchHint", "Lru/yandex/taxi/widget/RobotoTextView;", "commentView", "done", "Landroid/view/View;", "", "getComment", "()Ljava/lang/String;", PorchFragment.ARG_COMMENT, "getPorch", PorchFragment.ARG_PORCH, "", "isLetterAllow", "()Z", "getBusinessName", "businessName", "Companion", "yae0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PorchFragment extends EditTextFragment<zae0, a0g> {
    public static final int $stable = 8;
    private static final String ARG_COMMENT = "comment";
    private static final String ARG_IS_LETTER_ALLOW = "is_letter_allow";
    private static final String ARG_PORCH = "porch";
    public static final yae0 Companion = new yae0();
    private EditText autofocusView;
    private EditText commentView;
    private View done;
    public yh70 orderAnalytics;
    private RobotoTextView porchHint;

    private final void bindViewsInFields() {
        EditText editText = (EditText) nonNullViewById(p8h0.porch);
        editText.setOnFocusChangeListener(new bk(21, nonNullViewById(p8h0.porch_line)));
        this.autofocusView = editText;
        RobotoTextView robotoTextView = (RobotoTextView) nonNullViewById(p8h0.porch_hint);
        final int i = 0;
        c.z(new sls(this) { // from class: xae0
            public final /* synthetic */ PorchFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 bindViewsInFields$lambda$1$0;
                zy11 bindViewsInFields$lambda$3$0;
                int i2 = i;
                PorchFragment porchFragment = this.b;
                switch (i2) {
                    case 0:
                        bindViewsInFields$lambda$1$0 = PorchFragment.bindViewsInFields$lambda$1$0(porchFragment);
                        return bindViewsInFields$lambda$1$0;
                    default:
                        bindViewsInFields$lambda$3$0 = PorchFragment.bindViewsInFields$lambda$3$0(porchFragment);
                        return bindViewsInFields$lambda$3$0;
                }
            }
        }, robotoTextView);
        this.porchHint = robotoTextView;
        EditText editText2 = (EditText) nonNullViewById(p8h0.comment);
        editText2.setOnFocusChangeListener(new bk(21, nonNullViewById(p8h0.comment_line)));
        this.commentView = editText2;
        View nonNullViewById = nonNullViewById(p8h0.done);
        final int i2 = 1;
        c.z(new sls(this) { // from class: xae0
            public final /* synthetic */ PorchFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 bindViewsInFields$lambda$1$0;
                zy11 bindViewsInFields$lambda$3$0;
                int i22 = i2;
                PorchFragment porchFragment = this.b;
                switch (i22) {
                    case 0:
                        bindViewsInFields$lambda$1$0 = PorchFragment.bindViewsInFields$lambda$1$0(porchFragment);
                        return bindViewsInFields$lambda$1$0;
                    default:
                        bindViewsInFields$lambda$3$0 = PorchFragment.bindViewsInFields$lambda$3$0(porchFragment);
                        return bindViewsInFields$lambda$3$0;
                }
            }
        }, nonNullViewById);
        this.done = nonNullViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindViewsInFields$lambda$1$0(PorchFragment porchFragment) {
        EditText autofocusView = porchFragment.getAutofocusView();
        if (autofocusView != null) {
            autofocusView.requestFocus();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 bindViewsInFields$lambda$3$0(PorchFragment porchFragment) {
        yh70 orderAnalytics = porchFragment.getOrderAnalytics();
        orderAnalytics.getClass();
        orderAnalytics.a.a("comment.save", new HashMap(), 1, new HashMap());
        EditText autofocusView = porchFragment.getAutofocusView();
        String obj = evu0.k0(String.valueOf(autofocusView != null ? autofocusView.getText() : null)).toString();
        EditText editText = porchFragment.commentView;
        String obj2 = evu0.k0(String.valueOf(editText != null ? editText.getText() : null)).toString();
        zae0 zae0Var = (zae0) porchFragment.callback;
        if (zae0Var != null) {
            zae0Var.a.r(new r(obj, obj2, 23));
        }
        return zy11.a;
    }

    private final String getComment() {
        return requireArguments().getString(ARG_COMMENT);
    }

    private final String getPorch() {
        return requireArguments().getString(ARG_PORCH);
    }

    private final boolean isLetterAllow() {
        return requireArguments().getBoolean(ARG_IS_LETTER_ALLOW);
    }

    public static final PorchFragment newInstance(String str, String str2, boolean z) {
        Companion.getClass();
        return yae0.a(str, str2, z);
    }

    private final void unbindViewsInFields() {
        EditText autofocusView = getAutofocusView();
        if (autofocusView != null) {
            autofocusView.setOnFocusChangeListener(null);
        }
        this.autofocusView = null;
        RobotoTextView robotoTextView = this.porchHint;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(null);
        }
        this.porchHint = null;
        EditText editText = this.commentView;
        if (editText != null) {
            editText.setOnFocusChangeListener(null);
        }
        this.commentView = null;
        View view = this.done;
        if (view != null) {
            view.setOnClickListener(null);
        }
        this.done = null;
    }

    @Override // ru.yandex.taxi.fragment.common.EditTextFragment
    public EditText getAutofocusView() {
        return this.autofocusView;
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public String getBusinessName() {
        return ARG_COMMENT;
    }

    public final yh70 getOrderAnalytics() {
        yh70 yh70Var = this.orderAnalytics;
        if (yh70Var != null) {
            return yh70Var;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(zkh0.porch_fragment, container, false);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        unbindViewsInFields();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        zzf zzfVar = ((a0g) injector()).a;
        this.receiverProvider = zzfVar.Yp;
        this.orderAnalytics = new yh70((pho) zzfVar.d0.get());
        bindViewsInFields();
        EditText autofocusView = getAutofocusView();
        if (autofocusView != null) {
            autofocusView.setInputType(isLetterAllow() ? 4096 : 2);
            autofocusView.setText(getPorch());
        }
        EditText editText = this.commentView;
        if (editText != null) {
            editText.setText(getComment());
        }
    }

    public final void setOrderAnalytics(yh70 yh70Var) {
        this.orderAnalytics = yh70Var;
    }
}
