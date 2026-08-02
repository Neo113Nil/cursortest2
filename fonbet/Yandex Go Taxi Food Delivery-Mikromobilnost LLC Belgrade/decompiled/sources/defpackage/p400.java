package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p400 implements kcs {
    public final /* synthetic */ tc9 a;
    public final pc00 b;

    public p400(pc00 pc00Var, Map map) {
        this.a = new tc9(map, 10);
        this.b = pc00Var;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final FragmentScreen b() {
        this.b.getClass();
        return new FragmentScreen("ProductsScreen", false, null, null, qoi0.a(ProductsFragment.class), OpenScreenRequirement.WithBuidOrBankSessionNotRegisteredUser.INSTANCE, 14, null);
    }
}
