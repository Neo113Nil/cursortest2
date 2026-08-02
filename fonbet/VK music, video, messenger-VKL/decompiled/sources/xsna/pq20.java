package xsna;

import android.media.MediaFormat;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: MiniAppsBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class pq20 implements wq5 {
    public static final jai b = new jai(954879418, new xdi(0), false);
    public static final jai c = new jai(1918065384, new com.vk.movika.tools.controls.seekbar.o(5), false);
    public static final pq20 d = new pq20();

    public static final hpt0 b() {
        return new hpt0();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List c(UserId userId, List list) {
        String str;
        Triple triple;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Attachment attachment = (Attachment) it.next();
                if (attachment instanceof PhotoAttachment) {
                    PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
                    triple = new Triple("photo", Integer.valueOf(photoAttachment.f), photoAttachment.g);
                } else if (attachment instanceof VideoAttachment) {
                    VideoAttachment videoAttachment = (VideoAttachment) attachment;
                    triple = new Triple("video", videoAttachment.getId(), videoAttachment.k.I0());
                } else if (attachment instanceof DocumentAttachment) {
                    DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
                    triple = new Triple("doc", Integer.valueOf(documentAttachment.k), documentAttachment.o);
                } else if (attachment instanceof AudioAttachment) {
                    AudioAttachment audioAttachment = (AudioAttachment) attachment;
                    triple = new Triple("audio", Integer.valueOf(audioAttachment.f.b), audioAttachment.f.c);
                } else if (attachment instanceof StickerAttachment) {
                    triple = new Triple("sticker", Integer.valueOf(((StickerAttachment) attachment).f.b), userId);
                } else {
                    str = null;
                    if (str == null) {
                        arrayList2.add(str);
                    }
                }
                String str2 = (String) triple.d();
                Number number = (Number) triple.g();
                str = ((UserId) triple.h()) + '_' + number + '_' + str2;
                if (str == null) {
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }

    public static final ems0 d(l8l l8lVar, int i) {
        Integer g;
        Integer e;
        Integer f;
        Integer num;
        MediaFormat mediaFormat = l8lVar.c;
        gr10 gr10Var = mediaFormat != null ? new gr10(mediaFormat) : null;
        int i2 = l8lVar.a;
        int i3 = l8lVar.b;
        if (gr10Var != null && (num = gr10Var.k) != null) {
            i = num.intValue();
        }
        int i4 = 0;
        int intValue = (gr10Var == null || (f = gr10Var.f()) == null) ? 0 : f.intValue();
        String valueOf = intValue != 1 ? intValue != 2 ? intValue != 4 ? intValue != 6 ? String.valueOf(intValue) : "bt2020" : "bt601_ntsc" : "bt601_pal" : "bt709";
        int intValue2 = (gr10Var == null || (e = gr10Var.e()) == null) ? 0 : e.intValue();
        String valueOf2 = intValue2 != 1 ? intValue2 != 2 ? String.valueOf(intValue2) : "tv(limited)" : "pc(full)";
        if (gr10Var != null && (g = gr10Var.g()) != null) {
            i4 = g.intValue();
        }
        return new ems0(i2, i3, i, new gye0(valueOf, valueOf2, i4 != 1 ? i4 != 3 ? i4 != 6 ? i4 != 7 ? String.valueOf(i4) : "hlg" : "st2084(pq)" : "sdr" : "linear"));
    }

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(String str, yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(620856957);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(620856957, i3, -1, "com.vk.notifications.design.compose.list.common.NotificationAvatarContent.<anonymous>.<anonymous>.<no name provided>.Content (NotificationAvatarContent.kt:98)");
            }
            if (as.a((i3 & 112) | 8, yzsVar, fwu0.l(str, null, null, null, M, i3 & 14, 62), M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i3h(i, 2, this, str, yzsVar);
        }
    }
}
