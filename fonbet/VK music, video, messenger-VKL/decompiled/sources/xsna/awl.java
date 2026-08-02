package xsna;

import androidx.annotation.NonNull;
import io.jsonwebtoken.JwtParser;

/* compiled from: DelimitedVersion.java */
/* loaded from: classes15.dex */
public final class awl implements Comparable<awl> {
    public final long[] b;

    public awl(long[] jArr) {
        this.b = jArr;
    }

    public static awl b(String str) {
        if (str == null) {
            return new awl(new long[0]);
        }
        String[] split = str.split("[^0-9]+");
        long[] jArr = new long[split.length];
        int i = 0;
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                jArr[i] = Long.parseLong(str2);
                i++;
            }
        }
        do {
            i--;
            if (i < 0) {
                break;
            }
        } while (jArr[i] <= 0);
        int i2 = i + 1;
        long[] jArr2 = new long[i2];
        System.arraycopy(jArr, 0, jArr2, 0, i2);
        return new awl(jArr2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull awl awlVar) {
        long[] jArr;
        int i = 0;
        while (true) {
            jArr = this.b;
            if (i >= jArr.length) {
                break;
            }
            long[] jArr2 = awlVar.b;
            if (i >= jArr2.length) {
                break;
            }
            long j = jArr[i];
            long j2 = jArr2[i];
            int i2 = j >= j2 ? j > j2 ? 1 : 0 : -1;
            if (i2 != 0) {
                return i2;
            }
            i++;
        }
        long length = jArr.length;
        long length2 = awlVar.b.length;
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof awl) && compareTo((awl) obj) == 0;
    }

    public final int hashCode() {
        int i = 0;
        for (long j : this.b) {
            i = (i * 92821) + ((int) j);
        }
        return i;
    }

    public final String toString() {
        long[] jArr = this.b;
        if (jArr.length == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(jArr[i]);
        }
        return sb.toString();
    }
}
