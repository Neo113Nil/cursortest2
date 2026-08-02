package com.yandex.div.core.expression.storedvalues;

import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.RawJsonRepository;
import com.yandex.div.storage.RawJsonRepositoryException;
import com.yandex.div.storage.RawJsonRepositoryResult;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aqy;
import xsna.bpn0;
import xsna.epx;
import xsna.go9;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.t33;

/* compiled from: StoredValuesController.kt */
/* loaded from: classes7.dex */
public class StoredValuesController {
    private final Lazy rawJsonRepository$delegate;

    /* compiled from: StoredValuesController.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoredValue.Type.values().length];
            try {
                iArr[StoredValue.Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoredValue.Type.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoredValue.Type.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoredValue.Type.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoredValue.Type.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoredValue.Type.URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoredValue.Type.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoredValue.Type.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoredValuesController(final aqy<? extends DivStorageComponent> aqyVar) {
        this.rawJsonRepository$delegate = new bpn0(new gzs<RawJsonRepository>() { // from class: com.yandex.div.core.expression.storedvalues.StoredValuesController$rawJsonRepository$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final RawJsonRepository invoke() {
                return aqyVar.get().getRawJsonRepository();
            }
        });
    }

    private long getCurrentTime() {
        return System.currentTimeMillis();
    }

    private RawJsonRepository getRawJsonRepository() {
        return (RawJsonRepository) this.rawJsonRepository$delegate.getValue();
    }

    private void logDeclarationFailed(ErrorCollector errorCollector, String str, Throwable th) {
        StringBuilder a = t33.a("Stored value '", str, "' declaration failed: ");
        a.append(th != null ? th.getMessage() : null);
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException(a.toString(), th);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    private void logRepositoryErrors(ErrorCollector errorCollector, List<RawJsonRepositoryException> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            errorCollector.logError((RawJsonRepositoryException) it.next());
        }
    }

    private void logUnknownType(ErrorCollector errorCollector, String str, String str2) {
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException("Stored value '" + str + "' declaration failed because of unknown type '" + str2 + '\'', null, 2, null);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    private JSONObject toJSONObject(StoredValue storedValue, long j) {
        Object obj;
        if (storedValue instanceof StoredValue.StringStoredValue ? true : storedValue instanceof StoredValue.IntegerStoredValue ? true : storedValue instanceof StoredValue.BooleanStoredValue ? true : storedValue instanceof StoredValue.ArrayStoredValue ? true : storedValue instanceof StoredValue.DictStoredValue ? true : storedValue instanceof StoredValue.DoubleStoredValue) {
            obj = storedValue.getValue();
        } else {
            if (!(storedValue instanceof StoredValue.UrlStoredValue ? true : storedValue instanceof StoredValue.ColorStoredValue)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = storedValue.getValue().toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("expiration_time", (j * 1000) + getCurrentTime());
        jSONObject.put("type", StoredValue.Type.Converter.toString(storedValue.getType()));
        jSONObject.put("value", obj);
        return jSONObject;
    }

    private StoredValue toStoredValue(JSONObject jSONObject, StoredValue.Type type, String str) throws JSONException {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new StoredValue.StringStoredValue(str, jSONObject.getString("value"));
            case 2:
                return new StoredValue.IntegerStoredValue(str, jSONObject.getLong("value"));
            case 3:
                return new StoredValue.BooleanStoredValue(str, jSONObject.getBoolean("value"));
            case 4:
                return new StoredValue.DoubleStoredValue(str, jSONObject.getDouble("value"));
            case 5:
                return new StoredValue.ColorStoredValue(str, Color.Companion.m194parseC4zCDoM(jSONObject.getString("value")), null);
            case 6:
                return new StoredValue.UrlStoredValue(str, Url.Companion.m202fromVcSV9u8(jSONObject.getString("value")), null);
            case 7:
                return new StoredValue.ArrayStoredValue(str, jSONObject.getJSONArray("value"));
            case 8:
                return new StoredValue.DictStoredValue(str, jSONObject.getJSONObject("value"));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public StoredValue getStoredValue(String str, ErrorCollector errorCollector) {
        JSONObject data;
        final String b = go9.b("stored_value_", str);
        RawJsonRepositoryResult rawJsonRepositoryResult = getRawJsonRepository().get(Collections.singletonList(b));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, rawJsonRepositoryResult.getErrors());
        }
        RawJson rawJson = (RawJson) j5g.a0(rawJsonRepositoryResult.getResultData());
        if (rawJson != null && (data = rawJson.getData()) != null) {
            if (data.has("expiration_time")) {
                if (getCurrentTime() >= data.getLong("expiration_time")) {
                    getRawJsonRepository().remove(new izs<RawJson, Boolean>() { // from class: com.yandex.div.core.expression.storedvalues.StoredValuesController$getStoredValue$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public final Boolean invoke(RawJson rawJson2) {
                            return Boolean.valueOf(epx.f(rawJson2.getId(), b));
                        }
                    });
                    return null;
                }
            }
            try {
                String string = data.getString("type");
                StoredValue.Type fromString = StoredValue.Type.Converter.fromString(string);
                if (fromString != null) {
                    return toStoredValue(data, fromString, str);
                }
                logUnknownType(errorCollector, str, string);
                return null;
            } catch (JSONException e) {
                logDeclarationFailed(errorCollector, str, e);
            }
        }
        return null;
    }

    public boolean setStoredValue(StoredValue storedValue, long j, ErrorCollector errorCollector) {
        RawJsonRepositoryResult put = getRawJsonRepository().put(new RawJsonRepository.Payload(Collections.singletonList(RawJson.Companion.invoke("stored_value_" + storedValue.getName(), toJSONObject(storedValue, j))), null, 2, null));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, put.getErrors());
        }
        return put.getErrors().isEmpty();
    }
}
