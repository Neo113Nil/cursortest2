package com.yandex.passport.internal.network.requester;

import java.util.concurrent.Callable;

/* loaded from: classes15.dex */
public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoadingClient b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(ImageLoadingClient imageLoadingClient, String str, int i) {
        this.a = i;
        this.b = imageLoadingClient;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.c;
        ImageLoadingClient imageLoadingClient = this.b;
        switch (i) {
            case 0:
                return ImageLoadingClient.b(imageLoadingClient, str);
            default:
                return ImageLoadingClient.a(imageLoadingClient, str);
        }
    }
}
