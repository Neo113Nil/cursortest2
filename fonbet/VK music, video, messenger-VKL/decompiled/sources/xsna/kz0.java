package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.market.dto.MarketGetByIdExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedClipsBlockItemsGroupsFullResultDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetStaticsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoStaticSectionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoStaticSectionItemsDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListState;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.im.ui.fragments.ImStartGroupCallFragment;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import xsna.k840;
import xsna.m1j;
import xsna.nz0;
import xsna.t7h;
import xsna.tzp0;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kz0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ kz0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.vk.clips.sdk.shared.paging.PaginationKey$Next] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<ShortVideoStaticSectionItemsDto> d;
        int c;
        ShortVideoStaticSectionItemsDto shortVideoStaticSectionItemsDto = null;
        switch (this.b) {
            case 0:
                return ((nz0.a) obj).b.e;
            case 1:
                return Long.valueOf(z4g.g((File) obj));
            case 2:
                AudioBook audioBook = (AudioBook) obj;
                qh4 a = k840.a.a();
                bpn0 bpn0Var = o25.a;
                a.B(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c(), audioBook);
                return s3q0.a;
            case 3:
                ffu0 ffu0Var = new ffu0((Context) obj, null, 0);
                ffu0Var.o0("https://upload.wikimedia.org/wikipedia/commons/5/58/Shiba_inu_taiki.jpg", null);
                return ffu0Var;
            case 4:
                return ((qvw0) obj).d();
            case 5:
                L.i((Throwable) obj);
                return io.reactivex.rxjava3.internal.operators.maybe.i.b;
            case 6:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (jnj.b(((Playlist) obj2).O)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 7:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 8:
                tzp0.c.a aVar = poc.l1;
                return com.vk.clips.coauthors.list.common.mvi.entity.viewstate.a.a((ClipCoauthorListState) obj);
            case 9:
                return s3q0.a;
            case 10:
                int i = ClipsGridDraftsListFragment.l0;
                h03.b((Throwable) obj);
                return s3q0.a;
            case 11:
                ShortVideoFeedClipsBlockItemsGroupsFullResultDto shortVideoFeedClipsBlockItemsGroupsFullResultDto = (ShortVideoFeedClipsBlockItemsGroupsFullResultDto) obj;
                List e = ums0.e(ums0.a, shortVideoFeedClipsBlockItemsGroupsFullResultDto.f(), shortVideoFeedClipsBlockItemsGroupsFullResultDto.i(), shortVideoFeedClipsBlockItemsGroupsFullResultDto.e(), false, 52);
                ArrayList arrayList2 = new ArrayList(c5g.u(e, 10));
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new wih0.a(k15.B((VideoFile) it.next()), null));
                }
                PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
                String g = shortVideoFeedClipsBlockItemsGroupsFullResultDto.g();
                PaginationKey.LoadedFull next = (g == null || g.length() == 0 || g.equals("null")) ? loadedFull : new PaginationKey.Next(g);
                String d2 = shortVideoFeedClipsBlockItemsGroupsFullResultDto.d();
                List<ShortVideoQuestionnaireDto> j = shortVideoFeedClipsBlockItemsGroupsFullResultDto.j();
                return new qih0(arrayList2, loadedFull, next, d2, j != null ? egj0.a(j) : null);
            case 12:
                ShortVideoStaticSectionDto shortVideoStaticSectionDto = (ShortVideoStaticSectionDto) j5g.a0(((ShortVideoGetStaticsResponseDto) obj).d());
                if (shortVideoStaticSectionDto == null || (d = shortVideoStaticSectionDto.d()) == null) {
                    return null;
                }
                Iterator it2 = d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ?? next2 = it2.next();
                        if (epx.f(((ShortVideoStaticSectionItemsDto) next2).d(), "avatar_placeholder")) {
                            shortVideoStaticSectionItemsDto = next2;
                        }
                    }
                }
                return shortVideoStaticSectionItemsDto;
            case 13:
                return t7h.a.b.a;
            case 14:
                return s3q0.a;
            case 15:
                return m1j.b.a;
            case 16:
                return Long.valueOf(((t8j) obj).b.getId().longValue());
            case 17:
                return (MarketMarketItemFullDto) j5g.Y(((MarketGetByIdExtendedResponseDto) obj).d());
            case 18:
                Throwable th = ((yfn) obj).f;
                boolean z = th instanceof VKApiExecutionException;
                if (z && ((VKApiExecutionException) th).s() == 104) {
                    c = R.string.music_playlist_not_found;
                } else if (z && ((VKApiExecutionException) th).s() == 15) {
                    c = R.string.music_playlist_access_denied;
                } else if (k840.a.h()) {
                    c = R.string.music_offline_mode_kids_error_description;
                } else {
                    j03.a.getClass();
                    c = j03.c(th);
                }
                boolean z2 = z && ((VKApiExecutionException) th).s() == -1;
                j03.a.getClass();
                return new ivp(c, z2, j03.a(17101, th));
            case 19:
                return io.reactivex.rxjava3.core.q.T(Boolean.valueOf(((BaseOkResponseDto) obj).i() == 1));
            case 20:
                String str = ((ouz) obj).b;
                AttachImage attachImage = new AttachImage();
                attachImage.r = new ImageList(new Image(str));
                attachImage.l = new File(str);
                attachImage.m = DownloadState.DOWNLOADED;
                attachImage.c = AttachSyncState.UPLOAD_REQUIRED;
                return attachImage;
            case 21:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 22:
                com.vk.metrics.eventtracking.b.a.a(new RuntimeException("Audio message. Find related entities error", (Throwable) obj));
                Context context = vwv.c;
                enj.q(R.string.vkim_audio_msg_player_error, 0, context != null ? context : null);
                return s3q0.a;
            case 23:
                return Boolean.TRUE;
            case 24:
                int i2 = ImStartGroupCallFragment.f0;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 25:
                Map.Entry entry = (Map.Entry) obj;
                String str2 = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                StringBuilder sb = new StringBuilder();
                jqm0.a(str2, sb);
                sb.append(':');
                sb.append(jsonElement);
                return sb.toString();
            case 26:
                List list = (List) obj;
                return new dsy(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 27:
                return null;
            case 28:
                return s3q0.a;
            default:
                VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell((Context) obj, null, 6);
                vkMiniInfoCell.setOnClickListener(new o44(0));
                return vkMiniInfoCell;
        }
    }
}
