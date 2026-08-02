package com.yandex.div.core.view2.errors;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.R$dimen;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import java.util.Map;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ErrorView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
final class DetailsViewGroup extends LinearLayout {
    private final AppCompatTextView errorsOutput;
    private final VariableMonitorView monitorView;
    private final gzs<s3q0> onCloseAction;
    private final gzs<s3q0> onCopyAction;
    private final VariableMonitor variableMonitor;

    public DetailsViewGroup(Context context, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        super(context);
        this.onCloseAction = gzsVar;
        this.onCopyAction = gzsVar2;
        VariableMonitor variableMonitor = new VariableMonitor(izsVar);
        this.variableMonitor = variableMonitor;
        this.errorsOutput = createErrorsOutput();
        this.monitorView = new VariableMonitorView(context, variableMonitor);
        configureView();
    }

    private final void configureView() {
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(8, getResources().getDisplayMetrics());
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        setOrientation(1);
        setBackgroundColor(Color.argb(186, 0, 0, 0));
        setElevation(getResources().getDimension(R$dimen.div_shadow_elevation));
        addView(createTopPanel(), new LinearLayout.LayoutParams(-2, -2));
        addView(this.monitorView, new LinearLayout.LayoutParams(-1, -2));
    }

    private final LinearLayout createControls() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(0, 0, BaseDivViewExtensionsKt.dpToPx(8, linearLayout.getResources().getDisplayMetrics()), 0);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageResource(R.drawable.ic_menu_close_clear_cancel);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsViewGroup.createControls$lambda$5$lambda$2$lambda$1(DetailsViewGroup.this, view);
            }
        });
        ImageView imageView2 = new ImageView(linearLayout.getContext());
        imageView2.setImageResource(R.drawable.ic_menu_save);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsViewGroup.createControls$lambda$5$lambda$4$lambda$3(DetailsViewGroup.this, view);
            }
        });
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createControls$lambda$5$lambda$2$lambda$1(DetailsViewGroup detailsViewGroup, View view) {
        detailsViewGroup.onCloseAction.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createControls$lambda$5$lambda$4$lambda$3(DetailsViewGroup detailsViewGroup, View view) {
        detailsViewGroup.onCopyAction.invoke();
    }

    private final AppCompatTextView createErrorsOutput() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(3);
        return appCompatTextView;
    }

    private final LinearLayout createTopPanel() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(createControls(), new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(32, linearLayout.getResources().getDisplayMetrics()), -2));
        linearLayout.addView(this.errorsOutput, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    public final void setText(String str) {
        this.errorsOutput.setText(str);
    }

    public final void updateVariables(Map<String, ? extends VariableController> map) {
        this.variableMonitor.setControllerMap(map);
    }
}
