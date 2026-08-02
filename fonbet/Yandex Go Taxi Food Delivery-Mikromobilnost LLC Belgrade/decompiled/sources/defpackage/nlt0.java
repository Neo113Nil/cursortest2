package defpackage;

import io.opentelemetry.proto.common.v1.AnyValue;
import io.opentelemetry.proto.common.v1.KeyValue;
import io.opentelemetry.proto.resource.v1.Resource;
import io.opentelemetry.proto2.common.v1.KeyValue;
import io.opentelemetry.proto2.resource.v1.Resource;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final /* synthetic */ class nlt0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ nlt0(LinkedHashMap linkedHashMap, int i) {
        this.a = i;
        this.b = linkedHashMap;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        LinkedHashMap linkedHashMap = this.b;
        switch (i) {
            case 0:
                Resource.Builder newBuilder = Resource.newBuilder();
                KeyValue.Builder newBuilder2 = KeyValue.newBuilder();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    newBuilder2.setKey((String) entry.getKey()).setValue(AnyValue.newBuilder().setStringValue((String) entry.getValue()));
                    newBuilder.addAttributes((KeyValue) newBuilder2.build());
                }
                return (Resource) newBuilder.build();
            default:
                Resource.Builder newBuilder3 = io.opentelemetry.proto2.resource.v1.Resource.newBuilder();
                KeyValue.Builder newBuilder4 = io.opentelemetry.proto2.common.v1.KeyValue.newBuilder();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    newBuilder4.setKey((String) entry2.getKey()).setValue(io.opentelemetry.proto2.common.v1.AnyValue.newBuilder().setStringValue((String) entry2.getValue()));
                    newBuilder3.addAttributes((io.opentelemetry.proto2.common.v1.KeyValue) newBuilder4.build());
                }
                return (io.opentelemetry.proto2.resource.v1.Resource) newBuilder3.build();
        }
    }
}
