package com.yandex.android.webview.view;

import android.view.MotionEvent;

/* loaded from: classes11.dex */
public final /* synthetic */ class a {
    public final /* synthetic */ int a;
    public final /* synthetic */ NestedScrollWebView b;

    public /* synthetic */ a(NestedScrollWebView nestedScrollWebView, int i) {
        this.a = i;
        this.b = nestedScrollWebView;
    }

    public boolean a(MotionEvent motionEvent) {
        boolean lambda$new$0;
        boolean lambda$new$1;
        int i = this.a;
        NestedScrollWebView nestedScrollWebView = this.b;
        switch (i) {
            case 0:
                lambda$new$0 = nestedScrollWebView.lambda$new$0(motionEvent);
                return lambda$new$0;
            default:
                lambda$new$1 = nestedScrollWebView.lambda$new$1(motionEvent);
                return lambda$new$1;
        }
    }
}
