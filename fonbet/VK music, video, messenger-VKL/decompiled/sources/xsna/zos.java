package xsna;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.apps.dto.AppsGetGroupsListItemDto;
import com.vk.api.generated.apps.dto.AppsGetGroupsListResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import me.grishka.appkit.views.UsableRecyclerView;
import org.json.JSONObject;
import xsna.er9;
import xsna.goh0;
import xsna.ha70;
import xsna.loh0;
import xsna.r7x;
import xsna.ynh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class zos implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ zos(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List g;
        switch (this.b) {
            case 0:
                return ((JSONObject) obj).getJSONArray("response");
            case 1:
                List<AppsGetGroupsListItemDto> d = ((AppsGetGroupsListResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (AppsGetGroupsListItemDto appsGetGroupsListItemDto : d) {
                    long j = appsGetGroupsListItemDto.e().g().b;
                    String i = appsGetGroupsListItemDto.e().i();
                    if (i == null) {
                        i = "";
                    }
                    String j2 = appsGetGroupsListItemDto.e().j();
                    String str = j2 != null ? j2 : "";
                    GroupsGroupIsClosedDto F = appsGetGroupsListItemDto.e().F();
                    WebGroup webGroup = new WebGroup(j, i, str, F != null ? F.i() : 0);
                    boolean d2 = appsGetGroupsListItemDto.d();
                    String f = appsGetGroupsListItemDto.f();
                    AppsGetGroupsListItemDto.SendPushCheckboxStateDto g2 = appsGetGroupsListItemDto.g();
                    int i2 = g2 == null ? -1 : bf3.$EnumSwitchMapping$0[g2.ordinal()];
                    arrayList.add(new AppsGroupsContainer(webGroup, d2, f, i2 != 1 ? i2 != 2 ? AppsGroupsContainer.CheckboxState.HIDDEN : AppsGroupsContainer.CheckboxState.DISABLE : AppsGroupsContainer.CheckboxState.AVAILABLE));
                }
                return arrayList;
            case 2:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                return Boolean.valueOf(((xmt) obj).c.d);
            case 3:
                UsableRecyclerView usableRecyclerView = new UsableRecyclerView((Context) obj);
                usableRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                usableRecyclerView.addItemDecoration(new ifv());
                ((androidx.recyclerview.widget.n0) usableRecyclerView.getItemAnimator()).g = false;
                return usableRecyclerView;
            case 4:
                return ((r7x.a) obj).c;
            case 5:
                ggj ggjVar = (ggj) obj;
                er9.b a0 = ggjVar.a0();
                long d3 = a0.d();
                a0.a().e();
                try {
                    a0.a.c(-3.4028235E38f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    ggjVar.s1();
                    nq.b(a0, d3);
                    return s3q0.a;
                } catch (Throwable th) {
                    nq.b(a0, d3);
                    throw th;
                }
            case 6:
                return fl3.I((Cursor) obj);
            case 7:
                return ((x410) obj).e;
            case 8:
                com.vk.im.ui.components.msg_list.a.P0.a((Throwable) obj);
                return s3q0.a;
            case 9:
                DownloadingState downloadingState = ((ib50) obj).a.J;
                if (!(downloadingState instanceof DownloadingState.Downloading) && !(downloadingState instanceof DownloadingState.PendingDownload)) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 10:
                return new eym0((ViewGroup) obj);
            case 11:
                return new ha70.s((UserId) obj);
            case 12:
                String str2 = (String) obj;
                xot xotVar = OKVoipEngine.j;
                if (xotVar.c && xotVar.b) {
                    OKVoipEngine.k.h.c(str2);
                }
                return s3q0.a;
            case 13:
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                mcr0.t((Uri) obj);
                return s3q0.a;
            case 14:
                return new zh80((ViewGroup) obj, 1);
            case 15:
                return (io.reactivex.rxjava3.core.x) obj;
            case 16:
                Context context = (Context) obj;
                FrameLayout frameLayout = new FrameLayout(context);
                ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
                thumbsImageView.setId(R.id.audio_image);
                thumbsImageView.setCornerRadius(context.getResources().getDimension(R.dimen.music_podcasts_image_playlist_cover_corners));
                frameLayout.addView(thumbsImageView, new FrameLayout.LayoutParams(-1, -1));
                VKImageView vKImageView = new VKImageView(context, null, 6, 0);
                vKImageView.setId(R.id.audio_playing_indicator);
                vKImageView.setBackground(dhr0.t.a(R.drawable.music_dark_round_rect));
                vKImageView.setImportantForAccessibility(2);
                vKImageView.setVisibility(8);
                frameLayout.addView(vKImageView, new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            case 17:
                return ((PostingState.Editing) obj).k;
            case 18:
                return s3q0.a;
            case 19:
                qgi0.r((tgi0) obj, "product_card_cta_call_primary_button_text");
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, "product_card_top_bar_favorite");
                return s3q0.a;
            case 21:
                BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) obj;
                return new ncq0(baseUploadServerDto.e(), baseUploadServerDto.d(), null, null, null, 28);
            case 22:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -1, 2015);
            case 23:
                return Boolean.valueOf(((sy40) obj).e.e);
            case 24:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 25:
                return new obo0(((Integer) obj).intValue());
            case 26:
                rdg0 rdg0Var = (rdg0) obj;
                String str3 = rdg0Var.d;
                String str4 = rdg0Var.e;
                String str5 = rdg0Var.c;
                String str6 = rdg0Var.f;
                String r = rli0.r(rli0.h(rli0.m(rl3.D(Arrays.copyOf(new String[]{str5, str6}, 2)))), ", ", null, 62);
                if (r.length() == 0) {
                    r = rli0.r(rli0.h(rli0.m(rl3.D(Arrays.copyOf(new String[]{str4, str3, rdg0Var.h}, 3)))), ", ", null, 62);
                }
                if (r.length() == 0) {
                    r = rdg0Var.b;
                }
                String str7 = rdg0Var.a;
                if (str7 == null) {
                    str7 = r;
                }
                if (str3 == null) {
                    str3 = str4;
                }
                return new kt0(str7, r, str3, !(str6 == null || str6.length() == 0));
            case 27:
                goh0.a aVar = (goh0.a) obj;
                ExtendedCommunityProfile extendedCommunityProfile = aVar.b;
                if (extendedCommunityProfile.a0 < 2) {
                    ListBuilder listBuilder = new ListBuilder(2);
                    if (bwd0.h(extendedCommunityProfile)) {
                        listBuilder.add(new loh0.a(xa4.y(extendedCommunityProfile), ynh0.f.b, null, aVar.e, 8));
                    }
                    if (extendedCommunityProfile.e0) {
                        listBuilder.add(new loh0.a(R.string.message, ynh0.g.b, null, false, 28));
                    }
                    g = listBuilder.g();
                } else if (extendedCommunityProfile.e0) {
                    int i3 = extendedCommunityProfile.i2;
                    g = Collections.singletonList(new loh0.a(R.string.message, ynh0.b.b, i3 > 0 ? Integer.valueOf(i3) : null, false, 20));
                } else {
                    g = extendedCommunityProfile.j2 != null ? Collections.singletonList(new loh0.a(R.string.search_admin_action_button_promotion, ynh0.c.b, null, false, 28)) : EmptyList.b;
                }
                return new loh0.b(g, 2);
            case 28:
                return ((SearchDatabaseState) ((mph0) obj)).b;
            default:
                tq2 tq2Var = (tq2) obj;
                return new ov70((Float.floatToRawIntBits(tq2Var.a) << 32) | (Float.floatToRawIntBits(tq2Var.b) & 4294967295L));
        }
    }

    public /* synthetic */ zos(eoh0 eoh0Var) {
        this.b = 27;
    }
}
