package com.yandex.go.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.fgh0;
import defpackage.fsh0;
import defpackage.h1h0;
import defpackage.i3y;
import defpackage.l7b;
import defpackage.nac;
import defpackage.nfv;
import defpackage.pav;
import defpackage.vqb;
import defpackage.wsg0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001b\u0010 \u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/yandex/go/ui/CircleLoadingImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpav;", "imageLoader", "Lzy11;", "init", "(Lpav;)V", "showPlaceholder", "()V", "showLoading", "hideLoading", "", "url", "imageSize", "setImage", "(Ljava/lang/String;I)V", "padding", "setPadding", "(I)V", "Lpav;", "defaultImageSize$delegate", "Li3y;", "getDefaultImageSize", "()I", "defaultImageSize", "Lru/yandex/taxi/widget/progress/CircularProgressBar;", "progressView", "Lru/yandex/taxi/widget/progress/CircularProgressBar;", "Landroidx/appcompat/widget/AppCompatImageView;", "photoImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CircleLoadingImageView extends FrameLayout {

    /* renamed from: defaultImageSize$delegate, reason: from kotlin metadata */
    private final i3y defaultImageSize;
    private pav imageLoader;
    private final AppCompatImageView photoImageView;
    private final CircularProgressBar progressView;

    public CircleLoadingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(fsh0.circle_loading_image_view, (ViewGroup) this, true);
        this.defaultImageSize = kotlin.a.a(new l7b(16, this));
        this.progressView = (CircularProgressBar) findViewById(fgh0.progress);
        this.photoImageView = (AppCompatImageView) findViewById(fgh0.photo_image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultImageSize_delegate$lambda$0(CircleLoadingImageView circleLoadingImageView) {
        return ru.yandex.taxi.design.utils.c.d(wsg0.circle_loading_image_size, circleLoadingImageView);
    }

    private final int getDefaultImageSize() {
        return ((Number) this.defaultImageSize.getValue()).intValue();
    }

    public static /* synthetic */ void setImage$default(CircleLoadingImageView circleLoadingImageView, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = circleLoadingImageView.getDefaultImageSize();
        }
        circleLoadingImageView.setImage(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setImage$lambda$0(CircleLoadingImageView circleLoadingImageView, Drawable drawable) {
        circleLoadingImageView.progressView.setVisibility(8);
        return zy11.a;
    }

    public final void hideLoading() {
        this.progressView.setVisibility(8);
    }

    public final void init(pav imageLoader) {
        this.imageLoader = imageLoader;
    }

    public final void setImage(String url, int imageSize) {
        showLoading();
        pav pavVar = this.imageLoader;
        if (pavVar == null) {
            pavVar = null;
        }
        nac nacVar = (nac) pavVar.a(this.photoImageView);
        nacVar.f(imageSize, imageSize);
        nacVar.g(nfv.a);
        nacVar.h = new vqb(3, this);
        nacVar.i = new CircleLoadingImageView$setImage$2(0, this, CircleLoadingImageView.class, "showPlaceholder", "showPlaceholder()V", 0);
        nacVar.c(url);
    }

    public final void setPadding(int padding) {
        setPadding(padding, padding, padding, padding);
    }

    public final void showLoading() {
        this.photoImageView.setImageResource(h1h0.circle_loading_image_background);
        this.progressView.setVisibility(0);
    }

    public final void showPlaceholder() {
        this.progressView.setVisibility(8);
        this.photoImageView.setImageResource(h1h0.circle_loading_image_background);
    }

    public CircleLoadingImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircleLoadingImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CircleLoadingImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
