package com.yandex.go.flex.common.api.actions;

import defpackage.gmt;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr;
import defpackage.qje;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/GoReloadLabeledSectionsAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/p", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GoReloadLabeledSectionsAction extends kr {
    public static final p Companion = new p();
    public static final i3y[] c;
    public final List a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new gmt(8)), kotlin.a.b(lazyThreadSafetyMode, new gmt(9))};
    }

    public /* synthetic */ GoReloadLabeledSectionsAction(int i, List list, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, GoReloadLabeledSectionsAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoReloadLabeledSectionsAction)) {
            return false;
        }
        GoReloadLabeledSectionsAction goReloadLabeledSectionsAction = (GoReloadLabeledSectionsAction) obj;
        return jl40.l(this.a, goReloadLabeledSectionsAction.a) && jl40.l(this.b, goReloadLabeledSectionsAction.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "GoReloadLabeledSectionsAction(labels=" + this.a + ", body=" + this.b + Extension.C_BRAKE;
    }

    public GoReloadLabeledSectionsAction(List list, Map map) {
        this.a = list;
        this.b = map;
    }
}
