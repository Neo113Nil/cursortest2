package xsna;

import com.vk.contacts.AndroidContact;
import java.util.Collections;
import java.util.List;
import xsna.it80;

/* compiled from: ContactImportNonSyncedCmd.kt */
/* loaded from: classes2.dex */
public final class r8j extends xl6<it80<Long>> {
    public final AndroidContact b;
    public final boolean c;

    public r8j(AndroidContact androidContact, boolean z) {
        this.b = androidContact;
        this.c = z;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-contacts-sync";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        AndroidContact androidContact = this.b;
        List list = (List) w2wVar.b1(this, new q8j(Collections.singletonList(androidContact), false, this.c, false, true));
        w2wVar.getConfig().l().W0(androidContact);
        if (list.isEmpty()) {
            it80.b.getClass();
            return it80.a.a();
        }
        it80.a aVar = it80.b;
        Object Y = j5g.Y(list);
        aVar.getClass();
        return new it80(Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8j)) {
            return false;
        }
        r8j r8jVar = (r8j) obj;
        return epx.f(this.b, r8jVar.b) && this.c == r8jVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactImportNonSyncedCmd(androidContact=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        return n23.b(sb, this.c, ", isInCommonQueue=false)");
    }
}
