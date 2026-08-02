package ru.ok.tracer.opentelemetry.export;

import android.util.Base64;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.common.ValueType;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.a;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.brm0;
import xsna.c4q;
import xsna.d9z;
import xsna.fht;
import xsna.g300;
import xsna.gag0;
import xsna.i94;
import xsna.iey;
import xsna.izk0;
import xsna.izs;
import xsna.j6o;
import xsna.jlb0;
import xsna.ljr0;
import xsna.m000;
import xsna.naq;
import xsna.njr0;
import xsna.oaq;
import xsna.paq;
import xsna.pyp;
import xsna.q8x;
import xsna.q94;
import xsna.qtk;
import xsna.s3q0;
import xsna.sm5;
import xsna.t7v;
import xsna.tm5;
import xsna.u6n0;
import xsna.u6o;
import xsna.v300;
import xsna.v7v;
import xsna.w6n0;
import xsna.whk0;
import xsna.wzs;
import xsna.x6n0;
import xsna.yk20;

/* compiled from: OpenTelemetrySerializer.kt */
/* loaded from: classes9.dex */
public final class OpenTelemetrySerializerKt {

    /* compiled from: OpenTelemetrySerializer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AttributeType.values().length];
            try {
                iArr[AttributeType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttributeType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttributeType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttributeType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AttributeType.STRING_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AttributeType.BOOLEAN_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AttributeType.LONG_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AttributeType.DOUBLE_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ValueType.values().length];
            try {
                iArr2[ValueType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ValueType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ValueType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ValueType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ValueType.ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ValueType.KEY_VALUE_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ValueType.BYTES.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ValueType.EMPTY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final void addOpenTelemetryAttributesTo(JSONObject jSONObject, q94 q94Var, int i) {
        int size = q94Var.size() - addSupportedOpenTelemetryAttributesTo(jSONObject, q94Var, "attributes");
        if (size > 0 || i > 0) {
            jSONObject.put("droppedAttributesCount", Integer.valueOf(size + i));
        }
    }

    public static /* synthetic */ void addOpenTelemetryAttributesTo$default(JSONObject jSONObject, q94 q94Var, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        addOpenTelemetryAttributesTo(jSONObject, q94Var, i);
    }

