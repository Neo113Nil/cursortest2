package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.sharing.api.dto.Target;

/* compiled from: GroupPickerTargetViewHolder.kt */
/* loaded from: classes5.dex */
public final class slu extends RecyclerView.e0 implements View.OnClickListener {
    public final d4o0 l;
    public final u61 m;

    public slu(d4o0 d4o0Var, u61 u61Var) {
        super(d4o0Var);
        this.l = d4o0Var;
        this.m = u61Var;
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int absoluteAdapterPosition;
        Target target = this.l.getTarget();
        if (target == null || (absoluteAdapterPosition = getAbsoluteAdapterPosition()) == -1) {
            return;
        }
        this.m.invoke(target, Integer.valueOf(absoluteAdapterPosition));
    }
}
