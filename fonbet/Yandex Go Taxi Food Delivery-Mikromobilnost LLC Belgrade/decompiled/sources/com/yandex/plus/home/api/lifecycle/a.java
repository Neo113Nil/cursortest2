package com.yandex.plus.home.api.lifecycle;

import com.yandex.plus.home.api.lifecycle.ActivityLifecycle;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActivityLifecycle.LifecycleState.values().length];
        try {
            iArr[ActivityLifecycle.LifecycleState.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActivityLifecycle.LifecycleState.STOPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActivityLifecycle.LifecycleState.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActivityLifecycle.LifecycleState.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ActivityLifecycle.LifecycleState.CREATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ActivityLifecycle.LifecycleState.DESTROYED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ActivityLifecycle.LifecycleState.UNDEFINED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
