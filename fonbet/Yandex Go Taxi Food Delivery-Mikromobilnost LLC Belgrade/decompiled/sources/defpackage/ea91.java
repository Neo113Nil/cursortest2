package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.div.state.db.StateEntry;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes11.dex */
public abstract class ea91 {
    public static final ivk a = new ivk(16);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ngv a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) {
        long j;
        int i2;
        int i3;
        int eventType;
        EmptyList emptyList;
        int i4;
        int i5;
        int g;
        int i6;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        zc2 zc2Var = new zc2(xmlResourceParser);
        TypedArray i7 = uvb1.i(resources, theme, asAttributeSet, nht.a);
        zc2Var.b(i7.getChangingConfigurations());
        boolean c = uvb1.c(i7, xmlResourceParser, false);
        zc2Var.b(i7.getChangingConfigurations());
        float a2 = zc2Var.a(i7, "viewportWidth", 7, 0.0f);
        float a3 = zc2Var.a(i7, "viewportHeight", 8, 0.0f);
        if (a2 <= 0.0f) {
            throw new XmlPullParserException(i7.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (a3 <= 0.0f) {
            throw new XmlPullParserException(i7.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = i7.getDimension(3, 0.0f);
        zc2Var.b(i7.getChangingConfigurations());
        float dimension2 = i7.getDimension(2, 0.0f);
        zc2Var.b(i7.getChangingConfigurations());
        if (i7.hasValue(1)) {
            TypedValue typedValue = new TypedValue();
            i7.getValue(1, typedValue);
            if (typedValue.type == 2) {
                j = ldc.m;
            } else {
                ColorStateList d = uvb1.d(i7, xmlResourceParser, theme);
                zc2Var.b(i7.getChangingConfigurations());
                j = d != null ? rzo.d(d.getDefaultColor()) : ldc.m;
            }
        } else {
            j = ldc.m;
        }
        long j2 = j;
        int i8 = i7.getInt(6, -1);
        zc2Var.b(i7.getChangingConfigurations());
        if (i8 != -1) {
            if (i8 == 3) {
                i2 = 3;
            } else if (i8 != 5) {
                if (i8 != 9) {
                    switch (i8) {
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
            float f = dimension / resources.getDisplayMetrics().density;
            float f2 = dimension2 / resources.getDisplayMetrics().density;
            i7.recycle();
            lgv lgvVar = new lgv(null, f, f2, a2, a3, j2, i2, c, 1);
            int i9 = 0;
            for (i3 = 3; xmlResourceParser.getEventType() != 1 && (xmlResourceParser.getDepth() >= 1 || xmlResourceParser.getEventType() != i3); i3 = 3) {
                XmlPullParser xmlPullParser = zc2Var.a;
                eventType = xmlPullParser.getEventType();
                if (eventType != 2) {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int hashCode = name.hashCode();
                        EmptyList emptyList2 = EmptyList.a;
                        zr90 zr90Var = zc2Var.c;
                        if (hashCode != -1649314686) {
                            if (hashCode != 3433509) {
                                if (hashCode == 98629247 && name.equals("group")) {
                                    TypedArray i10 = uvb1.i(resources, theme, asAttributeSet, nht.b);
                                    zc2Var.b(i10.getChangingConfigurations());
                                    float a4 = zc2Var.a(i10, "rotation", 5, 0.0f);
                                    float f3 = i10.getFloat(1, 0.0f);
                                    zc2Var.b(i10.getChangingConfigurations());
                                    float f4 = i10.getFloat(2, 0.0f);
                                    zc2Var.b(i10.getChangingConfigurations());
                                    float a5 = zc2Var.a(i10, "scaleX", i3, 1.0f);
                                    float a6 = zc2Var.a(i10, "scaleY", 4, 1.0f);
                                    float a7 = zc2Var.a(i10, "translateX", 6, 0.0f);
                                    float a8 = zc2Var.a(i10, "translateY", 7, 0.0f);
                                    String string = i10.getString(0);
                                    zc2Var.b(i10.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    i10.recycle();
                                    int i11 = c531.a;
                                    lgvVar.a(str, a4, f3, f4, a5, a6, a7, a8, emptyList2);
                                }
                            } else if (name.equals(StateEntry.COLUMN_PATH)) {
                                TypedArray i12 = uvb1.i(resources, theme, asAttributeSet, nht.c);
                                zc2Var.b(i12.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    ny61.g("No path data available");
                                    return null;
                                }
                                String string2 = i12.getString(0);
                                zc2Var.b(i12.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = i12.getString(2);
                                zc2Var.b(i12.getChangingConfigurations());
                                if (string3 == null) {
                                    int i13 = c531.a;
                                    emptyList = emptyList2;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    zr90Var.a(string3, arrayList);
                                    emptyList = arrayList;
                                }
                                o3 e = uvb1.e(i12, xmlPullParser, theme, "fillColor", 1);
                                zc2Var.b(i12.getChangingConfigurations());
                                float a9 = zc2Var.a(i12, "fillAlpha", 12, 1.0f);
                                int g2 = uvb1.g(i12, xmlPullParser, "strokeLineCap", 8, -1);
                                zc2Var.b(i12.getChangingConfigurations());
                                if (g2 != 0) {
                                    if (g2 != 1) {
                                        i4 = 2;
                                        if (g2 == 2) {
                                            i5 = 2;
                                        }
                                    } else {
                                        i4 = 2;
                                        i5 = 1;
                                    }
                                    g = uvb1.g(i12, xmlPullParser, "strokeLineJoin", 9, -1);
                                    zc2Var.b(i12.getChangingConfigurations());
                                    if (g != 0) {
                                        if (g == 1) {
                                            i6 = 1;
                                        } else if (g == i4) {
                                            i6 = i4;
                                        }
                                        float a10 = zc2Var.a(i12, "strokeMiterLimit", 10, 4.0f);
                                        o3 e2 = uvb1.e(i12, xmlPullParser, theme, "strokeColor", i3);
                                        zc2Var.b(i12.getChangingConfigurations());
                                        float a11 = zc2Var.a(i12, "strokeAlpha", 11, 1.0f);
                                        float a12 = zc2Var.a(i12, "strokeWidth", 4, 1.0f);
                                        float a13 = zc2Var.a(i12, "trimPathEnd", 6, 1.0f);
                                        float a14 = zc2Var.a(i12, "trimPathOffset", 7, 0.0f);
                                        float a15 = zc2Var.a(i12, "trimPathStart", 5, 0.0f);
                                        int g3 = uvb1.g(i12, xmlPullParser, "fillType", 13, 0);
                                        zc2Var.b(i12.getChangingConfigurations());
                                        i12.recycle();
                                        Shader shader = (Shader) e.w;
                                        ml6 nl6Var = (shader == null && e.b == 0) ? null : shader != null ? new nl6(shader) : new a6t0(rzo.d(e.b));
                                        Shader shader2 = (Shader) e2.w;
                                        lgvVar.b(a9, a11, a12, a10, a15, a13, a14, g3 == 0 ? 0 : 1, i5, i6, nl6Var, (shader2 == null && e2.b == 0) ? null : shader2 == null ? new nl6(shader2) : new a6t0(rzo.d(e2.b)), str2, emptyList);
                                    }
                                    i6 = 0;
                                    float a102 = zc2Var.a(i12, "strokeMiterLimit", 10, 4.0f);
                                    o3 e22 = uvb1.e(i12, xmlPullParser, theme, "strokeColor", i3);
                                    zc2Var.b(i12.getChangingConfigurations());
                                    float a112 = zc2Var.a(i12, "strokeAlpha", 11, 1.0f);
                                    float a122 = zc2Var.a(i12, "strokeWidth", 4, 1.0f);
                                    float a132 = zc2Var.a(i12, "trimPathEnd", 6, 1.0f);
                                    float a142 = zc2Var.a(i12, "trimPathOffset", 7, 0.0f);
                                    float a152 = zc2Var.a(i12, "trimPathStart", 5, 0.0f);
                                    int g32 = uvb1.g(i12, xmlPullParser, "fillType", 13, 0);
                                    zc2Var.b(i12.getChangingConfigurations());
                                    i12.recycle();
                                    Shader shader3 = (Shader) e.w;
                                    if (shader3 == null) {
                                        Shader shader22 = (Shader) e22.w;
                                        if (shader22 == null) {
                                            lgvVar.b(a9, a112, a122, a102, a152, a132, a142, g32 == 0 ? 0 : 1, i5, i6, nl6Var, (shader22 == null && e22.b == 0) ? null : shader22 == null ? new nl6(shader22) : new a6t0(rzo.d(e22.b)), str2, emptyList);
                                        }
                                        lgvVar.b(a9, a112, a122, a102, a152, a132, a142, g32 == 0 ? 0 : 1, i5, i6, nl6Var, (shader22 == null && e22.b == 0) ? null : shader22 == null ? new nl6(shader22) : new a6t0(rzo.d(e22.b)), str2, emptyList);
                                    }
                                    Shader shader222 = (Shader) e22.w;
                                    if (shader222 == null) {
                                    }
                                    lgvVar.b(a9, a112, a122, a102, a152, a132, a142, g32 == 0 ? 0 : 1, i5, i6, nl6Var, (shader222 == null && e22.b == 0) ? null : shader222 == null ? new nl6(shader222) : new a6t0(rzo.d(e22.b)), str2, emptyList);
                                } else {
                                    i4 = 2;
                                }
                                i5 = 0;
                                g = uvb1.g(i12, xmlPullParser, "strokeLineJoin", 9, -1);
                                zc2Var.b(i12.getChangingConfigurations());
                                if (g != 0) {
                                }
                                i6 = 0;
                                float a1022 = zc2Var.a(i12, "strokeMiterLimit", 10, 4.0f);
                                o3 e222 = uvb1.e(i12, xmlPullParser, theme, "strokeColor", i3);
                                zc2Var.b(i12.getChangingConfigurations());
                                float a1122 = zc2Var.a(i12, "strokeAlpha", 11, 1.0f);
                                float a1222 = zc2Var.a(i12, "strokeWidth", 4, 1.0f);
                                float a1322 = zc2Var.a(i12, "trimPathEnd", 6, 1.0f);
                                float a1422 = zc2Var.a(i12, "trimPathOffset", 7, 0.0f);
                                float a1522 = zc2Var.a(i12, "trimPathStart", 5, 0.0f);
                                int g322 = uvb1.g(i12, xmlPullParser, "fillType", 13, 0);
                                zc2Var.b(i12.getChangingConfigurations());
                                i12.recycle();
                                Shader shader32 = (Shader) e.w;
                                if (shader32 == null) {
                                }
                                Shader shader2222 = (Shader) e222.w;
                                if (shader2222 == null) {
                                }
                                lgvVar.b(a9, a1122, a1222, a1022, a1522, a1322, a1422, g322 == 0 ? 0 : 1, i5, i6, nl6Var, (shader2222 == null && e222.b == 0) ? null : shader2222 == null ? new nl6(shader2222) : new a6t0(rzo.d(e222.b)), str2, emptyList);
                            }
                        } else if (name.equals("clip-path")) {
                            TypedArray i14 = uvb1.i(resources, theme, asAttributeSet, nht.d);
                            zc2Var.b(i14.getChangingConfigurations());
                            String string4 = i14.getString(0);
                            zc2Var.b(i14.getChangingConfigurations());
                            String str3 = string4 == null ? "" : string4;
                            String string5 = i14.getString(1);
                            zc2Var.b(i14.getChangingConfigurations());
                            if (string5 == null) {
                                int i15 = c531.a;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                zr90Var.a(string5, arrayList2);
                                emptyList2 = arrayList2;
                            }
                            i14.recycle();
                            lgvVar.a(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, emptyList2);
                            i9++;
                        }
                        xmlResourceParser.next();
                    }
                } else if (eventType == i3 && "group".equals(xmlPullParser.getName())) {
                    int i16 = i9 + 1;
                    for (int i17 = 0; i17 < i16; i17++) {
                        lgvVar.e();
                    }
                    i9 = 0;
                }
                xmlResourceParser.next();
            }
            return new ngv(lgvVar.d(), i | zc2Var.b);
        }
        i2 = 5;
        float f5 = dimension / resources.getDisplayMetrics().density;
        float f22 = dimension2 / resources.getDisplayMetrics().density;
        i7.recycle();
        lgv lgvVar2 = new lgv(null, f5, f22, a2, a3, j2, i2, c, 1);
        int i92 = 0;
        while (xmlResourceParser.getEventType() != 1) {
            XmlPullParser xmlPullParser2 = zc2Var.a;
            eventType = xmlPullParser2.getEventType();
            if (eventType != 2) {
            }
            xmlResourceParser.next();
        }
        return new ngv(lgvVar2.d(), i | zc2Var.b);
    }

    public static final mgv b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) btsVar.m(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        Configuration configuration = resources.getConfiguration();
        boolean k = btsVar.k(configuration) | btsVar.c(i) | btsVar.k(resources) | btsVar.k(theme);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            Q = a(theme, resources, xml, typedValue.changingConfigurations).a;
            btsVar.o0(Q);
        }
        return (mgv) Q;
    }
}
