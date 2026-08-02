package com.github.dart_lang.jni;

import android.app.Activity;
import android.content.Context;
import defpackage.l40;
import defpackage.r30;
import defpackage.ssr;
import defpackage.tsr;
import defpackage.wrr;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public class JniPlugin implements tsr, r30 {
    private static Context context;
    private static final ConcurrentHashMap<Long, JniPlugin> pluginMap = new ConcurrentHashMap<>();
    private volatile Activity activity;
    private long engineId;

    static {
        System.loadLibrary("dartjni");
        setClassLoader(JniPlugin.class.getClassLoader());
    }

    public static Activity getActivity(long j) {
        JniPlugin jniPlugin = pluginMap.get(Long.valueOf(j));
        Objects.requireNonNull(jniPlugin);
        return jniPlugin.activity;
    }

    public static Context getApplicationContext() {
        return context;
    }

    private void setActivity(Activity activity) {
        this.activity = activity;
    }

    public static native void setClassLoader(ClassLoader classLoader);

    @Override // defpackage.r30
    public void onAttachedToActivity(l40 l40Var) {
        setActivity((Activity) ((wrr) l40Var).b);
    }

    @Override // defpackage.tsr
    public void onAttachedToEngine(ssr ssrVar) {
        long j = ssrVar.b.w;
        this.engineId = j;
        context = ssrVar.a;
        pluginMap.put(Long.valueOf(j), this);
    }

    @Override // defpackage.r30
    public void onDetachedFromActivity() {
        setActivity(null);
    }

    @Override // defpackage.r30
    public void onDetachedFromActivityForConfigChanges() {
        setActivity(null);
    }

    @Override // defpackage.tsr
    public void onDetachedFromEngine(ssr ssrVar) {
        this.activity = null;
        pluginMap.remove(Long.valueOf(this.engineId));
    }

    @Override // defpackage.r30
    public void onReattachedToActivityForConfigChanges(l40 l40Var) {
        setActivity((Activity) ((wrr) l40Var).b);
    }
}
