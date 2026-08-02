package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;
import xsna.ms9;

/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4944jm extends BaseRequestConfig.BaseRequestArguments {

    @Nullable
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final Map<String, String> c;
    public final boolean d;

    @Nullable
    public final List<String> e;

    public C4944jm(@NonNull T3 t3) {
        this(t3.a().c(), t3.a().d(), t3.a().a(), t3.a().h(), t3.a().b());
    }

    public final boolean a(@NonNull C4944jm c4944jm) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4944jm mergeFrom(@NonNull C4944jm c4944jm) {
        return new C4944jm((String) WrapUtils.getOrDefaultNullable(this.a, c4944jm.a), (String) WrapUtils.getOrDefaultNullable(this.b, c4944jm.b), (Map) WrapUtils.getOrDefaultNullable(this.c, c4944jm.c), this.d || c4944jm.d, c4944jm.d ? c4944jm.e : this.e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Arguments{distributionReferrer='");
        sb.append(this.a);
        sb.append("', installReferrerSource='");
        sb.append(this.b);
        sb.append("', clientClids=");
        sb.append(this.c);
        sb.append(", hasNewCustomHosts=");
        sb.append(this.d);
        sb.append(", newCustomHosts=");
        return ms9.a('}', sb, this.e);
    }

    public C4944jm(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, boolean z, @Nullable List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = list;
    }

    public C4944jm() {
        this(null, null, null, false, null);
    }
}
