package xsna;

import android.graphics.drawable.Icon;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.ecomm.market.album.compose.EditStorefrontAlbumError;
import com.vk.network.encoding.EncodingType;
import com.vk.profile.design.compose.user.FriendsAndFollowersBlockData;
import com.vk.profile.design.compose.user.a;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.kyl;
import xsna.mjf;
import xsna.oap;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ljf implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ljf(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        List<String> list;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        String str = null;
        us2 j = null;
        int i2 = 3;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                oap oapVar = (oap) obj4;
                Set set = (Set) obj3;
                if (oapVar instanceof oap.b) {
                    return new mjf.c((ClipsUploadUiVkNavigator.ClipUploadDataCompact) ((oap.b) oapVar).a, set);
                }
                if (oapVar instanceof oap.a) {
                    return new mjf.d((ClipsUploadUiVkNavigator.ClipUploadDataFull) ((oap.a) oapVar).a, set);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                ((Integer) obj2).getClass();
                kxl.b((wh50) obj4, (kyl.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 2:
                z5u z5uVar = (z5u) obj4;
                q5u q5uVar = (q5u) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1396470444, intValue, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.bind.<anonymous> (GoodPreviewButtonsItemRefactoredViewHolder.kt:50)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1230896847, new q2(i2, z5uVar, q5uVar), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                EditStorefrontAlbumError editStorefrontAlbumError = (EditStorefrontAlbumError) obj4;
                MarketEditAlbumGoodVariantsFragment marketEditAlbumGoodVariantsFragment = (MarketEditAlbumGoodVariantsFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = MarketEditAlbumGoodVariantsFragment.M0;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1684975421, intValue2, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment.bindErrorView.<anonymous> (MarketEditAlbumGoodVariantsFragment.kt:104)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-2124563742, new e3(9, editStorefrontAlbumError, marketEditAlbumGoodVariantsFragment), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                t0k0 t0k0Var = (t0k0) obj4;
                rod0 rod0Var = (rod0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1183154270, intValue3, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterSliderHolder.bind.<anonymous>.<anonymous> (ProductFilterSliderHolder.kt:27)");
                    }
                    Float f = t0k0Var.f;
                    if (f != null) {
                        float floatValue = f.floatValue();
                        izs<Float, String> izsVar = t0k0Var.e;
                        str = izsVar != null ? izsVar.invoke(Float.valueOf(floatValue)) : null;
                        if (str == null) {
                            str = "";
                        }
                    }
                    String str2 = str;
                    Float f2 = t0k0Var.f;
                    float floatValue2 = f2 != null ? f2.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    int i4 = (int) t0k0Var.h;
                    boolean y = aVar3.y(t0k0Var) | aVar3.y(rod0Var);
                    Object x = aVar3.x();
                    if (y || x == c0012a) {
                        x = new b7(19, t0k0Var, rod0Var);
                        aVar3.R(x);
                    }
                    hkv0.d(floatValue2, (izs) x, null, str2, false, null, null, i4, null, aVar3, 0, 884);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                brd0.a(ne7.I(55), (androidx.compose.runtime.a) obj, (izs) obj4, (q630) obj3);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                tkf0.a((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((ddo0) obj4).b((Icon) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 8:
                FriendsAndFollowersBlockData friendsAndFollowersBlockData = (FriendsAndFollowersBlockData) obj4;
                jf7 jf7Var = (jf7) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1015094805, intValue4, -1, "com.vk.profile.design.compose.user.FluidBlockContent.<anonymous> (VkProfileFriendsAndFollowersInfo.kt:126)");
                    }
                    s8u0 s8u0Var = friendsAndFollowersBlockData.b;
                    FriendsAndFollowersBlockData.a aVar5 = friendsAndFollowersBlockData.c;
                    if (s8u0Var == null) {
                        aVar4.K(-175338247);
                    } else {
                        aVar4.K(548533256);
                        j = s8u0Var.j(8, aVar4);
                    }
                    aVar4.j();
                    com.vk.profile.design.compose.user.a.a(friendsAndFollowersBlockData.a.j(8, aVar4), j, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), aVar4, 384);
                    int i5 = a.C1666a.$EnumSwitchMapping$0[jf7Var.ordinal()];
                    if (i5 == 1) {
                        list = aVar5.a;
                    } else if (i5 == 2) {
                        list = aVar5.b;
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        list = aVar5.c;
                    }
                    boolean z = j != null;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1585670068, 0, -1, "com.vk.profile.design.compose.user.stackSize (VkProfileFriendsAndFollowersInfo.kt:207)");
                    }
                    float f3 = z ? 28 : 24;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean y2 = aVar4.y(list);
                    Object x2 = aVar4.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new jan0(list, 11);
                        aVar4.R(x2);
                    }
                    hyv0.f(null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, (izs) x2, aVar4, 0, 31);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 9:
                fhq fhqVar = (fhq) obj4;
                wzs wzsVar = (wzs) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(111919143, intValue5, -1, "com.vk.core.compose.component.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkScaffold.kt:111)");
                    }
                    rvi.a(phv0.a.b(fhqVar), wzsVar, aVar6, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                euv0.a((ktv0) obj4, (gtv0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((u7y0) obj4).b.e(EncodingType.ZSTD, (String) obj3, (String) obj2, (Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ ljf(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
