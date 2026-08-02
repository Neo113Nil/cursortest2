package com.yandex.mapkit.maps.core.utils.genericssupport;

import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yandex/mapkit/maps/core/utils/genericssupport/ArrayWrapper;", "T", "", "value", "", "<init>", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ArrayWrapper<T> {
    private final List<T> value;

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayWrapper(List<? extends T> list) {
        this.value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayWrapper copy$default(ArrayWrapper arrayWrapper, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = arrayWrapper.value;
        }
        return arrayWrapper.copy(list);
    }

    public final List<T> component1() {
        return this.value;
    }

    public final ArrayWrapper<T> copy(List<? extends T> value) {
        return new ArrayWrapper<>(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ArrayWrapper) && jl40.l(this.value, ((ArrayWrapper) other).value);
    }

    public final List<T> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return tse0.k("ArrayWrapper(value=", Extension.C_BRAKE, this.value);
    }
}
