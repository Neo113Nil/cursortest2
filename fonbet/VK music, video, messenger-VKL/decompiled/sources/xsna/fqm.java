package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.folder.FoldersLimitExceedException;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.FolderType;
import java.util.Collection;

/* compiled from: DialogsFoldersCreateCmd.kt */
/* loaded from: classes18.dex */
public final class fqm extends xl6<rpm> {
    public final String b;
    public final FolderType c;
    public final Collection<Peer> d;
    public final edi e = new edi(10);

    /* JADX WARN: Multi-variable type inference failed */
    public fqm(String str, FolderType folderType, Collection<? extends Peer> collection) {
        this.b = str;
        this.c = folderType;
        this.d = collection;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-folder-common";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        String str = this.b;
        FolderType folderType = this.c;
        w2wVar.c1(true, LongPollType.MESSAGES);
        try {
            int intValue = ((Number) bz2.c(new od20(str, folderType, this.d), "MessagesCreateFolderApiCmd")).intValue();
            w2wVar.I0().u(new eqm(intValue, 0, new rdm(intValue, str, folderType, folderType.k() << 1), w2wVar, this));
            w2wVar.K().h().b();
            if (folderType == FolderType.CHANNELS) {
                w2wVar.e1(this, new v280("DialogsFoldersCreateCmd"));
            }
            this.e.getClass();
            return new rpm(intValue, str, folderType);
        } catch (VKApiExecutionException e) {
            int s = e.s();
            if (s == 100) {
                throw new IllegalArgumentException(e.t());
            }
            if (s != 975) {
                throw e;
            }
            throw new FoldersLimitExceedException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqm)) {
            return false;
        }
        fqm fqmVar = (fqm) obj;
        return epx.f(this.b, fqmVar.b) && this.c == fqmVar.c && epx.f(this.d, fqmVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsFoldersCreateCmd(name=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", includedPeers=");
        return l4.h(sb, this.d, ')');
    }
}
