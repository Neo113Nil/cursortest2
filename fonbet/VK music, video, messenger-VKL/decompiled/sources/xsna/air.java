package xsna;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import xsna.v2z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class air implements v2z.a {
    public static String b(char c, String str, String str2) {
        return str + str2 + c;
    }

    @Override // xsna.v2z.a
    public String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }
}
