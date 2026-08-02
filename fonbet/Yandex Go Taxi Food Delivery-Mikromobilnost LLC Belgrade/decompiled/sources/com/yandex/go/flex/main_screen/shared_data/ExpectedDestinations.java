package com.yandex.go.flex.main_screen.shared_data;

import defpackage.bnr0;
import defpackage.fsn;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/shared_data/ExpectedDestinations;", "Lbnr0;", "Companion", "com/yandex/go/flex/main_screen/shared_data/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExpectedDestinations implements bnr0 {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(8))};
    public final List a;

    public /* synthetic */ ExpectedDestinations(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof ExpectedDestinations)) {
            return this;
        }
        return new ExpectedDestinations(kotlin.collections.a.m0(((ExpectedDestinations) bnr0Var).a, this.a));
    }

    public ExpectedDestinations(List list) {
        this.a = list;
    }

    public ExpectedDestinations() {
        this(EmptyList.a);
    }
}
