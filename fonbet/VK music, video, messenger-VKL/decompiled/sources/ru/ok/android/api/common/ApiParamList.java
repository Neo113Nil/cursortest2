package ru.ok.android.api.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Pair;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import xsna.g5g;
import xsna.jw5;

/* compiled from: ApiParamList.kt */
/* loaded from: classes9.dex */
public final class ApiParamList {
    private boolean canRepeat;
    private final ArrayList<ApiParam> params;
    private boolean shouldPost;
    private boolean willWrite;
    private boolean willWriteSupplied;

    public ApiParamList() {
        this.params = new ArrayList<>();
        this.canRepeat = true;
    }

    public static /* synthetic */ void write$odnoklassniki_android_api_release$default(ApiParamList apiParamList, JsonWriter jsonWriter, String str, String str2, int i, Object obj) throws IOException, JsonSerializeException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        apiParamList.write$odnoklassniki_android_api_release(jsonWriter, str, str2);
    }

    public final ApiParamList add(String str, String str2) {
        return add(new StringApiParam(str, str2));
    }

    public final ApiParamList addVector(String str, String... strArr) {
        return add(new VectorApiParam(str, (String[]) Arrays.copyOf(strArr, strArr.length)));
    }

    public final boolean canRepeat$odnoklassniki_android_api_release() {
        return this.canRepeat;
    }

    public final void plusAssign(ApiParam apiParam) {
        add(apiParam);
    }

    public final boolean shouldPost$odnoklassniki_android_api_release() {
        return this.shouldPost;
    }

    public final boolean willWrite$odnoklassniki_android_api_release() {
        return this.willWrite;
    }

    public final boolean willWriteSupplied$odnoklassniki_android_api_release() {
        return this.willWriteSupplied;
    }

    public final void write$odnoklassniki_android_api_release(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        if (this.willWrite) {
            ArrayList<ApiParam> arrayList = this.params;
            if (arrayList.size() > 1) {
                g5g.L(arrayList, new Comparator() { // from class: ru.ok.android.api.common.ApiParamList$write$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return jw5.b(((ApiParam) t).getName(), ((ApiParam) t2).getName());
                    }
                });
            }
            Iterator<ApiParam> it = arrayList.iterator();
            while (it.hasNext()) {
                ApiParam next = it.next();
                if (!next.isSupplied()) {
                    next.write(jsonWriter);
                }
            }
        }
    }

    public final void writeSupplied$odnoklassniki_android_api_release(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        if (this.willWriteSupplied) {
            Iterator<ApiParam> it = this.params.iterator();
            while (it.hasNext()) {
                ApiParam next = it.next();
                if (next.isSupplied()) {
                    next.write(jsonWriter);
                }
            }
        }
    }

    public final ApiParamList add(String str, int i) {
        return add(new IntegralApiParam(str, i));
    }

    public final ApiParamList addVector(String str, Collection<String> collection) {
        return add(new VectorApiParam(str, collection));
    }

    public final void plusAssign(Pair<String, String> pair) {
        add(new StringApiParam(pair.i(), pair.j()));
    }

    public final ApiParamList add(String str, long j) {
        return add(new IntegralApiParam(str, j));
    }

    public ApiParamList(ApiParamList apiParamList) {
        this();
        Iterator<T> it = apiParamList.params.iterator();
        while (it.hasNext()) {
            add((ApiParam) it.next());
        }
    }

    public final ApiParamList add(String str, float f) {
        return add(new FloatingApiParam(str, f));
    }

    public final ApiParamList add(String str, double d) {
        return add(new FloatingApiParam(str, d));
    }

    public final ApiParamList add(String str, boolean z) {
        return add(new BooleanApiParam(str, z));
    }

    public final ApiParamList add(String str, BoxedApiValue boxedApiValue) {
        return add(boxedApiValue.intoParam(str));
    }

    public final void write$odnoklassniki_android_api_release(JsonWriter jsonWriter, String str, String str2) throws IOException, JsonSerializeException {
        if (this.willWrite) {
            ArrayList<ApiParam> arrayList = this.params;
            if (arrayList.size() > 1) {
                g5g.L(arrayList, new Comparator() { // from class: ru.ok.android.api.common.ApiParamList$write$$inlined$sortBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return jw5.b(((ApiParam) t).getName(), ((ApiParam) t2).getName());
                    }
                });
            }
            Iterator<ApiParam> it = arrayList.iterator();
            while (it.hasNext()) {
                ApiParam next = it.next();
                if (str == null || str.compareTo(next.getName()) <= 0) {
                    if (str2 != null && str2.compareTo(next.getName()) <= 0) {
                        return;
                    }
                    if (!next.isSupplied()) {
                        next.write(jsonWriter);
                    }
                }
            }
        }
    }

    public final ApiParamList add(BoxedApiName boxedApiName, String str) {
        return add(boxedApiName.intoParam(str));
    }

    public final ApiParamList add(ApiParam apiParam) {
        this.params.add(apiParam);
        this.canRepeat &= apiParam.canRepeat();
        this.shouldPost |= apiParam.shouldPost();
        this.willWrite |= !apiParam.isSupplied();
        this.willWriteSupplied = apiParam.isSupplied() | this.willWriteSupplied;
        return this;
    }
}
