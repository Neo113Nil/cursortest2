package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.core.util.RecreateActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lad implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lad(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((kad) obj).invoke();
                break;
            case 1:
                Object obj2 = ((v3a0) obj).o;
                if (obj2 == null) {
                    obj2 = null;
                }
                g4a0 g4a0Var = ((x3a0) obj2).A;
                g4a0Var.getClass();
                g4a0Var.a(new rjd(com.vk.registration.funnels.b.a, 4));
                break;
            default:
                int i3 = RecreateActivity.b;
                RecreateActivity.a.b(0L, (Context) obj);
                break;
        }
    }
}
