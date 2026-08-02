package xsna;

import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;

/* compiled from: CommunityProfileContentUiViewTracker.kt */
/* loaded from: classes5.dex */
public final class klh extends c2q0<b> {
    public static final b v = new b(0, null, 0, null);
    public final izs<RecyclerView.e0, b> u;

    /* compiled from: CommunityProfileContentUiViewTracker.kt */
    public static final class a {
    }

    /* compiled from: CommunityProfileContentUiViewTracker.kt */
    public static final class b {
        public final long a;
        public final CommonCommunitiesStat$TypeTabContentType b;
        public final int c;
        public final String d;

        public b(long j, CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType, int i, String str) {
            this.a = j;
            this.b = commonCommunitiesStat$TypeTabContentType;
            this.c = i;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType = this.b;
            int a = shy.a(this.c, (hashCode + (commonCommunitiesStat$TypeTabContentType == null ? 0 : commonCommunitiesStat$TypeTabContentType.hashCode())) * 31, 31);
            String str = this.d;
            return a + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Record(contentId=");
            sb.append(this.a);
            sb.append(", contentType=");
            sb.append(this.b);
            sb.append(", position=");
            sb.append(this.c);
            sb.append(", trackCode=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public klh(RecyclerView recyclerView, izs izsVar, f5z f5zVar, jlh jlhVar) {
        super(recyclerView, jlhVar, (wzs) null, new ilh(com.vk.metrics.eventtracking.b.a), (pvx) null, 44);
        Lifecycle lifecycle;
        this.u = izsVar;
        bpn0 bpn0Var = new bpn0(new z4f(this, 8));
        if (f5zVar == null || (lifecycle = f5zVar.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver((llh) bpn0Var.getValue());
    }

    @Override // xsna.c2q0, xsna.jm6
    public final Object c(RecyclerView.e0 e0Var) {
        b invoke = this.u.invoke(e0Var);
        return invoke == null ? v : invoke;
    }
}
