package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.google.android.gms.internal.measurement.a1;
import jason.statham.interpreter.error.a;
import java.io.File;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;

/* loaded from: classes.dex */
public final class o430 implements mh2, zme, lp11, kqq, m131, ca01, e1d, f5b1, nhe, kzk, ams {
    public static volatile cc20 C;
    public final /* synthetic */ int a;
    public static final o430 b = new o430(1);
    public static final o430 c = new o430(2);
    public static final y3h w = new y3h();
    public static final o430 x = new o430(4);
    public static final o430 y = new o430(5);
    public static final o430 z = new o430(7);
    public static final o430 A = new o430(8);
    public static final o430 B = new o430(9);
    public static final /* synthetic */ o430 D = new o430(10);
    public static final vn90 E = new vn90();
    public static final /* synthetic */ o430 F = new o430(11);
    public static final o430 G = new o430(12);
    public static final o430 H = new o430(13);
    public static final /* synthetic */ o430 I = new o430(14);
    public static final o430 J = new o430(15);

    public /* synthetic */ o430(int i) {
        this.a = i;
    }

    public static final float n(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        float f5 = 0.0f;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            f2 = fArr[0];
            f3 = fArr2[0];
            f4 = 0.0f;
        } else {
            float f8 = fArr[i2];
            f2 = fArr[i];
            f5 = fArr2[i2];
            f3 = fArr2[i];
            f4 = f8;
        }
        return ijb1.c(f5, f3, f4, f2, abs) * signum;
    }

    public static void p(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && jl40.l(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            ny61.v(g8e.n(parentFile, "Failed to delete conflicting file: "));
        } else {
            if (parentFile.isDirectory()) {
                return;
            }
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
            } catch (Exception e) {
                dac.g(g8e.n(parentFile, "Failed to create directory: "), e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(yp6 yp6Var, String str) {
        int i;
        String str2;
        String[] strArr = pq6.A;
        yp6Var.e0(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    yp6Var.w0(i2, i, str);
                }
                yp6Var.x0(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                yp6Var.x0(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            yp6Var.w0(i2, length, str);
        }
        yp6Var.e0(34);
    }

    @Override // defpackage.f5b1
    public boolean a(Class cls) {
        return a1.class.isAssignableFrom(cls);
    }

    @Override // defpackage.lp11
    public Typeface b(int i, int i2) {
        if (i == 0) {
            return Typeface.create("sans-serif-regular", i2);
        }
        if (i == 1) {
            return Typeface.create("sans-serif-light", i2);
        }
        if (i == 2) {
            return Typeface.create("sans-serif-thin", i2);
        }
        if (i == 3) {
            return Typeface.create("sans-serif-medium", i2);
        }
        if (i != 5 && i != 6) {
            return Typeface.create("sans-serif-regular", i2);
        }
        return Typeface.create("sans-serif-bold", i2);
    }

    @Override // defpackage.f5b1
    public i7b1 c(Class cls) {
        if (!a1.class.isAssignableFrom(cls)) {
            ny61.g("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (i7b1) a1.n(cls.asSubclass(a1.class)).q(3);
        } catch (Exception e) {
            ny61.n("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        Serializable t;
        switch (this.a) {
            case 25:
                if (injVar.c == 1) {
                    return Boolean.valueOf(ihb1.f(injVar.a[0]));
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"blank\" requires 1 argument but "));
            case 26:
                if (injVar.c != 1) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"load\" requires 1 argument but "));
                }
                Object obj = injVar.a[0];
                System.nanoTime();
                if (!(obj instanceof List)) {
                    throw oyr.y(obj, "Path should be list but actual value is ");
                }
                j5x J2 = bb1.J(jjeVar.c, eja1.q((List) obj));
                return (J2 == null || (t = vez0.t(J2)) == null) ? seu.E : t;
            case 27:
                if (injVar.c != 1) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"distinct\" requires 1 argument but "));
                }
                Object obj2 = injVar.a[0];
                if (!ym11.g(obj2)) {
                    throw a.a("Function \"distinct\" is not defined for ".concat(rhb1.e(obj2)));
                }
                List I2 = kotlin.collections.a.I(ym11.b(obj2));
                List list = (List) obj2;
                list.clear();
                list.addAll(I2);
                return obj2;
            case 28:
                if (injVar.c == 1) {
                    return nrb1.h(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"list\" requires 1 argument but "));
            default:
                if (injVar.c != 2) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"min\" requires 2 argument but "));
                }
                Object[] objArr = injVar.a;
                return bjb1.h(objArr[0], objArr[1]);
        }
    }

    @Override // defpackage.kqq
    public void e(sls slsVar) {
    }

    @Override // defpackage.kqq
    public void f(sls slsVar) {
    }

    @Override // defpackage.mh2
    public void g(View view, gtg gtgVar, gtg gtgVar2, long j) {
        view.setTranslationY(view.getHeight());
        int i = 1;
        cma1.h(0.0f, view).setDuration(j).setListener(new AnimUtils$AnimationStartEndListener(new hh2(gtgVar, i), new ih2(gtgVar2, i)));
    }

    @Override // defpackage.ca01
    public void h(String str) {
    }

    @Override // defpackage.nhe
    public long j(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i = blm0.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.e1d
    public Object k(yuf0 yuf0Var) {
        return new am91((qk20) yuf0Var.a(qk20.class));
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        return obj.toString();
    }

    @Override // defpackage.mh2
    public void m(View view, gtg gtgVar, gtg gtgVar2, long j) {
        int i = 1;
        cma1.h(view.getHeight(), view).setDuration(j).setListener(new AnimUtils$AnimationStartEndListener(new fh2(gtgVar, i), new gh2(gtgVar2, i)));
    }

    public cc20 o(Context context) {
        cc20 cc20Var;
        cc20 cc20Var2 = C;
        if (cc20Var2 != null) {
            return cc20Var2;
        }
        synchronized (this) {
            cc20Var = C;
            if (cc20Var == null) {
                cc20Var = new cc20(context);
                C = cc20Var;
            }
        }
        return cc20Var;
    }

    public String toString() {
        switch (this.a) {
            case 19:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.m131
    public Object x(com.airbnb.lottie.parser.moshi.a aVar, float f) {
        boolean z2 = aVar.k() == JsonReader$Token.BEGIN_ARRAY;
        if (z2) {
            aVar.a();
        }
        float nextDouble = (float) aVar.nextDouble();
        float nextDouble2 = (float) aVar.nextDouble();
        while (aVar.hasNext()) {
            aVar.skipValue();
        }
        if (z2) {
            aVar.d();
        }
        return new dlm0((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
