package com.bumptech.glide;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ RequestManager a;

    public a(RequestManager requestManager) {
        this.a = requestManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RequestManager requestManager = this.a;
        requestManager.lifecycle.a(requestManager);
    }
}
