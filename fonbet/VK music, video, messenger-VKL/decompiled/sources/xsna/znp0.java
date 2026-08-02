package xsna;

import com.vk.dto.common.Peer;
import xsna.lc80;

/* compiled from: TranslateMsgSuccessLpTask.kt */
/* loaded from: classes2.dex */
public final class znp0 extends e500 {
    public final Peer c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final w2w h;

    public znp0(Peer peer, int i, String str, String str2, String str3, w2w w2wVar) {
        super("TranslateMsgSuccessLpTask");
        this.c = peer;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = w2wVar;
    }

    @Override // xsna.e500
    public final void d(c400 c400Var) {
        this.h.e1(this, new lc80.b(this.c, this.d, this.e, this.f, this.g, this));
    }
}
