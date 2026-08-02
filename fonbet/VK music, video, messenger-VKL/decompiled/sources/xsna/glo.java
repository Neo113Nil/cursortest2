package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import kotlin.LazyThreadSafetyMode;
import xsna.e3m;

/* compiled from: DraweeResourcesContextWrapper.kt */
/* loaded from: classes.dex */
public final class glo extends ContextThemeWrapper {
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public final Context a;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        b = msy.a(lazyThreadSafetyMode, new hu2(3));
        c = msy.a(lazyThreadSafetyMode, new s63(4));
        d = msy.a(lazyThreadSafetyMode, new sw1(6));
    }

    public glo(Context context) {
        super(context, 0);
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        lrv0 lrv0Var = (lrv0) b.getValue();
        Context context = this.a;
        if (lrv0Var != null) {
            return lrv0Var.c(context) ? (a) c.getValue() : (a) d.getValue();
        }
        com.vk.metrics.eventtracking.b.a.a(new RuntimeException("VkThemeHelperBase.delegate is null! Check your initialization steps or the field is not threadsafe"));
        return new a(context, super.getResources());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        lrv0 lrv0Var = (lrv0) b.getValue();
        if (lrv0Var != null) {
            return lrv0Var.c(this.a) ? lrv0Var.e().getTheme() : lrv0Var.b().getTheme();
        }
        com.vk.metrics.eventtracking.b.a.a(new RuntimeException("VkThemeHelperBase.delegate is null! Check your initialization steps or the field is not threadsafe"));
        return super.getTheme();
    }

    /* compiled from: DraweeResourcesContextWrapper.kt */
    public static final class a extends hbg0 {
        public final Context b;

        public a(Context context, Resources resources) {
            super(resources);
            this.b = context;
        }

        @Override // android.content.res.Resources
        @ozl
        public final Drawable getDrawable(int i) {
            e3m.a aVar = e3m.a;
            return m33.a(i, this.b);
        }

        @Override // android.content.res.Resources
        public final Drawable getDrawable(int i, Resources.Theme theme) {
            e3m.a aVar = e3m.a;
            return m33.a(i, this.b);
        }
    }
}
