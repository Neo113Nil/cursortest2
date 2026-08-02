package ru.mail.libverify.m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import ru.mail.libverify.api.common.Status;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public final class e extends c<e, ru.mail.libverify.requests.f> {

    @NonNull
    private final List<a> items;

    public static class a implements Gsonable {
        private f fetcher_info;
        private String key;
        private String message;
        private ru.mail.libverify.g.a server_info;
        private Status status;

        @Nullable
        public final String b() {
            return this.key;
        }

        @Nullable
        public final String c() {
            return this.message;
        }

        @Nullable
        public final ru.mail.libverify.g.a d() {
            return this.server_info;
        }

        @Nullable
        public final f a() {
            return this.fetcher_info;
        }
    }

    public e(@NonNull List<a> list) {
        this.items = list;
    }

    @Override // ru.mail.libverify.m.c
    @NonNull
    public final Status g() {
        Status status;
        for (a aVar : this.items) {
            if (aVar != null && (status = aVar.status) != Status.OK) {
                return status;
            }
        }
        return Status.OK;
    }

    @NonNull
    public final List<a> h() {
        return this.items;
    }
}
