package xsna;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.y0j;

/* compiled from: ConfigureRoomParticipantsListViewHolderParticipant.kt */
/* loaded from: classes7.dex */
public final class c1j extends vfz<x0j> implements y0j.a {
    public final izs<j0j, s3q0> l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public x0j t;

    /* compiled from: ConfigureRoomParticipantsListViewHolderParticipant.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SessionRoomParticipantModel.Status.values().length];
            try {
                iArr[SessionRoomParticipantModel.Status.Missing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionRoomParticipantModel.Status.NotConnected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionRoomParticipantModel.Status.InCall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c1j(ViewGroup viewGroup, g1j g1jVar) {
        super(R.layout.voip_session_rooms_admin_configure_room_participants_list_item_participant, viewGroup);
        this.l = g1jVar;
        cwg cwgVar = new cwg(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, cwgVar);
        this.n = msy.a(lazyThreadSafetyMode, new z3i(this, 1));
        this.o = msy.a(lazyThreadSafetyMode, new z4f(this, 12));
        this.p = msy.a(lazyThreadSafetyMode, new yqf(this, 6));
        this.q = msy.a(lazyThreadSafetyMode, new zqf(this, 9));
        this.r = msy.a(lazyThreadSafetyMode, new b1j(this, 0));
        this.s = msy.a(lazyThreadSafetyMode, new defpackage.k(this, 28));
        bwt0.i0(this.itemView, new wje(this, 8));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    public final void W5(x0j x0jVar) {
        String str;
        x0j x0jVar2 = x0jVar;
        SessionRoomParticipantModel sessionRoomParticipantModel = x0jVar2.d;
        wk90 wk90Var = sessionRoomParticipantModel.g;
        sew0 sew0Var = wk90Var != null ? wk90Var.c : null;
        ?? r2 = this.n;
        if (sew0Var != null) {
            ((VoipAvatarViewContainer) r2.getValue()).O(sew0Var);
            bwt0.p0((VoipAvatarViewContainer) r2.getValue(), true);
        } else {
            bwt0.p0((VoipAvatarViewContainer) r2.getValue(), false);
        }
        TextView textView = (TextView) this.o.getValue();
        wk90 wk90Var2 = sessionRoomParticipantModel.g;
        if (wk90Var2 == null || (str = wk90Var2.b) == null) {
            str = "";
        }
        textView.setText(str);
        i6(x0jVar2);
        l6(x0jVar2);
        m6(x0jVar2);
        h6(x0jVar2);
        j6(x0jVar2);
        this.t = x0jVar2;
    }

    @Override // xsna.vfz
    public final void g6() {
        zmp0.b((ViewGroup) this.itemView);
        this.itemView.clearAnimation();
        this.t = null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void h6(x0j x0jVar) {
        SessionRoomParticipantModel sessionRoomParticipantModel = x0jVar.d;
        boolean z = x0jVar.c;
        boolean z2 = sessionRoomParticipantModel.d;
        ?? r2 = this.q;
        if (z2) {
            View view = this.itemView;
            qcy<Object>[] qcyVarArr = bwt0.a;
            view.setOnClickListener(null);
            this.itemView.setBackgroundResource(0);
            ((View) r2.getValue()).setVisibility(4);
            return;
        }
        if (sessionRoomParticipantModel.h || z) {
            bwt0.p0((View) r2.getValue(), true);
        } else {
            ((View) r2.getValue()).setVisibility(4);
        }
        if (this.itemView.getBackground() != null || z) {
            this.itemView.setBackgroundResource(0);
            return;
        }
        TypedValue typedValue = new TypedValue();
        this.itemView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        this.itemView.setBackgroundResource(typedValue.resourceId);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void i6(x0j x0jVar) {
        x0j x0jVar2 = this.t;
        if (x0jVar2 == null || x0jVar2.c != x0jVar.c) {
            boolean z = x0jVar.c;
            ?? r1 = this.m;
            boolean z2 = !z;
            bwt0.p0((ImageView) r1.getValue(), z2);
            ImageView imageView = (ImageView) r1.getValue();
            if (z2) {
                if (x0jVar.b instanceof SessionRoomId.Room) {
                    imageView.setImageResource(R.drawable.vk_icon_check_circle_on_24);
                    imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_icon_accent));
                } else {
                    imageView.setImageResource(R.drawable.vk_icon_check_circle_off_24);
                    imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_icon_tertiary));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void j6(x0j x0jVar) {
        x0j x0jVar2 = this.t;
        SessionRoomParticipantModel sessionRoomParticipantModel = x0jVar2 != null ? x0jVar2.d : null;
        SessionRoomParticipantModel sessionRoomParticipantModel2 = x0jVar.d;
        boolean z = x0jVar.c;
        if (x0jVar2 != null && x0jVar2.c == z && sessionRoomParticipantModel != null && sessionRoomParticipantModel.d == sessionRoomParticipantModel2.d && sessionRoomParticipantModel.f == sessionRoomParticipantModel2.f) {
            return;
        }
        boolean z2 = !z || (!sessionRoomParticipantModel2.d && sessionRoomParticipantModel2.f == SessionRoomParticipantModel.Status.InRoom);
        rdi.B((VoipAvatarViewContainer) this.n.getValue(), z2);
        rdi.B((TextView) this.o.getValue(), z2);
        rdi.B((TextView) this.p.getValue(), z2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void l6(x0j x0jVar) {
        x0j x0jVar2 = this.t;
        SessionRoomParticipantModel sessionRoomParticipantModel = x0jVar2 != null ? x0jVar2.d : null;
        SessionRoomParticipantModel sessionRoomParticipantModel2 = x0jVar.d;
        boolean z = x0jVar.c;
        boolean z2 = false;
        if (x0jVar2 == null || x0jVar2.c != z || sessionRoomParticipantModel == null || sessionRoomParticipantModel.b != sessionRoomParticipantModel2.b) {
            bwt0.p0((View) this.r.getValue(), z && sessionRoomParticipantModel2.b);
        }
        x0j x0jVar3 = this.t;
        if (x0jVar3 == null || x0jVar3.c != z || sessionRoomParticipantModel == null || sessionRoomParticipantModel.b != sessionRoomParticipantModel2.c) {
            View view = (View) this.s.getValue();
            if (z && sessionRoomParticipantModel2.c) {
                z2 = true;
            }
            bwt0.p0(view, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void m6(x0j x0jVar) {
        String string;
        x0j x0jVar2 = this.t;
        SessionRoomParticipantModel sessionRoomParticipantModel = x0jVar2 != null ? x0jVar2.d : null;
        SessionRoomParticipantModel sessionRoomParticipantModel2 = x0jVar.d;
        boolean z = x0jVar.c;
        if (x0jVar2 != null && x0jVar2.c == z && sessionRoomParticipantModel != null && sessionRoomParticipantModel.d == sessionRoomParticipantModel2.d && sessionRoomParticipantModel.e == sessionRoomParticipantModel2.e && sessionRoomParticipantModel.f == sessionRoomParticipantModel2.f) {
            return;
        }
        boolean z2 = z && (sessionRoomParticipantModel2.f != SessionRoomParticipantModel.Status.InRoom || sessionRoomParticipantModel2.e || sessionRoomParticipantModel2.d);
        ?? r2 = this.p;
        bwt0.p0((TextView) r2.getValue(), z2);
        TextView textView = (TextView) r2.getValue();
        if (z2) {
            SessionRoomParticipantModel sessionRoomParticipantModel3 = x0jVar.d;
            int i = a.$EnumSwitchMapping$0[sessionRoomParticipantModel3.f.ordinal()];
            if (i != 1) {
                string = i != 2 ? i != 3 ? sessionRoomParticipantModel3.e ? this.itemView.getContext().getString(R.string.voip_session_room_admin_room_participant_status_creator) : sessionRoomParticipantModel3.d ? this.itemView.getContext().getString(R.string.voip_session_room_admin_room_participant_status_admin) : "" : this.itemView.getContext().getString(R.string.voip_session_room_admin_room_participant_status_in_call) : this.itemView.getContext().getString(R.string.voip_session_room_admin_room_participant_status_pending);
            } else {
                wk90 wk90Var = sessionRoomParticipantModel3.g;
                string = (wk90Var == null || !wk90Var.d) ? this.itemView.getContext().getString(R.string.voip_session_room_admin_room_participant_status_unknown_male) : this.itemView.getContext().getString(R.string.voip_session_room_admin_room_participant_status_unknown_female);
            }
            textView.setText(string);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y0j.a
    public final void z2(y0j y0jVar) {
        ViewGroup viewGroup = (ViewGroup) this.itemView;
        zmp0.b(viewGroup);
        biq biqVar = new biq();
        biqVar.addTarget((View) this.r.getValue());
        ?? r2 = this.p;
        biqVar.addTarget((TextView) r2.getValue());
        biqVar.addTarget((TextView) r2.getValue());
        biqVar.addTarget((View) this.q.getValue());
        zmp0.a(viewGroup, biqVar);
        x0j x0jVar = y0jVar.a;
        i6(x0jVar);
        l6(x0jVar);
        m6(x0jVar);
        h6(x0jVar);
        j6(x0jVar);
        this.t = x0jVar;
    }
}
