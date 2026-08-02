package com.yandex.go.superapp.impl.signals;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ktm;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/superapp/impl/signals/EatsSdkLaunchEnvironmentSignalFactory$Result", "", "Companion", "$serializer", "com/yandex/go/superapp/impl/signals/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EatsSdkLaunchEnvironmentSignalFactory$Result {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(29))};
    public final EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment a;

    public /* synthetic */ EatsSdkLaunchEnvironmentSignalFactory$Result(int i, EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment) {
        if (1 == (i & 1)) {
            this.a = eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment;
        } else {
            qje.Z(i, 1, EatsSdkLaunchEnvironmentSignalFactory$Result$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
