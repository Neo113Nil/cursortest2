package xsna;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.ao$a;

/* compiled from: Version.java */
/* loaded from: classes8.dex */
public final class kgy0 {
    public static final kgy0 b = new kgy0(1);
    public static final kgy0 c = new kgy0(1798521807);
    public final int a;

    /* compiled from: Version.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ao$a.values().length];
            a = iArr;
            try {
                iArr[ao$a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ao$a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public kgy0(int i) {
        this.a = i;
    }

    public final byte[] a() {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.a);
        return allocate.array();
    }

    public final boolean b() {
        return this.a == 1798521807;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgy0) && this.a == ((kgy0) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i != 1 ? i != 1798521807 ? (i <= -16777216 || i > -16777182) ? go9.b("v-", Integer.toHexString(i)) : lhg.a(i - (-16777216), "draft-") : "v2" : "v1";
    }
}
