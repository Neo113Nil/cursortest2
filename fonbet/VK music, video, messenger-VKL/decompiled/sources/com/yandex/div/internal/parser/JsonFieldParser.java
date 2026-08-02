package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.List;
import kotlin.Lazy;
import org.json.JSONObject;
import xsna.ar;
import xsna.go9;
import xsna.izs;

/* loaded from: classes7.dex */
public class JsonFieldParser {
    private static final ValueValidator<String> IS_NOT_EMPTY = new ar(19);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(String str) {
        return !str.isEmpty();
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<V> field) {
        return readField(parsingContext, jSONObject, str, z, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<Expression<V>> field) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<V>> field, @NonNull Lazy<Deserializer<JSONObject, V>> lazy) {
        try {
            return new Field.Value(z, JsonPropertyParser.readList(parsingContext, jSONObject, str, lazy));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<List<V>> referenceOrFallback = referenceOrFallback(z, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<ExpressionList<V>> field, @NonNull izs<R, V> izsVar, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionListField(parsingContext, jSONObject, str, typeHelper, z, field, izsVar, listValidator, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<V> field) {
        return readOptionalField(parsingContext, jSONObject, str, z, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<Expression<V>> field) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<V>> field, @NonNull izs<R, V> izsVar, @NonNull ListValidator<V> listValidator) {
        return readOptionalListField(parsingContext, jSONObject, str, z, field, izsVar, listValidator, JsonParsers.alwaysValid());
    }

    @Nullable
    public static String readReference(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, go9.b("$", str), IS_NOT_EMPTY);
    }

    @Nullable
    public static <V> Field<V> referenceOrFallback(boolean z, @Nullable String str, @Nullable Field<V> field) {
        if (str != null) {
            return new Field.Reference(z, str);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        if (z) {
            return Field.Companion.nullField(z);
        }
        return null;
    }

    public static <V> void writeExpressionField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<Expression<V>> field) {
        writeExpressionField(parsingContext, jSONObject, str, field, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<ExpressionList<V>> field, @NonNull izs<V, R> izsVar) {
        if (field instanceof Field.Value) {
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, str, (ExpressionList) ((Field.Value) field).value, izsVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, go9.b("$", str), ((Field.Reference) field).reference);
        }
    }

    public static <V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<V> field) {
        writeField(parsingContext, jSONObject, str, field, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<List<V>> field, @NonNull izs<V, R> izsVar) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.writeList(parsingContext, jSONObject, str, (List) ((Field.Value) field).value, izsVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, go9.b("$", str), ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<V> field, @NonNull izs<R, V> izsVar) {
        return readField(parsingContext, jSONObject, str, z, field, izsVar, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<V> field, @NonNull izs<R, V> izsVar) {
        return readOptionalField(parsingContext, jSONObject, str, z, field, izsVar, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> void writeExpressionField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<Expression<V>> field, @NonNull izs<V, R> izsVar) {
        if (field instanceof Field.Value) {
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, str, (Expression) ((Field.Value) field).value, izsVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, go9.b("$", str), ((Field.Reference) field).reference);
        }
    }

    public static <R, V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<V> field, @NonNull izs<V, R> izsVar) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.write(parsingContext, jSONObject, str, ((Field.Value) field).value, (izs<T, R>) izsVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, go9.b("$", str), ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<V> field, @NonNull ValueValidator<V> valueValidator) {
        return readField(parsingContext, jSONObject, str, z, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<Expression<V>> field, @NonNull izs<R, V> izsVar) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z, field, izsVar, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<ExpressionList<V>> field, @NonNull izs<R, V> izsVar, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        ExpressionList readOptionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, izsVar, listValidator, valueValidator);
        if (readOptionalExpressionList != null) {
            return new Field.Value(z, readOptionalExpressionList);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.Companion.nullField(z);
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<V> field, @NonNull izs<R, V> izsVar, @NonNull ValueValidator<V> valueValidator) {
        Object readOptional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, izsVar, valueValidator);
        if (readOptional != null) {
            return new Field.Value(z, readOptional);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.Companion.nullField(z);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<Expression<V>> field, @NonNull izs<R, V> izsVar) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z, field, izsVar, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<V>> field, @NonNull izs<R, V> izsVar, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, izsVar, listValidator, valueValidator);
        if (readOptionalList != null) {
            return new Field.Value(z, readOptionalList);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.Companion.nullField(z);
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<V> field, @NonNull izs<R, V> izsVar, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z, JsonPropertyParser.read(parsingContext, jSONObject, str, izsVar, valueValidator));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<V> referenceOrFallback = referenceOrFallback(z, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<Expression<V>> field, @NonNull izs<R, V> izsVar, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z, JsonExpressionParser.readExpression(parsingContext, jSONObject, str, typeHelper, izsVar, valueValidator));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<Expression<V>> referenceOrFallback = referenceOrFallback(z, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<V>> field, @NonNull Lazy<Deserializer<JSONObject, V>> lazy, @NonNull ListValidator<V> listValidator) {
        try {
            return new Field.Value(z, JsonPropertyParser.readList(parsingContext, jSONObject, str, lazy, listValidator));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<List<V>> referenceOrFallback = referenceOrFallback(z, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z, @Nullable Field<Expression<V>> field, @NonNull izs<R, V> izsVar, @NonNull ValueValidator<V> valueValidator) {
        Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, izsVar, valueValidator, null);
        if (readOptionalExpression != null) {
            return new Field.Value(z, readOptionalExpression);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.Companion.nullField(z);
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<V> field, @NonNull Lazy<Deserializer<JSONObject, V>> lazy) {
        Object readOptional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, lazy);
        if (readOptional != null) {
            return new Field.Value(z, readOptional);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.Companion.nullField(z);
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<V>> field, @NonNull Lazy<Deserializer<JSONObject, V>> lazy) {
        List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, lazy);
        if (readOptionalList != null) {
            return new Field.Value(z, readOptionalList);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.Companion.nullField(z);
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<V> field, @NonNull Lazy<Deserializer<JSONObject, V>> lazy) {
        try {
            return new Field.Value(z, JsonPropertyParser.read(parsingContext, jSONObject, str, lazy));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<V> referenceOrFallback = referenceOrFallback(z, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    public static <V> void writeListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<List<V>> field, @NonNull Lazy<Serializer<JSONObject, V>> lazy) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.writeList(parsingContext, jSONObject, str, (List) ((Field.Value) field).value, lazy);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, go9.b("$", str), ((Field.Reference) field).reference);
        }
    }

    public static <V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<V> field, @NonNull Lazy<Serializer<JSONObject, V>> lazy) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.write(parsingContext, jSONObject, str, ((Field.Value) field).value, (Lazy<Serializer<JSONObject, T>>) lazy);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, go9.b("$", str), ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<V>> field, @NonNull Lazy<Deserializer<JSONObject, V>> lazy, @NonNull ListValidator<V> listValidator) {
        List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, lazy, listValidator);
        if (readOptionalList != null) {
            return new Field.Value(z, readOptionalList);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.Companion.nullField(z);
    }
}
