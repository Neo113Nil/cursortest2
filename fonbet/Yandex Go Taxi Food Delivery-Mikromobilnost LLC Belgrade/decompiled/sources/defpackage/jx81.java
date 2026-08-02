package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.yandex.plus.core.benchmark.a;
import com.yandex.plus.core.benchmark.b;
import com.ybsdk.api.entities.YBSdkSettingsTheme;
import com.ybsdk.api.entities.YBSdkTheme;
import com.ybsdk.core.design.theme.ThemeType;
import com.ybsdk.feature.paymentsdk.api.PaymentSdkEnvironment;
import com.ybsdk.feature.settings.api.SettingsTheme;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.net.ssl.SSLException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.q0;
import kotlinx.serialization.json.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.HttpException;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.yandex.taxi.exception.TokenRetrievalException;

/* loaded from: classes.dex */
public abstract class jx81 {
    public static o370 a;
    public static final zrk b = new zrk(20);
    public static final Object[] c = new Object[0];
    public static final char[] d = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final boolean A(int i, Throwable th) {
        return (th instanceof HttpException) && i == ((HttpException) th).a();
    }

    public static final boolean B(Throwable th) {
        return (th instanceof IOException) && !(th instanceof SSLException);
    }

    public static final boolean C(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && yf61.m(str.charAt(i + 1)) != -1 && yf61.m(str.charAt(i3)) != -1;
    }

    public static final boolean D(Throwable th) {
        if (th instanceof IOException) {
            return true;
        }
        return (th instanceof TokenRetrievalException) && (((TokenRetrievalException) th).getCause() instanceof IOException);
    }

    public static Typeface E(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        int weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        return Typeface.create(typeface, sb2.k(i3 + weight, 1, 1000), typeface.isItalic());
    }

    public static yyr F(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        yyr yyrVar;
        int i2;
        String str;
        TypedArray typedArray;
        Throwable th;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        yyr yyrVar2 = null;
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            I(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), j4i0.FontFamily);
        String string = obtainAttributes.getString(j4i0.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(j4i0.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(j4i0.FontFamily_fontProviderQuery);
        String string4 = obtainAttributes.getString(j4i0.FontFamily_fontProviderFallbackQuery);
        int resourceId = obtainAttributes.getResourceId(j4i0.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(j4i0.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(j4i0.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = obtainAttributes.getString(j4i0.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), j4i0.FontFamilyFont);
                        int i3 = obtainAttributes2.getInt(obtainAttributes2.hasValue(j4i0.FontFamilyFont_fontWeight) ? j4i0.FontFamilyFont_fontWeight : j4i0.FontFamilyFont_android_fontWeight, Constants.MINIMAL_ERROR_STATUS_CODE);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(j4i0.FontFamilyFont_fontStyle) ? j4i0.FontFamilyFont_fontStyle : j4i0.FontFamilyFont_android_fontStyle, 0);
                        int i4 = obtainAttributes2.hasValue(j4i0.FontFamilyFont_ttcIndex) ? j4i0.FontFamilyFont_ttcIndex : j4i0.FontFamilyFont_android_ttcIndex;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(j4i0.FontFamilyFont_fontVariationSettings) ? j4i0.FontFamilyFont_fontVariationSettings : j4i0.FontFamilyFont_android_fontVariationSettings);
                        int i5 = obtainAttributes2.getInt(i4, 0);
                        int i6 = obtainAttributes2.hasValue(j4i0.FontFamilyFont_font) ? j4i0.FontFamilyFont_font : j4i0.FontFamilyFont_android_font;
                        int resourceId2 = obtainAttributes2.getResourceId(i6, 0);
                        obtainAttributes2.getString(i6);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            I(xmlResourceParser);
                        }
                        arrayList.add(new azr(string6, i3, z, i5, resourceId2));
                    } else {
                        I(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new zyr((azr[]) arrayList.toArray(new azr[0]));
        }
        List H = H(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), j4i0.FontFamilyProviderFallback);
                    try {
                        String string7 = obtainAttributes3.getString(j4i0.FontFamilyProviderFallback_fontProviderQuery);
                        yyrVar = yyrVar2;
                        String string8 = obtainAttributes3.getString(j4i0.FontFamilyProviderFallback_fontProviderSystemFontFamily);
                        String string9 = obtainAttributes3.getString(j4i0.FontFamilyProviderFallback_fontVariationSettings);
                        if (string7 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                I(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray = obtainAttributes3;
                            }
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i2 = integer2;
                            str = string5;
                            try {
                                pyr pyrVar = new pyr(string, string2, string7, string8, string9, H);
                                nnm.t(typedArray);
                                arrayList2.add(pyrVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            typedArray = obtainAttributes3;
                        }
                        th = th3;
                    } catch (Throwable th5) {
                        th = th5;
                        typedArray = obtainAttributes3;
                    }
                    th = th;
                    if (typedArray == null) {
                        throw th;
                    }
                    try {
                        nnm.t(typedArray);
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                yyrVar = yyrVar2;
                i2 = integer2;
                str = string5;
                I(xmlResourceParser);
                integer2 = i2;
                string5 = str;
                yyrVar2 = yyrVar;
                i = 2;
            }
        }
        yyr yyrVar3 = yyrVar2;
        int i7 = integer2;
        String str2 = string5;
        if (!arrayList2.isEmpty()) {
            return new bzr(arrayList2, integer, i7, str2);
        }
        if (string3 == null) {
            ny61.g("The provider font XML requires query attribute or fallback children.");
            return yyrVar3;
        }
        arrayList2.add(new pyr(string, string2, string3, null, null, H));
        if (string4 != null) {
            arrayList2.add(new pyr(string, string2, string4, null, null, H));
        }
        return new bzr(arrayList2, integer, i7, str2);
    }

