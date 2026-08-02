package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* compiled from: ConfigureSessionRoomsListViewHolderUnassignedParticipant.kt */
/* loaded from: classes7.dex */
public final class n2j extends vfz<i2j> {
    public final nvg l;
    public ParticipantId m;
    public final Object n;
    public final Object o;

    public n2j(ViewGroup viewGroup, nvg nvgVar) {
        super(R.layout.voip_session_rooms_admin_configure_room_list_item_unassigned_participant, viewGroup);
        this.l = nvgVar;
        sfg sfgVar = new sfg(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.n = msy.a(lazyThreadSafetyMode, sfgVar);
        this.o = msy.a(lazyThreadSafetyMode, new m2j(this, 0));
        bwt0.i0(this.itemView.findViewById(R.id.voip_unassigned_participant_move), new lbe(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(i2j i2jVar) {
        i2j i2jVar2 = i2jVar;
        ParticipantId participantId = this.m;
        ParticipantId participantId2 = i2jVar2.b;
        if (epx.f(participantId, participantId2)) {
            return;
        }
        this.m = participantId2;
        sew0 sew0Var = i2jVar2.c;
        ?? r1 = this.n;
        if (sew0Var != null) {
            ((VoipAvatarViewContainer) r1.getValue()).O(sew0Var);
            bwt0.p0((VoipAvatarViewContainer) r1.getValue(), true);
        } else {
            bwt0.p0((VoipAvatarViewContainer) r1.getValue(), false);
        }
        ((TextView) this.o.getValue()).setText(i2jVar2.d);
    }
}
