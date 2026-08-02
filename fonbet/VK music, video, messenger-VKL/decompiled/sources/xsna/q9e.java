package xsna;

import android.content.Intent;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class q9e implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q9e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return s9e.a((Intent) this.c);
            case 1:
                String str = (String) this.c;
                if (str == null || str.length() == 0) {
                    return null;
                }
                byte[] bytes = str.getBytes(C.UTF8_NAME);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            default:
                return Boolean.valueOf(((t4x0) this.c).a());
        }
    }

    public /* synthetic */ q9e(s9e s9eVar, Intent intent) {
        this.b = 0;
        this.c = intent;
    }
}
