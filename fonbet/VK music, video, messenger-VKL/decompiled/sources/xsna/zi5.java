package xsna;

import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes13.dex */
public final class zi5 implements mp70<n8e0> {
    public static final zi5 a = new zi5();
    public static final f7r b = f7r.b("messagingClientEventExtension");

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        np70Var.add(b, ((n8e0) obj).a());
    }
}
