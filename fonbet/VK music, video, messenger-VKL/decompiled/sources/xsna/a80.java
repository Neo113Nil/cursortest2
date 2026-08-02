package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.api.ActionButtonAttachmentRule;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: ActionsStatePostProcessor.kt */
/* loaded from: classes4.dex */
public final class a80 implements ouk0 {
    @Override // xsna.ouk0
    public final PostingState a(PostingState postingState) {
        ActionButton actionButton;
        Object obj;
        if (postingState instanceof PostingState.Editing) {
            PostingState.Editing editing = (PostingState.Editing) postingState;
            xmc0 xmc0Var = new xmc0(editing);
            Iterator<T> it = editing.d.d.b.iterator();
            while (true) {
                actionButton = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PostingRule) obj) instanceof ActionButtonAttachmentRule) {
                    break;
                }
            }
            ActionButtonAttachmentRule actionButtonAttachmentRule = obj instanceof ActionButtonAttachmentRule ? (ActionButtonAttachmentRule) obj : null;
            if (actionButtonAttachmentRule != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (!epx.f(actionButtonAttachmentRule.F2(xmc0Var), PostingRule.a.C1431a.b)) {
                    linkedHashSet.addAll(actionButtonAttachmentRule.c6(xmc0Var));
                }
                PostEditableData postEditableData = editing.i;
                if (!linkedHashSet.isEmpty()) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        if (((nrg0) it2.next()).a == actionButtonAttachmentRule.e) {
                            break;
                        }
                    }
                }
                actionButton = editing.i.t;
                return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, actionButton, null, null, null, null, false, null, 268173311), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        }
        return postingState;
    }
}
