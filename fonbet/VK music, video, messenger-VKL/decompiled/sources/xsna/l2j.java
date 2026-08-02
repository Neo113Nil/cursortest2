package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ConfigureSessionRoomsListViewHolderUnassignedHeader.kt */
/* loaded from: classes7.dex */
public final class l2j extends vfz<h2j> {
    public final Object l;
    public final Object m;

    public l2j(ViewGroup viewGroup) {
        super(R.layout.voip_session_rooms_admin_configure_room_participants_list_item_indicator, viewGroup);
        yce yceVar = new yce(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, yceVar);
        this.m = msy.a(lazyThreadSafetyMode, new kbe(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(h2j h2jVar) {
        ((TextView) this.l.getValue()).setText(R.string.voip_session_room_admin_participants_not_in_room);
        ((TextView) this.m.getValue()).setText(String.valueOf(h2jVar.b));
    }
}
