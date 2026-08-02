package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.apps.dto.AppsCheckInviteFriendResponseDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketGetByIdResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetRecomThemesResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.articles.ArticleFragment;
import com.vk.core.view.components.cell.button.group.VkCellButtonGroupLayout;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.log.L;
import com.vk.music.playlist.display.audiobook.presentation.model.AudioBookLoadState;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.dob;
import xsna.dyo;
import xsna.u6x;
import xsna.vre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class io3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ io3(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                int i = ArticleFragment.E0;
                return ((UserProfile) obj).h;
            case 1:
                int i2 = BasePhotoListFragment.m0;
                qgi0.r((tgi0) obj, "toolbar_back_button");
                return s3q0.a;
            case 2:
                p490 p490Var = r99.g;
                if (((Boolean) obj).booleanValue()) {
                    p490Var.v();
                } else {
                    p490Var.w();
                }
                return s3q0.a;
            case 3:
                Context context = (Context) obj;
                VkCellButtonGroupLayout vkCellButtonGroupLayout = new VkCellButtonGroupLayout(context, null, 6);
                vkCellButtonGroupLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                for (int i3 = 0; i3 < 3; i3++) {
                    VkGroupItem vkGroupItem = new VkGroupItem(context, null, 6);
                    vkGroupItem.setText("Button");
                    VkGroupItem.a(vkGroupItem, Integer.valueOf(R.drawable.vk_icon_attach_24));
                    vkGroupItem.setOnClickListener(new o44(0));
                    vkCellButtonGroupLayout.addView(vkGroupItem, vkCellButtonGroupLayout.generateLayoutParams((AttributeSet) null));
                }
                return vkCellButtonGroupLayout;
            case 4:
                return dob.d.a;
            case 5:
                return fpf0.a(((k7r) obj).getClass());
            case 6:
                TextView textView = (TextView) obj;
                ColorStateList textColors = textView.getTextColors();
                textView.setTextAppearance(R.style.VkUiTypography_Caption2);
                textView.setTextColor(textColors);
                textView.setTextSize(11.0f);
                textView.setMaxLines(5);
                int i4 = com.vk.clips.favorites.impl.ui.folders.content.recycler.b.t;
                f4m.x(i4, textView);
                f4m.w(i4, textView);
                return s3q0.a;
            case 7:
                return ((RecomSettingsGetRecomThemesResponseDto) obj).d();
            case 8:
                return ((vre.a) obj).f;
            case 9:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                return new s4m(extendedCommunityProfile.A0.toString(), R.drawable.vk_icon_mention_outline_20, null, null, "https://" + a0a.d + '/' + extendedCommunityProfile.A0, "short_link", extendedCommunityProfile.a.c, null, 2268);
            case 10:
                Throwable th = (Throwable) obj;
                int i5 = CommunityNotificationSettingsFragment.b0;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).J()) {
                    cvk.u(R.string.access_error, false);
                } else {
                    cvk.u(R.string.communty_notifications_settings_network_error, false);
                }
                return s3q0.a;
            case 11:
                qgi0.r((tgi0) obj, "test_tag_action_button");
                return s3q0.a;
            case 12:
                vzh vzhVar = (vzh) obj;
                yig0 yig0Var = vzhVar.y;
                boolean f = epx.f(yig0Var.d, vzhVar.g);
                big0 big0Var = vzhVar.z.get(yig0Var.d);
                str = big0Var != null ? big0Var.g : null;
                return new f4g0(str != null ? str : "", f, vzhVar.A == null && vzhVar.c);
            case 13:
                return Boolean.valueOf(((jen) obj).b == AudioBookLoadState.REFRESHING);
            case 14:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h hVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h) obj;
                h.a aVar = hVar.b;
                return Boolean.valueOf((aVar instanceof h.a.c) && (hVar.c.a instanceof dyo.a) && !epx.f(((h.a.c) aVar).a.a().o, Boolean.TRUE));
            case 15:
                cvk.u(R.string.vk_auth_load_network_error, false);
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                bwt0.m0(400, 400, (VkEnhancedImageView) obj);
                return s3q0.a;
            case 18:
                return String.valueOf(((FaveTag) obj).b);
            case 19:
                AppsCheckInviteFriendResponseDto appsCheckInviteFriendResponseDto = (AppsCheckInviteFriendResponseDto) obj;
                String e = appsCheckInviteFriendResponseDto.e();
                if (e == null) {
                    e = "";
                }
                BaseImageDto d = appsCheckInviteFriendResponseDto.d();
                str = d != null ? d.getUrl() : null;
                return new o0c(e, str != null ? str : "");
            case 20:
                return (MarketMarketItemDto) j5g.Y(((MarketGetByIdResponseDto) obj).d());
            case 21:
                L.g("GroupCallViewModel", (Throwable) obj);
                return s3q0.a;
            case 22:
                return Boolean.valueOf(j3n0.class.equals(((wqw) obj).b.getClass()));
            case 23:
                return Boolean.valueOf(((u6x.b) obj).a == u6x.c.IDLE);
            case 24:
                int i6 = LoaderFragment.k0;
                ((yvv) obj).d();
                throw null;
            case 25:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 26:
                nvy.c((nvy) obj, 30, null, vhi.d, 6);
                return s3q0.a;
            case 27:
                AttachWithDownload attachWithDownload = (AttachWithDownload) obj;
                return Boolean.valueOf((attachWithDownload instanceof AttachVideo) && !((AttachVideo) attachWithDownload).j());
            case 28:
                return ((a.C1152a) obj).a.a;
            default:
                return s3q0.a;
        }
    }
}
