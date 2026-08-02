package xsna;

import com.squareup.wire.Message;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.channels.ChannelsRecommendation;
import com.vk.superapp.core.perf.BrowserPerfState;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qk8 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qk8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                BrowserPerfState browserPerfState = (BrowserPerfState) obj2;
                v73 v73Var = (v73) obj;
                zdx0 zdx0Var = e370.v;
                if (zdx0Var != null) {
                    zdx0Var.a(browserPerfState, v73Var);
                    return;
                }
                return;
            case 1:
                ((ChannelsRecommendation) obj2).h = false;
                ((kcf0) obj).o6();
                return;
            case 2:
                Message message = (Message) obj;
                uy90 uy90Var = ((hvg0) obj2).a;
                ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) uy90Var.c;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    if (!message.equals((Message) uy90Var.d)) {
                        uy90Var.b(message);
                        uy90Var.d = message;
                    }
                    s3q0 s3q0Var = s3q0.a;
                    return;
                } finally {
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            default:
                ((rnm0) obj2).d.remove((UserId) obj);
                return;
        }
    }
}
