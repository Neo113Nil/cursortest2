package com.yandex.passport.sloth.command.data;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/sloth/command/data/o;", "", "Companion", "com/yandex/passport/sloth/command/data/m", "com/yandex/passport/sloth/command/data/n", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class o {
    public static final n Companion = new n();
    public static final KSerializer[] b = {new p53(auu0.a, 0)};
    public final List a;

    public /* synthetic */ o(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && jl40.l(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("GetCustomEulaStringsData(keys="), this.a, ')');
    }

    public o() {
        this.a = null;
    }
}
