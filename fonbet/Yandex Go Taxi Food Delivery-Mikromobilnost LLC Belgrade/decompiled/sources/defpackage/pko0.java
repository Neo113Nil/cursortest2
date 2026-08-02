package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpko0;", "Lw96;", "Companion", "a", "mko0", "lko0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class pko0 extends w96 {
    public static final mko0 Companion = new mko0();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(12))};
    public static final pko0 f = new pko0(0);
    public final boolean b;
    public final long c;
    public final List d;

    public /* synthetic */ pko0(int i, long j, List list, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? 3600L : j;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpko0$a;", "", "Companion", "nko0", "oko0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class a {
        public static final oko0 Companion = new oko0();
        public final String a;
        public final long b;

        public /* synthetic */ a(long j, int i, String str) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 3600L;
            } else {
                this.b = j;
            }
        }

        public a() {
            this.a = "";
            this.b = 3600L;
        }
    }

    public pko0(int i) {
        this.b = false;
        this.c = 3600L;
        this.d = EmptyList.a;
    }

    public pko0() {
        this(0);
    }
}
