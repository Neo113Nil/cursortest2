package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vkontakte.android.R;
import xsna.dh6;

/* compiled from: ClipsAutoScroll.kt */
/* loaded from: classes17.dex */
public final class uid extends ckd {
    public final zof b;
    public final zid c;

    /* compiled from: ClipsAutoScroll.kt */
    public static final class a implements dh6.a {
        public final /* synthetic */ ikd b;

        public a(ikd ikdVar) {
            this.b = ikdVar;
        }

        @Override // xsna.dh6.a
        public final void a() {
            dz20 dz20Var = this.b.e;
            if (dz20Var != null) {
                dz20Var.Ff("clips_autoscroll_settings");
            }
        }

        @Override // xsna.dh6.a
        public final void b() {
            dz20 dz20Var = this.b.e;
            if (dz20Var != null) {
                dz20Var.Qc("clips_autoscroll_settings");
            }
        }
    }

    public uid(zof zofVar, zid zidVar, sua suaVar) {
        super(ClipsBottomSheetOptions.CLIPS_AUTO_SCROLL.ordinal());
        this.b = zofVar;
        this.c = zidVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        if (!this.b.C().a || ci90.j(ikdVar)) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, null, activity.getString(R.string.clips_auto_scroll_title), null, this.c.isEnabled() ? activity.getString(R.string.clips_auto_scroll_enabled) : activity.getString(R.string.clips_auto_scroll_disabled), R.drawable.vk_icon_video_circle_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 10);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        sih0 sih0Var = ikdVar.h;
        if (sih0Var != null) {
            sih0Var.a(ClipsBottomSheetOptions.CLIPS_AUTO_SCROLL);
        }
        a.C0785a c0785a = new a.C0785a();
        xu20 xu20Var = new xu20(activity.getString(R.string.clips_auto_scroll_title), null, 0, null, 14);
        ModalActionSheetListItem.Appearance appearance = ModalActionSheetListItem.Appearance.Default;
        c0785a.b = e43.l(xu20Var, new ModalActionSheetListItem(0, appearance, activity.getString(R.string.clips_auto_scroll_enable), null, null, 0, null, this.c.isEnabled(), false, 376), new ModalActionSheetListItem(1, appearance, activity.getString(R.string.clips_auto_scroll_disable), null, null, 0, null, !r6.isEnabled(), false, 376));
        c0785a.c = new qu(this, 21);
        c0785a.e = new a(ikdVar);
        c0785a.a(activity, "clips_autoscroll_settings");
    }
}
