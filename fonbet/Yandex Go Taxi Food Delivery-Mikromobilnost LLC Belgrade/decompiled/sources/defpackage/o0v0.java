package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionStatusDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lo0v0;", "", "Companion", "m0v0", "n0v0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class o0v0 {
    public static final n0v0 Companion = new n0v0();
    public static final i3y[] f = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(21)), null, null, null};
    public final String a;
    public final SubscriptionStatusDto b;
    public final boolean c;
    public final String d;
    public final vr41 e;

    public /* synthetic */ o0v0(int i, String str, SubscriptionStatusDto subscriptionStatusDto, boolean z, String str2, vr41 vr41Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = SubscriptionStatusDto.UNRECOGNIZED;
        } else {
            this.b = subscriptionStatusDto;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = vr41Var;
        }
    }

    public o0v0() {
        SubscriptionStatusDto subscriptionStatusDto = SubscriptionStatusDto.UNRECOGNIZED;
        this.a = null;
        this.b = subscriptionStatusDto;
        this.c = false;
        this.d = null;
        this.e = null;
    }
}
