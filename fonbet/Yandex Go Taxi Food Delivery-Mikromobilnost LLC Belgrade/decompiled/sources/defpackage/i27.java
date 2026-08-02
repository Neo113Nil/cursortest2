package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class i27 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((PlusAcquisitionSmartOffer) obj).getPriority()).compareTo(Integer.valueOf(((PlusAcquisitionSmartOffer) obj2).getPriority()));
    }
}
