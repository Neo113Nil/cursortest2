package xsna;

import com.vk.dto.masks.Mask;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class bza0 implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((ems0) obj2).c), Integer.valueOf(((ems0) obj).c));
            default:
                return jw5.b(Integer.valueOf(-((Mask) obj).d), Integer.valueOf(-((Mask) obj2).d));
        }
    }
}
