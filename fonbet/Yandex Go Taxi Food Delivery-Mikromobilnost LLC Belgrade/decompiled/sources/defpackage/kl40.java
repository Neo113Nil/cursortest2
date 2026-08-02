package defpackage;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.view.View;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto$Value$ValueCase;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.i;
import com.yandex.plus.plaquesdk.plaque.api.models.display.MicroWidgetDrawableFactory$createSolidColorShader$1;
import defpackage.be20;
import defpackage.de20;
import defpackage.kl40;
import defpackage.qe20;
import defpackage.tcc;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import kotlin.NotImplementedError;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;

/* loaded from: classes.dex */
public class kl40 implements mh2, zme, t3c, m131, btq0, e1d, pa01, ese, nhe, x8r0, mzk, ams {
    public static final kbs B;
    public static final kl40 C;
    public final /* synthetic */ int a;
    public static final kl40 b = new kl40(1);
    public static final kl40 c = new kl40(2);
    public static final kl40 w = new kl40(3);
    public static final kl40 x = new kl40(4);
    public static final kl40 y = new kl40(5);
    public static final kl40 z = new kl40(6);
    public static final kbs A = new kbs(7);
    public static final kl40 D = new kl40(10);
    public static final kl40 E = new kl40(11);
    public static final kl40 F = new kl40(12);
    public static final kl40 G = new kl40(13);
    public static final /* synthetic */ kl40 H = new kl40(14);

    static {
        int i = 8;
        B = new kbs(i);
        C = new kl40(i);
    }

