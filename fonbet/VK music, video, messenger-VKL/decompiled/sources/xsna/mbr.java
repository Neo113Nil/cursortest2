package xsna;

import java.util.LinkedList;

/* compiled from: FilesBatch.kt */
/* loaded from: classes8.dex */
public final class mbr {
    public final long a;
    public final LinkedList b;

    public mbr(long j, LinkedList linkedList) {
        this.a = j;
        this.b = linkedList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbr)) {
            return false;
        }
        mbr mbrVar = (mbr) obj;
        return this.a == mbrVar.a && this.b.equals(mbrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FilesBatch(size=" + this.a + ", filesForUploading=" + this.b + ")";
    }
}
