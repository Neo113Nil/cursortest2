package com.airbnb.lottie.parser.moshi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class JsonReader$Token {
    private static final /* synthetic */ JsonReader$Token[] $VALUES;
    public static final JsonReader$Token BEGIN_ARRAY;
    public static final JsonReader$Token BEGIN_OBJECT;
    public static final JsonReader$Token BOOLEAN;
    public static final JsonReader$Token END_ARRAY;
    public static final JsonReader$Token END_DOCUMENT;
    public static final JsonReader$Token END_OBJECT;
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
        JsonReader$Token jsonReader$Token8 = new JsonReader$Token("BOOLEAN", 7);
        BOOLEAN = jsonReader$Token8;
        JsonReader$Token jsonReader$Token9 = new JsonReader$Token("NULL", 8);
        NULL = jsonReader$Token9;
        JsonReader$Token jsonReader$Token10 = new JsonReader$Token("END_DOCUMENT", 9);
        END_DOCUMENT = jsonReader$Token10;
        $VALUES = new JsonReader$Token[]{jsonReader$Token, jsonReader$Token2, jsonReader$Token3, jsonReader$Token4, jsonReader$Token5, jsonReader$Token6, jsonReader$Token7, jsonReader$Token8, jsonReader$Token9, jsonReader$Token10};
    }

    public static JsonReader$Token valueOf(String str) {
        return (JsonReader$Token) Enum.valueOf(JsonReader$Token.class, str);
    }

    public static JsonReader$Token[] values() {
        return (JsonReader$Token[]) $VALUES.clone();
    }
}
