package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.AttachmentsMeta;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: DonutHorizontalGalleryTeaserTransformer.kt */
/* loaded from: classes4.dex */
public final class yzn implements gn60<Pair<? extends Post, ? extends r1o>, wm60> {
    public final a2o b;
    public final bpn0 c = new bpn0(new pr0(11));

    public yzn(a2o a2oVar) {
        this.b = a2oVar;
    }

    public final List<ol60> a(int i, Pair<Post, r1o> pair, wm60 wm60Var) {
        PostDonut.Paywall paywall;
        PostDonut.Snippet snippet;
        Post d = pair.d();
        r1o g = pair.g();
        PostDonut postDonut = d.R;
        if (postDonut == null || (paywall = postDonut.g) == null || (snippet = paywall.d) == null) {
            return EmptyList.b;
        }
        ArrayList<EntryAttachment> arrayList = d.z;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Attachment attachment = ((EntryAttachment) it.next()).b;
            PhotoAttachment photoAttachment = attachment instanceof PhotoAttachment ? (PhotoAttachment) attachment : null;
            Image image = photoAttachment != null ? photoAttachment.l.y : null;
            if (image != null) {
                arrayList2.add(image);
            }
        }
        LinkButton linkButton = snippet.e;
        String str = linkButton != null ? linkButton.b : null;
        String str2 = snippet.c;
        DonutPriceTemplate parse = (!((Boolean) this.c.getValue()).booleanValue() || str == null) ? null : this.b.parse(str);
        AttachmentsMeta attachmentsMeta = d.A;
        return Collections.singletonList(new zzn(arrayList2, str2, str, parse, g, attachmentsMeta != null ? attachmentsMeta.e : null));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}
