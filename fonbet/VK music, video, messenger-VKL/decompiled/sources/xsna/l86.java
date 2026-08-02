package xsna;

import com.vk.feed.core.models.discover.DiscoverMediaBlock;

/* compiled from: _Sequences.kt */
/* loaded from: classes16.dex */
public final class l86 implements izs {
    public static final l86 c = new l86(0);
    public static final l86 d = new l86(1);
    public static final l86 e = new l86(2);
    public final /* synthetic */ int b;

    public /* synthetic */ l86(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof dh9);
            case 1:
                return Boolean.valueOf(obj instanceof zfm);
            default:
                return Boolean.valueOf(obj instanceof DiscoverMediaBlock);
        }
    }
}
