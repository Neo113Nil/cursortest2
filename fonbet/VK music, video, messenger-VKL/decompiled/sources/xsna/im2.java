package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;

/* compiled from: AnimatedVectorResources.android.kt */
/* loaded from: classes11.dex */
public final class im2 {
    /* JADX WARN: Finally extract failed */
    public static final yk2 a(int i, int i2, androidx.compose.runtime.a aVar) {
        TypedArray obtainAttributes;
        TypedArray obtainAttributes2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-976666674, i2, -1, "androidx.compose.animation.graphics.res.animatedVectorResource (AnimatedVectorResources.android.kt:40)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) aVar.r(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        boolean z = (((i2 & 112) ^ 48) > 32 && aVar.o(i)) || (i2 & 48) == 32;
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            XmlResourceParser xml = resources.getXml(i);
            j4y0.b(xml);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            int[] iArr = d02.b;
            if (theme == null || (obtainAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0)) == null) {
                obtainAttributes = resources.obtainAttributes(asAttributeSet, iArr);
            }
            try {
                int resourceId = obtainAttributes.getResourceId(0, 0);
                ArrayList arrayList = new ArrayList();
                xml.next();
                while (!j4y0.a(xml) && (xml.getEventType() != 3 || !epx.f(xml.getName(), "animated-vector"))) {
                    if (xml.getEventType() == 2 && epx.f(xml.getName(), "target")) {
                        int[] iArr2 = d02.c;
                        if (theme == null || (obtainAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0)) == null) {
                            obtainAttributes2 = resources.obtainAttributes(asAttributeSet, iArr2);
                        }
                        try {
                            String string = obtainAttributes2.getString(0);
                            if (string == null) {
                                string = "";
                            }
                            jm2 jm2Var = new jm2(string, lr2.a(obtainAttributes2.getResourceId(1, 0), theme, resources));
                            obtainAttributes2.recycle();
                            arrayList.add(jm2Var);
                        } catch (Throwable th) {
                            obtainAttributes2.recycle();
                            throw th;
                        }
                    }
                    xml.next();
                }
                TypedValue typedValue = new TypedValue();
                resources.getValue(resourceId, typedValue, true);
                XmlResourceParser xml2 = resources.getXml(resourceId);
                k4y0.a(xml2);
                s3q0 s3q0Var = s3q0.a;
                yk2 yk2Var = new yk2(slr0.a(theme, resources, xml2, typedValue.changingConfigurations).a, arrayList);
                obtainAttributes.recycle();
                aVar.R(yk2Var);
                x = yk2Var;
            } catch (Throwable th2) {
                obtainAttributes.recycle();
                throw th2;
            }
        }
        yk2 yk2Var2 = (yk2) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return yk2Var2;
    }
}
