package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import defpackage.ny61;
import java.util.logging.Logger;

/* loaded from: classes10.dex */
public final class c {
    public final g a;
    public final byte[] b;

    public c(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        Logger logger = i.b;
        this.a = new g(bArr, i);
    }

    public final ByteString a() {
        g gVar = this.a;
        if (gVar.e - gVar.f == 0) {
            return new ByteString.LiteralByteString(this.b);
        }
        ny61.r("Did not write as much data as expected.");
        return null;
    }

    public final g b() {
        return this.a;
    }
}
