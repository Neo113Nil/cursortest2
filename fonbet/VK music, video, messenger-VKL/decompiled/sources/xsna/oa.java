package xsna;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.clips.design.view.component.activities.like.ClipsBubbleAvatarView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.contacts.AndroidContact;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.log.L;
import com.vk.media.MediaFilteringStrategy;
import com.vk.music.player.analytics.api.mediascope.MusicMediaScopeAction;
import com.vk.music.player.analytics.impl.tracker.mediascope.MusicMediaScopeCommand;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import one.video.ad.ux.AdRedirectView;
import xsna.bhk;
import xsna.is60;
import xsna.l1c;
import xsna.v3s;
import xsna.x900;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class oa implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ oa(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r11;
        switch (this.b) {
            case 0:
                hfz hfzVar = (hfz) obj;
                int i = AbsFollowersListFragment.Y;
                v3s.a aVar = hfzVar instanceof v3s.a ? (v3s.a) hfzVar : null;
                if (aVar != null) {
                    return aVar.b;
                }
                return null;
            case 1:
                vf.e((Throwable) obj);
                return s3q0.a;
            case 2:
                AdRedirectView adRedirectView = new AdRedirectView((Context) obj, null, 0, 14, 0);
                adRedirectView.setImageLoader(new jl80());
                return adRedirectView;
            case 3:
                RecyclerView recyclerView = new RecyclerView((Context) obj);
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                recyclerView.addItemDecoration(new in1());
                RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
                androidx.recyclerview.widget.n0 n0Var = itemAnimator instanceof androidx.recyclerview.widget.n0 ? (androidx.recyclerview.widget.n0) itemAnimator : null;
                if (n0Var != null) {
                    n0Var.g = false;
                }
                return recyclerView;
            case 4:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                List x = rdi.x(arrayList);
                return x != null ? io.reactivex.rxjava3.core.x.k(x) : io.reactivex.rxjava3.core.x.i(new RuntimeException("No audio received"));
            case 5:
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((uki0) obj).iterator();
                while (it2.hasNext()) {
                    AndroidContact c = u62.c((Cursor) it2.next());
                    if (c != null) {
                        arrayList2.add(c);
                    }
                }
                return u62.a(arrayList2);
            case 6:
                L.g("ComposingBgSyncStateStorage", (Throwable) obj);
                return s3q0.a;
            case 7:
                BookingServiceModel bookingServiceModel = (BookingServiceModel) obj;
                if (bookingServiceModel.e <= 0 && bookingServiceModel.f <= 0) {
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 8:
                List<Msg> list2 = ((o8b) obj).c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof MsgFromChannel) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            case 9:
                return l1c.b.a;
            case 10:
                qgi0.r((tgi0) obj, "checkout_form_field_input");
                return s3q0.a;
            case 11:
                View view = (View) obj;
                if (!(view instanceof lfe) && !(view instanceof ClipsBubbleAvatarView)) {
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 12:
                return s3q0.a;
            case 13:
                Intent intent = (Intent) obj;
                intent.putExtra("media_type", 333);
                intent.putExtra("video_filtering_mode", MediaFilteringStrategy.ANY_VIDEO_WITH_AUDIO);
                intent.putExtra("video_min_length_ms", 1000L);
                intent.putExtra("video_max_length_ms", ynd.a);
                intent.putExtra("prevent_styling", true);
                intent.putExtra("single_mode", true);
                intent.putExtra("camera_enabled", false);
                return s3q0.a;
            case 14:
                int i2 = ClipsFavoriteFolderContentListFragment.W;
                qgi0.r((tgi0) obj, "clips_favorites_folder_content_list_top_bar_title");
                return s3q0.a;
            case 15:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 16:
                return k4g0.a((k4g0) obj, false, !r1.l, 2047);
            case 17:
                return ((ztg) obj).d;
            case 18:
                qgi0.r((tgi0) obj, "groupBannerTitle");
                return s3q0.a;
            case 19:
                return ((bhk.a) obj).h;
            case 20:
                return new gm7((ViewGroup) obj);
            case 21:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_notifications_enable);
            case 22:
                return v900.c((v900) obj, x900.a.a);
            case 23:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 24:
                return ((BaseUserGroupFieldsDto) obj).i();
            case 25:
                new ne6();
                List<ShortVideoPlaylistFullDto> d = ((ShortVideoGetPlaylistsResponseDto) obj).d();
                ArrayList arrayList4 = new ArrayList(c5g.u(d, 10));
                for (ShortVideoPlaylistFullDto shortVideoPlaylistFullDto : d) {
                    int id = shortVideoPlaylistFullDto.getId();
                    String title = shortVideoPlaylistFullDto.getTitle();
                    List<List<BaseImageDto>> e = shortVideoPlaylistFullDto.e();
                    if (e != null) {
                        List<List<BaseImageDto>> list3 = e;
                        r11 = new ArrayList(c5g.u(list3, 10));
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            ImageSize Cb = ne6.a((List) it3.next()).Cb(ImageScreenSize.VERY_SMALL.h(), true, false);
                            String str = Cb != null ? Cb.d.d : null;
                            if (str == null) {
                                str = "";
                            }
                            r11.add(str);
                        }
                    } else {
                        r11 = 0;
                    }
                    if (r11 == 0) {
                        r11 = EmptyList.b;
                    }
                    arrayList4.add(new ClipsPlaylist(id, title, r11, shortVideoPlaylistFullDto.getCount(), shortVideoPlaylistFullDto.q(), o25.a().a(shortVideoPlaylistFullDto.q()), null, 64, null));
                }
                return arrayList4;
            case 26:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 27:
                xbu0 xbu0Var = (xbu0) obj;
                return epx.f(xbu0Var, xbu0.i) ? io.reactivex.rxjava3.core.q.H(new IllegalStateException("Received empty exchange data on logout")) : io.reactivex.rxjava3.core.q.T(xbu0Var);
            case 28:
                return ((Boolean) obj).booleanValue() ? io.reactivex.rxjava3.core.x.k(Boolean.TRUE).f(500L, TimeUnit.MILLISECONDS) : io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            default:
                gmt gmtVar = (gmt) obj;
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                q3p0 q3p0Var = new q3p0(gmtVar.b, gmtVar.c);
                ur60 ur60Var = gmtVar.d;
                sq60 sq60Var = ur60Var.b;
                ListLoadingState listLoadingState = ur60Var.e;
                boolean z = ur60Var.f;
                boolean z2 = ur60Var.g;
                return new xmt(q3p0Var, new is60.a(sq60Var, listLoadingState, z, z2), sq60Var.a.isEmpty() && !z2 && !z && listLoadingState == ListLoadingState.IDLE);
        }
    }

    public /* synthetic */ oa(MusicMediaScopeAction musicMediaScopeAction, MusicMediaScopeCommand musicMediaScopeCommand, vf vfVar) {
        this.b = 1;
    }

    public /* synthetic */ oa(u62 u62Var) {
        this.b = 5;
    }
}
