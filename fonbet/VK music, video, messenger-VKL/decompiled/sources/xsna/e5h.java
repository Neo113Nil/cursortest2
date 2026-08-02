package xsna;

import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.d5h;
import xsna.z4h;

/* compiled from: CommunityInternalMenuItem.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class e5h extends FunctionReferenceImpl implements gzs<s3q0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final s3q0 invoke() {
        d5h.c cVar = (d5h.c) this.receiver;
        cVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.CLICK, (z4h.a) cVar.m, Integer.valueOf(((wak0) cVar.o).getIntValue())));
        return s3q0.a;
    }
}