    public static String G(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                yp6 yp6Var = new yp6();
                yp6Var.w0(i, i5, str);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            yp6Var.e0(32);
                            i5++;
                        }
                        yp6Var.z0(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int m = yf61.m(str.charAt(i5 + 1));
                        int m2 = yf61.m(str.charAt(i4));
                        if (m != -1 && m2 != -1) {
                            yp6Var.e0((m << 4) + m2);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        yp6Var.z0(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return yp6Var.I0();
            }
            i5++;
        }
        return str.substring(i, i2);
    }

    public static List H(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (rsa1.b(obtainTypedArray) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void I(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final SettingsTheme J(YBSdkSettingsTheme yBSdkSettingsTheme) {
        int i = ci51.d[yBSdkSettingsTheme.ordinal()];
        if (i == 1) {
            return SettingsTheme.LIGHT;
        }
        if (i == 2) {
            return SettingsTheme.DARK;
        }
        if (i == 3) {
            return SettingsTheme.SYSTEM;
        }
        w511.b();
        return null;
    }

    public static final ThemeType K(YBSdkTheme yBSdkTheme) {
        int i = ci51.a[yBSdkTheme.ordinal()];
        if (i == 1) {
            return ThemeType.LIGHT;
        }
        if (i == 2) {
            return ThemeType.DARK;
        }
        w511.b();
        return null;
    }

    public static final Object L(a aVar, String str, tls tlsVar) {
        b c2 = aVar.c(str);
        c2.b();
        Object invoke = tlsVar.invoke(c2);
        c2.c();
        aVar.b(c2, null);
        return invoke;
    }

    public static final j5x M(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), M(entry.getValue()));
            }
            return new m5x(linkedHashMap);
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            ArrayList arrayList = new ArrayList(tcc.n(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(M(it.next()));
            }
            return new v4x(arrayList);
        }
        if (obj instanceof Integer) {
            return new i5x(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new i5x(((Number) obj).longValue());
        }
        if (obj instanceof Float) {
            return new h5x(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new h5x(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            return new o6x((String) obj);
        }
        if (obj instanceof Boolean) {
            return new w4x(((Boolean) obj).booleanValue());
        }
        vg10.g(obj.getClass(), "Unsupported for wrapping type ");
        return null;
    }

    public static q0 a(int i, long j) {
        if ((i & 1) != 0) {
            o430 o430Var = e3n.b;
            j = 0;
        }
        return new q0(e3n.e(j), e3n.e((i & 2) != 0 ? e3n.c : 0L));
    }

    public static final String[] b(int i) {
        switch (i) {
            case 1:
                return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            case 2:
                return new String[]{"android.permission.CALL_PHONE"};
            case 3:
                return new String[]{"android.permission.CAMERA"};
            case 4:
            default:
                return new String[0];
            case 5:
                return new String[]{"android.permission.READ_PHONE_STATE"};
            case 6:
                return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
            case 7:
                return f() ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
            case 8:
                return f() ? new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"} : new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"};
            case 9:
                return new String[]{"android.permission.READ_CONTACTS"};
            case 10:
                return e() ? new String[]{"android.permission.BLUETOOTH_CONNECT"} : new String[0];
            case 11:
                return e() ? new String[]{"android.permission.BLUETOOTH_SCAN"} : new String[0];
            case 12:
                return f() ? new String[]{"android.permission.POST_NOTIFICATIONS"} : new String[0];
            case 13:
                return new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"};
            case 14:
                return new String[]{"android.permission.RECORD_AUDIO"};
            case 15:
                return new String[]{"android.permission.ACCESS_FINE_LOCATION"};
        }
    }

    public static void c(TextView textView, int i) {
        if (i == 0) {
            textView.setTextAlignment(5);
            textView.setGravity(8388611);
            return;
        }
        if (i == 1) {
            textView.setTextAlignment(4);
            textView.setGravity(1);
        } else if (i == 2) {
            textView.setTextAlignment(6);
            textView.setGravity(8388613);
        } else if (i != 3) {
            textView.setTextAlignment(5);
            textView.setGravity(8388611);
        } else {
            textView.setTextAlignment(2);
            textView.setGravity(8388611);
        }
    }

    public static final boolean d() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static final boolean e() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static final boolean f() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static final boolean g() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static String h(String str, boolean z, String str2, int i, int i2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return i(str, i4, i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) == 0, (i3 & 32) == 0, (i3 & 64) == 0, 128);
    }

    public static String i(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z7) || evu0.z(str2, (char) codePointAt) || ((codePointAt == 37 && (!z5 || (z6 && !C(i5, length, str)))) || (codePointAt == 43 && z3)))) {
                yp6 yp6Var = new yp6();
                yp6Var.w0(i4, i5, str);
                yp6 yp6Var2 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            yp6Var.x0("+");
                        } else if (codePointAt2 == 43 && z3) {
                            yp6Var.x0(z5 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i6 && !z7) || evu0.z(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z5 || (z6 && !C(i5, length, str)))))) {
                            if (yp6Var2 == null) {
                                yp6Var2 = new yp6();
                            }
                            yp6Var2.z0(codePointAt2);
                            while (!yp6Var2.I1()) {
                                byte readByte = yp6Var2.readByte();
                                yp6Var.e0(37);
                                char[] cArr = d;
                                yp6Var.e0(cArr[((readByte & 255) >> 4) & 15]);
                                yp6Var.e0(cArr[readByte & PKIBody._CCP]);
                            }
                        } else {
                            yp6Var.z0(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 128;
                }
                return yp6Var.I0();
            }
            i5 += Character.charCount(codePointAt);
        }
        return str.substring(i4, length);
    }

    public static j0d j(String str, String str2) {
        d74 d74Var = new d74(str, str2);
        g0d b2 = j0d.b(d74.class);
        b2.b = 1;
        b2.g = new e0d(0, d74Var);
        return b2.c();
    }

    public static x8g k(ContextThemeWrapper contextThemeWrapper, hh51 hh51Var, kg51 kg51Var) {
        epp0 epp0Var = new epp0();
        fx50 fx50Var = new fx50();
        d8b0 d8b0Var = new d8b0();
        flg0 flg0Var = new flg0();
        s960 s960Var = new s960();
        gj51 gj51Var = new gj51();
        xzo xzoVar = new xzo();
        qt41 qt41Var = new qt41();
        w8r w8rVar = new w8r();
        new n59();
        return new x8g(epp0Var, fx50Var, d8b0Var, flg0Var, s960Var, gj51Var, xzoVar, qt41Var, w8rVar, new o59(), contextThemeWrapper, hh51Var, kg51Var, Boolean.FALSE);
    }

    public static final zy11 l(oz50 oz50Var, long j, Continuation continuation) {
        Integer l;
        Boolean j0;
        Boolean j02;
        zy11 zy11Var = zy11.a;
        iev ievVar = (iev) continuation.get_context().get(iev.b);
        if (ievVar == null) {
            return zy11Var;
        }
        zu50 zu50Var = oz50Var.d;
        String a2 = zu50Var.a("x-is-tintable");
        int i = 0;
        boolean booleanValue = (a2 == null || (j02 = evu0.j0(a2)) == null) ? false : j02.booleanValue();
        String a3 = zu50Var.a("x-is-mirrorable");
        boolean booleanValue2 = (a3 == null || (j0 = evu0.j0(a3)) == null) ? false : j0.booleanValue();
        String a4 = zu50Var.a("x-size-hint");
        if (a4 != null) {
            if (a4.equals("9999") || a4.equals("1") || a4.equals("0")) {
                a4 = null;
            }
            if (a4 != null && (l = bvu0.l(10, a4)) != null) {
                i = l.intValue();
            }
        }
        ievVar.a = new ebv(i, booleanValue, j, booleanValue2);
        return zy11Var;
    }

    public static j0d m(String str, yhl yhlVar) {
        g0d b2 = j0d.b(d74.class);
        b2.b = 1;
        b2.a(vwi.b(Context.class));
        b2.g = new e89(4, str, yhlVar);
        return b2.c();
    }

    public static ColorStateList n(Context context, dfz0 dfz0Var, int i) {
        int resourceId;
        ColorStateList m;
        return (!dfz0Var.b.hasValue(i) || (resourceId = dfz0Var.b.getResourceId(i, 0)) == 0 || (m = qke.m(resourceId, context)) == null) ? dfz0Var.a(i) : m;
    }

    public static ColorStateList o(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList m;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m = qke.m(resourceId, context)) == null) ? typedArray.getColorStateList(i) : m;
    }

    public static int p(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable q(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable t;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (t = vng.t(resourceId, context)) == null) ? typedArray.getDrawable(i) : t;
    }

    public static gl7 r(el7 el7Var) {
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = el7Var.getClass();
        try {
            Object j = el7Var.j(bVar);
            if (j == null) {
                return gl7Var;
            }
            bVar.a = j;
            return gl7Var;
        } catch (Exception e) {
            gl7Var.a(e);
            return gl7Var;
        }
    }

    public static final Function s(m0a0 m0a0Var) {
        return m0a0Var == null ? new y0a0() : new dxd(5, m0a0Var);
    }

    public static final long t(oll0 oll0Var) {
        if (x(oll0Var) == 0) {
            return -1L;
        }
        ull0 T0 = oll0Var.T0("SELECT last_insert_rowid()");
        try {
            T0.q();
            long j = T0.getLong(0);
            gwk0.m(T0, null);
            return j;
        } finally {
        }
    }

    public static final PaymentSdkEnvironment u(w4o w4oVar) {
        if (w4oVar.equals(u4o.d) || w4oVar.equals(t4o.d)) {
            return PaymentSdkEnvironment.TESTING;
        }
        if (w4oVar.equals(v4o.d)) {
            return PaymentSdkEnvironment.PRODUCTION;
        }
        w511.b();
        return null;
    }

    public static final int v(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                ny61.g("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final n5o w(sbx sbxVar, String str, c cVar) {
        n5o n5oVar;
        utl utlVar;
        Map map;
        Result result;
        if (str == null || (utlVar = (utl) bvf0.A(sbxVar).c(qoi0.a(utl.class))) == null || (map = utlVar.a) == null || (result = (Result) map.get(str)) == null) {
            n5oVar = null;
        } else {
            Object value = result.getValue();
            if (value instanceof Result.Failure) {
                value = null;
            }
            n5oVar = (n5o) value;
        }
        if (n5oVar != null) {
            return n5oVar;
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get("divData");
        if (bVar != null) {
            return (n5o) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(n5o.class))), bVar);
        }
        return null;
    }

    public static final int x(oll0 oll0Var) {
        ull0 T0 = oll0Var.T0("SELECT changes()");
        try {
            T0.q();
            int i = (int) T0.getLong(0);
            gwk0.m(T0, null);
            return i;
        } finally {
        }
    }

    public static int y(int i, Context context) {
        if (i == 0) {
            return 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, z2i0.MaterialTextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(z2i0.MaterialTextAppearance_lineHeight, typedValue);
        if (!value) {
            value = obtainStyledAttributes.getValue(z2i0.MaterialTextAppearance_android_lineHeight, typedValue);
        }
        obtainStyledAttributes.recycle();
        if (!value) {
            return 0;
        }
        int complexUnit = typedValue.getComplexUnit();
        int i2 = typedValue.data;
        return complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
    }

    public static boolean z(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
