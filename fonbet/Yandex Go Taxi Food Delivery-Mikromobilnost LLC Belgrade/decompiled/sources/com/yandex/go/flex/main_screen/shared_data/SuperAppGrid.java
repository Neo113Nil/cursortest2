package com.yandex.go.flex.main_screen.shared_data;

import defpackage.bnr0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.tsv0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/shared_data/SuperAppGrid;", "Lbnr0;", "Companion", "com/yandex/go/flex/main_screen/shared_data/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppGrid implements bnr0 {
    public static final d Companion = new d();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(24))};
    public final String a;
    public final Map b;

    public /* synthetic */ SuperAppGrid(int i, String str, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, SuperAppGrid$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        SuperAppGrid superAppGrid = bnr0Var instanceof SuperAppGrid ? (SuperAppGrid) bnr0Var : null;
        return superAppGrid != null ? superAppGrid : this;
    }
}
