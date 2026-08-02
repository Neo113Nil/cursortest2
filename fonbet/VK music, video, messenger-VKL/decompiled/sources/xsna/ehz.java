package xsna;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class ehz<L> {
    public final Executor a;

    @Nullable
    public volatile a b;

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public static final class a<L> {
        public final Object a;
        public final String b;

        public a(L l, String str) {
            this.a = l;
            this.b = str;
        }

        @NonNull
        public final String a() {
            int identityHashCode = System.identityHashCode(this.a);
            String str = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length());
            sb.append(str);
            sb.append("@");
            sb.append(identityHashCode);
            return sb.toString();
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public interface b<L> {
        void notifyListener(@NonNull L l);

        void onNotifyListenerFailed();
    }

    public ehz(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.a = new ltu(looper);
        exc0.j(l, "Listener must not be null");
        exc0.f(str);
        this.b = new a(l, str);
    }

    public final void a() {
        this.b = null;
    }

    @Nullable
    public final a<L> b() {
        return this.b;
    }

    public final void c(@NonNull b<? super L> bVar) {
        exc0.j(bVar, "Notifier must not be null");
        this.a.execute(new oiy0(this, bVar));
    }

    public ehz(@NonNull Object obj, @NonNull String str, @NonNull Executor executor) {
        exc0.j(executor, "Executor must not be null");
        this.a = executor;
        exc0.j(obj, "Listener must not be null");
        exc0.f(str);
        this.b = new a(obj, str);
    }
}
