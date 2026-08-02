package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.Collections;
import java.util.List;
import kotlin.a;

/* loaded from: classes4.dex */
public abstract class c350 {
    public static final i3y a = a.a(new ah40(15));

    public static final List a() {
        return (List) a.getValue();
    }

    public static final List b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                return j73.d0(strArr);
            }
        }
        return Collections.singletonList(applicationInfo.sourceDir);
    }
}
