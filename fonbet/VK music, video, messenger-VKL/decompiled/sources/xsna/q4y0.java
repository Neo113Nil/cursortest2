package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class q4y0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q4y0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.b;
                byte[] bArr = (byte[]) obj;
                if (bArr.length > 65520) {
                    throw new RuntimeException("Certificate size not supported");
                }
                byteBuffer.put((byte) 0);
                byteBuffer.putShort((short) bArr.length);
                byteBuffer.put(bArr);
                byteBuffer.putShort((short) 0);
                return;
            case 1:
                ((fdy0) this.b).c = (f.b) obj;
                return;
            default:
                Map.Entry entry = (Map.Entry) obj;
                ((ArrayList) this.b).add(new AbstractMap.SimpleEntry(((String) entry.getKey()).toLowerCase(), (String) ((List) entry.getValue()).stream().collect(Collectors.joining(StringUtils.COMMA))));
                return;
        }
    }
}
