package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcgj0;", "", "Companion", "agj0", "bgj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class cgj0 {
    public static final bgj0 Companion = new bgj0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(0))};
    public final String a;
    public final List b;

    public /* synthetic */ cgj0(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public cgj0() {
        this.a = "";
        this.b = EmptyList.a;
    }
}
