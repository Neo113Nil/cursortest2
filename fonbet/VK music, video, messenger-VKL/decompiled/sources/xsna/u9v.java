package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.fi20;

/* compiled from: HlsTrackMetadataEntry.java */
/* loaded from: classes12.dex */
public final class u9v implements fi20.a {

    @Nullable
    public final String a;

    @Nullable
    public final String b;
    public final List<a> c;

    /* compiled from: HlsTrackMetadataEntry.java */
    public static final class a {
        public final int a;
        public final int b;

        @Nullable
        public final String c;

        @Nullable
        public final String d;

        @Nullable
        public final String e;

        @Nullable
        public final String f;

        public a(int i, @Nullable String str, int i2, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c) && TextUtils.equals(this.d, aVar.d) && TextUtils.equals(this.e, aVar.e) && TextUtils.equals(this.f, aVar.f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public u9v(@Nullable String str, @Nullable String str2, List<a> list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u9v.class == obj.getClass()) {
            u9v u9vVar = (u9v) obj;
            if (TextUtils.equals(this.a, u9vVar.a) && TextUtils.equals(this.b, u9vVar.b) && this.c.equals(u9vVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.a;
        sb.append(str != null ? i5s.a(t33.a(" [", str, ", "), this.b, X3.j.e) : "");
        return sb.toString();
    }
}
