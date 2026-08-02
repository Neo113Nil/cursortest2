package defpackage;

import com.yandex.div.storage.RawJsonRepositoryException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Li9i0;", "", "", "", "ids", "", "Lcom/yandex/div/storage/RawJsonRepositoryException;", "errors", "<init>", "(Ljava/util/Set;Ljava/util/List;)V", "a", "()Ljava/util/Set;", "b", "()Ljava/util/List;", "c", "(Ljava/util/Set;Ljava/util/List;)Li9i0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "f", "Ljava/util/List;", "e", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class i9i0 {

    /* renamed from: a, reason: from kotlin metadata */
    private final Set<String> ids;

    /* renamed from: b, reason: from kotlin metadata */
    private final List<RawJsonRepositoryException> errors;

    public i9i0(Set<String> set, List<RawJsonRepositoryException> list) {
        this.ids = set;
        this.errors = list;
    }

    public static i9i0 d(i9i0 i9i0Var, Set set, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            set = i9i0Var.ids;
        }
        if ((i & 2) != 0) {
            list = i9i0Var.errors;
        }
        i9i0Var.getClass();
        return new i9i0(set, list);
    }

    public final Set<String> a() {
        return this.ids;
    }

    public final List<RawJsonRepositoryException> b() {
        return this.errors;
    }

    public final i9i0 c(Set<String> ids, List<RawJsonRepositoryException> errors) {
        return new i9i0(ids, errors);
    }

    public final List<RawJsonRepositoryException> e() {
        return this.errors;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i9i0)) {
            return false;
        }
        i9i0 i9i0Var = (i9i0) other;
        return jl40.l(this.ids, i9i0Var.ids) && jl40.l(this.errors, i9i0Var.errors);
    }

    public final Set<String> f() {
        return this.ids;
    }

    public final int hashCode() {
        return this.errors.hashCode() + (this.ids.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawJsonRepositoryRemoveResult(ids=");
        sb.append(this.ids);
        sb.append(", errors=");
        return unr0.t(sb, this.errors, ')');
    }
}
