package xsna;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes18.dex */
public final class z5m implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Long.valueOf(((PackageInfo) obj).firstInstallTime), Long.valueOf(((PackageInfo) obj2).firstInstallTime));
            case 1:
                return jw5.b(Integer.valueOf(((kwe0) obj).f), Integer.valueOf(((kwe0) obj2).f));
            default:
                return jw5.b(((lb1) obj).b, ((lb1) obj2).b);
        }
    }
}
