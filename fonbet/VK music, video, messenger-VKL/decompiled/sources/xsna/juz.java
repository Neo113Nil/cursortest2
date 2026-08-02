package xsna;

import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.log.L;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.bi40;
import xsna.qn60;
import xsna.sx80;
import xsna.t7z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class juz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ juz(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                Pair pair = (Pair) obj;
                DialogsHistory dialogsHistory = (DialogsHistory) pair.d();
                return new utk(new xrm(dialogsHistory, null, fsk.l(dialogsHistory), (ProfilesInfo) pair.g(), 2), dialogsHistory.j());
            case 1:
                qcy<Object>[] qcyVarArr = qgi0.a;
                sgi0<s3q0> sgi0Var = ngi0.y;
                s3q0 s3q0Var = s3q0.a;
                ((tgi0) obj).a(sgi0Var, s3q0Var);
                return s3q0Var;
            case 2:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 3:
                return ca3.b((Attachment) obj);
            case 4:
                List list = (List) obj;
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((OfflinePodcast) it.next()).d;
                }
                return new tt70(4, j, rli0.A(rli0.y(rli0.p(new i5g(list), new jz30(r2 ? 1 : 0)), 2)));
            case 5:
                bi40 bi40Var = (bi40) obj;
                if (bi40Var.equals(bi40.a.a)) {
                    i = R.string.music_talkback_delete_downloaded_album;
                } else if (bi40Var.equals(bi40.c.a)) {
                    i = R.string.music_talkback_download_album;
                } else if (bi40Var.equals(bi40.d.a)) {
                    i = R.string.music_talkback_pending_downloading_album;
                } else {
                    if (!(bi40Var instanceof bi40.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.music_talkback_downloading_album;
                }
                return Integer.valueOf(i);
            case 6:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 7:
                return fpf0.a(((sx80.a) obj).getClass());
            case 8:
                qgi0.r((tgi0) obj, "additional_info_description");
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((l3b0) obj).c);
            case 10:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "playlist_explicit_text");
                rgi0.a(tgi0Var);
                return s3q0.a;
            case 11:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof AnimatedStickerInfo) {
                        arrayList.add(obj2);
                    }
                }
                return j5g.O0(arrayList);
            case 12:
                qn60.c cVar = (qn60.c) obj;
                return new q8c0(cVar.a, cVar.b);
            case 13:
                return Boolean.valueOf(((u1c0) obj).c == 74);
            case 14:
                return new VideoAttachment((VideoFile) obj);
            case 15:
                com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Can not remove draft", (Throwable) obj));
                return s3q0.a;
            case 16:
                Parcelable parcelable = (Parcelable) obj;
                if (parcelable instanceof Attachment) {
                    return (Attachment) parcelable;
                }
                return null;
            case 17:
                L.i((Throwable) obj);
                return s3q0.a;
            case 18:
                return (com.vk.ecomm.product_list.presentation.j) obj;
            case 19:
                cvk.u(R.string.error_network, false);
                L.i((Throwable) obj);
                return s3q0.a;
            case 20:
                return ((VideoAlbumResultData) obj).c;
            case 21:
                qgi0.r((tgi0) obj, "community_rebooking_subtitle");
                return s3q0.a;
            case 22:
                LikeInfo likeInfo = (LikeInfo) obj;
                if (likeInfo != null) {
                    return likeInfo.c.getString("firstName");
                }
                return null;
            case 23:
                qgi0.r((tgi0) obj, "PostingSettingsRemovePollDialogTitle");
                return s3q0.a;
            case 24:
                return (io.reactivex.rxjava3.core.p) obj;
            case 25:
                return new t7z.b(((Integer) obj).intValue());
            case 26:
                qgi0.r((tgi0) obj, "search_database_item_subtitle");
                return s3q0.a;
            case 27:
                qgi0.r((tgi0) obj, "TEST_TAG_PLAYING_INDICATOR");
                return s3q0.a;
            case 28:
                cvk.u(R.string.error, false);
                return s3q0.a;
            default:
                return new oei0(((Long) obj).longValue());
        }
    }

    public /* synthetic */ juz(af40 af40Var) {
        this.b = 4;
    }
}
