package com.yandex.div.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.yandex.div.R$style;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.view2.Div2View;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.f5z;
import xsna.gzs;
import xsna.zcl;

/* compiled from: Div2Context.kt */
/* loaded from: classes7.dex */
public class Div2Context extends ContextWrapper {
    public static final Companion Companion = new Companion(null);
    private final ContextThemeWrapper baseContext;
    private final Div2Component div2Component;
    private final Lazy globalVariableController$delegate;
    private LayoutInflater inflater;
    private final f5z lifecycleOwner;

    /* compiled from: Div2Context.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: Div2Context.kt */
    public static final class Div2InflaterFactory implements LayoutInflater.Factory2 {
        public static final Companion Companion = new Companion(null);
        private final Div2Context div2Context;

        /* compiled from: Div2Context.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            private Companion() {
            }
        }

        public Div2InflaterFactory(Div2Context div2Context) {
            this.div2Context = div2Context;
        }

        private final boolean isDiv2View(String str) {
            return "com.yandex.div.core.view2.Div2View".equals(str) || "Div2View".equals(str);
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return onCreateView(str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            if (!isDiv2View(str)) {
                return null;
            }
            return new Div2View(this.div2Context, attributeSet, 0, 4, null);
        }
    }

    private Div2Context(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, f5z f5zVar) {
        super(contextThemeWrapper);
        this.baseContext = contextThemeWrapper;
        this.div2Component = div2Component;
        this.lifecycleOwner = f5zVar;
        this.globalVariableController$delegate = new bpn0(new gzs<GlobalVariableController>() { // from class: com.yandex.div.core.Div2Context$globalVariableController$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final GlobalVariableController invoke() {
                return new GlobalVariableController(Div2Context.this.getDiv2Component$div_release().getDivVariableController());
            }
        });
        getDiv2Component$div_release().getDivCreationTracker().onContextCreationFinished();
    }

    private LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater;
        LayoutInflater layoutInflater2 = this.inflater;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (this) {
            layoutInflater = this.inflater;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(this.baseContext).cloneInContext(this);
                layoutInflater.setFactory2(new Div2InflaterFactory(this));
                this.inflater = layoutInflater;
            }
        }
        return layoutInflater;
    }

    public Div2Component getDiv2Component$div_release() {
        return this.div2Component;
    }

    public f5z getLifecycleOwner$div_release() {
        return this.lifecycleOwner;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return "layout_inflater".equals(str) ? getLayoutInflater() : this.baseContext.getSystemService(str);
    }

    public /* synthetic */ Div2Context(ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, int i, f5z f5zVar, int i2, zcl zclVar) {
        this(contextThemeWrapper, divConfiguration, (i2 & 4) != 0 ? R$style.Div_Theme : i, (i2 & 8) != 0 ? null : f5zVar);
    }

    public Div2Context(ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, int i, f5z f5zVar) {
        this(contextThemeWrapper, DivKit.Companion.getInstance(contextThemeWrapper).getComponent$div_release().div2Component().baseContext(contextThemeWrapper).configuration(divConfiguration).themeId(i).divCreationTracker(new DivCreationTracker(SystemClock.uptimeMillis())).divVariableController(divConfiguration.getDivVariableController()).build(), f5zVar);
    }
}
