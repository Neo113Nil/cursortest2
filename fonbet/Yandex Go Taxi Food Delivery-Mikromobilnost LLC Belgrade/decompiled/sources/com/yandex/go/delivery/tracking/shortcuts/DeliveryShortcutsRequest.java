package com.yandex.go.delivery.tracking.shortcuts;

import defpackage.dii;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.uc4;
import defpackage.zzs;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/delivery/tracking/shortcuts/DeliveryShortcutsRequest;", "", "Companion", "UserContext", "com/yandex/go/delivery/tracking/shortcuts/b", "$serializer", "tracking"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryShortcutsRequest {
    public static final b Companion = new b();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dii(10)), null, null};
    public final List a;
    public final String b;
    public final UserContext c;

    public DeliveryShortcutsRequest(int i, List list, String str, UserContext userContext) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, DeliveryShortcutsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = Collections.singletonList("objects_over_map");
        } else {
            this.a = list;
        }
        this.b = str;
        this.c = userContext;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/delivery/tracking/shortcuts/DeliveryShortcutsRequest$UserContext;", "", "Companion", "$serializer", "com/yandex/go/delivery/tracking/shortcuts/c", "tracking"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class UserContext {
        public static final c Companion = new c();
        public final zzs a;
        public final String b;
        public final uc4 c;

        public /* synthetic */ UserContext(int i, zzs zzsVar, String str, uc4 uc4Var) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, DeliveryShortcutsRequest$UserContext$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = zzsVar;
            this.b = str;
            this.c = uc4Var;
        }

        public UserContext(zzs zzsVar, String str, uc4 uc4Var) {
            this.a = zzsVar;
            this.b = str;
            this.c = uc4Var;
        }
    }

    public DeliveryShortcutsRequest(String str, UserContext userContext) {
        this.a = Collections.singletonList("objects_over_map");
        this.b = str;
        this.c = userContext;
    }
}
