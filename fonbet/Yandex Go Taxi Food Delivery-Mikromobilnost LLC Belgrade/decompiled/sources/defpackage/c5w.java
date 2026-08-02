package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lc5w;", "Lvqo;", "Companion", "a5w", "b5w", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c5w implements vqo {
    public static final b5w Companion = new b5w();
    public final Boolean a;
    public final String b;
    public final String c;
    public final boolean d;

    public /* synthetic */ c5w(int i, Boolean bool, String str, String str2, boolean z) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
    }

    @Override // defpackage.vqo
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    public c5w() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = true;
    }
}
