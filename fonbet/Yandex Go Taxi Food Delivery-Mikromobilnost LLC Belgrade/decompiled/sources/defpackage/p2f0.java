package defpackage;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p2f0 {
    public final Object a;
    public final Object b;
    public final byte[] c;
    public final KeyStatusType d;
    public final OutputPrefixType e;
    public final int f;
    public final String g;
    public final lhx h;

    public p2f0(Object obj, Object obj2, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i, String str, lhx lhxVar) {
        this.a = obj;
        this.b = obj2;
        this.c = Arrays.copyOf(bArr, bArr.length);
        this.d = keyStatusType;
        this.e = outputPrefixType;
        this.f = i;
        this.g = str;
        this.h = lhxVar;
    }
}
