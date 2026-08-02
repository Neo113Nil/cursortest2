package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;

/* compiled from: WallShareResult.kt */
/* loaded from: classes5.dex */
public abstract class nax0 {

    /* compiled from: WallShareResult.kt */
    public static final class a extends nax0 {
        public final Throwable a;

        public a(VKApiExecutionException vKApiExecutionException) {
            this.a = vKApiExecutionException;
        }
    }

    /* compiled from: WallShareResult.kt */
    public static final class b extends nax0 {
        public final long a;
        public final UserId b;

        public b(long j, UserId userId) {
            this.a = j;
            this.b = userId;
        }
    }
}
