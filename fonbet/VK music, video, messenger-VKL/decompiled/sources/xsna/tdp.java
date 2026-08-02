package xsna;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EmojiLoggingPrefixer.kt */
/* loaded from: classes.dex */
public final class tdp implements h200 {
    public final AtomicInteger b = new AtomicInteger(0);

    @Override // xsna.h200
    public final String getPrefix() {
        return new String(Character.toChars((this.b.getAndIncrement() % 244) + 129292));
    }
}
