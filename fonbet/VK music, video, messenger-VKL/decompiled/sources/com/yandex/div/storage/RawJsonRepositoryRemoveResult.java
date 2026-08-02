package com.yandex.div.storage;

import java.util.List;
import java.util.Set;
import xsna.epx;
import xsna.ms9;

/* compiled from: RawJsonRepositoryResult.kt */
/* loaded from: classes7.dex */
public final class RawJsonRepositoryRemoveResult {
    private final List<RawJsonRepositoryException> errors;
    private final Set<String> ids;

    public RawJsonRepositoryRemoveResult(Set<String> set, List<RawJsonRepositoryException> list) {
        this.ids = set;
        this.errors = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryRemoveResult)) {
            return false;
        }
        RawJsonRepositoryRemoveResult rawJsonRepositoryRemoveResult = (RawJsonRepositoryRemoveResult) obj;
        return epx.f(this.ids, rawJsonRepositoryRemoveResult.ids) && epx.f(this.errors, rawJsonRepositoryRemoveResult.errors);
    }

    public int hashCode() {
        return this.errors.hashCode() + (this.ids.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RawJsonRepositoryRemoveResult(ids=");
        sb.append(this.ids);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }
}
