package xsna;

import android.content.Context;
import com.vk.api.sdk.VKApiConfig;
import com.vk.catalog.mvi.api.di.CatalogMviLegacyComponent;
import com.vk.catalog.mvi.section.impl.di.CatalogComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.passkey.di.PasskeyComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v62 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v62(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new q62((Context) obj);
            case 1:
                return ((CatalogMviLegacyComponent) ((CatalogComponentImpl) obj).d.getValue()).a7();
            case 2:
                return new tu2(new u8y((VKApiConfig) obj));
            case 3:
                return (zbd0) ((r360) obj).i.getValue();
            case 4:
                qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
                return (vp40) ((OfflineAudioComponentImpl) obj).F.getValue();
            case 5:
                gae0 gae0Var = (gae0) obj;
                return gae0Var.c(new in60(new qae0(gae0Var.c), 12));
            default:
                return new PasskeyComponentImpl.a(((jau0) obj).b);
        }
    }
}
