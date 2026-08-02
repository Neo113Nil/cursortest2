package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.exceptions.IllegalDateFormatException;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Collections;

/* compiled from: PreviewProfileComponent.kt */
/* loaded from: classes2.dex */
public final class e5d0 extends j8i {
    public final Peer i;
    public final FragmentActivity j;
    public final a1w k;
    public final o0r0 l;
    public final g5d0 m;
    public final h5d0 n;
    public f5d0 o;

    public e5d0(Peer peer, FragmentActivity fragmentActivity, a1w a1wVar, o0r0 o0r0Var, g5d0 g5d0Var) {
        this.i = peer;
        this.j = fragmentActivity;
        this.k = a1wVar;
        this.l = o0r0Var;
        this.m = g5d0Var;
        h5d0 h5d0Var = new h5d0();
        this.n = h5d0Var;
        if (!peer.Ab(Peer.Type.USER)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        X0();
        I0(a1wVar.l.a().a0(asu0.a.c()).subscribe(new zk30(new fuc0(this, 2), 15), kwg0.b()));
        h5d0Var.a = this;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        Object obj;
        h5d0 h5d0Var = this.n;
        h5d0Var.getClass();
        View inflate = layoutInflater.inflate(R.layout.vkim_chat_preview_profile, viewGroup, false);
        h5d0Var.c = (AvatarView) inflate.findViewById(R.id.vkim_preview_profile_avatar);
        h5d0Var.d = (TextView) inflate.findViewById(R.id.vkim_preview_profile_name);
        h5d0Var.e = inflate.findViewById(R.id.vkim_preview_profile_friend_title);
        h5d0Var.f = (StackAvatarView) inflate.findViewById(R.id.vkim_preview_profile_mutual_friends_avatars);
        h5d0Var.g = (TextView) inflate.findViewById(R.id.vkim_preview_profile_mutual_friends_subtitle);
        h5d0Var.h = (Group) inflate.findViewById(R.id.vkim_preview_profile_mutual_friends);
        h5d0Var.i = (ImageView) inflate.findViewById(R.id.vkim_preview_profile_occupation_icon);
        h5d0Var.j = (TextView) inflate.findViewById(R.id.vkim_preview_profile_occupation_text);
        h5d0Var.k = (Group) inflate.findViewById(R.id.vkim_preview_profile_occupation);
        h5d0Var.l = (TextView) inflate.findViewById(R.id.vkim_preview_profile_city_text);
        h5d0Var.m = (Group) inflate.findViewById(R.id.vkim_preview_profile_city);
        h5d0Var.n = (TextView) inflate.findViewById(R.id.vkim_preview_profile_birthday_text);
        h5d0Var.o = (Group) inflate.findViewById(R.id.vkim_preview_profile_birthday);
        TextView textView = (TextView) inflate.findViewById(R.id.vkim_preview_profile_button);
        h5d0Var.p = textView;
        bwt0.i0(textView, new r8a0(h5d0Var, 7));
        h5d0Var.q = (ProgressWheel) inflate.findViewById(R.id.vkim_preview_profile_button_progress);
        h5d0Var.r = (TextView) inflate.findViewById(R.id.vkim_preview_profile_blocked_info);
        h5d0Var.t = (ConstraintLayout) inflate.findViewById(R.id.vkim_preview_profile_card);
        h5d0Var.s = (ProgressWheel) inflate.findViewById(R.id.vkim_preview_profile_loading_progress);
        h5d0Var.b = inflate;
        try {
            obj = itg0.d(h5d0Var.u, 100L);
        } catch (Throwable unused) {
            obj = null;
        }
        f5d0 f5d0Var = (f5d0) obj;
        if (f5d0Var != null) {
            h5d0Var.a(f5d0Var);
            zmp0.b((ViewGroup) inflate);
        }
        inflate.addOnAttachStateChangeListener(new i5d0(h5d0Var));
        Context context = inflate.getContext();
        String string = context.getString(R.string.vkim_msg_list_empty_hint_birthday);
        try {
            DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
            dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.months_full_dep));
            s3q0 s3q0Var = s3q0.a;
            h5d0Var.v = new SimpleDateFormat(string, dateFormatSymbols);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalDateFormatException(string, th));
        }
        return inflate;
    }

    public final void X0() {
        Source source = Source.ACTUAL;
        Peer peer = this.i;
        b1r0 b1r0Var = new b1r0(peer, source, 8);
        frs frsVar = new frs(peer, Collections.singletonList(source), false);
        a1w a1wVar = this.k;
        I0(io.reactivex.rxjava3.kotlin.c.e(io.reactivex.rxjava3.core.x.B(a1wVar.C(this, b1r0Var), a1wVar.C(this, frsVar).o(ers.g), io.reactivex.rxjava3.kotlin.b.b).q(io.reactivex.rxjava3.schedulers.a.b()), new lpd(1, this, e5d0.class, "onLoadFail", "onLoadFail(Ljava/lang/Throwable;)V", 0, 8), new kb40(this, 17)));
    }

    public final void Y0(boolean z) {
        f5d0 f5d0Var = this.o;
        if (f5d0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.n.u.onNext(f5d0.a(f5d0Var, null, z, 7));
    }

    public final io.reactivex.rxjava3.internal.operators.single.j Z0(io.reactivex.rxjava3.internal.operators.single.b0 b0Var) {
        return new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(b0Var, new j3z(new r820(this, 16), 12)), new lw30(new rxz(this, 17), 8)), new tra(this, 5));
    }
}
