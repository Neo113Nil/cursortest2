package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.text.Layout;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.api.data.IconDrawConfig;
import com.vkontakte.android.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Triple;
import kotlin.text.Regex;
import xsna.cpv;

/* compiled from: HorizontalIconDrawer.kt */
/* loaded from: classes2.dex */
public final class bev extends fqv<cev> {
    public static final int n = Color.argb(204, 255, 255, 255);
    public static final int o = Color.argb(255, 255, 255, 255);
    public static final int p = Color.argb(204, 22, 32, 52);
    public static final int q = Color.argb(255, 22, 32, 52);
    public final Context k;
    public final bpn0 l;
    public final bpn0 m;

    public bev(Context context, float f, IconDrawConfig iconDrawConfig, cev cevVar) {
        super(f, iconDrawConfig, cevVar);
        this.k = context;
        this.l = new bpn0(new m2g(this, 24));
        this.m = new bpn0(new fbh(this, 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fqv
    public final Bitmap b(Bitmap bitmap, float f, int i) {
        long j = ((cev) this.c).c;
        int i2 = (int) (j >> 32);
        Bitmap createBitmap = Bitmap.createBitmap(i2, (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int l = krv0.l(R.attr.vk_ui_background_content);
        canvas.drawARGB(0, 0, 0, 0);
        float f2 = i2 * 0.5f;
        Paint paint = (Paint) this.d.b.get();
        paint.setColor(l);
        canvas.drawCircle(f2, f2, f2, paint);
        paint.setColor(i);
        canvas.drawCircle(f2, f2, f2 - cn70.b(1), paint);
        Paint paint2 = (Paint) this.f.b.get();
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) this.l.getValue();
        ColorFilter colorFilter = paint2.getColorFilter();
        paint2.setColorFilter(porterDuffColorFilter);
        canvas.drawBitmap(bitmap, (i2 - bitmap.getWidth()) * 0.5f, (r0 - bitmap.getHeight()) * 0.5f, paint2);
        paint2.setColorFilter(colorFilter);
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    @Override // xsna.fqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cpv.a c(Bitmap bitmap, int i, boolean z, CharSequence charSequence, CharSequence charSequence2) {
        Triple triple;
        Bitmap bitmap2;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        Bitmap bitmap3;
        float f4;
        float f5;
        Layout layout;
        bev bevVar = this;
        wqo0 wqo0Var = bevVar.f;
        I i4 = bevVar.c;
        IconDrawConfig iconDrawConfig = bevVar.b;
        if (charSequence != null && !drm0.N(charSequence)) {
            if (charSequence2 == null || charSequence2.length() == 0) {
                layout = null;
            } else {
                layout = bevVar.i(iconDrawConfig.j * bevVar.a, z ? l8g.f(0.8f, krv0.l(R.attr.vk_ui_text_contrast_themed)) : krv0.l(R.attr.vk_ui_text_subhead), iconDrawConfig.d, ((cev) i4).p, charSequence2.toString());
            }
            int i5 = (layout == null || layout.getLineCount() < 1) ? 2 : 1;
            String obj = charSequence.toString();
            cev cevVar = (cev) i4;
            float f6 = z ? cevVar.j : cevVar.i;
            bevVar = this;
            Layout i6 = bevVar.i(f6, z ? krv0.l(R.attr.vk_ui_background_content) : i, i5, ((cev) i4).p, obj);
            if (i6 != null) {
                Bitmap h = fqv.h(i6);
                if (charSequence2 == null || charSequence2.length() == 0 || layout == null) {
                    triple = new Triple(h, Boolean.TRUE, Boolean.FALSE);
                } else {
                    Bitmap h2 = fqv.h(layout);
                    Bitmap createBitmap = Bitmap.createBitmap(Math.max(h.getWidth(), h2.getWidth()), an10.b(cn70.a() * iconDrawConfig.n) + h2.getHeight() + h.getHeight(), Bitmap.Config.ARGB_8888);
                    Paint paint = (Paint) wqo0Var.b.get();
                    paint.setColor(-16777216);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawBitmap(h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                    canvas.drawBitmap(h2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dq.a(iconDrawConfig.n, h.getHeight()), paint);
                    ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
                    Boolean bool = Boolean.TRUE;
                    triple = new Triple(createBitmap, bool, bool);
                }
                bitmap2 = (Bitmap) (triple != null ? triple.i() : null);
                boolean booleanValue = triple == null ? ((Boolean) triple.j()).booleanValue() : false;
                boolean booleanValue2 = triple != null ? ((Boolean) triple.k()).booleanValue() : false;
                if (bitmap2 != null) {
                    return new cpv.a(bitmap, 0.5f, 96);
                }
                cev cevVar2 = (cev) i4;
                int i7 = cevVar2.g;
                int i8 = cevVar2.h;
                int i9 = cevVar2.f;
                int i10 = cevVar2.e;
                int width = bitmap2.getWidth() + bitmap.getWidth() + i10 + i8;
                int height = z ? (int) (cevVar2.k & 4294967295L) : bitmap.getHeight();
                float a = cn70.a() * 20.0f;
                float a2 = cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (z) {
                    f2 = cn70.a() * 8.0f;
                    i10 += cn70.b(6);
                    a2 = i9 + cn70.b(4);
                    int width2 = bitmap2.getWidth() + bitmap.getWidth() + an10.b(a2) + i10 + i7;
                    width = an10.b(f2) + width2;
                    i2 = width2;
                    f = 0.5f;
                } else {
                    f = 0.5f;
                    if (bitmap2.getHeight() > height || booleanValue2) {
                        width = (width - i8) + i9 + i7;
                        height = cevVar2.q;
                        a = cn70.a() * 40.0f;
                        a2 = i9;
                    }
                    f2 = 0.0f;
                    i2 = width;
                }
                float f7 = a;
                Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                int i11 = z ? i : iconDrawConfig.b ? n : p;
                Paint paint2 = (Paint) wqo0Var.b.get();
                float a3 = 3.0f * cn70.a();
                float f8 = height;
                float f9 = f8 - a3;
                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i3 = height;
                    float a4 = cn70.a() * 4.5f;
                    bitmap3 = createBitmap2;
                    int color = paint2.getColor();
                    paint2.setColor(i11);
                    canvas2.drawCircle(a3, f9, a3, paint2);
                    f3 = f9;
                    f4 = a3;
                    canvas2.drawCircle((cn70.a() * 1.0f) + (2 * a3) + a4, (f8 - (cn70.a() * 4.0f)) - a4, a4, paint2);
                    paint2.setColor(color);
                } else {
                    i3 = height;
                    f3 = f9;
                    bitmap3 = createBitmap2;
                    f4 = a3;
                }
                RectF rectF = (RectF) bevVar.g.b.get();
                float f10 = i2;
                rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f8);
                int save = canvas2.save();
                canvas2.translate(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                try {
                    int color2 = paint2.getColor();
                    paint2.setColor(i11);
                    canvas2.drawRoundRect(rectF, f7, f7, paint2);
                    paint2.setColor(color2);
                    canvas2.drawBitmap(bitmap, a2, (i3 - bitmap.getHeight()) * f, paint2);
                    canvas2.drawBitmap(bitmap2, bitmap.getWidth() + a2 + i10, (i3 - bitmap2.getHeight()) * f, paint2);
                    canvas2.restoreToCount(save);
                    ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap2 = vc7.a;
                    float width3 = ((bitmap.getWidth() * f) + a2) / f10;
                    if (z) {
                        width3 = f4 / bitmap3.getWidth();
                        f5 = f3 / bitmap3.getHeight();
                    } else {
                        f5 = f;
                    }
                    return new cpv.a(bitmap3, width3, f5, booleanValue, booleanValue2, charSequence, charSequence2);
                } catch (Throwable th) {
                    canvas2.restoreToCount(save);
                    throw th;
                }
            }
        }
        triple = null;
        bitmap2 = (Bitmap) (triple != null ? triple.i() : null);
        if (triple == null) {
        }
        boolean booleanValue22 = triple != null ? ((Boolean) triple.k()).booleanValue() : false;
        if (bitmap2 != null) {
        }
    }

    @Override // xsna.fqv
    @ozl
    public final cpv.a d(Bitmap bitmap, cpv.a aVar, int i, float f, boolean z, CharSequence charSequence, CharSequence charSequence2) {
        ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
        return c(aVar.a, i, z, charSequence, charSequence2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fqv
    public final cpv.a e(Bitmap bitmap, float f, CharSequence charSequence, CharSequence charSequence2) {
        float a = cn70.a() * 1.0f;
        Bitmap createBitmap = Bitmap.createBitmap((an10.b(a) * 2) + bitmap.getWidth(), (an10.b(a) * 2) + bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = (RectF) this.g.b.get();
        rectF.set(a, a, bitmap.getWidth(), bitmap.getHeight());
        Paint paint = (Paint) this.f.b.get();
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        canvas.drawARGB(0, 0, 0, 0);
        float a2 = cn70.a() * 4.0f;
        canvas.drawRoundRect(rectF, a2, a2, paint);
        Xfermode xfermode = paint.getXfermode();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, a, a, paint);
        paint.setXfermode(xfermode);
        paint.setColor(this.b.b ? o : q);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(a);
        canvas.drawRoundRect(rectF, a2, a2, paint);
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        paint.setStyle(style);
        ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
        return new cpv.a(createBitmap, 0.5f, 0.5f, false, false, charSequence, charSequence2);
    }

    @Override // xsna.fqv
    public final Bitmap f(elr0 elr0Var, int i) {
        int i2 = ((cev) this.c).d;
        elr0Var.setColorFilter(new PorterDuffColorFilter(krv0.l(R.attr.vk_ui_background_content), PorterDuff.Mode.SRC_IN));
        return xjo.b(elr0Var, i2, i2, 4);
    }

    @Override // xsna.fqv
    public final int g() {
        return krv0.l(R.attr.vk_ui_background_content);
    }

    public final Layout i(float f, int i, int i2, int i3, String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String g = fqv.j.g(str, " ");
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Regex regex = hjo0.a;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        return hjo0.a(g, f, i, i3, i2, 1, alignment, (Typeface) this.m.getValue(), 256);
    }
}
