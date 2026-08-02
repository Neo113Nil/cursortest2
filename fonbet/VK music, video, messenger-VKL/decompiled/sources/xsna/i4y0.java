package xsna;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.PathInterpolator;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.graphics.vector.Ordering;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: XmlAnimatorParser.android.kt */
/* loaded from: classes11.dex */
public final class i4y0 {
    public static final ckr0 a = ckr0.Float;

    /* compiled from: XmlAnimatorParser.android.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ckr0.values().length];
            try {
                iArr[ckr0.Float.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ckr0.Int.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ckr0.Color.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ckr0.Path.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Float.valueOf(((ohy) t).a), Float.valueOf(((ohy) t2).a));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final huo a(TypedArray typedArray, Resources resources, Resources.Theme theme, int i, huo huoVar) {
        TypedArray typedArray2;
        huo cr2Var;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return huoVar;
        }
        huo huoVar2 = lr2.e.get(Integer.valueOf(resourceId));
        if (huoVar2 != null) {
            return huoVar2;
        }
        XmlResourceParser xml = resources.getXml(resourceId);
        j4y0.b(xml);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        int[] iArr = d02.i;
        String name = xml.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2140409460:
                    if (name.equals("pathInterpolator")) {
                        int[] iArr2 = d02.n;
                        if (theme == null || (r8 = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0)) == null) {
                            TypedArray obtainAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                        }
                        try {
                            String string = typedArray2.getString(4);
                            if (string != null) {
                                cr2Var = new cr2(new PathInterpolator(rq90.d(string)));
                            } else {
                                if (typedArray2.hasValue(2) && typedArray2.hasValue(3)) {
                                    cr2Var = new nkk(typedArray2.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), typedArray2.getFloat(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), typedArray2.getFloat(2, 1.0f), typedArray2.getFloat(3, 1.0f));
                                }
                                cr2Var = new cr2(new PathInterpolator(typedArray2.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), typedArray2.getFloat(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                            }
                            return cr2Var;
                        } finally {
                        }
                    }
                    break;
                case -2120889007:
                    if (name.equals("anticipateInterpolator")) {
                        if (theme == null || (r6 = theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0)) == null) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(asAttributeSet, iArr);
                        }
                        try {
                            final float f = typedArray2.getFloat(0, 2.0f);
                            return new huo() { // from class: xsna.dr2
                                @Override // xsna.huo
                                public final float a(float f2) {
                                    float f3 = f;
                                    return (((1 + f3) * f2) - f3) * f2 * f2;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case -1248486260:
                    if (name.equals("linearInterpolator")) {
                        return luo.d;
                    }
                    break;
                case -935873468:
                    if (name.equals("accelerateInterpolator")) {
                        int[] iArr3 = d02.j;
                        if (theme == null || (r8 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0)) == null) {
                            TypedArray obtainAttributes3 = resources.obtainAttributes(asAttributeSet, iArr3);
                        }
                        try {
                            final float f2 = typedArray2.getFloat(0, 1.0f);
                            return f2 == 1.0f ? lr2.b : new huo() { // from class: xsna.er2
                                @Override // xsna.huo
                                public final float a(float f3) {
                                    return (float) Math.pow(f3, f2 * 2);
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case -425326737:
                    if (name.equals("bounceInterpolator")) {
                        return lr2.c;
                    }
                    break;
                case 1192587314:
                    if (name.equals("overshootInterpolator")) {
                        int[] iArr4 = d02.m;
                        if (theme == null || (r8 = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0)) == null) {
                            TypedArray obtainAttributes4 = resources.obtainAttributes(asAttributeSet, iArr4);
                        }
                        try {
                            final float f3 = typedArray2.getFloat(0, 2.0f);
                            return new huo() { // from class: xsna.ir2
                                @Override // xsna.huo
                                public final float a(float f4) {
                                    float f5 = f4 - 1.0f;
                                    float f6 = f3;
                                    return ((((f6 + 1.0f) * f5) + f6) * f5 * f5) + 1.0f;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case 1472030440:
                    if (name.equals("anticipateOvershootInterpolator")) {
                        if (theme == null || (typedArray2 = theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0)) == null) {
                            typedArray2 = resources.obtainAttributes(asAttributeSet, iArr);
                        }
                        try {
                            return new cr2(new AnticipateOvershootInterpolator(typedArray2.getFloat(0, 2.0f), typedArray2.getFloat(1, 1.5f)));
                        } finally {
                        }
                    }
                    break;
                case 1962594083:
                    if (name.equals("decelerateInterpolator")) {
                        int[] iArr5 = d02.k;
                        if (theme == null || (r8 = theme.obtainStyledAttributes(asAttributeSet, iArr5, 0, 0)) == null) {
                            TypedArray obtainAttributes5 = resources.obtainAttributes(asAttributeSet, iArr5);
                        }
                        try {
                            final float f4 = typedArray2.getFloat(0, 1.0f);
                            return f4 == 1.0f ? lr2.d : new huo() { // from class: xsna.kr2
                                @Override // xsna.huo
                                public final float a(float f5) {
                                    return 1.0f - ((float) Math.pow(1.0f - f5, 2 * f4));
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case 2019672672:
                    if (name.equals("accelerateDecelerateInterpolator")) {
                        return lr2.a;
                    }
                    break;
                case 2038238413:
                    if (name.equals("cycleInterpolator")) {
                        int[] iArr6 = d02.l;
                        if (theme == null || (r8 = theme.obtainStyledAttributes(asAttributeSet, iArr6, 0, 0)) == null) {
                            TypedArray obtainAttributes6 = resources.obtainAttributes(asAttributeSet, iArr6);
                        }
                        try {
                            final float f5 = typedArray2.getFloat(0, 1.0f);
                            return new huo() { // from class: xsna.jr2
                                @Override // xsna.huo
                                public final float a(float f6) {
                                    return (float) Math.sin(2 * f5 * 3.141592653589793d * f6);
                                }
                            };
                        } finally {
                        }
                    }
                    break;
            }
        }
        throw new RuntimeException("Unknown interpolator: " + xml.getName());
    }

    public static final ohy<Object> b(TypedArray typedArray, float f, huo huoVar, ckr0 ckr0Var, int i) {
        List f2;
        int i2 = a.$EnumSwitchMapping$0[ckr0Var.ordinal()];
        if (i2 == 1) {
            return new ohy<>(f, Float.valueOf(typedArray.getFloat(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), huoVar);
        }
        if (i2 == 2) {
            return new ohy<>(f, Integer.valueOf(typedArray.getInt(i, 0)), huoVar);
        }
        if (i2 == 3) {
            return new ohy<>(f, new l5g(f870.c(typedArray.getColor(i, 0))), huoVar);
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string = typedArray.getString(i);
        if (string == null) {
            f2 = jlr0.a;
        } else {
            EmptyList emptyList = jlr0.a;
            sq90 sq90Var = new sq90(0);
            sq90Var.d(string);
            f2 = sq90Var.f();
        }
        return new ohy<>(f, f2, huoVar);
    }

    public static final n7e0<?> c(TypedArray typedArray, String str, int i, int i2, int i3, huo huoVar, wzs<? super ckr0, ? super List<ohy<Object>>, ? extends ckr0> wzsVar) {
        int i4 = typedArray.getInt(i, 4);
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i5 = peekValue != null ? peekValue.type : 4;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        ckr0 d = d(i4, i5, peekValue2 != null ? peekValue2.type : 4);
        ArrayList arrayList = new ArrayList();
        if (d == null && (z || z2)) {
            d = ckr0.Float;
        }
        if (z) {
            arrayList.add(b(typedArray, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, huoVar, d, i2));
        }
        if (z2) {
            arrayList.add(b(typedArray, 1.0f, huoVar, d, i3));
        }
        ckr0 invoke = wzsVar.invoke(d, arrayList);
        if (arrayList.size() > 1) {
            g5g.L(arrayList, new b());
        }
        int i6 = a.$EnumSwitchMapping$0[invoke.ordinal()];
        if (i6 == 1) {
            return new r7e0(str, arrayList);
        }
        if (i6 == 2) {
            return new s7e0(str);
        }
        if (i6 == 3) {
            return new q7e0(str, arrayList);
        }
        if (i6 == 4) {
            return new u7e0(str, arrayList);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ckr0 d(int i, int... iArr) {
        if (i == 0) {
            return ckr0.Float;
        }
        if (i == 1) {
            return ckr0.Int;
        }
        if (i == 2) {
            return ckr0.Path;
        }
        if (i == 3) {
            return ckr0.Color;
        }
        for (int i2 : iArr) {
            if (28 > i2 || i2 >= 32) {
                return null;
            }
        }
        return ckr0.Color;
    }

    public static final mr2 e(XmlResourceParser xmlResourceParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray obtainAttributes;
        int[] iArr = d02.e;
        if (theme == null || (obtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0)) == null) {
            obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        }
        try {
            int i = obtainAttributes.getInt(0, 0);
            ArrayList arrayList = new ArrayList();
            xmlResourceParser.next();
            while (!j4y0.a(xmlResourceParser) && (xmlResourceParser.getEventType() != 3 || !epx.f(xmlResourceParser.getName(), "set"))) {
                if (xmlResourceParser.getEventType() == 2) {
                    String name = xmlResourceParser.getName();
                    if (epx.f(name, "set")) {
                        arrayList.add(e(xmlResourceParser, resources, theme, attributeSet));
                    } else if (epx.f(name, "objectAnimator")) {
                        arrayList.add(f(xmlResourceParser, resources, theme, attributeSet));
                    }
                }
                xmlResourceParser.next();
            }
            mr2 mr2Var = new mr2(arrayList, i != 0 ? Ordering.Sequentially : Ordering.Together);
            obtainAttributes.recycle();
            return mr2Var;
        } catch (Throwable th) {
            obtainAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:14:0x002e, B:16:0x0042, B:17:0x010b, B:19:0x0122, B:21:0x0129, B:26:0x0126, B:27:0x0069, B:29:0x0070, B:30:0x0081, B:31:0x0086, B:33:0x008c, B:35:0x0092, B:39:0x00a2, B:41:0x00a8, B:43:0x00b4, B:45:0x00b8, B:52:0x00e6, B:54:0x00fb, B:58:0x00f2, B:59:0x00f5, B:63:0x00be), top: B:13:0x002e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0122 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:14:0x002e, B:16:0x0042, B:17:0x010b, B:19:0x0122, B:21:0x0129, B:26:0x0126, B:27:0x0069, B:29:0x0070, B:30:0x0081, B:31:0x0086, B:33:0x008c, B:35:0x0092, B:39:0x00a2, B:41:0x00a8, B:43:0x00b4, B:45:0x00b8, B:52:0x00e6, B:54:0x00fb, B:58:0x00f2, B:59:0x00f5, B:63:0x00be), top: B:13:0x002e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:14:0x002e, B:16:0x0042, B:17:0x010b, B:19:0x0122, B:21:0x0129, B:26:0x0126, B:27:0x0069, B:29:0x0070, B:30:0x0081, B:31:0x0086, B:33:0x008c, B:35:0x0092, B:39:0x00a2, B:41:0x00a8, B:43:0x00b4, B:45:0x00b8, B:52:0x00e6, B:54:0x00fb, B:58:0x00f2, B:59:0x00f5, B:63:0x00be), top: B:13:0x002e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:14:0x002e, B:16:0x0042, B:17:0x010b, B:19:0x0122, B:21:0x0129, B:26:0x0126, B:27:0x0069, B:29:0x0070, B:30:0x0081, B:31:0x0086, B:33:0x008c, B:35:0x0092, B:39:0x00a2, B:41:0x00a8, B:43:0x00b4, B:45:0x00b8, B:52:0x00e6, B:54:0x00fb, B:58:0x00f2, B:59:0x00f5, B:63:0x00be), top: B:13:0x002e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final gp70 f(XmlResourceParser xmlResourceParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray obtainAttributes;
        TypedArray obtainAttributes2;
        String string;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        ArrayList arrayList2;
        int i4;
        int i5;
        huo huoVar;
        int i6;
        TypedArray obtainAttributes3;
        TypedArray typedArray;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        int[] iArr = d02.d;
        byte b2 = 0;
        if (theme2 == null || (obtainAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr, 0, 0)) == null) {
            obtainAttributes = resources2.obtainAttributes(attributeSet2, iArr);
        }
        TypedArray typedArray2 = obtainAttributes;
        try {
            int[] iArr2 = d02.h;
            try {
                if (theme2 != null) {
                    obtainAttributes2 = theme2.obtainStyledAttributes(attributeSet2, iArr2, 0, 0);
                    if (obtainAttributes2 == null) {
                    }
                    typedArray2 = obtainAttributes2;
                    huo a2 = a(typedArray2, resources2, theme2, 0, lr2.a);
                    ArrayList arrayList3 = new ArrayList();
                    int i7 = 1;
                    string = typedArray2.getString(1);
                    int i8 = 3;
                    if (string == null) {
                        String string2 = typedArray2.getString(2);
                        String string3 = typedArray2.getString(3);
                        EmptyList emptyList = jlr0.a;
                        sq90 sq90Var = new sq90(0);
                        sq90Var.d(string);
                        arrayList3.add(new o7e0(string2, string3, sq90Var.f(), a2));
                        arrayList = arrayList3;
                        i = 1;
                        i3 = 3;
                        i2 = 2;
                    } else {
                        int i9 = 2;
                        String string4 = typedArray2.getString(0);
                        if (string4 != null) {
                            arrayList3.add(c(typedArray2, string4, 7, 5, 6, a2, new b06(b2, 10)));
                        }
                        xmlResourceParser.next();
                        while (!j4y0.a(xmlResourceParser) && (xmlResourceParser.getEventType() != i8 || !epx.f(xmlResourceParser.getName(), "objectAnimator"))) {
                            if (xmlResourceParser.getEventType() == i9 && epx.f(xmlResourceParser.getName(), "propertyValuesHolder")) {
                                int[] iArr3 = d02.f;
                                if (theme2 == null || (obtainAttributes3 = theme2.obtainStyledAttributes(attributeSet2, iArr3, 0, 0)) == null) {
                                    obtainAttributes3 = resources2.obtainAttributes(attributeSet2, iArr3);
                                }
                                try {
                                    i4 = i7;
                                    i5 = i9;
                                    huoVar = a2;
                                    i6 = i8;
                                    arrayList2 = arrayList3;
                                    typedArray = obtainAttributes3;
                                    try {
                                        n7e0<?> c = c(typedArray, obtainAttributes3.getString(i8), 2, 0, 1, huoVar, new bix(xmlResourceParser, resources2, theme2, attributeSet2, huoVar, 1));
                                        typedArray.recycle();
                                        arrayList2.add(c);
                                    } catch (Throwable th) {
                                        th = th;
                                        typedArray.recycle();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    typedArray = obtainAttributes3;
                                }
                            } else {
                                arrayList2 = arrayList3;
                                i4 = i7;
                                i5 = i9;
                                huoVar = a2;
                                i6 = i8;
                            }
                            xmlResourceParser.next();
                            resources2 = resources;
                            theme2 = theme;
                            attributeSet2 = attributeSet;
                            arrayList3 = arrayList2;
                            i7 = i4;
                            i8 = i6;
                            a2 = huoVar;
                            i9 = i5;
                        }
                        arrayList = arrayList3;
                        i = i7;
                        i2 = i9;
                        i3 = i8;
                    }
                    gp70 gp70Var = new gp70(typedArray2.getInt(i, 300), typedArray2.getInt(i2, 0), typedArray2.getInt(i3, 0), typedArray2.getInt(4, 0) != i2 ? RepeatMode.Reverse : RepeatMode.Restart, arrayList);
                    typedArray2.recycle();
                    typedArray2.recycle();
                    return gp70Var;
                }
                huo a22 = a(typedArray2, resources2, theme2, 0, lr2.a);
                ArrayList arrayList32 = new ArrayList();
                int i72 = 1;
                string = typedArray2.getString(1);
                int i82 = 3;
                if (string == null) {
                }
                gp70 gp70Var2 = new gp70(typedArray2.getInt(i, 300), typedArray2.getInt(i2, 0), typedArray2.getInt(i3, 0), typedArray2.getInt(4, 0) != i2 ? RepeatMode.Reverse : RepeatMode.Restart, arrayList);
                typedArray2.recycle();
                typedArray2.recycle();
                return gp70Var2;
            } finally {
                typedArray2.recycle();
            }
            obtainAttributes2 = resources2.obtainAttributes(attributeSet2, iArr2);
            typedArray2 = obtainAttributes2;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
