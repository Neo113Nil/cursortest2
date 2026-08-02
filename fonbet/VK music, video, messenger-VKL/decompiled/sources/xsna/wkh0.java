package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.common.id.UserId;

/* compiled from: SdkSubscriptionDelegate.kt */
/* loaded from: classes17.dex */
public interface wkh0 {

    /* compiled from: SdkSubscriptionDelegate.kt */
    public static final class a {
    }

    /* compiled from: SdkSubscriptionDelegate.kt */
    public interface b {

        /* compiled from: SdkSubscriptionDelegate.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1321037253;
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: SdkSubscriptionDelegate.kt */
        /* renamed from: xsna.wkh0$b$b, reason: collision with other inner class name */
        public static final class C3939b implements b {
            public static final C3939b a = new C3939b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3939b);
            }

            public final int hashCode() {
                return -68531146;
            }

            public final String toString() {
                return "Spinner";
            }
        }
    }

    void a(Context context, nlh0 nlh0Var, b bVar, String str, izs<? super SdkVideoFile, s3q0> izsVar);

    void b(Context context, UserId userId, SdkVideoFile sdkVideoFile, b bVar, rzl0 rzl0Var);

    void c(Context context, UserId userId, SdkVideoFile sdkVideoFile, b bVar, wug0 wug0Var);

    void d(Context context, nlh0 nlh0Var, b bVar, twb twbVar);
}
