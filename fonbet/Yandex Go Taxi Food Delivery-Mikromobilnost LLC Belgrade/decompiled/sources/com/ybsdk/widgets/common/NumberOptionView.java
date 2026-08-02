package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import defpackage.cma1;
import defpackage.cn60;
import defpackage.fch0;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.sm91;
import defpackage.t3i0;
import defpackage.u361;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/widgets/common/NumberOptionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcn60;", ClidProvider.STATE, "Lzy11;", "render", "(Lcn60;)V", "Lu361;", "binding", "Lu361;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NumberOptionView extends ConstraintLayout {
    private final u361 binding;

    public NumberOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_number_option_view, this);
        int i2 = fch0.option_content;
        TextView textView = (TextView) cma1.O(i2, this);
        Text.Constant constant = null;
        if (textView != null) {
            i2 = fch0.option_number;
            TextView textView2 = (TextView) cma1.O(i2, this);
            if (textView2 != null) {
                this.binding = new u361(this, textView, textView2);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t3i0.YbSdkNumberOptionView, i, 0);
                try {
                    int integer = obtainStyledAttributes.getInteger(t3i0.YbSdkNumberOptionView_ybsdk_number, 0);
                    String string = obtainStyledAttributes.getString(t3i0.YbSdkNumberOptionView_ybsdk_content);
                    if (string != null) {
                        Text.Companion.getClass();
                        constant = new Text.Constant(string);
                    }
                    render(new cn60(integer, constant));
                    obtainStyledAttributes.recycle();
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(cn60 state) {
        u361 u361Var = this.binding;
        u361Var.c.setText(String.valueOf(state.a));
        TextView textView = u361Var.b;
        Text text = state.b;
        textView.setText(text != null ? com.ybsdk.core.utils.text.d.a(sm91.c(u361Var), text) : null);
    }

    public NumberOptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ NumberOptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public NumberOptionView(Context context) {
        this(context, null, 0, 6, null);
    }
}
