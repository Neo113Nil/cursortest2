package xsna;

import java.util.List;

/* compiled from: ImageProxyFileCacheFactory.kt */
/* loaded from: classes.dex */
public final class elw implements z7r {
    public final List<tbn> a;

    /* JADX WARN: Multi-variable type inference failed */
    public elw(List<? extends tbn> list) {
        this.a = list;
    }

    @Override // xsna.z7r
    public final y7r a(wan wanVar) {
        return new dlw(new vh8(this.a)).a(wanVar);
    }
}
