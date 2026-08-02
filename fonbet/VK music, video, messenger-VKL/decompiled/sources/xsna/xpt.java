package xsna;

import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBannedExtendedResponseDto;
import com.vk.api.generated.polls.dto.PollsGetVotersCriteriaResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.log.L;
import com.vk.ml.b;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bs70;
import xsna.g7g0;
import xsna.kit0;
import xsna.p1v;
import xsna.p410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xpt implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xpt(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                qgi0.r((tgi0) obj, "GovernmentIconTag");
                return s3q0.a;
            case 2:
                a5w a5wVar = (a5w) obj;
                return a5wVar.t3() + " : " + com.vk.im.engine.models.im_item.b.a(a5wVar.y9());
            case 3:
                ((ojt) obj).b = 100;
                return s3q0.a;
            case 4:
                kit0.a aVar = (kit0.a) obj;
                VideoFileOld videoFileOld = aVar.b;
                return rsg0.y0(new gns0(videoFileOld.b, videoFileOld.c, videoFileOld.r0), null, null, 3).U(new nit(new jp5(16, videoFileOld, aVar), 3));
            case 5:
                n410 n410Var = (n410) obj;
                return new p410.f.c(n410Var.f, n410Var.g);
            case 6:
                return ((MediaType) obj).h();
            case 7:
                return ((b.a) obj).a.g();
            case 8:
                MusicTrack musicTrack = ((ib50) obj).a;
                return Boolean.valueOf(musicTrack.Mb() && !(musicTrack.J instanceof DownloadingState.Downloading));
            case 9:
                return Boolean.valueOf(((sy40) obj).e.d);
            case 10:
                yk60.n.set(true);
                yk60.b(yk60.a, new p1v.d((bl60) obj), 1);
                return s3q0.a;
            case 11:
                NewsfeedGetBannedExtendedResponseDto newsfeedGetBannedExtendedResponseDto = (NewsfeedGetBannedExtendedResponseDto) obj;
                List<UsersUserFullDto> f = newsfeedGetBannedExtendedResponseDto.f();
                if (f == null) {
                    f = EmptyList.b;
                }
                new j2r0();
                Integer g = newsfeedGetBannedExtendedResponseDto.g();
                int intValue = g != null ? g.intValue() : f.size();
                String e = newsfeedGetBannedExtendedResponseDto.e();
                List<UsersUserFullDto> list = f;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(j2r0.a((UsersUserFullDto) it.next()));
                }
                return new cfr(e, arrayList, intValue);
            case 12:
                return ((kb70) obj).getClass();
            case 13:
                return Boolean.valueOf(((bs70) obj) instanceof bs70.b);
            case 14:
                return VideoLargeListState.a((VideoLargeListState) obj, null, true, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 67108607);
            case 15:
                int i = PollResultsFragment.b0;
                return Optional.of((PollsGetVotersCriteriaResponseDto) obj);
            case 16:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.u(tgi0Var);
                qgi0.v(tgi0Var, -1.0f);
                return s3q0.a;
            case 17:
                return Boolean.valueOf(((PostingState.Editing) obj).p);
            case 18:
                qgi0.n((tgi0) obj, 6);
                return s3q0.a;
            case 19:
                qgi0.r((tgi0) obj, "product_preview_voice_search");
                return s3q0.a;
            case 20:
                return Boolean.valueOf(((View) obj) instanceof RecyclerView);
            case 21:
                L.i((Throwable) obj);
                return s3q0.a;
            case 22:
                tpe0 tpe0Var = new tpe0(R.layout.pds_item_question_shimmer, (ViewGroup) obj);
                ((ShimmerFrameLayout) tpe0Var.itemView).d();
                return tpe0Var;
            case 23:
                L.i((Throwable) obj);
                return s3q0.a;
            case 24:
                return inf0.e((Location) obj);
            case 25:
                return CatalogSectionState.a((CatalogSectionState) obj, null, false, false, null, null, true, null, EmptyList.b, null, null, 6399);
            case 26:
                return new g7g0.c((yfx0) obj, null);
            case 27:
                Image image = ((UserProfile) obj).O;
                if (image == null) {
                    return null;
                }
                Serializer.c<Owner> cVar = Owner.CREATOR;
                return Owner.a.a(50, image);
            case 28:
                return ((SearchQueryValueHelper.a) ((Pair) obj).d()).a;
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ xpt(inf0 inf0Var) {
        this.b = 24;
    }
}
