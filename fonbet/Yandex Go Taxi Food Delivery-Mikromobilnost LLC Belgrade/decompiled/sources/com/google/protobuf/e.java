package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.ny61;
import java.util.logging.Logger;

/* loaded from: classes11.dex */
public final class e {
    public final j a;
    public final byte[] b;

    public e(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        Logger logger = l.b;
        this.a = new j(bArr, i);
    }

    public final ByteString a() {
        if (this.a.A() == 0) {
            return new ByteString.LiteralByteString(this.b);
        }
        ny61.r("Did not write as much data as expected.");
        return null;
    }

    public final j b() {
        return this.a;
    }
}
