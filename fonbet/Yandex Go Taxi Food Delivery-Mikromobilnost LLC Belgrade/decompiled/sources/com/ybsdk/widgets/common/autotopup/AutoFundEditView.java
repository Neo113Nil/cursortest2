package com.ybsdk.widgets.common.autotopup;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import defpackage.cma1;
import defpackage.eo1;
import defpackage.fch0;
import defpackage.g361;
import defpackage.kr3;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.stz0;
import defpackage.tls;
import defpackage.tnn;
import defpackage.v5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/widgets/common/autotopup/AutoFundEditView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/ToolbarView;", "Lkr3;", ClidProvider.STATE, "Lzy11;", "render", "(Lcom/ybsdk/widgets/common/ToolbarView;Lkr3;)V", "Lkotlin/Function1;", "", "listener", "setLimitInputListener", "(Ltls;)V", "Landroid/widget/EditText;", "setShowKeyboardListener", "(Lkr3;)V", "Lg361;", "binding", "Lg361;", "limitListener", "Ltls;", "showKeyboardListener", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoFundEditView extends LinearLayout {
    private final g361 binding;
    private tls limitListener;
    private tls showKeyboardListener;

    public AutoFundEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_layout_auto_fund_edit_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = fch0.auto_found_hint_text_view;
        TextView textView = (TextView) cma1.O(i2, inflate);
        if (textView != null) {
            i2 = fch0.auto_fund_limit_input;
            LoadableInput loadableInput = (LoadableInput) cma1.O(i2, inflate);
            if (loadableInput != null) {
                i2 = fch0.auto_fund_toolbar;
                ToolbarView toolbarView = (ToolbarView) cma1.O(i2, inflate);
                if (toolbarView != null) {
                    this.binding = new g361((LinearLayout) inflate, textView, loadableInput, toolbarView);
                    loadableInput.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new v5(21, loadableInput, this)));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$1$lambda$0(LoadableInput loadableInput, AutoFundEditView autoFundEditView, Editable editable) {
        if (editable.length() == 0) {
            loadableInput.getEditText().setText("0");
        } else {
            tls tlsVar = autoFundEditView.limitListener;
            if (tlsVar != null) {
                tlsVar.invoke(editable.toString());
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$3(kr3 kr3Var, stz0 stz0Var) {
        return stz0.a(stz0Var, kr3Var.a, kr3Var.b, null, null, null, null, false, false, null, null, 0, 32764);
    }

    public final void render(kr3 state) {
        g361 g361Var = this.binding;
        render(g361Var.d, state);
        LoadableInput loadableInput = g361Var.c;
        tnn tnnVar = state.c;
        loadableInput.setCanShowSoftInputOnFocus(false);
        loadableInput.render(false, new eo1(19, tnnVar));
        TextView textView = g361Var.b;
        Text text = state.d;
        textView.setVisibility(text == null ? 8 : 0);
        textView.setText(text != null ? d.a(getContext(), text) : null);
        loadableInput.requestFocus();
        tls tlsVar = this.showKeyboardListener;
        if (tlsVar != null) {
            tlsVar.invoke(loadableInput.getEditText());
        }
    }

    public final void setLimitInputListener(tls listener) {
        this.limitListener = listener;
    }

    public final void setShowKeyboardListener(tls listener) {
        this.showKeyboardListener = listener;
    }

    private final void render(ToolbarView toolbarView, kr3 kr3Var) {
        toolbarView.render(new eo1(17, kr3Var));
    }

    public AutoFundEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AutoFundEditView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AutoFundEditView(Context context) {
        this(context, null, 0, 6, null);
    }
}
