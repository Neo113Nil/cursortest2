package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.u8m;

/* compiled from: FolderDialogsListActionsProvider.kt */
/* loaded from: classes18.dex */
public final class lyr extends fo50 implements g4z {
    public final io.reactivex.rxjava3.disposables.b f;
    public volatile Object g;

    public lyr(int i, d0s d0sVar) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.f = bVar;
        this.g = EmptyList.b;
        hg1.e(bVar, d0sVar.b(i).subscribe(new mp0(new wcj(this, 12), 23), new el6(new bee(L.a, 2), 25)));
    }

    @Override // xsna.fo50
    public final ArrayList H(com.vk.im.engine.models.c cVar, DialogExt dialogExt, Peer peer) {
        ArrayList b = w8m.b(cVar, dialogExt, peer);
        b.remove(u8m.c.b);
        b.remove(u8m.m0.b);
        b.remove(u8m.u0.b);
        b.remove(u8m.t0.b);
        Dialog Cb = dialogExt.Cb();
        kdm kdmVar = Cb != null ? new kdm(Cb.Mb()) : null;
        if (kdmVar != null) {
            Iterable<cum0> iterable = (Iterable) this.g;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (cum0 cum0Var : iterable) {
                    if ((kdmVar.a & cum0Var.a) == cum0Var.b) {
                        return b;
                    }
                }
            }
        }
        b.add(u8m.n0.b);
        return b;
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        this.f.dispose();
    }
}
