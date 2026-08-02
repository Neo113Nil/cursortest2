package xsna;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes.dex */
public final class oby implements np70, ujr0 {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map<Class<?>, mp70<?>> c;
    public final Map<Class<?>, tjr0<?>> d;
    public final mp70<Object> e;
    public final boolean f;

    public oby(@NonNull Writer writer, @NonNull Map<Class<?>, mp70<?>> map, @NonNull Map<Class<?>, tjr0<?>> map2, mp70<Object> mp70Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = mp70Var;
        this.f = z;
    }

    @NonNull
    public final oby a(@Nullable Object obj) throws IOException {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        b(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            mp70<?> mp70Var = this.c.get(obj.getClass());
            if (mp70Var != null) {
                jsonWriter.beginObject();
                mp70Var.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            tjr0<?> tjr0Var = this.d.get(obj.getClass());
            if (tjr0Var != null) {
                tjr0Var.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof un70) {
                int number = ((un70) obj).getNumber();
                c();
                jsonWriter.value(number);
                return this;
            }
            String name = ((Enum) obj).name();
            c();
            jsonWriter.value(name);
            return this;
        }
        if (obj instanceof byte[]) {
            c();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                c();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                a(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                a(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, double d) throws IOException {
        String str = f7rVar.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(d);
        return this;
    }

    @NonNull
    public final oby b(@Nullable Object obj, @NonNull String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            c();
            jsonWriter.name(str);
            a(obj);
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        a(obj);
        return this;
    }

    public final void c() throws IOException {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, int i) throws IOException {
        String str = f7rVar.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i);
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, long j) throws IOException {
        String str = f7rVar.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j);
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, @Nullable Object obj) throws IOException {
        b(obj, f7rVar.a);
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, boolean z) throws IOException {
        String str = f7rVar.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(z);
        return this;
    }

    @Override // xsna.ujr0
    @NonNull
    public final ujr0 add(@Nullable String str) throws IOException {
        c();
        this.b.value(str);
        return this;
    }

    @Override // xsna.ujr0
    @NonNull
    public final ujr0 add(boolean z) throws IOException {
        c();
        this.b.value(z);
        return this;
    }
}
