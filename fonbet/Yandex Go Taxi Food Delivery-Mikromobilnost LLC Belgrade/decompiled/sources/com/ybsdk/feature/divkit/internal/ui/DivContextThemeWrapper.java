package com.ybsdk.feature.divkit.internal.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.yandex.div.core.Div2Context;
import com.ybsdk.core.design.theme.ThemeType;
import defpackage.ivk;
import defpackage.n1i0;
import defpackage.pxk;
import defpackage.qx21;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/ui/DivContextThemeWrapper;", "Landroid/view/ContextThemeWrapper;", "Landroid/content/Context;", "baseContext", "Lcom/ybsdk/core/design/theme/ThemeType;", "themeType", "", "isCollapsingToolbarScrollBehaviorEnabled", "<init>", "(Landroid/content/Context;Lcom/ybsdk/core/design/theme/ThemeType;Z)V", "", "name", "", "getSystemService", "(Ljava/lang/String;)Ljava/lang/Object;", "", "resid", "Lzy11;", "setTheme", "(I)V", "Lcom/yandex/div/core/Div2Context;", "divContext", "Lcom/yandex/div/core/Div2Context;", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/LayoutInflater;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivContextThemeWrapper extends ContextThemeWrapper {
    private final Div2Context divContext;
    private LayoutInflater inflater;

    public DivContextThemeWrapper(Context context, ThemeType themeType, boolean z) {
        super(context, themeType.getStyleRes());
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n1i0.YbSdkDivKitTextStyle);
        ivk ivkVar = pxk.a;
        Div2Context div2Context = new Div2Context(contextThemeWrapper, pxk.a(context, null, z, 10), 0, null, 4, null);
        qx21.c(div2Context);
        this.divContext = div2Context;
    }

    public final Div2Context getDivContext() {
        return this.divContext;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        LayoutInflater layoutInflater = this.inflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        cloneInContext.setFactory2(new DivLayoutInflaterFactory(this.divContext));
        this.inflater = cloneInContext;
        return cloneInContext;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int resid) {
        super.setTheme(resid);
        Integer valueOf = resid == ThemeType.DARK.getStyleRes() ? Integer.valueOf(n1i0.YbSdkDivKitTextStyle_Dark) : resid == ThemeType.LIGHT.getStyleRes() ? Integer.valueOf(n1i0.YbSdkDivKitTextStyle_Light) : null;
        if (valueOf != null) {
            this.divContext.setTheme(valueOf.intValue());
        }
    }

    public /* synthetic */ DivContextThemeWrapper(Context context, ThemeType themeType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, themeType, (i & 4) != 0 ? false : z);
    }
}
