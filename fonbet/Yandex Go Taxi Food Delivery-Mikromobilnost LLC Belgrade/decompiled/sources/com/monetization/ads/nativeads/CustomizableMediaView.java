package com.monetization.ads.nativeads;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$styleable;
import defpackage.j73;
import defpackage.ld81;
import defpackage.lj71;
import defpackage.n781;
import defpackage.o6;
import defpackage.vn61;
import defpackage.ym81;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import yads.hj;
import yads.ih3;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001*B+\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\rB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000eR*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@DX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0010\u0010\u0014R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R(\u0010!\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/monetization/ads/nativeads/CustomizableMediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "Llj71;", "videoScaleTypeXmlAttributeParserFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILlj71;)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "a", CA20Status.STATUS_USER_I, "getVideoControlsLayoutId", "()I", "(I)V", "videoControlsLayoutId", "b", "getWidthMeasureSpec", "widthMeasureSpec", "c", "getHeightMeasureSpec", "heightMeasureSpec", "Lyads/ih3;", "d", "Lyads/ih3;", "getVideoScaleType", "()Lyads/ih3;", "videoScaleType", "Ln781;", "e", "Ln781;", "getOnSizeChangedListener$mobileads_internalRelease", "()Ln781;", "setOnSizeChangedListener$mobileads_internalRelease", "(Ln781;)V", "onSizeChangedListener", "yads/r20", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class CustomizableMediaView extends FrameLayout {
    private static final int f = R$layout.monetization_ads_internal_outstream_controls_default;

    /* renamed from: a, reason: from kotlin metadata */
    private int videoControlsLayoutId;

    /* renamed from: b, reason: from kotlin metadata */
    private int widthMeasureSpec;

    /* renamed from: c, reason: from kotlin metadata */
    private int heightMeasureSpec;

    /* renamed from: d, reason: from kotlin metadata */
    private final ih3 videoScaleType;

    /* renamed from: e, reason: from kotlin metadata */
    private n781 onSizeChangedListener;

    public CustomizableMediaView(Context context, AttributeSet attributeSet, int i, lj71 lj71Var) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalMediaView);
            lj71Var.getClass();
            this.videoControlsLayoutId = obtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f);
            this.videoScaleType = (ih3) j73.G(obtainStyledAttributes.getInt(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_scale_type, -1), ih3.values());
            obtainStyledAttributes.recycle();
        } else {
            this.videoControlsLayoutId = f;
            this.videoScaleType = null;
        }
        addOnAttachStateChangeListener(new hj(new o6(3, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView customizableMediaView) {
        n781 n781Var = customizableMediaView.onSizeChangedListener;
        if (n781Var != null) {
            int width = customizableMediaView.getWidth();
            int height = customizableMediaView.getHeight();
            ym81 ym81Var = (ym81) ((ld81) n781Var).a.get();
            if (ym81Var != null) {
                vn61 vn61Var = ym81Var.f;
                if (width < vn61Var.a || height < vn61Var.b) {
                    ym81Var.i.setValue(ym81Var, ym81.k[2], ym81Var.e);
                }
            }
        }
    }

    public final int getHeightMeasureSpec() {
        return this.heightMeasureSpec;
    }

    /* renamed from: getOnSizeChangedListener$mobileads_internalRelease, reason: from getter */
    public final n781 getOnSizeChangedListener() {
        return this.onSizeChangedListener;
    }

    public final int getVideoControlsLayoutId() {
        return this.videoControlsLayoutId;
    }

    public final ih3 getVideoScaleType() {
        return this.videoScaleType;
    }

    public final int getWidthMeasureSpec() {
        return this.widthMeasureSpec;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.widthMeasureSpec = i;
        this.heightMeasureSpec = i2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ym81 ym81Var;
        super.onSizeChanged(i, i2, i3, i4);
        n781 n781Var = this.onSizeChangedListener;
        if (n781Var == null || (ym81Var = (ym81) ((ld81) n781Var).a.get()) == null) {
            return;
        }
        vn61 vn61Var = ym81Var.f;
        if (i < vn61Var.a || i2 < vn61Var.b) {
            ym81Var.i.setValue(ym81Var, ym81.k[2], ym81Var.e);
        }
    }

    public final void setOnSizeChangedListener$mobileads_internalRelease(n781 n781Var) {
        this.onSizeChangedListener = n781Var;
    }

    public final void a(int i) {
        this.videoControlsLayoutId = i;
    }

    public CustomizableMediaView(Context context) {
        this(context, null);
    }

    public CustomizableMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomizableMediaView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new lj71());
    }
}
