package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.fxy0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "T", "", "light", "dark", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lfxy0;", "toEntity", "()Lfxy0;", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getLight", "getDark", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ThemedParameter<T> {

    @Json(name = "dark")
    private final T dark;

    @Json(name = "light")
    private final T light;

    public ThemedParameter(T t, T t2) {
        this.light = t;
        this.dark = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemedParameter copy$default(ThemedParameter themedParameter, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = themedParameter.light;
        }
        if ((i & 2) != 0) {
            obj2 = themedParameter.dark;
        }
        return themedParameter.copy(obj, obj2);
    }

    public final T component1() {
        return this.light;
    }

    public final T component2() {
        return this.dark;
    }

    public final ThemedParameter<T> copy(T light, T dark) {
        return new ThemedParameter<>(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemedParameter)) {
            return false;
        }
        ThemedParameter themedParameter = (ThemedParameter) other;
        return jl40.l(this.light, themedParameter.light) && jl40.l(this.dark, themedParameter.dark);
    }

    public final T getDark() {
        return this.dark;
    }

    public final T getLight() {
        return this.light;
    }

    public int hashCode() {
        T t = this.light;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.dark;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public final fxy0 toEntity() {
        return new fxy0(this.dark, this.light);
    }

    public String toString() {
        return "ThemedParameter(light=" + this.light + ", dark=" + this.dark + Extension.C_BRAKE;
    }
}
