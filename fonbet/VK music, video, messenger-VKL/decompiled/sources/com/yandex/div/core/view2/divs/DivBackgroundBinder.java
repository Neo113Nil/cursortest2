package com.yandex.div.core.view2.divs;

import android.R;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PictureDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import com.yandex.div.R$drawable;
import com.yandex.div.R$id;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.NinePatchDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.e4;
import com.yandex.div2.f5;
import com.yandex.div2.g8;
import com.yandex.div2.m1;
import com.yandex.div2.q8;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.izs;
import xsna.j5g;
import xsna.mq;
import xsna.s3q0;
import xsna.vu5;
import xsna.xq;
import xsna.yq;
import xsna.zcl;

/* compiled from: DivBackgroundBinder.kt */
/* loaded from: classes7.dex */
public class DivBackgroundBinder {
    private final DivImageLoader imageLoader;

    /* compiled from: DivBackgroundBinder.kt */
    public static abstract class DivBackgroundState {

        /* compiled from: DivBackgroundBinder.kt */
        public static final class Image extends DivBackgroundState {
            private final double alpha;
            private final DivAlignmentHorizontal contentAlignmentHorizontal;
            private final DivAlignmentVertical contentAlignmentVertical;
            private final List<Filter> filters;
            private final Uri imageUrl;
            private final boolean isVectorCompatible;
            private final boolean preloadRequired;
            private final DivImageScale scale;

            /* compiled from: DivBackgroundBinder.kt */
            public static abstract class Filter {

                /* compiled from: DivBackgroundBinder.kt */
                public static final class Blur extends Filter {
                    private final e4.a div;
                    private final int radius;

                    public Blur(int i, e4.a aVar) {
                        super(null);
                        this.radius = i;
                        this.div = aVar;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Blur)) {
                            return false;
                        }
                        Blur blur = (Blur) obj;
                        return this.radius == blur.radius && epx.f(this.div, blur.div);
                    }

                    public final e4.a getDiv() {
                        return this.div;
                    }

                    public int hashCode() {
                        return this.div.hashCode() + (Integer.hashCode(this.radius) * 31);
                    }

                    public String toString() {
                        return "Blur(radius=" + this.radius + ", div=" + this.div + ')';
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                public static final class RtlMirror extends Filter {
                    private final e4.b div;

                    public RtlMirror(e4.b bVar) {
                        super(null);
                        this.div = bVar;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof RtlMirror) && epx.f(this.div, ((RtlMirror) obj).div);
                    }

                    public final e4.b getDiv() {
                        return this.div;
                    }

                    public int hashCode() {
                        return this.div.hashCode();
                    }

                    public String toString() {
                        return "RtlMirror(div=" + this.div + ')';
                    }
                }

                public /* synthetic */ Filter(zcl zclVar) {
                    this();
                }

                public final e4 toDiv() {
                    if (this instanceof Blur) {
                        return ((Blur) this).getDiv();
                    }
                    if (this instanceof RtlMirror) {
                        return ((RtlMirror) this).getDiv();
                    }
                    throw new NoWhenBranchMatchedException();
                }

                private Filter() {
                }
            }

            /* compiled from: DivBackgroundBinder.kt */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;
                public static final /* synthetic */ int[] $EnumSwitchMapping$2;

