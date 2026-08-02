package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import xsna.k73;
import xsna.zr;

/* loaded from: classes8.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {
        private final String a;
        private volatile long b;
        private volatile long c;
        private long d = 0;
        private Object e = null;

        public CachedData(long j, long j2, @NonNull String str) {
            this.a = zr.a("[CachedData-", str, X3.j.e);
            this.b = j;
            this.c = j2;
        }

        @Nullable
        public T getData() {
            return (T) this.e;
        }

        public long getExpiryTime() {
            return this.c;
        }

        public long getRefreshTime() {
            return this.b;
        }

        public final boolean isEmpty() {
            return this.e == null;
        }

        public void setData(@Nullable T t) {
            this.e = t;
            this.d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public final boolean shouldClearData() {
            if (this.d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            return currentTimeMillis > this.c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            return currentTimeMillis > this.b || currentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("CachedData{tag='");
            sb.append(this.a);
            sb.append("', refreshTime=");
            sb.append(this.b);
            sb.append(", expiryTime=");
            sb.append(this.c);
            sb.append(", mCachedTime=");
            sb.append(this.d);
            sb.append(", mCachedData=");
            return k73.c(sb, this.e, '}');
        }
    }
}
