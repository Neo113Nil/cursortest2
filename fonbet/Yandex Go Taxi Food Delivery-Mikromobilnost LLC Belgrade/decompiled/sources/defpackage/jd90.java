package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Ljd90;", "", "Companion", "hd90", "fd90", "ed90", "cd90", "go-client-android.features.configs:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class jd90 {
    public static final ed90 Companion = new ed90();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(27))};
    public static final jd90 c = new jd90(0);
    public final List a;

    public /* synthetic */ jd90(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final hd90 a(Class cls) {
        return (hd90) b.j(b.g(new yw01(new h73(1, this.a), new bd90(0)), new uyo0(28, cls)));
    }

    public jd90(int i) {
        this.a = EmptyList.a;
    }

    public jd90() {
        this(0);
    }
}
