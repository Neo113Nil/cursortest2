package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.vk.voip.ui.view.VoipActionSingleLineView;
import com.vkontakte.android.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.ifz;
import xsna.pg8;

/* compiled from: ListItemAdapter.kt */
/* loaded from: classes7.dex */
public final class kfz extends androidx.recyclerview.widget.x<ifz, RecyclerView.e0> {
    public final LayoutInflater c;
    public final pg8.a d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kfz(LayoutInflater layoutInflater, pg8.a aVar) {
        super(new androidx.recyclerview.widget.c(null, r1, r0));
        lfz lfzVar = new lfz();
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
        this.c = layoutInflater;
        this.d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ifz item = getItem(i);
        if (item instanceof ifz.b) {
            return 1;
        }
        if (item instanceof ifz.a) {
            return 2;
        }
        if (item instanceof ifz.e) {
            return 3;
        }
        if (item instanceof ifz.f) {
            return 4;
        }
        if (item instanceof ifz.c) {
            return 5;
        }
        if (item instanceof ifz.d) {
            return 6;
        }
        throw new UnsupportedOperationException("Unsupported item: " + item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ifz item = getItem(i);
        boolean z = e0Var instanceof ngz;
        pg8.a aVar = this.d;
        if (z) {
            ((ngz) e0Var).V5((ifz.b) item, aVar);
            return;
        }
        if (e0Var instanceof lgz) {
            ((lgz) e0Var).V5((ifz.a) item, aVar);
            return;
        }
        if (e0Var instanceof qgz) {
            ((qgz) e0Var).V5((ifz.e) item, aVar);
            return;
        }
        if (e0Var instanceof rgz) {
            ((rgz) e0Var).V5((ifz.f) item, aVar);
        } else if (e0Var instanceof ogz) {
            ((ogz) e0Var).V5((ifz.c) item, aVar);
        } else if (e0Var instanceof pgz) {
            ((pgz) e0Var).V5((ifz.d) item, aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 0;
        LayoutInflater layoutInflater = this.c;
        switch (i) {
            case 1:
                int i3 = ngz.m;
                VoipActionSingleLineView voipActionSingleLineView = (VoipActionSingleLineView) layoutInflater.inflate(R.layout.voip_broadcast_info_item_action, viewGroup, false);
                ngz ngzVar = new ngz(voipActionSingleLineView);
                voipActionSingleLineView.setIcon(R.drawable.vk_icon_share_outline_28);
                voipActionSingleLineView.setTitle(R.string.voip_broadcast_share_short);
                voipActionSingleLineView.setOpenIconVisible(true);
                bwt0.i0(voipActionSingleLineView, new mgz(ngzVar, i2));
                return ngzVar;
            case 2:
                int i4 = lgz.n;
                return new lgz((TextView) layoutInflater.inflate(R.layout.voip_broadcast_info_item_label, viewGroup, false));
            case 3:
                int i5 = qgz.o;
                return new qgz((ViewGroup) layoutInflater.inflate(R.layout.voip_broadcast_info_item_stats, viewGroup, false));
            case 4:
                int i6 = rgz.p;
                return new rgz((ViewGroup) layoutInflater.inflate(R.layout.voip_broadcast_info_item_stats, viewGroup, false));
            case 5:
                int i7 = ogz.p;
                return new ogz((ViewGroup) layoutInflater.inflate(R.layout.voip_broadcast_info_item_spectator, viewGroup, false));
            case 6:
                int i8 = pgz.n;
                return new pgz((TextView) layoutInflater.inflate(R.layout.voip_broadcast_info_item_spectators_count, viewGroup, false));
            default:
                throw new UnsupportedOperationException(lhg.a(i, "Unsupported viewType: "));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
        kgz kgzVar = (kgz) e0Var;
        kgzVar.l = null;
        kgzVar.a6();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        kgz kgzVar = (kgz) e0Var;
        kgzVar.l = null;
        kgzVar.a6();
    }
}
