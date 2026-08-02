package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.core.debug.panel.internal.presentation.view.CustomDialogView;
import defpackage.b64;
import defpackage.bb1;
import defpackage.bmh0;
import defpackage.fjf;
import defpackage.gxq;
import defpackage.hxq;
import defpackage.kgx;
import defpackage.qoi0;
import defpackage.s9h0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.wls;
import defpackage.wv5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u00070\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R&\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010*R\u001b\u00101\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010*¨\u00062"}, d2 = {"Lcom/yandex/plus/core/debug/panel/internal/presentation/view/CustomDialogView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "", "", "Lzy11;", "onCheckboxClicked", "", "Lhxq;", "items", "Lkotlin/Function1;", "onConfirm", "Lkotlin/Function0;", "onReset", "onCancel", "<init>", "(Landroid/content/Context;Lwls;Ljava/util/List;Ltls;Lsls;Lsls;)V", "setupRecyclerView", "()V", "setupListeners", "Ljava/util/List;", "Ltls;", "Lsls;", "Landroidx/recyclerview/widget/RecyclerView;", "fieldsChoiceRecyclerView$delegate", "Lwv5;", "getFieldsChoiceRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "fieldsChoiceRecyclerView", "Lgxq;", "fieldChoiceAdapter", "Lgxq;", "Landroid/view/View;", "shadowView$delegate", "getShadowView", "()Landroid/view/View;", "shadowView", "Landroid/widget/TextView;", "resetTextView$delegate", "getResetTextView", "()Landroid/widget/TextView;", "resetTextView", "confirmTextView$delegate", "getConfirmTextView", "confirmTextView", "cancelTextView$delegate", "getCancelTextView", "cancelTextView", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomDialogView extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("fieldsChoiceRecyclerView", 0, "getFieldsChoiceRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", CustomDialogView.class), b64.x(qoi0.a, CustomDialogView.class, "shadowView", "getShadowView()Landroid/view/View;", 0), new PropertyReference1Impl("resetTextView", 0, "getResetTextView()Landroid/widget/TextView;", CustomDialogView.class), new PropertyReference1Impl("confirmTextView", 0, "getConfirmTextView()Landroid/widget/TextView;", CustomDialogView.class), new PropertyReference1Impl("cancelTextView", 0, "getCancelTextView()Landroid/widget/TextView;", CustomDialogView.class)};

    /* renamed from: cancelTextView$delegate, reason: from kotlin metadata */
    private final wv5 cancelTextView;

    /* renamed from: confirmTextView$delegate, reason: from kotlin metadata */
    private final wv5 confirmTextView;
    private final gxq fieldChoiceAdapter;

    /* renamed from: fieldsChoiceRecyclerView$delegate, reason: from kotlin metadata */
    private final wv5 fieldsChoiceRecyclerView;
    private final List<hxq> items;
    private final sls onCancel;
    private final tls onConfirm;
    private final sls onReset;

    /* renamed from: resetTextView$delegate, reason: from kotlin metadata */
    private final wv5 resetTextView;

    /* renamed from: shadowView$delegate, reason: from kotlin metadata */
    private final wv5 shadowView;

    public CustomDialogView(Context context, wls wlsVar, List<hxq> list, tls tlsVar, sls slsVar, sls slsVar2) {
        super(context);
        this.items = list;
        this.onConfirm = tlsVar;
        this.onReset = slsVar;
        this.onCancel = slsVar2;
        this.fieldsChoiceRecyclerView = new wv5(new fjf(this, s9h0.plus_debug_panel_dialog_list, 0));
        this.fieldChoiceAdapter = new gxq(wlsVar);
        this.shadowView = new wv5(new fjf(this, s9h0.plus_debug_panel_dialog_shadow, 1));
        this.resetTextView = new wv5(new fjf(this, s9h0.plus_debug_panel_dialog_reset_text, 2));
        this.confirmTextView = new wv5(new fjf(this, s9h0.plus_debug_panel_dialog_ok_text, 3));
        this.cancelTextView = new wv5(new fjf(this, s9h0.plus_debug_panel_dialog_cancel_text, 4));
        bb1.v(this, bmh0.plus_debug_panel_view_custom_dialog, true);
        setupRecyclerView();
        setupListeners();
    }

    private final TextView getCancelTextView() {
        return (TextView) this.cancelTextView.a($$delegatedProperties[4]);
    }

    private final TextView getConfirmTextView() {
        return (TextView) this.confirmTextView.a($$delegatedProperties[3]);
    }

    private final RecyclerView getFieldsChoiceRecyclerView() {
        return (RecyclerView) this.fieldsChoiceRecyclerView.a($$delegatedProperties[0]);
    }

    private final TextView getResetTextView() {
        return (TextView) this.resetTextView.a($$delegatedProperties[2]);
    }

    private final View getShadowView() {
        return (View) this.shadowView.a($$delegatedProperties[1]);
    }

    private final void setupListeners() {
        final int i = 0;
        bb1.L(getShadowView(), new View.OnClickListener(this) { // from class: ejf
            public final /* synthetic */ CustomDialogView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                CustomDialogView customDialogView = this.b;
                switch (i2) {
                    case 0:
                        CustomDialogView.setupListeners$lambda$0(customDialogView, view);
                        break;
                    case 1:
                        CustomDialogView.setupListeners$lambda$1(customDialogView, view);
                        break;
                    case 2:
                        CustomDialogView.setupListeners$lambda$2(customDialogView, view);
                        break;
                    default:
                        CustomDialogView.setupListeners$lambda$4(customDialogView, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        bb1.L(getCancelTextView(), new View.OnClickListener(this) { // from class: ejf
            public final /* synthetic */ CustomDialogView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                CustomDialogView customDialogView = this.b;
                switch (i22) {
                    case 0:
                        CustomDialogView.setupListeners$lambda$0(customDialogView, view);
                        break;
                    case 1:
                        CustomDialogView.setupListeners$lambda$1(customDialogView, view);
                        break;
                    case 2:
                        CustomDialogView.setupListeners$lambda$2(customDialogView, view);
                        break;
                    default:
                        CustomDialogView.setupListeners$lambda$4(customDialogView, view);
                        break;
                }
            }
        });
        final int i3 = 2;
        bb1.L(getResetTextView(), new View.OnClickListener(this) { // from class: ejf
            public final /* synthetic */ CustomDialogView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                CustomDialogView customDialogView = this.b;
                switch (i22) {
                    case 0:
                        CustomDialogView.setupListeners$lambda$0(customDialogView, view);
                        break;
                    case 1:
                        CustomDialogView.setupListeners$lambda$1(customDialogView, view);
                        break;
                    case 2:
                        CustomDialogView.setupListeners$lambda$2(customDialogView, view);
                        break;
                    default:
                        CustomDialogView.setupListeners$lambda$4(customDialogView, view);
                        break;
                }
            }
        });
        final int i4 = 3;
        bb1.L(getConfirmTextView(), new View.OnClickListener(this) { // from class: ejf
            public final /* synthetic */ CustomDialogView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i4;
                CustomDialogView customDialogView = this.b;
                switch (i22) {
                    case 0:
                        CustomDialogView.setupListeners$lambda$0(customDialogView, view);
                        break;
                    case 1:
                        CustomDialogView.setupListeners$lambda$1(customDialogView, view);
                        break;
                    case 2:
                        CustomDialogView.setupListeners$lambda$2(customDialogView, view);
                        break;
                    default:
                        CustomDialogView.setupListeners$lambda$4(customDialogView, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$0(CustomDialogView customDialogView, View view) {
        customDialogView.onCancel.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$1(CustomDialogView customDialogView, View view) {
        customDialogView.onCancel.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$2(CustomDialogView customDialogView, View view) {
        customDialogView.onReset.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$4(CustomDialogView customDialogView, View view) {
        tls tlsVar = customDialogView.onConfirm;
        List<Object> currentList = customDialogView.fieldChoiceAdapter.getCurrentList();
        ArrayList arrayList = new ArrayList(tcc.n(currentList, 10));
        Iterator<T> it = currentList.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((hxq) it.next()).b));
        }
        tlsVar.invoke(arrayList);
    }

    private final void setupRecyclerView() {
        getFieldsChoiceRecyclerView().setAdapter(this.fieldChoiceAdapter);
        this.fieldChoiceAdapter.submitList(this.items);
    }
}
