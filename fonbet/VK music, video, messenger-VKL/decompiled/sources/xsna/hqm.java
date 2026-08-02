package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.im.engine.exceptions.folder.FolderNotFoundException;
import com.vk.im.engine.exceptions.folder.PeerLimitInFolderExceedException;
import com.vk.im.engine.models.LongPollType;
import java.util.ArrayList;

/* compiled from: DialogsFoldersEditCmd.kt */
/* loaded from: classes18.dex */
public final class hqm extends xl6<s3q0> {
    public final int b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public hqm(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = i;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-folder-common";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        w2wVar.c1(true, LongPollType.MESSAGES);
        pdm c = w2wVar.I0().b().c();
        int i = this.b;
        rdm e = c.e(i);
        if (e == null) {
            throw new IllegalArgumentException(lhg.a(i, "Non-existing folder ").toString());
        }
        String str = e.b;
        String str2 = this.c;
        if (epx.f(str, str2)) {
            str2 = null;
        }
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.e;
        try {
            bz2.c(new bh20(i, str2, arrayList, arrayList2), "MessagesUpdateFolderApiCmd");
            new zpm(arrayList, this.b, arrayList2, this.c, null).o(w2wVar);
            return s3q0.a;
        } catch (VKApiExecutionException e2) {
            int s = e2.s();
            if (s == 100) {
                throw new IllegalArgumentException(e2.t());
            }
            if (s == 974) {
                throw new FolderNotFoundException();
            }
            if (s != 976) {
                throw e2;
            }
            throw new PeerLimitInFolderExceedException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqm)) {
            return false;
        }
        hqm hqmVar = (hqm) obj;
        return this.b == hqmVar.b && epx.f(this.c, hqmVar.c) && epx.f(this.d, hqmVar.d) && epx.f(this.e, hqmVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        return this.e.hashCode() + qr.a(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsFoldersEditCmd(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", addedPeers=");
        sb.append(this.d);
        sb.append(", removedPeers=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
    }
}
