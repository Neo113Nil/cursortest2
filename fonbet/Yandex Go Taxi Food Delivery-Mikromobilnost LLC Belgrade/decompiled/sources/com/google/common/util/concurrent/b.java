package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public abstract class b {
    public static Executor a() {
        return DirectExecutor.INSTANCE;
    }
}
