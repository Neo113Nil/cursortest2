package com.yandex.div.storage;

import defpackage.g9i0;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\u001cB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ0\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lcom/yandex/div/storage/f;", "", "", "Lg9i0;", "resultData", "Lcom/yandex/div/storage/RawJsonRepositoryException;", "errors", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", Constants.KEY_DATA, "b", "(Ljava/util/Collection;)Lcom/yandex/div/storage/f;", "c", "()Ljava/util/List;", "d", "e", "(Ljava/util/List;Ljava/util/List;)Lcom/yandex/div/storage/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "h", "g", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class f {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final f d;

    /* renamed from: a, reason: from kotlin metadata */
    private final List<g9i0> resultData;

    /* renamed from: b, reason: from kotlin metadata */
    private final List<RawJsonRepositoryException> errors;

    static {
        EmptyList emptyList = EmptyList.a;
        d = new f(emptyList, emptyList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends g9i0> list, List<RawJsonRepositoryException> list2) {
        this.resultData = list;
        this.errors = list2;
    }

    public static f f(f fVar, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fVar.resultData;
        }
        if ((i & 2) != 0) {
            list2 = fVar.errors;
        }
        fVar.getClass();
        return new f(list, list2);
    }

    public final f b(Collection<? extends g9i0> data) {
        return f(this, kotlin.collections.a.m0(data, this.resultData), null, 2, null);
    }

    public final List<g9i0> c() {
        return this.resultData;
    }

    public final List<RawJsonRepositoryException> d() {
        return this.errors;
    }

    public final f e(List<? extends g9i0> resultData, List<RawJsonRepositoryException> errors) {
        return new f(resultData, errors);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return jl40.l(this.resultData, fVar.resultData) && jl40.l(this.errors, fVar.errors);
    }

    public final List<RawJsonRepositoryException> g() {
        return this.errors;
    }

    public final List<g9i0> h() {
        return this.resultData;
    }

    public final int hashCode() {
        return this.errors.hashCode() + (this.resultData.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawJsonRepositoryResult(resultData=");
        sb.append(this.resultData);
        sb.append(", errors=");
        return unr0.t(sb, this.errors, ')');
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/storage/f$a;", "", "<init>", "()V", "Lcom/yandex/div/storage/f;", "EMPTY", "Lcom/yandex/div/storage/f;", "a", "()Lcom/yandex/div/storage/f;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.div.storage.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final f a() {
            return f.d;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
