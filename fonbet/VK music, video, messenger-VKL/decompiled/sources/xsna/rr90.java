package xsna;

import android.view.ViewGroup;
import xsna.sr90;
import xsna.y5c;

/* compiled from: PayMethodHolder.kt */
/* loaded from: classes6.dex */
public class rr90<T extends sr90<?>> extends cb6<T> {
    public T o;

    public rr90(ViewGroup viewGroup, y5c.a aVar) {
        super(viewGroup, aVar);
        this.itemView.setOnClickListener(new te5(5, this, aVar));
    }

    @Override // xsna.cb6, xsna.vfz
    /* renamed from: h6 */
    public final void W5(T t) {
        super.W5(t);
        this.o = t;
    }
}
