package com.yandex.div.legacy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.yandex.div.legacy.dagger.DivComponent;
import com.yandex.div.legacy.view.DivView;
import defpackage.eja1;
import defpackage.eu11;
import defpackage.jl40;
import defpackage.ryk;
import defpackage.z83;

/* loaded from: classes11.dex */
public class DivContext extends ContextWrapper {
    private final DivComponent mComponent;
    private LayoutInflater mInflater;

    public DivContext(ContextThemeWrapper contextThemeWrapper, ryk rykVar) {
        super(contextThemeWrapper);
        this.mInflater = null;
        eu11.a.getClass();
        z83.h("Called on non UI thread", jl40.l(Looper.myLooper(), Looper.getMainLooper()));
        DivComponent.Builder a = ((DivComponent.Builder) eja1.g(DivComponent.Builder.class)).a(contextThemeWrapper);
        a.b(rykVar);
        this.mComponent = a.build();
    }

    private LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater;
        LayoutInflater layoutInflater2 = this.mInflater;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (this) {
            try {
                layoutInflater = this.mInflater;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                    layoutInflater.setFactory2(new DivInflaterFactory(this));
                    this.mInflater = layoutInflater;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layoutInflater;
    }

    public DivComponent getComponent() {
        return this.mComponent;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return "layout_inflater".equals(str) ? getLayoutInflater() : getBaseContext().getSystemService(str);
    }

    public void warmUp() {
        this.mComponent.c();
    }

    public static class DivInflaterFactory implements LayoutInflater.Factory2 {
        private static final String DIV_VIEW_CLASS_NAME = "com.yandex.div.core.DivView";
        private static final String DIV_VIEW_SIMPLE_CLASS_NAME = "DivView";
        private final DivContext mDivContext;

        public DivInflaterFactory(DivContext divContext) {
            this.mDivContext = divContext;
        }

        private boolean isDivView(String str) {
            return DIV_VIEW_CLASS_NAME.equals(str) || DIV_VIEW_SIMPLE_CLASS_NAME.equals(str);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            if (isDivView(str)) {
                return new DivView(this.mDivContext, attributeSet);
            }
            return null;
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return onCreateView(str, context, attributeSet);
        }
    }

    public DivContext(Activity activity, ryk rykVar) {
        this((ContextThemeWrapper) activity, rykVar);
    }
}
