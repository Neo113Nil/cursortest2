package defpackage;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* loaded from: classes7.dex */
public final class l671 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((ScanResult) obj2).level).compareTo(Integer.valueOf(((ScanResult) obj).level));
    }
}
