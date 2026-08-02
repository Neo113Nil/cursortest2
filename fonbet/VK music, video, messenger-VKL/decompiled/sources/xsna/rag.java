package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommentsUiData.kt */
/* loaded from: classes17.dex */
public final class rag {
    public final n4g0 a;
    public final UserId b;
    public final iag c;

    public rag() {
        this(0);
    }

    public static rag a(rag ragVar, UserId userId, iag iagVar, int i) {
        n4g0 n4g0Var = ragVar.a;
        if ((i & 2) != 0) {
            userId = ragVar.b;
        }
        if ((i & 4) != 0) {
            iagVar = ragVar.c;
        }
        ragVar.getClass();
        return new rag(n4g0Var, userId, iagVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rag)) {
            return false;
        }
        rag ragVar = (rag) obj;
        return epx.f(this.a, ragVar.a) && epx.f(this.b, ragVar.b) && epx.f(this.c, ragVar.c);
    }

    public final int hashCode() {
        n4g0 n4g0Var = this.a;
        int a = bh10.a((n4g0Var == null ? 0 : n4g0Var.hashCode()) * 31, 31, this.b.b);
        iag iagVar = this.c;
        return a + (iagVar != null ? iagVar.hashCode() : 0);
    }

    public final String toString() {
        return "CommentBarUiData(replayTo=" + this.a + ", replyFromGroupId=" + this.b + ", editingComment=" + this.c + ')';
    }

    public rag(n4g0 n4g0Var, UserId userId, iag iagVar) {
        this.a = n4g0Var;
        this.b = userId;
        this.c = iagVar;
    }

    public /* synthetic */ rag(int i) {
        this(null, UserId.d, null);
    }
}
