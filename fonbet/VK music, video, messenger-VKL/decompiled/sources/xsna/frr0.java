package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: VhFakeContact.kt */
/* loaded from: classes2.dex */
public final class frr0 extends vfz<ljq> {
    public static final /* synthetic */ int p = 0;
    public final mkr0 l;
    public final TextView m;
    public final TextView n;
    public final g3a0 o;

    public frr0(View view, mkr0 mkr0Var) {
        super(view);
        this.l = mkr0Var;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        this.m = (TextView) view.findViewById(R.id.text);
        this.n = (TextView) view.findViewById(R.id.subtitle);
        this.o = new g3a0();
        Context context = this.itemView.getContext();
        e3m.a aVar = e3m.a;
        avatarView.T0(null, new LayerDrawable(new Drawable[]{m33.a(R.drawable.user_placeholder, context), m33.a(R.drawable.user_placeholder_icon, this.itemView.getContext())}));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(ljq ljqVar) {
        String a = this.o.a(ljqVar.b);
        StringBuilder sb = new StringBuilder();
        int length = a.length();
        for (int i = 0; i < length; i++) {
            char charAt = a.charAt(i);
            if (Character.isDigit(charAt) || charAt == '+') {
                sb.append(charAt);
            }
        }
        bwt0.i0(this.itemView, new defpackage.h0(27, this, sb.toString()));
        this.m.setText(a);
        this.n.setText(a);
    }
}
