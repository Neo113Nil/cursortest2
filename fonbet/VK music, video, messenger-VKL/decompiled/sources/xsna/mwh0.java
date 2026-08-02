package xsna;

import android.content.Context;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SearchNewsEntryClickController.kt */
/* loaded from: classes4.dex */
public final class mwh0 extends fa60 {
    public final Context n;
    public final k5h o;
    public final Object p = msy.a(LazyThreadSafetyMode.NONE, new gd40(this, 23));
    public final xzb0 q;

    /* compiled from: SearchNewsEntryClickController.kt */
    public static final class a implements bin0, g0t {
        public final /* synthetic */ k5h b;

        public a(k5h k5hVar) {
            this.b = k5hVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof bin0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.bin0
        public final /* synthetic */ Object get() {
            return this.b.invoke();
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public mwh0(Context context, k5h k5hVar) {
        this.n = context;
        this.o = k5hVar;
        this.q = new xzb0(new lwh0(), new a(k5hVar), new d02(), new j5n(24), new k9q0());
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fa60, xsna.s980
    public final void U5(NewsEntry newsEntry, boolean z, int i) {
        ((mrp) this.p.getValue()).b(this.n, newsEntry, "", (String) this.o.invoke(), i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fa60, xsna.s980
    public final void r8(NewsEntry newsEntry) {
        if (newsEntry != null) {
            ((mrp) this.p.getValue()).c(this.n, newsEntry, "");
        }
    }

    @Override // xsna.fa60, xsna.hi60
    public final void sa(NewsfeedExternalAction newsfeedExternalAction) {
        this.q.e(this.n, newsfeedExternalAction);
    }

    @Override // xsna.fa60, xsna.s980
    public final void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
    }
}
