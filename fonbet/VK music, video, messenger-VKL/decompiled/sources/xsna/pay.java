package xsna;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* compiled from: JsonSerializableFileDataStoreImpl.kt */
/* loaded from: classes.dex */
public final class pay extends Lambda implements izs<Throwable, Throwable> {
    final /* synthetic */ JsonSerializableFileDataStoreImpl<JsonSerializer> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pay(JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl) {
        super(1);
        this.this$0 = jsonSerializableFileDataStoreImpl;
    }

    @Override // xsna.izs
    public final Throwable invoke(Throwable th) {
        String str;
        Throwable th2 = th;
        StringBuilder sb = new StringBuilder("Error parsing model in ");
        str = this.this$0.a;
        sb.append(str);
        String sb2 = sb.toString();
        if (th2 == null) {
            th2 = new JSONException("Unknown data corrupted");
        }
        return new IllegalStateException(sb2, th2);
    }
}
