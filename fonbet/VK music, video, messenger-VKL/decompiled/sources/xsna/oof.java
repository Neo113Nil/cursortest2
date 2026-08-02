package xsna;

import android.content.Context;
import com.vk.toggle.Features;
import java.util.HashSet;

/* compiled from: FeatureFactory.kt */
/* loaded from: classes.dex */
public final class oof extends hwy<Boolean> {
    public final /* synthetic */ Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oof(epf epfVar, gpf gpfVar, Context context) {
        super(epfVar, gpfVar);
        this.g = context;
    }

    @Override // xsna.hwy
    public final Boolean a() {
        boolean z;
        if (puq.c(Features.Type.FEATURE_CLIPS_CREATE_DISABLED, 2)) {
            HashSet hashSet = iah0.a;
            if (!fnj.b(this.g)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
