package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;

/* compiled from: MusicRecyclerDelayedAction.kt */
/* loaded from: classes3.dex */
public final class s350 {
    public final RecyclerView a;
    public final RecyclerView.Adapter<?> b;
    public final int c;
    public final Handler d;
    public int e;
    public int f;
    public m.d g;
    public Exception h;
    public final ef2 i;
    public final n93 j;

    public s350(RecyclerView recyclerView, RecyclerView.Adapter adapter, int i) {
        adapter = (i & 2) != 0 ? null : adapter;
        this.a = recyclerView;
        this.b = adapter;
        this.c = 3;
        this.d = new Handler(Looper.getMainLooper());
        this.i = new ef2(this, 16);
        this.j = new n93(this, 5);
    }

    public final void a(m.d dVar) {
        this.h = new Exception("MusicRecyclerDelayedAction.applyDiff");
        Handler handler = this.d;
        ef2 ef2Var = this.i;
        handler.removeCallbacks(ef2Var);
        this.g = dVar;
        handler.post(ef2Var);
    }
}
