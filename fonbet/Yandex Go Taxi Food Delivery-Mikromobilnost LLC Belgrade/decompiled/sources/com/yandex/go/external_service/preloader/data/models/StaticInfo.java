package com.yandex.go.external_service.preloader.data.models;

import defpackage.c3u0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/external_service/preloader/data/models/StaticInfo;", "", "Companion", "com/yandex/go/external_service/preloader/data/models/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StaticInfo {
    public static final b Companion = new b();
    public static final i3y[] c;
    public static final StaticInfo d;
    public final Set a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new c3u0(5)), kotlin.a.b(lazyThreadSafetyMode, new c3u0(6))};
        d = new StaticInfo(EmptySet.a, kotlin.collections.b.f());
    }

    public /* synthetic */ StaticInfo(int i, Set set, Map map) {
        this.a = (i & 1) == 0 ? EmptySet.a : set;
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
        if (!(obj instanceof StaticInfo)) {
            return false;
        }
        StaticInfo staticInfo = (StaticInfo) obj;
        return jl40.l(this.a, staticInfo.a) && jl40.l(this.b, staticInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StaticInfo(urls=" + this.a + ", keys=" + this.b + Extension.C_BRAKE;
    }

    public StaticInfo() {
        this(0);
    }

    public StaticInfo(Set set, Map map) {
        this.a = set;
        this.b = map;
    }

    public /* synthetic */ StaticInfo(int i) {
        this(EmptySet.a, kotlin.collections.b.f());
    }
}