                static {
                    int[] iArr = new int[DivImageScale.values().length];
                    try {
                        iArr[DivImageScale.FILL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DivImageScale.FIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DivImageScale.STRETCH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                    try {
                        iArr2[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.START.ordinal()] = 4;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.END.ordinal()] = 5;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                    int[] iArr3 = new int[DivAlignmentVertical.values().length];
                    try {
                        iArr3[DivAlignmentVertical.CENTER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 2;
                    } catch (NoSuchFieldError unused10) {
                    }
                    $EnumSwitchMapping$2 = iArr3;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Image(double d, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical, Uri uri, boolean z, DivImageScale divImageScale, List<? extends Filter> list, boolean z2) {
                super(null);
                this.alpha = d;
                this.contentAlignmentHorizontal = divAlignmentHorizontal;
                this.contentAlignmentVertical = divAlignmentVertical;
                this.imageUrl = uri;
                this.preloadRequired = z;
                this.scale = divImageScale;
                this.filters = list;
                this.isVectorCompatible = z2;
            }

            private final ScalingDrawable.AlignmentHorizontal toHorizontalAlignment(DivAlignmentHorizontal divAlignmentHorizontal, boolean z) {
                int i = WhenMappings.$EnumSwitchMapping$1[divAlignmentHorizontal.ordinal()];
                if (i == 1) {
                    return ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i == 2) {
                    return ScalingDrawable.AlignmentHorizontal.CENTER;
                }
                if (i == 3) {
                    return ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                if (i == 4) {
                    return z ? ScalingDrawable.AlignmentHorizontal.RIGHT : ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i == 5) {
                    return z ? ScalingDrawable.AlignmentHorizontal.LEFT : ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                throw new NoWhenBranchMatchedException();
            }

            private final ScalingDrawable.ScaleType toScaleType(DivImageScale divImageScale) {
                int i = WhenMappings.$EnumSwitchMapping$0[divImageScale.ordinal()];
                return i != 1 ? i != 2 ? i != 3 ? ScalingDrawable.ScaleType.NO_SCALE : ScalingDrawable.ScaleType.STRETCH : ScalingDrawable.ScaleType.FIT : ScalingDrawable.ScaleType.FILL;
            }

            private final ScalingDrawable.AlignmentVertical toVerticalAlignment(DivAlignmentVertical divAlignmentVertical) {
                int i = WhenMappings.$EnumSwitchMapping$2[divAlignmentVertical.ordinal()];
                return i != 1 ? i != 2 ? ScalingDrawable.AlignmentVertical.TOP : ScalingDrawable.AlignmentVertical.BOTTOM : ScalingDrawable.AlignmentVertical.CENTER;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return Double.compare(this.alpha, image.alpha) == 0 && this.contentAlignmentHorizontal == image.contentAlignmentHorizontal && this.contentAlignmentVertical == image.contentAlignmentVertical && epx.f(this.imageUrl, image.imageUrl) && this.preloadRequired == image.preloadRequired && this.scale == image.scale && epx.f(this.filters, image.filters) && this.isVectorCompatible == image.isVectorCompatible;
            }

            public final Drawable getDivImageBackground(final BindingContext bindingContext, final View view, DivImageLoader divImageLoader) {
                final ScalingDrawable scalingDrawable = new ScalingDrawable();
                scalingDrawable.setAlpha((int) (this.alpha * 255));
                scalingDrawable.setCustomScaleType(toScaleType(this.scale));
                scalingDrawable.setAlignmentHorizontal(toHorizontalAlignment(this.contentAlignmentHorizontal, ViewsKt.isLayoutRtl(view)));
                scalingDrawable.setAlignmentVertical(toVerticalAlignment(this.contentAlignmentVertical));
                String uri = this.imageUrl.toString();
                final Div2View divView = bindingContext.getDivView();
                bindingContext.getDivView().addLoadReference(divImageLoader.loadImage(uri, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    public void onSuccess(CachedBitmap cachedBitmap) {
                        ArrayList arrayList;
                        View view2 = view;
                        BindingContext bindingContext2 = bindingContext;
                        Bitmap bitmap = cachedBitmap.getBitmap();
                        List<DivBackgroundBinder.DivBackgroundState.Image.Filter> filters = this.getFilters();
                        if (filters != null) {
                            List<DivBackgroundBinder.DivBackgroundState.Image.Filter> list = filters;
                            arrayList = new ArrayList(c5g.u(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((DivBackgroundBinder.DivBackgroundState.Image.Filter) it.next()).toDiv());
                            }
                        } else {
                            arrayList = null;
                        }
                        final ScalingDrawable scalingDrawable2 = scalingDrawable;
                        BaseDivViewExtensionsKt.applyBitmapFilters(view2, bindingContext2, bitmap, arrayList, new izs<Bitmap, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public /* bridge */ /* synthetic */ s3q0 invoke(Bitmap bitmap2) {
                                invoke2(bitmap2);
                                return s3q0.a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Bitmap bitmap2) {
                                ScalingDrawable.this.setBitmap(bitmap2);
                            }
                        });
                    }

                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    public void onSuccess(PictureDrawable pictureDrawable) {
                        if (!this.isVectorCompatible()) {
                            onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, this.getImageUrl(), null, 2, null));
                        } else {
                            scalingDrawable.setPicture(pictureDrawable.getPicture());
                        }
                    }
                }), view);
                return scalingDrawable;
            }

            public final List<Filter> getFilters() {
                return this.filters;
            }

            public final Uri getImageUrl() {
                return this.imageUrl;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = (this.imageUrl.hashCode() + ((this.contentAlignmentVertical.hashCode() + ((this.contentAlignmentHorizontal.hashCode() + (Double.hashCode(this.alpha) * 31)) * 31)) * 31)) * 31;
                boolean z = this.preloadRequired;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                int hashCode2 = (this.scale.hashCode() + ((hashCode + i) * 31)) * 31;
                List<Filter> list = this.filters;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                boolean z2 = this.isVectorCompatible;
                return hashCode3 + (z2 ? 1 : z2 ? 1 : 0);
            }

            public final boolean isVectorCompatible() {
                return this.isVectorCompatible;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Image(alpha=");
                sb.append(this.alpha);
                sb.append(", contentAlignmentHorizontal=");
                sb.append(this.contentAlignmentHorizontal);
                sb.append(", contentAlignmentVertical=");
                sb.append(this.contentAlignmentVertical);
                sb.append(", imageUrl=");
                sb.append(this.imageUrl);
                sb.append(", preloadRequired=");
                sb.append(this.preloadRequired);
                sb.append(", scale=");
                sb.append(this.scale);
                sb.append(", filters=");
                sb.append(this.filters);
                sb.append(", isVectorCompatible=");
                return q0.a(sb, this.isVectorCompatible, ')');
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        public static final class LinearGradient extends DivBackgroundState {
            private final int angle;
            private final Colormap colormap;

            public LinearGradient(int i, Colormap colormap) {
                super(null);
                this.angle = i;
                this.colormap = colormap;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LinearGradient)) {
                    return false;
                }
                LinearGradient linearGradient = (LinearGradient) obj;
                return this.angle == linearGradient.angle && epx.f(this.colormap, linearGradient.colormap);
            }

            public final int getAngle() {
                return this.angle;
            }

            public final Colormap getColormap() {
                return this.colormap;
            }

            public int hashCode() {
                return this.colormap.hashCode() + (Integer.hashCode(this.angle) * 31);
            }

            public String toString() {
                return "LinearGradient(angle=" + this.angle + ", colormap=" + this.colormap + ')';
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        public static final class NinePatch extends DivBackgroundState {
            private final Uri imageUrl;
            private final Rect insets;

            public NinePatch(Uri uri, Rect rect) {
                super(null);
                this.imageUrl = uri;
                this.insets = rect;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NinePatch)) {
                    return false;
                }
                NinePatch ninePatch = (NinePatch) obj;
                return epx.f(this.imageUrl, ninePatch.imageUrl) && epx.f(this.insets, ninePatch.insets);
            }

            public final Rect getInsets() {
                return this.insets;
            }

            public final Drawable getNinePatchDrawable(final Div2View div2View, View view, DivImageLoader divImageLoader) {
                final NinePatchDrawable ninePatchDrawable = new NinePatchDrawable();
                div2View.addLoadReference(divImageLoader.loadImage(this.imageUrl.toString(), new DivIdLoggingImageDownloadCallback(div2View) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$NinePatch$getNinePatchDrawable$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    public void onSuccess(CachedBitmap cachedBitmap) {
                        NinePatchDrawable ninePatchDrawable2 = ninePatchDrawable;
                        DivBackgroundBinder.DivBackgroundState.NinePatch ninePatch = this;
                        ninePatchDrawable2.setBottom(ninePatch.getInsets().bottom);
                        ninePatchDrawable2.setLeft(ninePatch.getInsets().left);
                        ninePatchDrawable2.setRight(ninePatch.getInsets().right);
                        ninePatchDrawable2.setTop(ninePatch.getInsets().top);
                        ninePatchDrawable2.setBitmap(cachedBitmap.getBitmap());
                    }
                }), view);
                return ninePatchDrawable;
            }

            public int hashCode() {
                return this.insets.hashCode() + (this.imageUrl.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("NinePatch(imageUrl=");
                sb.append(this.imageUrl);
                sb.append(", insets=");
                return yq.c(sb, this.insets, ')');
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        public static final class RadialGradient extends DivBackgroundState {
            private final Center centerX;
            private final Center centerY;
            private final List<Integer> colors;
            private final Radius radius;

            /* compiled from: DivBackgroundBinder.kt */
            public static abstract class Center {

                /* compiled from: DivBackgroundBinder.kt */
                public static final class Fixed extends Center {
                    private final float valuePx;

                    public Fixed(float f) {
                        super(null);
                        this.valuePx = f;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) obj).valuePx) == 0;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    public String toString() {
                        return xq.c(')', this.valuePx, new StringBuilder("Fixed(valuePx="));
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                public static final class Relative extends Center {
                    private final float value;

                    public Relative(float f) {
                        super(null);
                        this.value = f;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Relative) && Float.compare(this.value, ((Relative) obj).value) == 0;
                    }

                    public final float getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.value);
                    }

                    public String toString() {
                        return xq.c(')', this.value, new StringBuilder("Relative(value="));
                    }
                }

                public /* synthetic */ Center(zcl zclVar) {
                    this();
                }

                public final RadialGradientDrawable.Center toRadialGradientDrawableCenter() {
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Center.Fixed(((Fixed) this).getValuePx());
                    }
                    if (this instanceof Relative) {
                        return new RadialGradientDrawable.Center.Relative(((Relative) this).getValue());
                    }
                    throw new NoWhenBranchMatchedException();
                }

                private Center() {
                }
            }

            /* compiled from: DivBackgroundBinder.kt */
            public static abstract class Radius {

                /* compiled from: DivBackgroundBinder.kt */
                public static final class Fixed extends Radius {
                    private final float valuePx;

                    public Fixed(float f) {
                        super(null);
                        this.valuePx = f;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) obj).valuePx) == 0;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    public String toString() {
                        return xq.c(')', this.valuePx, new StringBuilder("Fixed(valuePx="));
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                public static final class Relative extends Radius {
                    private final DivRadialGradientRelativeRadius.Value value;

                    public Relative(DivRadialGradientRelativeRadius.Value value) {
                        super(null);
                        this.value = value;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Relative) && this.value == ((Relative) obj).value;
                    }

                    public final DivRadialGradientRelativeRadius.Value getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Relative(value=" + this.value + ')';
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DivRadialGradientRelativeRadius.Value.values().length];
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.NEAREST_CORNER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.NEAREST_SIDE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Radius(zcl zclVar) {
                    this();
                }

                public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius() {
                    RadialGradientDrawable.Radius.Relative.Type type;
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Radius.Fixed(((Fixed) this).getValuePx());
                    }
                    if (!(this instanceof Relative)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i = WhenMappings.$EnumSwitchMapping$0[((Relative) this).getValue().ordinal()];
                    if (i == 1) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
                    } else if (i == 2) {
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
                    } else if (i == 3) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
                    }
                    return new RadialGradientDrawable.Radius.Relative(type);
                }

