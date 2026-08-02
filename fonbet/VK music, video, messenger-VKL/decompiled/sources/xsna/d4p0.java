package xsna;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes11.dex */
public final class d4p0 implements View.OnClickListener {
    public final a40 b;
    public final /* synthetic */ androidx.appcompat.widget.d c;

    public d4p0(androidx.appcompat.widget.d dVar) {
        this.c = dVar;
        Context context = dVar.a.getContext();
        CharSequence charSequence = dVar.h;
        a40 a40Var = new a40();
        a40Var.e = 4096;
        a40Var.g = 4096;
        a40Var.l = null;
        a40Var.m = null;
        a40Var.n = false;
        a40Var.o = false;
        a40Var.p = 16;
        a40Var.i = context;
        a40Var.a = charSequence;
        this.b = a40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.appcompat.widget.d dVar = this.c;
        Window.Callback callback = dVar.k;
        if (callback == null || !dVar.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.b);
    }
}
