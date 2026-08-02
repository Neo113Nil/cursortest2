package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.util.TypedValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import java.lang.ref.WeakReference;
import xsna.jmw;

/* compiled from: PainterResources.android.kt */
/* loaded from: classes11.dex */
public final class pg90 {
    public static final lg90 a(int i, int i2, androidx.compose.runtime.a aVar) {
        TypedValue b;
        boolean z;
        lg90 rc7Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) aVar.r(AndroidCompositionLocals_androidKt.c);
        vag0 vag0Var = (vag0) aVar.r(AndroidCompositionLocals_androidKt.e);
        synchronized (vag0Var) {
            b = vag0Var.a.b(i);
            z = true;
            if (b == null) {
                b = new TypedValue();
                resources.getValue(i, b, true);
                vag0Var.a.h(i, b);
            }
        }
        CharSequence charSequence = b.string;
        if (charSequence == null || !drm0.F(charSequence, ".xml")) {
            aVar.K(-1771643000);
            Object theme = context.getTheme();
            boolean J = aVar.J(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !aVar.o(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean J2 = J | z | aVar.J(theme);
            Object x = aVar.x();
            if (J2 || x == a.C0011a.a) {
                try {
                    x = new aa2(((BitmapDrawable) resources.getDrawable(i, null)).getBitmap());
                    aVar.R(x);
                } catch (Exception e) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            rc7Var = new rc7((agw) x);
            aVar.j();
        } else {
            aVar.K(-1771798434);
            Resources.Theme theme2 = context.getTheme();
            int i3 = b.changingConfigurations;
            int i4 = (i2 << 6) & 896;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(21855625, i4, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
            }
            jmw jmwVar = (jmw) aVar.r(AndroidCompositionLocals_androidKt.d);
            jmw.b bVar = new jmw.b(i, theme2);
            WeakReference<jmw.a> weakReference = jmwVar.a.get(bVar);
            jmw.a aVar2 = weakReference != null ? weakReference.get() : null;
            if (aVar2 == null) {
                XmlResourceParser xml = resources.getXml(i);
                k4y0.a(xml);
                if (!epx.f(xml.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                aVar2 = slr0.a(theme2, resources, xml, i3);
                jmwVar.a.put(bVar, new WeakReference<>(aVar2));
            }
            imw imwVar = aVar2.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rc7Var = mlr0.f(imwVar, aVar, 0);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return rc7Var;
    }
}
