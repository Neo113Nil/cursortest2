package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class mgo implements s820 {
    public static final a A;
    public static final a z;
    public final String a;
    public final String b;
    public final long c;
    public final long w;
    public final byte[] x;
    public int y;

    static {
        f7s f7sVar = new f7s();
        f7sVar.m = eh20.q("application/id3");
        z = new a(f7sVar);
        f7s f7sVar2 = new f7s();
        f7sVar2.m = eh20.q("application/x-scte35");
        A = new a(f7sVar2);
    }

    public mgo(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.w = j2;
        this.x = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mgo.class == obj.getClass()) {
            mgo mgoVar = (mgo) obj;
            if (this.c == mgoVar.c && this.w == mgoVar.w && Objects.equals(this.a, mgoVar.a) && Objects.equals(this.b, mgoVar.b) && Arrays.equals(this.x, mgoVar.x)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.s820
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.x;
        }
        return null;
    }

    @Override // defpackage.s820
    public final a getWrappedMetadataFormat() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return A;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return z;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.y == 0) {
            String str = this.a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.w;
            this.y = Arrays.hashCode(this.x) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.y;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.w + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
