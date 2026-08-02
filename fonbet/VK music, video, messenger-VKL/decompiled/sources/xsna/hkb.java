package xsna;

import android.widget.TextView;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.wall.dto.WallRestoreThreadResponseDto;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.picture.VkImage;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.im.engine.utils.StringMatchStrategy;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.toggle.b;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.smartcrop.api.di.SmartCropComponent;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.ndw;
import xsna.spw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hkb implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ hkb(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Map map = (Map) obj;
                ndw ndwVar = (ndw) obj2;
                if (ndwVar instanceof ndw.a) {
                    return pn00.n(map, ((ndw.a) ndwVar).a);
                }
                if (ndwVar.equals(ndw.b.a)) {
                    return jgp.b;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                return (WallRestoreThreadResponseDto) obj;
            case 2:
                return (qma0) obj2;
            case 3:
                ((Integer) obj).intValue();
                return Integer.valueOf(((qdo) obj2).a);
            case 4:
                ((Integer) obj2).getClass();
                t8s.e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ((TextView) obj).setTextColor(((kkm) obj2).f(R.attr.vk_ui_text_accent));
                return s3q0.a;
            case 6:
                VkImage vkImage = (VkImage) obj;
                BaseBadgeHolder.a aVar = (BaseBadgeHolder.a) obj2;
                if (aVar instanceof BaseBadgeHolder.a.C0709a) {
                    int b = cn70.b(0);
                    vkImage.setPadding(b, b, b, b);
                } else {
                    if (!(aVar instanceof BaseBadgeHolder.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkImage.setPadding(cn70.b(0), cn70.b(2), cn70.b(4), cn70.b(2));
                }
                return s3q0.a;
            case 7:
                f8m f8mVar = (f8m) obj;
                return new PlaylistScreenFragmentInternalComponent((tcb0) obj2, (AppContextDiComponent) f8mVar.a(fpf0.a(AppContextDiComponent.class)), (AuthBridgeComponent) f8mVar.a(fpf0.a(AuthBridgeComponent.class)), (CatalogComponent) f8mVar.a(fpf0.a(CatalogComponent.class)), (CatalogInteractorComponent) f8mVar.a(fpf0.a(CatalogInteractorComponent.class)), (VideoBottomSheetComponent) f8mVar.a(fpf0.a(VideoBottomSheetComponent.class)), (VideoRestrictedUserActionsComponent) f8mVar.a(fpf0.a(VideoRestrictedUserActionsComponent.class)), (BridgeComponent) f8mVar.a(fpf0.a(BridgeComponent.class)), (VideoPlaylistReversionComponent) f8mVar.a(fpf0.a(VideoPlaylistReversionComponent.class)));
            case 8:
                return ((seq0) obj2).a;
            case 9:
                ((Integer) obj2).getClass();
                aqh0.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                f8m f8mVar2 = (f8m) obj;
                return new SettingsFragmentInternalComponent((r1j0) obj2, (BridgeComponent) f8mVar2.a(fpf0.a(BridgeComponent.class)), (VkOnboardingComponent) f8mVar2.a(fpf0.a(VkOnboardingComponent.class)), (SmartCropComponent) f8mVar2.a(fpf0.a(SmartCropComponent.class)));
            case 11:
                StringMatchStrategy stringMatchStrategy = StringMatchStrategy.STRICT;
                return Boolean.valueOf(brm0.v((String) obj, (String) obj2, true));
            case 12:
                return Integer.valueOf(((b.d) obj).b.toString().compareTo(((b.d) obj2).b.toString()));
            case 13:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(2138982428);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2138982428, intValue, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:238)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.X0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj2;
                return new spw0.a.b(friendsGetFieldsResponseDto.getCount(), kpw0.V((FriendsGetFieldsResponseDto) obj), kpw0.U(friendsGetFieldsResponseDto));
        }
    }

    public /* synthetic */ hkb(int i, int i2) {
        this.b = i2;
    }

    public /* synthetic */ hkb(kpw0 kpw0Var) {
        this.b = 14;
    }
}
