package ru.ok.android.onelog;

import androidx.annotation.NonNull;
import java.io.Flushable;

/* loaded from: classes11.dex */
public interface OneLogAppender extends Flushable {
    void append(@NonNull OneLogItem oneLogItem);

    @Override // java.io.Flushable
    void flush();
}
