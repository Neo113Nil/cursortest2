package defpackage;

import com.yandex.go.feed_video.actions.models.MediaItemDto;
import com.yandex.go.feed_video.actions.models.MediaStreamDto;
import com.yandex.go.feed_video.actions.models.StreamTypeDto;
import com.yandex.go.feed_video.domain.MediaItem$StreamType;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ChatRole;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class nkb1 {
    public static String a(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static boolean b(ChatHistoryResponse chatHistoryResponse, a3b a3bVar) {
        if (a3bVar.h != chatHistoryResponse.lastEditTimestamp) {
            return true;
        }
        Long l = a3bVar.e;
        long j = chatHistoryResponse.lastMessageTimestamp;
        if (l == null || l.longValue() != j) {
            return true;
        }
        ChatRole chatRole = chatHistoryResponse.myRole;
        return ((chatRole == null || jl40.l(Long.valueOf(chatRole.version), a3bVar.l)) && a3bVar.d == chatHistoryResponse.otherSeenMarker && a3bVar.c == chatHistoryResponse.ownerLastSeenSequenceNumber && a3bVar.b == chatHistoryResponse.ownerSeenMarker) ? false : true;
    }

    public static final ee10 c(MediaItemDto mediaItemDto) {
        String str = mediaItemDto.a;
        List<MediaStreamDto> list = mediaItemDto.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (MediaStreamDto mediaStreamDto : list) {
            StreamTypeDto streamTypeDto = mediaStreamDto.a;
            int i = streamTypeDto == null ? -1 : mg10.a[streamTypeDto.ordinal()];
            MediaItem$StreamType mediaItem$StreamType = null;
            if (i != -1) {
                if (i == 1) {
                    mediaItem$StreamType = MediaItem$StreamType.DASH;
                } else if (i == 2) {
                    mediaItem$StreamType = MediaItem$StreamType.DASH_MB;
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    mediaItem$StreamType = MediaItem$StreamType.HLS;
                }
            }
            arrayList.add(new ce10(mediaItem$StreamType, mediaStreamDto.b));
        }
        return new ee10(str, arrayList, mediaItemDto.c, mediaItemDto.d, mediaItemDto.e);
    }
}
