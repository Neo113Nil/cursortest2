package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.google.android.gms.internal.play_billing.p;
import com.yandex.div.evaluable.TokenizingException;
import com.yandex.go.blur.core.BlurEffect$CoordinatesType;
import com.yandex.go.blur.core.BlurEffect$Progressive$Easing;
import com.yandex.go.blur.core.BlurEffect$Progressive$TileMode;
import flex.core.loader.network.e;
import jason.statham.interpreter.error.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$C2CStub;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$MarketStub;
import ru.yandex.taxi.logistics.sdk.ui.theme.fonts.DeliveryTypeface;
import ru.yandex.taxi.logistics.sdk.ui.theme.fonts.Style;
import ru.yandex.taxi.widget.b;

/* loaded from: classes8.dex */
public final class ngd0 implements m131, x5o, hgv, ese, m8j0, e3t0, uca1, r77, nhe, yre, o0m, ams {
    public static volatile kjz z;
    public final /* synthetic */ int a;
    public static final vx b = new vx();
    public static final ngd0 c = new ngd0(3);
    public static final ngd0 w = new ngd0(4);
    public static final e5l x = new e5l();
    public static final ngd0 y = new ngd0(6);
    public static final ngd0 A = new ngd0(8);
    public static final String[] B = {"'", "@{"};
    public static final /* synthetic */ ngd0 C = new ngd0(10);
    public static final ngd0 D = new ngd0(11);
    public static final ngd0 E = new ngd0(12);
    public static final ngd0 F = new ngd0(13);
    public static final /* synthetic */ ngd0 G = new ngd0(14);
    public static final ngd0 H = new ngd0(15);

    public /* synthetic */ ngd0(int i) {
        this.a = i;
    }

    public static final gtb h(ngd0 ngd0Var, String str) {
        gtb gtbVar = new gtb(str);
        gtb.d.put(str, gtbVar);
        return gtbVar;
    }

