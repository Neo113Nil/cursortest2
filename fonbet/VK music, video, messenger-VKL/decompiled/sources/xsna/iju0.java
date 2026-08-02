package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.toggle.features.ImFeatures;

/* compiled from: VkChannelMessagesLinkInteractor.kt */
/* loaded from: classes11.dex */
public final class iju0 implements pf20 {
    public final iwv a;
    public final zyv b;

    public iju0(iwv iwvVar, zyv zyvVar) {
        this.a = iwvVar;
        this.b = zyvVar;
    }

    @Override // xsna.pf20
    public final void a(Context context, String str) {
        this.a.a(context, str);
    }

    @Override // xsna.pf20
    public final void b(Context context, String str) {
        this.a.b(context, str);
    }

    @Override // xsna.pf20
    public final void c(Context context, k320 k320Var) {
        new DialogExt(new Dialog(), (ProfilesInfo) null, 2, (zcl) null);
        this.a.c(context, k320Var);
    }

    @Override // xsna.pf20
    public final void d(Context context, String str) {
        this.a.d(context, str);
    }

    @Override // xsna.pf20
    public final void e(Context context, String str) {
        this.a.e(context, str);
    }

    @Override // xsna.pf20
    public final void f(Context context, long j, String str) {
        ImFeatures imFeatures = ImFeatures.CHANNEL_MSG_SEARCH;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            this.b.f(context, j, str);
        }
    }

    @Override // xsna.pf20
    public final void g(Context context, String str) {
        this.a.k(context, Peer.Unknown.e.d, str);
    }
}
