package ru.ok.android.api.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.VectorApiWriterKt;
import ru.ok.android.api.json.JsonWriter;
import xsna.e43;
import xsna.zcl;

/* compiled from: VectorApiParam.kt */
/* loaded from: classes9.dex */
public final class VectorApiParam extends RefApiParam<Collection<? extends String>> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: VectorApiParam.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final List<String> vectorFromEachName(Collection<? extends Enum<?>> collection) {
            int size = collection.size();
            if (size == 0) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList(size);
            Iterator<? extends Enum<?>> it = collection.iterator();
            while (it.hasNext()) {
                Enum<?> next = it.next();
                arrayList.add(next != null ? next.name() : null);
            }
            return arrayList;
        }

        public final List<String> vectorFromEachToString(Collection<? extends Object> collection) {
            int size = collection.size();
            if (size == 0) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList(size);
            Iterator<? extends Object> it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                arrayList.add(next != null ? next.toString() : null);
            }
            return arrayList;
        }

        public final List<String> vectorFromLongs(long... jArr) {
            int length = jArr.length;
            if (length == 0) {
                return EmptyList.b;
            }
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = Long.toString(jArr[i]);
            }
            return Arrays.asList(Arrays.copyOf(strArr, length));
        }

        public final List<String> vectorFromNames(Enum<?>... enumArr) {
            int length = enumArr.length;
            if (length == 0) {
                return EmptyList.b;
            }
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                Enum<?> r3 = enumArr[i];
                strArr[i] = r3 != null ? r3.name() : null;
            }
            return Arrays.asList(Arrays.copyOf(strArr, length));
        }

        public final List<String> vectorFromToStrings(Object... objArr) {
            int length = objArr.length;
            if (length == 0) {
                return EmptyList.b;
            }
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = String.valueOf(objArr[i]);
            }
            return e43.l(Arrays.copyOf(strArr, length));
        }

        private Companion() {
        }
    }

    public VectorApiParam(String str, Collection<String> collection) {
        super(str, collection);
    }

    public static final List<String> vectorFromEachName(Collection<? extends Enum<?>> collection) {
        return Companion.vectorFromEachName(collection);
    }

    public static final List<String> vectorFromEachToString(Collection<? extends Object> collection) {
        return Companion.vectorFromEachToString(collection);
    }

    public static final List<String> vectorFromLongs(long... jArr) {
        return Companion.vectorFromLongs(jArr);
    }

    public static final List<String> vectorFromNames(Enum<?>... enumArr) {
        return Companion.vectorFromNames(enumArr);
    }

    public static final List<String> vectorFromToStrings(Object... objArr) {
        return Companion.vectorFromToStrings(objArr);
    }

    @Override // ru.ok.android.api.common.RefApiParam
    public boolean shouldSkip() {
        Collection<? extends String> value = getValue();
        return value == null || value.isEmpty();
    }

    @Override // ru.ok.android.api.common.RefApiParam
    public void writeValue(JsonWriter jsonWriter) throws IOException {
        Collection<? extends String> value = getValue();
        if (value == null) {
            value = EmptyList.b;
        }
        VectorApiWriterKt.vectorValue(jsonWriter, value);
    }

    public VectorApiParam(String str, String... strArr) {
        this(str, e43.l(Arrays.copyOf(strArr, strArr.length)));
    }
}
