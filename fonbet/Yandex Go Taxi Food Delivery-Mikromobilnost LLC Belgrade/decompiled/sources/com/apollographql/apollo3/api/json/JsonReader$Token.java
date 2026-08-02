package com.apollographql.apollo3.api.json;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/apollographql/apollo3/api/json/JsonReader$Token", "", "Lcom/apollographql/apollo3/api/json/JsonReader$Token;", "BEGIN_ARRAY", "END_ARRAY", "BEGIN_OBJECT", "END_OBJECT", "NAME", "STRING", "NUMBER", "LONG", "BOOLEAN", "NULL", "END_DOCUMENT", "ANY", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class JsonReader$Token {
    private static final /* synthetic */ JsonReader$Token[] $VALUES;
    public static final JsonReader$Token ANY;
    public static final JsonReader$Token BEGIN_ARRAY;
    public static final JsonReader$Token BEGIN_OBJECT;
    public static final JsonReader$Token BOOLEAN;
    public static final JsonReader$Token END_ARRAY;
    public static final JsonReader$Token END_DOCUMENT;
    public static final JsonReader$Token END_OBJECT;
    public static final JsonReader$Token LONG;
    public static final JsonReader$Token NAME;
    public static final JsonReader$Token NULL;
    public static final JsonReader$Token NUMBER;
    public static final JsonReader$Token STRING;

    static {
        JsonReader$Token jsonReader$Token = new JsonReader$Token("BEGIN_ARRAY", 0);
        BEGIN_ARRAY = jsonReader$Token;
        JsonReader$Token jsonReader$Token2 = new JsonReader$Token("END_ARRAY", 1);
        END_ARRAY = jsonReader$Token2;
        JsonReader$Token jsonReader$Token3 = new JsonReader$Token("BEGIN_OBJECT", 2);
        BEGIN_OBJECT = jsonReader$Token3;
        JsonReader$Token jsonReader$Token4 = new JsonReader$Token("END_OBJECT", 3);
        END_OBJECT = jsonReader$Token4;
        JsonReader$Token jsonReader$Token5 = new JsonReader$Token("NAME", 4);
        NAME = jsonReader$Token5;
        JsonReader$Token jsonReader$Token6 = new JsonReader$Token("STRING", 5);
        STRING = jsonReader$Token6;
        JsonReader$Token jsonReader$Token7 = new JsonReader$Token("NUMBER", 6);
        NUMBER = jsonReader$Token7;
        JsonReader$Token jsonReader$Token8 = new JsonReader$Token("LONG", 7);
        LONG = jsonReader$Token8;
        JsonReader$Token jsonReader$Token9 = new JsonReader$Token("BOOLEAN", 8);
        BOOLEAN = jsonReader$Token9;
        JsonReader$Token jsonReader$Token10 = new JsonReader$Token("NULL", 9);
        NULL = jsonReader$Token10;
        JsonReader$Token jsonReader$Token11 = new JsonReader$Token("END_DOCUMENT", 10);
        END_DOCUMENT = jsonReader$Token11;
        JsonReader$Token jsonReader$Token12 = new JsonReader$Token("ANY", 11);
        ANY = jsonReader$Token12;
        $VALUES = new JsonReader$Token[]{jsonReader$Token, jsonReader$Token2, jsonReader$Token3, jsonReader$Token4, jsonReader$Token5, jsonReader$Token6, jsonReader$Token7, jsonReader$Token8, jsonReader$Token9, jsonReader$Token10, jsonReader$Token11, jsonReader$Token12};
    }

    public static JsonReader$Token valueOf(String str) {
        return (JsonReader$Token) Enum.valueOf(JsonReader$Token.class, str);
    }

    public static JsonReader$Token[] values() {
        return (JsonReader$Token[]) $VALUES.clone();
    }
}
