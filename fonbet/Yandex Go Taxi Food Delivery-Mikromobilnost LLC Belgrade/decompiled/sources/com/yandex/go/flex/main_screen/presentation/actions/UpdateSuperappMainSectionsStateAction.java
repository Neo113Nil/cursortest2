package com.yandex.go.flex.main_screen.presentation.actions;

import defpackage.gsq0;
import defpackage.kr;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/actions/UpdateSuperappMainSectionsStateAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/flex/main_screen/presentation/actions/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateSuperappMainSectionsStateAction extends kr {
    public static final e Companion = new e();
    public final boolean a;

    public /* synthetic */ UpdateSuperappMainSectionsStateAction(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            qje.Z(i, 1, UpdateSuperappMainSectionsStateAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
