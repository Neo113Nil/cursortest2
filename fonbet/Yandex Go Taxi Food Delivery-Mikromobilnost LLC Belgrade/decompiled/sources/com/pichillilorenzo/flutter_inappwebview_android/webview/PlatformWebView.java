package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.view.View;
import defpackage.qwc0;
import java.util.HashMap;

/* loaded from: classes11.dex */
public interface PlatformWebView extends qwc0 {
    @Override // defpackage.qwc0
    /* synthetic */ void dispose();

    @Override // defpackage.qwc0
    /* synthetic */ View getView();

    void makeInitialLoad(HashMap<String, Object> hashMap);

    @Override // defpackage.qwc0
    /* bridge */ /* synthetic */ default void onFlutterViewAttached(View view) {
    }

    @Override // defpackage.qwc0
    /* bridge */ /* synthetic */ default void onFlutterViewDetached() {
    }

    @Override // defpackage.qwc0
    /* bridge */ /* synthetic */ default void onInputConnectionLocked() {
    }

    @Override // defpackage.qwc0
    /* bridge */ /* synthetic */ default void onInputConnectionUnlocked() {
    }
}
