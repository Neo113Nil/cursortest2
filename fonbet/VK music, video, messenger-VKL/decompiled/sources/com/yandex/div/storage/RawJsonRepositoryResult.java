package com.yandex.div.storage;

import com.yandex.div.storage.rawjson.RawJson;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;
import xsna.zcl;

/* compiled from: RawJsonRepositoryResult.kt */
/* loaded from: classes7.dex */
public final class RawJsonRepositoryResult {
    public static final Companion Companion = new Companion(null);
    private static final RawJsonRepositoryResult EMPTY;
    private final List<RawJsonRepositoryException> errors;
    private final List<RawJson> resultData;

    /* compiled from: RawJsonRepositoryResult.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final RawJsonRepositoryResult getEMPTY() {
            return RawJsonRepositoryResult.EMPTY;
        }

        private Companion() {
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        EMPTY = new RawJsonRepositoryResult(emptyList, emptyList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawJsonRepositoryResult(List<? extends RawJson> list, List<RawJsonRepositoryException> list2) {
        this.resultData = list;
        this.errors = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RawJsonRepositoryResult copy$default(RawJsonRepositoryResult rawJsonRepositoryResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rawJsonRepositoryResult.resultData;
        }
        if ((i & 2) != 0) {
            list2 = rawJsonRepositoryResult.errors;
        }
        return rawJsonRepositoryResult.copy(list, list2);
    }

    public final RawJsonRepositoryResult addData(Collection<? extends RawJson> collection) {
        return copy$default(this, j5g.u0(collection, this.resultData), null, 2, null);
    }

    public final RawJsonRepositoryResult copy(List<? extends RawJson> list, List<RawJsonRepositoryException> list2) {
        return new RawJsonRepositoryResult(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryResult)) {
            return false;
        }
        RawJsonRepositoryResult rawJsonRepositoryResult = (RawJsonRepositoryResult) obj;
        return epx.f(this.resultData, rawJsonRepositoryResult.resultData) && epx.f(this.errors, rawJsonRepositoryResult.errors);
    }

    public final List<RawJsonRepositoryException> getErrors() {
        return this.errors;
    }

    public final List<RawJson> getResultData() {
        return this.resultData;
    }

    public int hashCode() {
        return this.errors.hashCode() + (this.resultData.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RawJsonRepositoryResult(resultData=");
        sb.append(this.resultData);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }
}
