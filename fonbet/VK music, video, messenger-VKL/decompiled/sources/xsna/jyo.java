package xsna;

import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jyo implements Runnable {
    public final /* synthetic */ myo b;
    public final /* synthetic */ spn0 c;
    public final /* synthetic */ spn0 d;
    public final /* synthetic */ AppCompatActivity e;
    public final /* synthetic */ View f;

    public /* synthetic */ jyo(myo myoVar, spn0 spn0Var, spn0 spn0Var2, AppCompatActivity appCompatActivity, View view) {
        this.b = myoVar;
        this.c = spn0Var;
        this.d = spn0Var2;
        this.e = appCompatActivity;
        this.f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.e.getWindow();
        spn0 spn0Var = this.c;
        g2h0 g2h0Var = spn0Var.c;
        View view = this.f;
        boolean booleanValue = ((Boolean) g2h0Var.invoke(view.getResources())).booleanValue();
        spn0 spn0Var2 = this.d;
        this.b.b(spn0Var, spn0Var2, window, view, booleanValue, ((Boolean) spn0Var2.c.invoke(view.getResources())).booleanValue());
    }
}
