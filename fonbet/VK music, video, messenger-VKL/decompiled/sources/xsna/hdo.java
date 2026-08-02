package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import xsna.efc0;

/* compiled from: DraftFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class hdo {
    public final efc0.a a;
    public final tkx b;
    public final xe8 c;
    public final w9c0 d;
    public final AtomicBoolean e;

    public hdo(efc0.a aVar, tkx tkxVar, w9c0 w9c0Var) {
        xe8 xe8Var = new xe8(0);
        this.a = aVar;
        this.b = tkxVar;
        this.c = xe8Var;
        this.d = w9c0Var;
        this.e = new AtomicBoolean();
    }

    public final void a(PostingState postingState, PostingAction.LocalDraft localDraft) {
        if (!(localDraft instanceof PostingAction.LocalDraft.SaveDraft)) {
            if (!(localDraft instanceof PostingAction.LocalDraft.RemoveDraft)) {
                throw new NoWhenBranchMatchedException();
            }
            if (postingState instanceof PostingState.Editing) {
                c(((PostingState.Editing) postingState).c.b.b);
                return;
            }
            return;
        }
        if (postingState instanceof PostingState.Editing) {
            PostingState.Editing editing = (PostingState.Editing) postingState;
            PostingContext postingContext = editing.c;
            PostEditingReason postEditingReason = editing.h;
            PostEditableData postEditableData = editing.i;
            if ((postEditingReason instanceof PostEditingReason.EditExistingPost) || this.e.get() || n2c0.b(postEditableData, this.d) || (postEditingReason instanceof PostEditingReason.EditRemoteDraft)) {
                return;
            }
            boolean z = (postEditableData.equals(editing.j) || (postEditableData.c.length() <= 0 && postEditableData.p.isEmpty() && postEditableData.e == null && postEditableData.f == null && postEditableData.g == null && postEditableData.h == null && postEditableData.l == null && postEditableData.m == null && postEditableData.o == null)) ? false : true;
            UserId userId = postingContext.b.b;
            tkx tkxVar = this.b;
            long a = tkxVar.a(userId);
            if (z) {
                UserId userId2 = postingContext.b.b;
                (a > 0 ? tkxVar.f(a, userId2, postEditableData) : tkxVar.c(userId2, postEditableData)).q(asu0.a.c()).subscribe(new jv(new dwg(this, 11), 19), new v8(new com.vk.movika.sdk.base.observable.s(24), 21));
            } else if (a > 0) {
                b(a, userId);
            }
        }
    }

    public final void b(long j, UserId userId) {
        this.a.a.e.b(this.b.g(j, userId).o(asu0.a.c()).subscribe(new jg4(this, 1), new hv(new mo1(28), 19)));
    }

    public final void c(UserId userId) {
        this.e.set(true);
        long a = this.b.a(userId);
        if (a > 0) {
            b(a, userId);
        }
    }
}