    public static final boolean k(ArrayList arrayList) {
        long I = vng.I();
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (I > ((isi) it.next()).getTimestamp() + 86400000) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static void l(Collection collection, isi isiVar, Long l) {
        Object obj;
        long longValue;
        Object copy$default;
        Collection collection2 = collection;
        tls v = v(isiVar);
        Iterator it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Boolean) v.invoke(obj)).booleanValue()) {
                    break;
                }
            }
        }
        isi isiVar2 = (isi) obj;
        if (l != null) {
            longValue = l.longValue();
        } else {
            Long valueOf = isiVar2 != null ? Long.valueOf(isiVar2.getTimestamp()) : null;
            longValue = valueOf != null ? valueOf.longValue() : isiVar.getTimestamp();
        }
        long j = longValue;
        if (isiVar instanceof DeliveryStub$C2CStub) {
            copy$default = DeliveryStub$C2CStub.copy$default((DeliveryStub$C2CStub) isiVar, null, null, 0, j, 7, null);
        } else {
            if (!(isiVar instanceof DeliveryStub$MarketStub)) {
                w511.b();
                return;
            }
            copy$default = DeliveryStub$MarketStub.copy$default((DeliveryStub$MarketStub) isiVar, null, j, 1, null);
        }
        ycc.v(collection2, v(isiVar), true);
        collection.add(copy$default);
    }

    public static kvo m(Object obj) {
        if (!(obj instanceof String)) {
            return new kvo(obj);
        }
        return new lvo(eg90.a, (String) obj);
    }

    public static b n(TextView textView, AttributeSet attributeSet, int i) {
        b bVar = new b(textView);
        boolean z2 = true;
        boolean z3 = false;
        if (attributeSet != null) {
            Context context = textView.getContext();
            int i2 = (int) bVar.f;
            float f = bVar.h;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.AutofitTextView, i, 0);
            z2 = obtainStyledAttributes.getBoolean(c4i0.AutofitTextView_sizeToFit, true);
            boolean z4 = obtainStyledAttributes.getBoolean(c4i0.AutofitTextView_heightToFit, false);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(c4i0.AutofitTextView_minTextSize, i2);
            float f2 = obtainStyledAttributes.getFloat(c4i0.AutofitTextView_precision, f);
            obtainStyledAttributes.recycle();
            bVar.d(dimensionPixelSize, 0);
            if (bVar.h != f2) {
                bVar.h = f2;
                bVar.a();
            }
            z3 = z4;
        }
        bVar.c(z3);
        bVar.b(z2);
        return bVar;
    }

    public static float q(CharSequence charSequence, TextPaint textPaint, float f, int i, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int i2;
        CharSequence charSequence2;
        float f5;
        float f6 = (f2 + f3) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f6, displayMetrics));
        if (i != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            i2 = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            i2 = 1;
        }
        StaticLayout staticLayout2 = staticLayout;
        if (i2 <= i) {
            if (i2 < i) {
                return q(charSequence, textPaint, f, i, f6, f3, f4, displayMetrics);
            }
            if (i == 1) {
                charSequence2 = charSequence;
                f5 = textPaint.measureText(charSequence2, 0, charSequence.length());
            } else {
                charSequence2 = charSequence;
                f5 = 0.0f;
                if (staticLayout2 != null) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (staticLayout2.getLineWidth(i3) > f5) {
                            f5 = staticLayout2.getLineWidth(i3);
                        }
                    }
                }
            }
            float f7 = f5;
            if (f3 - f2 >= f4) {
                return f7 > f ? q(charSequence2, textPaint, f, i, f2, f6, f4, displayMetrics) : f7 < f ? q(charSequence, textPaint, f, i, f6, f3, f4, displayMetrics) : f6;
            }
        } else if (f3 - f2 >= f4) {
            return q(charSequence, textPaint, f, i, f2, f6, f4, displayMetrics);
        }
        return f2;
    }

    public static qgd0 r(tls tlsVar) {
        ogd0 ogd0Var = (ogd0) tlsVar.invoke(new ogd0());
        v7d0 v7d0Var = ogd0Var.a;
        add0 add0Var = v7d0Var instanceof add0 ? (add0) v7d0Var : null;
        if (add0Var == null) {
            ny61.r("External plusPay instance must implements PlusPayInternal interface!");
            return null;
        }
        bdd0 b2 = ((com.yandex.plus.pay.internal.b) add0Var).b.b();
        StringBuilder sb = new StringBuilder("|");
        sb.append(b2.a.hashCode());
        sb.append("|-1355077428|");
        String str = b2.b;
        sb.append(str != null ? str.hashCode() : 0);
        sb.append('|');
        sb.append(b2.c.hashCode());
        sb.append('|');
        sb.append(b2.d.hashCode());
        sb.append('|');
        sb.append(0);
        sb.append('|');
        sb.append(0);
        sb.append('|');
        sb.append(b2.e.name().hashCode());
        sb.append('|');
        sb.append(b2.g.hashCode());
        sb.append('|');
        sb.append(b2.m.getEnvironment().name().hashCode());
        sb.append('|');
        sb.append(Boolean.hashCode(false));
        sb.append('|');
        return (qgd0) jx81.L(b2.v, "UI.Initialization", new ga1(11, sb.toString(), ogd0Var, add0Var));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface s(int i, lzr lzrVar) {
        int i2;
        Typeface w2;
        Style style = i == 0 ? Style.NORMAL : Style.ITALIC;
        DeliveryTypeface deliveryTypeface = (lzrVar.equals(lzr.A) || lzrVar.equals(lzr.B)) ? DeliveryTypeface.THIN : lzrVar.equals(lzr.C) ? DeliveryTypeface.LIGHT : lzrVar.equals(lzr.D) ? DeliveryTypeface.REGULAR : lzrVar.equals(lzr.E) ? DeliveryTypeface.MEDIUM : (lzrVar.equals(lzr.G) || lzrVar.equals(lzr.F)) ? DeliveryTypeface.BOLD : (lzrVar.equals(lzr.H) || lzrVar.equals(lzr.I)) ? DeliveryTypeface.HEAVY : DeliveryTypeface.REGULAR;
        if (z != null) {
            int i3 = jjz.a[style.ordinal()];
            int i4 = 1;
            if (i3 == 1) {
                i2 = 0;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                i2 = 2;
            }
            switch (jjz.b[deliveryTypeface.ordinal()]) {
                case 1:
                    i4 = 0;
                    if (i2 == 2 || i4 == 0) {
                        int[] iArr = up11.a;
                        w2 = eja1.w(i4, i2);
                    } else {
                        int[] iArr2 = up11.a;
                        w2 = Typeface.create(eja1.w(i4, 0), 2);
                    }
                    if (w2 != null) {
                    }
                    break;
                case 2:
                    if (i2 == 2) {
                    }
                    int[] iArr3 = up11.a;
                    w2 = eja1.w(i4, i2);
                    if (w2 != null) {
                    }
                    break;
                case 3:
                    i4 = 2;
                    if (i2 == 2) {
                    }
                    int[] iArr32 = up11.a;
                    w2 = eja1.w(i4, i2);
                    if (w2 != null) {
                    }
                    break;
                case 4:
                    i4 = 3;
                    if (i2 == 2) {
                    }
                    int[] iArr322 = up11.a;
                    w2 = eja1.w(i4, i2);
                    if (w2 != null) {
                    }
                    break;
                case 5:
                    i4 = 5;
                    if (i2 == 2) {
                    }
                    int[] iArr3222 = up11.a;
                    w2 = eja1.w(i4, i2);
                    if (w2 != null) {
                    }
                    break;
                case 6:
                    i4 = 6;
                    if (i2 == 2) {
                    }
                    int[] iArr32222 = up11.a;
                    w2 = eja1.w(i4, i2);
                    if (w2 != null) {
                    }
                    break;
                default:
                    w511.b();
                    break;
            }
            return null;
        }
        return Typeface.DEFAULT;
    }

    public static String u(String str) {
        if (!evu0.z(str, CSPStore.UNIQUE_SEPARATOR)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != '\\') {
                sb.append(str.charAt(i));
                i++;
            } else {
                int i2 = i;
                while (i2 < str.length() && str.charAt(i2) == '\\') {
                    i2++;
                }
                int i3 = i2 - i;
                i += i3;
                int i4 = i3 / 2;
                for (int i5 = 0; i5 < i4; i5++) {
                    sb.append(CSPStore.UNIQUE_SEPARATOR);
                }
                if (i3 % 2 == 1) {
                    if (i == str.length() || str.charAt(i) == ' ') {
                        kbs.n(oyr.p("Error tokenizing '", str, "'."), new TokenizingException("Alone backslash at " + (i - 1), null));
                        return null;
                    }
                    for (String str2 : B) {
                        int length = str2.length();
                        for (int i6 = 0; i6 < length; i6++) {
                            int i7 = i + i6;
                            if (i7 >= str.length() || str.charAt(i7) != str2.charAt(i6)) {
                            }
                        }
                        sb.append(str2);
                        i += str2.length();
                    }
                    kbs.n("Incorrect string escape", null);
                    return null;
                }
                continue;
            }
        }
        return sb.toString();
    }

    public static tls v(final isi isiVar) {
        if (isiVar instanceof DeliveryStub$C2CStub) {
            final int i = 0;
            return new tls() { // from class: ksi
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i2 = i;
                    boolean z2 = false;
                    isi isiVar2 = isiVar;
                    isi isiVar3 = (isi) obj;
                    switch (i2) {
                        case 0:
                            if ((isiVar3 instanceof DeliveryStub$C2CStub) && jl40.l(((DeliveryStub$C2CStub) isiVar3).getLocalUuid(), ((DeliveryStub$C2CStub) isiVar2).getLocalUuid())) {
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            if ((isiVar3 instanceof DeliveryStub$MarketStub) && jl40.l(((DeliveryStub$MarketStub) isiVar3).getOriginalOrderId(), ((DeliveryStub$MarketStub) isiVar2).getOriginalOrderId())) {
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            };
        }
        if (isiVar instanceof DeliveryStub$MarketStub) {
            final int i2 = 1;
            return new tls() { // from class: ksi
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    boolean z2 = false;
                    isi isiVar2 = isiVar;
                    isi isiVar3 = (isi) obj;
                    switch (i22) {
                        case 0:
                            if ((isiVar3 instanceof DeliveryStub$C2CStub) && jl40.l(((DeliveryStub$C2CStub) isiVar3).getLocalUuid(), ((DeliveryStub$C2CStub) isiVar2).getLocalUuid())) {
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            if ((isiVar3 instanceof DeliveryStub$MarketStub) && jl40.l(((DeliveryStub$MarketStub) isiVar3).getOriginalOrderId(), ((DeliveryStub$MarketStub) isiVar2).getOriginalOrderId())) {
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            };
        }
        w511.b();
        return null;
    }

    public static y66 w(int i, BlurEffect$CoordinatesType blurEffect$CoordinatesType, float f, float f2, float f3, float f4, BlurEffect$Progressive$TileMode blurEffect$Progressive$TileMode, int i2) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        float f5 = (i2 & 8) != 0 ? 0.0f : f2;
        float f6 = (i2 & 16) != 0 ? 0.0f : f3;
        float f7 = (i2 & 32) != 0 ? 1.0f : f4;
        BlurEffect$Progressive$Easing blurEffect$Progressive$Easing = BlurEffect$Progressive$Easing.Linear;
        BlurEffect$Progressive$TileMode blurEffect$Progressive$TileMode2 = (i2 & 128) != 0 ? BlurEffect$Progressive$TileMode.Clamp : blurEffect$Progressive$TileMode;
        Float valueOf = Float.valueOf(0.0f);
        return new y66(i, blurEffect$CoordinatesType, new Pair(valueOf, Float.valueOf(f)), f5, new Pair(valueOf, Float.valueOf(f6)), f7, blurEffect$Progressive$Easing, blurEffect$Progressive$TileMode2);
    }

    @Override // defpackage.uca1
    public jfa1 a(Class cls) {
        if (!p.class.isAssignableFrom(cls)) {
            ny61.g("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (jfa1) p.k(cls.asSubclass(p.class)).g(3);
        } catch (Exception e) {
            ny61.n("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.r77
    public byte[] b(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.uca1
    public boolean c(Class cls) {
        return p.class.isAssignableFrom(cls);
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        switch (this.a) {
            case 25:
                if (injVar.c == 0) {
                    return Long.valueOf(otr0.d());
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"now\" requires 0 arguments but "));
            case 26:
                if (injVar.c == 1) {
                    return ihb1.m(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"trim\" requires 1 argument but "));
            case 27:
                if (injVar.c != 1) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"pop\" requires 1 argument but "));
                }
                Object obj = injVar.a[0];
                if (!ym11.g(obj)) {
                    throw a.a("Function \"pop\" is not defined for ".concat(rhb1.e(obj)));
                }
                Object A2 = ycc.A((List) obj);
                if (A2 != null) {
                    return A2;
                }
                throw a.a("Attempt to pop element while list is empty");
            case 28:
                if (injVar.c == 1) {
                    return Double.valueOf(nrb1.e(injVar.a[0]));
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"float\" requires 1 argument but "));
            default:
                if (injVar.c != 2) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"push\" requires 2 argument but "));
                }
                Object[] objArr = injVar.a;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                if (ym11.g(obj2)) {
                    ym11.b(obj2).add(obj3);
                    return seu.E;
                }
                throw a.a("Function \"push\" is not defined for " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
        }
    }

    @Override // defpackage.yre
    public float e(long j, fwi fwiVar) {
        return 0.0f;
    }

    @Override // defpackage.e3t0
    public boolean f(Object obj, Object obj2) {
        return jl40.l(obj, obj2);
    }

    @Override // defpackage.o0m
    public m0m g(e eVar) {
        return eVar;
    }

    @Override // defpackage.m8j0
    public String i() {
        return "empty cache";
    }

    @Override // defpackage.nhe
    public long j(long j, long j2) {
        float b2 = iqb1.b(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(b2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i = blm0.a;
        return floatToRawIntBits;
    }

    public synchronized gtb o(String str) {
        gtb gtbVar;
        try {
            LinkedHashMap linkedHashMap = gtb.d;
            gtbVar = (gtb) linkedHashMap.get(str);
            if (gtbVar == null) {
                gtbVar = (gtb) linkedHashMap.get(cvu0.x(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : cvu0.x(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (gtbVar == null) {
                    gtbVar = new gtb(str);
                }
                linkedHashMap.put(str, gtbVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gtbVar;
    }

    public void p() {
        synchronized (this) {
            fu11 fu11Var = fu11.a;
        }
    }

    public void t(sls slsVar) {
        p();
        fu11.b.post(new c82(5, slsVar));
    }

    public String toString() {
        switch (this.a) {
            case 13:
                return "StructuralEqualityPolicy";
            case 21:
                return "ZeroCornerSize";
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
        double nextDouble = aVar.nextDouble();
        double nextDouble2 = aVar.nextDouble();
        double nextDouble3 = aVar.nextDouble();
        double nextDouble4 = aVar.k() == JsonReader$Token.NUMBER ? aVar.nextDouble() : 1.0d;
        if (z2) {
            aVar.d();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            if (nextDouble4 <= 1.0d) {
                nextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
