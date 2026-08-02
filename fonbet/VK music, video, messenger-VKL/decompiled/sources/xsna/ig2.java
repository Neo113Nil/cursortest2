package xsna;

import com.vk.dto.common.Attachment;
import java.util.Comparator;

/* compiled from: AnimateLayoutChangeDetector.java */
/* loaded from: classes12.dex */
public final class ig2 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ ig2(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 1:
                return jw5.b(Integer.valueOf(((Attachment) obj).Bb()), Integer.valueOf(((Attachment) obj2).Bb()));
            default:
                return jw5.b(Integer.valueOf(((e520) obj).e), Integer.valueOf(((e520) obj2).e));
        }
    }
}
