package xsna;

import android.graphics.Bitmap;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;

/* compiled from: EventConsumer.kt */
/* loaded from: classes2.dex */
public final class eyp implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ eyp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Dialog dialog;
        switch (this.b) {
            case 0:
                sxp sxpVar = (sxp) obj;
                ebm ebmVar = (ebm) this.c;
                if (!(sxpVar instanceof p680)) {
                    if (!(sxpVar instanceof OnCacheInvalidateEvent)) {
                        if (sxpVar instanceof r480) {
                            wpp<Long, Dialog> wppVar = ((r480) sxpVar).c;
                            ypp yppVar = ebmVar.m.b;
                            Long Sb = (yppVar == null || (dialog = (Dialog) yppVar.d) == null) ? null : dialog.Sb();
                            if (Sb != null && wppVar.b(Sb)) {
                                ebmVar.X0(wppVar.e(Sb));
                                break;
                            }
                        }
                    } else {
                        ebmVar.Y0(Source.CACHE);
                        break;
                    }
                } else {
                    ebmVar.Y0(Source.CACHE);
                    break;
                }
                break;
            default:
                Bitmap bitmap = (Bitmap) obj;
                pac0 pac0Var = (pac0) this.c;
                if (bitmap != null) {
                    io.reactivex.rxjava3.disposables.c cVar = pac0Var.l;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    pac0Var.h = bitmap;
                    pac0Var.b();
                    pac0Var.a.invalidate();
                    break;
                }
                break;
        }
    }
}
