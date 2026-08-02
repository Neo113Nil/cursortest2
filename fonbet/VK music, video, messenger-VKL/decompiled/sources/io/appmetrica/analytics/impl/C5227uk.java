package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5227uk {
    public final C5201tk a;
    public volatile L9 b;
    public volatile L9 c;
    public volatile L9 d;
    public volatile L9 e;
    public volatile L9 f;
    public volatile L9 g;
    public volatile ExecutorC5175sk h;

    public C5227uk() {
        this(new C5201tk());
    }

    public final IHandlerExecutor a() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.a.getClass();
                        HandlerThreadC5063ob a = L9.a("IAA-SDE");
                        this.g = new L9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.g;
    }

    public final IHandlerExecutor b() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.a.getClass();
                        HandlerThreadC5063ob a = L9.a("IAA-SC");
                        this.b = new L9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final IHandlerExecutor c() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.a.getClass();
                        HandlerThreadC5063ob a = L9.a("IAA-SMH-1");
                        this.d = new L9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final IHandlerExecutor d() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.a.getClass();
                        HandlerThreadC5063ob a = L9.a("IAA-SNTPE");
                        this.e = new L9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final IHandlerExecutor e() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        HandlerThreadC5063ob a = L9.a("IAA-STE");
                        this.c = new L9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public C5227uk(C5201tk c5201tk) {
        new HashMap();
        this.a = c5201tk;
    }
}
