package com.ybsdk.core.presentation;

import android.content.Context;
import android.view.ContextThemeWrapper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/core/presentation/AppCompatContextThemeWrapper;", "Landroid/view/ContextThemeWrapper;", "baseContext", "Landroid/content/Context;", "res", "", "<init>", "(Landroid/content/Context;I)V", "core-presentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppCompatContextThemeWrapper extends ContextThemeWrapper {
    public AppCompatContextThemeWrapper(Context context, int i) {
        super(new AppCompatContextWrapper(context), i);
    }
}
