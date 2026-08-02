package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class dac implements r5m, i1d, ww01, e1d, r131, sty {
    public final /* synthetic */ int a;

    public /* synthetic */ dac(int i) {
        this.a = i;
    }

    public static /* synthetic */ void d(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalArgumentException((str + i).toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void g(String str, Throwable th) {
        throw new IOException(str, th);
    }

    @Override // defpackage.r5m
    public double a(double d) {
        switch (this.a) {
            case 1:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 2:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 3:
                float[] fArr = wgc.a;
                return wgc.b(wgc.c, d);
            case 4:
                float[] fArr2 = wgc.a;
                return wgc.a(wgc.c, d);
            case 5:
                float[] fArr3 = wgc.a;
                return wgc.d(wgc.d, d);
            default:
                float[] fArr4 = wgc.a;
                return wgc.c(wgc.d, d);
        }
    }

    @Override // defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        xpg.b.getClass();
        return e3f.a.k((c3f) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // defpackage.sty
    public boolean b(List list) {
        switch (this.a) {
            case 17:
                if (list.size() >= 1) {
                    break;
                }
                break;
            default:
                if (list.size() >= 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.i1d
    public List c(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.e1d
    public Object k(yuf0 yuf0Var) {
        Set g = yuf0Var.g(jgg0.a(d74.class));
        vit vitVar = vit.c;
        if (vitVar == null) {
            synchronized (vit.class) {
                try {
                    vitVar = vit.c;
                    if (vitVar == null) {
                        vitVar = new vit();
                        vit.c = vitVar;
                    }
                } finally {
                }
            }
        }
        return new gnh(g, vitVar);
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        switch (this.a) {
            case 15:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 16:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 17:
            case 25:
            default:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 18:
                if (((Double) obj).doubleValue() > 0.0d) {
                    break;
                }
                break;
            case 19:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 20:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue >= 0.0d && doubleValue <= 1.0d) {
                    break;
                }
                break;
            case 21:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 22:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 23:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 24:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 26:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 27:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 28:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
        }
        return true;
    }
}
