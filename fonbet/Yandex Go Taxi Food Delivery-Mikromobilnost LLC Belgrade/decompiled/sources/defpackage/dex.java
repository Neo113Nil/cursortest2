package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class dex extends JsonAdapter {
    public final /* synthetic */ int a = 1;
    public final JsonAdapter b;
    public final Object c;

    public dex(JsonAdapter jsonAdapter) {
        trp0 trp0Var = trp0.a;
        this.b = jsonAdapter;
        this.c = trp0Var;
    }

    public void a(Throwable th, JsonReader jsonReader) {
        trp0 trp0Var = (trp0) this.c;
        String str = null;
        if (!(th instanceof JsonDataException) && !(th instanceof IOException)) {
            if (trp0Var != null) {
                trp0.e(new jqp0(th, "Failed to read json element in list", null, null));
                return;
            }
            return;
        }
        if (trp0Var != null) {
            String str2 = "failed to parse part of response: " + this.b;
            if (jsonReader != null) {
                try {
                    str = "path: " + jsonReader.peekJson().getPath() + " - object: " + String.valueOf(jsonReader.readJsonValue());
                } catch (Throwable th2) {
                    trp0.e(new jqp0(th2, "Failed to read json element in list - failed to get errorString", null, null));
                }
            }
            trp0.e(new qqp0(str2, th, str));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(4:6|7|9|(1:11))|(2:19|17)|13|14|16|17|4) */
    @Override // com.squareup.moshi.JsonAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fromJson(JsonReader jsonReader) {
        Object obj;
        int i = this.a;
        JsonAdapter jsonAdapter = this.b;
        JsonReader jsonReader2 = null;
        switch (i) {
            case 0:
                jsonReader.getPath();
                try {
                    Object fromJsonValue = jsonAdapter.fromJsonValue(jsonReader.readJsonValue());
                    if (fromJsonValue == null) {
                        return null;
                    }
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        Field field = (Field) it.next();
                        try {
                            if (Modifier.isPrivate(field.getModifiers())) {
                                String name = field.getName();
                                obj = fromJsonValue.getClass().getMethod("get" + name.substring(0, 1).toUpperCase(Locale.US) + name.substring(1), null).invoke(fromJsonValue, null);
                            } else {
                                obj = field.get(fromJsonValue);
                            }
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                            z83.k("JsonRequired error", e);
                            obj = null;
                        }
                        if (obj == null) {
                            return null;
                        }
                    }
                    return fromJsonValue;
                } catch (JsonDataException unused) {
                    return null;
                }
            default:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        jsonReader2 = jsonReader.peekJson();
                        Object fromJsonValue2 = jsonAdapter.fromJsonValue(jsonReader.readJsonValue());
                        if (fromJsonValue2 != null) {
                            arrayList.add(fromJsonValue2);
                        }
                    } finally {
                        try {
                            jsonReader2.close();
                        } catch (Throwable th) {
                        }
                    }
                    if (jsonReader2 == null) {
                    }
                    jsonReader2.close();
                }
                jsonReader.endArray();
                return arrayList;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        switch (this.a) {
            case 0:
                this.b.toJson(jsonWriter, (JsonWriter) obj);
                return;
            default:
                throw new UnsupportedOperationException("SkipFailingElementsAdapter is only used to deserialize objects");
        }
    }

    public dex(JsonAdapter jsonAdapter, ArrayList arrayList) {
        this.b = jsonAdapter;
        this.c = arrayList;
    }
}
