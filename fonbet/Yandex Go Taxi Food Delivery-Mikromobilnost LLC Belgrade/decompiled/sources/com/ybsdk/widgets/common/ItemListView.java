package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.fch0;
import defpackage.l1i0;
import defpackage.poh0;
import defpackage.t3i0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0013\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/widgets/common/ItemListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "initialize", "iconId", "setIcon", "(I)V", "title", "setTitle", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ItemListView extends ConstraintLayout {
    private ImageView icon;
    private TextView title;

    public ItemListView(Context context) {
        super(context);
        initialize(context, null, 0, 0);
    }

    private final void initialize(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        LayoutInflater.from(context).inflate(poh0.ybsdk_item_list, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, t3i0.YbSdkItemListView, defStyleAttr, defStyleRes);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(t3i0.YbSdkItemListView_ybsdk_icon, 0);
            String string = obtainStyledAttributes.getString(t3i0.YbSdkItemListView_ybsdk_title);
            if (string == null) {
                string = "";
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(t3i0.YbSdkItemListView_ybsdk_textStyleAppearance, l1i0.Widget_YB_Text_Title1);
            View findViewById = findViewById(fch0.image);
            ((ImageView) findViewById).setImageResource(resourceId);
            this.icon = (ImageView) findViewById;
            View findViewById2 = findViewById(fch0.title);
            ((TextView) findViewById2).setText(string);
            TextView textView = (TextView) findViewById2;
            this.title = textView;
            if (textView == null) {
                textView = null;
            }
            textView.setTextAppearance(resourceId2);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setIcon(int iconId) {
        ImageView imageView = this.icon;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageResource(iconId);
    }

    public final void setTitle(int title) {
        TextView textView = this.title;
        if (textView == null) {
            textView = null;
        }
        textView.setText(title);
    }

    public ItemListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet, 0, 0);
    }

    public ItemListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet, i, 0);
    }

    public ItemListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(context, attributeSet, i, i2);
    }
}
