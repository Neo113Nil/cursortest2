package com.yandex.div.storage;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import xsna.epx;
import xsna.izs;
import xsna.zcl;

/* compiled from: RawJsonRepository.kt */
/* loaded from: classes7.dex */
public interface RawJsonRepository {
    RawJsonRepositoryResult get(List<String> list);

    RawJsonRepositoryResult put(Payload payload);

    RawJsonRepositoryRemoveResult remove(izs<? super RawJson, Boolean> izsVar);

    /* compiled from: RawJsonRepository.kt */
    public static final class Payload {
        private final DivDataRepository.ActionOnError actionOnError;
        private final List<RawJson> jsons;

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(List<? extends RawJson> list, DivDataRepository.ActionOnError actionOnError) {
            this.jsons = list;
            this.actionOnError = actionOnError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return epx.f(this.jsons, payload.jsons) && this.actionOnError == payload.actionOnError;
        }

        public final DivDataRepository.ActionOnError getActionOnError() {
            return this.actionOnError;
        }

        public final List<RawJson> getJsons() {
            return this.jsons;
        }

        public int hashCode() {
            return this.actionOnError.hashCode() + (this.jsons.hashCode() * 31);
        }

        public String toString() {
            return "Payload(jsons=" + this.jsons + ", actionOnError=" + this.actionOnError + ')';
        }

        public /* synthetic */ Payload(List list, DivDataRepository.ActionOnError actionOnError, int i, zcl zclVar) {
            this(list, (i & 2) != 0 ? DivDataRepository.ActionOnError.ABORT_TRANSACTION : actionOnError);
        }
    }
}
