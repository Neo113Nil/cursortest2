package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.cma1;
import defpackage.e361;
import defpackage.fch0;
import defpackage.ny61;
import defpackage.poh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/widgets/common/TextsHolder;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "titleColor", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "descriptionColor", "Lzy11;", "setTexts$widgets_common_release", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "setTexts", "Le361;", "binding", "Le361;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextsHolder extends LinearLayout {
    private final e361 binding;

    public TextsHolder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_item_widget_texts, this);
        int i2 = fch0.desc_view;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = fch0.title_view;
            TextView textView2 = (TextView) cma1.O(i2, this);
            if (textView2 != null) {
                this.binding = new e361(this, textView, textView2);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setTexts$widgets_common_release(String title, Integer titleColor, String description, Integer descriptionColor) {
        e361 e361Var = this.binding;
        TextView textView = e361Var.c;
        TextView textView2 = e361Var.b;
        textView.setText(title);
        if (titleColor != null) {
            e361Var.c.setTextColor(titleColor.intValue());
        }
        textView2.setText(description);
        if (descriptionColor != null) {
            textView2.setTextColor(descriptionColor.intValue());
        }
    }

    public TextsHolder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TextsHolder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TextsHolder(Context context) {
        this(context, null, 0, 6, null);
    }
}
