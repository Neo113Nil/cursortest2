package xsna;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.ProgressIconButton;
import com.vk.dto.user.RequestUserProfile;
import xsna.fss;

/* compiled from: FriendRequestClickListener.kt */
/* loaded from: classes16.dex */
public abstract class nis implements View.OnClickListener {
    public final ld6 b;
    public final lss<fss> c;
    public final pxo0 d;
    public View e;
    public FrameLayout f;
    public ProgressIconButton g;
    public FrameLayout h;
    public View i;
    public ImageView j;
    public VKAvatarView k;

    public nis(ld6 ld6Var, lss lssVar, pxo0 pxo0Var) {
        this.b = ld6Var;
        this.c = lssVar;
        this.d = pxo0Var;
    }

    public abstract RequestUserProfile a();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RequestUserProfile a = a();
        if (a == null) {
            return;
        }
        Bundle bundle = a.s;
        if (this.d.a()) {
            return;
        }
        View view2 = this.e;
        lss<fss> lssVar = this.c;
        if (view == view2 && !a.p0) {
            lssVar.a(new fss.b.d(a));
            return;
        }
        if (view == this.i) {
            lssVar.a(new fss.b.c(a));
            return;
        }
        if (view == this.j) {
            lssVar.a(new fss.b.C2893b(a));
            return;
        }
        if (view == this.k) {
            if (a.T) {
                lssVar.a(new fss.b.e(a));
                return;
            } else {
                lssVar.a(new fss.b.d(a));
                return;
            }
        }
        if (view == this.f) {
            lb6 lb6Var = new lb6(13, a, this);
            if (bundle.getInt("friend_request_status", 0) == 0) {
                lb6Var.invoke();
                return;
            }
            return;
        }
        if (view == this.g) {
            cy0 cy0Var = new cy0(14, this, a);
            if (bundle.getInt("friend_request_status", 0) == 0) {
                cy0Var.invoke();
                return;
            }
            return;
        }
        if (view == this.h && epx.f(a.i0, Boolean.TRUE)) {
            dy0 dy0Var = new dy0(13, this, a);
            if (bundle.getInt("friend_request_status", 0) == 0) {
                dy0Var.invoke();
            }
        }
    }
}
