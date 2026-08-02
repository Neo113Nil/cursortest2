package xsna;

import com.vk.ecomm.storefront.impl.albums.presentation.model.LoadingState;
import xsna.dll0;

/* compiled from: StorefrontViewState.kt */
/* loaded from: classes18.dex */
public final class kpl0 {

    /* compiled from: StorefrontViewState.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                iArr[LoadingState.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static dll0 a(ukl0 ukl0Var) {
        dll0.a bVar;
        LoadingState loadingState = ukl0Var.g;
        r3p0 r3p0Var = ukl0Var.f;
        dll0.b bVar2 = new dll0.b(r3p0Var.d, r3p0Var.c, r3p0Var.b, r3p0Var.e, r3p0Var.a);
        if (a.$EnumSwitchMapping$0[loadingState.ordinal()] == 1) {
            bVar = dll0.a.C2741a.a;
        } else {
            bVar = new dll0.a.b(ukl0Var.b, ukl0Var.c, ukl0Var.d < ukl0Var.e);
        }
        return new dll0(loadingState, bVar2, bVar);
    }
}
