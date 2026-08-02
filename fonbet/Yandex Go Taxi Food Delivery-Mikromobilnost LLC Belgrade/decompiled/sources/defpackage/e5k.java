package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class e5k implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cms b;

    public /* synthetic */ e5k(cms cmsVar, int i) {
        this.a = i;
        this.b = cmsVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.a;
        cms cmsVar = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((tls) cmsVar).invoke(view)).booleanValue();
            default:
                ((l2z) cmsVar).invoke();
                return true;
        }
    }
}
