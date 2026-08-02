package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Direction;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;

/* compiled from: HistoryUpdate.kt */
/* loaded from: classes13.dex */
public abstract class w8v {
    public final gj30 a;
    public final gj30 b;

    /* compiled from: HistoryUpdate.kt */
    public static final class a extends w8v {
        public final gj30 c;
        public final Direction d;

        public a(gj30 gj30Var, gj30 gj30Var2, gj30 gj30Var3, Direction direction) {
            super(gj30Var, gj30Var2);
            this.c = gj30Var3;
            this.d = direction;
        }
    }

    /* compiled from: HistoryUpdate.kt */
    public static final class b extends w8v {
        public final de c;

        public b(gj30 gj30Var, gj30 gj30Var2, de deVar) {
            super(gj30Var, gj30Var2);
            this.c = deVar;
        }
    }

    /* compiled from: HistoryUpdate.kt */
    public static final class c extends w8v {
        public static final c c = new c(new gj30(0), new gj30(0));
    }

    /* compiled from: HistoryUpdate.kt */
    public static final class d extends w8v {
        public static final d c = new d(new gj30(0), new gj30(0));
    }

    /* compiled from: HistoryUpdate.kt */
    public static final class e extends w8v {
        public final boolean c;
        public final List<Msg> d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(gj30 gj30Var, gj30 gj30Var2, boolean z, List<? extends Msg> list) {
            super(gj30Var, gj30Var2);
            this.c = z;
            this.d = list;
        }
    }

    /* compiled from: HistoryUpdate.kt */
    public static final class f extends w8v {
        public final Attach c;

        public f(gj30 gj30Var, gj30 gj30Var2, Attach attach) {
            super(gj30Var, gj30Var2);
            this.c = attach;
        }
    }

    /* compiled from: HistoryUpdate.kt */
    public static final class g extends w8v {
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public g(gj30 gj30Var, gj30 gj30Var2, boolean z, boolean z2, boolean z3) {
            super(gj30Var, gj30Var2);
            this.c = z;
            this.d = z2;
            this.e = z3;
        }
    }

    /* compiled from: HistoryUpdate.kt */
    public static final class h extends w8v {
    }

    public w8v(gj30 gj30Var, gj30 gj30Var2) {
        this.a = gj30Var;
        this.b = gj30Var2;
    }
}
