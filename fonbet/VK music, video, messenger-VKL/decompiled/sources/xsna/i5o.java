package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: DonutVideoTeaserTransformer.kt */
/* loaded from: classes4.dex */
public final class i5o implements gn60<Pair<? extends Post, ? extends r1o>, wm60> {
    public final a2o b;
    public final bpn0 c = new bpn0(new z34(9));

    public i5o(a2o a2oVar) {
        this.b = a2oVar;
    }

    public final List<ol60> a(int i, Pair<Post, r1o> pair, wm60 wm60Var) {
        DonutPriceTemplate donutPriceTemplate;
        VideoAttachment videoAttachment;
        PostDonut.Paywall paywall;
        PostDonut.Snippet snippet;
        LinkButton linkButton;
        Post d = pair.d();
        r1o g = pair.g();
        Iterator<T> it = d.z.iterator();
        while (true) {
            donutPriceTemplate = null;
            if (!it.hasNext()) {
                videoAttachment = null;
                break;
            }
            Attachment attachment = ((EntryAttachment) it.next()).b;
            videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
            if (videoAttachment != null) {
                break;
            }
        }
        if (videoAttachment == null) {
            return EmptyList.b;
        }
        PostDonut postDonut = d.R;
        String str = (postDonut == null || (paywall = postDonut.g) == null || (snippet = paywall.d) == null || (linkButton = snippet.e) == null) ? null : linkButton.b;
        VideoFile videoFile = videoAttachment.k;
        if (((Boolean) this.c.getValue()).booleanValue() && str != null) {
            donutPriceTemplate = this.b.parse(str);
        }
        return Collections.singletonList(new j5o(videoFile, donutPriceTemplate, str, g));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}
