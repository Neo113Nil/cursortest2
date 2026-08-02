package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import kotlin.Pair;

/* compiled from: DialogGroupCallBannerHideCmd.kt */
/* loaded from: classes2.dex */
public final class jem extends le6<Boolean> {
    public final Dialog b;

    public jem(Dialog dialog) {
        this.b = dialog;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        final hpm c = sn.c(w2wVar);
        Dialog dialog = this.b;
        Long Sb = dialog.Sb();
        final long longValue = Sb.longValue();
        c.c.a(Sb, new zj(25), new izs() { // from class: xsna.vnm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                c.b.b().execSQL(defpackage.k0.a(longValue, "UPDATE dialogs SET group_call_banner_hidden_locally = 1 WHERE id = "));
                return s3q0.a;
            }
        });
        w2wVar.S0().A(null, new wpp<>(on00.f(new Pair(dialog.Sb(), dialog))));
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jem) && epx.f(this.b, ((jem) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogGroupCallBannerHideCmd(dialog=" + this.b + ')';
    }
}
