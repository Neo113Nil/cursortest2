package xsna;

import androidx.annotation.NonNull;
import com.vk.api.sdk.VKApiConfig;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import kotlin.Lazy;
import xsna.ce3;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes.dex */
public final class u8y {
    public final /* synthetic */ int a = 2;
    public final Object b;

    public u8y(ce3.a aVar) {
        this.b = new jf3(aVar);
    }

    public String a(@NonNull Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            v8y v8yVar = (v8y) this.b;
            oby obyVar = new oby(stringWriter, v8yVar.a, v8yVar.b, v8yVar.c, v8yVar.d);
            obyVar.a(obj);
            obyVar.c();
            obyVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                VKApiConfig vKApiConfig = (VKApiConfig) this.b;
                String invoke = vKApiConfig.p.invoke();
                Lazy<List<h7r0>> lazy = vKApiConfig.k;
                return "OkHttpExecutorConfig(host='" + ((Object) invoke) + "', accessToken='" + i7r0.a(lazy.getValue()) + "', secret='" + i7r0.b(lazy.getValue()) + "', logFilterCredentials=" + vKApiConfig.m + ")";
            default:
                return super.toString();
        }
    }

    public u8y(VKApiConfig vKApiConfig) {
        this.b = vKApiConfig;
        if (vKApiConfig.a == null) {
            throw new IllegalArgumentException("context is null");
        }
    }

    public u8y(v8y v8yVar) {
        this.b = v8yVar;
    }
}
