package ru.mail.libverify.m;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes9.dex */
public final class a extends c<a, ru.mail.libverify.requests.a> {
    private Map<String, String> app_endpoints;
    private f fetcher_info;
    private String token;
    private int token_expiration_time;

    @Nullable
    public final Map<String, String> h() {
        return this.app_endpoints;
    }

    @Nullable
    public final f i() {
        return this.fetcher_info;
    }

    @Nullable
    public final String j() {
        return this.token;
    }

    public final int k() {
        return this.token_expiration_time;
    }
}
