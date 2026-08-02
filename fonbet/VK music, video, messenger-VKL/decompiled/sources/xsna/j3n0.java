package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.SuggestMusicNotificationInfo;
import com.vk.stat.scheme.MobileOfficialAppsCorePushesStat$TypePushEventItem;
import com.vkontakte.android.R;
import java.util.Random;
import xsna.k840;
import xsna.uko;

/* compiled from: SuggestPlayMusicNotification.kt */
/* loaded from: classes3.dex */
public final class j3n0 extends com.vk.music.notifications.inapp.a {
    public final SuggestMusicNotificationInfo i;
    public final u750 j;
    public final k840.d k;
    public final gzs<UserId> l;
    public final u12 m = new u12(this, 11);
    public final int n = R.layout.popup_suggest_play_music_notification;
    public boolean o;
    public k3n0 p;
    public boolean q;

    public j3n0(SuggestMusicNotificationInfo suggestMusicNotificationInfo, u750 u750Var, k840.d dVar, gzs<UserId> gzsVar) {
        this.i = suggestMusicNotificationInfo;
        this.j = u750Var;
        this.k = dVar;
        this.l = gzsVar;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final int G() {
        return this.n;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void M() {
        bn40.f("HSNMan", "notification: start");
        this.j.H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action.RECEIVE, this.i.b);
        this.o = true;
        View view = this.d;
        u12 u12Var = this.m;
        if (view != null) {
            view.removeCallbacks(u12Var);
        }
        View view2 = this.d;
        if (view2 != null) {
            view2.postDelayed(u12Var, 6000L);
        }
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void N() {
        this.o = false;
        bn40.f("HSNMan", "notification: stop");
        View view = this.d;
        if (view != null) {
            view.removeCallbacks(this.m);
        }
        k3n0 k3n0Var = this.p;
        if (k3n0Var != null) {
            k3n0Var.e.release();
        }
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void d() {
        View view = this.d;
        if (view != null) {
            view.removeCallbacks(this.m);
        }
        if (this.o) {
            if (!this.q) {
                this.j.H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action.CLEAR, this.i.b);
            }
            super.d();
        }
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void d3(View view) {
        k840.d dVar = this.k;
        gzs<UserId> gzsVar = this.l;
        SuggestMusicNotificationInfo suggestMusicNotificationInfo = this.i;
        final k3n0 k3n0Var = new k3n0(suggestMusicNotificationInfo, dVar, gzsVar);
        View findViewById = view.findViewById(R.id.music_suggest_notification_header);
        ((TextView) view.findViewById(R.id.music_suggest_notification_title)).setText(suggestMusicNotificationInfo.c);
        ((TextView) view.findViewById(R.id.music_suggest_notification_message)).setText(suggestMusicNotificationInfo.d);
        TextView textView = (TextView) view.findViewById(R.id.play_button);
        Drawable e = enj.e(R.drawable.vk_icon_play_24, R.attr.vk_ui_icon_accent, textView.getContext());
        uko.a aVar = uko.a;
        textView.setCompoundDrawablesWithIntrinsicBounds(e, (Drawable) null, (Drawable) null, (Drawable) null);
        view.findViewById(R.id.frame_play_button).setOnClickListener(new q690(1, this, k3n0Var));
        TextView textView2 = (TextView) view.findViewById(R.id.music_shuffle_btn);
        textView2.setCompoundDrawablesWithIntrinsicBounds(enj.e(R.drawable.vk_icon_shuffle_24, R.attr.vk_ui_icon_accent, textView2.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
        view.findViewById(R.id.music_frame_shuffle_btn).setOnClickListener(new View.OnClickListener() { // from class: xsna.h3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j3n0 j3n0Var = j3n0.this;
                j3n0Var.q = true;
                Context context = view2.getContext();
                k3n0 k3n0Var2 = k3n0Var;
                k3n0Var2.f.H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action.SHUFFLE, k3n0Var2.a.b);
                xo4 xo4Var = new xo4(k3n0Var2.c.invoke(), 200);
                xo4Var.K("ref", k3n0Var2.d.t());
                xo4Var.C(1, "extended");
                xo4Var.C(1, "shuffle");
                int nextInt = new Random().nextInt();
                xo4Var.C(nextInt != 0 ? nextInt : 1, "shuffle_seed");
                rsg0.y0(xo4Var, null, null, 3).subscribe(new le50(new il7(18, k3n0Var2, context), 15), new o3y(new rgl0(8), 23));
                cvk.u(R.string.music_headphones_audios_started, false);
                j3n0Var.d();
            }
        });
        int i = 4;
        view.setOnClickListener(new wad(i, this, k3n0Var));
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.i3n0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                j3n0 j3n0Var = j3n0.this;
                j3n0Var.q = true;
                view2.performHapticFeedback(0);
                Context context = view2.getContext();
                k3n0 k3n0Var2 = k3n0Var;
                k840.d dVar2 = k3n0Var2.b;
                if (dVar2.b(context)) {
                    k3n0Var2.f.H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action.OPEN_SETTINGS, k3n0Var2.a.b);
                    dVar2.a(context);
                }
                j3n0Var.d();
                return true;
            }
        });
        int i2 = FloatingViewGesturesHelper.f;
        FloatingViewGesturesHelper.a.C0787a c0787a = new FloatingViewGesturesHelper.a.C0787a();
        c0787a.a = new mdm0(this, i);
        c0787a.b = new sh3(28, this, findViewById);
        c0787a.c = new r5i0(i, this, findViewById);
        c0787a.e = 0.25f;
        c0787a.f = 0.3f;
        c0787a.g = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
        c0787a.a(view);
        this.p = k3n0Var;
    }
}
