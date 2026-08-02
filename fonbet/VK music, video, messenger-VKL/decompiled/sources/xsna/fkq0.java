package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.Lambda;

/* compiled from: UserId.kt */
/* loaded from: classes.dex */
public final class fkq0 {
    public static volatile gzs<s3q0> a = a.i;

    /* compiled from: UserId.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ s3q0 invoke() {
            return s3q0.a;
        }
    }

    public static final UserId a(UserId userId) {
        return new UserId(Math.abs(userId.b));
    }

    public static final boolean b(UserId userId) {
        return userId.b < 0;
    }

    public static final boolean c(UserId userId) {
        return userId.b != 0;
    }

    public static final boolean d(UserId userId) {
        return userId.b > 0;
    }

    public static final UserId e(UserId userId) {
        return new UserId(-userId.b);
    }

    public static final UserId f(long j) {
        return new UserId(j);
    }

    public static final UserId g(UserId userId) {
        return e(userId);
    }
}
