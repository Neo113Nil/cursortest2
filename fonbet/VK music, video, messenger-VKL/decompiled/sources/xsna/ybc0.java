package xsna;

import com.vk.dto.attaches.AttachDisplayConfig;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: PostingAttachArrangerImpl.kt */
/* loaded from: classes4.dex */
public final class ybc0 {
    public AttachmentsArrangementConfig a;
    public boolean b;

    public static String a(Attachment attachment) {
        return attachment instanceof AlbumAttachment ? "album" : attachment instanceof ArticleAttachment ? "article" : attachment instanceof SnippetAttachment ? "link" : ((attachment instanceof PhotoAttachment) || (attachment instanceof VideoAttachment)) ? "video" : ((attachment instanceof DocumentAttachment) && ((DocumentAttachment) attachment).x5()) ? "gif" : "";
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

    public final List<x04> c(List<? extends Attachment> list) {
        Object obj;
        String str;
        AttachmentsArrangementConfig attachmentsArrangementConfig = this.a;
        if (attachmentsArrangementConfig == null) {
            return EmptyList.b;
        }
        int i = 0;
        this.b = false;
        List<List<AttachDisplayConfig>> list2 = attachmentsArrangementConfig.c;
        Map<String, AttachDisplayConfig> map = attachmentsArrangementConfig.d;
        List<AttachDisplayConfig> list3 = attachmentsArrangementConfig.e;
        ArrayList arrayList = new ArrayList();
        List<? extends Attachment> list4 = list;
        arrayList.addAll(list4);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List list5 = (List) it.next();
            if (arrayList.size() == list5.size()) {
                List list6 = list5;
                int i2 = i;
                for (Object obj2 : list6) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    AttachDisplayConfig attachDisplayConfig = (AttachDisplayConfig) obj2;
                    Iterator it2 = arrayList.iterator();
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
                    Collections.swap(arrayList, i5, i2);
                    i2 = i3;
                    i = 0;
                }
                this.b = true;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Attachment attachment = (Attachment) it3.next();
                    Iterator it4 = list6.iterator();
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
                        str = "full";
                    }
                    arrayList2.add(new x04(attachment, str, false));
                }
                return arrayList2;
            }
            i = 0;
        }
        Throwable th = null;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(list4);
        ArrayList arrayList4 = new ArrayList();
        int i6 = 0;
        for (Object obj3 : list) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                Throwable th2 = th;
                e43.t();
                throw th2;
            }
            boolean containsKey = map.containsKey(a((Attachment) obj3));
            Throwable th3 = th;
            if (containsKey) {
                arrayList3.set(i6, th3);
            }
            if (containsKey) {
                arrayList4.add(obj3);
            }
            i6 = i7;
            th = th3;
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new x04((Attachment) it5.next(), "full", true));
        }
        ArrayList arrayList6 = new ArrayList();
        for (AttachDisplayConfig attachDisplayConfig3 : list3) {
            List V = j5g.V(arrayList3);
            ArrayList arrayList7 = new ArrayList();
            for (Object obj4 : V) {
                if (a((Attachment) obj4).equals(attachDisplayConfig3.b)) {
                    arrayList7.add(obj4);
                }
            }
            g5g.y(arrayList7, arrayList6);
        }
        ArrayList arrayList8 = new ArrayList(c5g.u(arrayList6, 10));
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            arrayList8.add(new x04((Attachment) it6.next(), "full", false));
        }
        return j5g.u0(arrayList8, arrayList5);
    }
}
