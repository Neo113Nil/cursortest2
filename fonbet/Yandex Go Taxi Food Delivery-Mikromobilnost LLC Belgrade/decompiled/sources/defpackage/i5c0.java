package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.yandex.go.places.map.ui.configs.PlacesPinLabelBitmapCreator$TextAlignment;
import com.yandex.runtime.image.ImageProvider;
import kotlin.Pair;
import kotlin.a;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public abstract class i5c0 {
    public final Context a;
    public final pav b;
    public final pwy0 c;
    public final ofc0 d;
    public final tcc0 e;
    public final zfc0 f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final int m;
    public final i3y n;
    public final i3y o;
    public final i3y p;

    public i5c0(Context context, pav pavVar, pwy0 pwy0Var, ofc0 ofc0Var, tcc0 tcc0Var, zfc0 zfc0Var) {
        this.a = context;
        this.b = pavVar;
        this.c = pwy0Var;
        this.d = ofc0Var;
        this.e = tcc0Var;
        this.f = zfc0Var;
        float f = context.getResources().getDisplayMetrics().density;
        this.g = (int) (6.0f * f);
        this.h = context.getResources().getDimensionPixelSize(eug0.discovery_map_pin_image_icon_size);
        float f2 = 2.0f * f;
        this.i = f2;
        this.j = 8.0f * f;
        this.k = f2;
        this.l = 12.0f * f;
        this.m = context.getResources().getDimensionPixelSize(eug0.discovery_organizations_map_pin_max_width);
        final int i = 0;
        this.n = a.a(new sls(this) { // from class: d5c0
            public final /* synthetic */ i5c0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                i5c0 i5c0Var = this.b;
                switch (i2) {
                    case 0:
                        return new ddc0(i5c0Var.a);
                    default:
                        return i5c0Var.a.getDrawable(f3h0.places_selected_pin_fallback_icon);
                }
            }
        });
        final int i2 = 1;
        this.o = a.a(new sls(this) { // from class: d5c0
            public final /* synthetic */ i5c0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                i5c0 i5c0Var = this.b;
                switch (i22) {
                    case 0:
                        return new ddc0(i5c0Var.a);
                    default:
                        return i5c0Var.a.getDrawable(f3h0.places_selected_pin_fallback_icon);
                }
            }
        });
        this.p = a.a(new fvb0(14));
    }

    public static PointF f(d3c0 d3c0Var) {
        h5c0 w = w(d3c0Var);
        if (w.equals(f5c0.b)) {
            return new PointF(1.0f, 0.5f);
        }
        if (w.equals(g5c0.b)) {
            return new PointF(0.0f, 0.5f);
        }
        if (w.equals(e5c0.b)) {
            return new PointF(0.5f, 0.0f);
        }
        w511.b();
        return null;
    }

    public static h5c0 w(d3c0 d3c0Var) {
        String str = d3c0Var.a.a;
        if (jl40.l(str, "left")) {
            return f5c0.b;
        }
        if (jl40.l(str, "right")) {
            return g5c0.b;
        }
        if (jl40.l(str, "bottom")) {
            return e5c0.b;
        }
        throw new UnknownError();
    }

    public PointF a(kn00 kn00Var) {
        hn00 hn00Var;
        zfc0 zfc0Var;
        wcc0 h;
        if ((kn00Var instanceof hn00) && (h = (zfc0Var = this.f).h((hn00Var = (hn00) kn00Var))) != null) {
            i2c0 g = zfc0Var.g(hn00Var);
            int i = g.b;
            int i2 = g.a;
            tcc0 tcc0Var = zfc0Var.b;
            int i3 = h.a;
            int i4 = h.b;
            int intValue = ((Number) zfc0Var.r.getValue()).intValue();
            tcc0Var.getClass();
            scc0 d = tcc0.d(i2, i, i3, i4, intValue);
            int i5 = d.b;
            int i6 = d.a;
            return (i6 <= 0 || i5 <= 0) ? j5c0.a : new PointF(((i2 / 2.0f) + d.c) / i6, i / (i5 * 2.0f));
        }
        return j5c0.a;
    }

    public /* bridge */ PointF b(Object obj) {
        return a((kn00) obj);
    }

    public final i2c0 c(gn00 gn00Var) {
        fo00 fo00Var = gn00Var.g;
        vn00 vn00Var = fo00Var instanceof vn00 ? (vn00) fo00Var : null;
        if (vn00Var == null) {
            return new i2c0(0, 0);
        }
        CharSequence charSequence = vn00Var.b;
        CharSequence charSequence2 = vn00Var.a;
        if (String.valueOf(charSequence2).length() > String.valueOf(charSequence).length()) {
            charSequence = charSequence2;
        }
        RobotoTextView robotoTextView = new RobotoTextView(this.a, null, 0, 6, null);
        robotoTextView.setText(charSequence);
        int i = this.m;
        robotoTextView.setMaxWidth(i);
        robotoTextView.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new i2c0(robotoTextView.getMeasuredWidth(), robotoTextView.getMeasuredHeight() * 2);
    }

    public final ImageProvider d(gn00 gn00Var, d3c0 d3c0Var) {
        Pair pair;
        h5c0 w = w(d3c0Var);
        boolean equals = w.equals(f5c0.b);
        int i = this.h;
        int i2 = this.g;
        Bitmap bitmap = null;
        if (equals) {
            pair = new Pair(PlacesPinLabelBitmapCreator$TextAlignment.RIGHT, new xcc0(i2, i2, (i / 2) + i2, i2));
        } else {
            if (!w.equals(g5c0.b)) {
                return n(null);
            }
            pair = new Pair(PlacesPinLabelBitmapCreator$TextAlignment.LEFT, new xcc0((i / 2) + i2, i2, i2, i2));
        }
        PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment = (PlacesPinLabelBitmapCreator$TextAlignment) pair.getFirst();
        xcc0 xcc0Var = (xcc0) pair.getSecond();
        fo00 fo00Var = gn00Var.g;
        vn00 vn00Var = fo00Var instanceof vn00 ? (vn00) fo00Var : null;
        if (vn00Var != null) {
            i3y i3yVar = this.n;
            bitmap = ((ddc0) i3yVar.getValue()).b(ddc0.d((ddc0) i3yVar.getValue(), vn00Var.a, vn00Var.b, placesPinLabelBitmapCreator$TextAlignment, ycc0.a, xcc0Var, 0, 0, 0, null, null, 0, null, 0, 16352));
        }
        return n(bitmap);
    }

    public final Bitmap e(Bitmap bitmap, float f, int i, int i2, float f2) {
        i3y i3yVar = this.p;
        ((Paint) i3yVar.getValue()).setColor(qje.t(xng0.bgMain, this.a));
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f3 = i;
        float f4 = i2;
        float max = Math.max(f3 / bitmap.getWidth(), f4 / bitmap.getHeight());
        float width = bitmap.getWidth() * max;
        float height = bitmap.getHeight() * max;
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        matrix.postTranslate((f3 - width) / 2.0f, (f4 - height) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f5 = f2 / 2.0f;
        RectF rectF = new RectF(f5, f5, f3 - f5, f4 - f5);
        canvas.drawRoundRect(rectF, f, f, paint);
        ((Paint) i3yVar.getValue()).setStrokeWidth(f2);
        canvas.drawRoundRect(rectF, f, f, (Paint) i3yVar.getValue());
        return createBitmap;
    }

    public final Drawable g(kdc kdcVar) {
        int i = f3h0.places_point_view;
        Context context = this.a;
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            return null;
        }
        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
        GradientDrawable gradientDrawable = (GradientDrawable) (layerDrawable != null ? layerDrawable.findDrawableByLayerId(p6h0.inner_circle) : null);
        if (kdcVar != null) {
            gradientDrawable.setColor(s8o.m(kdcVar, context));
        }
        return drawable;
    }

    public ImageProvider h(kn00 kn00Var, boolean z) {
        Bitmap b;
        Bitmap bitmap = null;
        if (kn00Var instanceof gn00) {
            gn00 gn00Var = (gn00) kn00Var;
            fo00 fo00Var = gn00Var.g;
            vn00 vn00Var = fo00Var instanceof vn00 ? (vn00) fo00Var : null;
            kdc kdcVar = vn00Var != null ? vn00Var.d : null;
            zwy0 zwy0Var = gn00Var.h;
            if (zwy0Var != null) {
                Bitmap a = zwy0Var.a(this.c.getThemeType());
                int i = this.h;
                bitmap = e(a, this.j, i, i, this.i);
            } else {
                Drawable g = g(kdcVar);
                if (g != null) {
                    bitmap = ffx.d0(g, 0, 0, 7);
                }
            }
            return n(bitmap);
        }
        if (kn00Var instanceof jn00) {
            Bitmap bitmap2 = ((jn00) kn00Var).f;
            if (bitmap2 != null) {
                ofc0 ofc0Var = this.d;
                bitmap = e(bitmap2, this.l, ofc0Var.a, ofc0Var.b, this.k);
            }
            return n(bitmap);
        }
        if (!(kn00Var instanceof hn00)) {
            w511.b();
            return null;
        }
        hn00 hn00Var = (hn00) kn00Var;
        zfc0 zfc0Var = this.f;
        zfc0Var.getClass();
        tcc0 tcc0Var = zfc0Var.b;
        fo00 fo00Var2 = hn00Var.h;
        if (fo00Var2 instanceof co00) {
            w040 w040Var = zfc0Var.c;
            co00 co00Var = (co00) fo00Var2;
            w040Var.getClass();
            i3y i3yVar = (i3y) w040Var.c;
            i3y i3yVar2 = (i3y) w040Var.d;
            zwy0 zwy0Var2 = co00Var.b;
            if (zwy0Var2 != null) {
                boolean z2 = co00Var.f;
                tcc0 tcc0Var2 = (tcc0) w040Var.b;
                bitmap = z2 ? tcc0Var2.a(zwy0Var2, ((Number) i3yVar2.getValue()).intValue(), ((Number) i3yVar2.getValue()).intValue(), (r24 & 8) != 0 ? 0 : 0, (r24 & 16) != 0 ? 0 : 0, (r24 & 32) != 0 ? 0 : 0, (r24 & 64) != 0 ? null : null, (r24 & 128) != 0 ? 0 : 0, (r24 & 256) == 0, null, null) : tcc0Var2.a(zwy0Var2, ((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue(), (r24 & 8) != 0 ? 0 : ((Number) ((i3y) w040Var.e).getValue()).intValue(), (r24 & 16) != 0 ? 0 : ((Number) ((i3y) w040Var.f).getValue()).intValue(), (r24 & 32) != 0 ? 0 : ((Number) ((i3y) w040Var.g).getValue()).intValue(), (r24 & 64) != 0 ? null : co00Var.c, (r24 & 128) != 0 ? 0 : ((Number) ((i3y) w040Var.h).getValue()).intValue(), (r24 & 256) == 0, null, null);
            }
        } else {
            if (fo00Var2 instanceof bo00) {
                w040 w040Var2 = zfc0Var.d;
                bo00 bo00Var = (bo00) fo00Var2;
                w040Var2.getClass();
                Pair g2 = w040Var2.g(bo00Var.g);
                Integer num = (Integer) g2.getFirst();
                Integer num2 = (Integer) g2.getSecond();
                tcc0 tcc0Var3 = (tcc0) w040Var2.c;
                zwy0 zwy0Var3 = bo00Var.b;
                ofc0 ofc0Var2 = (ofc0) w040Var2.b;
                b = tcc0Var3.a(zwy0Var3, ofc0Var2.a, ofc0Var2.b, w040Var2.h(), ((Number) ((i3y) w040Var2.e).getValue()).intValue(), ((Number) ((i3y) w040Var2.f).getValue()).intValue(), bo00Var.c, ((Number) ((i3y) w040Var2.g).getValue()).intValue(), true, num, num2);
                Bitmap bitmap3 = bo00Var.d;
                if (bitmap3 != null) {
                    Canvas canvas = new Canvas(b);
                    tcc0 tcc0Var4 = (tcc0) w040Var2.c;
                    tcc0Var4.getClass();
                    tcc0.c(canvas, bitmap3, w040Var2.i(), (canvas.getWidth() / 2) - (w040Var2.i() / 2.0f), (canvas.getHeight() / 2) - (w040Var2.i() / 2.0f));
                }
            } else if (fo00Var2 instanceof zn00) {
                bitmap = zfc0Var.e.e(((zn00) fo00Var2).a);
            } else if (fo00Var2 instanceof xn00) {
                bu0 bu0Var = zfc0Var.f;
                xn00 xn00Var = (xn00) fo00Var2;
                bu0Var.getClass();
                b = bu0Var.b(xn00Var.a, 1.0f);
                zwy0 zwy0Var4 = xn00Var.b;
                if (zwy0Var4 != null) {
                    bu0Var.c(b, zwy0Var4, 1.0f);
                }
            }
            bitmap = b;
        }
        if (bitmap == null) {
            return ImageProvider.fromBitmap((Bitmap) tcc0Var.c.getValue());
        }
        wcc0 h = zfc0Var.h(hn00Var);
        if (h == null) {
            return ImageProvider.fromBitmap(bitmap);
        }
        Bitmap b2 = ((ddc0) zfc0Var.u.getValue()).b(h);
        int intValue = ((Number) zfc0Var.r.getValue()).intValue();
        tcc0Var.getClass();
        scc0 d = tcc0.d(bitmap.getWidth(), bitmap.getHeight(), b2.getWidth(), b2.getHeight(), intValue);
        Bitmap createBitmap = Bitmap.createBitmap(d.a, d.b, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas2.drawBitmap(bitmap, d.c, 0.0f, paint);
        canvas2.drawBitmap(b2, d.d, d.e, paint);
        return ImageProvider.fromBitmap(createBitmap);
    }

    public /* bridge */ ImageProvider i(Object obj, boolean z) {
        return h((kn00) obj, z);
    }

    public ImageProvider j(kn00 kn00Var, d3c0 d3c0Var) {
        if (kn00Var instanceof gn00) {
            return d((gn00) kn00Var, d3c0Var);
        }
        if (kn00Var instanceof jn00) {
            return n(null);
        }
        if (!(kn00Var instanceof hn00)) {
            w511.b();
            return null;
        }
        h5c0 w = w(d3c0Var);
        zfc0 zfc0Var = this.f;
        Bitmap e = zfc0Var.e((hn00) kn00Var, w);
        if (e == null) {
            e = (Bitmap) zfc0Var.b.c.getValue();
        }
        return ImageProvider.fromBitmap(e);
    }

    public /* bridge */ ImageProvider k(Object obj, d3c0 d3c0Var) {
        return j((kn00) obj, d3c0Var);
    }

    public ImageProvider l(kn00 kn00Var, d3c0 d3c0Var) {
        if (kn00Var instanceof gn00) {
            return d((gn00) kn00Var, d3c0Var);
        }
        if (kn00Var instanceof jn00) {
            return n(null);
        }
        if (!(kn00Var instanceof hn00)) {
            w511.b();
            return null;
        }
        h5c0 w = w(d3c0Var);
        zfc0 zfc0Var = this.f;
        Bitmap e = zfc0Var.e((hn00) kn00Var, w);
        if (e == null) {
            e = (Bitmap) zfc0Var.b.c.getValue();
        }
        return ImageProvider.fromBitmap(e);
    }

    public /* bridge */ ImageProvider m(Object obj, d3c0 d3c0Var) {
        return l((kn00) obj, d3c0Var);
    }

    public final ImageProvider n(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = (Bitmap) this.e.c.getValue();
        }
        return ImageProvider.fromBitmap(bitmap);
    }

    public final float o() {
        zfc0 zfc0Var = this.f;
        w040 w040Var = zfc0Var.d;
        ofc0 ofc0Var = (ofc0) w040Var.b;
        int h = (w040Var.h() * 2) + ofc0Var.a;
        int h2 = (w040Var.h() * 2) + ofc0Var.b;
        i2c0 i = zfc0Var.f.i(1.0f);
        return (float) Math.sqrt(((float) Math.pow(Math.max(h, i.a), 2.0d)) + ((float) Math.pow(Math.max(h2, i.b), 2.0d)));
    }

    public final i2c0 p(Object obj) {
        zwy0 zwy0Var;
        Bitmap a;
        kn00 kn00Var = (kn00) obj;
        if (kn00Var instanceof gn00) {
            Drawable g = g(null);
            return new i2c0(g != null ? g.getIntrinsicWidth() : 0, g != null ? g.getIntrinsicHeight() : 0);
        }
        if (kn00Var instanceof jn00) {
            return new i2c0(0, 0);
        }
        if (!(kn00Var instanceof hn00)) {
            w511.b();
            return null;
        }
        zfc0 zfc0Var = this.f;
        zfc0Var.getClass();
        fo00 fo00Var = ((hn00) kn00Var).g;
        do00 do00Var = fo00Var instanceof do00 ? (do00) fo00Var : null;
        return (do00Var == null || (zwy0Var = do00Var.a) == null || (a = zwy0Var.a(zfc0Var.g.getThemeType())) == null) ? new i2c0(0, 0) : new i2c0(a.getWidth(), a.getHeight());
    }

    public i2c0 q(kn00 kn00Var) {
        if (kn00Var instanceof gn00) {
            int i = this.h;
            return new i2c0(i, i);
        }
        if (kn00Var instanceof jn00) {
            ofc0 ofc0Var = this.d;
            return new i2c0(ofc0Var.a, ofc0Var.b);
        }
        if (kn00Var instanceof hn00) {
            return this.f.j((hn00) kn00Var);
        }
        w511.b();
        return null;
    }

    public /* bridge */ i2c0 r(Object obj) {
        return q((kn00) obj);
    }

    public i2c0 s(kn00 kn00Var, d3c0 d3c0Var) {
        if (kn00Var instanceof gn00) {
            return c((gn00) kn00Var);
        }
        if (kn00Var instanceof jn00) {
            return new i2c0(0, 0);
        }
        if (!(kn00Var instanceof hn00)) {
            w511.b();
            return null;
        }
        h5c0 w = w(d3c0Var);
        return this.f.a((hn00) kn00Var, w);
    }

    public /* bridge */ i2c0 t(Object obj, d3c0 d3c0Var) {
        return s((kn00) obj, d3c0Var);
    }

    public i2c0 u(kn00 kn00Var, d3c0 d3c0Var) {
        if (kn00Var instanceof gn00) {
            return c((gn00) kn00Var);
        }
        if (kn00Var instanceof jn00) {
            return new i2c0(0, 0);
        }
        if (!(kn00Var instanceof hn00)) {
            w511.b();
            return null;
        }
        h5c0 w = w(d3c0Var);
        return this.f.a((hn00) kn00Var, w);
    }

    public /* bridge */ i2c0 v(Object obj, d3c0 d3c0Var) {
        return u((kn00) obj, d3c0Var);
    }
}
