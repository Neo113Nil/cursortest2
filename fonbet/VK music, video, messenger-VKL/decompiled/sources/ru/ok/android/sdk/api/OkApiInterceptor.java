package ru.ok.android.sdk.api;

/* compiled from: OkApiInterceptor.kt */
/* loaded from: classes9.dex */
public interface OkApiInterceptor {

    /* compiled from: OkApiInterceptor.kt */
    public interface Chain {
        OkApiResponse proceed(OkApiRequest okApiRequest);

        OkApiRequest request();
    }

    OkApiResponse intercept(Chain chain);
}
