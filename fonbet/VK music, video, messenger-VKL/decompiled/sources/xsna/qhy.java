package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import ru.ok.android.utils.Logger;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: KeyframeParser.java */
/* loaded from: classes12.dex */
public final class qhy {
    public static wik0<WeakReference<Interpolator>> b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final JsonReader.a c = JsonReader.a.a("t", UcumUtils.UCUM_SECONDS, Logger.METHOD_E, "o", "i", "h", "to", "ti");
    public static final JsonReader.a d = JsonReader.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> g;
        Interpolator pathInterpolator;
        pointF.x = ls20.b(pointF.x, -1.0f, 1.0f);
        pointF.y = ls20.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = ls20.b(pointF2.x, -1.0f, 1.0f);
        float b2 = ls20.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = b3r0.a;
        int i = f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (IronSourceError.ERROR_NON_EXISTENT_INSTANCE * f) : 17;
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f3);
        }
        if (b2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * b2);
        }
        AsyncUpdates asyncUpdates = tky.a;
        synchronized (qhy.class) {
            if (b == null) {
                b = new wik0<>();
            }
            g = b.g(i);
        }
        Interpolator interpolator = g != null ? g.get() : null;
        if (g != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF2.y) : new LinearInterpolator();
        }
        AsyncUpdates asyncUpdates2 = tky.a;
        try {
            WeakReference<Interpolator> weakReference = new WeakReference<>(pathInterpolator);
            synchronized (qhy.class) {
                b.h(i, weakReference);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.animation.Interpolator] */
    public static <T> nhy<T> b(JsonReader jsonReader, i700 i700Var, float f, zjr0<T> zjr0Var, boolean z, boolean z2) throws IOException {
        T t;
        LinearInterpolator a2;
        Interpolator a3;
        Interpolator a4;
        T t2;
        JsonReader.a aVar;
        LinearInterpolator linearInterpolator;
        JsonReader.a aVar2;
        PointF pointF;
        float f2;
        JsonReader.a aVar3 = c;
        LinearInterpolator linearInterpolator2 = a;
        if (!z || !z2) {
            JsonReader.a aVar4 = aVar3;
            if (!z) {
                return new nhy<>(zjr0Var.b(jsonReader, f));
            }
            jsonReader.beginObject();
            PointF pointF2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            boolean z3 = false;
            T t3 = null;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            T t4 = null;
            while (jsonReader.hasNext()) {
                JsonReader.a aVar5 = aVar4;
                switch (jsonReader.s(aVar5)) {
                    case 0:
                        aVar4 = aVar5;
                        f3 = (float) jsonReader.n();
                        continue;
                    case 1:
                        t3 = zjr0Var.b(jsonReader, f);
                        break;
                    case 2:
                        t4 = zjr0Var.b(jsonReader, f);
                        break;
                    case 3:
                        pointF5 = mby.b(jsonReader, 1.0f);
                        break;
                    case 4:
                        pointF2 = mby.b(jsonReader, 1.0f);
                        break;
                    case 5:
                        if (jsonReader.o() != 1) {
                            z3 = false;
                            break;
                        } else {
                            z3 = true;
                            break;
                        }
                    case 6:
                        pointF3 = mby.b(jsonReader, f);
                        break;
                    case 7:
                        pointF4 = mby.b(jsonReader, f);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
                aVar4 = aVar5;
            }
            jsonReader.endObject();
            if (z3) {
                t = t3;
            } else {
                if (pointF5 != null && pointF2 != null) {
                    a2 = a(pointF5, pointF2);
                    t = t4;
                    nhy<T> nhyVar = new nhy<>(i700Var, t3, t, a2, f3, (Float) null);
                    nhyVar.o = pointF3;
                    nhyVar.p = pointF4;
                    return nhyVar;
                }
                t = t4;
            }
            a2 = linearInterpolator2;
            nhy<T> nhyVar2 = new nhy<>(i700Var, t3, t, a2, f3, (Float) null);
            nhyVar2.o = pointF3;
            nhyVar2.p = pointF4;
            return nhyVar2;
        }
        jsonReader.beginObject();
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        boolean z4 = false;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        T t5 = null;
        PointF pointF12 = null;
        PointF pointF13 = null;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        T t6 = null;
        while (jsonReader.hasNext()) {
            int s = jsonReader.s(aVar3);
            JsonReader.a aVar6 = d;
            switch (s) {
                case 0:
                    aVar = aVar3;
                    linearInterpolator = linearInterpolator2;
                    f4 = (float) jsonReader.n();
                    break;
                case 1:
                    t5 = zjr0Var.b(jsonReader, f);
                    continue;
                case 2:
                    t6 = zjr0Var.b(jsonReader, f);
                    continue;
                case 3:
                    JsonReader.a aVar7 = aVar3;
                    PointF pointF14 = pointF7;
                    LinearInterpolator linearInterpolator3 = linearInterpolator2;
                    boolean z5 = z4;
                    T t7 = t5;
                    if (jsonReader.q() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            int s2 = jsonReader.s(aVar6);
                            if (s2 == 0) {
                                JsonReader.Token q = jsonReader.q();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (q == token) {
                                    f7 = (float) jsonReader.n();
                                    f5 = f7;
                                } else {
                                    jsonReader.beginArray();
                                    f5 = (float) jsonReader.n();
                                    f7 = jsonReader.q() == token ? (float) jsonReader.n() : f5;
                                    jsonReader.endArray();
                                }
                            } else if (s2 != 1) {
                                jsonReader.skipValue();
                            } else {
                                JsonReader.Token q2 = jsonReader.q();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (q2 == token2) {
                                    f8 = (float) jsonReader.n();
                                    f6 = f8;
                                } else {
                                    jsonReader.beginArray();
                                    f6 = (float) jsonReader.n();
                                    f8 = jsonReader.q() == token2 ? (float) jsonReader.n() : f6;
                                    jsonReader.endArray();
                                }
                            }
                        }
                        pointF11 = new PointF(f5, f6);
                        pointF12 = new PointF(f7, f8);
                        jsonReader.endObject();
                    } else {
                        pointF9 = mby.b(jsonReader, f);
                    }
                    z4 = z5;
                    t5 = t7;
                    linearInterpolator2 = linearInterpolator3;
                    aVar3 = aVar7;
                    pointF7 = pointF14;
                    continue;
                case 4:
                    linearInterpolator = linearInterpolator2;
                    boolean z6 = z4;
                    if (jsonReader.q() != JsonReader.Token.BEGIN_OBJECT) {
                        pointF10 = mby.b(jsonReader, f);
                        z4 = z6;
                        linearInterpolator2 = linearInterpolator;
                        break;
                    } else {
                        jsonReader.beginObject();
                        float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            T t8 = t5;
                            int s3 = jsonReader.s(aVar6);
                            if (s3 != 0) {
                                aVar2 = aVar3;
                                if (s3 != 1) {
                                    jsonReader.skipValue();
                                    t5 = t8;
                                    aVar3 = aVar2;
                                } else {
                                    JsonReader.Token q3 = jsonReader.q();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (q3 == token3) {
                                        pointF = pointF7;
                                        f12 = (float) jsonReader.n();
                                        t5 = t8;
                                        pointF8 = pointF8;
                                        f10 = f12;
                                    } else {
                                        pointF = pointF7;
                                        PointF pointF15 = pointF8;
                                        jsonReader.beginArray();
                                        float n = (float) jsonReader.n();
                                        if (jsonReader.q() == token3) {
                                            f10 = n;
                                            f12 = (float) jsonReader.n();
                                        } else {
                                            f10 = n;
                                            f12 = f10;
                                        }
                                        jsonReader.endArray();
                                        t5 = t8;
                                        pointF8 = pointF15;
                                    }
                                }
                            } else {
                                aVar2 = aVar3;
                                pointF = pointF7;
                                PointF pointF16 = pointF8;
                                JsonReader.Token q4 = jsonReader.q();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (q4 == token4) {
                                    f11 = (float) jsonReader.n();
                                    t5 = t8;
                                    pointF8 = pointF16;
                                    f9 = f11;
                                } else {
                                    jsonReader.beginArray();
                                    pointF8 = pointF16;
                                    float n2 = (float) jsonReader.n();
                                    if (jsonReader.q() == token4) {
                                        f2 = n2;
                                        f11 = (float) jsonReader.n();
                                    } else {
                                        f2 = n2;
                                        f11 = f2;
                                    }
                                    jsonReader.endArray();
                                    t5 = t8;
                                    f9 = f2;
                                }
                            }
                            aVar3 = aVar2;
                            pointF7 = pointF;
                        }
                        aVar = aVar3;
                        PointF pointF17 = new PointF(f9, f10);
                        pointF6 = new PointF(f11, f12);
                        jsonReader.endObject();
                        z4 = z6;
                        pointF13 = pointF17;
                        break;
                    }
                case 5:
                    if (jsonReader.o() == 1) {
                        z4 = true;
                        break;
                    } else {
                        z4 = false;
                        continue;
                    }
                case 6:
                    pointF7 = mby.b(jsonReader, f);
                    continue;
                case 7:
                    pointF8 = mby.b(jsonReader, f);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            linearInterpolator2 = linearInterpolator;
            aVar3 = aVar;
        }
        PointF pointF18 = pointF7;
        LinearInterpolator linearInterpolator4 = linearInterpolator2;
        boolean z7 = z4;
        T t9 = t5;
        jsonReader.endObject();
        if (z7) {
            t2 = t9;
        } else {
            if (pointF9 != null && pointF10 != null) {
                linearInterpolator4 = a(pointF9, pointF10);
            } else if (pointF11 != null && pointF12 != null && pointF13 != null && pointF6 != null) {
                a3 = a(pointF11, pointF13);
                a4 = a(pointF12, pointF6);
                t2 = t6;
                linearInterpolator4 = null;
                nhy<T> nhyVar3 = (a3 != null || a4 == null) ? new nhy<>(i700Var, t9, t2, linearInterpolator4, f4, (Float) null) : new nhy<>(i700Var, t9, t2, a3, a4, f4);
                nhyVar3.o = pointF18;
                nhyVar3.p = pointF8;
                return nhyVar3;
            }
            t2 = t6;
        }
        a3 = null;
        a4 = null;
        if (a3 != null) {
        }
        nhyVar3.o = pointF18;
        nhyVar3.p = pointF8;
        return nhyVar3;
    }
}
