package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class tkc0 extends FunctionReferenceImpl implements izs<PostingState.Editing, Boolean> {
    @Override // xsna.izs
    public final Boolean invoke(PostingState.Editing editing) {
        PostingState.Editing editing2 = editing;
        ((vpc0) this.receiver).getClass();
        return Boolean.valueOf(editing2.h.Ja() && fkq0.b(editing2.c.b.b) && !editing2.d.d());
    }
}
