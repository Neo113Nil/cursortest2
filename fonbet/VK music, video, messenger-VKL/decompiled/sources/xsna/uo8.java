package xsna;

import com.vk.pushes.dto.PushBusinessNotify;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes5.dex */
public final class uo8 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ uo8(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((PushBusinessNotify) obj).b, ((PushBusinessNotify) obj2).b);
            default:
                return jw5.b(Boolean.valueOf((((rpx0) obj).c.type & 1) == 0), Boolean.valueOf((((rpx0) obj2).c.type & 1) == 0));
        }
    }
}
