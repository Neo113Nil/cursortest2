package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class kp3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kp3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((lp3) this.c).e.invoke();
                break;
            case 1:
                ((g4h) this.c).invoke(dialogInterface, Integer.valueOf(i));
                break;
            case 2:
                ((gzs) this.c).invoke();
                break;
            default:
                ((rr1) this.c).a();
                break;
        }
    }
}
