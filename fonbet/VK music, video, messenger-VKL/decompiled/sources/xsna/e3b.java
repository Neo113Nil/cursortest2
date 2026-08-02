package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChannelMessagesLinkLongClickHandler.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class e3b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ e3b(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                d3b.a((d3b) this.receiver);
                break;
            default:
                ((i9b) this.receiver).o();
                break;
        }
        return s3q0.a;
    }

    public e3b(Object obj) {
        super(0, obj, i9b.class, "unarchiveChannel", "unarchiveChannel()V", 0);
    }
}
