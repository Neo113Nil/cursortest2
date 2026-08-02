package xsna;

import com.vk.video.playlist.playlistscreen.ui.entity.NotificationsState;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;

/* compiled from: NotificationsSnackBar.kt */
/* loaded from: classes6.dex */
public final class fk70 {

    /* compiled from: NotificationsSnackBar.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationsState.values().length];
            try {
                iArr[NotificationsState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(NotificationsState notificationsState, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(132985977);
        int i2 = (M.o(notificationsState.ordinal()) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(132985977, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.NotificationsSnackBar (NotificationsSnackBar.kt:12)");
            }
            if (a.$EnumSwitchMapping$0[notificationsState.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mt(i, 5, notificationsState, q630Var2, izsVar);
        }
    }
}
