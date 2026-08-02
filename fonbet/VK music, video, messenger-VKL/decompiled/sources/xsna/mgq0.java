package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.ui.AuthExchangeAvatarControlView;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.e3m;
import xsna.k0r0;

/* compiled from: UserCarouselAdapter.kt */
/* loaded from: classes15.dex */
public final class mgq0 extends RecyclerView.Adapter<k0r0> {
    public final com.vk.movika.tools.controls.seekbar.m c;
    public final om9 d;
    public final boolean e;
    public final ArrayList<UserItem> f = new ArrayList<>();
    public int g = -1;
    public boolean h;
    public boolean i;

    public mgq0(com.vk.movika.tools.controls.seekbar.m mVar, om9 om9Var, boolean z) {
        this.c = mVar;
        this.d = om9Var;
        this.e = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(k0r0 k0r0Var, int i) {
        int i2;
        int i3;
        Integer num;
        k0r0 k0r0Var2 = k0r0Var;
        int i4 = this.g;
        ArrayList<UserItem> arrayList = this.f;
        boolean z = (i == i4 && arrayList.size() > 1) || (arrayList.size() == 1 && ((UserItem) j5g.Y(arrayList)).j == AccountProfileType.EDU);
        UserItem userItem = arrayList.get(i);
        boolean z2 = this.h;
        boolean z3 = this.i;
        k0r0Var2.q = userItem;
        AuthExchangeAvatarControlView authExchangeAvatarControlView = k0r0Var2.n;
        authExchangeAvatarControlView.setImportantForAccessibility(2);
        TextView textView = k0r0Var2.o;
        textView.setImportantForAccessibility(2);
        authExchangeAvatarControlView.setEnabled(!z2);
        int i5 = userItem.i;
        authExchangeAvatarControlView.setNotificationsCount(i5);
        authExchangeAvatarControlView.setNotificationsIconVisible(i5 > 0 && !z3 && this.e);
        Drawable drawable = null;
        jjc.f(z3 ? null : k0r0Var2.p, authExchangeAvatarControlView);
        authExchangeAvatarControlView.setDeleteButtonVisible(z3);
        authExchangeAvatarControlView.g.h(userItem.b.b, userItem.h, adu0.a(6, authExchangeAvatarControlView.getContext()));
        textView.setText(userItem.d);
        Context context = k0r0Var2.itemView.getContext();
        if (k0r0.a.$EnumSwitchMapping$0[userItem.j.ordinal()] == 1) {
            i3 = R.attr.vk_ui_accent_purple;
            num = Integer.valueOf(R.attr.vk_ui_accent_purple);
            i2 = R.drawable.vk_auth_ic_edu_16;
        } else {
            i2 = R.drawable.vk_icon_done_16;
            i3 = R.attr.vk_ui_stroke_accent;
            num = null;
        }
        ImageView selectedIcon = authExchangeAvatarControlView.getSelectedIcon();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_auth_bg_exchange_selected_user, context);
        if (a != null) {
            if (num != null) {
                sjo.b(a, krv0.m(num.intValue(), context), PorterDuff.Mode.SRC_IN);
            }
            drawable = a;
        }
        selectedIcon.setBackground(drawable);
        selectedIcon.setImageDrawable(m33.a(i2, context));
        selectedIcon.setColorFilter(krv0.m(R.attr.vk_ui_icon_contrast_themed, context));
        authExchangeAvatarControlView.setBorderSelectionColor(krv0.m(i3, context));
        authExchangeAvatarControlView.setSelectionVisible(z && !z3);
        View view = k0r0Var2.itemView;
        CharSequence text = textView.getText();
        String f = enj.f(R.plurals.vk_notification_count_talkback, i5, k0r0Var2.itemView.getContext());
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        if (!f4m.g(authExchangeAvatarControlView.c)) {
            f = "";
        }
        sb.append((Object) f);
        view.setContentDescription(sb.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final k0r0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new k0r0(viewGroup, new exi0(this, 15), new qhg0(this, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int x0(UserItem userItem) {
        Object obj;
        Iterator it = j5g.W0(this.f).iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            if (!ztwVar.b.hasNext()) {
                obj = null;
                break;
            }
            obj = ztwVar.next();
            if (epx.f(((UserItem) ((xtw) obj).b).b, userItem.b)) {
                break;
            }
        }
        xtw xtwVar = (xtw) obj;
        if (xtwVar != null) {
            return xtwVar.a;
        }
        return 0;
    }
}
