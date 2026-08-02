package xsna;

import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: DialogThemeCreateCmd.kt */
/* loaded from: classes2.dex */
public final class nkm extends le6<DialogTheme> {
    public final String b;
    public final DialogBackground c;

    public nkm(String str, DialogBackground dialogBackground) {
        this.b = str;
        this.c = dialogBackground;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final DialogTheme e(w2w w2wVar) {
        Source source = Source.CACHE;
        CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
        T t = ((it80) w2wVar.L0(this, new rkm(c.a.a(this.b), source))).a;
        if (t == 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        DialogTheme dialogTheme = (DialogTheme) t;
        c.h hVar = c.h.c;
        DialogTheme zb = DialogTheme.zb(dialogTheme, hVar, this.c, null, null, 12);
        w2wVar.I0().i().l(zb, dialogTheme, this.c.b);
        w2wVar.S0().T(hVar.a);
        return zb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkm)) {
            return false;
        }
        nkm nkmVar = (nkm) obj;
        return epx.f(this.b, nkmVar.b) && epx.f(this.c, nkmVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogThemeCreateCmd(colorsId=" + this.b + ", background=" + this.c + ')';
    }
}
