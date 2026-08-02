package xsna;

import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.video.dto.VideoAudioPlaylistDto;
import com.vk.api.generated.vmoji.dto.VmojiStickersSuggestionsDto;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.kbl0;

/* compiled from: AssetsRepository.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class hx3 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hx3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        String e;
        switch (this.b) {
            case 0:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 1:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                zcz zczVar = (zcz) this.receiver;
                VoipActionMultiLineView voipActionMultiLineView = zczVar.p;
                voipActionMultiLineView.setSwitchListener(null);
                VoipActionMultiLineView.b(voipActionMultiLineView, !booleanValue);
                voipActionMultiLineView.setSwitchListener(zczVar.r);
                break;
            case 3:
                ((uy00) this.receiver).g = false;
                h03.b((Throwable) obj);
                break;
            case 4:
                ((uj60) this.receiver).a((r070) obj);
                break;
            case 5:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 6:
                break;
            case 7:
                VideoAudioPlaylistDto videoAudioPlaylistDto = (VideoAudioPlaylistDto) obj;
                ((b3s0) this.receiver).getClass();
                String title = videoAudioPlaylistDto.getTitle();
                AudioPhotoDto d = videoAudioPlaylistDto.d();
                Thumb r = d != null ? sdy.r(d) : null;
                Boolean e2 = videoAudioPlaylistDto.e();
                break;
            case 8:
                ((b5u0) this.receiver).b(((Number) obj).floatValue());
                break;
            case 9:
                wyv0.k((wyv0) this.receiver, (Throwable) obj);
                break;
            case 10:
                List list = (List) obj;
                VmojiPromoInSuggestsRepositoryImpl vmojiPromoInSuggestsRepositoryImpl = (VmojiPromoInSuggestsRepositoryImpl) this.receiver;
                if (vmojiPromoInSuggestsRepositoryImpl.c == null) {
                    vmojiPromoInSuggestsRepositoryImpl.a();
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(bo6.a((BaseStickerDto) it.next()));
                    }
                    vmojiPromoInSuggestsRepositoryImpl.b = arrayList;
                    HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                    StickersDatabase.a.b().L().a(new kaw0(j5g.O0(vmojiPromoInSuggestsRepositoryImpl.a.values()), vmojiPromoInSuggestsRepositoryImpl.b));
                    HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                    VmojiPromoInSuggestsRepositoryImpl.VmojiPromoInSuggestsConfig e3 = kbl0.a.b().e();
                    VmojiStickersSuggestionsDto vmojiStickersSuggestionsDto = vmojiPromoInSuggestsRepositoryImpl.c;
                    String str2 = "";
                    if (vmojiStickersSuggestionsDto == null || (str = vmojiStickersSuggestionsDto.d()) == null) {
                        str = "";
                    }
                    e3.e(str);
                    VmojiStickersSuggestionsDto vmojiStickersSuggestionsDto2 = vmojiPromoInSuggestsRepositoryImpl.c;
                    if (vmojiStickersSuggestionsDto2 != null && (e = vmojiStickersSuggestionsDto2.e()) != null) {
                        str2 = e;
                    }
                    e3.g(str2);
                    kbl0 b = kbl0.a.b();
                    b.getClass();
                    Preference.H(b.a, "stickers_vmoji_promo_in_suggests_display_config", GsonHolder.a().toJson(e3));
                }
                break;
            default:
                L.i((Throwable) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx3(Object obj, int i) {
        super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 2:
            case 3:
            case 4:
            case 8:
            case 9:
            default:
                break;
            case 5:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 6:
                super(1, obj, io.reactivex.rxjava3.disposables.b.class, "add", "add(Lio/reactivex/rxjava3/disposables/Disposable;)Z", 0);
                break;
            case 7:
                super(1, obj, b3s0.class, "map", "map(Lcom/vk/api/generated/video/dto/VideoAudioPlaylistDto;)Lcom/vk/video/music/api/domain/entity/RelatedAudioPlaylist;", 0);
                break;
            case 10:
                super(1, obj, VmojiPromoInSuggestsRepositoryImpl.class, "processStickersDtoList", "processStickersDtoList(Ljava/util/List;)V", 0);
                break;
            case 11:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
