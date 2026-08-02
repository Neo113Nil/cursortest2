package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsBannerDto;
import com.vk.api.generated.owners.dto.OwnersGetBannerResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.profile.community.details.impl.name_history.e;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import xsna.fh8;
import xsna.gte;
import xsna.lu4;
import xsna.rq1;
import xsna.tj50;
import xsna.v50;
import xsna.xf8;
import xsna.zze;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i8 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ i8(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SdkVideoFile k;
        ApiSessionStore lambda$answer$3;
        switch (this.b) {
            case 0:
                return ((VideoListWithTotalCount) obj).b;
            case 1:
                return (UsersUserFullDto) j5g.Y((List) obj);
            case 2:
                return v50.b.a;
            case 3:
                GroupsBannerDto d = ((OwnersGetBannerResponseDto) obj).d();
                if (d != null) {
                    r3 = new rc0(d.getTitle(), d.getDescription(), d.i(), Boolean.valueOf(d.f()), d.j(), d.d().getUrl(), d.k(), d.l().isEmpty() ? null : d.l().get(0).getUrl(), d.g(), d.o(), d.n());
                }
                it80.b.getClass();
                return new it80(r3);
            case 4:
                return rq1.c.a;
            case 5:
                Serializer.c<AudioBook> cVar = AudioBook.CREATOR;
                return ((AudioBookPerson) obj).c;
            case 6:
                qgi0.r((tgi0) obj, "moreButtonInQueue");
                return s3q0.a;
            case 7:
                tj50.a aVar = (tj50.a) obj;
                x4 x4Var = new x4(4);
                ao8 ao8Var = ao8.d;
                return new lu4.a.C3302a(aVar.a(x4Var, ao8Var), aVar.a(new k60(5), ao8Var));
            case 8:
                return k15.B((VideoFile) obj);
            case 9:
                return s3q0.a;
            case 10:
                xf8 xf8Var = (xf8) obj;
                if (xf8Var instanceof xf8.d) {
                    r3 = fh8.b.C2873b.a;
                } else if (xf8Var instanceof xf8.e) {
                    r3 = fh8.b.a.a;
                } else if (xf8Var instanceof xf8.h) {
                    xf8.h hVar = (xf8.h) xf8Var;
                    r3 = new fh8.p.b(hVar.a, hVar.b);
                } else if (xf8Var instanceof xf8.i) {
                    r3 = fh8.p.a.a;
                } else if (xf8Var instanceof xf8.b) {
                    r3 = fh8.a.b.a;
                } else if (xf8Var instanceof xf8.c) {
                    r3 = fh8.a.C2872a.a;
                } else if (xf8Var instanceof xf8.a) {
                    r3 = fh8.n.a;
                }
                return new it80(r3);
            case 11:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 12:
                return s3q0.a;
            case 13:
                cvk.u(R.string.sett_cache_clear_done, false);
                return s3q0.a;
            case 14:
                return Boolean.valueOf(((Group) obj).n());
            case 15:
                return Boolean.valueOf(!((ClipsCoauthorsSelectorMviState.a) obj).c.isEmpty());
            case 16:
                ((ikv0) obj).a();
                return s3q0.a;
            case 17:
                return ((qvc) obj).b;
            case 18:
                return Boolean.valueOf(((ClipsFavoriteFolderContentListState.Content) obj).f == ClipsFavoriteFolderContentListState.Content.LoadingState.REFRESHING);
            case 19:
                return (u2e) j5g.Y(((b4e) obj).a);
            case 20:
                return ((e2f) obj).a ? ClipsInterestsStatusProvider.Status.NEED_UPDATE : ClipsInterestsStatusProvider.Status.COMPLETED;
            case 21:
                hfz hfzVar = ((tqf) obj).c;
                FeedItem.d dVar = hfzVar instanceof FeedItem.d ? (FeedItem.d) hfzVar : null;
                if (dVar != null && (k = dVar.k()) != null) {
                    r3 = k15.A(k);
                }
                return io.reactivex.rxjava3.core.q.T(Optional.ofNullable(r3));
            case 22:
                return Boolean.valueOf(((gte.a) obj).c);
            case 23:
                zze.a aVar2 = (zze.a) obj;
                return new e3b0(aVar2.b, aVar2.g, aVar2.j, aVar2.m);
            case 24:
                return Boolean.FALSE;
            case 25:
                return new e.c(((tj50.a) obj).a(new n82(12), ao8.d));
            case 26:
                return s3q0.a;
            case 27:
                return new a1j((ViewGroup) obj);
            case 28:
                lambda$answer$3 = ConversationFactory.lambda$answer$3((ApiSessionStore) obj);
                return lambda$answer$3;
            default:
                Throwable th = (Throwable) obj;
                int i = com.vk.profile.questions.impl.b.q1;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).J()) {
                    cvk.u(R.string.answer_question_access_denied, true);
                } else {
                    j03.l(th);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ i8(zjw0 zjw0Var) {
        this.b = 10;
    }
}
