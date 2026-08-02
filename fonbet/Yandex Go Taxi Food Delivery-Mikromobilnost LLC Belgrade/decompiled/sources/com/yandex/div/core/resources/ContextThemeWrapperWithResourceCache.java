package com.yandex.div.core.resources;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.view.ContextThemeWrapper;
import defpackage.i3y;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/resources/ContextThemeWrapperWithResourceCache;", "Landroidx/appcompat/view/ContextThemeWrapper;", "Landroid/content/Context;", "baseContext", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "resourceCache$delegate", "Li3y;", "getResourceCache", "resourceCache", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextThemeWrapperWithResourceCache extends ContextThemeWrapper {

    /* renamed from: resourceCache$delegate, reason: from kotlin metadata */
    private final i3y resourceCache;

    public ContextThemeWrapperWithResourceCache(Context context, int i) {
        super(context, i);
        this.resourceCache = a.a(new sls() { // from class: com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache$resourceCache$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Resources resources;
                resources = super/*androidx.appcompat.view.ContextThemeWrapper*/.getResources();
                return new PrimitiveResourceCache(resources);
            }
        });
    }

    private final Resources getResourceCache() {
        return (Resources) this.resourceCache.getValue();
    }

    @Override // androidx.appcompat.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return getResourceCache();
    }
}
