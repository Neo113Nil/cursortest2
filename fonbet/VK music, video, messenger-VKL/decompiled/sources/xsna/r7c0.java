package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.WikiAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.q7c0;

/* compiled from: PostStickerAttachmentTypeMapper.kt */
/* loaded from: classes15.dex */
public final class r7c0 {
    public static ArrayList a(y9c0 y9c0Var, List list) {
        q7c0 q7c0Var;
        q7c0 q7c0Var2;
        ArrayList arrayList = new ArrayList();
        if (y9c0Var != null) {
            arrayList.add(q7c0.b.d.a);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((Attachment) obj) instanceof ActionButtonAttachment)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            q7c0Var = q7c0.b.e.a;
            q7c0Var2 = q7c0.b.c.a;
            if (!hasNext) {
                break;
            }
            Attachment attachment = (Attachment) it.next();
            if (!(attachment instanceof VideoAttachment)) {
                if (attachment instanceof AlbumAttachment) {
                    q7c0Var = q7c0.b.a.a;
                } else if (attachment instanceof PollAttachment) {
                    q7c0Var = q7c0.a.g.a;
                } else if (attachment instanceof ArticleAttachment) {
                    q7c0Var = q7c0.a.C3551a.a;
                } else if (attachment instanceof AudioPlaylistAttachment) {
                    q7c0Var = q7c0.a.f.a;
                } else if (attachment instanceof AudioAttachment) {
                    q7c0Var = q7c0.a.h.a;
                } else if ((attachment instanceof LinkAttachment) || (attachment instanceof MiniAppAttachment) || (attachment instanceof PrettyCardAttachment) || (attachment instanceof GraffitiAttachment) || (attachment instanceof StickerAttachment) || (attachment instanceof WikiAttachment) || (attachment instanceof SnippetAttachment)) {
                    q7c0Var = q7c0.a.d.a;
                } else if (attachment instanceof GeoAttachment) {
                    q7c0Var = q7c0.a.c.a;
                } else {
                    if (!(attachment instanceof PhotoAttachment)) {
                        if (attachment instanceof DocumentAttachment) {
                            Image image = ((DocumentAttachment) attachment).s;
                            if (image == null || image.b.isEmpty()) {
                                q7c0Var = q7c0.a.b.a;
                            }
                        } else {
                            q7c0Var = attachment instanceof NarrativeAttachment ? q7c0.a.e.a : q7c0.a.i.a;
                        }
                    }
                    q7c0Var = q7c0Var2;
                }
            }
            arrayList3.add(q7c0Var);
        }
        if (arrayList3.size() < 2) {
            arrayList.addAll(arrayList3);
            return arrayList;
        }
        int i = 0;
        while (i < arrayList3.size() && (epx.f(arrayList3.get(i), q7c0Var2) || epx.f(arrayList3.get(i), q7c0Var))) {
            i++;
        }
        if (i < 2) {
            arrayList.addAll(arrayList3);
            return arrayList;
        }
        arrayList.add(new q7c0.b.C3552b(i));
        arrayList.addAll(arrayList3.subList(i, arrayList3.size()));
        return arrayList;
    }
}
