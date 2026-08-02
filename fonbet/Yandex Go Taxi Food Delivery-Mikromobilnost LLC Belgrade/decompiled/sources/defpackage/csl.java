package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams;
import com.ybsdk.feature.divkit.common.screen.api.DivkitScreenConfig;
import com.ybsdk.feature.status.screen.internal.ui.DivkitCommonFragment;
import java.util.Map;

/* loaded from: classes3.dex */
public final class csl implements kcs {
    public final /* synthetic */ tc9 a;
    public final jsl b;

    public csl(jsl jslVar, Map map) {
        this.a = new tc9(map, 10);
        this.b = jslVar;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final FragmentScreen b(String str, String str2, String str3, DivkitScreenConfig divkitScreenConfig, String str4, String str5) {
        this.b.getClass();
        return new FragmentScreen("DivkitCommonFragment".concat(str5), false, new DivkitCommonScreenParams.Default(str, str2, str3, divkitScreenConfig, str4), null, qoi0.a(DivkitCommonFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }
}
