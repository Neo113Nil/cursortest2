package ru.ok.android.api.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes9.dex */
public @interface JsonToken {
    public static final int BEGIN_ARRAY = 91;
    public static final int BEGIN_OBJECT = 123;
    public static final int BOOLEAN = 98;
    public static final int END_ARRAY = 93;
    public static final int END_DOCUMENT = 0;
    public static final int END_OBJECT = 125;
    public static final int NAME = 39;
    public static final int NULL = 110;
    public static final int NUMBER = 49;
    public static final int STRING = 34;
}
