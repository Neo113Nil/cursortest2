package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.parser;

import defpackage.bnr0;
import defpackage.fnr0;
import defpackage.gw00;
import defpackage.my;
import defpackage.qcx;
import defpackage.sbx;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/parser/ActionTemplatesSharedDataParser;", "Lfnr0;", "<init>", "()V", "Lsbx;", "json", "Lkotlinx/serialization/json/b;", "jsonElement", "Lbnr0;", "tryParse", "(Lsbx;Lkotlinx/serialization/json/b;)Lbnr0;", "", "jsonKey", "Ljava/lang/String;", "getJsonKey", "()Ljava/lang/String;", "sharedDataParserType", "getSharedDataParserType", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActionTemplatesSharedDataParser extends fnr0 {
    private static final Companion Companion = new Companion(null);
    private static final String JSON_KEY = "actionTemplates";
    private static final String PARSER_TYPE = "ActionTemplatesSharedDataParser";
    private final String jsonKey = JSON_KEY;
    private final String sharedDataParserType = PARSER_TYPE;

    @Override // defpackage.fnr0
    public String getJsonKey() {
        return this.jsonKey;
    }

    @Override // defpackage.fnr0
    public String getSharedDataParserType() {
        return this.sharedDataParserType;
    }

    @Override // defpackage.fnr0
    public bnr0 tryParse(sbx json2, b jsonElement) {
        Map map = qcx.m(jsonElement).a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), qcx.m((b) entry.getValue()));
        }
        return new my(linkedHashMap);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/parser/ActionTemplatesSharedDataParser$Companion;", "", "<init>", "()V", "JSON_KEY", "", "PARSER_TYPE", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
