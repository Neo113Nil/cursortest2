package defpackage;

import com.squareup.wire.FieldEncoding;
import okio.ByteString;

/* loaded from: classes15.dex */
public abstract class k80 {
    public static final j80 a;
    public static final h80 b;
    public static final i80 c;
    public static final g80 d;
    public static final c80 e;
    public static final f80 f;
    public static final d80 g;
    public static final e80 h;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        Class cls = Long.TYPE;
        a = new j80(fieldEncoding, cls);
        b = new h80(fieldEncoding, cls);
        Class cls2 = Integer.TYPE;
        c = new i80(fieldEncoding, cls2);
        d = new g80(fieldEncoding, cls2);
        Class cls3 = Boolean.TYPE;
        e = new c80(fieldEncoding, cls3);
        f = new f80(fieldEncoding, cls3);
        FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
        g = new d80(fieldEncoding2, byte[].class);
        h = new e80(fieldEncoding2, ByteString.class);
    }

    public static int a(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }
}
