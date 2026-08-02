package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import xsna.imw;
import xsna.jmw;

/* compiled from: VectorResources.android.kt */
/* loaded from: classes11.dex */
public final class slr0 {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final jmw.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException {
        long j;
        int i2;
        imw.a aVar;
        int i3;
        int i4;
        int eventType;
        int i5;
        int i6;
        List list;
        List list2;
        int i7;
        int i8;
        int f;
        int i9;
        Shader shader;
        String str;
        yk8 rek0Var;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
        td2 td2Var = new td2(xmlResourceParser2);
        TypedArray j2 = ytp0.j(resources, theme, asAttributeSet, fto0.b);
        td2Var.b(j2.getChangingConfigurations());
        boolean b = ytp0.b(j2, xmlResourceParser2, "autoMirrored", 5, false);
        td2Var.b(j2.getChangingConfigurations());
        float a = td2Var.a(j2, "viewportWidth", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float a2 = td2Var.a(j2, "viewportHeight", 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (a <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(j2.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (a2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(j2.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = j2.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        td2Var.b(j2.getChangingConfigurations());
        float dimension2 = j2.getDimension(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        td2Var.b(j2.getChangingConfigurations());
        if (j2.hasValue(1)) {
            TypedValue typedValue = new TypedValue();
            j2.getValue(1, typedValue);
            if (typedValue.type == 2) {
                j = l5g.k;
            } else {
                ColorStateList c = ytp0.c(j2, xmlResourceParser2, theme);
                td2Var.b(j2.getChangingConfigurations());
                j = c != null ? f870.c(c.getDefaultColor()) : l5g.k;
            }
        } else {
            j = l5g.k;
        }
        long j3 = j;
        int i10 = j2.getInt(6, -1);
        td2Var.b(j2.getChangingConfigurations());
        if (i10 != -1) {
            if (i10 == 3) {
                i2 = 3;
            } else if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            i2 = 13;
                            break;
                        case 15:
                            i2 = 14;
                            break;
                        case 16:
                            i2 = 12;
                            break;
                    }
                } else {
                    i2 = 9;
                }
            }
            float f2 = dimension / resources.getDisplayMetrics().density;
            float f3 = dimension2 / resources.getDisplayMetrics().density;
            j2.recycle();
            i3 = 2;
            i4 = 1;
            aVar = new imw.a(null, f2, f3, a, a2, j3, i2, b, 1);
            int i11 = 0;
            for (int i12 = 3; xmlResourceParser2.getEventType() != i4 && (xmlResourceParser2.getDepth() >= i4 || xmlResourceParser2.getEventType() != i12); i12 = 3) {
                XmlPullParser xmlPullParser = td2Var.a;
                eventType = xmlPullParser.getEventType();
                ArrayList<imw.a.C3062a> arrayList = aVar.i;
                if (eventType != i3) {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int hashCode = name.hashCode();
                        sq90 sq90Var = td2Var.c;
                        if (hashCode != -1649314686) {
                            if (hashCode != 3433509) {
                                if (hashCode == 98629247 && name.equals("group")) {
                                    TypedArray j4 = ytp0.j(resources, theme, asAttributeSet, fto0.c);
                                    td2Var.b(j4.getChangingConfigurations());
                                    float a3 = td2Var.a(j4, "rotation", 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    float f4 = j4.getFloat(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    td2Var.b(j4.getChangingConfigurations());
                                    float f5 = j4.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    td2Var.b(j4.getChangingConfigurations());
                                    float a4 = td2Var.a(j4, "scaleX", 3, 1.0f);
                                    float a5 = td2Var.a(j4, "scaleY", 4, 1.0f);
                                    float a6 = td2Var.a(j4, "translateX", 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    float a7 = td2Var.a(j4, "translateY", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    String string = j4.getString(0);
                                    td2Var.b(j4.getChangingConfigurations());
                                    String str2 = string == null ? "" : string;
                                    j4.recycle();
                                    EmptyList emptyList = jlr0.a;
                                    if (aVar.k) {
                                        uzw.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    arrayList.add(new imw.a.C3062a(str2, a3, f4, f5, a4, a5, a6, a7, emptyList, 512));
                                }
                            } else if (name.equals("path")) {
                                TypedArray j5 = ytp0.j(resources, theme, asAttributeSet, fto0.d);
                                td2Var.b(j5.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    throw new IllegalArgumentException("No path data available");
                                }
                                String string2 = j5.getString(0);
                                td2Var.b(j5.getChangingConfigurations());
                                String str3 = string2 == null ? "" : string2;
                                String string3 = j5.getString(2);
                                td2Var.b(j5.getChangingConfigurations());
                                if (string3 == null) {
                                    list2 = jlr0.a;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    sq90Var.e(string3, arrayList2);
                                    list2 = arrayList2;
                                }
                                List list3 = list2;
                                h8i d = ytp0.d(j5, xmlPullParser, theme, "fillColor", 1);
                                td2Var.b(j5.getChangingConfigurations());
                                float a8 = td2Var.a(j5, "fillAlpha", 12, 1.0f);
                                int f6 = ytp0.f(j5, xmlPullParser, "strokeLineCap", 8, -1);
                                td2Var.b(j5.getChangingConfigurations());
                                if (f6 != 0) {
                                    if (f6 != 1) {
                                        i7 = 2;
                                        if (f6 == 2) {
                                            i8 = 2;
                                        }
                                    } else {
                                        i7 = 2;
                                        i8 = 1;
                                    }
                                    f = ytp0.f(j5, xmlPullParser, "strokeLineJoin", 9, -1);
                                    td2Var.b(j5.getChangingConfigurations());
                                    if (f != 0) {
                                        if (f == 1) {
                                            i9 = 1;
                                        } else if (f == i7) {
                                            i9 = i7;
                                        }
                                        float a9 = td2Var.a(j5, "strokeMiterLimit", 10, 4.0f);
                                        h8i d2 = ytp0.d(j5, xmlPullParser, theme, "strokeColor", 3);
                                        td2Var.b(j5.getChangingConfigurations());
                                        float a10 = td2Var.a(j5, "strokeAlpha", 11, 1.0f);
                                        float a11 = td2Var.a(j5, "strokeWidth", 4, 1.0f);
                                        float a12 = td2Var.a(j5, "trimPathEnd", 6, 1.0f);
                                        float a13 = td2Var.a(j5, "trimPathOffset", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        float a14 = td2Var.a(j5, "trimPathStart", 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        int f7 = ytp0.f(j5, xmlPullParser, "fillType", 13, 0);
                                        td2Var.b(j5.getChangingConfigurations());
                                        j5.recycle();
                                        shader = d.a;
                                        if (shader == null && d.c == 0) {
                                            str = "ImageVector.Builder is single use, create a new instance to create a new ImageVector";
                                            rek0Var = null;
                                        } else if (shader != null) {
                                            rek0Var = new bl8(shader);
                                            str = "ImageVector.Builder is single use, create a new instance to create a new ImageVector";
                                        } else {
                                            str = "ImageVector.Builder is single use, create a new instance to create a new ImageVector";
                                            rek0Var = new rek0(f870.c(d.c));
                                        }
                                        Shader shader2 = d2.a;
                                        yk8 bl8Var = (shader2 == null || d2.c != 0) ? shader2 == null ? new bl8(shader2) : new rek0(f870.c(d2.c)) : null;
                                        int i13 = f7 != 0 ? 0 : 1;
                                        if (aVar.k) {
                                            uzw.b(str);
                                        }
                                        ((imw.a.C3062a) xy9.b(1, arrayList)).j.add(new plr0(str3, list3, i13, rek0Var, a8, bl8Var, a10, a11, i8, i9, a9, a14, a12, a13));
                                    }
                                    i9 = 0;
                                    float a92 = td2Var.a(j5, "strokeMiterLimit", 10, 4.0f);
                                    h8i d22 = ytp0.d(j5, xmlPullParser, theme, "strokeColor", 3);
                                    td2Var.b(j5.getChangingConfigurations());
                                    float a102 = td2Var.a(j5, "strokeAlpha", 11, 1.0f);
                                    float a112 = td2Var.a(j5, "strokeWidth", 4, 1.0f);
                                    float a122 = td2Var.a(j5, "trimPathEnd", 6, 1.0f);
                                    float a132 = td2Var.a(j5, "trimPathOffset", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    float a142 = td2Var.a(j5, "trimPathStart", 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    int f72 = ytp0.f(j5, xmlPullParser, "fillType", 13, 0);
                                    td2Var.b(j5.getChangingConfigurations());
                                    j5.recycle();
                                    shader = d.a;
                                    if (shader == null) {
                                        str = "ImageVector.Builder is single use, create a new instance to create a new ImageVector";
                                        rek0Var = null;
                                        Shader shader22 = d22.a;
                                        yk8 bl8Var2 = (shader22 == null || d22.c != 0) ? shader22 == null ? new bl8(shader22) : new rek0(f870.c(d22.c)) : null;
                                        if (f72 != 0) {
                                        }
                                        if (aVar.k) {
                                        }
                                        ((imw.a.C3062a) xy9.b(1, arrayList)).j.add(new plr0(str3, list3, i13, rek0Var, a8, bl8Var2, a102, a112, i8, i9, a92, a142, a122, a132));
                                    }
                                    if (shader != null) {
                                    }
                                    Shader shader222 = d22.a;
                                    yk8 bl8Var22 = (shader222 == null || d22.c != 0) ? shader222 == null ? new bl8(shader222) : new rek0(f870.c(d22.c)) : null;
                                    if (f72 != 0) {
                                    }
                                    if (aVar.k) {
                                    }
                                    ((imw.a.C3062a) xy9.b(1, arrayList)).j.add(new plr0(str3, list3, i13, rek0Var, a8, bl8Var22, a102, a112, i8, i9, a92, a142, a122, a132));
                                } else {
                                    i7 = 2;
                                }
                                i8 = 0;
                                f = ytp0.f(j5, xmlPullParser, "strokeLineJoin", 9, -1);
                                td2Var.b(j5.getChangingConfigurations());
                                if (f != 0) {
                                }
                                i9 = 0;
                                float a922 = td2Var.a(j5, "strokeMiterLimit", 10, 4.0f);
                                h8i d222 = ytp0.d(j5, xmlPullParser, theme, "strokeColor", 3);
                                td2Var.b(j5.getChangingConfigurations());
                                float a1022 = td2Var.a(j5, "strokeAlpha", 11, 1.0f);
                                float a1122 = td2Var.a(j5, "strokeWidth", 4, 1.0f);
                                float a1222 = td2Var.a(j5, "trimPathEnd", 6, 1.0f);
                                float a1322 = td2Var.a(j5, "trimPathOffset", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                float a1422 = td2Var.a(j5, "trimPathStart", 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                int f722 = ytp0.f(j5, xmlPullParser, "fillType", 13, 0);
                                td2Var.b(j5.getChangingConfigurations());
                                j5.recycle();
                                shader = d.a;
                                if (shader == null) {
                                }
                                if (shader != null) {
                                }
                                Shader shader2222 = d222.a;
                                yk8 bl8Var222 = (shader2222 == null || d222.c != 0) ? shader2222 == null ? new bl8(shader2222) : new rek0(f870.c(d222.c)) : null;
                                if (f722 != 0) {
                                }
                                if (aVar.k) {
                                }
                                ((imw.a.C3062a) xy9.b(1, arrayList)).j.add(new plr0(str3, list3, i13, rek0Var, a8, bl8Var222, a1022, a1122, i8, i9, a922, a1422, a1222, a1322));
                            }
                            i5 = 1;
                            i6 = 2;
                        } else {
                            i6 = 2;
                            if (name.equals("clip-path")) {
                                TypedArray j6 = ytp0.j(resources, theme, asAttributeSet, fto0.e);
                                td2Var.b(j6.getChangingConfigurations());
                                String string4 = j6.getString(0);
                                td2Var.b(j6.getChangingConfigurations());
                                String str4 = string4 == null ? "" : string4;
                                i5 = 1;
                                String string5 = j6.getString(1);
                                td2Var.b(j6.getChangingConfigurations());
                                if (string5 == null) {
                                    list = jlr0.a;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    sq90Var.e(string5, arrayList3);
                                    list = arrayList3;
                                }
                                j6.recycle();
                                if (aVar.k) {
                                    uzw.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                arrayList.add(new imw.a.C3062a(str4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, list, 512));
                                i11++;
                            } else {
                                i5 = 1;
                            }
                            xmlResourceParser.next();
                            xmlResourceParser2 = xmlResourceParser;
                            i4 = i5;
                            i3 = i6;
                        }
                    }
                    i5 = 1;
                    i6 = 2;
                } else if (eventType == i12 && "group".equals(xmlPullParser.getName())) {
                    int i14 = i11 + 1;
                    int i15 = 0;
                    while (i15 < i14) {
                        if (aVar.k) {
                            uzw.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                        }
                        imw.a.C3062a remove = arrayList.remove(arrayList.size() - i4);
                        ((imw.a.C3062a) xy9.b(i4, arrayList)).j.add(new ilr0(remove.a, remove.b, remove.c, remove.d, remove.e, remove.f, remove.g, remove.h, remove.i, remove.j));
                        i15++;
                        i4 = 1;
                        i3 = 2;
                    }
                    i5 = i4;
                    i6 = i3;
                    i11 = 0;
                } else {
                    i5 = i4;
                    i6 = i3;
                }
                xmlResourceParser.next();
                xmlResourceParser2 = xmlResourceParser;
                i4 = i5;
                i3 = i6;
            }
            return new jmw.a(aVar.b(), i | td2Var.b);
        }
        i2 = 5;
        float f22 = dimension / resources.getDisplayMetrics().density;
        float f32 = dimension2 / resources.getDisplayMetrics().density;
        j2.recycle();
        i3 = 2;
        i4 = 1;
        aVar = new imw.a(null, f22, f32, a, a2, j3, i2, b, 1);
        int i112 = 0;
        while (xmlResourceParser2.getEventType() != i4) {
            XmlPullParser xmlPullParser2 = td2Var.a;
            eventType = xmlPullParser2.getEventType();
            ArrayList<imw.a.C3062a> arrayList4 = aVar.i;
            if (eventType != i3) {
            }
            xmlResourceParser.next();
            xmlResourceParser2 = xmlResourceParser;
            i4 = i5;
            i3 = i6;
        }
        return new jmw.a(aVar.b(), i | td2Var.b);
    }

    public static final imw b(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(44534090, 6, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:48)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) aVar.r(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        Object configuration = resources.getConfiguration();
        boolean J = aVar.J(configuration) | aVar.o(i) | aVar.J(resources) | aVar.J(theme);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            k4y0.a(xml);
            s3q0 s3q0Var = s3q0.a;
            x = a(theme, resources, xml, typedValue.changingConfigurations).a;
            aVar.R(x);
        }
        imw imwVar = (imw) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return imwVar;
    }
}
