package xsna;

import com.vk.bridges.CompanionApp;
import com.vk.companion.core.CompanionAppImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r6i implements wzs {
    public final /* synthetic */ q12 b;

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        CompanionApp.State state = (CompanionApp.State) obj;
        CompanionAppImpl companionAppImpl = (CompanionAppImpl) ((nig) this.b.c).b.get((String) obj2);
        if (companionAppImpl != null) {
            companionAppImpl.h.onNext(state);
        }
        return s3q0.a;
    }
}
