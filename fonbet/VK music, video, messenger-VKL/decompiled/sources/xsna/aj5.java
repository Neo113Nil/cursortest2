package xsna;

import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes12.dex */
public final class aj5 implements mp70<o8e0> {
    public static final aj5 a = new aj5();
    public static final f7r b = f7r.b("clientMetrics");

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        np70Var.add(b, ((o8e0) obj).a());
    }
}
