package xsna;

import com.vk.im.engine.models.ImBgSyncState;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ba4 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(!((List) obj).isEmpty());
            default:
                return Boolean.valueOf(((ImBgSyncState) obj) == ImBgSyncState.REFRESHED);
        }
    }
}
