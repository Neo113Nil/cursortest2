package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersKeywordsResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.Peer;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.reviews.impl.allreviews.presentation.e;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.photogallery.LocalMediaGalleryProvider;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.voip.ui.asr.ui.list.a;
import java.util.List;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.atb0;
import xsna.ozh0;
import xsna.tj50;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v4v implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ v4v(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
    
        if ((r6 instanceof com.vk.im.engine.exceptions.ApiAccessDeniedException) != false) goto L43;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean _init_$lambda$0;
        switch (this.b) {
            case 0:
                int i = HighlightEditFragment.h0;
                qgi0.r((tgi0) obj, "edit_input_title");
                return s3q0.a;
            case 1:
                sew sewVar = (sew) obj;
                return sewVar.a + " : " + com.vk.im.engine.models.im_item.b.a(sewVar.b);
            case 2:
                return yal0.b((StoreGetStickersKeywordsResponseDto) obj);
            case 3:
                return Boolean.valueOf(!((fjw0) obj).a.h());
            case 4:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 5:
                _init_$lambda$0 = LocalMediaGalleryProvider._init_$lambda$0((q4t) obj);
                return Boolean.valueOf(_init_$lambda$0);
            case 6:
                h4l0.a.a(new c790((StickerStockItem) obj));
                return s3q0.a;
            case 7:
                return e.C1009e.a;
            case 8:
                s410 s410Var = ((x410) obj).B;
                return Boolean.valueOf((s410Var.a == null || s410Var.d == null || s410Var.c == null) ? false : true);
            case 9:
                return u810.j((y810) obj);
            case 10:
                qgi0.n((tgi0) obj, 0);
                return s3q0.a;
            case 11:
                Throwable th = (Throwable) obj;
                int i2 = MasksWrap.e0;
                L.i(th);
                j03.l(th);
                return s3q0.a;
            case 12:
                return String.valueOf(((Peer) obj).b);
            case 13:
                return s3q0.a;
            case 14:
                return Boolean.valueOf(((t430) obj).b);
            case 15:
                return Boolean.valueOf(((Msg) obj).Mb());
            case 16:
                Throwable th2 = (Throwable) obj;
                if (!(th2 instanceof VKApiExecutionException)) {
                    break;
                } else {
                    if (((VKApiExecutionException) th2).s() == 100) {
                        com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("MessageHistoryLoader api error", th2));
                        r1 = false;
                    }
                    return Boolean.valueOf(r1);
                }
            case 17:
                return Long.valueOf(((Peer) obj).b);
            case 18:
                return 0;
            case 19:
                MusicOfflineSyncServiceHelper.h("audio.getPlaylistById", (Throwable) obj);
                return s3q0.a;
            case 20:
                return ((MusicPickerState) obj).f;
            case 21:
                return s3q0.a;
            case 22:
                qgi0.r((tgi0) obj, "order_header_right_button");
                return s3q0.a;
            case 23:
                return new a.b(((tj50.a) obj).a(en90.b, ao8.d));
            case 24:
                tj50.a aVar = (tj50.a) obj;
                h0u0 e = aVar.e(new av70(3));
                com comVar = new com(28);
                ao8 ao8Var = ao8.d;
                return new atb0.a(e, aVar.a(new d0k(22), ao8Var), aVar.a(comVar, ao8Var), aVar.a(qsb0.b, ao8Var));
            case 25:
                xo9.y((RequestUserProfile) obj, true);
                return s3q0.a;
            case 26:
                int i3 = ProfileMainPhotosFragment.F0;
                ((UsableRecyclerView) obj).setPadding(0, 0, 0, iah0.a(8));
                return s3q0.a;
            case 27:
                qgi0.r((tgi0) obj, "errorRetryButton");
                return s3q0.a;
            case 28:
                List list = (List) obj;
                Object obj2 = list.get(1);
                List list2 = (epx.f(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((izs) i2h0.b.c).invoke(obj2);
                Object obj3 = list.get(0);
                return new us2((List<? extends us2.d<? extends us2.a>>) list2, obj3 != null ? (String) obj3 : null);
            default:
                return new ozh0.a(new onh0(), ((u4a) obj).b.I, 4);
        }
    }

    public /* synthetic */ v4v(Object obj, int i) {
        this.b = i;
    }
}
