package com.ybsdk.widgets.common.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.g061;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.v4b1;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetGeneralContentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "Lcom/ybsdk/core/utils/text/Text;", "text", "Lzy11;", "renderText", "(Landroid/widget/TextView;Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/widget/ImageView;", "Lcom/ybsdk/widgets/common/bottomsheet/g;", "image", "renderImage", "(Landroid/widget/ImageView;Lcom/ybsdk/widgets/common/bottomsheet/g;)V", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State$a;", "content", "render", "(Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State$a;)V", "Lg061;", "binding", "Lg061;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomSheetGeneralContentView extends LinearLayout {
    private final g061 binding;

    public BottomSheetGeneralContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = View.inflate(context, poh0.ybsdk_bottom_sheet_general_content, this);
        int i2 = fch0.dialogBottomImage;
        ImageView imageView = (ImageView) cma1.O(i2, inflate);
        if (imageView != null) {
            i2 = fch0.dialogDescription;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                i2 = fch0.dialogTitle;
                TextView textView2 = (TextView) cma1.O(i2, inflate);
                if (textView2 != null) {
                    i2 = fch0.dialogTopImage;
                    ImageView imageView2 = (ImageView) cma1.O(i2, inflate);
                    if (imageView2 != null) {
                        this.binding = new g061((LinearLayout) inflate, imageView, textView, textView2, imageView2);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void renderImage(ImageView imageView, g gVar) {
        ImageView.ScaleType scaleType;
        imageView.setVisibility(gVar != null ? 0 : 8);
        if (gVar == null) {
            return;
        }
        int i = n.a[gVar.b.ordinal()];
        if (i == 1) {
            scaleType = ImageView.ScaleType.CENTER;
        } else if (i == 2) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if (i == 3) {
            scaleType = ImageView.ScaleType.FIT_START;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        imageView.setScaleType(scaleType);
        Integer num = gVar.c;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = gVar.e;
        imageView.setPadding(num2 != null ? num2.intValue() : 0, intValue, imageView.getPaddingRight(), imageView.getPaddingBottom());
        v4b1.k(gVar.a, imageView, null, null, 6);
        imageView.setAlpha(gVar.d);
    }

    private final void renderText(TextView textView, Text text) {
        textView.setVisibility(text != null ? 0 : 8);
        textView.setText(text != null ? com.ybsdk.core.utils.text.d.a(textView.getContext(), text) : null);
    }

    public final void render(BottomSheetDialogView.State.a content) {
        g061 g061Var = this.binding;
        TextView textView = g061Var.d;
        ImageView imageView = g061Var.e;
        renderText(textView, content.a);
        TextView textView2 = g061Var.d;
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer num = content.g;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, kp50.r(num != null ? num.intValue() : 24), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        textView2.setLayoutParams(marginLayoutParams);
        renderText(g061Var.c, content.b);
        renderImage(imageView, content.c);
        renderImage(g061Var.b, content.d);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        Integer num2 = content.f;
        layoutParams2.height = num2 != null ? kp50.r(num2.intValue()) : -2;
        imageView.setLayoutParams(layoutParams2);
    }

    public BottomSheetGeneralContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BottomSheetGeneralContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BottomSheetGeneralContentView(Context context) {
        this(context, null, 0, 6, null);
    }
}
