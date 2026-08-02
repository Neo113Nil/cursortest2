package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class exc implements gzs {
    public final /* synthetic */ ClipFeedListFragment b;
    public final /* synthetic */ q8e c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ exc(ClipFeedListFragment clipFeedListFragment, q8e q8eVar, boolean z) {
        this.b = clipFeedListFragment;
        this.c = q8eVar;
        this.d = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerView recyclerView;
        int i = ClipFeedListFragment.a2;
        ClipFeedListFragment clipFeedListFragment = this.b;
        iwc vo = clipFeedListFragment.vo();
        if (vo == null) {
            return s3q0.a;
        }
        if (vo.d(clipFeedListFragment)) {
            clipFeedListFragment.Co().b();
            m0f<FeedItem> xo = clipFeedListFragment.xo();
            if (!xo.f && (recyclerView = (RecyclerView) xo.b.invoke()) != null) {
                xo.l(recyclerView);
            }
            ((ocd) clipFeedListFragment.k1.getValue()).g();
        }
        l0f l0fVar = (l0f) clipFeedListFragment.f1.getValue();
        q8e q8eVar = this.c;
        l0fVar.l(q8eVar);
        ((xe90) clipFeedListFragment.U0.getValue()).l(q8eVar);
        if (this.d) {
            ((rie) clipFeedListFragment.a0.getValue()).l(q8eVar);
        }
        return s3q0.a;
    }
}
