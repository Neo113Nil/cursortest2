package xsna;

import android.content.Context;
import android.util.TypedValue;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tj0 implements xw8 {
    public static float a(int i, float f, Context context) {
        return TypedValue.applyDimension(i, f, context.getResources().getDisplayMetrics());
    }

    public static Set c() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static void d(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    @Override // xsna.xw8
    public String k(evk evkVar) {
        String str = evkVar.i;
        return str != null ? str : evkVar.a.toString();
    }
}
