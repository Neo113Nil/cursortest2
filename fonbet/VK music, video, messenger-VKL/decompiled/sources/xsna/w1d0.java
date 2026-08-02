package xsna;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import me.grishka.appkit.fragments.BaseRecyclerFragment;

/* compiled from: Preloader.java */
/* loaded from: classes8.dex */
public final class w1d0<T> {
    public boolean c;
    public boolean d;
    public boolean e;
    public View f;
    public View g;
    public final BaseRecyclerFragment i;
    public final int j;
    public final ArrayList<T> a = new ArrayList<>();
    public final ArrayList<T> b = new ArrayList<>();
    public boolean h = true;
    public final boolean k = true;

    /* compiled from: Preloader.java */
    public interface a<T> {
        void A3(List<T> list);

        void Kj();

        boolean Lh();

        void q();
    }

    public w1d0(BaseRecyclerFragment baseRecyclerFragment, int i) {
        this.i = baseRecyclerFragment;
        this.j = i;
    }
}