    public kl40(Set set) {
        this.a = 0;
        new HashMap();
        new HashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            b64.D(it.next());
            throw null;
        }
    }

    public static final float f(float f, float f2) {
        if (f > 0.0f || f2 > 0.0f) {
            return (float) Math.sqrt(f + f2);
        }
        return 0.0f;
    }

    public static ShapeDrawable.ShaderFactory n(final be20 be20Var) {
        if (((ArrayList) be20Var.a()).isEmpty()) {
            return null;
        }
        return ((ArrayList) be20Var.a()).size() == 1 ? new MicroWidgetDrawableFactory$createSolidColorShader$1(new he20(((qe20) a.P(be20Var.a())).a())) : new ShapeDrawable.ShaderFactory() { // from class: com.yandex.plus.plaquesdk.plaque.api.models.display.MicroWidgetDrawableFactory$createLinearShader$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                float f = width;
                float f2 = height;
                be20 be20Var2 = be20.this;
                PointF pointF = be20Var2.c;
                float f3 = pointF.x;
                PointF pointF2 = be20Var2.b;
                float f4 = pointF2.x;
                float f5 = (f3 - f4) * f;
                float f6 = pointF.y;
                float f7 = pointF2.y;
                float f8 = (f6 - f7) * f2;
                RectF rectF = new RectF(0.0f, (f7 * f2) - (f5 == 0.0f ? 0.0f : ((f4 * f) * f8) / f5), f, (f6 * f2) + (f5 == 0.0f ? 0.0f : (f8 * ((1.0f - f3) * f)) / f5));
                float f9 = rectF.left;
                float f10 = rectF.top;
                float f11 = rectF.right;
                float f12 = rectF.bottom;
                ArrayList arrayList = be20.this.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((qe20) it.next()).a));
                }
                int[] I0 = a.I0(arrayList2);
                ArrayList arrayList3 = be20.this.a;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Float.valueOf(((qe20) it2.next()).b));
                }
                return new LinearGradient(f9, f10, f11, f12, I0, a.G0(arrayList4), Shader.TileMode.CLAMP);
            }
        };
    }

    public static ShapeDrawable.ShaderFactory o(final de20 de20Var) {
        if (((ArrayList) de20Var.a()).isEmpty()) {
            return null;
        }
        return ((ArrayList) de20Var.a()).size() == 1 ? new MicroWidgetDrawableFactory$createSolidColorShader$1(new he20(((qe20) a.P(de20Var.a())).a())) : new ShapeDrawable.ShaderFactory() { // from class: com.yandex.plus.plaquesdk.plaque.api.models.display.MicroWidgetDrawableFactory$createRadialShader$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                float f = width;
                PointF pointF = de20.this.b;
                float f2 = f * pointF.x;
                float f3 = height;
                float f4 = f3 * pointF.y;
                float f5 = f2 - 0.0f;
                float f6 = f5 * f5;
                float f7 = f4 - 0.0f;
                float f8 = f7 * f7;
                float f9 = f2 - f;
                float f10 = f9 * f9;
                float f11 = f4 - f3;
                float f12 = f11 * f11;
                int i = 1;
                float[] fArr = {kl40.f(f6, f8), kl40.f(f6, f12), kl40.f(f10, f8), kl40.f(f10, f12)};
                float f13 = fArr[0];
                while (true) {
                    f13 = Math.max(f13, fArr[i]);
                    if (i == 3) {
                        break;
                    }
                    i++;
                }
                Float valueOf = Float.valueOf(f13);
                if ((valueOf.floatValue() > 0.0f ? valueOf : null) == null) {
                    qe20 qe20Var = (qe20) a.R(de20.this.a);
                    int i2 = qe20Var != null ? qe20Var.a : 0;
                    return new LinearGradient(0.0f, 0.0f, f, f3, new int[]{i2, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                de20 de20Var2 = de20.this;
                float floatValue = valueOf.floatValue();
                ArrayList arrayList = de20Var2.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((qe20) it.next()).a));
                }
                int[] I0 = a.I0(arrayList2);
                ArrayList arrayList3 = de20Var2.a;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Float.valueOf(((qe20) it2.next()).b));
                }
                return new RadialGradient(f2, f4, floatValue, I0, a.G0(arrayList4), Shader.TileMode.CLAMP);
            }
        };
    }

    public static m6r0 p(t2x0 t2x0Var) {
        return new m6r0(System.currentTimeMillis() + 3600000, new hgz(8), new i6r0(true, false, false), 10.0d, 1.2d, 60);
    }

    public static float q(Context context, oe20 oe20Var, int i) {
        if (oe20Var instanceof le20) {
            Number b2 = ((le20) oe20Var).a.b(context.getResources().getDisplayMetrics());
            b2.intValue();
            b2.longValue();
            return Float.valueOf(b2.floatValue()).floatValue();
        }
        if (oe20Var.equals(me20.a)) {
            return i / 2.0f;
        }
        w511.b();
        return 0.0f;
    }

    public static void r(ArrayList arrayList, tls tlsVar) {
        NotImplementedError notImplementedError = new NotImplementedError("Please implement DivPlayerPreloader.preloadVideo(src, callback)!");
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new kg21((Uri) it.next(), notImplementedError));
        }
        tlsVar.invoke(arrayList2);
    }

    @Override // defpackage.btq0
    public Object a() {
        return kp50.i();
    }

    @Override // defpackage.btq0
    public Object b(FileInputStream fileInputStream, Continuation continuation) {
        byte[] bArr;
        try {
            wme0 s = wme0.s(fileInputStream);
            ez40 ez40Var = new ez40(false, 1);
            lme0[] lme0VarArr = (lme0[]) Arrays.copyOf(new lme0[0], 0);
            ez40Var.d();
            if (lme0VarArr.length > 0) {
                lme0 lme0Var = lme0VarArr[0];
                throw null;
            }
            for (Map.Entry entry : s.q().entrySet()) {
                String str = (String) entry.getKey();
                ane0 ane0Var = (ane0) entry.getValue();
                PreferencesProto$Value$ValueCase G2 = ane0Var.G();
                switch (G2 == null ? -1 : nme0.a[G2.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        w511.b();
                        return null;
                    case 1:
                        ez40Var.g(new kme0(str), Boolean.valueOf(ane0Var.x()));
                        break;
                    case 2:
                        ez40Var.g(new kme0(str), Float.valueOf(ane0Var.B()));
                        break;
                    case 3:
                        ez40Var.g(new kme0(str), Double.valueOf(ane0Var.A()));
                        break;
                    case 4:
                        ez40Var.g(new kme0(str), Integer.valueOf(ane0Var.C()));
                        break;
                    case 5:
                        ez40Var.g(new kme0(str), Long.valueOf(ane0Var.D()));
                        break;
                    case 6:
                        ez40Var.g(new kme0(str), ane0Var.E());
                        break;
                    case 7:
                        ez40Var.g(new kme0(str), a.N0(ane0Var.F().r()));
                        break;
                    case 8:
                        kme0 kme0Var = new kme0(str);
                        ByteString y2 = ane0Var.y();
                        int size = y2.size();
                        if (size == 0) {
                            bArr = tqw.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            y2.g(size, bArr2);
                            bArr = bArr2;
                        }
                        ez40Var.g(kme0Var, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new ez40(new LinkedHashMap(ez40Var.a()), true);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    @Override // defpackage.btq0
    public Object c(Object obj, mx11 mx11Var, Continuation continuation) {
        GeneratedMessageLite c2;
        Map a = ((mme0) obj).a();
        ume0 r = wme0.r();
        for (Map.Entry entry : a.entrySet()) {
            kme0 kme0Var = (kme0) entry.getKey();
            Object value = entry.getValue();
            String str = kme0Var.a;
            if (value instanceof Boolean) {
                zme0 H2 = ane0.H();
                boolean booleanValue = ((Boolean) value).booleanValue();
                H2.e();
                ane0.u((ane0) H2.b, booleanValue);
                c2 = H2.c();
            } else if (value instanceof Float) {
                zme0 H3 = ane0.H();
                float floatValue = ((Number) value).floatValue();
                H3.e();
                ane0.v((ane0) H3.b, floatValue);
                c2 = H3.c();
            } else if (value instanceof Double) {
                zme0 H4 = ane0.H();
                double doubleValue = ((Number) value).doubleValue();
                H4.e();
                ane0.r((ane0) H4.b, doubleValue);
                c2 = H4.c();
            } else if (value instanceof Integer) {
                zme0 H5 = ane0.H();
                int intValue = ((Number) value).intValue();
                H5.e();
                ane0.w((ane0) H5.b, intValue);
                c2 = H5.c();
            } else if (value instanceof Long) {
                zme0 H6 = ane0.H();
                long longValue = ((Number) value).longValue();
                H6.e();
                ane0.o((ane0) H6.b, longValue);
                c2 = H6.c();
            } else if (value instanceof String) {
                zme0 H7 = ane0.H();
                H7.e();
                ane0.p((ane0) H7.b, (String) value);
                c2 = H7.c();
            } else if (value instanceof Set) {
                zme0 H8 = ane0.H();
                xme0 s = yme0.s();
                s.e();
                yme0.p((yme0) s.b, (Set) value);
                H8.e();
                ane0.q((ane0) H8.b, (yme0) s.c());
                c2 = H8.c();
            } else {
                if (!(value instanceof byte[])) {
                    ny61.r(qv10.n(value, "PreferencesSerializer does not support type: "));
                    return null;
                }
                zme0 H9 = ane0.H();
                byte[] bArr = (byte[]) value;
                ByteString f = ByteString.f(0, bArr.length, bArr);
                H9.e();
                ane0.s((ane0) H9.b, f);
                c2 = H9.c();
            }
            r.getClass();
            str.getClass();
            r.e();
            wme0.p((wme0) r.b).put(str, (ane0) c2);
        }
        wme0 wme0Var = (wme0) r.c();
        int c3 = wme0Var.c(null);
        Logger logger = i.b;
        if (c3 > 4096) {
            c3 = 4096;
        }
        h hVar = new h(mx11Var, c3);
        wme0Var.n(hVar);
        if (hVar.f > 0) {
            hVar.I();
        }
        return zy11.a;
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        boolean contains;
        switch (this.a) {
            case 25:
                if (injVar.c == 1) {
                    return ihb1.q(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"upper\" requires 1 argument but "));
            case 26:
                if (injVar.c != 1) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"delete\" requires 1 argument but "));
                }
                Object obj = injVar.a[0];
                System.nanoTime();
                if (!(obj instanceof List)) {
                    throw oyr.y(obj, "Path should be list but actual value is ");
                }
                jjeVar.c = jason.statham.tools.a.g(jjeVar.c, eja1.q((List) obj));
                System.nanoTime();
                return seu.E;
            case 27:
                if (injVar.c == 1) {
                    return Boolean.valueOf(nrb1.c(injVar.a[0]));
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"bool\" requires 1 argument but "));
            case 28:
                if (injVar.c == 1) {
                    return nrb1.d(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"dict\" requires 1 argument but "));
            default:
                if (injVar.c != 2) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"contains\" requires 2 argument but "));
                }
                Object[] objArr = injVar.a;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                if (obj2 instanceof String) {
                    if (obj3 instanceof String) {
                        contains = evu0.y((CharSequence) obj2, (CharSequence) obj3, false);
                        return Boolean.valueOf(contains);
                    }
                    throw jason.statham.interpreter.error.a.a("Function \"contains\" is not defined for " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
                }
                if (obj2 instanceof Map) {
                    if (obj3 instanceof String) {
                        contains = ((Map) obj2).containsKey(obj3);
                        return Boolean.valueOf(contains);
                    }
                    throw jason.statham.interpreter.error.a.a("Function \"contains\" is not defined for " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
                }
                if (obj2 instanceof List) {
                    contains = ((List) obj2).contains(obj3);
                    return Boolean.valueOf(contains);
                }
                throw jason.statham.interpreter.error.a.a("Function \"contains\" is not defined for " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
        }
    }

    @Override // defpackage.x8r0
    public m6r0 e(t2x0 t2x0Var, JSONObject jSONObject) {
        return p(t2x0Var);
    }

    @Override // defpackage.mh2
    public void g(View view, gtg gtgVar, gtg gtgVar2, long j) {
        int i = 0;
        view.animate().setDuration(j).setListener(new AnimUtils$AnimationStartEndListener(new jh2(gtgVar, i), new kh2(gtgVar2, i))).start();
    }

    public List h(Executor executor) {
        return Collections.singletonList(new r7h(executor));
    }

    public List i() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.nhe
    public long j(long j, long j2) {
        float c2 = iqb1.c(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(c2) << 32) | (Float.floatToRawIntBits(c2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i = blm0.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.e1d
    public Object k(yuf0 yuf0Var) {
        return new rc91((am91) yuf0Var.a(am91.class), (alo) yuf0Var.a(alo.class));
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        ((rvj0) obj).close();
        return zy11.a;
    }

    @Override // defpackage.mh2
    public void m(View view, gtg gtgVar, gtg gtgVar2, long j) {
        int i = 2;
        view.animate().setDuration(j).setListener(new AnimUtils$AnimationStartEndListener(new fh2(gtgVar, i), new gh2(gtgVar2, i))).start();
    }

    public String toString() {
        switch (this.a) {
            case 19:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.m131
    public Object x(com.airbnb.lottie.parser.moshi.a aVar, float f) {
        switch (this.a) {
            case 6:
                return Float.valueOf(yex.d(aVar) * f);
            default:
                return yex.b(aVar, f);
        }
    }

    public /* synthetic */ kl40(int i) {
        this.a = i;
    }
}
