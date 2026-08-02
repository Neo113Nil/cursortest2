package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lg280;", "Ln96;", "Companion", "a", "d280", "c280", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g280 extends n96 {
    public static final d280 Companion = new d280();
    public static final g280 f = new g280(0);
    public final boolean b;
    public final a c;
    public final a d;
    public final a e;

    public /* synthetic */ g280(int i, boolean z, a aVar, a aVar2, a aVar3) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = new a(0);
        } else {
            this.c = aVar;
        }
        if ((i & 4) == 0) {
            this.d = new a(0);
        } else {
            this.d = aVar2;
        }
        if ((i & 8) == 0) {
            this.e = new a(0);
        } else {
            this.e = aVar3;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lg280$a;", "", "Companion", "e280", "f280", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static final f280 Companion = new f280();
        public final boolean a;

        public /* synthetic */ a(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        /* renamed from: a, reason: from getter */
        public final boolean getA() {
            return this.a;
        }

        public a(int i) {
            this.a = false;
        }

        public a() {
            this(0);
        }
    }

    public g280() {
        this(0);
    }

    public g280(int i) {
        a aVar = new a(0);
        a aVar2 = new a(0);
        a aVar3 = new a(0);
        this.b = false;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }
}
