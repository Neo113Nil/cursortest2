package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/Themes;", "T", "", "light", "dark", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getLight", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDark", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/ybsdk/core/common/data/network/dto/Themes;", "equals", "", "other", "hashCode", "", "toString", "", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Themes<T> {
    private final T dark;
    private final T light;

    public Themes(@Json(name = "light") T t, @Json(name = "dark") T t2) {
        this.light = t;
        this.dark = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Themes copy$default(Themes themes, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = themes.light;
        }
        if ((i & 2) != 0) {
            obj2 = themes.dark;
        }
        return themes.copy(obj, obj2);
    }

    public final T component1() {
        return this.light;
    }

    public final T component2() {
        return this.dark;
    }

    public final Themes<T> copy(@Json(name = "light") T light, @Json(name = "dark") T dark) {
        return new Themes<>(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Themes)) {
            return false;
        }
        Themes themes = (Themes) other;
        return jl40.l(this.light, themes.light) && jl40.l(this.dark, themes.dark);
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

    public String toString() {
        return "Themes(light=" + this.light + ", dark=" + this.dark + Extension.C_BRAKE;
    }
}
