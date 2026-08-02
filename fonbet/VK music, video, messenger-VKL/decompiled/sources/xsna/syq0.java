package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesBackButtonAction;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.pyq0;

/* compiled from: UserRecomThemesChooserView.kt */
/* loaded from: classes4.dex */
public final class syq0 extends i6v0<tyq0, dyq0> {

    /* compiled from: UserRecomThemesChooserView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserRecomThemesBackButtonAction.values().length];
            try {
                iArr[UserRecomThemesBackButtonAction.Close.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserRecomThemesBackButtonAction.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserRecomThemesBackButtonAction.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public syq0(Context context, f5z f5zVar) {
        super(context, f5zVar);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((tyq0) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(tyq0 tyq0Var, izs<? super dyq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        wh50 wh50Var;
        boolean z;
        String str;
        wh50 wh50Var2;
        int i2;
        String f;
        Pair pair;
        int i3;
        lg90 b;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1307207680);
        int i5 = i | (M.J(tyq0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1307207680, i5, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.mvi.chooser.UserRecomThemesChooserView.ThemedContent (UserRecomThemesChooserView.kt:29)");
            }
            n0u0[] n0u0VarArr = {tyq0Var.a};
            pyq0.b bVar = pyq0.b.a;
            pyq0 pyq0Var = (pyq0) d(bVar, n0u0VarArr, M, (i5 & 896) | 518).getValue();
            if (pyq0Var instanceof pyq0.a) {
                M.K(-738066539);
                pyq0.a aVar3 = (pyq0.a) pyq0Var;
                yzt0<Boolean> yzt0Var = aVar3.b;
                Boolean bool = Boolean.FALSE;
                wh50 d = jk50.d(yzt0Var, bool, M, 48);
                yzt0<Boolean> yzt0Var2 = aVar3.a;
                Boolean bool2 = Boolean.TRUE;
                wh50 d2 = jk50.d(yzt0Var2, bool2, M, 48);
                wh50 d3 = jk50.d(aVar3.c, bool2, M, 48);
                wh50 d4 = jk50.d(aVar3.d, bool, M, 48);
                wh50 a2 = jk50.a(aVar3.e, M, 0, 3);
                wh50 d5 = jk50.d(aVar3.f, Integer.valueOf(R.string.user_recom_themes_next), M, 0);
                wh50 d6 = jk50.d(aVar3.g, Integer.valueOf(R.string.user_recom_themes_placeholder_step1_title), M, 0);
                wh50 a3 = jk50.a(aVar3.h, M, 0, 3);
                wh50 a4 = jk50.a(aVar3.i, M, 0, 3);
                wh50 d7 = jk50.d(aVar3.k, 2, M, 48);
                wh50 d8 = jk50.d(aVar3.j, 1, M, 48);
                wh50 d9 = jk50.d(aVar3.l, UserRecomThemesBackButtonAction.None, M, 48);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new SnapshotStateList();
                    M.R(x);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) x;
                List list = (List) a2.getValue();
                p4g.n(snapshotStateList, list != null ? list : EmptyList.b);
                boolean booleanValue = ((Boolean) d.getValue()).booleanValue();
                boolean z2 = !((Boolean) d.getValue()).booleanValue() && ((Boolean) d2.getValue()).booleanValue();
                String N = d370.N(R.string.user_recom_themes_title, 0, M);
                if (((Boolean) d2.getValue()).booleanValue() || ((Boolean) d.getValue()).booleanValue()) {
                    wh50Var = a3;
                    z = false;
                } else {
                    wh50Var = a3;
                    z = true;
                }
                boolean booleanValue2 = ((Boolean) d3.getValue()).booleanValue();
                boolean booleanValue3 = ((Boolean) d4.getValue()).booleanValue();
                String N2 = d370.N(R.string.user_recom_themes_skip, 0, M);
                String N3 = d370.N(((Number) d5.getValue()).intValue(), 0, M);
                String N4 = d370.N(((Number) d6.getValue()).intValue(), 0, M);
                Integer num = (Integer) wh50Var.getValue();
                String str2 = null;
                if (num == null) {
                    M.K(-736104922);
                    M.j();
                    str = N4;
                    wh50Var2 = a4;
                    f = null;
                    i2 = 0;
                } else {
                    str = N4;
                    wh50Var2 = a4;
                    i2 = 0;
                    f = l4.f(M, -736104921, num, M, 0);
                }
                String N5 = d370.N(R.string.user_recom_themes_error_message, i2, M);
                String str3 = f;
                String N6 = d370.N(R.string.user_recom_themes_try_again, i2, M);
                String str4 = (String) wh50Var2.getValue();
                String O = d370.O(R.string.user_recom_themes_steps, new Object[]{Integer.valueOf(((Number) d8.getValue()).intValue()), Integer.valueOf(((Number) d7.getValue()).intValue())}, M);
                Pair pair2 = new Pair(Integer.valueOf(((Number) d8.getValue()).intValue()), Integer.valueOf(((Number) d7.getValue()).intValue()));
                UserRecomThemesBackButtonAction userRecomThemesBackButtonAction = (UserRecomThemesBackButtonAction) d9.getValue();
                int[] iArr = a.$EnumSwitchMapping$0;
                int i6 = iArr[userRecomThemesBackButtonAction.ordinal()];
                if (i6 == 1) {
                    pair = pair2;
                    M.K(-993555364);
                    if (androidx.compose.runtime.b.d()) {
                        i3 = 0;
                        androidx.compose.runtime.b.f(-218864772, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel28> (VkSdkIcons.kt:236)");
                    } else {
                        i3 = 0;
                    }
                    b = or.b(M, -439898899, R.drawable.vk_icon_cancel_28, M, i3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (i6 == 2) {
                    M.K(-993552538);
                    if (androidx.compose.runtime.b.d()) {
                        pair = pair2;
                        i4 = 0;
                        androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                    } else {
                        pair = pair2;
                        i4 = 0;
                    }
                    b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, i4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    if (i6 != 3) {
                        throw alb0.c(-993558453, M);
                    }
                    M.K(-735271735);
                    M.j();
                    pair = pair2;
                    b = null;
                }
                int i7 = iArr[((UserRecomThemesBackButtonAction) d9.getValue()).ordinal()];
                if (i7 == 1) {
                    str2 = zq.a(M, -993543944, R.string.close, M, 0);
                } else if (i7 == 2) {
                    str2 = zq.a(M, -993540587, R.string.back, M, 0);
                } else {
                    if (i7 != 3) {
                        throw alb0.c(-993546688, M);
                    }
                    M.K(-734886839);
                    M.j();
                }
                saf0.b(str, izsVar, null, snapshotStateList, str3, N, z2, booleanValue, z, booleanValue2, booleanValue3, N3, N2, N5, N6, str4, O, pair, b, str2, Integer.valueOf(((Number) d8.getValue()).intValue()), null, M, (i5 & 112) | 3072, 134217728, 2097156);
                aVar2 = M;
                aVar2.j();
            } else {
                aVar2 = M;
                if (!epx.f(pyq0Var, bVar)) {
                    throw alb0.c(-993641344, aVar2);
                }
                aVar2.K(-734679293);
                saf0.b(d370.N(R.string.user_recom_themes_placeholder_step1_title, 0, aVar2), izsVar, null, null, null, d370.N(R.string.user_recom_themes_title, 0, aVar2), true, false, false, false, false, null, null, null, null, null, d370.O(R.string.user_recom_themes_steps, new Object[]{1, 2}, aVar2), new Pair(0, 2), null, null, null, null, aVar2, (i5 & 112) | 102236160, 12582912, 3997340);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ax(i, 8, this, tyq0Var, izsVar);
        }
    }
}
