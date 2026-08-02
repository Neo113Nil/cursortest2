package xsna;

import com.vk.dto.attaches.AttachDisplayConfig;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.StereoRoomAttachment;
import com.vk.dto.common.Attachment;
import com.vk.pending.PendingAudioAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.BookingAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PostingAttachArrangerImpl.kt */
/* loaded from: classes4.dex */
public final class zbc0 {
    public AttachmentsArrangementConfig a;
    public boolean b;

    public static String a(Attachment attachment) {
        return attachment instanceof AlbumAttachment ? "album" : ((attachment instanceof PhotoAttachment) || (attachment instanceof PendingPhotoAttachment)) ? "photo" : ((attachment instanceof PendingAudioAttachment) || (attachment instanceof AudioAttachment)) ? "audio" : ((attachment instanceof PendingVideoAttachment) || (attachment instanceof VideoAttachment)) ? "video" : attachment instanceof DocumentAttachment ? cgc0.a(attachment) ? "document_image" : "doc" : attachment instanceof PollAttachment ? "poll" : attachment instanceof GeoAttachment ? "geo" : attachment instanceof ArticleAttachment ? "article" : attachment instanceof MarketAttachment ? "market" : attachment instanceof MarketAlbumAttachment ? "market_album" : attachment instanceof NarrativeAttachment ? "narrative" : ((attachment instanceof LinkAttachment) || (attachment instanceof SnippetAttachment)) ? "link" : attachment instanceof PodcastAttachment ? "podcast" : attachment instanceof AudioPlaylistAttachment ? "audio_playlist" : attachment instanceof GraffitiAttachment ? "graffiti" : attachment instanceof StereoRoomAttachment ? SignalingProtocol.KEY_ROOM : attachment instanceof AudioArtistAttachment ? "artist" : attachment instanceof BookingAttachment ? "online_booking" : attachment instanceof MarketLinkAttachment ? "market_link" : attachment instanceof MarketMessageOwnerAttachment ? "message_to_bc" : "";
    }

    public final Boolean b(Attachment attachment) {
        if (this.b) {
            return Boolean.FALSE;
        }
        AttachmentsArrangementConfig attachmentsArrangementConfig = this.a;
        if (attachmentsArrangementConfig == null) {
            return null;
        }
        return Boolean.valueOf(attachmentsArrangementConfig.d.containsKey(a(attachment)));
    }

    public final List c(ArrayList arrayList) {
        Object obj;
        String str;
        AttachmentsArrangementConfig attachmentsArrangementConfig = this.a;
        if (attachmentsArrangementConfig == null) {
            return EmptyList.b;
        }
        int i = 0;
        this.b = false;
        List<List<AttachDisplayConfig>> list = attachmentsArrangementConfig.c;
        Map<String, AttachDisplayConfig> map = attachmentsArrangementConfig.d;
        List<AttachDisplayConfig> list2 = attachmentsArrangementConfig.e;
        ArrayList c = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            if (c.size() == list3.size()) {
                List list4 = list3;
                int i2 = i;
                for (Object obj2 : list4) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    AttachDisplayConfig attachDisplayConfig = (AttachDisplayConfig) obj2;
                    Iterator it2 = c.iterator();
                    int i4 = i;
                    while (true) {
                        if (!it2.hasNext()) {
                            i4 = -1;
                            break;
                        }
                        if (a((Attachment) it2.next()).equals(attachDisplayConfig.b)) {
                            break;
                        }
                        i4++;
                    }
                    int i5 = i4;
                    if (i5 < 0) {
                        break;
                    }
                    Collections.swap(c, i5, i2);
                    i2 = i3;
                    i = 0;
                }
                this.b = true;
                ArrayList arrayList2 = new ArrayList(c5g.u(c, 10));
                Iterator it3 = c.iterator();
                while (it3.hasNext()) {
                    Attachment attachment = (Attachment) it3.next();
                    Iterator it4 = list4.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it4.next();
                        if (((AttachDisplayConfig) obj).b.equals(a(attachment))) {
                            break;
                        }
                    }
                    AttachDisplayConfig attachDisplayConfig2 = (AttachDisplayConfig) obj;
                    if (attachDisplayConfig2 == null || (str = (String) j5g.Y(attachDisplayConfig2.c)) == null) {
                        str = "compact";
                    }
                    arrayList2.add(new x04(attachment, str, false));
                }
                return arrayList2;
            }
            i = 0;
        }
        Throwable th = null;
        ArrayList c2 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList);
        ArrayList arrayList3 = new ArrayList();
        int i6 = 0;
        for (Object obj3 : arrayList) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                Throwable th2 = th;
                e43.t();
                throw th2;
            }
            boolean containsKey = map.containsKey(a((Attachment) obj3));
            Throwable th3 = th;
            if (containsKey) {
                c2.set(i6, th3);
            }
            if (containsKey) {
                arrayList3.add(obj3);
            }
            i6 = i7;
            th = th3;
        }
        List C0 = j5g.C0(arrayList3);
        ArrayList arrayList4 = new ArrayList(c5g.u(C0, 10));
        Iterator it5 = C0.iterator();
        while (it5.hasNext()) {
            arrayList4.add(new x04((Attachment) it5.next(), "full", true));
        }
        boolean isEmpty = arrayList4.isEmpty();
        ArrayList arrayList5 = new ArrayList();
        for (AttachDisplayConfig attachDisplayConfig3 : list2) {
            List V = j5g.V(c2);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : V) {
                if (a((Attachment) obj4).equals(attachDisplayConfig3.b)) {
                    arrayList6.add(obj4);
                }
            }
            g5g.y(arrayList6, arrayList5);
        }
        ArrayList arrayList7 = new ArrayList(c5g.u(arrayList5, 10));
        Iterator it6 = arrayList5.iterator();
        int i8 = 0;
        while (it6.hasNext()) {
            Object next = it6.next();
            int i9 = i8 + 1;
            if (i8 < 0) {
                e43.t();
                throw null;
            }
            Attachment attachment2 = (Attachment) next;
            arrayList7.add(new x04(attachment2, ((attachment2 instanceof DocumentAttachment) || (attachment2 instanceof MarketLinkAttachment) || (attachment2 instanceof MarketMessageOwnerAttachment) || !isEmpty || !(i8 == 0)) ? "compact" : "full", false));
            i8 = i9;
        }
        return j5g.u0(arrayList7, arrayList4);
    }
}
