package defpackage;

import okio.ByteString;

/* loaded from: classes9.dex */
public abstract class a {
    public static final byte[] a;

    static {
        ByteString byteString = new ByteString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes(uza.a));
        byteString.b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        a = byteString.getData();
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".getBytes(uza.a);
    }
}
