package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.utils.stats.TrackableError;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AuthErrorsTracker.kt */
/* loaded from: classes15.dex */
public final class a35 {

    /* compiled from: AuthErrorsTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackableError.values().length];
            try {
                iArr[TrackableError.INTERNAL_SERVER_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackableError.INVALID_REQUEST_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(vgg vggVar) {
        Throwable th = vggVar.a;
        boolean z = th instanceof VKApiExecutionException;
        TrackableError trackableError = (z && ((VKApiExecutionException) th).s() == 10) ? TrackableError.INTERNAL_SERVER_ERROR : (z && ((VKApiExecutionException) th).s() == 8) ? TrackableError.INVALID_REQUEST_ERROR : null;
        int i = trackableError == null ? -1 : a.$EnumSwitchMapping$0[trackableError.ordinal()];
        if (i != -1) {
            if (i == 1) {
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INTERNAL_SERVER_ERROR, null, null, null, null, null, null, 254);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ERROR_INVALID_REQUEST, null, null, null, null, null, null, 254);
            }
        }
    }
}
