package com.yandex.go.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.cdc;
import defpackage.dg4;
import defpackage.fg4;
import defpackage.gtq0;
import defpackage.hg4;
import defpackage.iog0;
import defpackage.kdc;
import defpackage.kh4;
import defpackage.n4i0;
import defpackage.nwy0;
import defpackage.vng;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\u0016J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0016J\u0019\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b,\u0010\u001aJ\u0019\u0010-\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u000201¢\u0006\u0004\b(\u00102R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/yandex/go/design/view/GoImageButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "refreshBackground", "()V", "refresh", "clearImageResource", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "resId", "setImageResource", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/drawable/Icon;", "icon", "setImageIcon", "(Landroid/graphics/drawable/Icon;)V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "setImageURI", "(Landroid/net/Uri;)V", "color", "setBackgroundColor", "resid", "setBackgroundResource", C0553n3.g, "setBackgroundDrawable", "setBackground", "Lhg4;", "updateBackground", "(Lhg4;)V", "Lkdc;", "(Lkdc;)V", "imageRes", CA20Status.STATUS_USER_I, "Lkh4;", "backgroundHolder", "Lkh4;", "", "useBackgroundHolder", "Z", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GoImageButton extends AppCompatImageButton implements nwy0 {
    private final kh4 backgroundHolder;
    private int imageRes;
    private boolean useBackgroundHolder;

    public GoImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kh4 kh4Var = new kh4();
        this.backgroundHolder = kh4Var;
        this.useBackgroundHolder = true;
        kh4Var.a(context, attributeSet, getBackground());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n4i0.AppCompatImageView, i, 0);
        this.imageRes = obtainStyledAttributes.getResourceId(n4i0.AppCompatImageView_android_src, 0);
        obtainStyledAttributes.recycle();
        refresh();
    }

    private final void clearImageResource() {
        this.imageRes = 0;
    }

    private final void refresh() {
        Integer valueOf = Integer.valueOf(this.imageRes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            setImageResource(valueOf.intValue());
        }
        refreshBackground();
    }

    private final void refreshBackground() {
        this.useBackgroundHolder = false;
        setBackgroundDrawable(this.backgroundHolder.b(getContext()));
        this.useBackgroundHolder = true;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        refresh();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        if (this.useBackgroundHolder) {
            updateBackground(gtq0.T(background));
        } else {
            super.setBackground(background);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        if (this.useBackgroundHolder) {
            updateBackground(new dg4(new cdc(color)));
        } else {
            super.setBackgroundColor(color);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.view.View
    public void setBackgroundDrawable(Drawable background) {
        if (this.useBackgroundHolder) {
            updateBackground(gtq0.T(background));
        } else {
            super.setBackgroundDrawable(background);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.view.View
    public void setBackgroundResource(int resid) {
        if (this.useBackgroundHolder) {
            updateBackground(new fg4(resid));
        } else {
            super.setBackgroundResource(resid);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        clearImageResource();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        clearImageResource();
    }

    @Override // android.widget.ImageView
    public void setImageIcon(Icon icon) {
        super.setImageIcon(icon);
        clearImageResource();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageDrawable(resId != 0 ? vng.t(resId, getContext()) : null);
        this.imageRes = resId;
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        clearImageResource();
    }

    public final void updateBackground(hg4 background) {
        this.backgroundHolder.a = background;
        refreshBackground();
    }

    public final void setBackgroundColor(kdc color) {
        updateBackground(new dg4(color));
    }

    public GoImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GoImageButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ GoImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? iog0.imageButtonStyle : i);
    }
}
