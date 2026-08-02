package defpackage;

import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment$SearchbarAction$Deeplink;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.j;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.l;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.m;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class fyv0 extends lnt {
    public static final fyv0 f = new fyv0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m.INSTANCE.serializer(), qoi0.a(m.class));
    }

    @Override // defpackage.h9
    public final List f() {
        SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType = SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType.CLOSE;
        f9 f9Var = new f9((String) h().invoke(superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType), j.INSTANCE.serializer(), qoi0.a(j.class));
        SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType2 = SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType.SUPERAPP_SEARCH;
        f9 f9Var2 = new f9((String) h().invoke(superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType2), l.INSTANCE.serializer(), qoi0.a(l.class));
        SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType3 = SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType.DEEPLINK;
        return Arrays.asList(f9Var, f9Var2, new f9((String) h().invoke(superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType3), SuperAppDiscoveryMapV2Experiment$SearchbarAction$Deeplink.Companion.serializer(), qoi0.a(SuperAppDiscoveryMapV2Experiment$SearchbarAction$Deeplink.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType.Companion.serializer();
    }
}
