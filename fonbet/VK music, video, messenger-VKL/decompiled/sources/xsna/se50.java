package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MusicViewHolder.kt */
/* loaded from: classes3.dex */
public abstract class se50<T> extends RecyclerView.e0 {
    public static final /* synthetic */ int m = 0;
    public T l;

    public se50(int i, ViewGroup viewGroup) {
        super(tf3.b(viewGroup, i, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void V5(String str, boolean z, int i, Object obj) {
        this.l = obj;
        b6(obj);
        g6(str, z);
    }

    public abstract void b6(T t);

    public void a6() {
    }

    public void h6() {
    }

    public void i6() {
    }

    public void j6(s6o s6oVar) {
    }

    public void g6(String str, boolean z) {
    }
}
