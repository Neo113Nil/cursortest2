package io.jsonwebtoken.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.jsonwebtoken.lang.Assert;
import java.nio.charset.Charset;

@Deprecated
/* loaded from: classes8.dex */
public abstract class AbstractTextCodec implements TextCodec {
    protected static final Charset UTF8 = Charset.forName(C.UTF8_NAME);
    protected static final Charset US_ASCII = Charset.forName(C.ASCII_NAME);

    @Override // io.jsonwebtoken.impl.TextCodec
    public String decodeToString(String str) {
        return new String(decode(str), UTF8);
    }

    @Override // io.jsonwebtoken.impl.TextCodec
    public String encode(String str) {
        Assert.hasText(str, "String argument to encode cannot be null or empty.");
        return encode(str.getBytes(UTF8));
    }
}
