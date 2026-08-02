package xsna;

import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: NewsfeedLifecycleState.kt */
@vby
/* loaded from: classes4.dex */
public final class wn60 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static byte a(byte b, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        ?? r4 = z;
        if ((i & 1) != 0) {
            r4 = (b & 1) != 0 ? 1 : 0;
        }
        if ((i & 2) != 0) {
            z2 = (b & 2) != 0;
        }
        if ((i & 4) != 0) {
            z3 = b(b);
        }
        if ((i & 8) != 0) {
            z4 = (b & 8) != 0;
        }
        if ((i & 16) != 0) {
            z5 = (b & AmfConstants.TYPE_TYPED_OBJECT_MARKER) != 0;
        }
        if (z2) {
            r4 = (r4 == true ? 1 : 0) | 2;
        }
        if (z3) {
            r4 = (r4 == true ? 1 : 0) | 4;
        }
        if (z4) {
            r4 = (r4 == true ? 1 : 0) | '\b';
        }
        if (z5) {
            r4 = (r4 == true ? 1 : 0) | 16;
        }
        return (byte) r4;
    }

    public static final boolean b(byte b) {
        return (b & 4) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wn60) {
            return this.a == ((wn60) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("NewsfeedLifecycleState(packed=", this.a, ')');
    }
}
