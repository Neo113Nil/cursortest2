package xsna;

import android.animation.PropertyValuesHolder;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.utils.vectordrawable.AnimationTarget;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lq2 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ lq2(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                AnimationTarget.Property property = AnimationTarget.Property.FILL_COLOR;
                int[] q0 = rl3.q0((Integer[]) ((Object[]) obj2));
                ((PropertyValuesHolder) obj).setIntValues(Arrays.copyOf(q0, q0.length));
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                aVar.K(-1333018524);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1333018524, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.store.ClipsUploadStateMapper.buildAdsEasyPromoteSettingsItem.<anonymous> (ClipsUploadStateMapper.kt:352)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(45267582, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-WalletOutline28> (VkSdkIcons.kt:3784)");
                }
                lg90 a = pg90.a(R.drawable.vk_icon_wallet_outline_28, 0, aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1891572206, intValue2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.placeholder.ComposableSingletons$FullToolbarKt.lambda$-1891572206.<anonymous> (FullToolbar.kt:61)");
                    }
                    dt1.a.getClass();
                    ty6.a aVar3 = dt1.a.o;
                    q630.a aVar4 = q630.a.a;
                    q630 D = s200.D(txj0.f(aVar4, 1.0f), r490.d(R.dimen.clips_profile_switch_horizontal_padding, aVar2));
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar3, aVar2, 48);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c = qri.c(aVar2, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar5);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a2, cri.a.f);
                    k9q0.w(aVar2, D2, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    f870.A().getClass();
                    ja8.a(txj0.q(hr80.m(aVar4, wlb0.h(aVar2).getBackground().x, f870.A().e(64, aVar2)), er5.a()), aVar2, 0);
                    float f = 12;
                    f9t.e(txj0.h(aVar4, f), aVar2, 6);
                    float f2 = 16;
                    q630 h = txj0.h(txj0.v(aVar4, VersionConstants.PRODUCT_MAJOR_VERSION), f2);
                    uog0 uog0Var = wpu0.a;
                    ja8.a(hr80.m(h, wlb0.h(aVar2).getBackground().x, uog0Var), aVar2, 0);
                    f9t.e(txj0.h(aVar4, f), aVar2, 6);
                    ja8.a(hr80.m(txj0.h(txj0.v(aVar4, 80), f2), wlb0.h(aVar2).getBackground().x, uog0Var), aVar2, 0);
                    if (xga0.c(aVar4, 22, aVar2, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(566090785, intValue3, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$566090785.<anonymous> (Scaffold.kt:307)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-268646019, intValue4, -1, "com.vk.profile.user.impl.ui.wall.ComposableSingletons$UserProfileContentWallViewHolderKt.lambda$-268646019.<anonymous> (UserProfileContentWallViewHolder.kt:190)");
                    }
                    rrv0.d(null, null, null, null, sdy.f, aVar7, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                t8s.c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                return Integer.valueOf(!epx.f(((MusicTrack) obj).Ib(), ((MusicTrack) obj2).Ib()) ? 1 : 0);
            case 7:
                ((Integer) obj2).getClass();
                n750.f(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).intValue();
                return s3q0.a;
            case 9:
                return new Pair((AboutVideoItem.d) obj, (Boolean) obj2);
            case 10:
                VkFormField vkFormField = (VkFormField) obj;
                View view = (View) obj2;
                List<Class<? extends View>> list = VkFormField.C;
                if ((view instanceof ei50 ? ((ei50) view).y0() : false) && (vkFormField.o || vkFormField.p || view.hasFocus())) {
                    r4 = true;
                }
                return Boolean.valueOf(r4);
            case 11:
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar8.K(462778686);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(462778686, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:190)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar8.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.b0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar8.j();
                return frv0Var;
            default:
                Boolean bool = (Boolean) obj2;
                if (epx.f((FeatureRoles) obj, FeatureRoles.EnabledForAll.INSTANCE) && bool.booleanValue()) {
                    r4 = true;
                }
                return Boolean.valueOf(r4);
        }
    }

    public /* synthetic */ lq2(VkFormField vkFormField) {
        this.b = 10;
    }
}
