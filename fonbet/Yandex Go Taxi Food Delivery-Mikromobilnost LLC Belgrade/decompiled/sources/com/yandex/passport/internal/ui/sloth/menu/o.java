package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.common.web.BridgeMethod;

/* loaded from: classes2.dex */
public final class o implements com.yandex.passport.sloth.dependencies.e {
    public final com.yandex.passport.internal.sloth.performers.usermenu.a a;
    public final com.yandex.passport.internal.sloth.performers.usermenu.d b;

    public o(com.yandex.passport.internal.sloth.performers.usermenu.a aVar, com.yandex.passport.internal.sloth.performers.usermenu.d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    @Override // com.yandex.passport.sloth.dependencies.e
    public final com.yandex.passport.sloth.command.s a(BridgeMethod bridgeMethod) {
        int i = n.a[bridgeMethod.ordinal()];
        com.yandex.passport.sloth.command.s sVar = i != 1 ? i != 2 ? null : this.b : this.a;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }
}
