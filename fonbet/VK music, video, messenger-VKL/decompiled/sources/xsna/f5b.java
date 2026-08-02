package xsna;

import android.view.LayoutInflater;

/* compiled from: ChannelMsgSearchAdapter.kt */
/* loaded from: classes16.dex */
public final class f5b extends qul {
    public final s5b h;
    public final LayoutInflater i;

    public f5b(s5b s5bVar, LayoutInflater layoutInflater) {
        super(true);
        this.h = s5bVar;
        this.i = layoutInflater;
        setHasStableIds(true);
        x0(n5b.class, new e5(this, 19));
        x0(k5b.class, new com.vk.movika.sdk.base.observable.w(this, 17));
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.d.get(i).getItemId().longValue();
    }
}
