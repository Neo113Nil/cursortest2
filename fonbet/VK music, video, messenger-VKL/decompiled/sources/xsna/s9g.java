package xsna;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import one.video.player.audio.PcmEncoding;

/* compiled from: CombineAudioProcessor.kt */
/* loaded from: classes8.dex */
public final class s9g extends androidx.media3.common.audio.c {
    public final ReentrantLock i = new ReentrantLock();
    public final ArrayList j = new ArrayList();

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit() - byteBuffer.position();
        if (limit == 0) {
            return;
        }
        ByteBuffer h = h(limit);
        ReentrantLock reentrantLock = this.i;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.j;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((rt4) next).getEnabled()) {
                    arrayList2.add(next);
                }
            }
            reentrantLock.unlock();
            if (arrayList2.isEmpty()) {
                h.put(byteBuffer);
                h.flip();
                return;
            }
            HashMap hashMap = ss90.a;
            PcmEncoding pcmEncoding = (PcmEncoding) ss90.a.get(Integer.valueOf(this.b.c));
            if (pcmEncoding == null) {
                pcmEncoding = PcmEncoding.NO_VALUE;
            }
            int i = 0;
            if (arrayList2.size() == 1) {
                ((rt4) arrayList2.get(0)).a(byteBuffer, h, pcmEncoding);
                h.flip();
                return;
            }
            boolean z = arrayList2.size() % 2 == 0;
            ByteBuffer order = ByteBuffer.allocateDirect(limit).order(ByteOrder.nativeOrder());
            ByteBuffer byteBuffer2 = z ? order : h;
            int size = arrayList2.size();
            while (i < size) {
                ((rt4) arrayList2.get(i)).a(byteBuffer, byteBuffer2, pcmEncoding);
                byteBuffer2.flip();
                i++;
                ByteBuffer byteBuffer3 = byteBuffer2;
                byteBuffer2 = byteBuffer2 == order ? h : order;
                byteBuffer = byteBuffer3;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.media3.common.audio.c
    public final AudioProcessor.a d(AudioProcessor.a aVar) {
        return aVar;
    }
}
