package xsna;

import android.content.Context;
import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class epd implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ epd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                jpd jpdVar = (jpd) this.c;
                jpdVar.q(false);
                jpdVar.b.a0();
                break;
            case 1:
                ((nrd) this.c).invoke();
                break;
            default:
                ru.mail.libverify.k.b.a((Context) this.c, dialogInterface, i);
                break;
        }
    }
}
