package xsna;

import android.os.Message;
import com.vk.media.MediaUtils;
import java.util.ArrayList;
import xsna.rl9;

/* compiled from: CameraDecodeHandler.kt */
/* loaded from: classes3.dex */
public final class ih9 extends czx0 {
    @Override // xsna.czx0, android.os.Handler
    public final void handleMessage(Message message) {
        rl9.a aVar = (rl9.a) this.a.get();
        if (aVar == null || !aVar.i()) {
            return;
        }
        int i = message.what;
        if (i == -2) {
            aVar.m();
            super.handleMessage(message);
            return;
        }
        if (i == 1) {
            Object obj = message.obj;
            byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
            MediaUtils.d dVar = aVar.h;
            ((rl9.b) aVar).n(dVar.a, dVar.b, 0, bArr);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                super.handleMessage(message);
                return;
            } else {
                aVar.l((jhu0) message.obj);
                return;
            }
        }
        rl9.c cVar = (rl9.c) message.obj;
        ArrayList<rl9.c> arrayList = aVar.i;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }
}
