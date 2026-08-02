package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.upload.impl.UploadNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.f360;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9e0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j9e0(r9e0 r9e0Var, okhttp3.d dVar, long j) {
        this.d = r9e0Var;
        this.e = dVar;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                r9e0 r9e0Var = (r9e0) this.d;
                okhttp3.d dVar = (okhttp3.d) this.e;
                f360.a aVar = (f360.a) obj;
                Iterator<f360> it = r9e0Var.d.iterator();
                while (it.hasNext()) {
                    it.next().n(dVar, this.c, aVar);
                }
                break;
            default:
                azl0 azl0Var = (azl0) this.d;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.e;
                List list = (List) obj;
                ArrayList<com.vk.upload.impl.b<StoryEntry>> arrayList = azl0Var.l;
                UploadNotification uploadNotification = azl0Var.h;
                Iterator<com.vk.upload.impl.b<StoryEntry>> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().h.b = null;
                }
                uploadNotification.f(azl0Var, null);
                ((uvl0) azl0Var.o.getValue()).e(azl0Var.d, (StoryEntry) j5g.i0(list), (int) (System.currentTimeMillis() - this.c), ref$IntRef.element);
                uploadNotification.b = null;
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ j9e0(azl0 azl0Var, long j, Ref$IntRef ref$IntRef) {
        this.d = azl0Var;
        this.c = j;
        this.e = ref$IntRef;
    }
}
