package com.yandex.go.flex.main_screen.presentation.actions;

import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/actions/UpdateMainSidePagerStateAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/flex/main_screen/presentation/actions/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateMainSidePagerStateAction extends kr {
    public static final d Companion = new d();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gn11(16))};
    public final MainSidePagerSidePage a;

    public /* synthetic */ UpdateMainSidePagerStateAction(int i, MainSidePagerSidePage mainSidePagerSidePage) {
        if (1 == (i & 1)) {
            this.a = mainSidePagerSidePage;
        } else {
            qje.Z(i, 1, UpdateMainSidePagerStateAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
