package com.yandex.paymentsdk.opentelemetry;

import defpackage.hlt0;
import defpackage.olt0;
import defpackage.qlt0;
import defpackage.slt0;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import io.opentelemetry.proto.common.v1.AnyValue;
import io.opentelemetry.proto.common.v1.KeyValue;
import io.opentelemetry.proto.resource.v1.Resource;
import io.opentelemetry.proto.trace.v1.ResourceSpans;
import io.opentelemetry.proto.trace.v1.ScopeSpans;
import io.opentelemetry.proto.trace.v1.Span;
import io.opentelemetry.proto.trace.v1.TracesData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OpenTelemetryTracerImpl$queue$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Span.SpanKind spanKind;
        Continuation continuation = (Continuation) obj2;
        olt0 olt0Var = (olt0) this.receiver;
        olt0Var.getClass();
        ScopeSpans.Builder newBuilder = ScopeSpans.newBuilder();
        List<hlt0> list = (List) obj;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (hlt0 hlt0Var : list) {
            Span.Builder name = Span.newBuilder().setTraceId(slt0.a(hlt0Var.b)).setSpanId(slt0.a(hlt0Var.c)).setName(hlt0Var.a);
            switch (qlt0.a[hlt0Var.d.ordinal()]) {
                case 1:
                    spanKind = Span.SpanKind.SPAN_KIND_INTERNAL;
                    break;
                case 2:
                    spanKind = Span.SpanKind.SPAN_KIND_SERVER;
                    break;
                case 3:
                    spanKind = Span.SpanKind.SPAN_KIND_CLIENT;
                    break;
                case 4:
                    spanKind = Span.SpanKind.SPAN_KIND_PRODUCER;
                    break;
                case 5:
                    spanKind = Span.SpanKind.SPAN_KIND_CONSUMER;
                    break;
                case 6:
                    spanKind = Span.SpanKind.SPAN_KIND_UNSPECIFIED;
                    break;
                case 7:
                    spanKind = Span.SpanKind.SPAN_KIND_UNSPECIFIED;
                    break;
                default:
                    w511.b();
                    return null;
            }
            Span.Builder endTimeUnixNano = name.setKind(spanKind).setStartTimeUnixNano(hlt0Var.g).setEndTimeUnixNano(hlt0Var.h);
            String str = hlt0Var.e;
            if (str != null) {
                endTimeUnixNano.setParentSpanId(slt0.a(str));
            }
            KeyValue.Builder newBuilder2 = KeyValue.newBuilder();
            for (Map.Entry entry : hlt0Var.f.entrySet()) {
                newBuilder2.setKey((String) entry.getKey()).setValue(AnyValue.newBuilder().setStringValue((String) entry.getValue()));
                endTimeUnixNano.addAttributes((KeyValue) newBuilder2.build());
            }
            arrayList.add((Span) endTimeUnixNano.build());
        }
        Object a = olt0Var.a.a(((TracesData) TracesData.newBuilder().addResourceSpans((ResourceSpans) ResourceSpans.newBuilder().addScopeSpans((ScopeSpans) newBuilder.addAllSpans(arrayList).setScope(olt0Var.b).build()).setResource((Resource) olt0Var.c.getValue()).build()).build()).toByteArray(), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
