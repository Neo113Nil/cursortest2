package xsna;

import com.vk.music.player.PlayerTrack;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cip0 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ cip0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                if (((PlayerTrack) obj).b.Pb()) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (!com.vk.core.utils.newtork.b.d()) {
                        return false;
                    }
                }
                return true;
            case 1:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue() % 4 == 2;
            default:
                return ((xmy0) obj).b();
        }
    }
}
