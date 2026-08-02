package defpackage;

import android.graphics.PointF;
import com.yandex.go.eboks.objects.data.model.EboksType;
import com.yandex.go.eboks.objects.data.model.EboksTypeStyle;
import com.yandex.go.eboks.objects.data.model.EboksTypeStyleAutoScale;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class m2a1 {
    public static final String[] a = {"_display_name", "_size"};

    public static int a(String str, int i) {
        return unr0.b(i, 31, str);
    }

    public static final List b(EboksType eboksType) {
        EboksTypeStyle eboksTypeStyle = eboksType.e;
        EboksTypeStyleAutoScale eboksTypeStyleAutoScale = eboksTypeStyle != null ? eboksTypeStyle.b : null;
        if ((eboksTypeStyleAutoScale != null ? eboksTypeStyleAutoScale.a : null) != null) {
            Float f = eboksTypeStyleAutoScale.b;
            Float f2 = eboksTypeStyleAutoScale.d;
            Float f3 = eboksTypeStyleAutoScale.c;
            if (f != null && f3 != null && f2 != null) {
                return scc.g(new PointF(eboksTypeStyleAutoScale.a.floatValue(), eboksTypeStyleAutoScale.b.floatValue()), new PointF(f3.floatValue(), f2.floatValue()));
            }
        }
        return null;
    }

    public static final void c(String str) {
        xby.l(jst.e, "EBOKS_ERROR_GROUP_ID", null, new IllegalArgumentException(), str, 2);
    }
}
