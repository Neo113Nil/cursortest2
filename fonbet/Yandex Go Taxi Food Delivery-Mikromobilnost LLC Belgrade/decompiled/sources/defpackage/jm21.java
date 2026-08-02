package defpackage;

import com.google.android.gms.location.DetectedActivity;
import java.util.Comparator;

/* loaded from: classes6.dex */
public final class jm21 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((DetectedActivity) obj2).getConfidence()).compareTo(Integer.valueOf(((DetectedActivity) obj).getConfidence()));
    }
}
