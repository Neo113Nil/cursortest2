package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.OccupationType;
import com.vk.dto.common.VerifyInfo;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import java.util.Calendar;

/* compiled from: VhGlobalPeer.kt */
/* loaded from: classes2.dex */
public final class krr0 extends vfz<n1u> {
    public static final /* synthetic */ int q = 0;
    public final mkr0 l;
    public final ImAvatarView m;
    public final TextView n;
    public final TextView o;
    public final DisplayNameFormatter p;

    public krr0(View view, mkr0 mkr0Var) {
        super(view);
        this.l = mkr0Var;
        this.m = (ImAvatarView) view.findViewById(R.id.avatar);
        this.n = (TextView) view.findViewById(R.id.text);
        this.o = (TextView) view.findViewById(R.id.subtitle);
        this.p = new DisplayNameFormatter(null, 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    @Override // xsna.vfz
    /* renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(n1u n1uVar) {
        Integer valueOf;
        String str;
        boolean z;
        gyh0<qtd0> gyh0Var = n1uVar.b;
        qtd0 qtd0Var = gyh0Var.a;
        bwt0.i0(this.itemView, new hs1(gyh0Var.b, this, qtd0Var, 7));
        this.m.s1(qtd0Var);
        DisplayNameFormatter displayNameFormatter = this.p;
        displayNameFormatter.getClass();
        String e = displayNameFormatter.e(qtd0Var, UserNameCase.NOM);
        TextView textView = this.n;
        textView.setText(e);
        boolean z2 = qtd0Var instanceof User;
        TextView textView2 = this.o;
        if (z2) {
            User user = (User) qtd0Var;
            User user2 = user != null ? user : null;
            if (user2 != null) {
                Integer num = user2.L;
                Integer num2 = user2.M;
                Integer num3 = user2.N;
                if (num != null && num2 != null && num3 != null) {
                    Calendar calendar = Calendar.getInstance();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(1, num3.intValue());
                    calendar2.set(2, num2.intValue() - 1);
                    calendar2.set(5, num.intValue());
                    int i = calendar.get(1) - calendar2.get(1);
                    if (calendar.get(2) < calendar2.get(2) || (calendar.get(2) == calendar2.get(2) && calendar.get(5) < calendar2.get(5))) {
                        i--;
                    }
                    valueOf = Integer.valueOf(i);
                    OccupationType occupationType = user.J;
                    str = user.K;
                    String str2 = user.I;
                    z = occupationType == OccupationType.UNKNOWN && !drm0.N(str);
                    if (valueOf == null && !drm0.N(str2)) {
                        str = this.itemView.getContext().getString(R.string.vkm_search_peer_description, this.itemView.getContext().getResources().getQuantityString(R.plurals.birthday_age, valueOf.intValue(), valueOf), str2);
                    } else if (!z && valueOf != null) {
                        str = this.itemView.getContext().getString(R.string.vkm_search_peer_description, this.itemView.getContext().getResources().getQuantityString(R.plurals.birthday_age, valueOf.intValue(), valueOf), str);
                    } else if (!z && !drm0.N(str2)) {
                        str = this.itemView.getContext().getString(R.string.vkm_search_peer_description, str, str2);
                    } else if (valueOf == null) {
                        str = this.itemView.getContext().getResources().getQuantityString(R.plurals.birthday_age, valueOf.intValue(), valueOf);
                    } else if (!drm0.N(str2)) {
                        str = str2;
                    } else if (!z) {
                        str = "";
                    }
                    if (drm0.N(str)) {
                        textView2.setVisibility(0);
                        textView2.setText(str);
                    } else {
                        f4m.j(textView2);
                    }
                }
            }
            valueOf = null;
            OccupationType occupationType2 = user.J;
            str = user.K;
            String str22 = user.I;
            if (occupationType2 == OccupationType.UNKNOWN) {
            }
            if (valueOf == null) {
            }
            if (!z) {
            }
            if (!z) {
            }
            if (valueOf == null) {
            }
            if (drm0.N(str)) {
            }
        } else {
            f4m.j(textView2);
        }
        VerifyInfo q9 = qtd0Var.q9();
        if (q9.Cb()) {
            VerifyInfoHelper.a.l(textView, q9, false, VerifyInfoHelper.ColorTheme.normal);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}
