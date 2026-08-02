package xsna;

import com.vk.api.generated.account.dto.AccountModelDto;
import com.vk.ml.MLFeatures;
import java.util.Iterator;

/* compiled from: AccountModelDtoMapper.kt */
/* loaded from: classes3.dex */
public final class rp {
    public static final MLFeatures.MLFeature a(AccountModelDto accountModelDto) {
        Object obj;
        Iterator<E> it = MLFeatures.MLFeature.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (brm0.w(((MLFeatures.MLFeature) obj).name(), accountModelDto.g(), true)) {
                break;
            }
        }
        MLFeatures.MLFeature mLFeature = (MLFeatures.MLFeature) obj;
        return mLFeature == null ? MLFeatures.MLFeature.UNKNOWN : mLFeature;
    }
}
