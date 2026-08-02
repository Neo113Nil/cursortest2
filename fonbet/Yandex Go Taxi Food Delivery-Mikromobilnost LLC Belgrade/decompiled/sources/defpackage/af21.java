package defpackage;

import com.yandex.urbanads.UrbanAdsCreativeParams$Format;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class af21 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = UrbanAdsCreativeParams$Format.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
