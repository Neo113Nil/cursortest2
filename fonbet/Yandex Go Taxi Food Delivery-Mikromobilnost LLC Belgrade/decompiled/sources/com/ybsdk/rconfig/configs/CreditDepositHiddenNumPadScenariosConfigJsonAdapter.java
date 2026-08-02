package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/configs/CreditDepositHiddenNumPadScenariosConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/CreditDepositHiddenNumPadScenariosConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreditDepositHiddenNumPadScenariosConfigJsonAdapter extends JsonAdapter<CreditDepositHiddenNumPadScenariosConfig> {
    private volatile Constructor<CreditDepositHiddenNumPadScenariosConfig> constructorRef;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("credit_deposit_scenarios", "credit_limit_scenarios", "mkk_deposit_scenarios", "boost_deposit_scenarios");

    public CreditDepositHiddenNumPadScenariosConfigJsonAdapter(Moshi moshi) {
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), EmptySet.a, "creditDepositScenarios");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditDepositHiddenNumPadScenariosConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<String> list = null;
        List<String> list2 = null;
        List<String> list3 = null;
        List<String> list4 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("creditDepositScenarios", "credit_deposit_scenarios", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                list2 = this.listOfStringAdapter.fromJson(jsonReader);
                if (list2 == null) {
                    throw Util.unexpectedNull("creditLimitDepositScenarios", "credit_limit_scenarios", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                list3 = this.listOfStringAdapter.fromJson(jsonReader);
                if (list3 == null) {
                    throw Util.unexpectedNull("mkkDepositScenarios", "mkk_deposit_scenarios", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                list4 = this.listOfStringAdapter.fromJson(jsonReader);
                if (list4 == null) {
                    throw Util.unexpectedNull("boostDepositScenarios", "boost_deposit_scenarios", jsonReader);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new CreditDepositHiddenNumPadScenariosConfig(list, list2, list3, list4);
        }
        Constructor<CreditDepositHiddenNumPadScenariosConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CreditDepositHiddenNumPadScenariosConfig.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(list, list2, list3, list4, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditDepositHiddenNumPadScenariosConfig creditDepositHiddenNumPadScenariosConfig) {
        CreditDepositHiddenNumPadScenariosConfig creditDepositHiddenNumPadScenariosConfig2 = creditDepositHiddenNumPadScenariosConfig;
        if (creditDepositHiddenNumPadScenariosConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("credit_deposit_scenarios");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositHiddenNumPadScenariosConfig2.getCreditDepositScenarios());
        jsonWriter.name("credit_limit_scenarios");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositHiddenNumPadScenariosConfig2.getCreditLimitDepositScenarios());
        jsonWriter.name("mkk_deposit_scenarios");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositHiddenNumPadScenariosConfig2.getMkkDepositScenarios());
        jsonWriter.name("boost_deposit_scenarios");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositHiddenNumPadScenariosConfig2.getBoostDepositScenarios());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(62, "GeneratedJsonAdapter(CreditDepositHiddenNumPadScenariosConfig)");
    }
}
