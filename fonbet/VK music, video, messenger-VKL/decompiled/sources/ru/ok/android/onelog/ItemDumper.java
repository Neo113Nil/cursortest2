package ru.ok.android.onelog;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.json.PlainJsonWriter;
import ru.ok.android.commons.io.OutputStreamWriter;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes9.dex */
public final class ItemDumper {

    @Deprecated
    public static final String COUNT = "count";

    @Deprecated
    public static final String CUSTOM = "custom";

    @Deprecated
    public static final String DATA = "data";

    @Deprecated
    public static final String GROUPS = "groups";

    @Deprecated
    public static final String NETWORK = "network";

    @Deprecated
    public static final String OPERATION = "operation";

    @Deprecated
    public static final String TIME = "time";

    @Deprecated
    public static final String TIMESTAMP = "timestamp";

    @Deprecated
    public static final String TYPE = "type";

    @Deprecated
    public static final String UID = "uid";

    private ItemDumper() {
    }

    @Deprecated
    public static String dump(OneLogItem oneLogItem) {
        try {
            StringWriter stringWriter = new StringWriter();
            dump(oneLogItem, stringWriter);
            return stringWriter.toString();
        } catch (IOException unused) {
            throw new AssertionError("WTF! StringWriter thrown IOException");
        }
    }

    @Deprecated
    public static void dump(OneLogItem oneLogItem, OutputStream outputStream) throws IOException {
        dump(oneLogItem, new OutputStreamWriter(outputStream));
    }

    @Deprecated
    public static void dump(OneLogItem oneLogItem, Writer writer) throws IOException {
        PlainJsonWriter plainJsonWriter = new PlainJsonWriter(writer);
        dump(oneLogItem, plainJsonWriter);
        plainJsonWriter.flush();
    }

    @Deprecated
    public static void dump(OneLogItem oneLogItem, JsonWriter jsonWriter) throws IOException {
        OneLogItemSerializer.INSTANCE.serialize(jsonWriter, oneLogItem);
    }
}
