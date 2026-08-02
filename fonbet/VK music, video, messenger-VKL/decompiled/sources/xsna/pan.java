package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;

/* compiled from: DiscoveryUiViewTracker.kt */
/* loaded from: classes3.dex */
public final class pan extends c2q0<b> {

    /* compiled from: DiscoveryUiViewTracker.kt */
    public static final class a {
        public final pan a(RecyclerView recyclerView, CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode, float f, hd4 hd4Var) {
            q5u0 q5u0Var = new q5u0(f, 1);
            oan oanVar = new oan(this, commonVideoStat$TypeScreenMode);
            ttp0.d(2, hd4Var);
            return new pan(recyclerView, oanVar, hd4Var, new nan(com.vk.metrics.eventtracking.b.a), q5u0Var, 8);
        }
    }

    /* compiled from: DiscoveryUiViewTracker.kt */
    public static final class b {
        public final int a;
        public final VideoFile b;

        public b(int i, VideoFile videoFile) {
            this.a = i;
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            VideoFile videoFile = this.b;
            return hashCode + (videoFile == null ? 0 : videoFile.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Record(position=");
            sb.append(this.a);
            sb.append(", videoFile=");
            return lq.a(sb, this.b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.c2q0, xsna.jm6
    public final Object c(RecyclerView.e0 e0Var) {
        qan qanVar = e0Var instanceof qan ? (qan) e0Var : null;
        if (qanVar == null) {
            return null;
        }
        return new b(e0Var.getLayoutPosition(), qanVar.f5());
    }
}
