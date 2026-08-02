package ru.ok.android.externcalls.analytics.internal.api;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.JsonWriter;

/* loaded from: classes9.dex */
public class StreamingItemsApiValue extends BoxedApiValue {
    private final File file;
    private final boolean isCompressed;

    public StreamingItemsApiValue(@NonNull File file, boolean z) {
        this.file = file;
        this.isCompressed = z;
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public void write(@NonNull JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        if (ApiDebug.isDebug(jsonWriter)) {
            ApiDebug.omitValue(jsonWriter);
            return;
        }
        jsonWriter.beginArray();
        try {
            InputStream fileInputStream = new FileInputStream(this.file);
            try {
                if (this.isCompressed) {
                    fileInputStream = new GZIPInputStream(fileInputStream, 4096);
                }
                try {
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                        try {
                            jsonWriter.jsonValue(inputStreamReader);
                            inputStreamReader.close();
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (JsonSyntaxException e) {
                    throw new JsonSerializeException(e);
                }
            } catch (ZipException e2) {
                throw new JsonSerializeException(e2);
            }
        } finally {
            jsonWriter.endArray();
        }
    }
}
