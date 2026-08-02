package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* loaded from: classes8.dex */
public interface Ua extends Pa, Tc {
    void a(@Nullable Activity activity);

    /* synthetic */ void a(@Nullable Location location);

    void a(@NonNull AnrListener anrListener);

    void a(@NonNull ExternalAttribution externalAttribution);

    void a(@NonNull Ro ro);

    void a(@NonNull EnumC5025n enumC5025n);

    /* synthetic */ void a(@NonNull String str);

    /* synthetic */ void a(String str, String str2);

    void a(@NonNull String str, boolean z);

    /* synthetic */ void a(boolean z);

    /* synthetic */ void a(boolean z, boolean z2);

    void b(@Nullable Activity activity);

    @Override // io.appmetrica.analytics.impl.Pa
    /* synthetic */ void b(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Pa
    /* synthetic */ void b(@NonNull String str, @Nullable String str2);

    @Override // io.appmetrica.analytics.impl.Pa
    /* synthetic */ boolean b();

    void c();

    void c(@NonNull String str);

    List<String> f();
}
