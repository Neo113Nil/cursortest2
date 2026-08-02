package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;

/* compiled from: VhPeer.kt */
/* loaded from: classes2.dex */
public final class tur0 extends vfz<vt90> {
    public static final /* synthetic */ int q = 0;
    public final mkr0 l;
    public final AppCompatImageView m;
    public final ImAvatarView n;
    public final TextView o;
    public final ImageView p;

    public tur0(View view, mkr0 mkr0Var) {
        super(view);
        this.l = mkr0Var;
        this.m = (AppCompatImageView) view.findViewById(R.id.casper_icon);
        this.n = (ImAvatarView) view.findViewById(R.id.avatar);
        this.o = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.donut_icon);
        this.p = imageView;
        new DisplayNameFormatter(null, 3, null);
        imageView.setImageResource(R.drawable.vk_icon_donut_color_12);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(vt90 vt90Var) {
        vt90 vt90Var2 = vt90Var;
        gyh0<Dialog> gyh0Var = vt90Var2.b;
        ProfilesSimpleInfo profilesSimpleInfo = vt90Var2.c;
        String str = vt90Var2.e;
        Dialog dialog = gyh0Var.a;
        bwt0.i0(this.itemView, new r97(gyh0Var, this, dialog, profilesSimpleInfo, 4));
        this.n.r1(dialog, profilesSimpleInfo);
        TextView textView = this.o;
        textView.setText(str);
        qtd0 Ab = profilesSimpleInfo.Ab(dialog.Sb());
        VerifyInfo q9 = Ab != null ? Ab.q9() : null;
        if (q9 == null || !q9.Cb()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            VerifyInfoHelper.a.l(textView, q9, false, VerifyInfoHelper.ColorTheme.normal);
        }
        boolean sc = dialog.sc();
        AppCompatImageView appCompatImageView = this.m;
        if (sc) {
            bwt0.p0(appCompatImageView, true);
            bwt0.o0(appCompatImageView, c4g0.t(dialog.hc()));
        } else {
            bwt0.p0(appCompatImageView, false);
        }
        bwt0.p0(this.p, dialog.o1());
        if (vt90Var2.f) {
            this.itemView.setAlpha(1.0f);
        } else {
            this.itemView.setAlpha(0.4f);
        }
    }
}
