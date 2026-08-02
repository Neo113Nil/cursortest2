package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.DeleteAllPersonalSuggestSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class DeleteAllPersonalSuggestSessionBinding implements DeleteAllPersonalSuggestSession {
    private final NativeObject nativeObject;

    public DeleteAllPersonalSuggestSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.DeleteAllPersonalSuggestSession
    public native void cancel();

    @Override // com.yandex.mapkit.search.DeleteAllPersonalSuggestSession
    public native void retry(DeleteAllPersonalSuggestSession.PersonalSuggestListener personalSuggestListener);
}
