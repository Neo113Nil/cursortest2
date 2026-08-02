package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CommunityScheduledClipsGridOwnerClipPreviewHolder.kt */
/* loaded from: classes5.dex */
public final class s0i extends RecyclerView.e0 implements View.OnClickListener {
    public final eqd l;
    public o0i m;

    public s0i(ViewGroup viewGroup, eqd eqdVar) {
        super(new u0i(viewGroup.getContext()));
        this.l = eqdVar;
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o0i o0iVar;
        if (view == null || jjc.b() || (o0iVar = this.m) == null) {
            return;
        }
        this.l.invoke(o0iVar);
    }
}
