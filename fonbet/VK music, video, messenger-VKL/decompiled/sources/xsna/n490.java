package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.broadcast.views.config.BroadcastConfigViewParams;
import com.vkontakte.android.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: OwnerAdapter.kt */
/* loaded from: classes7.dex */
public final class n490 extends androidx.recyclerview.widget.x<z590, e690> {
    public final BroadcastConfigViewParams c;
    public final ud8 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n490(BroadcastConfigViewParams broadcastConfigViewParams, ud8 ud8Var) {
        super(new androidx.recyclerview.widget.c(null, r1, r0));
        y590 y590Var = new y590();
        asu0.a.getClass();
        Executor o = asu0.o();
        if (o == null) {
            synchronized (c.a.a) {
                try {
                    if (c.a.b == null) {
                        ExecutorService D = asu0.D();
                        c.a.b = D == null ? Executors.newFixedThreadPool(2) : D;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            o = c.a.b;
        }
        this.c = broadcastConfigViewParams;
        this.d = ud8Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        e690 e690Var = (e690) e0Var;
        z590 item = getItem(i);
        e690Var.q = item;
        e690Var.r = this.d;
        VoipAvatarViewContainer voipAvatarViewContainer = e690Var.m;
        qvw0 qvw0Var = item.a;
        voipAvatarViewContainer.O(qvw0Var.i());
        TextView textView = e690Var.o;
        gdp gdpVar = e690Var.p;
        String a = qvw0Var.a();
        gdpVar.getClass();
        textView.setText(gdp.a(a));
        bwt0.p0(e690Var.n, item.b);
        e690Var.l.setContentDescription(qvw0Var.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = e690.s;
        return new e690(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.voip_broadcast_config_owner, viewGroup, false), this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        e690 e690Var = (e690) e0Var;
        e690Var.q = null;
        e690Var.r = null;
    }
}
