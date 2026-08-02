package xsna;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import com.huawei.hms.hihealth.data.Field;
import com.huawei.hms.hihealth.data.SamplePoint;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.TimeUnit;
import xsna.qvf0;

/* compiled from: MaterialColors.java */
/* loaded from: classes.dex */
public final class dm10 implements b9i {
    public static final /* synthetic */ dm10 b = new dm10();
    public static bpn0 c;
    public static bpn0 d;

    public static int a(int i, int i2) {
        return n8g.l(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(int i, int i2, @NonNull Context context) {
        Integer num;
        TypedValue a = jl10.a(i, context);
        if (a != null) {
            int i3 = a.resourceId;
            num = Integer.valueOf(i3 != 0 ? context.getColor(i3) : a.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int d(int i, @NonNull View view) {
        Context context = view.getContext();
        TypedValue c2 = jl10.c(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = c2.resourceId;
        return i2 != 0 ? context.getColor(i2) : c2.data;
    }

    public static final xhe0 e() {
        bpn0 bpn0Var = d;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (xhe0) bpn0Var.getValue();
    }

    public static boolean f(int i) {
        return i != 0 && n8g.f(i) > 0.5d;
    }

    public static int g(float f, int i, int i2) {
        return n8g.i(n8g.l(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static m0l0 h(SamplePoint samplePoint) {
        long startTime = samplePoint.getStartTime(TimeUnit.MILLISECONDS);
        float f = 0.0f;
        int i = 0;
        for (Field field : samplePoint.getDataType().getFields()) {
            if (field.getName().equals("steps")) {
                i += samplePoint.getFieldValue(field).asIntValue();
            } else if (field.getName().equals("distance")) {
                f += an10.b(samplePoint.getFieldValue(field).asFloatValue() / 10.0f) / 100.0f;
            }
        }
        return new m0l0(i, f, startTime, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (String) null, 96);
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return new qvf0.a(lcg0Var.e(jc01.class));
    }
}
