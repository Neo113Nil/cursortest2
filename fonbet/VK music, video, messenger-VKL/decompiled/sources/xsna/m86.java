package xsna;

import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;

/* compiled from: _Sequences.kt */
/* loaded from: classes16.dex */
public final class m86 implements izs {
    public static final m86 c = new m86(0);
    public static final m86 d = new m86(1);
    public static final m86 e = new m86(2);
    public final /* synthetic */ int b;

    public /* synthetic */ m86(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof bij);
            case 1:
                return Boolean.valueOf(obj instanceof zfm);
            default:
                return Boolean.valueOf(obj instanceof VideoDiscoverGridItem);
        }
    }
}
