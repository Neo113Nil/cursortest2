package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.request.target.ViewTarget;
import defpackage.bit;
import defpackage.dbm;
import defpackage.g1o;
import defpackage.g63;
import defpackage.i7j0;
import defpackage.mht;
import defpackage.my01;
import defpackage.ny61;
import defpackage.o501;
import defpackage.qv10;
import defpackage.r7j0;
import defpackage.tgv;
import defpackage.vys;
import defpackage.y06;
import defpackage.zht;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class GlideContext extends ContextWrapper {
    static final my01 DEFAULT_TRANSITION_OPTIONS = new vys();
    private final g63 arrayPool;
    private final List<i7j0> defaultRequestListeners;
    private r7j0 defaultRequestOptions;
    private final mht defaultRequestOptionsFactory;
    private final Map<Class<?>, my01> defaultTransitionOptions;
    private final c engine;
    private final zht experiments;
    private final tgv imageViewTargetFactory;
    private final int logLevel;
    private final bit registry;

    public GlideContext(Context context, g63 g63Var, bit bitVar, tgv tgvVar, mht mhtVar, Map<Class<?>, my01> map, List<i7j0> list, c cVar, zht zhtVar, int i) {
        super(context.getApplicationContext());
        this.arrayPool = g63Var;
        this.imageViewTargetFactory = tgvVar;
        this.defaultRequestOptionsFactory = mhtVar;
        this.defaultRequestListeners = list;
        this.defaultTransitionOptions = map;
        this.engine = cVar;
        this.experiments = zhtVar;
        this.logLevel = i;
        this.registry = new g1o(bitVar);
    }

    public <X> ViewTarget buildImageViewTarget(ImageView imageView, Class<X> cls) {
        this.imageViewTargetFactory.getClass();
        if (Bitmap.class.equals(cls)) {
            return new y06(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new dbm(imageView);
        }
        ny61.g(qv10.m(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)"));
        return null;
    }

    public g63 getArrayPool() {
        return this.arrayPool;
    }

    public List<i7j0> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized r7j0 getDefaultRequestOptions() {
        try {
            if (this.defaultRequestOptions == null) {
                ((o501) this.defaultRequestOptionsFactory).getClass();
                r7j0 r7j0Var = new r7j0();
                r7j0Var.J = true;
                this.defaultRequestOptions = r7j0Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.defaultRequestOptions;
    }

    public <T> my01 getDefaultTransitionOptions(Class<T> cls) {
        my01 my01Var = this.defaultTransitionOptions.get(cls);
        if (my01Var == null) {
            for (Map.Entry<Class<?>, my01> entry : this.defaultTransitionOptions.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    my01Var = entry.getValue();
                }
            }
        }
        return my01Var == null ? DEFAULT_TRANSITION_OPTIONS : my01Var;
    }

    public c getEngine() {
        return this.engine;
    }

    public zht getExperiments() {
        return this.experiments;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public Registry getRegistry() {
        return (Registry) this.registry.get();
    }
}
