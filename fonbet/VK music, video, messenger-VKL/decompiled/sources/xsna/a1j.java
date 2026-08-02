package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ConfigureRoomParticipantsListViewHolderEmptyRoom.kt */
/* loaded from: classes7.dex */
public final class a1j extends vfz<w0j> {
    public final Object l;

    public a1j(ViewGroup viewGroup) {
        super(R.layout.voip_session_rooms_admin_configure_room_participants_list_item_empty_room, viewGroup);
        this.l = msy.a(LazyThreadSafetyMode.NONE, new x5i(this, 1));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    public final void W5(w0j w0jVar) {
        boolean z = w0jVar.b;
        int b = cn70.b(z ? 92 : 32);
        ?? r1 = this.l;
        f4m.y(b, (TextView) r1.getValue());
        f4m.v(b, (TextView) r1.getValue());
        ((TextView) r1.getValue()).setText(z ? R.string.voip_session_room_participant_empty : R.string.voip_session_room_admin_room_participants_select);
    }
}
