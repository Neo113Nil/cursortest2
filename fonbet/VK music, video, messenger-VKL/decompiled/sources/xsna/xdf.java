package xsna;

import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.clips.upload.vk.impl.uploader.c;
import io.opentelemetry.api.trace.SpanKind;
import java.util.Map;
import xsna.oxc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xdf implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xdf(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                int i = c.a.$EnumSwitchMapping$0[((ClipsPersistentStore.PersistedUpload) entry.getValue()).Db().ordinal()];
                if (i == 1 || i == 2) {
                    com.vk.clips.upload.vk.impl.uploader.c.d.append(((ClipsPersistentStore.PersistedUpload) entry.getValue()).zb().f(), ((ClipsPersistentStore.PersistedUpload) entry.getValue()).zb());
                } else {
                    ((ClipsPersistentStore.PersistedUpload) entry.getValue()).Gb();
                }
                break;
            case 1:
                oxc0.a aVar = (oxc0.a) obj;
                rej rejVar = new rej(0);
                aVar.getClass();
                rejVar.invoke(aVar);
                break;
            case 2:
                ((phk0) obj).d(SpanKind.CLIENT);
                break;
            default:
                com.vk.voip.ui.c.b.X0((dhw0) obj);
                break;
        }
        return s3q0.a;
    }
}
