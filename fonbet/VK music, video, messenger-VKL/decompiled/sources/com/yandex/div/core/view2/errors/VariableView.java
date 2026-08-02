package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.div.R$drawable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: VariableMonitorView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
final class VariableView extends LinearLayout {
    public static final Companion Companion = new Companion(null);
    private final TextView nameText;
    private izs<? super String, s3q0> onEnterAction;
    private final TextView typeText;
    private final EditText valueText;

    /* compiled from: VariableMonitorView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public VariableView(Context context) {
        super(context);
        TextView createCell = createCell();
        this.nameText = createCell;
        TextView createCell2 = createCell();
        this.typeText = createCell2;
        EditText createEditableCell = createEditableCell();
        this.valueText = createEditableCell;
        this.onEnterAction = new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.errors.VariableView$onEnterAction$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                invoke2(str);
                return s3q0.a;
            }
        };
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        addCell(createCell, 200);
        addCell(createCell2, 60);
        addView(createEditableCell, new LinearLayout.LayoutParams(-2, -2, 1.0f));
    }

    private final void addCell(TextView textView, int i) {
        addView(textView, new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i), getResources().getDisplayMetrics()), -1));
    }

    private final void configureCommon(TextView textView) {
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        textView.setTextColor(-1);
        textView.setBackgroundResource(R$drawable.table_cell_background);
        textView.setHorizontallyScrolling(true);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setMaxLines(1);
    }

    private final TextView createCell() {
        TextView textView = new TextView(getContext());
        configureCommon(textView);
        return textView;
    }

    private final EditText createEditableCell() {
        final EditText editText = new EditText(getContext());
        configureCommon(editText);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.errors.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean createEditableCell$lambda$2$lambda$1;
                createEditableCell$lambda$2$lambda$1 = VariableView.createEditableCell$lambda$2$lambda$1(VariableView.this, editText, textView, i, keyEvent);
                return createEditableCell$lambda$2$lambda$1;
            }
        });
        return editText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createEditableCell$lambda$2$lambda$1(VariableView variableView, EditText editText, TextView textView, int i, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getAction() != 0) || i != 6) {
            return false;
        }
        variableView.onEnterAction.invoke(editText.getText().toString());
        return true;
    }

    public final TextView getNameText() {
        return this.nameText;
    }

    public final TextView getTypeText() {
        return this.typeText;
    }

    public final EditText getValueText() {
        return this.valueText;
    }

    public final void setOnEnterAction(izs<? super String, s3q0> izsVar) {
        this.onEnterAction = izsVar;
    }
}
