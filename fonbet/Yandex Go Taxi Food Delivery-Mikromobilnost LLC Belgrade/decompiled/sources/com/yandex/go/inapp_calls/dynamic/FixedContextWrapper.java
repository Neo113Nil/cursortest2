package com.yandex.go.inapp_calls.dynamic;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/inapp_calls/dynamic/FixedContextWrapper;", "Landroid/content/ContextWrapper;", "base", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createPackageContext", "packageName", "", "flags", "", "dynamic"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FixedContextWrapper extends ContextWrapper {
    public FixedContextWrapper(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context createPackageContext(String packageName, int flags) {
        return this;
    }
}
