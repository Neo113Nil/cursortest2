package xsna;

import com.vk.im.engine.models.messages.MsgTemplate;
import java.util.Optional;

/* compiled from: MsgTemplateGetByIdCmd.kt */
/* loaded from: classes3.dex */
public final class i040 extends me6<Optional<MsgTemplate>> {
    public final int b;

    public i040(int i) {
        this.b = i;
    }

    @Override // xsna.me6
    public final Object e(w2w w2wVar, spj<? super Optional<MsgTemplate>> spjVar) {
        return Optional.ofNullable(w2wVar.I0().o().l(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i040) && this.b == ((i040) obj).b;
    }

    @Override // xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("MsgTemplateGetByIdCmd(id="), this.b, ')');
    }
}
