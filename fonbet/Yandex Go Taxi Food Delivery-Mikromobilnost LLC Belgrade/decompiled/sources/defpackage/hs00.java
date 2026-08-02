package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.map_common.style.source.model.Theme;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhs00;", "", "Companion", "fs00", "gs00", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class hs00 {
    public static final gs00 Companion = new gs00();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(26))};
    public final kotlinx.serialization.json.a a;
    public final String b;
    public final g5l0 c;
    public final Theme d;

    public /* synthetic */ hs00(int i, kotlinx.serialization.json.a aVar, String str, g5l0 g5l0Var, Theme theme) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = aVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = g5l0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = theme;
        }
    }

    public hs00() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
