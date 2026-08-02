package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CommonTopupPrerequisiteParam;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParamJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam$TopupScenario;", "topupScenarioAdapter", "", "nullableListOfMoneyAdapter", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonTopupPrerequisiteParamJsonAdapter extends JsonAdapter<CommonTopupPrerequisiteParam> {
    private volatile Constructor<CommonTopupPrerequisiteParam> constructorRef;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<List<Money>> nullableListOfMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("amount", "topup_scenario", "suggest_amounts", "suggest_behaviour");
    private final JsonAdapter<CommonTopupPrerequisiteParam.TopupScenario> topupScenarioAdapter;

    public CommonTopupPrerequisiteParamJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "amount");
        this.topupScenarioAdapter = moshi.adapter(CommonTopupPrerequisiteParam.TopupScenario.class, emptySet, "topupScenario");
        this.nullableListOfMoneyAdapter = moshi.adapter(Types.newParameterizedType(List.class, Money.class), emptySet, "suggestAmounts");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "suggestBehaviour");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CommonTopupPrerequisiteParam fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        CommonTopupPrerequisiteParam.TopupScenario topupScenario = null;
        List<Money> list = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("amount", "amount", jsonReader);
                }
            } else if (selectName == 1) {
                topupScenario = this.topupScenarioAdapter.fromJson(jsonReader);
                if (topupScenario == null) {
                    throw Util.unexpectedNull("topupScenario", "topup_scenario", jsonReader);
                }
            } else if (selectName == 2) {
                list = this.nullableListOfMoneyAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -13) {
            if (money == null) {
                throw Util.missingProperty("amount", "amount", jsonReader);
            }
            if (topupScenario != null) {
                return new CommonTopupPrerequisiteParam(money, topupScenario, list, str);
            }
            throw Util.missingProperty("topupScenario", "topup_scenario", jsonReader);
        }
        Constructor<CommonTopupPrerequisiteParam> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CommonTopupPrerequisiteParam.class.getDeclaredConstructor(Money.class, CommonTopupPrerequisiteParam.TopupScenario.class, List.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (money == null) {
            throw Util.missingProperty("amount", "amount", jsonReader);
        }
        if (topupScenario != null) {
            return constructor.newInstance(money, topupScenario, list, str, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("topupScenario", "topup_scenario", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CommonTopupPrerequisiteParam commonTopupPrerequisiteParam) {
        CommonTopupPrerequisiteParam commonTopupPrerequisiteParam2 = commonTopupPrerequisiteParam;
        if (commonTopupPrerequisiteParam2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("amount");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) commonTopupPrerequisiteParam2.getAmount());
        jsonWriter.name("topup_scenario");
        this.topupScenarioAdapter.toJson(jsonWriter, (JsonWriter) commonTopupPrerequisiteParam2.getTopupScenario());
        jsonWriter.name("suggest_amounts");
        this.nullableListOfMoneyAdapter.toJson(jsonWriter, (JsonWriter) commonTopupPrerequisiteParam2.getSuggestAmounts());
        jsonWriter.name("suggest_behaviour");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) commonTopupPrerequisiteParam2.getSuggestBehaviour());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(CommonTopupPrerequisiteParam)");
    }
}
