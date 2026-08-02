package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.a;
import com.yandex.go.beginners.presentation.services_info.views.ServiceMainInfoItemView;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes6.dex */
public final class kn1 implements wi6, o13, iv60, ii61 {
    public final /* synthetic */ int a;
    public final int b;
    public int c;
    public final Object w;

    public kn1(ub30 ub30Var, a aVar) {
        this.a = 1;
        ef90 ef90Var = ub30Var.c;
        this.w = ef90Var;
        ef90Var.K(12);
        int C = ef90Var.C();
        if ("audio/raw".equals(aVar.n)) {
            int t = tw21.t(aVar.F) * aVar.D;
            if (C == 0 || C % t != 0) {
                lk91.j("Audio sample size mismatch. stsd sample size: " + t + ", stsz sample size: " + C);
                C = t;
            }
        }
        this.b = C == 0 ? -1 : C;
        this.c = ef90Var.C();
    }

    @Override // defpackage.o13
    public void a(int i, int i2) {
        ((o13) this.w).a(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.ii61
    public int b() {
        return this.c;
    }

    @Override // defpackage.ii61
    public int c() {
        int i = this.b;
        return i == -1 ? ((dl81) this.w).v() : i;
    }

    @Override // defpackage.wi6
    public int e() {
        int i = this.b;
        return i == -1 ? ((ef90) this.w).C() : i;
    }

    @Override // defpackage.o13
    public void f() {
        ((o13) this.w).f();
    }

    @Override // defpackage.o13
    public void g(Object obj, wls wlsVar) {
        ((o13) this.w).g(obj, wlsVar);
    }

    @Override // defpackage.wi6
    public int h() {
        return this.c;
    }

    @Override // defpackage.o13
    public void i(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        ((o13) this.w).i(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.iv60
    public int j(int i) {
        int j = ((iv60) this.w).j(i);
        if (i >= 0 && i <= this.c) {
            iz21.c(j, this.b, i);
        }
        return j;
    }

    @Override // defpackage.o13
    public void k(int i, Object obj) {
        ((o13) this.w).k(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.o13
    public Object l() {
        return ((o13) this.w).l();
    }

    @Override // defpackage.o13
    public void m(int i, Object obj) {
        ((o13) this.w).m(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.o13
    public void n(Object obj) {
        this.c++;
        ((o13) this.w).n(obj);
    }

    @Override // defpackage.wi6
    public int o() {
        return this.b;
    }

    @Override // defpackage.o13
    public void p() {
        if (this.c <= 0) {
            lid.a("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        ((o13) this.w).p();
    }

    public int q(BitmapFactory.Options options) {
        int i = this.c;
        Pair pair = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        int i2 = 1;
        int i3 = this.b;
        if (intValue <= i3 && intValue2 <= i) {
            return 1;
        }
        int i4 = intValue / 2;
        int i5 = intValue2 / 2;
        while (i4 / i2 >= i3 && i5 / i2 >= i) {
            i2 *= 2;
        }
        return i2;
    }

    @Override // defpackage.iv60
    public int r(int i) {
        int r = ((iv60) this.w).r(i);
        if (i >= 0 && i <= this.b) {
            iz21.b(r, this.c, i);
        }
        return r;
    }

    public AnimatorSet s(ServiceMainInfoItemView serviceMainInfoItemView, long j) {
        ListBuilder a = rcc.a();
        TextView serviceName = serviceMainInfoItemView.getServiceName();
        if (serviceName != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject((ArgbEvaluator) this.w, Integer.valueOf(serviceName.getCurrentTextColor()), Integer.valueOf(this.b));
            ofObject.setDuration(j);
            ofObject.addUpdateListener(new sh2(serviceName, 1));
            a.add(ofObject);
        }
        ImageView serviceIcon = serviceMainInfoItemView.getServiceIcon();
        if (serviceIcon != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(serviceIcon, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat.setDuration(j);
            a.add(ofFloat);
        }
        ListBuilder j2 = a.j();
        boolean isEmpty = j2.isEmpty();
        if (isEmpty) {
            return null;
        }
        if (isEmpty) {
            w511.b();
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(j2);
        return animatorSet;
    }

    public Bitmap t(sls slsVar, boolean z) {
        int d;
        try {
            InputStream inputStream = (InputStream) slsVar.invoke();
            if (inputStream != null) {
                try {
                    d = new androidx.exifinterface.media.a(inputStream).d(1, "Orientation");
                    inputStream.close();
                } finally {
                }
            } else {
                d = 1;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream inputStream2 = (InputStream) slsVar.invoke();
            if (inputStream2 != null) {
                try {
                    BitmapFactory.decodeStream(inputStream2, null, options);
                    inputStream2.close();
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (z) {
                options.inSampleSize = q(options);
            }
            options.inJustDecodeBounds = false;
            inputStream = (InputStream) slsVar.invoke();
            if (inputStream != null) {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    inputStream.close();
                    if (decodeStream != null) {
                        if (d == 0 || d == 1) {
                            return decodeStream;
                        }
                        Matrix matrix = new Matrix();
                        if (d == 2) {
                            matrix.preScale(-1.0f, 1.0f);
                        } else if (d == 3) {
                            matrix.postRotate(180.0f);
                        } else if (d == 6) {
                            matrix.postRotate(90.0f);
                        } else if (d == 8) {
                            matrix.postRotate(270.0f);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                        if (!createBitmap.equals(decodeStream)) {
                            decodeStream.recycle();
                        }
                        return createBitmap;
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                        ooc.g(inputStream, th);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.w)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public byte u(int i, int i2) {
        return ((byte[][]) this.w)[i2][i];
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean v(wpb0 wpb0Var, xqx xqxVar, Map map, ScreenRect screenRect) {
        boolean z;
        ScreenRect screenRect2;
        float f;
        ScreenPoint e;
        Rect rect;
        Rect g;
        PointF pointF;
        ah00 ah00Var = (ah00) this.w;
        zzs zzsVar = wpb0Var.b;
        gh00 gh00Var = (gh00) ah00Var;
        es00 es00Var = gh00Var.e;
        es00Var.getClass();
        ScreenPoint e2 = es00Var.e(ru.yandex.taxi.map.utils.a.F(zzsVar));
        boolean z2 = false;
        if (e2 != null) {
            Bitmap b = xqxVar.b();
            nqx nqxVar = xqxVar.a;
            int width = b.getWidth();
            int height = xqxVar.b().getHeight();
            PointF a = xqxVar.a();
            float p = uh6.p(xqxVar.b.getContext(), 12.0f);
            Rect rect2 = new Rect(0, 0, (int) ((xqxVar.b().getWidth() - (nqxVar.h * p)) - (nqxVar.j * p)), (int) ((xqxVar.b().getHeight() - (nqxVar.g * p)) - (nqxVar.i * p)));
            int i = (width - rect2.right) / 2;
            int i2 = (height - rect2.bottom) / 2;
            float x = ((width - i) * a.x * (nqxVar.f < 0.0f ? 1 : -1)) + e2.getX();
            float y = ((height - i2) * a.y * (nqxVar.e < 0.0f ? 1 : -1)) + e2.getY();
            ScreenRect screenRect3 = new ScreenRect(new ScreenPoint(x, y), new ScreenPoint(x + rect2.right, y + rect2.bottom));
            for (Map.Entry entry : map.entrySet()) {
                wpb0 wpb0Var2 = (wpb0) entry.getKey();
                ru.yandex.taxi.map.overlay.pickup.a aVar = (ru.yandex.taxi.map.overlay.pickup.a) entry.getValue();
                if (!jl40.l(wpb0Var2, wpb0Var)) {
                    f4c0 f4c0Var = aVar.l;
                    if (f4c0Var != null) {
                        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                        ScreenPoint e3 = gh00Var.e.e((Point) f4c0Var.h);
                        if (e3 != null) {
                            ImageProvider imageProvider = f4c0Var.k;
                            if (imageProvider == null || (((imageProvider instanceof qxy) && !((qxy) imageProvider).a()) || imageProvider.get$image() == null)) {
                                z = z2;
                                screenRect2 = new ScreenRect(e3, e3);
                            } else {
                                Bitmap bitmap = imageProvider.get$image();
                                int height2 = bitmap.getHeight();
                                int width2 = bitmap.getWidth();
                                IconStyle iconStyle = f4c0Var.m;
                                if (iconStyle == null || (pointF = iconStyle.getAnchor()) == null) {
                                    pointF = new PointF(0.5f, 0.5f);
                                }
                                float f2 = width2;
                                float f3 = pointF.x * f2;
                                float f4 = height2;
                                float f5 = pointF.y * f4;
                                z = z2;
                                screenRect2 = new ScreenRect(new ScreenPoint((e3.getX() - f3) + 0.0f, (e3.getY() - f5) + 0.0f), new ScreenPoint((e3.getX() + (f2 - f3)) - 0.0f, (e3.getY() + (f4 - f5)) - 0.0f));
                            }
                            Point point = (Point) aVar.j.h;
                            Polyline polyline2 = ru.yandex.taxi.map.utils.a.b;
                            f = this.b / 2.0f;
                            e = gh00Var.e.e(point);
                            if (!ru.yandex.taxi.map.utils.a.c(screenRect3, e != null ? new ScreenRect(new ScreenPoint(e.getX() - f, e.getY() - f), new ScreenPoint(e.getX() + f, e.getY() + f)) : null) && !ru.yandex.taxi.map.utils.a.c(screenRect3, screenRect2)) {
                                rect = new Rect((int) screenRect3.getTopLeft().getX(), (int) screenRect3.getTopLeft().getY(), (int) screenRect3.getBottomRight().getX(), (int) screenRect3.getBottomRight().getY());
                                g = gh00Var.g();
                                if (!g.contains(rect)) {
                                    float f6 = nqxVar.f;
                                    if ((f6 >= 0.0f || rect.right <= g.right) && (f6 < 0.0f || rect.left >= g.left)) {
                                        float f7 = nqxVar.e;
                                        if (f7 < 0.0f) {
                                            if (rect.bottom > g.bottom) {
                                            }
                                        }
                                        if (f7 >= 0.0f && rect.top < g.top) {
                                        }
                                    }
                                }
                                if (screenRect != null) {
                                    float f8 = this.c;
                                    float y2 = screenRect.getBottomRight().getY();
                                    float y3 = screenRect3.getTopLeft().getY();
                                    float x2 = screenRect.getTopLeft().getX();
                                    float x3 = screenRect.getBottomRight().getX();
                                    float x4 = screenRect3.getTopLeft().getX();
                                    boolean z3 = ((x2 > x4 || x4 > x3) && (x4 > x2 || x2 > screenRect3.getBottomRight().getX())) ? z : true;
                                    boolean z4 = (y2 < y3 || y2 - y3 > f8) ? z : true;
                                    if (z3 && z4) {
                                        return z;
                                    }
                                    if (ru.yandex.taxi.map.utils.a.c(screenRect3, screenRect)) {
                                    }
                                }
                                z2 = z;
                            }
                            return true;
                        }
                    }
                    z = z2;
                    screenRect2 = null;
                    Point point2 = (Point) aVar.j.h;
                    Polyline polyline22 = ru.yandex.taxi.map.utils.a.b;
                    f = this.b / 2.0f;
                    e = gh00Var.e.e(point2);
                    if (!ru.yandex.taxi.map.utils.a.c(screenRect3, e != null ? new ScreenRect(new ScreenPoint(e.getX() - f, e.getY() - f), new ScreenPoint(e.getX() + f, e.getY() + f)) : null)) {
                        rect = new Rect((int) screenRect3.getTopLeft().getX(), (int) screenRect3.getTopLeft().getY(), (int) screenRect3.getBottomRight().getX(), (int) screenRect3.getBottomRight().getY());
                        g = gh00Var.g();
                        if (!g.contains(rect)) {
                        }
                        if (screenRect != null) {
                        }
                        z2 = z;
                    }
                    return true;
                }
            }
        }
        return z2;
    }

    public void w(int i, int i2, int i3) {
        ((byte[][]) this.w)[i2][i] = (byte) i3;
    }

    public void x(int i, int i2, boolean z) {
        ((byte[][]) this.w)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    @Override // defpackage.ii61
    public int a() {
        return this.b;
    }

    public kn1(hp81 hp81Var, qd81 qd81Var) {
        this.a = 9;
        dl81 dl81Var = hp81Var.c;
        this.w = dl81Var;
        dl81Var.m(12);
        int v = dl81Var.v();
        if ("audio/raw".equals(qd81Var.E)) {
            int b = rf71.b(qd81Var.T, qd81Var.R);
            if (v == 0 || v % b != 0) {
                nba1.e();
                v = b;
            }
        }
        this.b = v == 0 ? -1 : v;
        this.c = dl81Var.v();
    }

    public kn1(Context context, int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.w = new ArgbEvaluator();
                this.b = s8o.m(new bdc(xng0.controlMain), context);
                this.c = context.getColor(mqg0.component_gray_200);
                break;
            default:
                this.w = context;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                this.b = displayMetrics.heightPixels;
                this.c = displayMetrics.widthPixels;
                break;
        }
    }

    public kn1(ah00 ah00Var, zuj0 zuj0Var) {
        this.a = 3;
        this.w = ah00Var;
        avj0 avj0Var = (avj0) zuj0Var;
        this.b = avj0Var.c(wrg0.pickup_point_tapable_distance);
        this.c = avj0Var.c(wrg0.pin_label_intersection_threshold);
    }

    public kn1(int i, int i2) {
        this.a = 2;
        this.w = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public kn1(o13 o13Var, int i) {
        this.a = 4;
        this.w = o13Var;
        this.b = i;
    }

    public kn1(int i, int i2, sls slsVar) {
        this.a = 7;
        this.b = i;
        this.c = i2;
        this.w = slsVar;
    }

    public /* synthetic */ kn1(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.w = obj;
        this.b = i;
        this.c = i2;
    }
}
