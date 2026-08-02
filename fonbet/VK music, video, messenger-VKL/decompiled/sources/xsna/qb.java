package xsna;

import android.content.Context;
import com.vk.api.generated.audio.dto.AudioGetReactionsConfigResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.dto.music.MusicTrack;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.hzg;
import xsna.o9c;
import xsna.pqc;
import xsna.qls;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class qb implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qb(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return (UsersUserFullDto) j5g.Y((List) obj);
            case 1:
                int i = AlbumsListFragment.a0;
                qgi0.r((tgi0) obj, "toolbar_title");
                return s3q0.a;
            case 2:
                ((ikv0) obj).a();
                return s3q0.a;
            case 3:
                return ((zrb0) obj).a;
            case 4:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 5:
                return Boolean.valueOf(((sy40) obj).z);
            case 6:
                return ((AudioGetReactionsConfigResponseDto) obj).d();
            case 7:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (jnj.b(((MusicTrack) obj2).V)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 8:
                return s3q0.a;
            case 9:
                ChatFragment.d dVar = ChatFragment.w1;
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 10:
                return o9c.c.a;
            case 11:
                return new pqc.a.C3527a((Throwable) obj);
            case 12:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 13:
                ClipsCoauthorsSelectorMviState.c cVar = (ClipsCoauthorsSelectorMviState.c) obj;
                ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
                clipsFeatures.getClass();
                return Boolean.valueOf((com.vk.toggle.b.A.a(clipsFeatures) || cVar.c.isEmpty() || cVar.g.isEmpty()) ? false : true);
            case 14:
                return Boolean.valueOf(((ClipsFavoriteFolderContentListState.Content) obj).f == ClipsFavoriteFolderContentListState.Content.LoadingState.REFRESHING);
            case 15:
                return s3q0.a;
            case 16:
                return ((wsf) obj).b;
            case 17:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 18:
                return ((vtg) obj).b;
            case 19:
                return hzg.c.a;
            case 20:
                return ((c9k) obj).C;
            case 21:
                qgi0.g((tgi0) obj);
                return s3q0.a;
            case 22:
                return Integer.valueOf(((com.vk.im.engine.models.dialogs.d) obj).a.i());
            case 23:
                DonutBadge donutBadge = new DonutBadge((Context) obj, null, 6);
                donutBadge.setText("Поддержать за 300 ₽/мес");
                return donutBadge;
            case 24:
                return s3q0.a;
            case 25:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 26:
                int i2 = FiltersRecyclerView.j;
                lyd.a.e("FiltersRecyclerView", "", (Throwable) obj);
                return s3q0.a;
            case 27:
                return s3q0.a;
            case 28:
                return qls.e.a;
            default:
                return ((JSONObject) obj).getJSONArray("response");
        }
    }
}
