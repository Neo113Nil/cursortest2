package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: RecyclerHolder.java */
/* loaded from: classes7.dex */
public abstract class vif0<T> extends UsableRecyclerView.x {
    public ViewGroup l;
    public T m;

    public vif0(int i, @NonNull Context context) {
        this(LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void V5(T t) {
        this.m = t;
        i6(t);
    }

    public final void W5(T t, @NonNull Object obj) {
        this.m = t;
        j6(t, obj);
    }

    public final String a6(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        return b6().getQuantityString(i, i2, objArr);
    }

    public final Resources b6() {
        return this.itemView.getContext().getResources();
    }

    public final String g6(int i) throws Resources.NotFoundException {
        return b6().getString(i);
    }

    public final T getItem() {
        return this.m;
    }

    public final String h6(int i, Object... objArr) throws Resources.NotFoundException {
        return b6().getString(i, objArr);
    }

    public abstract void i6(T t);

    public void j6(T t, @NonNull Object obj) {
        i6(t);
    }

    public final void o6() {
        V5(this.m);
    }

    public vif0(@NonNull ViewGroup viewGroup, int i, int i2) {
        this(tf3.b(viewGroup, i, viewGroup, false));
        this.l = viewGroup;
    }

    public vif0(View view) {
        super(view);
        this.l = null;
    }

    public vif0(View view, @NonNull ViewGroup viewGroup) {
        super(view);
        this.l = viewGroup;
    }

    @Deprecated
    public void l6() {
    }

    @Deprecated
    public void m6() {
    }
}
