package xsna;

import com.vk.dto.polls.Poll;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.libvideo.upload.impl.VideoPersistedUpload;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class e2w implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ e2w(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                AttachPoll attachPoll = new AttachPoll(0, null, (Poll) obj, 0L, 11, null);
                a1w a1wVar = i2w.c;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                a1wVar.D(i2w.a, new z0g0(attachPoll));
                return s3q0.a;
            case 1:
                List list = (List) obj;
                int e = on00.e(c5g.u(list, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj2 : list) {
                    linkedHashMap.put(((VideoPersistedUpload) obj2).getFileName(), obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((VideoPersistedUpload) entry.getValue()).Ab() == VideoPersistedUpload.State.CREATED || ((VideoPersistedUpload) entry.getValue()).Ab() == VideoPersistedUpload.State.FAILED) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap2;
            default:
                if (jfv0.e == null) {
                    return s3q0.a;
                }
                jfv0.a(new tdk0(8));
                return s3q0.a;
        }
    }
}
