package com.yandex.go.suggest.impl.data.flex.actions;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.x4e;
import defpackage.yew0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/data/flex/actions/SubstituteAction;", "Lyew0;", "Companion", "$serializer", "com/yandex/go/suggest/impl/data/flex/actions/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SubstituteAction extends yew0 {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final boolean c;

    public SubstituteAction(String str, int i, String str2, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubstituteAction)) {
            return false;
        }
        SubstituteAction substituteAction = (SubstituteAction) obj;
        return jl40.l(this.a, substituteAction.a) && jl40.l(this.b, substituteAction.b) && this.c == substituteAction.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("SubstituteAction(text=", this.a, ", prefixText=", this.b, ", shouldPreserveOnRestore="), this.c, Extension.C_BRAKE);
    }

    public SubstituteAction() {
        this.a = "";
        this.b = null;
        this.c = false;
    }
}
