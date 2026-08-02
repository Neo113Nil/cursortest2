package xsna;

import com.vk.attachpicker.screen.filters.a;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.tags.Tag;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class tbq implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tbq(int i, z8u0 z8u0Var) {
        this.c = i;
        this.d = z8u0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                com.vk.attachpicker.screen.filters.a aVar = (com.vk.attachpicker.screen.filters.a) obj2;
                ReentrantLock reentrantLock = aVar.d;
                reentrantLock.lock();
                try {
                    aVar.e.put(Integer.valueOf(i2), a.b.C0389a.a);
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    aVar.a.onNext(new a.AbstractC0387a.C0388a(i2));
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                z8u0 z8u0Var = (z8u0) obj2;
                Tag tag = (Tag) obj;
                d390 d390Var = z8u0Var.x;
                if (d390Var != null && i2 == d390Var.getCurrentPosition()) {
                    AttachmentWithMedia T = z8u0Var.T(i2);
                    PhotoAttachment photoAttachment = T instanceof PhotoAttachment ? (PhotoAttachment) T : null;
                    if (photoAttachment != null) {
                        z8u0Var.A.i(photoAttachment.l, tag);
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ tbq(com.vk.attachpicker.screen.filters.a aVar, int i) {
        this.d = aVar;
        this.c = i;
    }
}
