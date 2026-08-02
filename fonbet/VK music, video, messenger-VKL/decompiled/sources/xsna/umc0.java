package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostingSnippetsHelper.kt */
/* loaded from: classes4.dex */
public final class umc0 {
    public final wsi a;
    public final qdc0 b;
    public final boolean c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final ArrayMap<Attachment, String> e = new ArrayMap<>();
    public final HashSet<String> f = new HashSet<>();

    /* compiled from: PostingSnippetsHelper.kt */
    public static final class a {
        public final String a;
        public final int b;
        public final int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkWithRange(uri=");
            sb.append(this.a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public umc0(wsi wsiVar, qdc0 qdc0Var, boolean z) {
        this.a = wsiVar;
        this.b = qdc0Var;
        this.c = z;
    }

    public final void a(ArrayList arrayList, List list) {
        boolean z;
        VideoFile videoFile;
        VideoUrlStorage w9;
        String Ab;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Attachment attachment = (Attachment) obj;
            qdc0 qdc0Var = this.b;
            List<Attachment> u = qdc0Var.u();
            String str = (String) arrayList.get(i);
            boolean contains = u.contains(attachment);
            List<Attachment> list2 = u;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (Attachment attachment2 : list2) {
                    if ((attachment2 instanceof LinkAttachment) || (attachment2 instanceof SnippetAttachment)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if ((!(attachment instanceof LinkAttachment) && !(attachment instanceof SnippetAttachment)) || !z) {
                VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
                if (videoAttachment != null && (videoFile = videoAttachment.k) != null && (w9 = videoFile.w9()) != null && (Ab = w9.Ab(VideoUrl.EXTERNAL_URL)) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (obj2 instanceof VideoAttachment) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (epx.f(((VideoAttachment) it.next()).k.w9().Ab(VideoUrl.EXTERNAL_URL), Ab)) {
                                break;
                            }
                        }
                    }
                }
                if (!contains) {
                    if (!(!(attachment instanceof ArticleAttachment) ? false : qdc0Var.Bc(((ArticleAttachment) attachment).g)) && this.f.contains(str)) {
                        this.e.put(attachment, str);
                        qdc0Var.A1(attachment);
                    }
                }
            }
            i = i2;
        }
    }
}
