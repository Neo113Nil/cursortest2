package xsna;

import android.app.Application;
import com.my.tracker.MyTrackerConfig;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t33 implements MyTrackerConfig.InstalledPackagesProvider {
    public static StringBuilder a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    @Override // com.my.tracker.MyTrackerConfig.InstalledPackagesProvider
    public List getInstalledPackages() {
        Application application = uc00.c;
        if (application == null) {
            application = null;
        }
        return application.getPackageManager().getInstalledPackages(0);
    }
}
