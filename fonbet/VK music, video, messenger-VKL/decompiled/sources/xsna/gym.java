package xsna;

import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DigestHeaderHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class gym extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gym(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                hym.R6((hym) this.receiver);
                return s3q0.a;
            default:
                ((MusicSearchCatalogRootVh) this.receiver).getClass();
                return Boolean.valueOf(com.vk.toggle.d.K());
        }
    }
}
