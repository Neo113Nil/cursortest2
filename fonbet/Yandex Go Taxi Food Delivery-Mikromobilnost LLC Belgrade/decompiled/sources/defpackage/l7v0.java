package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ll7v0;", "", "Companion", "j7v0", "k7v0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class l7v0 {
    public static final k7v0 Companion = new k7v0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(14))};
    public final Long a;
    public final List b;

    public /* synthetic */ l7v0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public l7v0(Long l, List list) {
        this.a = l;
        this.b = list;
    }

    public l7v0() {
        this(null, null);
    }
}
