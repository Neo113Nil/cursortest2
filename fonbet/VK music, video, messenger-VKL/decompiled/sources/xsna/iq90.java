package xsna;

import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.utils.vectordrawable.internal.element.PathElement;

/* compiled from: PathElementParser.kt */
/* loaded from: classes6.dex */
public final class iq90 extends de {

    /* compiled from: PathElementParser.kt */
    public static abstract class a<T> {
        public final String a;
        public final T b;

        /* compiled from: PathElementParser.kt */
        /* renamed from: xsna.iq90$a$a, reason: collision with other inner class name */
        public static final class C3072a extends a<Path.FillType> {
            public static final C3072a c = new C3072a("fillType", Path.FillType.WINDING);
        }

        /* compiled from: PathElementParser.kt */
        public static final class b extends a<Paint.Cap> {
            public static final b c = new b("strokeLineCap", Paint.Cap.BUTT);
        }

        /* compiled from: PathElementParser.kt */
        public static final class c extends a<Paint.Join> {
            public static final c c = new c("strokeLineJoin", Paint.Join.MITER);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final PathElement q0(XmlResourceParser xmlResourceParser) {
        Object obj;
        Object obj2;
        Object obj3;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float valueOf2 = Float.valueOf(1.0f);
        int P = de.P(this, xmlResourceParser, "name");
        String attributeValue = P != -1 ? xmlResourceParser.getAttributeValue(P) : null;
        int P2 = de.P(this, xmlResourceParser, "fillAlpha");
        float f = 255;
        int min = Math.min(255, (int) ((P2 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P2))) : valueOf2).floatValue() * f));
        int P3 = de.P(this, xmlResourceParser, "fillColor");
        int intValue = (P3 != -1 ? Integer.valueOf(x19.Q(xmlResourceParser.getAttributeValue(P3))) : r2).intValue();
        a.C3072a c3072a = a.C3072a.c;
        int P4 = de.P(this, xmlResourceParser, c3072a.a);
        if (P4 != -1) {
            String attributeValue2 = xmlResourceParser.getAttributeValue(P4);
            switch (attributeValue2.hashCode()) {
                case 49:
                    if (attributeValue2.equals("1")) {
                        obj = Path.FillType.EVEN_ODD;
                        break;
                    }
                    obj = Path.FillType.WINDING;
                    break;
                case 50:
                    if (attributeValue2.equals("2")) {
                        obj = Path.FillType.INVERSE_WINDING;
                        break;
                    }
                    obj = Path.FillType.WINDING;
                    break;
                case 51:
                    if (attributeValue2.equals("3")) {
                        obj = Path.FillType.INVERSE_EVEN_ODD;
                        break;
                    }
                    obj = Path.FillType.WINDING;
                    break;
                default:
                    obj = Path.FillType.WINDING;
                    break;
            }
        } else {
            obj = c3072a.b;
        }
        Path.FillType fillType = (Path.FillType) obj;
        int P5 = de.P(this, xmlResourceParser, "pathData");
        String attributeValue3 = P5 != -1 ? xmlResourceParser.getAttributeValue(P5) : null;
        int P6 = de.P(this, xmlResourceParser, "strokeAlpha");
        int min2 = Math.min(255, (int) ((P6 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P6))) : valueOf2).floatValue() * f));
        int P7 = de.P(this, xmlResourceParser, "strokeColor");
        int intValue2 = (P7 != -1 ? Integer.valueOf(x19.Q(xmlResourceParser.getAttributeValue(P7))) : 0).intValue();
        a.b bVar = a.b.c;
        int P8 = de.P(this, xmlResourceParser, bVar.a);
        if (P8 != -1) {
            String attributeValue4 = xmlResourceParser.getAttributeValue(P8);
            obj2 = epx.f(attributeValue4, "1") ? Paint.Cap.ROUND : epx.f(attributeValue4, "2") ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
        } else {
            obj2 = bVar.b;
        }
        Paint.Cap cap = (Paint.Cap) obj2;
        a.c cVar = a.c.c;
        int P9 = de.P(this, xmlResourceParser, cVar.a);
        if (P9 != -1) {
            String attributeValue5 = xmlResourceParser.getAttributeValue(P9);
            obj3 = epx.f(attributeValue5, "1") ? Paint.Join.ROUND : epx.f(attributeValue5, "2") ? Paint.Join.BEVEL : Paint.Join.MITER;
        } else {
            obj3 = cVar.b;
        }
        Paint.Join join = (Paint.Join) obj3;
        int P10 = de.P(this, xmlResourceParser, "strokeMiterLimit");
        float floatValue = (P10 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P10))) : Float.valueOf(4.0f)).floatValue();
        int P11 = de.P(this, xmlResourceParser, "strokeWidth");
        float floatValue2 = (P11 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P11))) : valueOf).floatValue();
        int P12 = de.P(this, xmlResourceParser, "trimPathEnd");
        if (P12 != -1) {
            valueOf2 = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P12)));
        }
        float floatValue3 = valueOf2.floatValue();
        int P13 = de.P(this, xmlResourceParser, "trimPathOffset");
        float floatValue4 = (P13 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P13))) : valueOf).floatValue();
        int P14 = de.P(this, xmlResourceParser, "trimPathStart");
        if (P14 != -1) {
            valueOf = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P14)));
        }
        return new PathElement(attributeValue, min, intValue, fillType, attributeValue3, min2, intValue2, cap, join, floatValue, floatValue2, floatValue3, floatValue4, valueOf.floatValue());
    }
}
