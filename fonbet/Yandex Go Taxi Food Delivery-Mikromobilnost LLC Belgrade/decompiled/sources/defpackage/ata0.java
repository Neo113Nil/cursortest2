package defpackage;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lata0;", "", "Companion", "ysa0", "zsa0", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ata0 {
    public static final zsa0 Companion = new zsa0();
    public static final i3y[] e;
    public final CanMakeMoreOrders a;
    public final List b;
    public final List c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new f9a0(25)), a.b(lazyThreadSafetyMode, new f9a0(26)), a.b(lazyThreadSafetyMode, new f9a0(27)), a.b(lazyThreadSafetyMode, new f9a0(28))};
    }

    public /* synthetic */ ata0(int i, CanMakeMoreOrders canMakeMoreOrders, List list, List list2, List list3) {
        this.a = (i & 1) == 0 ? CanMakeMoreOrders.UNMODIFIED : canMakeMoreOrders;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list3;
        }
    }

    public ata0() {
        this.a = CanMakeMoreOrders.UNMODIFIED;
        this.b = null;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
    }
}
