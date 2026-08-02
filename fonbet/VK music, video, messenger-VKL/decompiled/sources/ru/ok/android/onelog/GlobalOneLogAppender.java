package ru.ok.android.onelog;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class GlobalOneLogAppender implements OneLogAppender {
    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(@NonNull OneLogItem oneLogItem) {
        OneLogImpl.getInstance().append(oneLogItem);
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
        OneLogImpl.getInstance().flush();
    }
}
