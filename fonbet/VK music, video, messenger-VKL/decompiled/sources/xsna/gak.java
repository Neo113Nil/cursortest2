package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CreateRoomsTimeLimitPresetViewHolder.kt */
/* loaded from: classes7.dex */
public final class gak extends vfz<fak> {
    public final lwh l;
    public final Object m;

    public gak(ViewGroup viewGroup, lwh lwhVar) {
        super(R.layout.voip_session_rooms_admin_create_rooms_time_preset_item, viewGroup);
        this.l = lwhVar;
        this.m = msy.a(LazyThreadSafetyMode.NONE, new ac(this, 26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(fak fakVar) {
        fak fakVar2 = fakVar;
        ?? r0 = this.m;
        ((TextView) r0.getValue()).setText(((TextView) r0.getValue()).getContext().getString(R.string.voip_session_room_admin_set_time_limit_min_pattern, Integer.valueOf(fakVar2.b)));
        ((TextView) r0.getValue()).setActivated(fakVar2.c);
        bwt0.i0(this.itemView, new td0(12, this, fakVar2));
    }
}
