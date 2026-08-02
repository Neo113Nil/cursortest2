package xsna;

import com.vk.profile.community.impl.ui.profile.a;
import com.vk.profile.community.impl.ui.profile.actions.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gij;

/* compiled from: CommunityProfileFeature.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class ooh extends FunctionReferenceImpl implements izs<gij.d, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(gij.d dVar) {
        gij.d dVar2 = dVar;
        com.vk.profile.community.impl.ui.profile.a aVar = (com.vk.profile.community.impl.ui.profile.a) this.receiver;
        aVar.getClass();
        if (epx.f(dVar2.a, aVar.i.a)) {
            int i = a.C1566a.$EnumSwitchMapping$0[dVar2.b.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                aVar.Y(new d.b.c(dVar2.c, dVar2.d));
            }
        }
        return s3q0.a;
    }
}
