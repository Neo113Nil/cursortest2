package defpackage;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljbi;", "Ln96;", "Lc6z;", "Companion", "ibi", "hbi", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class jbi extends n96 implements c6z {
    public static final ibi Companion = new ibi();
    public static final i3y[] e;
    public static final jbi f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, a.b(lazyThreadSafetyMode, new n5h(19)), a.b(lazyThreadSafetyMode, new n5h(20))};
        f = new jbi(0);
    }

    public /* synthetic */ jbi(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final ebj0 c(String str) {
        Object obj;
        List list = this.d;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (jl40.l(((ebj0) obj).a, str)) {
                break;
            }
        }
        return (ebj0) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbi)) {
            return false;
        }
        jbi jbiVar = (jbi) obj;
        return this.b == jbiVar.b && jl40.l(this.c, jbiVar.c) && jl40.l(this.d, jbiVar.d);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getD() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return ly3.s(nnm.l("DeliveryFormRequirementsDialogExperiment(enabled=", ", l10n=", ", requirements=", this.c, this.b), this.d, Extension.C_BRAKE);
    }

    public jbi() {
        this(0);
    }

    public jbi(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }
}
