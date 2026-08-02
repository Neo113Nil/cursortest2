package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vkontakte.android.R;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ppe implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ppe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ClipsPersistentStore clipsPersistentStore = (ClipsPersistentStore) this.c;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                clipsPersistentStore.b.countDown();
                break;
            case 1:
                OutputStream outputStream = (OutputStream) obj;
                i7o0.b((InputStream) ((Ref$ObjectRef) this.c).element, outputStream, 8192);
                outputStream.flush();
                break;
            default:
                v8k0 v8k0Var = (v8k0) this.c;
                Throwable th = ((ya80) obj).b;
                Context context = v8k0Var.a;
                if (th != null || v8k0Var.b.r().f.c.f()) {
                    String message = th != null ? th.getMessage() : "";
                    if (message == null || message.length() == 0) {
                        message = context.getString(R.string.only_messenger_notifications_enabled_snackbar_message);
                    }
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.h(new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12));
                    aVar.i(new ikv0.d(message, (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6));
                    aVar.n();
                }
                break;
        }
        return s3q0.a;
    }
}
