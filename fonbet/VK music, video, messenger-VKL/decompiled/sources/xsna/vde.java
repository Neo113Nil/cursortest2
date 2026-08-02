package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;

/* compiled from: ClipsGridOwnerClipPreviewHolder.kt */
/* loaded from: classes17.dex */
public final class vde extends RecyclerView.e0 implements View.OnClickListener, View.OnLongClickListener {
    public final String l;
    public final yde m;
    public final s9 n;
    public final bpn0 o;
    public uee p;

    public vde(ViewGroup viewGroup, String str, yde ydeVar, s9 s9Var) {
        super(new dee(viewGroup.getContext()));
        this.l = str;
        this.m = ydeVar;
        this.n = s9Var;
        this.o = new bpn0(new defpackage.h(this, 22));
        this.itemView.setOnClickListener(this);
        this.itemView.setOnLongClickListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r1.f() != true) goto L21;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        uee ueeVar;
        ClipVideoFile clipVideoFile;
        VideoRestriction videoRestriction;
        if (view == null || jjc.b() || (ueeVar = this.p) == null) {
            return;
        }
        h270 h270Var = (h270) this.o.getValue();
        uee ueeVar2 = this.p;
        if (ueeVar2 != null && ((videoRestriction = (clipVideoFile = ueeVar2.a).O0) == null || videoRestriction.f)) {
            int i = emf.a;
            ceq0 ceq0Var = ueeVar2.b;
            if (clipVideoFile.r <= 0) {
                if (ceq0Var != null) {
                }
                this.m.invoke(ueeVar, h270Var);
            }
        }
        h270Var = null;
        this.m.invoke(ueeVar, h270Var);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        uee ueeVar;
        if (view == null || jjc.b() || (ueeVar = this.p) == null) {
            return false;
        }
        this.n.invoke(ueeVar);
        return true;
    }
}
