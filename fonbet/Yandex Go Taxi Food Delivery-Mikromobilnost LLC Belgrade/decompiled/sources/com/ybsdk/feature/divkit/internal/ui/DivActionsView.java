package com.ybsdk.feature.divkit.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import defpackage.cmi;
import defpackage.kdk;
import defpackage.kp50;
import defpackage.rje;
import defpackage.scc;
import defpackage.ung0;
import defpackage.vvg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/ui/DivActionsView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "action", "index", "Landroid/widget/TextView;", "createActionText", "(Ljava/lang/String;I)Landroid/widget/TextView;", "Lkdk;", ClidProvider.STATE, "Lzy11;", "render", "(Lkdk;)V", "Landroidx/appcompat/widget/LinearLayoutCompat;", "contentContainer", "Landroidx/appcompat/widget/LinearLayoutCompat;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivActionsView extends NestedScrollView {
    private final LinearLayoutCompat contentContainer;

    public DivActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context, attributeSet, i);
        linearLayoutCompat.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = kp50.r(10);
        marginLayoutParams.bottomMargin = kp50.r(10);
        linearLayoutCompat.setLayoutParams(marginLayoutParams);
        this.contentContainer = linearLayoutCompat;
        addView(linearLayoutCompat);
    }

    private final TextView createActionText(String action, int index) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(View.generateViewId());
        appCompatTextView.setText(action);
        appCompatTextView.setTextSize(8.0f * Resources.getSystem().getDisplayMetrics().scaledDensity);
        appCompatTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        int r = kp50.r(4);
        int d = rje.d(vvg0.ybsdk_screen_horizontal_space, appCompatTextView.getContext());
        appCompatTextView.setPadding(d, r, d, r);
        appCompatTextView.setTextColor(rje.a(appCompatTextView.getContext(), ung0.ybColor_textIcon_primary));
        appCompatTextView.setBackgroundColor(rje.a(appCompatTextView.getContext(), index % 2 == 0 ? ung0.ybColor_fill_color7_200 : ung0.ybColor_background_primary));
        appCompatTextView.setOnClickListener(new cmi(5, action));
        return appCompatTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createActionText$lambda$4$lambda$3(String str, View view) {
        rje.b(view.getContext(), str, "Deeplink");
        rje.m(view.getContext(), "Deeplink copied");
    }

    public final void render(kdk state) {
        this.contentContainer.removeAllViews();
        int i = 0;
        for (Object obj : state.a) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            this.contentContainer.addView(createActionText((String) obj, i));
            i = i2;
        }
    }

    public DivActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivActionsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivActionsView(Context context) {
        this(context, null, 0, 6, null);
    }
}
