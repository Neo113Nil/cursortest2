package xsna;

import android.content.Context;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: FeatureManagerExt.kt */
/* loaded from: classes.dex */
public final class puq {
    public static final JSONObject a(b.a aVar) {
        b.d i;
        if (b() || (i = com.vk.toggle.b.A.i(aVar)) == null) {
            return null;
        }
        return i.g();
    }

    public static final boolean b() {
        b.d i = com.vk.toggle.b.A.i(Features.Type.FEATURE_CLIPS_TABLETS_DISABLED);
        if (i != null ? i.a : false) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            HashSet hashSet = iah0.a;
            if (fnj.b(context)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(b.a aVar, int i) {
        if ((i & 1) == 0) {
            b.d i2 = com.vk.toggle.b.A.i(aVar);
            return (b() || (i2 != null ? i2.a : false)) ? false : true;
        }
        b.d i3 = com.vk.toggle.b.A.i(aVar);
        boolean z = i3 != null ? i3.a : false;
        if (b() || !z) {
        }
    }
}
