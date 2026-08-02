package com.ybsdk.widgets.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.e36;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.lz40;
import defpackage.oyr;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse0;
import defpackage.uyj;
import defpackage.zp31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 <2\u00020\u0001:\u0004=>?@B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0014¢\u0006\u0004\b#\u0010$J/\u0010)\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010/H\u0014¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010;¨\u0006A"}, d2 = {"Lcom/ybsdk/widgets/common/BlendingGradientView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lcom/ybsdk/widgets/common/BlendingGradientView$GradientState;", "gradient", "Lzy11;", "updateGradientShader", "(ILcom/ybsdk/widgets/common/BlendingGradientView$GradientState;)V", "baseColor", "", "makeGradientColors", "(I)[I", "averageColor", "makeAccentColor", "(I)I", "Landroid/graphics/Bitmap;", "bitmap", "calculateAverageColor", "(Landroid/graphics/Bitmap;)Ljava/lang/Integer;", "Lcom/ybsdk/widgets/common/BlendingGradientView$State;", ClidProvider.STATE, "changeColorWithVisibility", "(Lcom/ybsdk/widgets/common/BlendingGradientView$State;)V", "Landroid/graphics/drawable/Drawable;", "logo", "render", "(Landroid/graphics/drawable/Drawable;)V", "onAttachedToWindow", "()V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "savedState", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Llz40;", "colorFlow", "Llz40;", "Lcom/ybsdk/widgets/common/BlendingGradientView$State;", "Companion", "State", "GradientState", "SavedState", "e36", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BlendingGradientView extends View {

    @Deprecated
    public static final int ALPHA_CHANNEL_OFFSET = 24;

    @Deprecated
    public static final int ALPHA_THRESHOLD = 25;

    @Deprecated
    public static final int BASE_ALPHA = 153;

    @Deprecated
    public static final long COLOR_ANIMATION_DURATION_MS = 500;
    private static final e36 Companion = new e36();

    @Deprecated
    public static final int GREEN_CHANNEL_OFFSET = 8;

    @Deprecated
    public static final int HSL_CHANNELS = 3;

    @Deprecated
    public static final float LIGHTNESS_BOOSTER = 0.4f;

    @Deprecated
    public static final int NO_ALPHA_MASK = 16777215;

    @Deprecated
    public static final int RED_CHANNEL_OFFSET = 16;

    @Deprecated
    public static final float SATURATION_BOOSTER = 0.2f;

    @Deprecated
    public static final float SCALE_Y = 0.26f;
    private final lz40 colorFlow;
    private final Paint paint;
    private State state;

    public BlendingGradientView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.paint = paint;
        this.colorFlow = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.state = new State(null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer calculateAverageColor(Bitmap bitmap) {
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr = new int[height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < height; i++) {
            if (((iArr[i] >> 24) & 255) >= 25) {
                j++;
                j2 += (r11 >> 16) & 255;
                j3 += (r11 >> 8) & 255;
                j4 += r11 & 255;
            }
        }
        if (j == 0) {
            return null;
        }
        return Integer.valueOf(((int) (((j2 / j) << 16) | ((j3 / j) << 8) | (j4 / j))) & 16777215);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeColorWithVisibility(State state) {
        if (state.getColor() != null && state.getGradient() != null) {
            updateGradientShader(state.getColor().intValue(), state.getGradient());
            invalidate();
        }
        com.ybsdk.core.utils.ext.view.b.c(this, state.getColor() != null, 500L, 4, 0L, null, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int makeAccentColor(int averageColor) {
        float[] fArr = new float[3];
        Color.colorToHSV(averageColor, fArr);
        fArr[1] = Math.min(fArr[1] + 0.2f, 1.0f);
        fArr[2] = Math.min(fArr[2] + 0.4f, 1.0f);
        return Color.HSVToColor(fArr) & 16777215;
    }

    private final int[] makeGradientColors(int baseColor) {
        Companion.getClass();
        List g = scc.g(Float.valueOf(1.0f), Float.valueOf(0.6f), Float.valueOf(0.4f), Float.valueOf(0.2f), Float.valueOf(0.0f));
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((((int) (((Number) it.next()).floatValue() * 153.0f)) << 24) | baseColor));
        }
        return kotlin.collections.a.I0(arrayList);
    }

    private final void updateGradientShader(int color, GradientState gradient) {
        Paint paint = this.paint;
        float f = gradient.getCenter().x;
        float f2 = gradient.getCenter().y;
        float radius = gradient.getRadius();
        int[] makeGradientColors = makeGradientColors(color);
        Companion.getClass();
        paint.setShader(new RadialGradient(f, f2, radius, makeGradientColors, new float[]{0.0f, 0.4f, 0.6f, 0.8f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.ybsdk.core.utils.ext.c.a(this.colorFlow, zp31.a(this), new a(this));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        GradientState gradient;
        Rect rect;
        Integer color = this.state.getColor();
        if (color == null || color.intValue() == 0 || (gradient = this.state.getGradient()) == null || (rect = gradient.getRect()) == null) {
            return;
        }
        canvas.drawRect(rect, this.paint);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable savedState) {
        SavedState savedState2 = savedState instanceof SavedState ? (SavedState) savedState : null;
        if (savedState2 == null) {
            return;
        }
        State state = savedState2.getState();
        changeColorWithVisibility(state);
        this.state = state;
        super.onRestoreInstanceState(savedState2.getParentState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(this.state, super.onSaveInstanceState());
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int i = w / 2;
        Point point = new Point(i, 0);
        int i2 = (int) ((w * 0.26f) + i);
        State copy$default = (w == 0 || h == 0 || i2 == 0) ? State.copy$default(this.state, null, null, 1, null) : State.copy$default(this.state, null, new GradientState(point, i2, new Rect(0, 0, w, h)), 1, null);
        changeColorWithVisibility(copy$default);
        this.state = copy$default;
    }

    public final void render(Drawable logo) {
        tje.N(zp31.a(this), uyj.a, null, new BlendingGradientView$render$1(logo, this, null), 2);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006("}, d2 = {"Lcom/ybsdk/widgets/common/BlendingGradientView$GradientState;", "Landroid/os/Parcelable;", "Landroid/graphics/Point;", "center", "", "radius", "Landroid/graphics/Rect;", "rect", "<init>", "(Landroid/graphics/Point;ILandroid/graphics/Rect;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/graphics/Point;", "component2", "component3", "()Landroid/graphics/Rect;", "copy", "(Landroid/graphics/Point;ILandroid/graphics/Rect;)Lcom/ybsdk/widgets/common/BlendingGradientView$GradientState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Point;", "getCenter", CA20Status.STATUS_USER_I, "getRadius", "Landroid/graphics/Rect;", "getRect", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GradientState implements Parcelable {
        public static final Parcelable.Creator<GradientState> CREATOR = new Creator();
        private final Point center;
        private final int radius;
        private final Rect rect;

        public GradientState(Point point, int i, Rect rect) {
            this.center = point;
            this.radius = i;
            this.rect = rect;
        }

        public static /* synthetic */ GradientState copy$default(GradientState gradientState, Point point, int i, Rect rect, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                point = gradientState.center;
            }
            if ((i2 & 2) != 0) {
                i = gradientState.radius;
            }
            if ((i2 & 4) != 0) {
                rect = gradientState.rect;
            }
            return gradientState.copy(point, i, rect);
        }

        /* renamed from: component1, reason: from getter */
        public final Point getCenter() {
            return this.center;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        /* renamed from: component3, reason: from getter */
        public final Rect getRect() {
            return this.rect;
        }

        public final GradientState copy(Point center, int radius, Rect rect) {
            return new GradientState(center, radius, rect);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GradientState)) {
                return false;
            }
            GradientState gradientState = (GradientState) other;
            return jl40.l(this.center, gradientState.center) && this.radius == gradientState.radius && jl40.l(this.rect, gradientState.rect);
        }

        public final Point getCenter() {
            return this.center;
        }

        public final int getRadius() {
            return this.radius;
        }

        public final Rect getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode() + oyr.b(this.radius, this.center.hashCode() * 31, 31);
        }

        public String toString() {
            return "GradientState(center=" + this.center + ", radius=" + this.radius + ", rect=" + this.rect + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.center, flags);
            dest.writeInt(this.radius);
            dest.writeParcelable(this.rect, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GradientState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GradientState createFromParcel(Parcel parcel) {
                return new GradientState((Point) parcel.readParcelable(GradientState.class.getClassLoader()), parcel.readInt(), (Rect) parcel.readParcelable(GradientState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GradientState[] newArray(int i) {
                return new GradientState[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lcom/ybsdk/widgets/common/BlendingGradientView$SavedState;", "Landroid/os/Parcelable;", "Lcom/ybsdk/widgets/common/BlendingGradientView$State;", ClidProvider.STATE, "parentState", "<init>", "(Lcom/ybsdk/widgets/common/BlendingGradientView$State;Landroid/os/Parcelable;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/widgets/common/BlendingGradientView$State;", "component2", "()Landroid/os/Parcelable;", "copy", "(Lcom/ybsdk/widgets/common/BlendingGradientView$State;Landroid/os/Parcelable;)Lcom/ybsdk/widgets/common/BlendingGradientView$SavedState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/widgets/common/BlendingGradientView$State;", "getState", "Landroid/os/Parcelable;", "getParentState", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final Parcelable parentState;
        private final State state;

        public SavedState(State state, Parcelable parcelable) {
            this.state = state;
            this.parentState = parcelable;
        }

        public static /* synthetic */ SavedState copy$default(SavedState savedState, State state, Parcelable parcelable, int i, Object obj) {
            if ((i & 1) != 0) {
                state = savedState.state;
            }
            if ((i & 2) != 0) {
                parcelable = savedState.parentState;
            }
            return savedState.copy(state, parcelable);
        }

        /* renamed from: component1, reason: from getter */
        public final State getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final Parcelable getParentState() {
            return this.parentState;
        }

        public final SavedState copy(State state, Parcelable parentState) {
            return new SavedState(state, parentState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return jl40.l(this.state, savedState.state) && jl40.l(this.parentState, savedState.parentState);
        }

        public final Parcelable getParentState() {
            return this.parentState;
        }

        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            int hashCode = this.state.hashCode() * 31;
            Parcelable parcelable = this.parentState;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            return "SavedState(state=" + this.state + ", parentState=" + this.parentState + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.state.writeToParcel(dest, flags);
            dest.writeParcelable(this.parentState, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(State.CREATOR.createFromParcel(parcel), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lcom/ybsdk/widgets/common/BlendingGradientView$State;", "Landroid/os/Parcelable;", "", "color", "Lcom/ybsdk/widgets/common/BlendingGradientView$GradientState;", "gradient", "<init>", "(Ljava/lang/Integer;Lcom/ybsdk/widgets/common/BlendingGradientView$GradientState;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/ybsdk/widgets/common/BlendingGradientView$GradientState;", "copy", "(Ljava/lang/Integer;Lcom/ybsdk/widgets/common/BlendingGradientView$GradientState;)Lcom/ybsdk/widgets/common/BlendingGradientView$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getColor", "Lcom/ybsdk/widgets/common/BlendingGradientView$GradientState;", "getGradient", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        private final Integer color;
        private final GradientState gradient;

        public State(Integer num, GradientState gradientState) {
            this.color = num;
            this.gradient = gradientState;
        }

        public static /* synthetic */ State copy$default(State state, Integer num, GradientState gradientState, int i, Object obj) {
            if ((i & 1) != 0) {
                num = state.color;
            }
            if ((i & 2) != 0) {
                gradientState = state.gradient;
            }
            return state.copy(num, gradientState);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final GradientState getGradient() {
            return this.gradient;
        }

        public final State copy(Integer color, GradientState gradient) {
            return new State(color, gradient);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return jl40.l(this.color, state.color) && jl40.l(this.gradient, state.gradient);
        }

        public final Integer getColor() {
            return this.color;
        }

        public final GradientState getGradient() {
            return this.gradient;
        }

        public int hashCode() {
            Integer num = this.color;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            GradientState gradientState = this.gradient;
            return hashCode + (gradientState != null ? gradientState.hashCode() : 0);
        }

        public String toString() {
            return "State(color=" + this.color + ", gradient=" + this.gradient + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Integer num = this.color;
            if (num == null) {
                dest.writeInt(0);
            } else {
                tse0.v(dest, 1, num);
            }
            GradientState gradientState = this.gradient;
            if (gradientState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                gradientState.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? GradientState.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }
    }

    public BlendingGradientView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BlendingGradientView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BlendingGradientView(Context context) {
        this(context, null, 0, 6, null);
    }
}
