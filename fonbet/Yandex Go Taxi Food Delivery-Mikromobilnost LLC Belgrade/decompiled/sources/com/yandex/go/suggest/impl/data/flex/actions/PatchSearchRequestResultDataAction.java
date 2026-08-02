package com.yandex.go.suggest.impl.data.flex.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kz60;
import defpackage.nnm;
import defpackage.yew0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/data/flex/actions/PatchSearchRequestResultDataAction;", "Lyew0;", "Companion", "$serializer", "com/yandex/go/suggest/impl/data/flex/actions/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PatchSearchRequestResultDataAction extends yew0 {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(29))};
    public final Map a;

    public PatchSearchRequestResultDataAction(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PatchSearchRequestResultDataAction) && jl40.l(this.a, ((PatchSearchRequestResultDataAction) obj).a);
    }

    public final int hashCode() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return nnm.j("PatchSearchRequestResultDataAction(traceIds=", Extension.C_BRAKE, this.a);
    }

    public PatchSearchRequestResultDataAction() {
        this.a = null;
    }
}
