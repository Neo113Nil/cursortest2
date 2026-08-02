package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.FolderType;
import xsna.dxj;
import xsna.wpm;

/* compiled from: DialogsFoldersDeleteCmd.kt */
/* loaded from: classes18.dex */
public final class gqm extends xl6<s3q0> {
    public final int b;

    public gqm(int i) {
        this.b = i;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-folder-common";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        int i = this.b;
        w2wVar.c1(true, LongPollType.MESSAGES);
        try {
            bz2.c(new yd20(i), "MessagesDeleteFolderApiCmd");
        } catch (VKApiExecutionException e) {
            int s = e.s();
            if (s == 100) {
                throw new IllegalArgumentException(e.t());
            }
            if (s != 974) {
                throw e;
            }
        }
        rdm e2 = w2wVar.I0().b().c().e(i);
        boolean z = (e2 != null ? e2.c : null) == FolderType.CHANNELS;
        rdm e3 = w2wVar.I0().b().c().e(i);
        if (e3 != null) {
            int i2 = wpm.a.$EnumSwitchMapping$0[e3.c.ordinal()];
            if (i2 == 1 || i2 == 2) {
                w2wVar.e1(w2wVar, new dxj.b(w2wVar));
            }
        }
        w2wVar.I0().b().c().a(i);
        s3q0 s3q0Var = s3q0.a;
        if (z) {
            w2wVar.e1(this, new v280("DialogsFoldersDeleteCmd"));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqm) && this.b == ((gqm) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("DialogsFoldersDeleteCmd(id="), this.b, ')');
    }
}
