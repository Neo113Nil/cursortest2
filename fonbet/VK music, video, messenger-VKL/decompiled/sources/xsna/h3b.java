package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChannelMessagesLinkLongClickHandler.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class h3b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                d3b.a((d3b) this.receiver);
                break;
            case 1:
                i9b.c((i9b) this.receiver);
                break;
            default:
                xwd0 xwd0Var = (xwd0) this.receiver;
                int i = xwd0.q;
                xwd0Var.h6();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(Object obj) {
        super(0, obj, i9b.class, "enableNotifications", "enableNotifications()V", 0);
        this.b = 1;
    }
}