                private Radius() {
                }
            }

            public RadialGradient(Center center, Center center2, List<Integer> list, Radius radius) {
                super(null);
                this.centerX = center;
                this.centerY = center2;
                this.colors = list;
                this.radius = radius;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RadialGradient)) {
                    return false;
                }
                RadialGradient radialGradient = (RadialGradient) obj;
                return epx.f(this.centerX, radialGradient.centerX) && epx.f(this.centerY, radialGradient.centerY) && epx.f(this.colors, radialGradient.colors) && epx.f(this.radius, radialGradient.radius);
            }

            public final Center getCenterX() {
                return this.centerX;
            }

            public final Center getCenterY() {
                return this.centerY;
            }

            public final List<Integer> getColors() {
                return this.colors;
            }

            public final Radius getRadius() {
                return this.radius;
            }

            public int hashCode() {
                return this.radius.hashCode() + fw3.a((this.centerY.hashCode() + (this.centerX.hashCode() * 31)) * 31, 31, this.colors);
            }

            public String toString() {
                return "RadialGradient(centerX=" + this.centerX + ", centerY=" + this.centerY + ", colors=" + this.colors + ", radius=" + this.radius + ')';
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        public static final class Solid extends DivBackgroundState {
            private final int color;

            public Solid(int i) {
                super(null);
                this.color = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Solid) && this.color == ((Solid) obj).color;
            }

            public final int getColor() {
                return this.color;
            }

            public int hashCode() {
                return Integer.hashCode(this.color);
            }

            public String toString() {
                return vu5.b(new StringBuilder("Solid(color="), this.color, ')');
            }
        }

        public /* synthetic */ DivBackgroundState(zcl zclVar) {
            this();
        }

        public final Drawable toDrawable(BindingContext bindingContext, View view, DivImageLoader divImageLoader) {
            if (this instanceof Image) {
                return ((Image) this).getDivImageBackground(bindingContext, view, divImageLoader);
            }
            if (this instanceof NinePatch) {
                return ((NinePatch) this).getNinePatchDrawable(bindingContext.getDivView(), view, divImageLoader);
            }
            if (this instanceof Solid) {
                return new ColorDrawable(((Solid) this).getColor());
            }
            if (this instanceof LinearGradient) {
                return new LinearGradientDrawable(r4.getAngle(), ((LinearGradient) this).getColormap());
            }
            if (!(this instanceof RadialGradient)) {
                throw new NoWhenBranchMatchedException();
            }
            RadialGradient radialGradient = (RadialGradient) this;
            return new RadialGradientDrawable(radialGradient.getRadius().toRadialGradientDrawableRadius(), radialGradient.getCenterX().toRadialGradientDrawableCenter(), radialGradient.getCenterY().toRadialGradientDrawableCenter(), j5g.N0(radialGradient.getColors()));
        }

        private DivBackgroundState() {
        }
    }

    public DivBackgroundBinder(DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    private void addBackgroundSubscriptions(List<? extends m1> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, izs<Object, s3q0> izsVar) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ExpressionSubscribersKt.observeBackground(expressionSubscriber, (m1) it.next(), expressionResolver, izsVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDefaultBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends m1> list) {
        List<? extends DivBackgroundState> list2;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            List<? extends m1> list3 = list;
            list2 = new ArrayList<>(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                list2.add(toBackgroundState((m1) it.next(), bindingContext.getDivView(), displayMetrics, expressionResolver));
            }
        } else {
            list2 = EmptyList.b;
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (epx.f(defaultBackgroundList, list2) && epx.f(additionalLayer, drawable)) {
            return;
        }
        updateBackground(view, toDrawable(list2, bindingContext, view, drawable));
        setDefaultBackgroundList(view, list2);
        setFocusedBackgroundList(view, null);
        setAdditionalLayer(view, drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyFocusedBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends m1> list, List<? extends m1> list2) {
        List<? extends DivBackgroundState> list3;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            List<? extends m1> list4 = list;
            list3 = new ArrayList<>(c5g.u(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                list3.add(toBackgroundState((m1) it.next(), divView, displayMetrics, expressionResolver));
            }
        } else {
            list3 = EmptyList.b;
        }
        List<? extends m1> list5 = list2;
        List<? extends DivBackgroundState> arrayList = new ArrayList<>(c5g.u(list5, 10));
        Iterator<T> it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList.add(toBackgroundState((m1) it2.next(), divView, displayMetrics, expressionResolver));
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        List<DivBackgroundState> focusedBackgroundList = getFocusedBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (epx.f(defaultBackgroundList, list3) && epx.f(focusedBackgroundList, arrayList) && epx.f(additionalLayer, drawable)) {
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, toDrawable(arrayList, bindingContext, view, drawable));
        if (list != null || drawable != null) {
            stateListDrawable.addState(StateSet.WILD_CARD, toDrawable(list3, bindingContext, view, drawable));
        }
        updateBackground(view, stateListDrawable);
        setDefaultBackgroundList(view, list3);
        setFocusedBackgroundList(view, arrayList);
        setAdditionalLayer(view, drawable);
    }

    private void bindDefaultBackground(final BindingContext bindingContext, final View view, final Drawable drawable, final List<? extends m1> list, List<? extends m1> list2, ExpressionSubscriber expressionSubscriber) {
        List<? extends m1> list3 = list == null ? EmptyList.b : list;
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        Drawable additionalLayer = getAdditionalLayer(view);
        if (list3.size() == list2.size()) {
            Iterator<T> it = list3.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    if (!DivDataExtensionsKt.equalsToConstant((m1) next, list2.get(i))) {
                        break;
                    } else {
                        i = i2;
                    }
                } else if (epx.f(drawable, additionalLayer)) {
                    return;
                }
            }
        }
        applyDefaultBackground(view, bindingContext, drawable, list);
        List<? extends m1> list4 = list3;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            return;
        }
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            if (!DivDataExtensionsKt.isConstant((m1) it2.next())) {
                addBackgroundSubscriptions(list, bindingContext.getExpressionResolver(), expressionSubscriber, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindDefaultBackground$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                        invoke2(obj);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object obj) {
                        DivBackgroundBinder.this.applyDefaultBackground(view, bindingContext, drawable, list);
                    }
                });
                return;
            }
        }
    }

    private void bindFocusBackground(final BindingContext bindingContext, final View view, final Drawable drawable, final List<? extends m1> list, List<? extends m1> list2, final List<? extends m1> list3, List<? extends m1> list4, ExpressionSubscriber expressionSubscriber) {
        List<? extends m1> list5 = list == null ? EmptyList.b : list;
        List<? extends m1> list6 = list2 == null ? EmptyList.b : list2;
        List<? extends m1> list7 = list4 == null ? EmptyList.b : list4;
        Drawable additionalLayer = getAdditionalLayer(view);
        if (list5.size() == list6.size()) {
            Iterator<T> it = list5.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (!DivDataExtensionsKt.equalsToConstant((m1) next, list6.get(i2))) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } else if (list3.size() == list7.size()) {
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i4 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            if (!DivDataExtensionsKt.equalsToConstant((m1) next2, list7.get(i))) {
                                break;
                            } else {
                                i = i4;
                            }
                        } else if (epx.f(drawable, additionalLayer)) {
                            return;
                        }
                    }
                }
            }
        }
        applyFocusedBackground(view, bindingContext, drawable, list, list3);
        List<? extends m1> list8 = list5;
        if (!(list8 instanceof Collection) || !list8.isEmpty()) {
            Iterator<T> it3 = list8.iterator();
            while (it3.hasNext()) {
                if (!DivDataExtensionsKt.isConstant((m1) it3.next())) {
                    break;
                }
            }
        }
        List<? extends m1> list9 = list3;
        if ((list9 instanceof Collection) && list9.isEmpty()) {
            return;
        }
        Iterator<T> it4 = list9.iterator();
        while (it4.hasNext()) {
            if (!DivDataExtensionsKt.isConstant((m1) it4.next())) {
                izs<Object, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindFocusBackground$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                        invoke2(obj);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object obj) {
                        DivBackgroundBinder.this.applyFocusedBackground(view, bindingContext, drawable, list, list3);
                    }
                };
                ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
                addBackgroundSubscriptions(list, expressionResolver, expressionSubscriber, izsVar);
                addBackgroundSubscriptions(list3, expressionResolver, expressionSubscriber, izsVar);
                return;
            }
        }
    }

    private Drawable getAdditionalLayer(View view) {
        Object tag = view.getTag(R$id.div_additional_background_layer_tag);
        if (tag instanceof Drawable) {
            return (Drawable) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getDefaultBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_default_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getFocusedBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_focused_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private boolean isVectorCompatible(f5 f5Var, ExpressionResolver expressionResolver) {
        if (f5Var.a.evaluate(expressionResolver).doubleValue() != 1.0d) {
            return false;
        }
        List<e4> list = f5Var.d;
        return list == null || list.isEmpty();
    }

    private void setAdditionalLayer(View view, Drawable drawable) {
        view.setTag(R$id.div_additional_background_layer_tag, drawable);
    }

    private void setDefaultBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_default_background_list_tag, list);
    }

    private void setFocusedBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_focused_background_list_tag, list);
    }

    private DivBackgroundState toBackgroundState(m1 m1Var, Div2View div2View, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        List<Integer> list;
        int i5;
        if (m1Var instanceof m1.b) {
            m1.b bVar = (m1.b) m1Var;
            long longValue = bVar.b.a.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i5 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i5 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.LinearGradient(i5, ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(bVar.b, expressionResolver), div2View));
        }
        if (m1Var instanceof m1.d) {
            m1.d dVar = (m1.d) m1Var;
            DivBackgroundState.RadialGradient.Center backgroundState = toBackgroundState(dVar.b.a, displayMetrics, expressionResolver);
            DivBackgroundState.RadialGradient.Center backgroundState2 = toBackgroundState(dVar.b.b, displayMetrics, expressionResolver);
            ExpressionList<Integer> expressionList = dVar.b.d;
            if (expressionList == null || (list = expressionList.evaluate(expressionResolver)) == null) {
                list = EmptyList.b;
            }
            return new DivBackgroundState.RadialGradient(backgroundState, backgroundState2, list, toBackgroundState(dVar.b.e, displayMetrics, expressionResolver));
        }
        if (m1Var instanceof m1.a) {
            m1.a aVar = (m1.a) m1Var;
            double doubleValue = aVar.b.a.evaluate(expressionResolver).doubleValue();
            DivAlignmentHorizontal evaluate = aVar.b.b.evaluate(expressionResolver);
            DivAlignmentVertical evaluate2 = aVar.b.c.evaluate(expressionResolver);
            Uri evaluate3 = aVar.b.e.evaluate(expressionResolver);
            boolean booleanValue = aVar.b.f.evaluate(expressionResolver).booleanValue();
            DivImageScale evaluate4 = aVar.b.g.evaluate(expressionResolver);
            List<e4> list2 = aVar.b.d;
            if (list2 != null) {
                List<e4> list3 = list2;
                arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(toBackgroundState((e4) it.next(), expressionResolver));
                }
            } else {
                arrayList = null;
            }
            return new DivBackgroundState.Image(doubleValue, evaluate, evaluate2, evaluate3, booleanValue, evaluate4, arrayList, isVectorCompatible(aVar.b, expressionResolver));
        }
        if (m1Var instanceof m1.e) {
            return new DivBackgroundState.Solid(((m1.e) m1Var).b.a.evaluate(expressionResolver).intValue());
        }
        if (!(m1Var instanceof m1.c)) {
            throw new NoWhenBranchMatchedException();
        }
        m1.c cVar = (m1.c) m1Var;
        Uri evaluate5 = cVar.b.a.evaluate(expressionResolver);
        long longValue2 = cVar.b.b.b.evaluate(expressionResolver).longValue();
        long j2 = longValue2 >> 31;
        if (j2 == 0 || j2 == -1) {
            i = (int) longValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue2, "Unable convert '", "' to Int");
            }
            i = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue3 = cVar.b.b.d.evaluate(expressionResolver).longValue();
        long j3 = longValue3 >> 31;
        if (j3 == 0 || j3 == -1) {
            i2 = (int) longValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue3, "Unable convert '", "' to Int");
            }
            i2 = longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue4 = cVar.b.b.c.evaluate(expressionResolver).longValue();
        long j4 = longValue4 >> 31;
        if (j4 == 0 || j4 == -1) {
            i3 = (int) longValue4;
        } else {
            KAssert kAssert4 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue4, "Unable convert '", "' to Int");
            }
            i3 = longValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue5 = cVar.b.b.a.evaluate(expressionResolver).longValue();
        long j5 = longValue5 >> 31;
        if (j5 == 0 || j5 == -1) {
            i4 = (int) longValue5;
        } else {
            KAssert kAssert5 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue5, "Unable convert '", "' to Int");
            }
            i4 = longValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return new DivBackgroundState.NinePatch(evaluate5, new Rect(i, i2, i3, i4));
    }

    private Drawable toDrawable(List<? extends DivBackgroundState> list, BindingContext bindingContext, View view, Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        if (list == null) {
            if (drawable != null) {
                return new LayerDrawable(new Drawable[]{drawable});
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Drawable mutate = ((DivBackgroundState) it.next()).toDrawable(bindingContext, view, this.imageLoader).mutate();
            if (mutate != null) {
                arrayList.add(mutate);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (drawable != null) {
            arrayList2.add(drawable);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new LayerDrawable((Drawable[]) arrayList2.toArray(new Drawable[0]));
    }

    private void updateBackground(View view, Drawable drawable) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(R$drawable.native_animation_background) : null) != null) {
            Drawable drawable2 = view.getContext().getDrawable(R$drawable.native_animation_background);
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            z = true;
        } else {
            z = false;
        }
        view.setBackground(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        if (z) {
            ((LayerDrawable) view.getBackground()).setId(((LayerDrawable) view.getBackground()).getNumberOfLayers() - 1, R$drawable.native_animation_background);
        }
    }

    public void bindBackground(BindingContext bindingContext, View view, List<? extends m1> list, List<? extends m1> list2, List<? extends m1> list3, List<? extends m1> list4, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        if (list3 == null) {
            bindDefaultBackground(bindingContext, view, drawable, list, list2, expressionSubscriber);
        } else {
            bindFocusBackground(bindingContext, view, drawable, list, list2, list3, list4, expressionSubscriber);
        }
    }

    private DivBackgroundState.RadialGradient.Center toBackgroundState(g8 g8Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (g8Var instanceof g8.a) {
            g8.a aVar = (g8.a) g8Var;
            return new DivBackgroundState.RadialGradient.Center.Fixed(BaseDivViewExtensionsKt.toPxF(aVar.b.b.evaluate(expressionResolver).longValue(), aVar.b.a.evaluate(expressionResolver), displayMetrics));
        }
        if (g8Var instanceof g8.b) {
            return new DivBackgroundState.RadialGradient.Center.Relative((float) ((g8.b) g8Var).b.a.evaluate(expressionResolver).doubleValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    private DivBackgroundState.RadialGradient.Radius toBackgroundState(q8 q8Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (q8Var instanceof q8.a) {
            return new DivBackgroundState.RadialGradient.Radius.Fixed(BaseDivViewExtensionsKt.toPxF(((q8.a) q8Var).b, displayMetrics, expressionResolver));
        }
        if (q8Var instanceof q8.b) {
            return new DivBackgroundState.RadialGradient.Radius.Relative(((q8.b) q8Var).b.a.evaluate(expressionResolver));
        }
        throw new NoWhenBranchMatchedException();
    }

    private DivBackgroundState.Image.Filter toBackgroundState(e4 e4Var, ExpressionResolver expressionResolver) {
        int i;
        if (e4Var instanceof e4.a) {
            e4.a aVar = (e4.a) e4Var;
            long longValue = aVar.b.a.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.Image.Filter.Blur(i, aVar);
        }
        if (e4Var instanceof e4.b) {
            return new DivBackgroundState.Image.Filter.RtlMirror((e4.b) e4Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
