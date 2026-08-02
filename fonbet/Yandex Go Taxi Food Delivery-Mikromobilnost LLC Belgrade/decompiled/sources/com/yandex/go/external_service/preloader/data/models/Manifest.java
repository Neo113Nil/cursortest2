package com.yandex.go.external_service.preloader.data.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.t5z;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/external_service/preloader/data/models/Manifest;", "", "Companion", "$serializer", "com/yandex/go/external_service/preloader/data/models/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Manifest {
    public static final a Companion = new a();
    public static final i3y[] c;
    public final List a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new t5z(11)), kotlin.a.b(lazyThreadSafetyMode, new t5z(12))};
    }

    public /* synthetic */ Manifest(int i, List list, Map map) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Manifest)) {
            return false;
        }
        Manifest manifest = (Manifest) obj;
        return jl40.l(this.a, manifest.a) && jl40.l(this.b, manifest.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Manifest(rawUrls=" + this.a + ", urlToFileMap=" + this.b + Extension.C_BRAKE;
    }

    public Manifest() {
        Map f = kotlin.collections.b.f();
        this.a = EmptyList.a;
        this.b = f;
    }
}
