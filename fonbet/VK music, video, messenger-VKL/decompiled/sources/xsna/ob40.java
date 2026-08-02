package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.vk.music.player.PlayerTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MusicBigPlayerDraggingCallback.kt */
/* loaded from: classes3.dex */
public final class ob40 extends r.d implements Runnable {
    public final u2b0 e;
    public final Handler f = new Handler(Looper.getMainLooper());
    public RecyclerView.e0 g;
    public PlayerTrack h;
    public PlayerTrack i;
    public PlayerTrack j;
    public boolean k;

    /* compiled from: MusicBigPlayerDraggingCallback.kt */
    public static final class a {
    }

    public ob40(u2b0 u2b0Var) {
        this.e = u2b0Var;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        return r.d.l(3, 0);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean j() {
        return false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean k() {
        return true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        bz40 bz40Var = adapter instanceof bz40 ? (bz40) adapter : null;
        List<whp0> y0 = bz40Var != null ? bz40Var.y0() : null;
        if (y0 == null) {
            return false;
        }
        ArrayList arrayList = (ArrayList) y0;
        int size = arrayList.size();
        List<PlayerTrack> g = this.e.g();
        int adapterPosition = e0Var.getAdapterPosition();
        int adapterPosition2 = e0Var2.getAdapterPosition();
        if (adapterPosition2 < 0 || adapterPosition2 >= size || adapterPosition < 0 || adapterPosition >= size) {
            return false;
        }
        whp0 whp0Var = (whp0) arrayList.get(adapterPosition);
        PlayerTrack playerTrack = g.get(adapterPosition2);
        if (!(whp0Var instanceof xhp0)) {
            return false;
        }
        bn40.f("trackToMove=" + whp0Var + " targetTrack=" + playerTrack);
        if (adapterPosition < adapterPosition2) {
            int i = adapterPosition;
            while (i < adapterPosition2) {
                int i2 = i + 1;
                Collections.swap(y0, i, i2);
                i = i2;
            }
        } else {
            int i3 = adapterPosition2 + 1;
            if (i3 <= adapterPosition) {
                int i4 = adapterPosition;
                while (true) {
                    Collections.swap(y0, i4, i4 - 1);
                    if (i4 == i3) {
                        break;
                    }
                    i4--;
                }
            }
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyItemMoved(adapterPosition, adapterPosition2);
        }
        this.f.removeCallbacks(this);
        this.h = ((xhp0) whp0Var).a;
        this.i = playerTrack;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.r.d
    public final void o(RecyclerView.e0 e0Var, int i) {
        View view;
        Handler handler = this.f;
        if (i == 0) {
            handler.postDelayed(this, 300L);
        } else if (i == 2) {
            handler.removeCallbacks(this);
            if (e0Var != null && (view = e0Var.itemView) != null) {
                view.performHapticFeedback(0);
            }
            this.k = true;
            this.g = e0Var;
        }
        RecyclerView.e0 e0Var2 = this.g;
        PlayerTrack playerTrack = null;
        se50 se50Var = e0Var2 instanceof se50 ? (se50) e0Var2 : null;
        if (se50Var != null) {
            if (this.k) {
                T t = se50Var.l;
                if (t instanceof PlayerTrack) {
                    playerTrack = (PlayerTrack) t;
                }
            }
            this.j = playerTrack;
            se50Var.i6();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.k = false;
        PlayerTrack playerTrack = this.h;
        PlayerTrack playerTrack2 = this.i;
        if (playerTrack == null || playerTrack2 == null) {
            return;
        }
        this.e.H0(playerTrack, playerTrack2);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void p(RecyclerView.e0 e0Var) {
    }
}
