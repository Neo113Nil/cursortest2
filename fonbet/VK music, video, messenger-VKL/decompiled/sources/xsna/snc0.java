package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class snc0 extends FunctionReferenceImpl implements izs<PostingArticleDto, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(PostingArticleDto postingArticleDto) {
        List list;
        PostingArticleDto postingArticleDto2 = postingArticleDto;
        pcc0 pcc0Var = ((enc0) this.receiver).p.g;
        if (pcc0Var == null || (list = pcc0Var.n.f) == null) {
            list = EmptyList.b;
        }
        boolean contains = postingArticleDto2 != null ? list.contains(postingArticleDto2.b) : false;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Attachment attachment = (Attachment) obj;
            if (attachment instanceof ArticleAttachment) {
                if (!epx.f(attachment, postingArticleDto2 != null ? postingArticleDto2.b : null)) {
                    arrayList.add(obj);
                }
            }
        }
        if (!contains && postingArticleDto2 != null && pcc0Var != null) {
            pcc0Var.K0(Collections.singletonList(postingArticleDto2.b));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Attachment attachment2 = (Attachment) it.next();
            if (pcc0Var != null) {
                pcc0Var.N0(attachment2);
            }
        }
        return s3q0.a;
    }
}
