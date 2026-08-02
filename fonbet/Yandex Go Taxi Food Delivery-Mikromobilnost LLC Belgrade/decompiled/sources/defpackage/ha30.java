package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.e;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class ha30 implements Comparable {
    public int c;
    public float a = 0.0f;
    public int b = 0;
    public final LinkedHashMap w = new LinkedHashMap();
    public float x = 1.0f;
    public float y = 0.0f;
    public float z = 0.0f;
    public float A = 0.0f;
    public float B = 1.0f;
    public float C = 1.0f;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = 0.0f;
    public float G = 0.0f;
    public float H = 0.0f;
    public float I = Float.NaN;
    public float J = Float.NaN;

    public static boolean c(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(int i, HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            wu31 wu31Var = (wu31) hashMap.get(str);
            if (wu31Var != null) {
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
                        if (str.equals("progress")) {
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
                        if (str.equals(CaretView.ALPHA_PROPERTY)) {
                            c = HexString.LF;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        wu31Var.b(Float.isNaN(this.A) ? 0.0f : this.A, i);
                        break;
                    case 1:
                        wu31Var.b(Float.isNaN(this.a) ? 0.0f : this.a, i);
                        break;
                    case 2:
                        wu31Var.b(Float.isNaN(this.F) ? 0.0f : this.F, i);
                        break;
                    case 3:
                        wu31Var.b(Float.isNaN(this.G) ? 0.0f : this.G, i);
                        break;
                    case 4:
                        wu31Var.b(Float.isNaN(this.H) ? 0.0f : this.H, i);
                        break;
                    case 5:
                        wu31Var.b(Float.isNaN(this.J) ? 0.0f : this.J, i);
                        break;
                    case 6:
                        wu31Var.b(Float.isNaN(this.B) ? 1.0f : this.B, i);
                        break;
                    case 7:
                        wu31Var.b(Float.isNaN(this.C) ? 1.0f : this.C, i);
                        break;
                    case '\b':
                        wu31Var.b(Float.isNaN(this.D) ? 0.0f : this.D, i);
                        break;
                    case '\t':
                        wu31Var.b(Float.isNaN(this.E) ? 0.0f : this.E, i);
                        break;
                    case '\n':
                        wu31Var.b(Float.isNaN(this.z) ? 0.0f : this.z, i);
                        break;
                    case 11:
                        wu31Var.b(Float.isNaN(this.y) ? 0.0f : this.y, i);
                        break;
                    case '\f':
                        wu31Var.b(Float.isNaN(this.I) ? 0.0f : this.I, i);
                        break;
                    case '\r':
                        wu31Var.b(Float.isNaN(this.x) ? 1.0f : this.x, i);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.w;
                            if (linkedHashMap.containsKey(str2)) {
                                c7e c7eVar = (c7e) linkedHashMap.get(str2);
                                if (wu31Var instanceof vu31) {
                                    ((vu31) wu31Var).f.append(i, c7eVar);
                                    break;
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + c7eVar.b() + wu31Var);
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
    }

    public final void b(View view) {
        this.c = view.getVisibility();
        this.x = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.y = view.getElevation();
        this.z = view.getRotation();
        this.A = view.getRotationX();
        this.a = view.getRotationY();
        this.B = view.getScaleX();
        this.C = view.getScaleY();
        this.D = view.getPivotX();
        this.E = view.getPivotY();
        this.F = view.getTranslationX();
        this.G = view.getTranslationY();
        this.H = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((ha30) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect rect, e eVar, int i, int i2) {
        rect.width();
        rect.height();
        e.a o = eVar.o(i2);
        e.d dVar = o.c;
        e.c cVar = o.d;
        int i3 = dVar.c;
        this.b = i3;
        int i4 = dVar.b;
        this.c = i4;
        this.x = (i4 == 0 || i3 != 0) ? dVar.d : 0.0f;
        e.C0007e c0007e = o.f;
        boolean z = c0007e.m;
        this.y = c0007e.n;
        this.z = c0007e.b;
        this.A = c0007e.c;
        this.a = c0007e.d;
        this.B = c0007e.e;
        this.C = c0007e.f;
        this.D = c0007e.g;
        this.E = c0007e.h;
        this.F = c0007e.j;
        this.G = c0007e.k;
        this.H = c0007e.l;
        qbn.c(cVar.d);
        this.I = cVar.h;
        this.J = o.c.e;
        for (String str : o.g.keySet()) {
            c7e c7eVar = (c7e) o.g.get(str);
            int ordinal = c7eVar.c.ordinal();
            if (ordinal != 4 && ordinal != 5 && ordinal != 7) {
                this.w.put(str, c7eVar);
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
            float f = this.z + 90.0f;
            this.z = f;
            if (f > 180.0f) {
                this.z = f - 360.0f;
                return;
            }
            return;
        }
        this.z -= 90.0f;
    }
}
