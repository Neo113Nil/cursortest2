package xsna;

import android.database.DatabaseUtils;
import android.view.ViewGroup;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.audio.dto.AudioDeleteExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.narratives.dto.NarrativesSaveCustomCoverResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfoView$MovieInfoBlockState;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.serialize.Serializer;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.b;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.b750;
import xsna.it80;
import xsna.tj50;
import xsna.x7i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class n9w implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ n9w(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                cvk.u(R.string.error, false);
                return s3q0.a;
            case 1:
                int i = ImportContactsFragment.Q;
                return s3q0.a;
            case 2:
                return Boolean.valueOf(!((StoryCameraGalleryData) obj).c);
            case 3:
                return Boolean.valueOf(((f1e0) obj).g());
            case 4:
                fjw0 fjw0Var = (fjw0) obj;
                return Boolean.valueOf(fjw0Var.b == VoipViewModelState.InCall && fjw0Var.a == VoipViewModelState.Connecting);
            case 5:
                return b.C1399b.a;
            case 6:
                return ((AudioDeleteExtendedResponseDto) obj).d();
            case 7:
                MovieInfoView$MovieInfoBlockState movieInfoView$MovieInfoBlockState = (MovieInfoView$MovieInfoBlockState) obj;
                return new MovieInfoView$MovieInfoBlockState(movieInfoView$MovieInfoBlockState.b, movieInfoView$MovieInfoBlockState.c, movieInfoView$MovieInfoBlockState.d, movieInfoView$MovieInfoBlockState.e, movieInfoView$MovieInfoBlockState.f, movieInfoView$MovieInfoBlockState.g, movieInfoView$MovieInfoBlockState.h, movieInfoView$MovieInfoBlockState.i, movieInfoView$MovieInfoBlockState.j, movieInfoView$MovieInfoBlockState.k, movieInfoView$MovieInfoBlockState.l, movieInfoView$MovieInfoBlockState.m, movieInfoView$MovieInfoBlockState.n, movieInfoView$MovieInfoBlockState.o, !movieInfoView$MovieInfoBlockState.p, movieInfoView$MovieInfoBlockState.q);
            case 8:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (jnj.b(((MusicTrack) obj2).V)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 9:
                ((tj50.a) obj).a(x650.b, ao8.d);
                return new b750.a();
            case 10:
                bpn0 bpn0Var = xfa0.a;
                return xfa0.a(((NarrativesSaveCustomCoverResponseDto) obj).d());
            case 11:
                sxp sxpVar = (sxp) obj;
                if ((!(sxpVar instanceof p680) || !((p680) sxpVar).c) && !(sxpVar instanceof OnCacheInvalidateEvent) && !(sxpVar instanceof m380)) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 12:
                return (String) ((Map.Entry) obj).getKey();
            case 13:
                ((Boolean) obj).getClass();
                return s3q0.a;
            case 14:
                JSONObject jSONObject = (JSONObject) obj;
                Serializer.c<GeoLocation> cVar = GeoLocation.CREATOR;
                if (jSONObject == null) {
                    return null;
                }
                return jSONObject.has("place") ? com.vk.dto.geo.a.a(jSONObject, jSONObject.getJSONObject("place")) : com.vk.dto.geo.a.a(jSONObject, jSONObject);
            case 15:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 16:
                qgi0.r((tgi0) obj, "PrivacySettingsToolbarCloseButton");
                return s3q0.a;
            case 17:
                return new kod0((ViewGroup) obj);
            case 18:
                UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
                UsersUserFullDto i2 = utilsDomainResolvedWithDataDto.i();
                GroupsGroupFullDto f = utilsDomainResolvedWithDataDto.f();
                AppsAppDto d = utilsDomainResolvedWithDataDto.d();
                if (i2 != null) {
                    new j2r0();
                    return j2r0.a(i2);
                }
                if (f != null) {
                    new dqu();
                    return dqu.a(f);
                }
                if (d == null) {
                    return null;
                }
                new re3();
                return re3.b(d);
            case 19:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM recent_gif");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 20:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? R.string.music_talkback_player_shuffle_track_in_queue : R.string.music_talkback_player_shuffle_track_in_queue_turn_off);
            case 21:
                qgi0.r((tgi0) obj, "AttachedClipsScreenTags.ICON_BACK");
                return s3q0.a;
            case 22:
                ArrayList<UIBlock> arrayList2 = ((UIBlockList) obj).y;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator<T> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((UIBlock) it.next()).e == CatalogDataType.DATA_TYPE_SEARCH_AUTHORS) {
                            return Boolean.valueOf(r3);
                        }
                    }
                }
                r3 = false;
                return Boolean.valueOf(r3);
            case 23:
                qgi0.r((tgi0) obj, "search_filters_top_bar_clear");
                return s3q0.a;
            case 24:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.r(tgi0Var, "TEST_TAG_RIGHT_ICON");
                return s3q0.a;
            case 25:
                x7i0 x7i0Var = (x7i0) obj;
                x7i0.a aVar = x7i0Var instanceof x7i0.a ? (x7i0.a) x7i0Var : null;
                if (aVar != null) {
                    return aVar.b;
                }
                return null;
            case 26:
                qgi0.r((tgi0) obj, "vk_top_bar_title");
                return s3q0.a;
            case 27:
                it80.b.getClass();
                return it80.a.a();
            case 28:
                return DatabaseUtils.sqlEscapeString(String.valueOf(obj));
            default:
                qgi0.r((tgi0) obj, "storefront_top_bar_bookmarks_icon");
                return s3q0.a;
        }
    }

    public /* synthetic */ n9w(Object obj, int i) {
        this.b = i;
    }
}
