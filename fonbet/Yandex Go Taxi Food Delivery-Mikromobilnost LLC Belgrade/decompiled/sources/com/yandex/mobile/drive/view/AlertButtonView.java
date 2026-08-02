package com.yandex.mobile.drive.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.yandex.payment.common.result.ResultType;
import defpackage.d4;
import defpackage.dph0;
import defpackage.i3y;
import defpackage.j01;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zgh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\f2\u0006\u0010\t\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R.\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0017¨\u0006A"}, d2 = {"Lcom/yandex/mobile/drive/view/AlertButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "text", "", "res", "Lzy11;", "setTopTextAndIcon", "(Ljava/lang/CharSequence;Ljava/lang/Integer;)V", "setTopText", "(Ljava/lang/CharSequence;)V", "showSpaces", "()V", "hideSpaces", "", ResultType.RESULT_TYPE_LOADING, "setLoading", "(Z)V", "topText", "bottomText", "iconId", "setContent", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;)V", "colorId", "setHintColor", "(I)V", "", "visible", "setHint", "(Ljava/lang/String;Z)V", "Landroid/widget/TextView;", "textTop", "Landroid/widget/TextView;", "textBottom", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "Landroid/widget/Space;", "topSpace", "Landroid/widget/Space;", "bottomSpace", "Lcom/yandex/mobile/drive/view/Loader;", "loader$delegate", "Li3y;", "getLoader", "()Lcom/yandex/mobile/drive/view/Loader;", "loader", "Lkotlin/Function1;", "onTap", "Ltls;", "getOnTap", "()Ltls;", "setOnTap", "(Ltls;)V", "dismissOnTap", "Z", "getDismissOnTap", "()Z", "setDismissOnTap", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AlertButtonView extends FrameLayout {
    private final Space bottomSpace;
    private boolean dismissOnTap;
    private final ImageView icon;

    /* renamed from: loader$delegate, reason: from kotlin metadata */
    private final i3y loader;
    private tls onTap;
    private final TextView textBottom;
    private final TextView textTop;
    private final Space topSpace;

    public AlertButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(dph0.view_alert_button, (ViewGroup) this, true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.textTop = (TextView) findViewById(zgh0.textTop);
        this.textBottom = (TextView) findViewById(zgh0.textBottom);
        this.icon = (ImageView) findViewById(zgh0.icon);
        this.topSpace = (Space) findViewById(zgh0.topSpace);
        this.bottomSpace = (Space) findViewById(zgh0.bottomSpace);
        this.loader = kotlin.a.a(new d4(24, this));
        this.onTap = new j01(22);
        this.dismissOnTap = true;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true)) {
            setForeground(context.getDrawable(typedValue.resourceId));
        } else {
            ny61.g("Failed requirement.");
            throw null;
        }
    }

    private final Loader getLoader() {
        return (Loader) this.loader.getValue();
    }

    private final void hideSpaces() {
        this.topSpace.setVisibility(8);
        this.bottomSpace.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Loader loader_delegate$lambda$1(AlertButtonView alertButtonView) {
        Loader loader = (Loader) alertButtonView.findViewById(zgh0.loader);
        loader.applyModernLoadStyle();
        return loader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onTap$lambda$2(AlertButtonView alertButtonView) {
        return zy11.a;
    }

    public static /* synthetic */ void setContent$default(AlertButtonView alertButtonView, CharSequence charSequence, CharSequence charSequence2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        alertButtonView.setContent(charSequence, charSequence2, num);
    }

    private final void setTopText(CharSequence text) {
        this.textTop.setText(text);
    }

    private final void setTopTextAndIcon(CharSequence text, Integer res) {
        setTopText(text);
        ImageView imageView = this.icon;
        if (res == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.icon.setImageResource(res.intValue());
        }
    }

    private final void showSpaces() {
        this.topSpace.setVisibility(0);
        this.bottomSpace.setVisibility(0);
    }

    public final boolean getDismissOnTap() {
        return this.dismissOnTap;
    }

    public final tls getOnTap() {
        return this.onTap;
    }

    public final void setContent(CharSequence topText, CharSequence bottomText, Integer iconId) {
        if (bottomText == null && iconId == null) {
            showSpaces();
        } else {
            hideSpaces();
        }
        setTopTextAndIcon(topText, iconId);
        TextView textView = this.textBottom;
        textView.setText(bottomText);
        textView.setVisibility((bottomText == null || bottomText.length() == 0) ? 8 : 0);
    }

    public final void setDismissOnTap(boolean z) {
        this.dismissOnTap = z;
    }

    public final void setHint(String text, boolean visible) {
        if ((this.textBottom.getVisibility() == 0) == visible) {
            if (!visible || jl40.l(this.textBottom.getText(), text)) {
                return;
            }
            this.textBottom.setText(text);
            return;
        }
        TextView textView = this.textBottom;
        if (!visible) {
            textView.setVisibility(8);
        } else {
            textView.setText(text);
            this.textBottom.setVisibility(0);
        }
    }

    public final void setHintColor(int colorId) {
        int color = getContext().getColor(colorId);
        this.textTop.setTextColor(color);
        getLoader().setColor(color);
    }

    public final void setLoading(boolean loading) {
        if (loading) {
            Loader.start$default(getLoader(), 0L, 1, null);
            this.textTop.setVisibility(4);
            setEnabled(false);
        } else {
            getLoader().stop();
            this.textTop.setVisibility(0);
            setEnabled(true);
        }
    }

    public final void setOnTap(tls tlsVar) {
        this.onTap = tlsVar;
    }

    public /* synthetic */ AlertButtonView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlertButtonView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
