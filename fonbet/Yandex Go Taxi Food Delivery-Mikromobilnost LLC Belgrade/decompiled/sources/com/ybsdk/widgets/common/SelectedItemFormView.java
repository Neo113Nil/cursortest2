package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import defpackage.ahq0;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.lwg0;
import defpackage.n861;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.poh0;
import defpackage.rbv;
import defpackage.sm91;
import defpackage.t3i0;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.xty0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/widgets/common/SelectedItemFormView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lahq0;", "update", "Lzy11;", "render", "(Ltls;)V", "Ln861;", "binding", "Ln861;", ClidProvider.STATE, "Lahq0;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectedItemFormView extends ConstraintLayout {
    private final n861 binding;
    private ahq0 state;

    public SelectedItemFormView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_selected_item_form_view, this);
        int i2 = fch0.selectedItemFormViewIcon;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = fch0.selectedItemFormViewLabel;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = fch0.selectedItemFormViewRightIcon;
                ImageView imageView2 = (ImageView) cma1.O(i2, this);
                if (imageView2 != null) {
                    i2 = fch0.selectedItemFormViewSubtitle;
                    SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, this);
                    if (spoilerTextView != null) {
                        i2 = fch0.selectedItemFormViewTitle;
                        TextView textView2 = (TextView) cma1.O(i2, this);
                        if (textView2 != null) {
                            this.binding = new n861(this, imageView, textView, imageView2, spoilerTextView, textView2);
                            this.state = ahq0.j;
                            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t3i0.YbSdkSelectedItemFormView, i, 0);
                            try {
                                int resourceId = obtainStyledAttributes.getResourceId(t3i0.YbSdkSelectedItemFormView_ybsdk_icon, 0);
                                String string = obtainStyledAttributes.getString(t3i0.YbSdkSelectedItemFormView_ybsdk_label);
                                String str = "";
                                string = string == null ? "" : string;
                                String string2 = obtainStyledAttributes.getString(t3i0.YbSdkSelectedItemFormView_ybsdk_title);
                                if (string2 != null) {
                                    str = string2;
                                }
                                int resourceId2 = obtainStyledAttributes.getResourceId(t3i0.YbSdkSelectedItemFormView_ybsdk_background, nyg0.ybsdk_background_itemlist_paymentmethod);
                                ahq0 ahq0Var = this.state;
                                boolean z = obtainStyledAttributes.getBoolean(t3i0.YbSdkSelectedItemFormView_ybsdk_showRightIcon, true);
                                Integer valueOf = Integer.valueOf(resourceId);
                                if (resourceId == 0) {
                                    valueOf = null;
                                }
                                nbv nbvVar = valueOf != null ? new nbv(valueOf.intValue(), null) : null;
                                Text.Companion.getClass();
                                this.state = new ahq0(z, nbvVar, new Text.Constant(str), ahq0Var.d, new Text.Constant(string), resourceId2, ahq0Var.g, ahq0Var.h, ahq0Var.i);
                                obtainStyledAttributes.recycle();
                                setMinHeight(com.ybsdk.core.utils.ext.view.b.h(lwg0.ybsdk_select_payment_method_item_min_height, this));
                                return;
                            } catch (Throwable th) {
                                obtainStyledAttributes.recycle();
                                throw th;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(tls update) {
        CharSequence charSequence;
        n861 n861Var = this.binding;
        ahq0 ahq0Var = (ahq0) update.invoke(this.state);
        this.state = ahq0Var;
        CharSequence a = com.ybsdk.core.utils.text.d.a(sm91.c(n861Var), ahq0Var.c);
        Text text = this.state.d;
        if (text == null || (charSequence = com.ybsdk.core.utils.text.d.a(sm91.c(n861Var), text)) == null) {
            charSequence = "";
        }
        rbv rbvVar = this.state.b;
        ImageView imageView = n861Var.b;
        ImageView imageView2 = n861Var.d;
        SpoilerTextView spoilerTextView = n861Var.e;
        TextView textView = n861Var.f;
        TextView textView2 = n861Var.c;
        v4b1.k(rbvVar, imageView, null, null, 6);
        textView2.setVisibility(this.state.e != null ? 0 : 8);
        xty0.d(textView2, this.state.e);
        textView.setText(a);
        ColorModel colorModel = this.state.i;
        if (colorModel != null) {
            textView.setTextColor(colorModel.get(sm91.c(n861Var)));
        }
        spoilerTextView.setVisibility(charSequence.length() > 0 ? 0 : 8);
        spoilerTextView.setText(charSequence);
        imageView2.setVisibility(this.state.a ? 0 : 8);
        imageView2.setColorFilter(com.ybsdk.core.utils.ext.view.b.g(this.state.h, this), PorterDuff.Mode.SRC_IN);
        setContentDescription(((Object) com.ybsdk.core.utils.text.d.a(sm91.c(n861Var), this.state.g)) + " " + ((Object) a) + " " + ((Object) charSequence));
        setBackgroundResource(this.state.f);
    }

    public SelectedItemFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SelectedItemFormView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SelectedItemFormView(Context context) {
        this(context, null, 0, 6, null);
    }
}
