package com.yandex.passport.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.wuj0;
import defpackage.yma1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/passport/internal/widget/BigSocialButton;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onFinishInflate", "()V", "textId", "setText", "(I)V", "", "text", "(Ljava/lang/String;)V", "icon", "setIcon", "Landroid/widget/TextView;", "textMessage", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "imageIcon", "Landroid/widget/ImageView;", "iconSrc", CA20Status.STATUS_USER_I, "Ljava/lang/String;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BigSocialButton extends LinearLayout {
    public static final int $stable = 8;
    private final int iconSrc;
    private ImageView imageIcon;
    private final String text;
    private TextView textMessage;

    public BigSocialButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        View.inflate(context, R.layout.passport_widget_big_social_button, this);
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PassportBigSocialButton, i, 0);
            this.iconSrc = typedArray.getResourceId(R.styleable.PassportBigSocialButton_passport_iconSrc, 0);
            this.text = typedArray.getString(R.styleable.PassportBigSocialButton_passport_text);
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.imageIcon = (ImageView) findViewById(R.id.image_big_social_button);
        this.textMessage = (TextView) findViewById(R.id.text_big_social_button);
        int i = this.iconSrc;
        if (i != 0) {
            setIcon(i);
        }
        String str = this.text;
        if (str != null) {
            setText(str);
        }
    }

    public final void setIcon(int icon) {
        ImageView imageView = this.imageIcon;
        if (imageView == null) {
            imageView = null;
        }
        Resources resources = getResources();
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        imageView.setImageDrawable(yma1.b(resources, icon, theme));
    }

    public final void setText(int textId) {
        setText(getResources().getString(textId));
    }

    public final void setText(String text) {
        TextView textView = this.textMessage;
        if (textView == null) {
            textView = null;
        }
        textView.setText(text);
        setContentDescription(text);
    }

    public BigSocialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BigSocialButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BigSocialButton(Context context) {
        this(context, null, 0, 6, null);
    }
}