    private static final int addSupportedOpenTelemetryAttributesTo(JSONObject jSONObject, q94 q94Var, String str) {
        final MapBuilder mapBuilder = new MapBuilder();
        final wzs<i94<?>, Object, s3q0> wzsVar = new wzs<i94<?>, Object, s3q0>() { // from class: ru.ok.tracer.opentelemetry.export.OpenTelemetrySerializerKt$addSupportedOpenTelemetryAttributesTo$supportedAttributes$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // xsna.wzs
            public /* bridge */ /* synthetic */ s3q0 invoke(i94<?> i94Var, Object obj) {
                invoke2(i94Var, obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(i94<?> i94Var, Object obj) {
                boolean checkAnyOpenTelemetryAttribute;
                checkAnyOpenTelemetryAttribute = OpenTelemetrySerializerKt.checkAnyOpenTelemetryAttribute(i94Var.getType(), obj);
                if (checkAnyOpenTelemetryAttribute) {
                    mapBuilder.put(i94Var, obj);
                }
            }
        };
        q94Var.forEach(new BiConsumer() { // from class: xsna.os80
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                wzs.this.invoke(obj, obj2);
            }
        });
        MapBuilder h = mapBuilder.h();
        if (!h.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((a) h.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                i94 i94Var = (i94) entry.getKey();
                Object value = entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", i94Var.getKey());
                jSONObject2.put("value", openTelemetryValueToJsonObject(i94Var.getType(), value));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(str, jSONArray);
        }
        return h.size();
    }

    public static /* synthetic */ int addSupportedOpenTelemetryAttributesTo$default(JSONObject jSONObject, q94 q94Var, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "attributes";
        }
        return addSupportedOpenTelemetryAttributesTo(jSONObject, q94Var, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkAnyOpenTelemetryAttribute(AttributeType attributeType, Object obj) {
        switch (WhenMappings.$EnumSwitchMapping$0[attributeType.ordinal()]) {
            case 1:
                return obj instanceof String;
            case 2:
                return obj instanceof Boolean;
            case 3:
                return obj instanceof Long;
            case 4:
                return obj instanceof Double;
            case 5:
                if (obj instanceof List) {
                    Iterable iterable = (Iterable) obj;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (!(it.next() instanceof String)) {
                            }
                        }
                    }
                    return true;
                }
                return false;
            case 6:
                if (obj instanceof List) {
                    Iterable iterable2 = (Iterable) obj;
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (!(it2.next() instanceof Boolean)) {
                            }
                        }
                    }
                    return true;
                }
                return false;
            case 7:
                if (obj instanceof List) {
                    Iterable iterable3 = (Iterable) obj;
                    if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
                        Iterator it3 = iterable3.iterator();
                        while (it3.hasNext()) {
                            if (!(it3.next() instanceof Long)) {
                            }
                        }
                    }
                    return true;
                }
                return false;
            case 8:
                if (obj instanceof List) {
                    Iterable iterable4 = (Iterable) obj;
                    if (!(iterable4 instanceof Collection) || !((Collection) iterable4).isEmpty()) {
                        Iterator it4 = iterable4.iterator();
                        while (it4.hasNext()) {
                            if (!(it4.next() instanceof Double)) {
                            }
                        }
                    }
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public static final <T> String composeOpenTelemetryJson(String str, izs<? super T, ? extends gag0> izsVar, String str2, izs<? super T, ? extends q8x> izsVar2, String str3, izs<? super T, ? extends JSONObject> izsVar3, Collection<? extends T> collection) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : collection) {
            gag0 invoke = izsVar.invoke(t);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(t);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            gag0 gag0Var = (gag0) entry.getKey();
            List list = (List) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("resource", toJsonObject(gag0Var));
            JSONArray jSONArray2 = new JSONArray();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T t2 : list) {
                q8x invoke2 = izsVar2.invoke(t2);
                Object obj2 = linkedHashMap2.get(invoke2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(invoke2, obj2);
                }
                ((List) obj2).add(t2);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                q8x q8xVar = (q8x) entry2.getKey();
                List list2 = (List) entry2.getValue();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, toJsonObject(q8xVar));
                JSONArray jSONArray3 = new JSONArray();
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    jSONArray3.put(izsVar3.invoke(it.next()));
                }
                jSONObject3.put(str3, jSONArray3);
                jSONArray2.put(jSONObject3);
            }
            jSONObject2.put(str2, jSONArray2);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put(str, jSONArray);
        return jSONObject.toString();
    }

    private static final JSONArray jsonArray(izs<? super JSONArray, s3q0> izsVar) {
        JSONArray jSONArray = new JSONArray();
        izsVar.invoke(jSONArray);
        return jSONArray;
    }

    private static final JSONObject jsonObject(izs<? super JSONObject, s3q0> izsVar) {
        JSONObject jSONObject = new JSONObject();
        izsVar.invoke(jSONObject);
        return jSONObject;
    }

    private static final JSONObject nullableOpenTelemetryValueToJsonObject(ljr0<?> ljr0Var) {
        if (ljr0Var != null) {
            return openTelemetryValueToJsonObject(ljr0Var);
        }
        return null;
    }

    private static final JSONObject openTelemetryArrayValueToJsonObject(AttributeType attributeType, List<?> list) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(openTelemetryValueToJsonObject(attributeType, it.next()));
        }
        jSONObject.put("values", jSONArray);
        return jSONObject;
    }

    private static final JSONObject openTelemetryValueToJsonObject(AttributeType attributeType, Object obj) {
        JSONObject jSONObject = new JSONObject();
        switch (WhenMappings.$EnumSwitchMapping$0[attributeType.ordinal()]) {
            case 1:
                jSONObject.put("stringValue", (String) obj);
                return jSONObject;
            case 2:
                jSONObject.put("boolValue", (Boolean) obj);
                return jSONObject;
            case 3:
                jSONObject.put("intValue", (Long) obj);
                return jSONObject;
            case 4:
                jSONObject.put("doubleValue", (Double) obj);
                return jSONObject;
            case 5:
                jSONObject.put("arrayValue", openTelemetryArrayValueToJsonObject(AttributeType.STRING, (List) obj));
                return jSONObject;
            case 6:
                jSONObject.put("arrayValue", openTelemetryArrayValueToJsonObject(AttributeType.BOOLEAN, (List) obj));
                return jSONObject;
            case 7:
                jSONObject.put("arrayValue", openTelemetryArrayValueToJsonObject(AttributeType.LONG, (List) obj));
                return jSONObject;
            case 8:
                jSONObject.put("arrayValue", openTelemetryArrayValueToJsonObject(AttributeType.DOUBLE, (List) obj));
                return jSONObject;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static final void plusAssign(JSONArray jSONArray, JSONObject jSONObject) {
        jSONArray.put(jSONObject);
    }

    private static final void set(JSONObject jSONObject, String str, String str2) {
        jSONObject.put(str, str2);
    }

    private static final <T> JSONArray toJsonArrayWithEach(Iterable<? extends T> iterable, wzs<? super JSONArray, ? super T, s3q0> wzsVar) {
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            wzsVar.invoke(jSONArray, it.next());
        }
        return jSONArray;
    }

    private static final JSONObject toJsonObject(gag0 gag0Var) {
        JSONObject jSONObject = new JSONObject();
        addOpenTelemetryAttributesTo$default(jSONObject, gag0Var.c(), 0, 4, null);
        return jSONObject;
    }

    private static final JSONObject toJsonObjectOrNull(izk0 izk0Var) {
        if (((tm5) izk0Var).d == StatusCode.UNSET && ((tm5) izk0Var).e.length() <= 0) {
            izk0Var = null;
        }
        if (izk0Var != null) {
            return toJsonObject(izk0Var);
        }
        return null;
    }

    private static final int toJsonValue(AggregationTemporality aggregationTemporality) {
        return aggregationTemporality.ordinal() + 1;
    }

    private static final Integer toJsonValueOrNull(StatusCode statusCode) {
        if (statusCode == StatusCode.UNSET) {
            statusCode = null;
        }
        if (statusCode != null) {
            return Integer.valueOf(toJsonValue(statusCode));
        }
        return null;
    }

    private static final void plusAssign(JSONArray jSONArray, String str) {
        jSONArray.put(str);
    }

    private static final void set(JSONObject jSONObject, String str, Boolean bool) {
        jSONObject.put(str, bool);
    }

    private static final int toJsonValue(StatusCode statusCode) {
        return statusCode.ordinal();
    }

    private static final void plusAssign(JSONArray jSONArray, Double d) {
        jSONArray.put(d);
    }

    private static final void set(JSONObject jSONObject, String str, Integer num) {
        jSONObject.put(str, num);
    }

    private static final JSONObject toJsonObject(q8x q8xVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", q8xVar.c());
        jSONObject.put("version", q8xVar.e());
        addOpenTelemetryAttributesTo$default(jSONObject, q8xVar.b(), 0, 4, null);
        return jSONObject;
    }

    private static final int toJsonValue(SpanKind spanKind) {
        return spanKind.ordinal() + 1;
    }

    private static final void plusAssign(JSONArray jSONArray, Long l) {
        jSONArray.put(l);
    }

    private static final void set(JSONObject jSONObject, String str, Double d) {
        jSONObject.put(str, d);
    }

    private static final void set(JSONObject jSONObject, String str, Long l) {
        jSONObject.put(str, l);
    }

    private static final void set(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        jSONObject.put(str, jSONObject2);
    }

    private static final void set(JSONObject jSONObject, String str, JSONArray jSONArray) {
        jSONObject.put(str, jSONArray);
    }

    public static final JSONObject toJsonObject(m000 m000Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeUnixNano", String.valueOf(m000Var.e()));
        jSONObject.put("observedTimeUnixNano", String.valueOf(m000Var.f()));
        jSONObject.put("severityNumber", Integer.valueOf(m000Var.getSeverity().h()));
        jSONObject.put("severityText", m000Var.g());
        m000Var.h();
        throw null;
    }

    public static final JSONObject toJsonObject(yk20 yk20Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", yk20Var.getName());
        jSONObject.put("unit", yk20Var.a());
        String description = yk20Var.getDescription();
        if (description.length() <= 0) {
            description = null;
        }
        jSONObject.put("description", description);
        qtk<?> data = yk20Var.getData();
        if (data instanceof u6n0) {
            JSONObject jSONObject2 = new JSONObject();
            u6n0 u6n0Var = (u6n0) data;
            jSONObject2.put("aggregationTemporality", Integer.valueOf(toJsonValue(u6n0Var.a())));
            jSONObject2.put("isMonotonic", Boolean.valueOf(u6n0Var.c()));
            Iterable b = u6n0Var.b();
            JSONArray jSONArray = new JSONArray();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                jSONArray.put(toJsonObject((jlb0) it.next()));
            }
            jSONObject2.put("dataPoints", jSONArray);
            jSONObject.put("sum", jSONObject2);
            return jSONObject;
        }
        if (data instanceof fht) {
            JSONObject jSONObject3 = new JSONObject();
            Iterable b2 = ((fht) data).b();
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = b2.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(toJsonObject((jlb0) it2.next()));
            }
            jSONObject3.put("dataPoints", jSONArray2);
            jSONObject.put("gauge", jSONObject3);
            return jSONObject;
        }
        if (data instanceof t7v) {
            JSONObject jSONObject4 = new JSONObject();
            t7v t7vVar = (t7v) data;
            jSONObject4.put("aggregationTemporality", Integer.valueOf(toJsonValue(t7vVar.a())));
            Collection<v7v> b3 = t7vVar.b();
            JSONArray jSONArray3 = new JSONArray();
            Iterator<T> it3 = b3.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(toJsonObject((v7v) it3.next()));
            }
            jSONObject4.put("dataPoints", jSONArray3);
            jSONObject.put("histogram", jSONObject4);
            return jSONObject;
        }
        if (data instanceof oaq) {
            JSONObject jSONObject5 = new JSONObject();
            oaq oaqVar = (oaq) data;
            jSONObject5.put("aggregationTemporality", Integer.valueOf(toJsonValue(oaqVar.a())));
            Collection<paq> b4 = oaqVar.b();
            JSONArray jSONArray4 = new JSONArray();
            Iterator<T> it4 = b4.iterator();
            while (it4.hasNext()) {
                jSONArray4.put(toJsonObject((paq) it4.next()));
            }
            jSONObject5.put("dataPoints", jSONArray4);
            jSONObject.put("exponentialHistogram", jSONObject5);
            return jSONObject;
        }
        if (data instanceof w6n0) {
            JSONObject jSONObject6 = new JSONObject();
            Collection<x6n0> b5 = ((w6n0) data).b();
            JSONArray jSONArray5 = new JSONArray();
            Iterator<T> it5 = b5.iterator();
            while (it5.hasNext()) {
                jSONArray5.put(toJsonObject((x6n0) it5.next()));
            }
            jSONObject6.put("dataPoints", jSONArray5);
            jSONObject.put("summary", jSONObject6);
            return jSONObject;
        }
        throw new UnsupportedOperationException("Unsupported metric type: ".concat(data.getClass().getName()));
    }

    private static final JSONObject openTelemetryValueToJsonObject(ljr0<?> ljr0Var) {
        JSONObject jSONObject = new JSONObject();
        ValueType type = ljr0Var.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
            case 1:
                jSONObject.put("stringValue", (String) ljr0Var.getValue());
                return jSONObject;
            case 2:
                jSONObject.put("boolValue", (Boolean) ljr0Var.getValue());
                return jSONObject;
            case 3:
                jSONObject.put("intValue", (Long) ljr0Var.getValue());
                return jSONObject;
            case 4:
                jSONObject.put("doubleValue", (Double) ljr0Var.getValue());
                return jSONObject;
            case 5:
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((List) ljr0Var.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(openTelemetryValueToJsonObject((ljr0) it.next()));
                }
                jSONObject2.put("values", jSONArray);
                jSONObject.put("arrayValue", jSONObject2);
                return jSONObject;
            case 6:
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                for (iey ieyVar : (List) ljr0Var.getValue()) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("key", ieyVar.getKey());
                    jSONObject4.put("value", openTelemetryValueToJsonObject(ieyVar.getValue()));
                    jSONArray2.put(jSONObject4);
                }
                jSONObject3.put("values", jSONArray2);
                jSONObject.put("kvlistValue", jSONObject3);
                return jSONObject;
            case 7:
                jSONObject.put("bytesValue", brm0.u(Base64.encode((byte[]) ljr0Var.getValue(), 0)));
                return jSONObject;
            case 8:
                return jSONObject;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static final JSONObject toJsonObject(jlb0 jlb0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTimeUnixNano", String.valueOf(jlb0Var.g()));
        jSONObject.put("timeUnixNano", String.valueOf(jlb0Var.b()));
        if (jlb0Var instanceof u6o) {
            jSONObject.put("asDouble", Double.valueOf(((u6o) jlb0Var).getValue()));
        } else if (jlb0Var instanceof v300) {
            jSONObject.put("asInt", String.valueOf(((v300) jlb0Var).getValue()));
        } else if (jlb0Var instanceof v7v) {
            v7v v7vVar = (v7v) jlb0Var;
            jSONObject.put("count", Long.valueOf(v7vVar.getCount()));
            jSONObject.put("sum", Double.valueOf(v7vVar.a()));
            List<Long> j = v7vVar.j();
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = j.iterator();
            while (it.hasNext()) {
                jSONArray.put((Long) it.next());
            }
            jSONObject.put("bucketCounts", jSONArray);
            List<Double> n = v7vVar.n();
            JSONArray jSONArray2 = new JSONArray();
            Iterator<T> it2 = n.iterator();
            while (it2.hasNext()) {
                jSONArray2.put((Double) it2.next());
            }
            jSONObject.put("explicitBounds", jSONArray2);
            Double valueOf = Double.valueOf(v7vVar.e());
            if (!v7vVar.d()) {
                valueOf = null;
            }
            jSONObject.put(UcumUtils.UCUM_MINUTES, valueOf);
            Double valueOf2 = Double.valueOf(v7vVar.i());
            if (!v7vVar.f()) {
                valueOf2 = null;
            }
            jSONObject.put(InneractiveMediationNameConsts.MAX, valueOf2);
        } else if (jlb0Var instanceof paq) {
            paq paqVar = (paq) jlb0Var;
            jSONObject.put("count", Long.valueOf(paqVar.getCount()));
            jSONObject.put("sum", Double.valueOf(paqVar.a()));
            jSONObject.put("scale", Integer.valueOf(paqVar.c()));
            jSONObject.put("zeroCount", String.valueOf(paqVar.l()));
            jSONObject.put("positive", toJsonObject(paqVar.m()));
            jSONObject.put("negative", toJsonObject(paqVar.k()));
            Double valueOf3 = Double.valueOf(paqVar.e());
            if (!paqVar.d()) {
                valueOf3 = null;
            }
            jSONObject.put(UcumUtils.UCUM_MINUTES, valueOf3);
            Double valueOf4 = Double.valueOf(paqVar.i());
            if (!paqVar.f()) {
                valueOf4 = null;
            }
            jSONObject.put(InneractiveMediationNameConsts.MAX, valueOf4);
        } else if (jlb0Var instanceof x6n0) {
            x6n0 x6n0Var = (x6n0) jlb0Var;
            jSONObject.put("count", Long.valueOf(x6n0Var.getCount()));
            jSONObject.put("sum", Double.valueOf(x6n0Var.a()));
            List<njr0> h = x6n0Var.h();
            JSONArray jSONArray3 = new JSONArray();
            Iterator<T> it3 = h.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(toJsonObject((njr0) it3.next()));
            }
            jSONObject.put("quantileValues", jSONArray3);
        }
        addOpenTelemetryAttributesTo$default(jSONObject, jlb0Var.getAttributes(), 0, 4, null);
        List<? extends c4q> o = jlb0Var.o();
        JSONArray jSONArray4 = new JSONArray();
        Iterator<T> it4 = o.iterator();
        while (it4.hasNext()) {
            jSONArray4.put(toJsonObject((c4q) it4.next()));
        }
        jSONObject.put("exemplars", jSONArray4);
        return jSONObject;
    }

    private static final JSONObject toJsonObject(naq naqVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SignalingProtocol.KEY_OFFSET, String.valueOf(naqVar.getOffset()));
        List<Long> d = naqVar.d();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            jSONArray.put(String.valueOf((Long) it.next()));
        }
        jSONObject.put("bucketCounts", jSONArray);
        return jSONObject;
    }

    private static final JSONObject toJsonObject(njr0 njr0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("quantile", Double.valueOf(njr0Var.a()));
        jSONObject.put("value", Double.valueOf(njr0Var.getValue()));
        return jSONObject;
    }

    private static final JSONObject toJsonObject(c4q c4qVar) {
        JSONObject jSONObject = new JSONObject();
        addSupportedOpenTelemetryAttributesTo(jSONObject, c4qVar.a(), "filteredAttributes");
        jSONObject.put("timeUnixNano", String.valueOf(c4qVar.b()));
        if (c4qVar instanceof g300) {
            jSONObject.put("asInt", String.valueOf(((g300) c4qVar).getValue()));
        } else if (c4qVar instanceof j6o) {
            jSONObject.put("asDouble", Double.valueOf(((j6o) c4qVar).getValue()));
        }
        if (((sm5) c4qVar.i()).f) {
            jSONObject.put("traceId", ((sm5) c4qVar.i()).b);
            jSONObject.put("spanId", ((sm5) c4qVar.i()).c);
        }
        return jSONObject;
    }

    public static final JSONObject toJsonObject(whk0 whk0Var) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("traceId", whk0Var.h());
        jSONObject.put("spanId", whk0Var.e());
        jSONObject.put("parentSpanId", whk0Var.l());
        jSONObject.put("name", whk0Var.getName());
        jSONObject.put("startTimeUnixNano", String.valueOf(whk0Var.g()));
        jSONObject.put("endTimeUnixNano", String.valueOf(whk0Var.j()));
        jSONObject.put(RTCStatsConstants.KEY_KIND, Integer.valueOf(toJsonValue(whk0Var.getKind())));
        List<pyp> b = whk0Var.b();
        if (b.isEmpty()) {
            b = null;
        }
        if (b != null) {
            jSONArray = new JSONArray();
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                jSONArray.put(toJsonObject((pyp) it.next()));
            }
        } else {
            jSONArray = null;
        }
        jSONObject.put("events", jSONArray);
        int k = whk0Var.k() - whk0Var.b().size();
        Integer valueOf = Integer.valueOf(k);
        if (k <= 0) {
            valueOf = null;
        }
        jSONObject.put("droppedEventsCount", valueOf);
        List<d9z> f = whk0Var.f();
        if (f.isEmpty()) {
            f = null;
        }
        if (f != null) {
            jSONArray2 = new JSONArray();
            Iterator<T> it2 = f.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(toJsonObject((d9z) it2.next()));
            }
        } else {
            jSONArray2 = null;
        }
        jSONObject.put("links", jSONArray2);
        int m = whk0Var.m() - whk0Var.f().size();
        jSONObject.put("droppedLinksCount", m > 0 ? Integer.valueOf(m) : null);
        jSONObject.put("status", toJsonObjectOrNull(whk0Var.getStatus()));
        addOpenTelemetryAttributesTo(jSONObject, whk0Var.getAttributes(), whk0Var.a() - whk0Var.getAttributes().size());
        return jSONObject;
    }

    private static final JSONObject toJsonObject(pyp pypVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeUnixNano", String.valueOf(pypVar.b()));
        jSONObject.put("name", pypVar.getName());
        addOpenTelemetryAttributesTo(jSONObject, pypVar.getAttributes(), pypVar.c());
        return jSONObject;
    }

    private static final JSONObject toJsonObject(izk0 izk0Var) {
        JSONObject jSONObject = new JSONObject();
        String str = ((tm5) izk0Var).e;
        if (str.length() <= 0) {
            str = null;
        }
        jSONObject.put("message", str);
        jSONObject.put("code", toJsonValueOrNull(((tm5) izk0Var).d));
        return jSONObject;
    }

    private static final JSONObject toJsonObject(d9z d9zVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("traceId", ((sm5) d9zVar.i()).b);
        jSONObject.put("spanId", ((sm5) d9zVar.i()).c);
        jSONObject.put("traceState", ((sm5) d9zVar.i()).e.toString());
        addOpenTelemetryAttributesTo(jSONObject, d9zVar.getAttributes(), d9zVar.a() - d9zVar.getAttributes().size());
        return jSONObject;
    }
}
