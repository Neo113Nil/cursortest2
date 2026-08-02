package xsna;

import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetRelatedAudiosResponseDto;
import com.vk.api.generated.video.dto.VideoRelatedAudioDto;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.n7a;
import xsna.xn50;

/* compiled from: CommunityProfileFeature.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class hoh extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hoh(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                break;
            case 1:
                ((kpg) this.receiver).a((CommunityProfileAction) obj);
                break;
            case 2:
                ((k2g0) this.receiver).a((i2g0) obj);
                break;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kjx kjxVar = (kjx) this.receiver;
                float f = kjx.h;
                kp1 kp1Var = kjxVar.e;
                if (booleanValue) {
                    kp1Var.invoke(n7a.d.b);
                } else {
                    kp1Var.invoke(n7a.a.b);
                }
                break;
            case 4:
                ((zcz) this.receiver).b(((Boolean) obj).booleanValue());
                break;
            case 5:
                L.i((Throwable) obj);
                break;
            case 6:
                com.vk.newsfeed.posting.geo_picker.presentation.e eVar = (com.vk.newsfeed.posting.geo_picker.presentation.e) this.receiver;
                eVar.getClass();
                xn50.a.c(eVar, (com.vk.newsfeed.posting.geo_picker.presentation.a) obj);
                break;
            case 7:
                ((izs) this.receiver).invoke((ixa0) obj);
                break;
            case 8:
                break;
            case 9:
                ((pns0) this.receiver).getClass();
                List<VideoRelatedAudioDto> d = ((VideoGetRelatedAudiosResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (VideoRelatedAudioDto videoRelatedAudioDto : d) {
                    AudioRestrictionDto f2 = videoRelatedAudioDto.f();
                    boolean z = false;
                    boolean z2 = f2 != null ? f2 != AudioRestrictionDto.NO : false;
                    int id = videoRelatedAudioDto.getId();
                    UserId q = videoRelatedAudioDto.q();
                    String title = videoRelatedAudioDto.getTitle();
                    String i = videoRelatedAudioDto.i();
                    String e = videoRelatedAudioDto.e();
                    AudioPhotoDto j = videoRelatedAudioDto.j();
                    Thumb r = j != null ? sdy.r(j) : null;
                    Boolean g = videoRelatedAudioDto.g();
                    if (g != null) {
                        z = g.booleanValue();
                    }
                    arrayList.add(new vrf0(id, q, title, i, e, r, z, z2, videoRelatedAudioDto.r(), videoRelatedAudioDto.d()));
                }
                break;
            case 10:
                Preference.H("StoryPrivacyCache", "GroupsResponse", ((bam0) this.receiver).d.toJson((GroupsGetObjectExtendedResponseDto) obj));
                break;
            case 11:
                ((b5u0) this.receiver).b(((Number) obj).floatValue());
                break;
            case 12:
                wyv0.k((wyv0) this.receiver, (Throwable) obj);
                break;
            case 13:
                VmojiPromoInSuggestsRepositoryImpl vmojiPromoInSuggestsRepositoryImpl = (VmojiPromoInSuggestsRepositoryImpl) this.receiver;
                vmojiPromoInSuggestsRepositoryImpl.getClass();
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                vmojiPromoInSuggestsRepositoryImpl.a();
                break;
            default:
                vgg vggVar = (vgg) obj;
                nir0 nir0Var = (nir0) this.receiver;
                nir0Var.getClass();
                Throwable th = vggVar.a;
                a35.a(vggVar);
                vggVar.d(new s(21, th, nir0Var));
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoh(Object obj, int i) {
        super(1, obj, k2g0.class, "navigate", "navigate(Lcom/vk/ecomm/reviews/impl/replies/presentation/RepliesNavigationEvent;)V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, kjx.class, "onClose", "onClose(Z)V", 0);
                break;
            case 5:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, io.reactivex.rxjava3.disposables.b.class, "add", "add(Lio/reactivex/rxjava3/disposables/Disposable;)Z", 0);
                break;
            case 9:
                super(1, obj, pns0.class, "map", "map(Lcom/vk/api/generated/video/dto/VideoGetRelatedAudiosResponseDto;)Lcom/vk/video/music/api/domain/entity/RelatedAudiosResult;", 0);
                break;
            case 13:
                super(1, obj, VmojiPromoInSuggestsRepositoryImpl.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
