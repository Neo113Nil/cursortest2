package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.kycesia.api.EsiaInfoEntity;
import com.ybsdk.feature.kycesia.internal.screens.sdk.OpenEsiaSdkFragment;
import com.ybsdk.feature.kycesia.internal.screens.sdk.OpenEsiaSdkParams;
import java.util.Map;

/* loaded from: classes3.dex */
public final class kbo implements kcs {
    public final /* synthetic */ tc9 a;
    public final xcp0 b;

    public kbo(xcp0 xcp0Var, Map map) {
        this.a = new tc9(map, 10);
        this.b = xcp0Var;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final FragmentScreen b(EsiaInfoEntity esiaInfoEntity) {
        this.b.getClass();
        return new FragmentScreen("OpenEsiaSdkScreen", false, new OpenEsiaSdkParams(esiaInfoEntity), null, qoi0.a(OpenEsiaSdkFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }
}
