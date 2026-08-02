package xsna;

import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: State.kt */
/* loaded from: classes2.dex */
public final class ktk0 {
    public DialogExt a;
    public boolean b;
    public boolean c;
    public boolean d;
    public Throwable e;
    public boolean f;
    public InfoBar g;
    public boolean h;
    public InfoBar i;

    public ktk0(DialogExt dialogExt) {
        this.a = dialogExt;
    }

    public final InfoBar a() {
        Dialog Cb = this.a.Cb();
        InfoBar zb = Cb != null ? Cb.zb() : null;
        return zb == null ? this.g : zb;
    }

    public final qtd0 b() {
        Dialog Cb = this.a.Cb();
        if (Cb == null) {
            return null;
        }
        return this.a.b.Cb(Cb.Sb());
    }
}
