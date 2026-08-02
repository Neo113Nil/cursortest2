package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.internal.entities.feedback.CallFeedbackReason;
import java.util.List;
import java.util.Set;

/* loaded from: classes15.dex */
public final class duq extends RecyclerView.Adapter {
    public final Context a;
    public final List b;
    public final Set c;
    public final i4b0 w;

    public duq(Context context, List list, Set set, i4b0 i4b0Var) {
        this.a = context;
        this.b = list;
        this.c = set;
        this.w = i4b0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        afi0 afi0Var = (afi0) x0Var;
        CallFeedbackReason callFeedbackReason = (CallFeedbackReason) this.b.get(i);
        boolean contains = this.c.contains(callFeedbackReason);
        afi0Var.N.setText(callFeedbackReason.description);
        afi0Var.a.setSelected(contains);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.a).inflate(olh0.msg_vh_call_feedback_reason, viewGroup, false);
        afi0 afi0Var = new afi0(inflate);
        inflate.setOnClickListener(new vsn(6, afi0Var, this));
        return afi0Var;
    }
}
