package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.u0j;

/* compiled from: ConfigureRoomParticipantsListViewHolderCountIndicator.kt */
/* loaded from: classes7.dex */
public final class z0j extends vfz<u0j> {
    public final Object l;
    public final Object m;

    public z0j(ViewGroup viewGroup) {
        super(R.layout.voip_session_rooms_admin_configure_room_participants_list_item_indicator, viewGroup);
        ocg ocgVar = new ocg(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, ocgVar);
        this.m = msy.a(lazyThreadSafetyMode, new x3i(this, 2));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(u0j u0jVar) {
        u0j u0jVar2 = u0jVar;
        int i = u0jVar2.c;
        u0j.a aVar = u0jVar2.b;
        u0j.a aVar2 = u0j.a.ROOM_PARTICIPANTS_INDICATOR;
        ?? r2 = this.l;
        if (aVar == aVar2) {
            ((TextView) r2.getValue()).setText(R.string.voip_session_room_admin_room_participants);
        } else {
            ((TextView) r2.getValue()).setText(R.string.voip_session_room_admin_participants_not_in_room);
        }
        ?? r4 = this.m;
        bwt0.p0((TextView) r4.getValue(), i > 0);
        ((TextView) r4.getValue()).setText(String.valueOf(i));
    }
}
