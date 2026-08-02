package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfnj0;", "", "Companion", "enj0", "dnj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class fnj0 {
    public static final enj0 Companion = new enj0();
    public static final fnj0 c = new fnj0(0);
    public final emj0 a;
    public final w56 b;

    public fnj0(int i, emj0 emj0Var, w56 w56Var) {
        if ((i & 1) == 0) {
            emj0.Companion.getClass();
            emj0Var = emj0.b;
        }
        this.a = emj0Var;
        if ((i & 2) != 0) {
            this.b = w56Var;
        } else {
            w56.Companion.getClass();
            this.b = w56.d;
        }
    }

    public fnj0() {
        this(0);
    }

    public fnj0(int i) {
        emj0.Companion.getClass();
        w56.Companion.getClass();
        this.a = emj0.b;
        this.b = w56.d;
    }
}
