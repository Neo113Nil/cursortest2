package xsna;

import com.vk.push.common.Logger;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushMessageRepository.kt */
/* loaded from: classes5.dex */
public final class tje0 {
    public final xip0 a;
    public final fje0 b;
    public final ske0 c;
    public final bpn0 d;

    /* compiled from: PushMessageRepository.kt */
    public static final class a extends Lambda implements gzs<Logger> {
        final /* synthetic */ Logger $logger;
        final /* synthetic */ tje0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Logger logger, tje0 tje0Var) {
            super(0);
            this.$logger = logger;
            this.this$0 = tje0Var;
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            return this.$logger.createLogger(this.this$0);
        }
    }

    public tje0(xip0 xip0Var, fje0 fje0Var, ske0 ske0Var, Logger logger) {
        this.a = xip0Var;
        this.b = fje0Var;
        this.c = ske0Var;
        this.d = new bpn0(new a(logger, this));
    }
}
