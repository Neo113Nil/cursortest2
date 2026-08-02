package xsna;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.b;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import xsna.w0u0;

/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes11.dex */
public final class ca30 implements Comparable<ca30> {
    public int d;
    public float b = 1.0f;
    public int c = 0;
    public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public final LinkedHashMap<String, ConstraintAttribute> r = new LinkedHashMap<>();

    public static boolean c(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap<String, w0u0> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            w0u0 w0u0Var = hashMap.get(str);
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = '\r';
                        break;
                    }
                    break;
            }
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.g)) {
                        f = this.g;
                    }
                    w0u0Var.b(f, i);
                    break;
                case 1:
                    if (!Float.isNaN(this.h)) {
                        f = this.h;
                    }
                    w0u0Var.b(f, i);
                    break;
                case 2:
                    if (!Float.isNaN(this.m)) {
                        f = this.m;
                    }
                    w0u0Var.b(f, i);
                    break;
                case 3:
                    if (!Float.isNaN(this.n)) {
                        f = this.n;
                    }
                    w0u0Var.b(f, i);
                    break;
                case 4:
                    if (!Float.isNaN(this.o)) {
                        f = this.o;
                    }
                    w0u0Var.b(f, i);
                    break;
                case 5:
                    if (!Float.isNaN(this.q)) {
                        f = this.q;
                    }
                    w0u0Var.b(f, i);
                    break;
                case 6:
                    w0u0Var.b(Float.isNaN(this.i) ? 1.0f : this.i, i);
                    break;
                case 7:
                    w0u0Var.b(Float.isNaN(this.j) ? 1.0f : this.j, i);
                    break;
                case '\b':
                    if (!Float.isNaN(this.k)) {
                        f = this.k;
                    }
                    w0u0Var.b(f, i);
                    break;
                case '\t':
                    if (!Float.isNaN(this.l)) {
                        f = this.l;
                    }
                    w0u0Var.b(f, i);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f)) {
                        f = this.f;
                    }
                    w0u0Var.b(f, i);
                    break;
                case 11:
                    if (!Float.isNaN(this.e)) {
                        f = this.e;
                    }
                    w0u0Var.b(f, i);
                    break;
                case '\f':
                    if (!Float.isNaN(this.p)) {
                        f = this.p;
                    }
                    w0u0Var.b(f, i);
                    break;
                case '\r':
                    w0u0Var.b(Float.isNaN(this.b) ? 1.0f : this.b, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(StringUtils.COMMA)[1];
                        LinkedHashMap<String, ConstraintAttribute> linkedHashMap = this.r;
                        if (linkedHashMap.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = linkedHashMap.get(str2);
                            if (w0u0Var instanceof w0u0.b) {
                                ((w0u0.b) w0u0Var).f.append(i, constraintAttribute);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + constraintAttribute.a() + w0u0Var);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    }
            }
        }
    }

    public final void b(View view) {
        this.d = view.getVisibility();
        this.b = view.getVisibility() != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : view.getAlpha();
        this.e = view.getElevation();
        this.f = view.getRotation();
        this.g = view.getRotationX();
        this.h = view.getRotationY();
        this.i = view.getScaleX();
        this.j = view.getScaleY();
        this.k = view.getPivotX();
        this.l = view.getPivotY();
        this.m = view.getTranslationX();
        this.n = view.getTranslationY();
        this.o = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(ca30 ca30Var) {
        ca30Var.getClass();
        return Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void d(Rect rect, androidx.constraintlayout.widget.b bVar, int i, int i2) {
        rect.width();
        rect.height();
        b.a u = bVar.u(i2);
        b.d dVar = u.c;
        b.c cVar = u.d;
        int i3 = dVar.c;
        this.c = i3;
        int i4 = dVar.b;
        this.d = i4;
        this.b = (i4 == 0 || i3 != 0) ? dVar.d : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        b.e eVar = u.f;
        boolean z = eVar.m;
        this.e = eVar.n;
        this.f = eVar.b;
        this.g = eVar.c;
        this.h = eVar.d;
        this.i = eVar.e;
        this.j = eVar.f;
        this.k = eVar.g;
        this.l = eVar.h;
        this.m = eVar.j;
        this.n = eVar.k;
        this.o = eVar.l;
        guo.c(cVar.d);
        this.p = cVar.h;
        this.q = u.c.e;
        for (String str : u.g.keySet()) {
            ConstraintAttribute constraintAttribute = u.g.get(str);
            constraintAttribute.getClass();
            int i5 = ConstraintAttribute.a.a[constraintAttribute.c.ordinal()];
            if (i5 != 1 && i5 != 2 && i5 != 3) {
                this.r.put(str, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f + 90.0f;
            this.f = f;
            if (f > 180.0f) {
                this.f = f - 360.0f;
                return;
            }
            return;
        }
        this.f -= 90.0f;
    }
}
