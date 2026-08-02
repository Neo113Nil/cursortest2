package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import com.ironsource.InterfaceC4319fe;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.donut.dto.DonutBannerDto;
import com.vk.api.generated.donut.dto.DonutBenefitBlockDto;
import com.vk.api.generated.donut.dto.DonutGetInfoGroupDonutBlockDto;
import com.vk.api.generated.donut.dto.DonutGetInfoResponseDto;
import com.vk.api.generated.donut.dto.DonutGoalsInfoDto;
import com.vk.api.generated.donut.dto.DonutRegularSupportDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;
import com.vk.api.generated.privacy.dto.PrivacyListsDto;
import com.vk.api.generated.privacy.dto.PrivacyOwnersDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedClipsBlockItemsGroupsFullResultDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedItemShortVideoFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoPrivacyDto;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.profile.DonutBanner;
import com.vk.feed.design.view.newsfeed.dzen.DzenNewsCell;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageAttachesColumn;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fxn;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vt1 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ vt1(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
    
        r7.add(new com.vk.dto.profile.DonutBanner.DonutRegularSupport.DonutBenefitBlock(r13, r4));
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        BasePrivacyDto e;
        PrivacyListsDto f;
        BasePrivacyDto e2;
        PrivacyOwnersDto g;
        DonutBanner.DonutRegularSupport donutRegularSupport;
        DonutBanner.DonutInfoBanner donutInfoBanner;
        ArrayList arrayList;
        switch (this.b) {
            case 0:
                return new jks(null, (List) obj, !r0.isEmpty());
            case 1:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 2:
                return s3q0.a;
            case 3:
                ay00 ay00Var = (ay00) obj;
                hy00 hy00Var = ay00Var instanceof hy00 ? (hy00) ay00Var : null;
                Long valueOf = hy00Var != null ? Long.valueOf(hy00Var.a) : null;
                UserId userId = hy00Var != null ? hy00Var.b : null;
                Boolean valueOf2 = hy00Var != null ? Boolean.valueOf(hy00Var.c) : null;
                if (valueOf == null || userId == null || valueOf2 == null) {
                    return null;
                }
                return new k08(valueOf.longValue(), userId, valueOf2.booleanValue());
            case 4:
                VkSimpleButton vkSimpleButton = new VkSimpleButton((Context) obj, null, 6);
                vkSimpleButton.setOnClickListener(new o44(0));
                return vkSimpleButton;
            case 5:
                ((pvw0) obj).Y();
                return s3q0.a;
            case 6:
                return ((ChannelMessageAttachesColumn) obj).getKey();
            case 7:
                VkCheckbox vkCheckbox = new VkCheckbox((Context) obj, null, 0, 0, 14);
                vkCheckbox.setType(VkCheckbox.Type.Square);
                return vkCheckbox;
            case 8:
                qgi0.r((tgi0) obj, "checkout_form_field_subhead");
                return s3q0.a;
            case 9:
                List<ShortVideoFeedItemShortVideoFullDto> d = ((ShortVideoGetResponseDto) obj).f().d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (ShortVideoFeedItemShortVideoFullDto shortVideoFeedItemShortVideoFullDto : d) {
                    ShortVideoShortVideoPrivacyDto l0 = shortVideoFeedItemShortVideoFullDto.d().l0();
                    List<UserId> e3 = (l0 == null || (e2 = l0.e()) == null || (g = e2.g()) == null) ? null : g.e();
                    ShortVideoShortVideoPrivacyDto l02 = shortVideoFeedItemShortVideoFullDto.d().l0();
                    arrayList2.add(new rms0(e3, (l02 == null || (e = l02.e()) == null || (f = e.f()) == null) ? null : f.e()));
                }
                return (rms0) j5g.a0(arrayList2);
            case 10:
                ExternalNpsCondition externalNpsCondition = (ExternalNpsCondition) obj;
                externalNpsCondition.getClass();
                return Boolean.valueOf(externalNpsCondition == ExternalNpsCondition.CLIP_CREATE || externalNpsCondition == ExternalNpsCondition.CLIP_CREATE_AUDIO_ATTACHMENT);
            case 11:
                int i = ClipsFavoriteFolderContentListFragment.W;
                qgi0.r((tgi0) obj, "clips_favorites_folder_content_list_top_bar_cancel_button");
                return s3q0.a;
            case 12:
                ShortVideoFeedClipsBlockItemsGroupsFullResultDto shortVideoFeedClipsBlockItemsGroupsFullResultDto = (ShortVideoFeedClipsBlockItemsGroupsFullResultDto) obj;
                if (!shortVideoFeedClipsBlockItemsGroupsFullResultDto.f().isEmpty()) {
                    return shortVideoFeedClipsBlockItemsGroupsFullResultDto;
                }
                throw new IllegalStateException("Response contains no items: " + shortVideoFeedClipsBlockItemsGroupsFullResultDto);
            case 13:
                return Boolean.valueOf(!(((com.vk.photo.editor.features.colorgrading.a) obj).b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            case 14:
                return new ach((ViewGroup) obj);
            case 15:
                String url = ((MarketGetEditUrlResponseDto) obj).getUrl();
                return url == null ? "" : url;
            case 16:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                yq9 a = ggjVar.a0().a();
                p4t0 p4t0Var = new p4t0();
                p4t0Var.setBounds(0, 0, an10.b(Float.intBitsToFloat((int) (ggjVar.d() >> 32))), an10.b(Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L))));
                Canvas canvas = e52.a;
                p4t0Var.draw(((d52) a).a);
                return s3q0.a;
            case 17:
                return ((Contact) obj).c;
            case 18:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_invite_to_chat, (Context) obj);
            case 19:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, bVar.g, bVar.j, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -1537, 2097151);
            case 20:
                DonutGetInfoGroupDonutBlockDto d2 = ((DonutGetInfoResponseDto) obj).d();
                if (d2 == null) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                it80.a aVar = it80.b;
                String title = d2.getTitle();
                String description = d2.getDescription();
                String f2 = d2.f();
                BaseLinkButtonDto d3 = d2.d();
                DonutBanner.a a2 = d3 != null ? fxn.a(d3) : null;
                BaseLinkButtonDto j = d2.j();
                DonutBanner.a a3 = j != null ? fxn.a(j) : null;
                DonutRegularSupportDto i2 = d2.i();
                if (i2 != null) {
                    String title2 = i2.getTitle();
                    DonutBanner.a a4 = fxn.a(i2.e());
                    String g2 = i2.g();
                    String d4 = i2.d();
                    List<DonutBenefitBlockDto> f3 = i2.f();
                    if (f3 != null) {
                        List<DonutBenefitBlockDto> list = f3;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                        for (DonutBenefitBlockDto donutBenefitBlockDto : list) {
                            String description2 = donutBenefitBlockDto.getDescription();
                            for (DonutBanner.DonutRegularSupport.DonutBenefitBlock.Type type : DonutBanner.DonutRegularSupport.DonutBenefitBlock.Type.h()) {
                                if (epx.f(type.i(), donutBenefitBlockDto.d().i())) {
                                    break;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            break;
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    donutRegularSupport = new DonutBanner.DonutRegularSupport(title2, a4, g2, d4, arrayList);
                } else {
                    donutRegularSupport = null;
                }
                DonutGoalsInfoDto g3 = d2.g();
                DonutBanner.b bVar2 = g3 != null ? new DonutBanner.b(g3.getTitle(), fxn.a(g3.d()), g3.e()) : null;
                DonutBannerDto e4 = d2.e();
                if (e4 == null) {
                    donutInfoBanner = null;
                } else {
                    if (fxn.a.$EnumSwitchMapping$0[e4.d().ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    donutInfoBanner = new DonutBanner.DonutInfoBanner(DonutBanner.DonutInfoBanner.Icon.ERROR, e4.e());
                }
                DonutBanner donutBanner = new DonutBanner(title, description, f2, a2, a3, donutRegularSupport, bVar2, donutInfoBanner);
                aVar.getClass();
                return new it80(donutBanner);
            case 21:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 22:
                qgi0.r((tgi0) obj, "DonutTeaserCaptionText");
                return s3q0.a;
            case 23:
                int i3 = DzenNewsCell.B;
                ((am) obj).x(true);
                return s3q0.a;
            case 24:
                p870 f4 = p870.f();
                s3q0 s3q0Var = s3q0.a;
                f4.e(1200, s3q0Var);
                p870.f().e(InterfaceC4319fe.a.e, (FaveTag) obj);
                return s3q0Var;
            case 25:
                return ((JSONObject) obj).getJSONObject("response");
            case 26:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 27:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                return ((xmt) obj).c.c;
            case 28:
                return ((JSONObject) obj).getJSONArray("response");
            default:
                return ((a5w) obj).t3();
        }
    }
}
