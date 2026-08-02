package xsna;

import com.vk.dto.newsfeed.TrackableOwner;
import com.vk.im.engine.models.messages.Msg;
import java.util.Comparator;
import xsna.r0l0;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class nj30 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ nj30(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((Msg) obj).b), Integer.valueOf(((Msg) obj2).b));
            case 1:
                return jw5.b(((r0l0.a) obj).a, ((r0l0.a) obj2).a);
            default:
                return jw5.b(Boolean.valueOf(((TrackableOwner) obj2).b.i(512)), Boolean.valueOf(((TrackableOwner) obj).b.i(512)));
        }
    }
}
