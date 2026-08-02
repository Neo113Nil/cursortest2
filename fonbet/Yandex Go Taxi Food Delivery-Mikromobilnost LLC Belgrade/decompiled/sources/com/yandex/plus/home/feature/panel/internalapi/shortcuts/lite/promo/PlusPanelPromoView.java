package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import com.bumptech.glide.RequestManager;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a5d0;
import defpackage.ait;
import defpackage.aob1;
import defpackage.b5d0;
import defpackage.bb1;
import defpackage.cmh0;
import defpackage.ej40;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.h2d0;
import defpackage.jna1;
import defpackage.mm91;
import defpackage.msa1;
import defpackage.nvg0;
import defpackage.ph;
import defpackage.rng0;
import defpackage.s2d0;
import defpackage.tj;
import defpackage.u9h0;
import defpackage.vng;
import defpackage.wh;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\b2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\b2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b/\u0010-J!\u00103\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u0001002\b\b\u0001\u00102\u001a\u00020\u0011¢\u0006\u0004\b3\u00104J\u001f\u00108\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\"2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J)\u0010<\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\"2\b\u0010;\u001a\u0004\u0018\u00010\"2\u0006\u00107\u001a\u000206¢\u0006\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010@R\u0018\u0010F\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010CR\u0014\u0010H\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010PR\u0016\u0010Q\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010I¨\u0006R"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/promo/PlusPanelPromoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "La5d0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "initViews", "()V", "Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "setBackgroundDrawableWithRippleEffect", "(Landroid/graphics/drawable/Drawable;)V", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "themedContext", "onThemeChanged", "image", "onImage", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "", "text", "setContentDescription", "(Ljava/lang/String;)V", "setActionText", "isEnabled", "setActionEnabled", "(Z)V", "Lh2d0;", "textDrawableHolder", "setTitleTextDrawable", "(Lh2d0;)V", "setSubtitleTextDrawable", "setActionTextDrawable", "Lcom/yandex/plus/core/data/common/PlusColor;", "plusColor", "defaultColor", "setBackgroundColor", "(Lcom/yandex/plus/core/data/common/PlusColor;I)V", "backgroundImageUrl", "Lb5d0;", "imageLoader", "setBackgroundImage", "(Ljava/lang/String;Lb5d0;)V", "longUrl", "shortUrl", "setImage", "(Ljava/lang/String;Ljava/lang/String;Lb5d0;)V", "Landroid/widget/TextView;", "titleTextView", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "arrowForwardImageView", "Landroid/widget/ImageView;", "subtitleTextView", "actionTextView", "longImageView", "shortImageView", "longLayoutMinWidth", CA20Status.STATUS_USER_I, "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "isShortLayout", "Z", "isActionEnabled", "Landroid/content/Context;", "currentLayoutId", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelPromoView extends ConstraintLayout implements a5d0 {
    private TextView actionTextView;
    private ImageView arrowForwardImageView;
    private final float cornerRadius;
    private int currentLayoutId;
    private boolean isActionEnabled;
    private boolean isShortLayout;
    private ImageView longImageView;
    private final int longLayoutMinWidth;
    private ImageView shortImageView;
    private TextView subtitleTextView;
    private Context themedContext;
    private TextView titleTextView;

    public static final class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
            whVar.p("android.widget.Button");
            whVar.b(ph.g);
        }
    }

    public PlusPanelPromoView(Context context) {
        super(context);
        this.longLayoutMinWidth = getResources().getDimensionPixelSize(nvg0.plus_sdk_panel_promo_long_layout_min_width);
        this.cornerRadius = getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius);
        this.isShortLayout = true;
        this.themedContext = context;
        int i = cmh0.plus_sdk_panel_promo_view_short;
        this.currentLayoutId = i;
        bb1.v(this, i, true);
        initViews();
        setClipToOutline(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        b.p(this, new a());
    }

    private final void initViews() {
        this.titleTextView = (TextView) findViewById(u9h0.plus_panel_promo_title_text_view);
        this.arrowForwardImageView = (ImageView) findViewById(u9h0.plus_panel_promo_arrow_forward_image_view);
        this.subtitleTextView = (TextView) findViewById(u9h0.plus_panel_promo_subtitle_text_view);
        this.actionTextView = (TextView) findViewById(u9h0.plus_panel_promo_action_text_view);
        this.longImageView = (ImageView) findViewById(u9h0.plus_panel_promo_long_image_view);
        this.shortImageView = (ImageView) findViewById(u9h0.plus_panel_promo_short_image_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundDrawableWithRippleEffect(Drawable backgroundDrawable) {
        int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, this.themedContext);
        float f = this.cornerRadius;
        setBackground(mm91.a(backgroundDrawable, p, f, f, f, f));
    }

    @Override // defpackage.a5d0
    public void onImage(final Drawable image) {
        if (image != null) {
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$onImage$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        if (PlusPanelPromoView.this.getWidth() <= 0 || PlusPanelPromoView.this.getHeight() <= 0) {
                            return;
                        }
                        PlusPanelPromoView.this.setBackgroundDrawableWithRippleEffect(msa1.o(new BitmapDrawable(PlusPanelPromoView.this.getContext().getResources(), ThumbnailUtils.extractThumbnail(ffx.d0(image, 0, 0, 7), PlusPanelPromoView.this.getWidth(), PlusPanelPromoView.this.getHeight())), PlusPanelPromoView.this.cornerRadius));
                    }
                });
            } else {
                if (getWidth() <= 0 || getHeight() <= 0) {
                    return;
                }
                setBackgroundDrawableWithRippleEffect(msa1.o(new BitmapDrawable(getContext().getResources(), ThumbnailUtils.extractThumbnail(ffx.d0(image, 0, 0, 7), getWidth(), getHeight())), this.cornerRadius));
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        boolean z = right - left < this.longLayoutMinWidth;
        this.isShortLayout = z;
        int i = z ? cmh0.plus_sdk_panel_promo_view_short : cmh0.plus_sdk_panel_promo_view_long;
        if (i != this.currentLayoutId) {
            this.currentLayoutId = i;
            removeAllViews();
            bb1.v(this, i, true);
            initViews();
        }
    }

    public void onThemeChanged(Context themedContext) {
        this.themedContext = themedContext;
    }

    public final void setActionEnabled(final boolean isEnabled) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setActionEnabled$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    PlusPanelPromoView.this.isActionEnabled = isEnabled;
                    TextView textView = PlusPanelPromoView.this.actionTextView;
                    if (textView != null) {
                        jna1.c(textView, isEnabled);
                    }
                    ImageView imageView = PlusPanelPromoView.this.arrowForwardImageView;
                    if (imageView != null) {
                        imageView.setVisibility(isEnabled ? 0 : 8);
                    }
                }
            });
            return;
        }
        this.isActionEnabled = isEnabled;
        TextView textView = this.actionTextView;
        if (textView != null) {
            jna1.c(textView, isEnabled);
        }
        ImageView imageView = this.arrowForwardImageView;
        if (imageView != null) {
            imageView.setVisibility(isEnabled ? 0 : 8);
        }
    }

    public final void setActionText(final CharSequence text) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setActionText$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TextView textView = PlusPanelPromoView.this.actionTextView;
                    if (textView != null) {
                        textView.setText(text);
                    }
                }
            });
            return;
        }
        TextView textView = this.actionTextView;
        if (textView != null) {
            textView.setText(text);
        }
    }

    public final void setActionTextDrawable(final h2d0 textDrawableHolder) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setActionTextDrawable$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TextView textView = PlusPanelPromoView.this.actionTextView;
                    if (textView != null) {
                        aob1.c(textView, textDrawableHolder, new tj(18, textView, PlusPanelPromoView.this));
                    }
                }
            });
            return;
        }
        TextView textView = this.actionTextView;
        if (textView != null) {
            aob1.c(textView, textDrawableHolder, new tj(18, textView, this));
        }
    }

    public final void setBackgroundColor(final PlusColor plusColor, final int defaultColor) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setBackgroundColor$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    PlusColor plusColor2 = PlusColor.this;
                    float f = this.cornerRadius;
                    this.setBackgroundDrawableWithRippleEffect(s2d0.b(plusColor2, defaultColor, f, f, f, f));
                }
            });
        } else {
            float f = this.cornerRadius;
            setBackgroundDrawableWithRippleEffect(s2d0.b(plusColor, defaultColor, f, f, f, f));
        }
    }

    public final void setBackgroundImage(final String backgroundImageUrl, final b5d0 imageLoader) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setBackgroundImage$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    b5d0 b5d0Var = b5d0.this;
                    com.yandex.plus.glide.b bVar = (com.yandex.plus.glide.b) b5d0Var;
                    ait aitVar = (ait) bVar.b.get(this);
                    if (aitVar != null) {
                        ((RequestManager) bVar.a.getValue()).clear(aitVar);
                    }
                    ((com.yandex.plus.glide.b) b5d0.this).b(backgroundImageUrl).a(this);
                }
            });
            return;
        }
        com.yandex.plus.glide.b bVar = (com.yandex.plus.glide.b) imageLoader;
        ait aitVar = (ait) bVar.b.get(this);
        if (aitVar != null) {
            ((RequestManager) bVar.a.getValue()).clear(aitVar);
        }
        bVar.b(backgroundImageUrl).a(this);
    }

    public final void setContentDescription(String text) {
        setContentDescription((CharSequence) text);
    }

    public final void setImage(final String longUrl, final String shortUrl, final b5d0 imageLoader) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setImage$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ImageView imageView = PlusPanelPromoView.this.longImageView;
                    if (imageView != null) {
                        ((com.yandex.plus.glide.b) imageLoader).b(longUrl).b(imageView);
                    }
                    ImageView imageView2 = PlusPanelPromoView.this.shortImageView;
                    if (imageView2 != null) {
                        ((com.yandex.plus.glide.b) imageLoader).b(shortUrl).b(imageView2);
                    }
                }
            });
            return;
        }
        ImageView imageView = this.longImageView;
        if (imageView != null) {
            ((com.yandex.plus.glide.b) imageLoader).b(longUrl).b(imageView);
        }
        ImageView imageView2 = this.shortImageView;
        if (imageView2 != null) {
            ((com.yandex.plus.glide.b) imageLoader).b(shortUrl).b(imageView2);
        }
    }

    public final void setSubtitle(final CharSequence subtitle) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setSubtitle$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TextView textView = PlusPanelPromoView.this.subtitleTextView;
                    if (textView != null) {
                        textView.setVisibility(!evu0.J(subtitle) ? 0 : 8);
                    }
                    TextView textView2 = PlusPanelPromoView.this.subtitleTextView;
                    if (textView2 != null) {
                        textView2.setText(subtitle);
                    }
                }
            });
            return;
        }
        TextView textView = this.subtitleTextView;
        if (textView != null) {
            textView.setVisibility(!evu0.J(subtitle) ? 0 : 8);
        }
        TextView textView2 = this.subtitleTextView;
        if (textView2 != null) {
            textView2.setText(subtitle);
        }
    }

    public final void setSubtitleTextDrawable(final h2d0 textDrawableHolder) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setSubtitleTextDrawable$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TextView textView = PlusPanelPromoView.this.subtitleTextView;
                    if (textView != null) {
                        aob1.c(textView, textDrawableHolder, new ej40(8));
                    }
                }
            });
            return;
        }
        TextView textView = this.subtitleTextView;
        if (textView != null) {
            aob1.c(textView, textDrawableHolder, new ej40(8));
        }
    }

    public final void setTitle(final CharSequence title) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setTitle$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TextView textView = PlusPanelPromoView.this.titleTextView;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            });
            return;
        }
        TextView textView = this.titleTextView;
        if (textView != null) {
            textView.setText(title);
        }
    }

    public final void setTitleTextDrawable(final h2d0 textDrawableHolder) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView$setTitleTextDrawable$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TextView textView = PlusPanelPromoView.this.titleTextView;
                    if (textView != null) {
                        aob1.c(textView, textDrawableHolder, new ej40(8));
                    }
                }
            });
            return;
        }
        TextView textView = this.titleTextView;
        if (textView != null) {
            aob1.c(textView, textDrawableHolder, new ej40(8));
        }
    }
}
