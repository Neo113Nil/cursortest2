package com.yandex.div.storage;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import java.util.Set;
import xsna.epx;
import xsna.izs;
import xsna.ms9;

/* compiled from: DivStorage.kt */
/* loaded from: classes7.dex */
public interface DivStorage {

    /* compiled from: DivStorage.kt */
    public static class LoadDataResult<T> {
        private final List<StorageException> errors;
        private final List<T> restoredData;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadDataResult(List<? extends T> list, List<? extends StorageException> list2) {
            this.restoredData = list;
            this.errors = list2;
        }

        public final List<T> component1() {
            return getRestoredData();
        }

        public final List<StorageException> component2() {
            return getErrors();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadDataResult)) {
                return false;
            }
            LoadDataResult loadDataResult = (LoadDataResult) obj;
            return epx.f(getRestoredData(), loadDataResult.getRestoredData()) && epx.f(getErrors(), loadDataResult.getErrors());
        }

        public List<StorageException> getErrors() {
            return this.errors;
        }

        public List<T> getRestoredData() {
            return this.restoredData;
        }

        public int hashCode() {
            return getErrors().hashCode() + (getRestoredData().hashCode() * 31);
        }

        public String toString() {
            return "LoadDataResult(restoredData=" + getRestoredData() + ", errors=" + getErrors() + ')';
        }
    }

    /* compiled from: DivStorage.kt */
    public static final class RemoveResult {
        private final List<StorageException> errors;
        private final Set<String> ids;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoveResult(Set<String> set, List<? extends StorageException> list) {
            this.ids = set;
            this.errors = list;
        }

        public final Set<String> component1() {
            return this.ids;
        }

        public final List<StorageException> component2() {
            return this.errors;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveResult)) {
                return false;
            }
            RemoveResult removeResult = (RemoveResult) obj;
            return epx.f(this.ids, removeResult.ids) && epx.f(this.errors, removeResult.errors);
        }

        public int hashCode() {
            return this.errors.hashCode() + (this.ids.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RemoveResult(ids=");
            sb.append(this.ids);
            sb.append(", errors=");
            return ms9.a(')', sb, this.errors);
        }
    }

    LoadDataResult<RawJson> readRawJsons(Set<String> set);

    RemoveResult removeRawJsons(izs<? super RawJson, Boolean> izsVar);

    ExecutionResult saveRawJsons(List<? extends RawJson> list, DivDataRepository.ActionOnError actionOnError);
}
