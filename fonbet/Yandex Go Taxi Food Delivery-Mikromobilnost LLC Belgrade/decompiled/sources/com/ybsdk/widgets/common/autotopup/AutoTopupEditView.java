package com.ybsdk.widgets.common.autotopup;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.autotopup.AutoTopupEditView;
import com.ybsdk.widgets.common.autotopup.state.AutoTopupType;
import defpackage.cma1;
import defpackage.eo1;
import defpackage.fch0;
import defpackage.h361;
import defpackage.iv3;
import defpackage.jl40;
import defpackage.jv3;
import defpackage.lrp0;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.stz0;
import defpackage.tls;
import defpackage.unn;
import defpackage.vuu0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001e\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010$¨\u0006*"}, d2 = {"Lcom/ybsdk/widgets/common/autotopup/AutoTopupEditView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/autotopup/state/AutoTopupType;", "autoTopupType", "Lkotlin/Function1;", "", "Lzy11;", "getListener", "(Lcom/ybsdk/widgets/common/autotopup/state/AutoTopupType;)Ltls;", Constants.KEY_MESSAGE, "reportError", "(Ljava/lang/String;)V", "Lcom/ybsdk/widgets/common/ToolbarView;", "Ljv3;", ClidProvider.STATE, "render", "(Lcom/ybsdk/widgets/common/ToolbarView;Ljv3;)V", "listener", "setThresholdInputListener", "(Ltls;)V", "setAmountInputListener", "Landroid/widget/EditText;", "setShowKeyboardListener", "(Ljv3;)Lzy11;", "Lh361;", "binding", "Lh361;", "thresholdListener", "Ltls;", "amountListener", "topEditViewType", "Lcom/ybsdk/widgets/common/autotopup/state/AutoTopupType;", "bottomEditViewType", "showKeyboardListener", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoTopupEditView extends LinearLayout {
    private tls amountListener;
    private final h361 binding;
    private AutoTopupType bottomEditViewType;
    private tls showKeyboardListener;
    private tls thresholdListener;
    private AutoTopupType topEditViewType;

    public AutoTopupEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        final int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_layout_auto_topup_edit_view, (ViewGroup) this, false);
        addView(inflate);
        int i3 = fch0.auto_topup_toolbar;
        ToolbarView toolbarView = (ToolbarView) cma1.O(i3, inflate);
        if (toolbarView != null) {
            i3 = fch0.bottomEditView;
            LoadableInput loadableInput = (LoadableInput) cma1.O(i3, inflate);
            if (loadableInput != null) {
                i3 = fch0.topEditView;
                LoadableInput loadableInput2 = (LoadableInput) cma1.O(i3, inflate);
                if (loadableInput2 != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    final h361 h361Var = new h361(linearLayout, toolbarView, loadableInput, loadableInput2);
                    this.binding = h361Var;
                    loadableInput2.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new tls() { // from class: gv3
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            zy11 lambda$3$lambda$0;
                            zy11 lambda$3$lambda$1;
                            int i4 = i2;
                            AutoTopupEditView autoTopupEditView = this;
                            h361 h361Var2 = h361Var;
                            Editable editable = (Editable) obj;
                            switch (i4) {
                                case 0:
                                    lambda$3$lambda$0 = AutoTopupEditView.lambda$3$lambda$0(h361Var2, autoTopupEditView, editable);
                                    return lambda$3$lambda$0;
                                default:
                                    lambda$3$lambda$1 = AutoTopupEditView.lambda$3$lambda$1(h361Var2, autoTopupEditView, editable);
                                    return lambda$3$lambda$1;
                            }
                        }
                    }));
                    final int i4 = 1;
                    loadableInput.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new tls() { // from class: gv3
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            zy11 lambda$3$lambda$0;
                            zy11 lambda$3$lambda$1;
                            int i42 = i4;
                            AutoTopupEditView autoTopupEditView = this;
                            h361 h361Var2 = h361Var;
                            Editable editable = (Editable) obj;
                            switch (i42) {
                                case 0:
                                    lambda$3$lambda$0 = AutoTopupEditView.lambda$3$lambda$0(h361Var2, autoTopupEditView, editable);
                                    return lambda$3$lambda$0;
                                default:
                                    lambda$3$lambda$1 = AutoTopupEditView.lambda$3$lambda$1(h361Var2, autoTopupEditView, editable);
                                    return lambda$3$lambda$1;
                            }
                        }
                    }));
                    b.o(linearLayout, new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: hv3
                        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                        public final void onGlobalFocusChanged(View view, View view2) {
                            AutoTopupEditView.lambda$3$lambda$2(h361.this, this, view, view2);
                        }
                    });
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    private final tls getListener(AutoTopupType autoTopupType) {
        int i = autoTopupType == null ? -1 : iv3.a[autoTopupType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return this.thresholdListener;
        }
        if (i == 2) {
            return this.amountListener;
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$3$lambda$0(h361 h361Var, AutoTopupEditView autoTopupEditView, Editable editable) {
        if (editable.length() == 0) {
            h361Var.d.getEditText().setText("0");
        } else {
            tls listener = autoTopupEditView.getListener(autoTopupEditView.topEditViewType);
            if (listener != null) {
                listener.invoke(editable.toString());
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$3$lambda$1(h361 h361Var, AutoTopupEditView autoTopupEditView, Editable editable) {
        if (editable.length() == 0) {
            h361Var.c.getEditText().setText("0");
        } else {
            tls listener = autoTopupEditView.getListener(autoTopupEditView.bottomEditViewType);
            if (listener != null) {
                listener.invoke(editable.toString());
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(h361 h361Var, AutoTopupEditView autoTopupEditView, View view, View view2) {
        tls listener;
        if (jl40.l(view, view2)) {
            return;
        }
        LoadableInput loadableInput = h361Var.d;
        LoadableInput loadableInput2 = h361Var.c;
        if (jl40.l(view2, loadableInput.getEditText())) {
            tls listener2 = autoTopupEditView.getListener(autoTopupEditView.topEditViewType);
            if (listener2 != null) {
                listener2.invoke(h361Var.d.getEditText().getText().toString());
                return;
            }
            return;
        }
        if (!jl40.l(view2, loadableInput2.getEditText()) || (listener = autoTopupEditView.getListener(autoTopupEditView.bottomEditViewType)) == null) {
            return;
        }
        listener.invoke(loadableInput2.getEditText().getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$6(jv3 jv3Var, stz0 stz0Var) {
        return stz0.a(stz0Var, jv3Var.a, jv3Var.b, null, null, null, null, false, false, null, null, 0, 32764);
    }

    private final void reportError(String message) {
        x4c.g(message, null, null, Collections.singletonList(lrp0.d), 6);
    }

    public final zy11 render(jv3 state) {
        h361 h361Var = this.binding;
        ToolbarView toolbarView = h361Var.b;
        LoadableInput loadableInput = h361Var.c;
        LoadableInput loadableInput2 = h361Var.d;
        render(toolbarView, state);
        ArrayList arrayList = state.c;
        unn unnVar = (unn) a.S(0, arrayList);
        unn unnVar2 = (unn) a.S(1, arrayList);
        if (unnVar == null || unnVar2 == null) {
            reportError(vuu0.d("\n                    |firstEditViewState is null: " + (unnVar == null) + "\n                    |secondEditViewState is null: " + (unnVar2 == null) + "\n                "));
        } else {
            this.topEditViewType = unnVar.a;
            this.bottomEditViewType = unnVar2.a;
            loadableInput2.setCanShowSoftInputOnFocus(false);
            int i = 19;
            loadableInput2.render(false, new eo1(i, unnVar));
            loadableInput.setCanShowSoftInputOnFocus(false);
            loadableInput.render(false, new eo1(i, unnVar2));
            if (unnVar.f) {
                loadableInput = loadableInput2;
            } else if (!unnVar2.f) {
                loadableInput = null;
            }
            if (loadableInput != null) {
                loadableInput.requestFocus();
                tls tlsVar = this.showKeyboardListener;
                if (tlsVar != null) {
                    tlsVar.invoke(loadableInput.getEditText());
                }
            }
        }
        return zy11.a;
    }

    public final void setAmountInputListener(tls listener) {
        this.amountListener = listener;
    }

    public final void setShowKeyboardListener(tls listener) {
        this.showKeyboardListener = listener;
    }

    public final void setThresholdInputListener(tls listener) {
        this.thresholdListener = listener;
    }

    public AutoTopupEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AutoTopupEditView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AutoTopupEditView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void render(ToolbarView toolbarView, jv3 jv3Var) {
        toolbarView.render(new eo1(18, jv3Var));
    }
}
