package com.yandex.plus.home.plaque.repository.graphql;

import defpackage.bms;
import defpackage.plc0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class GraphQLPlaqueRepository$plaqueConfigFlow$3 extends AdaptedFunctionReference implements bms {
    public static final GraphQLPlaqueRepository$plaqueConfigFlow$3 a = new GraphQLPlaqueRepository$plaqueConfigFlow$3(4, 4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V");

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj3;
        bool.booleanValue();
        return new Triple((plc0) obj, (Map) obj2, bool);
    }
}
