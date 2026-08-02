package ru.ok.android.api.json.dom;

import androidx.annotation.NonNull;
import java.io.CharArrayWriter;
import java.io.IOException;
import ru.ok.android.api.json.PlainJsonWriter;

/* loaded from: classes9.dex */
public final class DomJsonSerializers {
    @NonNull
    public static String toJsonString(@NonNull Object obj) {
        try {
            CharArrayWriter charArrayWriter = new CharArrayWriter();
            DomJsonWriters.domValue(obj, new PlainJsonWriter(charArrayWriter));
            return charArrayWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
