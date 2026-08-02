package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/DiscoveryAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/m", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DiscoveryAction extends n {
    public static final m Companion = new m();
    public final String b;
    public final kotlinx.serialization.json.b c;

    public /* synthetic */ DiscoveryAction(int i, String str, kotlinx.serialization.json.b bVar) {
        this.b = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryAction)) {
            return false;
        }
        DiscoveryAction discoveryAction = (DiscoveryAction) obj;
        return jl40.l(this.b, discoveryAction.b) && jl40.l(this.c, discoveryAction.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        kotlinx.serialization.json.b bVar = this.c;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "DiscoveryAction(mode=" + this.b + ", layersContext=" + this.c + Extension.C_BRAKE;
    }

    public DiscoveryAction() {
        this.b = "";
        this.c = null;
    }
}
