package xsna;

import android.view.View;
import com.vk.core.preference.Preference;
import xsna.g6o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class e6o implements View.OnClickListener {
    public final /* synthetic */ g6o b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ View.OnClickListener d;
    public final /* synthetic */ View.OnClickListener e;

    public /* synthetic */ e6o(g6o g6oVar, Long l, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.b = g6oVar;
        this.c = l;
        this.d = onClickListener;
        this.e = onClickListener2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g6o g6oVar = this.b;
        g6oVar.getClass();
        boolean z = Preference.j().getBoolean("doubleTapPostLike", true);
        s1v s1vVar = g6oVar.a;
        g6o.a aVar = g6oVar.c;
        Long l = this.c;
        View.OnClickListener onClickListener = this.d;
        if (!z) {
            if (l == null || !s1vVar.b(400L)) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        if (aVar.hasMessages(3)) {
            aVar.removeMessages(3);
            this.e.onClick(view);
        } else if (l == null || !s1vVar.b(l.longValue())) {
            g6oVar.d = new f6o(1, onClickListener, View.OnClickListener.class, "onClick", "onClick(Landroid/view/View;)V", 0);
            aVar.sendMessageDelayed(aVar.obtainMessage(3, view), g6oVar.b);
        }
    }
}
