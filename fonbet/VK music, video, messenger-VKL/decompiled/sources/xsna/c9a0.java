package xsna;

import android.content.DialogInterface;
import com.vk.media.player.VideoMode;
import xsna.b9a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9a0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c9a0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((b9a0.c.C2599c) this.c).c.invoke();
                break;
            default:
                fbr0 fbr0Var = (fbr0) this.c;
                d0a b = fbr0Var.b();
                if (b != null) {
                    yg5 invoke = fbr0Var.b.invoke();
                    if (invoke != null) {
                        invoke.L(VideoMode.CHROMECAST);
                    }
                    xbc xbcVar = fbr0Var.c;
                    if (xbcVar != null) {
                        xbcVar.b(b);
                        break;
                    }
                }
                break;
        }
    }
}
