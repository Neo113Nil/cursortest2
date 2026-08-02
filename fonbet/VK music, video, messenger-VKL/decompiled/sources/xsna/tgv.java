package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: HsItemHolder.kt */
/* loaded from: classes16.dex */
public final class tgv extends RecyclerView.e0 {
    public final Context l;
    public final sec m;
    public final d9g n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tgv(Context context, sec secVar) {
        super(r0);
        d9g d9gVar = new d9g(context);
        d9gVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.l = context;
        this.m = secVar;
        this.n = (d9g) this.itemView;
    }
}
