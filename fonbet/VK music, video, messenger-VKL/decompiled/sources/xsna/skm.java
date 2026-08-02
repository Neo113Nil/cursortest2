package xsna;

import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogTheme;
import xsna.it80;

/* compiled from: DialogThemeGetGluedByIdCmd.kt */
/* loaded from: classes2.dex */
public final class skm extends le6<it80<DialogTheme>> {
    public final com.vk.im.engine.models.dialogs.c b;
    public final com.vk.im.engine.models.dialogs.c c;
    public final Source d;

    public skm(com.vk.im.engine.models.dialogs.c cVar, com.vk.im.engine.models.dialogs.c cVar2, Source source) {
        this.b = cVar;
        this.c = cVar2;
        this.d = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final it80<DialogTheme> e(w2w w2wVar) {
        DialogTheme dialogTheme;
        DialogBackground dialogBackground;
        com.vk.im.engine.models.dialogs.c cVar = this.b;
        Source source = this.d;
        DialogTheme dialogTheme2 = (DialogTheme) ((it80) w2wVar.L0(this, new rkm(cVar, source))).a;
        DialogTheme dialogTheme3 = (DialogTheme) ((it80) w2wVar.L0(this, new rkm(this.c, source))).a;
        it80.a aVar = it80.b;
        if (dialogTheme2 != null) {
            if (dialogTheme3 == null || (dialogBackground = dialogTheme3.c) == null) {
                dialogBackground = dialogTheme2.c;
            }
            dialogTheme = DialogTheme.zb(dialogTheme2, null, dialogBackground, null, null, 13);
        } else {
            dialogTheme = null;
        }
        aVar.getClass();
        return new it80<>(dialogTheme);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skm)) {
            return false;
        }
        skm skmVar = (skm) obj;
        return epx.f(this.b, skmVar.b) && epx.f(this.c, skmVar.c) && this.d == skmVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.a.hashCode() * 31, 31, this.c.a);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogThemeGetGluedByIdCmd(colorsThemeId=" + this.b + ", backgroundThemeId=" + this.c + ", source=" + this.d + ')';
    }
}
