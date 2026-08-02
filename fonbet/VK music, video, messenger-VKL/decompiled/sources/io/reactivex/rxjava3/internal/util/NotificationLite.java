package io.reactivex.rxjava3.internal.util;

import com.ironsource.X3;
import io.reactivex.rxjava3.core.v;
import java.io.Serializable;
import java.util.Objects;
import xsna.jxm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class NotificationLite {
    private static final /* synthetic */ NotificationLite[] $VALUES;
    public static final NotificationLite COMPLETE;

    /* loaded from: classes8.dex */
    public static final class a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final io.reactivex.rxjava3.disposables.c upstream;

        public a(io.reactivex.rxjava3.disposables.c cVar) {
            this.upstream = cVar;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.upstream + X3.j.e;
        }
    }

    public static final class b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;
        final Throwable e;

        public b(Throwable th) {
            this.e = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.e, ((b) obj).e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.e + X3.j.e;
        }
    }

    /* loaded from: classes8.dex */
    public static final class c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final jxm0 upstream;

        public c(jxm0 jxm0Var) {
            this.upstream = jxm0Var;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.upstream + X3.j.e;
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        COMPLETE = notificationLite;
        $VALUES = new NotificationLite[]{notificationLite};
    }

    public NotificationLite() {
        throw null;
    }

    public static boolean a(v vVar, Object obj) {
        if (obj == COMPLETE) {
            vVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            vVar.onError(((b) obj).e);
            return true;
        }
        vVar.onNext(obj);
        return false;
    }

    public static boolean b(v vVar, Object obj) {
        if (obj == COMPLETE) {
            vVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            vVar.onError(((b) obj).e);
            return true;
        }
        if (obj instanceof a) {
            vVar.onSubscribe(((a) obj).upstream);
            return false;
        }
        vVar.onNext(obj);
        return false;
    }

    public static Throwable c(Object obj) {
        return ((b) obj).e;
    }

    public static boolean d(Object obj) {
        return obj == COMPLETE;
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
