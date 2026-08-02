package xsna;

import com.vk.games.presentation.catalog.model.ListNextState;

/* compiled from: GamesCatalogFooter.kt */
/* loaded from: classes17.dex */
public final class ybt {

    /* compiled from: GamesCatalogFooter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ListNextState.values().length];
            try {
                iArr[ListNextState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListNextState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(nvy nvyVar, ListNextState listNextState, gzs<s3q0> gzsVar) {
        int i = listNextState == null ? -1 : a.$EnumSwitchMapping$0[listNextState.ordinal()];
        if (i == 1) {
            nvy.g(nvyVar, "LOADING", null, cgi.a, 2);
        } else {
            if (i != 2) {
                return;
            }
            nvy.g(nvyVar, "ERROR", null, new jai(446652815, new o0r(gzsVar, 1), true), 2);
        }
    }
}
