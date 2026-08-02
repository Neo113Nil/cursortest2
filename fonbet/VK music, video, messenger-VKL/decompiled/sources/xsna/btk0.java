package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.PinnedMsg;

/* compiled from: State.kt */
/* loaded from: classes2.dex */
public final class btk0 {
    public DialogExt a;
    public boolean b;
    public boolean c;
    public boolean d;
    public Throwable e;
    public boolean f;
    public boolean g;

    public btk0(DialogExt dialogExt) {
        this.a = dialogExt;
    }

    public final PinnedMsg a() {
        Dialog Cb = this.a.Cb();
        if (Cb != null) {
            return Cb.dc();
        }
        return null;
    }

    public final boolean b() {
        Dialog Cb = this.a.Cb();
        return Cb != null && Cb.ec();
    }
}
