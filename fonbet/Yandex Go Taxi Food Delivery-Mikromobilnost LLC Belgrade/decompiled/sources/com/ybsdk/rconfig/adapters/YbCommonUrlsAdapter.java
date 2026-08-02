package com.ybsdk.rconfig.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/adapters/YbCommonUrlsAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/YbCommonUrlsImpl;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/ybsdk/rconfig/YbCommonUrlsImpl;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/ybsdk/rconfig/YbCommonUrlsImpl;)V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class YbCommonUrlsAdapter extends JsonAdapter<YbCommonUrlsImpl> {
    public static final YbCommonUrlsAdapter a = new YbCommonUrlsAdapter();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @FromJson
    public YbCommonUrlsImpl fromJson(JsonReader reader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (reader.peek() == JsonReader.Token.STRING) {
                linkedHashMap.put(nextName, reader.nextString());
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        String str = (String) linkedHashMap.get("account_status");
        String str2 = str == null ? "" : str;
        String str3 = (String) linkedHashMap.get("account_tariff");
        String str4 = str3 == null ? "" : str3;
        String str5 = (String) linkedHashMap.get("faq");
        String str6 = str5 == null ? "" : str5;
        String str7 = (String) linkedHashMap.get("federal_tax_service");
        String str8 = str7 == null ? "" : str7;
        String str9 = (String) linkedHashMap.get("bank");
        String str10 = str9 == null ? "" : str9;
        String str11 = (String) linkedHashMap.get("documents");
        String str12 = str11 == null ? "" : str11;
        String str13 = (String) linkedHashMap.get("mir_pay_manual");
        String str14 = str13 == null ? "" : str13;
        String str15 = (String) linkedHashMap.get("bank_frontend_url");
        String str16 = str15 == null ? "" : str15;
        String str17 = (String) linkedHashMap.get("help_center");
        String str18 = str17 == null ? "" : str17;
        String str19 = (String) linkedHashMap.get("help_center-plus_card");
        String str20 = str19 == null ? "" : str19;
        String str21 = (String) linkedHashMap.get("app_legal");
        return new YbCommonUrlsImpl(str2, str4, str6, str8, str10, str12, str14, str16, str18, str20, str21 == null ? "" : str21, (String) linkedHashMap.get("simplified_identification_info"));
    }

    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public void toJson(JsonWriter writer, YbCommonUrlsImpl value) {
        writer.beginObject();
        writer.name("account_status").value(value != null ? value.getAccountStatusUrl() : null);
        writer.name("account_tariff").value(value != null ? value.getAccountTariffUrl() : null);
        writer.name("faq").value(value != null ? value.getFaqUrl() : null);
        writer.name("federal_tax_service").value(value != null ? value.getTaxServiceUrl() : null);
        writer.name("bank").value(value != null ? value.getYbUrl() : null);
        writer.name("documents").value(value != null ? value.getDocumentsUrl() : null);
        writer.name("mir_pay_manual").value(value != null ? value.getMirPayManual() : null);
        writer.name("help_center").value(value != null ? value.getHelpCenter() : null);
        writer.name("help_center-plus_card").value(value != null ? value.getHelpCenterPlusCard() : null);
        writer.endObject();
    }
}
