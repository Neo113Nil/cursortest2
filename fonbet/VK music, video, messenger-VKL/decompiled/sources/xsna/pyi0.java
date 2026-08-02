package xsna;

import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: SetFolderCounterSettingCmd.kt */
/* loaded from: classes18.dex */
public final class pyi0 extends le6<s3q0> {
    public final FolderType b;
    public final boolean c;

    public pyi0(FolderType folderType, boolean z) {
        this.b = folderType;
        this.c = z;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.c1(true, LongPollType.MESSAGES);
        bz2.c(new oyi0(this.b, this.c), "SetFolderCounterSettingApiCmd");
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyi0)) {
            return false;
        }
        pyi0 pyi0Var = (pyi0) obj;
        return this.b == pyi0Var.b && this.c == pyi0Var.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("SetFolderCounterSettingCmd(folderType=");
        sb.append(this.b);
        sb.append(", value=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
