package yads;

import android.net.wifi.ScanResult;
import java.util.Comparator;
import xsna.jw5;

/* loaded from: classes10.dex */
public final class yd2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return jw5.b(Integer.valueOf(((ScanResult) obj2).level), Integer.valueOf(((ScanResult) obj).level));
    }
}
