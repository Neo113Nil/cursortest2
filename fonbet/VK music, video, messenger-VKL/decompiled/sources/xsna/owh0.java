package xsna;

import android.content.Context;
import android.view.View;
import com.vk.feed.core.models.news.NewsEntry;
import kotlin.LazyThreadSafetyMode;
import xsna.qi6;

/* compiled from: SearchNewsMenuClickListener.kt */
/* loaded from: classes4.dex */
public final class owh0 implements qi6.b {
    public final Context b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new cy20(11));
    public final xzb0 d;

    /* compiled from: SearchNewsMenuClickListener.kt */
    public static final class a implements bin0, g0t {
        public final /* synthetic */ c5f b;

        public a(c5f c5fVar) {
            this.b = c5fVar;
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

    public owh0(Context context, c5f c5fVar) {
        this.b = context;
        this.d = new xzb0(new lwh0(), new a(c5fVar), new k15(), new ulz(24), new yiz());
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6.b
    public final void a(View view, NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        la60.e((la60) this.c.getValue(), view, new xm60(newsEntry, newsEntry2, null, false, false, false, false, null, false, false, false, false, false, false, false, 130804), new c8(new nwh0(newsEntry, newsEntry2, i, this), 29), new rka0(new mqe0(this, 3), 13), 16);
    }
}
