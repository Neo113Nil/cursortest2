package xsna;

import android.webkit.MimeTypeMap;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: ImAttachUtils.kt */
/* loaded from: classes2.dex */
public final class rwv {
    public static final String a(AttachDoc attachDoc) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(attachDoc.j);
        return mimeTypeFromExtension == null ? "" : mimeTypeFromExtension;
    }

    public static void b(List list, LinkedHashMap linkedHashMap, boolean z) {
        Object obj;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Attach attach = (Attach) it.next();
            if (attach.xb() > 0) {
                obj = Integer.valueOf(attach.xb());
            } else if (attach instanceof AttachMap) {
                obj = attach.getClass();
            } else if (attach instanceof AttachArticle) {
                obj = attach.getClass();
            } else if (attach instanceof AttachMarket) {
                obj = attach.getClass();
            } else if (attach instanceof AttachSticker) {
                obj = attach.getClass();
            } else if (attach instanceof AttachUgcSticker) {
                obj = attach.getClass();
            } else if (attach instanceof AttachGift) {
                obj = attach.getClass();
            } else if (attach instanceof AttachGraffiti) {
                obj = attach.getClass();
            } else if (attach instanceof AttachAudioMsg) {
                obj = attach.getClass();
            } else if (attach instanceof AttachLink) {
                obj = attach.getClass();
            } else if (attach instanceof AttachWall) {
                obj = attach.getClass();
            } else if (attach instanceof AttachWallReply) {
                obj = attach.getClass();
            } else if (attach instanceof AttachVideo) {
                obj = Long.valueOf(((AttachVideo) attach).getId());
            } else if (attach instanceof AttachAudio) {
                obj = Long.valueOf(((AttachAudio) attach).f);
            } else if (attach instanceof AttachImage) {
                obj = Long.valueOf(((AttachImage) attach).e);
            } else if (attach instanceof AttachDoc) {
                obj = Long.valueOf(((AttachDoc) attach).e);
            } else if (attach instanceof AttachQuestion) {
                obj = Long.valueOf(((AttachQuestion) attach).b);
            } else {
                if (!(attach instanceof AttachChannelMessage)) {
                    throw new IllegalStateException("Unknown attach");
                }
                obj = attach.getClass();
            }
            if (!z || linkedHashMap.containsKey(obj)) {
                linkedHashMap.put(obj, attach);
            }
        }
    }

    public static final Image c(ImageList imageList) {
        ArrayList arrayList = new ArrayList(c5g.u(imageList, 10));
        for (com.vk.dto.common.im.Image image : imageList.b) {
            arrayList.add(new ImageSize(image.getUrl(), image.getWidth(), image.getHeight(), Boolean.valueOf(image.c7()), ImageSize.b.d(image.getWidth(), image.getHeight(), image.c7()), false, 32, null));
        }
        return new Image(arrayList);
    }
}
