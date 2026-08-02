package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.lightside.artists.ArtistDrawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.passport.R;
import defpackage.eo1;
import defpackage.ny61;
import defpackage.scc;
import defpackage.sq90;
import defpackage.tcc;
import defpackage.tq90;
import defpackage.uc20;
import defpackage.y73;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/roundabout/items/PlusDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "", "width", "height", "<init>", "(Landroid/content/Context;II)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CA20Status.STATUS_USER_I, "getWidth", "getHeight", "Lcom/lightside/artists/ArtistDrawable;", "Lsq90;", "logoDrawable", "Lcom/lightside/artists/ArtistDrawable;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlusDrawable extends Drawable {
    public static final int $stable = 8;
    private final Context context;
    private final int height;
    private final ArtistDrawable<sq90> logoDrawable;
    private final Paint paint;
    private final int width;

    public PlusDrawable(Context context, int i, int i2) {
        this.context = context;
        this.width = i;
        this.height = i2;
        eo1 eo1Var = new eo1(11, new com.yandex.passport.internal.core.announcing.f(17));
        y73 y73Var = new y73(context);
        eo1Var.invoke(y73Var);
        sq90 sq90Var = y73Var.b;
        if (sq90Var == null) {
            ny61.r("No artist provided");
            throw null;
        }
        ArtistDrawable<sq90> artistDrawable = new ArtistDrawable<>(sq90Var);
        artistDrawable.setIntrinsicSize(-1, -1);
        this.logoDrawable = artistDrawable;
        Paint paint = new Paint(1);
        float f = i;
        PointF pointF = new PointF(f, 0.0f);
        float f2 = f * 1.0172f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        List g = scc.g(new Pair(Float.valueOf(0.0f), new com.yandex.passport.common.ui.a(context.getColor(R.color.passport_roundabout_plus_gradient1))), new Pair(Float.valueOf(0.58f), new com.yandex.passport.common.ui.a(context.getColor(R.color.passport_roundabout_plus_gradient2))), new Pair(Float.valueOf(1.0f), new com.yandex.passport.common.ui.a(context.getColor(R.color.passport_roundabout_plus_gradient3))));
        float f3 = pointF.x;
        float f4 = pointF.y;
        List list = g;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((com.yandex.passport.common.ui.a) ((Pair) it.next()).f()).a));
        }
        int[] I0 = kotlin.collections.a.I0(arrayList);
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((Number) ((Pair) it2.next()).c()).floatValue()));
        }
        paint.setShader(new RadialGradient(f3, f4, f2, I0, kotlin.collections.a.G0(arrayList2), tileMode));
        this.paint = paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 logoDrawable$lambda$0(tq90 tq90Var) {
        if (tq90Var.d == null) {
            tq90Var.d = new RectF();
        }
        RectF rectF = tq90Var.d;
        if (rectF != null) {
            rectF.left = 0.0f;
            rectF.right = 10.0f;
        }
        if (rectF == null) {
            tq90Var.d = new RectF();
        }
        RectF rectF2 = tq90Var.d;
        if (rectF2 != null) {
            rectF2.top = 0.0f;
            rectF2.bottom = 11.0f;
        }
        tq90Var.c = tq90Var.b.getResources().getString(R.string.passport_path_plus_logo);
        tq90Var.a = Integer.valueOf(R.color.passport_roundabout_plus_logo);
        return zy11.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f = this.width;
        float f2 = this.height;
        DisplayMetrics displayMetrics = uc20.a;
        float f3 = displayMetrics.density;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, 100.0f * f3, 100.0f * f3, this.paint);
        ArtistDrawable<sq90> artistDrawable = this.logoDrawable;
        float f4 = displayMetrics.density;
        int i = this.height;
        artistDrawable.setBounds((int) (6.0f * f4), (int) (6.0f * f4), i - ((int) (6.0f * f4)), i - ((int) (6.0f * f4)));
        this.logoDrawable.draw(canvas);
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 597;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
