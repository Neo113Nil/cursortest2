package xsna;

import com.vk.writebar.WriteBar;
import java.util.function.Predicate;
import one.video.calls.sdk_private.aB;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class i0y0 implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                int i = WriteBar.h0;
                return !(obj instanceof pvu0);
            default:
                return ((gey0) obj).c.equals(aB.a);
        }
    }
}
