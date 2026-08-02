package defpackage;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public abstract class jaa1 {
    public static final byte[] a = new byte[0];
    public static volatile h0w b;

    public static final syj0 a(ProtoAdapter protoAdapter, byte[] bArr) {
        try {
            return new lyj0(protoAdapter.decode(bArr));
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to decode bytes to proto";
            }
            return new jyj0(new puf0(message, e));
        }
    }

    public static final Map b(u1m u1mVar) {
        return u1mVar != null ? b.i(new Pair("queryPath", u1mVar.a), new Pair("queryParams", u1mVar.b.toString())) : b.f();
    }
}
