package xsna;

import android.content.Context;
import com.vk.multiplecoownership.model.MultipleCoownershipModel;
import xsna.m740;

/* compiled from: MultipleCoownershipRouterImpl.kt */
/* loaded from: classes3.dex */
public final class u740 implements t740 {
    @Override // xsna.t740
    public final boolean a(Context context, MultipleCoownershipModel multipleCoownershipModel) {
        if (multipleCoownershipModel.b.size() <= 1) {
            return false;
        }
        new m740.a(context, multipleCoownershipModel).I0(null);
        return true;
    }
}
