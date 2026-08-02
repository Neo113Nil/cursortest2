package com.yandex.div.core.player;

/* compiled from: DivPlayer.kt */
/* loaded from: classes7.dex */
public interface DivPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: DivPlayer.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* compiled from: DivPlayer.kt */
    public interface Observer {
    }

    default void pause() {
    }

    default void play() {
    }

    default void release() {
    }

    default void addObserver(Observer observer) {
    }

    default void seek(long j) {
    }

    default void setMuted(boolean z) {
    }
}
