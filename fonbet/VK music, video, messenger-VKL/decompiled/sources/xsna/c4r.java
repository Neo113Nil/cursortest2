package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsSuspendResponseDto;
import com.vk.api.generated.messages.dto.MessagesReactionCounterResponseItemDto;
import com.vk.api.generated.messages.dto.MessagesReactionCountersResponseItemDto;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.TaggedPhoto;
import com.vk.geo.impl.presentation.j;
import com.vk.im.engine.models.messages.MsgReactionImpl;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.player.PlayerTrack;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.co20;
import xsna.dug0;
import xsna.tj50;
import xsna.xl40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class c4r implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ c4r(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return k15.B((VideoFile) obj);
            case 1:
                sxp sxpVar = (sxp) obj;
                return Boolean.valueOf((sxpVar instanceof w480) || (sxpVar instanceof b580) || (sxpVar instanceof l580) || (sxpVar instanceof f580));
            case 2:
                cvk.u(R.string.friends_catalog_report_sent_error, false);
                return s3q0.a;
            case 3:
                xgx0.a.getClass();
                xgx0.c("An error occurred on getting exchange data", (Throwable) obj);
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 5:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 6:
                tj50.a aVar = (tj50.a) obj;
                rl2 rl2Var = new rl2(25);
                ao8 ao8Var = ao8.d;
                return new j.a(aVar.a(rl2Var, ao8Var), aVar.a(new ci7(24), ao8Var), aVar.a(new x90(22), ao8Var));
            case 7:
                List<MessagesReactionCounterResponseItemDto> e = ((MessagesReactionCountersResponseItemDto) obj).e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                for (MessagesReactionCounterResponseItemDto messagesReactionCounterResponseItemDto : e) {
                    int d = messagesReactionCounterResponseItemDto.d();
                    List<UserId> e2 = messagesReactionCounterResponseItemDto.e();
                    ArrayList arrayList2 = new ArrayList(c5g.u(e2, 10));
                    Iterator<T> it = e2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((UserId) it.next()).b));
                    }
                    arrayList.add(new MsgReactionImpl(d, arrayList2, messagesReactionCounterResponseItemDto.getCount()));
                }
                return arrayList;
            case 8:
                return Boolean.valueOf(((it80) obj).a());
            case 9:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 10:
                frn0 system = ((xgl0) obj).system();
                int d2 = system.d() + 1;
                system.c(d2);
                return Integer.valueOf(d2);
            case 11:
                l0y l0yVar = (l0y) obj;
                if (l0yVar != k0y.v && !l0yVar.a && l0yVar.b) {
                    cvk.u(R.string.community_user_already_member, false);
                }
                return s3q0.a;
            case 12:
                x410 x410Var = (x410) obj;
                if (x410Var.g) {
                    s410 s410Var = x410Var.B;
                    if (s410Var.a == null || s410Var.d == null || s410Var.c == null) {
                        r1 = true;
                    }
                }
                return Boolean.valueOf(r1);
            case 13:
                int i = MasksWrap.e0;
                L.g("MasksWrap", (Throwable) obj);
                return s3q0.a;
            case 14:
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj;
                if (mediaStoreEntry instanceof MediaStoreImageEntry) {
                    return new LocalMediaEntry.Image((MediaStoreImageEntry) mediaStoreEntry);
                }
                if (mediaStoreEntry instanceof MediaStoreVideoEntry) {
                    return new LocalMediaEntry.Video((MediaStoreVideoEntry) mediaStoreEntry);
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                ((zak0) co20.q).setValue((co20.a) obj);
                return s3q0.a;
            case 16:
                return new MusicBottomSheetLaunchPoint.Player.Full((PlayerTrack) obj);
            case 17:
                Activity h = e3m.h((Context) obj);
                if (h != null) {
                    xl40 n = ((MusicKidsModeComponent) m7m.a(h).a(fpf0.a(MusicKidsModeComponent.class))).n();
                    xl40.a aVar2 = xl40.a;
                    n.a(h);
                }
                return s3q0.a;
            case 18:
                qgi0.r((tgi0) obj, "MusicPickerPlaylistSubTitle");
                return s3q0.a;
            case 19:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 20:
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return ((zg60) obj).c.b;
            case 21:
                qcy<Object>[] qcyVarArr2 = NewsfeedSearchFragment.p0;
                return Boolean.valueOf(((wy60) obj).c.d);
            case 22:
                CommunitySubscriptionsSuspendResponseDto communitySubscriptionsSuspendResponseDto = (CommunitySubscriptionsSuspendResponseDto) obj;
                return new lna0(communitySubscriptionsSuspendResponseDto.getTitle(), communitySubscriptionsSuspendResponseDto.getDescription());
            case 23:
                Integer num = (Integer) obj;
                return (num != null && num.intValue() == 1) ? BaseBoolIntDto.YES : BaseBoolIntDto.NO;
            case 24:
                return Boolean.valueOf(((inb0) obj).b == null);
            case 25:
                qgi0.r((tgi0) obj, "product_card_community_reviews");
                return s3q0.a;
            case 26:
                qgi0.r((tgi0) obj, "product_card_restriction_first_button");
                return s3q0.a;
            case 27:
                Photo photo = (Photo) obj;
                int i2 = ProfileMainPhotosFragment.F0;
                if (!(photo instanceof TaggedPhoto)) {
                    return s3q0.a;
                }
                if (photo.B == null) {
                    photo.B = null;
                }
                vtk0.c().b(photo);
                throw null;
            case 28:
                if (((Throwable) obj) instanceof IllegalStateException) {
                    cvk.u(R.string.qr_post_deleted_or_unavailable, false);
                }
                return s3q0.a;
            default:
                ((tdu) obj).Q0(1);
                return s3q0.a;
        }
    }

    public /* synthetic */ c4r(ProfileMainPhotosFragment profileMainPhotosFragment) {
        this.b = 27;
    }
}
