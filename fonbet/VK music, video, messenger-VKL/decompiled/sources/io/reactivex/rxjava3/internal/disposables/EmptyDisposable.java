package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.fuseable.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class EmptyDisposable implements g<Object> {
    private static final /* synthetic */ EmptyDisposable[] $VALUES;
    public static final EmptyDisposable INSTANCE;
    public static final EmptyDisposable NEVER;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        INSTANCE = emptyDisposable;
        EmptyDisposable emptyDisposable2 = new EmptyDisposable("NEVER", 1);
        NEVER = emptyDisposable2;
        $VALUES = new EmptyDisposable[]{emptyDisposable, emptyDisposable2};
    }

    public EmptyDisposable() {
        throw null;
    }

    public static void b(Throwable th, v<?> vVar) {
        vVar.onSubscribe(INSTANCE);
        vVar.onError(th);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public final int a(int i) {
        return 2;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this == INSTANCE;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final Object poll() {
        return null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
    }
}
