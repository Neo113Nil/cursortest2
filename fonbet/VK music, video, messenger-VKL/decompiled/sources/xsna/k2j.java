package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ConfigureSessionRoomsListViewHolderRoom.kt */
/* loaded from: classes7.dex */
public final class k2j extends vfz<g2j> {
    public final nvg l;
    public final Object m;
    public final Object n;
    public final Object o;

    public k2j(ViewGroup viewGroup, nvg nvgVar) {
        super(R.layout.voip_session_rooms_admin_configure_room_list_item_room, viewGroup);
        this.l = nvgVar;
        fbh fbhVar = new fbh(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, fbhVar);
        this.n = msy.a(lazyThreadSafetyMode, new dnh(this, 6));
        this.o = msy.a(lazyThreadSafetyMode, new p5h(this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(g2j g2jVar) {
        g2j g2jVar2 = g2jVar;
        TextView textView = (TextView) this.m.getValue();
        lvi0 lvi0Var = g2jVar2.b;
        textView.setText(lvi0Var.a.b);
        w65.q((TextView) this.n.getValue(), lvi0Var, false);
        bwt0.i0(this.itemView, new m9(11, this, g2jVar2));
        if (lvi0Var.a.c) {
            h6().setImageResource(R.drawable.vk_icon_chevron_compact_right_24);
            ImageView h6 = h6();
            int b = cn70.b(16);
            h6.setPadding(b, b, b, b);
            bwt0.i0(h6(), new n9(5, this, g2jVar2));
            return;
        }
        h6().setImageResource(R.drawable.vk_icon_more_vertical_16);
        ImageView h62 = h6();
        int b2 = cn70.b(20);
        h62.setPadding(b2, b2, b2, b2);
        bwt0.i0(h6(), new o9(16, this, g2jVar2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView h6() {
        return (ImageView) this.o.getValue();
    }
}
