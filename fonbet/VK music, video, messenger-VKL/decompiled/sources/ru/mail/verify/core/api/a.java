package ru.mail.verify.core.api;

import android.content.Context;
import androidx.annotation.NonNull;
import ru.mail.libverify.n0.a;
import ru.mail.verify.core.api.ApplicationModule;

/* loaded from: classes9.dex */
final class a implements ru.mail.libverify.g0.a {

    @NonNull
    private final Context a;

    @NonNull
    private final ApplicationModule.NetworkPolicyConfig b;

    public a(@NonNull Context context, @NonNull ApplicationModule.NetworkPolicyConfig networkPolicyConfig) {
        this.a = context;
        this.b = networkPolicyConfig;
    }

    @Override // ru.mail.libverify.g0.a
    @NonNull
    public final a.C2209a a() {
        return ru.mail.libverify.n0.a.a(this.a, this.b.getBackgroundAwakeMode() == ru.mail.libverify.g0.n.DISABLED);
    }
}
