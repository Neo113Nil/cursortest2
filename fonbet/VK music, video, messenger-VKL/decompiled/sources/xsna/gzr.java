package xsna;

import com.vk.dto.common.Source;

/* compiled from: FolderPeersDialogsSortedPeerIdListDataSource.kt */
/* loaded from: classes18.dex */
public final class gzr implements yuk<xrm, Long> {
    public final a1w b;
    public final int c;
    public final Source d;

    public gzr(a1w a1wVar, int i, Source source) {
        this.b = a1wVar;
        this.c = i;
        this.d = source;
    }

    @Override // xsna.yuk
    public final io.reactivex.rxjava3.core.x b(int i, String str, Object obj) {
        long longValue = ((Number) obj).longValue();
        if (i <= 0) {
            i = 50;
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(this.b.C(this, new fu90(this.c)), new aa6(new dzr(i, this, longValue), 20)).l(new ca6(new ezr(i, 0), 17));
    }
}
