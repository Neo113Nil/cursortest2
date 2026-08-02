package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.domain.rules.api.RestrictMediaSizeRule;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: GifStatePostProcessor.kt */
/* loaded from: classes4.dex */
public final class dzt implements ouk0 {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0165, code lost:
    
        if (r1.contains(r0) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0167, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0189, code lost:
    
        if (((com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment) r4) != null) goto L43;
     */
    @Override // xsna.ouk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PostingState a(PostingState postingState) {
        PostingArticleDto postingArticleDto;
        PostingLinkDto postingLinkDto;
        List<PostingAttachment> list;
        FileDto fileDto;
        PostEditableData postEditableData;
        boolean z;
        Object obj;
        boolean z2;
        if (postingState instanceof PostingState.Editing) {
            PostingState.Editing editing = (PostingState.Editing) postingState;
            PostEditableData postEditableData2 = editing.i;
            FileDto fileDto2 = postEditableData2.m;
            PostingArticleDto postingArticleDto2 = postEditableData2.g;
            PostingLinkDto postingLinkDto2 = postEditableData2.h;
            FileDto fileDto3 = postEditableData2.m;
            List<PostingAttachment> list2 = postEditableData2.p;
            if (fileDto2 instanceof FileDto.Gif) {
                boolean isEmpty = list2.isEmpty();
                boolean z3 = postingLinkDto2 == null;
                boolean z4 = postingArticleDto2 == null;
                List<PostingRule> list3 = editing.d.d.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    PostingRule postingRule = (PostingRule) obj2;
                    if ((postingRule instanceof RestrictMediaSizeRule) && ((RestrictMediaSizeRule) postingRule).b == RuleAttachment.Gif) {
                        arrayList.add(obj2);
                    }
                }
                postingArticleDto = postingArticleDto2;
                postingLinkDto = postingLinkDto2;
                list = list2;
                fileDto = fileDto3;
                xmc0 xmc0Var = new xmc0(PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, j5g.v0(fileDto2, list2), null, null, null, null, null, null, null, false, null, 268419071), null, null, null, null, false, null, false, null, null, null, null, null, 1048447));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List<nrg0> c6 = ((PostingRule) it.next()).c6(xmc0Var);
                    if (c6 != null) {
                        linkedHashSet.addAll(c6);
                    }
                }
                if (isEmpty && z3 && z4 && linkedHashSet.isEmpty()) {
                    return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData2, null, null, null, null, null, null, null, null, null, null, null, null, null, j5g.v0((FileDto.Gif) fileDto, list), null, null, null, null, null, null, null, false, null, 268419071), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
                postEditableData = postEditableData2;
            } else {
                postEditableData = postEditableData2;
                postingArticleDto = postingArticleDto2;
                postingLinkDto = postingLinkDto2;
                fileDto = fileDto3;
                list = list2;
            }
            if (!(fileDto instanceof FileDto.Gif)) {
                z = true;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((PostingAttachment) obj) instanceof FileDto.Gif) {
                        break;
                    }
                }
            } else {
                z = true;
                if (list.size() > 1) {
                }
                z2 = false;
            }
            boolean z5 = postingLinkDto != null ? z : false;
            boolean z6 = postingArticleDto != null ? z : false;
            if (z2 || z5 || z6) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (!(((PostingAttachment) obj3) instanceof FileDto.Gif)) {
                        arrayList2.add(obj3);
                    }
                }
                return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList2, null, null, null, null, null, null, null, false, null, 268419071), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        }
        return postingState;
    }
}
