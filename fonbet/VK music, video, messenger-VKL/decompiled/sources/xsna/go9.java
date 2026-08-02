package xsna;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.List;
import xsna.v2z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class go9 implements v2z.a {
    public static String b(String str, String str2) {
        return str + str2;
    }

    public static String c(String str, List list) {
        return str + list;
    }

    @Override // xsna.v2z.a
    public String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }
}
