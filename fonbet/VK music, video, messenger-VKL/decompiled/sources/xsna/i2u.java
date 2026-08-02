package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GlobalSearchVideoRootVh.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class i2u extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2u(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((GlobalSearchVideoRootVh) this.receiver).o0();
                return s3q0.a;
            case 1:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) this.receiver;
                musicCatalogRootVh.getClass();
                musicCatalogRootVh.i8(vyh0.a);
                return s3q0.a;
            case 2:
                String str = ((MusicSearchCatalogRootVh) this.receiver).x.e;
                return Boolean.valueOf(!(str == null || str.length() == 0));
            default:
                return (Boolean) ((mcy) this.receiver).get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2u(Object obj, int i) {
        super(0, obj, MusicCatalogRootVh.class, "onVoiceRecognitionStarted", "onVoiceRecognitionStarted()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, MusicSearchCatalogRootVh.class, "isOnFirstSearchScreen", "isOnFirstSearchScreen()Z", 0);
                break;
            default:
                break;
        }
    }
}
