package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.utils.f;

/* loaded from: classes6.dex */
public final class g3c0 implements vr21 {
    public static final Point D = new Point(0.0d, 0.0d);
    public float A;
    public ArrayList B;
    public ValueAnimator C;
    public final xm00 a;
    public final f4c0 b;
    public final f4c0 c;
    public final IconStyle w;
    public final IconStyle x;
    public final f y;
    public ro21 z;

    public g3c0(Context context, xm00 xm00Var) {
        this.a = xm00Var;
        Point point = D;
        this.b = new f4c0(point, null, 6);
        f4c0 f4c0Var = new f4c0(point, null, 6);
        f4c0Var.g(new r58(5, this));
        this.c = f4c0Var;
        this.w = new IconStyle().setFlat(Boolean.TRUE).setRotationType(RotationType.ROTATE);
        this.x = new IconStyle();
        this.y = new f(oxf0.class);
        this.B = h(context, null);
    }

    public static ArrayList h(Context context, int[] iArr) {
        Iterable e73Var = iArr != null ? new e73(1, iArr) : null;
        if (e73Var == null) {
            e73Var = EmptyList.a;
        }
        Iterable iterable = e73Var;
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ImageProvider.fromBitmap(u8b1.h(((Number) it.next()).intValue(), context)));
        }
        return arrayList;
    }

    @Override // defpackage.vr21
    public final void f6(boolean z) {
        this.c.i(z);
    }

    @Override // defpackage.vr21
    public final void gg(Context context, ro21 ro21Var) {
        float f;
        if (jl40.l(this.z, ro21Var)) {
            return;
        }
        this.z = ro21Var;
        Resources resources = context.getResources();
        int i = ro21Var.h;
        int i2 = ro21Var.a;
        Rect rect = xw31.a;
        ThreadLocal threadLocal = wuj0.a;
        Float valueOf = Float.valueOf(resources.getFloat(i));
        IconStyle iconStyle = this.w;
        iconStyle.setScale(valueOf);
        iconStyle.setAnchor(new PointF(context.getResources().getFloat(ro21Var.f), context.getResources().getFloat(ro21Var.g)));
        f4c0 f4c0Var = this.b;
        f4c0Var.D(iconStyle);
        f4c0Var.y(ImageProvider.fromBitmap(u8b1.h(ro21Var.b, context)));
        f4c0Var.i(false);
        f4c0Var.k(2.01f);
        PointF pointF = new PointF(context.getResources().getFloat(ro21Var.d), context.getResources().getFloat(ro21Var.e));
        IconStyle iconStyle2 = this.x;
        iconStyle2.setAnchor(pointF);
        f4c0 f4c0Var2 = this.c;
        f4c0Var2.D(iconStyle2);
        f4c0Var2.i(true);
        f4c0Var2.k(2.02f);
        f4c0Var2.y(ImageProvider.fromBitmap(u8b1.h(i2, context)));
        Drawable drawable = context.getDrawable(i2);
        if (drawable == null) {
            f = 0.0f;
        } else {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f2 = intrinsicHeight;
            float f3 = 0.33333334f * f2;
            float f4 = (f2 - f3) / 2.0f;
            unr0.C(new Object[]{Integer.valueOf(intrinsicHeight), Float.valueOf(f4), Float.valueOf(f3)}, 3, "Y icon height: %d, radius: %.2f, padding: %.2f", jst.e);
            f = f4;
        }
        this.A = f;
        this.B = h(context, ro21Var.c);
    }

    @Override // defpackage.vr21
    public final void kc(Point point) {
        f4c0 f4c0Var = this.b;
        f4c0Var.o(point);
        if (f4c0Var.f == null) {
            f4c0Var.b(this.a);
        }
    }

    @Override // defpackage.vr21
    public final void ob(float f) {
        this.b.v(f);
    }

    @Override // defpackage.vr21
    public final void s0() {
        this.c.d();
        this.b.d();
    }

    @Override // defpackage.vr21
    public final void setGeometry(Point point) {
        f4c0 f4c0Var = this.c;
        f4c0Var.o(point);
        if (f4c0Var.f == null) {
            f4c0Var.b(this.a);
        }
    }

    @Override // defpackage.vr21
    public final void w9(boolean z) {
        this.b.i(z);
    }
}
