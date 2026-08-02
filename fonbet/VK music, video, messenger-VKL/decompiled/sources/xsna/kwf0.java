package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.ca60;
import xsna.qn60;

/* compiled from: RemoveAttachmentEditorAction.kt */
/* loaded from: classes4.dex */
public final class kwf0 implements qn60.b {
    public final Attachment a;
    public final pn60 b;

    /* compiled from: RemoveAttachmentEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public kwf0(Attachment attachment, pn60 pn60Var) {
        this.a = attachment;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        ArrayList<EntryAttachment> arrayList;
        List<EntryAttachment> N7;
        Attachment attachment = this.a;
        HashSet c = aVar.c(new ca60.a(attachment));
        if (c == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (NewsEntry) it.next();
            if (parcelable instanceof NewsEntryWithAttachments) {
                ((NewsEntryWithAttachments) parcelable).Kb(attachment);
            }
            if (parcelable instanceof fsx0) {
                fsx0 fsx0Var = (fsx0) parcelable;
                List<EntryAttachment> N72 = fsx0Var.N7();
                if (N72 != null) {
                    N72.remove(new EntryAttachment(this.a, null, null, null, 14, null));
                }
                if (((parcelable instanceof Photos) || (parcelable instanceof Videos)) && ((N7 = fsx0Var.N7()) == null || N7.isEmpty())) {
                    arrayList2.add(parcelable);
                }
            }
            if (parcelable instanceof Post) {
                Post post = (Post) parcelable;
                Post post2 = post.D;
                if (post2 != null) {
                    post2.Kb(attachment);
                }
                Post post3 = post.D;
                if (post3 != null && (arrayList = post3.z) != null) {
                    arrayList.remove(new EntryAttachment(this.a, null, null, null, 14, null));
                }
            }
            if (parcelable instanceof PromoPost) {
                ((PromoPost) parcelable).n.Kb(attachment);
            }
        }
        aVar.f(c, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        aVar.i(arrayList2);
    }
}
