package xsna;

import com.vk.push.common.Logger;
import kotlin.jvm.internal.Lambda;

/* compiled from: AuthTokenIPCInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class r65 extends Lambda implements gzs<Logger> {
    final /* synthetic */ Logger $logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r65(yhe0 yhe0Var) {
        super(0);
        this.$logger = yhe0Var;
    }

    @Override // xsna.gzs
    public final Logger invoke() {
        return this.$logger.createLogger("AuthTokenIPC");
    }
}
