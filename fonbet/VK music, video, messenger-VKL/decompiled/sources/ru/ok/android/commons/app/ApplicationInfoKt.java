package ru.ok.android.commons.app;

import android.content.pm.ApplicationInfo;

/* compiled from: ApplicationInfo.kt */
/* loaded from: classes9.dex */
public final class ApplicationInfoKt {
    public static final boolean isDebuggable(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 2) == 2;
    }
}
