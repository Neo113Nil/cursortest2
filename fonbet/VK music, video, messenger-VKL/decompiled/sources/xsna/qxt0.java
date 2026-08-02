package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: ViewHolder.java */
/* loaded from: classes15.dex */
public abstract class qxt0<T> {
    public final View a(Context context, View view, int i, Object obj) {
        if (view == null) {
            view = b(context);
            view.setTag(this);
        }
        c(context, obj, i);
        return view;
    }

    public abstract View b(Context context);

    public abstract void c(Context context, Object obj, int i);
}
