package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vkontakte.android.R;
import xsna.cwb0;

/* compiled from: LeaveRoomNavigation.kt */
/* loaded from: classes7.dex */
public final class hzy {
    public final Context a;
    public final gzs<FragmentManager> b;

    /* JADX WARN: Multi-variable type inference failed */
    public hzy(Context context, gzs<? extends FragmentManager> gzsVar) {
        this.a = context;
        this.b = gzsVar;
    }

    public final void a(boolean z) {
        if (z) {
            bzb0.d(new bzb0(this.a), new cwb0.a1(R.string.voip_session_room_leave_watch_together_submit_title, null, R.string.voip_session_room_leave_watch_together_submit_description, null, R.string.voip_session_room_leave_watch_together_submit_yes, null, R.string.voip_session_room_leave_watch_together_submit_no, null, null, null, 938), new nuj(this, 18), null, null, 28);
            return;
        }
        FragmentManager invoke = this.b.invoke();
        if (invoke == null || invoke.T()) {
            return;
        }
        com.vk.voip.ui.sessionrooms.b.a().n();
    }
}
