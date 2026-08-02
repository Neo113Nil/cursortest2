package com.yandex.go.mainscreen.superapp.impl.header.presentation.header;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.a;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.delegates.HeaderTranslationDelegate$State;
import defpackage.m9u;
import defpackage.nwy0;
import defpackage.ons0;
import defpackage.qje;
import defpackage.rbw0;
import defpackage.rcu;
import defpackage.sbw0;
import defpackage.tbw0;
import defpackage.w511;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\t1B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00128CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeaderContainer;", "Landroid/widget/LinearLayout;", "Lm9u;", "Lrcu;", "Lnwy0;", "Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeader;", "header", "Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/a;", "topPlaquePresenter", "Ltbw0;", "style", "<init>", "(Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeader;Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/a;Ltbw0;)V", "Lzy11;", "updateBackgroundColor", "()V", "", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "elevation", "onElevationChanged", "(F)V", "Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/delegates/HeaderTranslationDelegate$State;", ClidProvider.STATE, "onStateChanged", "(Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/delegates/HeaderTranslationDelegate$State;)V", "Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeader;", "Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeaderTopPlaqueView;", "topPlaque", "Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeaderTopPlaqueView;", "getTopPlaque", "()Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeaderTopPlaqueView;", "Landroid/graphics/drawable/ColorDrawable;", "topPlaqueBackgroundColorDrawable", "Landroid/graphics/drawable/ColorDrawable;", "getTopPlaqueVisibleHeight", "()I", "topPlaqueVisibleHeight", "TransparentHeaderBackgroundDrawable", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperappMainFloatingHeaderContainer extends LinearLayout implements m9u, rcu, nwy0 {
    private final SuperappMainFloatingHeader header;
    private final SuperappMainFloatingHeaderTopPlaqueView topPlaque;
    private final ColorDrawable topPlaqueBackgroundColorDrawable;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeaderContainer$TransparentHeaderBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "", "radius", "<init>", "(Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeaderContainer;F)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "draw", "(Landroid/graphics/Canvas;)V", "", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "F", "getRadius", "()F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "headerPath", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class TransparentHeaderBackgroundDrawable extends Drawable {
        private final float radius;
        private final Paint paint = new Paint(1);
        private final Path path = new Path();
        private final Path headerPath = new Path();
        private final RectF rect = new RectF();

        public TransparentHeaderBackgroundDrawable(float f) {
            this.radius = f;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (SuperappMainFloatingHeaderContainer.this.getTopPlaqueVisibleHeight() <= 0) {
                return;
            }
            float bottom = SuperappMainFloatingHeaderContainer.this.getTopPlaque().getBottom();
            this.rect.set(getBounds().left, getBounds().top, getBounds().right, this.radius + bottom);
            this.path.rewind();
            Path path = this.path;
            RectF rectF = this.rect;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(rectF, direction);
            this.rect.set(getBounds().left, bottom, getBounds().right, (2.0f * this.radius) + bottom);
            this.headerPath.rewind();
            Path path2 = this.headerPath;
            RectF rectF2 = this.rect;
            float f = this.radius;
            path2.addRoundRect(rectF2, f, f, direction);
            this.path.op(this.headerPath, Path.Op.DIFFERENCE);
            this.paint.setColor(SuperappMainFloatingHeaderContainer.this.topPlaqueBackgroundColorDrawable.getColor());
            canvas.drawPath(this.path, this.paint);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public final float getRadius() {
            return this.radius;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int alpha) {
            this.paint.setAlpha(alpha);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }

    public SuperappMainFloatingHeaderContainer(SuperappMainFloatingHeader superappMainFloatingHeader, a aVar, tbw0 tbw0Var) {
        super(superappMainFloatingHeader.getContext());
        Drawable transparentHeaderBackgroundDrawable;
        this.header = superappMainFloatingHeader;
        SuperappMainFloatingHeaderTopPlaqueView superappMainFloatingHeaderTopPlaqueView = new SuperappMainFloatingHeaderTopPlaqueView(getContext(), aVar);
        this.topPlaque = superappMainFloatingHeaderTopPlaqueView;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.topPlaqueBackgroundColorDrawable = colorDrawable;
        if (tbw0Var instanceof rbw0) {
            transparentHeaderBackgroundDrawable = new LayerDrawable(new ColorDrawable[]{colorDrawable});
            superappMainFloatingHeader.addOnLayoutChangeListener(new ons0(5, transparentHeaderBackgroundDrawable));
        } else {
            if (!(tbw0Var instanceof sbw0)) {
                w511.b();
                throw null;
            }
            transparentHeaderBackgroundDrawable = new TransparentHeaderBackgroundDrawable(((sbw0) tbw0Var).a());
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        setBackground(transparentHeaderBackgroundDrawable);
        addView(superappMainFloatingHeaderTopPlaqueView);
        addView(superappMainFloatingHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTopPlaqueVisibleHeight() {
        if (this.topPlaque.getVisibility() == 0) {
            return this.topPlaque.getHeight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(LayerDrawable layerDrawable, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        layerDrawable.setLayerInsetBottom(0, view.getHeight() / 2);
        layerDrawable.invalidateSelf();
    }

    private final void updateBackgroundColor() {
        this.topPlaqueBackgroundColorDrawable.setColor(getTopPlaqueVisibleHeight() > 0 ? qje.t(xng0.everBack, getContext()) : qje.t(xng0.bgMain, getContext()));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateBackgroundColor();
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final SuperappMainFloatingHeaderTopPlaqueView getTopPlaque() {
        return this.topPlaque;
    }

    @Override // defpackage.m9u
    public void onElevationChanged(float elevation) {
        setElevation(elevation);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        updateBackgroundColor();
    }

    @Override // defpackage.rcu
    public void onStateChanged(HeaderTranslationDelegate$State state) {
        this.header.onStateChanged(state);
    }
}
