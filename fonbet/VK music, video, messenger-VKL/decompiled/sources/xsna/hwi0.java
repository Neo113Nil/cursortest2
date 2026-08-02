package xsna;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsGetByIdResponseDto;
import com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsThemeDto;
import com.vk.api.generated.store.dto.StoreGetStickersKeywordsResponseDto;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.settings.SettingsPriority;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.photo.editor.views.PointerView;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.storycamera.picker.ui.c;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.vmoji.character.model.VmojiStickerPacksModel;
import com.vk.voip.ui.sessionrooms.d;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.json.JSONObject;
import xsna.ext;
import xsna.h6x0;
import xsna.it80;
import xsna.p7w0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class hwi0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ hwi0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsGroupFullDto groupsGroupFullDto;
        String str;
        UserProfile userProfile = null;
        boolean z = false;
        switch (this.b) {
            case 0:
                return j5g.D0(new d.a(), (Collection) obj);
            case 1:
                return PostingSettings.a((PostingSettings) obj, SettingsPriority.Cache, null, null, null, 2097143);
            case 2:
                sxp sxpVar = (sxp) obj;
                if (!(sxpVar instanceof i980)) {
                    return sxpVar instanceof qb80 ? Optional.of(new gcj0(((qb80) sxpVar).c, null)) : Optional.empty();
                }
                i980 i980Var = (i980) sxpVar;
                return Optional.of(new gcj0(i980Var.f, Long.valueOf(i980Var.d)));
            case 3:
                return s3q0.a;
            case 4:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, false, false, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
            case 5:
                return Boolean.valueOf(((nov) obj) instanceof h7m0);
            case 6:
                StoryBackground storyBackground = (StoryBackground) obj;
                if (storyBackground.d != null && storyBackground.c != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                return null;
            case 8:
                it80.a aVar = it80.b;
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) != null) {
                    new dqu();
                    Group a = dqu.a(groupsGroupFullDto);
                    userProfile = new UserProfile();
                    userProfile.c = fkq0.e(a.c);
                    userProfile.e = a.d;
                    userProfile.B.Ab(a.y);
                }
                aVar.getClass();
                return new it80(userProfile);
            case 9:
                return c.C1848c.a;
            case 10:
                String e = ((SituationalSuggestsThemeDto) j5g.Y(((SituationalSuggestsGetByIdResponseDto) obj).d())).e();
                if (e == null || (str = drm0.p0(e).toString()) == null) {
                    str = "";
                }
                return er.a(HttpRequest.DEFAULT_SCHEME).authority(a0a.d).appendPath("new_story").appendQueryParameter("storybox", Base64.encodeToString(str.getBytes(emb.b), 0)).appendQueryParameter("entry_point", "LINK".toLowerCase(Locale.ROOT)).build().toString();
            case 11:
                qgo0 qgo0Var = (qgo0) obj;
                Integer a2 = qgo0Var.a();
                if (a2 == null) {
                    return null;
                }
                int intValue = a2.intValue();
                long j = qgo0Var.f;
                int i = qko0.c;
                return new ivl(0, intValue - ((int) (j & 4294967295L)));
            case 12:
                rco rcoVar = (rco) obj;
                return new tq2(rco.a(rcoVar.a), rco.b(rcoVar.a));
            case 13:
                int i2 = VideoAlbumEditorFragment.l0;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 14:
                int i3 = VideoAuthorView.l;
                ((etv0) obj).b(false);
                return s3q0.a;
            case 15:
                return Boolean.FALSE;
            case 16:
                return ((ext.b) obj).a.n();
            case 17:
                VkEnhancedImageView vkEnhancedImageView = (VkEnhancedImageView) obj;
                qcy<Object>[] qcyVarArr2 = VkEnhancedImageView.q;
                return new ahs(vkEnhancedImageView, vkEnhancedImageView.getBackend());
            case 18:
                q5j q5jVar = (q5j) obj;
                x5j x5jVar = q5jVar.e;
                s5j s5jVar = q5jVar.c;
                jcv.b(x5jVar, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jor0.a(q5jVar.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                return s3q0.a;
            case 19:
                return new p7w0.d.b((VmojiStickerPacksModel) obj);
            case 20:
                return ((StoreGetStickersKeywordsResponseDto) obj).f();
            case 21:
                L.f("VoipCallAuthDataProviderImpl", "Error listening auth status", (Throwable) obj);
                return s3q0.a;
            case 22:
                tj50.a aVar2 = (tj50.a) obj;
                iiu0 iiu0Var = new iiu0(7);
                ao8 ao8Var = ao8.d;
                return new h6x0.e(aVar2.a(iiu0Var, ao8Var), aVar2.a(b6x0.b, ao8Var));
            case 23:
                return ((JSONObject) obj).getJSONObject("response").getJSONArray("groups");
            default:
                return Float.valueOf(((PointerView) obj).getOuterCircleRadius());
        }
    }

    public /* synthetic */ hwi0(Object obj, int i) {
        this.b = i;
    }
}
