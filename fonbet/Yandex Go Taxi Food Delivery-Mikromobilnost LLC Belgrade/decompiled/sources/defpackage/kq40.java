package defpackage;

import com.yandex.go.tariffcard.experiment.MulticlassTariffPromoDescriptionExperiment;
import com.yandex.go.tariffcard.experiment.h;
import com.yandex.go.tariffcard.ui.MultiTariffOption$Subtitle$SubtitleType;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class kq40 {
    public final h a;

    public kq40(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final in40 a(pex0 pex0Var) {
        String str;
        Object obj;
        String str2;
        String str3 = pex0Var.D;
        if (str3 != null && !evu0.J(str3)) {
            return new in40(str3, MultiTariffOption$Subtitle$SubtitleType.UNAVAILABILITY);
        }
        String str4 = pex0Var.b;
        MulticlassTariffPromoDescriptionExperiment multiclassTariffPromoDescriptionExperiment = (MulticlassTariffPromoDescriptionExperiment) ((qqo) this.a.a.getValue()).b();
        if (multiclassTariffPromoDescriptionExperiment.getB()) {
            Iterator it = multiclassTariffPromoDescriptionExperiment.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(str4, ((MulticlassTariffPromoDescriptionExperiment.Description) obj).a)) {
                    break;
                }
            }
            MulticlassTariffPromoDescriptionExperiment.Description description = (MulticlassTariffPromoDescriptionExperiment.Description) obj;
            if (description != null && (str2 = description.b) != null) {
                str = d6z.Y(multiclassTariffPromoDescriptionExperiment, str2);
                if (str == null) {
                    return new in40(str, MultiTariffOption$Subtitle$SubtitleType.PROMOTION);
                }
                return null;
            }
        }
        str = null;
        if (str == null) {
        }
    }
}
