package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes12.dex */
public final class ht80<T> {
    public static final a e = new a();
    public final T a;
    public final b<T> b;
    public final String c;
    public volatile byte[] d;

    /* compiled from: Option.java */
    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public ht80(@NonNull String str, @Nullable T t, @NonNull b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.c = str;
        this.a = t;
        this.b = bVar;
    }

    @NonNull
    public static ht80 a(@NonNull Object obj, @NonNull String str) {
        return new ht80(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ht80) {
            return this.c.equals(((ht80) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return i5s.a(new StringBuilder("Option{key='"), this.c, "'}");
    }

    /* compiled from: Option.java */
    public class a implements b<Object> {
        @Override // xsna.ht80.b
        public final void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
