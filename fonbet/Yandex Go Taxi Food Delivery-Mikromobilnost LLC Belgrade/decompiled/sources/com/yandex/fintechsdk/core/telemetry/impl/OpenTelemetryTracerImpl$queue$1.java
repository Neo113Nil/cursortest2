package com.yandex.fintechsdk.core.telemetry.impl;

import defpackage.klt0;
import defpackage.plt0;
import defpackage.rlt0;
import defpackage.tcc;
import defpackage.tlt0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import io.opentelemetry.proto2.common.v1.AnyValue;
import io.opentelemetry.proto2.common.v1.KeyValue;
import io.opentelemetry.proto2.resource.v1.Resource;
import io.opentelemetry.proto2.trace.v1.ResourceSpans;
import io.opentelemetry.proto2.trace.v1.ScopeSpans;
import io.opentelemetry.proto2.trace.v1.Span;
import io.opentelemetry.proto2.trace.v1.TracesData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OpenTelemetryTracerImpl$queue$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Span.SpanKind spanKind;
        Continuation continuation = (Continuation) obj2;
        plt0 plt0Var = (plt0) this.receiver;
        plt0Var.getClass();
        ScopeSpans.Builder newBuilder = ScopeSpans.newBuilder();
        List<klt0> list = (List) obj;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (klt0 klt0Var : list) {
            Span.Builder name = Span.newBuilder().setTraceId(tlt0.a(klt0Var.b)).setSpanId(tlt0.a(klt0Var.c)).setName(klt0Var.a);
            switch (rlt0.a[klt0Var.d.ordinal()]) {
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
            Span.Builder endTimeUnixNano = name.setKind(spanKind).setStartTimeUnixNano(klt0Var.g).setEndTimeUnixNano(klt0Var.h);
            String str = klt0Var.e;
            if (str != null) {
                endTimeUnixNano.setParentSpanId(tlt0.a(str));
            }
            KeyValue.Builder newBuilder2 = KeyValue.newBuilder();
            for (Map.Entry entry : klt0Var.f.entrySet()) {
                newBuilder2.setKey((String) entry.getKey()).setValue(AnyValue.newBuilder().setStringValue((String) entry.getValue()));
                endTimeUnixNano.addAttributes((KeyValue) newBuilder2.build());
            }
            arrayList.add((Span) endTimeUnixNano.build());
        }
        Object a = plt0Var.a.a(((TracesData) TracesData.newBuilder().addResourceSpans((ResourceSpans) ResourceSpans.newBuilder().addScopeSpans((ScopeSpans) newBuilder.addAllSpans(arrayList).setScope(plt0Var.b).build()).setResource((Resource) plt0Var.c.getValue()).build()).build()).toByteArray(), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
