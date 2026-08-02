package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.e3m;

/* compiled from: VhDisappearedMsg.kt */
/* loaded from: classes2.dex */
public final class brr0 extends osr0<crr0> {
    public static final /* synthetic */ int q = 0;
    public final TextView m;
    public pk30 n;
    public final bpn0 o;
    public List<Integer> p;

    public brr0(View view) {
        super(view);
        jjc.g(view, new rtg0(this, 14));
        bwt0.k0(view, new ape0(this, 23));
        TextView textView = (TextView) view.findViewById(R.id.title);
        Context context = view.getContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_icon_deprecated_bomb_outline_20, context);
        if (a != null) {
            a.setTint(e3m.f(R.attr.vk_legacy_text_secondary, view.getContext()));
        } else {
            a = null;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
        this.m = textView;
        this.o = new bpn0(new tfm0(view, 14));
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(crr0 crr0Var, pk30 pk30Var) {
        this.n = pk30Var;
        this.p = crr0Var.b;
        TextView textView = this.m;
        Resources resources = textView.getContext().getResources();
        List<Integer> list = this.p;
        if (list == null) {
            list = null;
        }
        int size = list.size();
        List<Integer> list2 = this.p;
        if (list2 == null) {
            list2 = null;
        }
        textView.setText(resources.getQuantityString(R.plurals.vkim_msg_expired, size, Integer.valueOf(list2.size())));
        textView.getBackground().setColorFilter(crr0Var.p() ? (fk30) this.o.getValue() : null);
    }
}
