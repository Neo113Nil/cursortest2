package defpackage;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HandshakeCompletedListener;

/* loaded from: classes7.dex */
public final class cbv extends Thread {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;

    public cbv(ReferenceQueue referenceQueue, Handler handler) {
        this.b = referenceQueue;
        this.c = handler;
        setDaemon(true);
        setName("imagesRefQueue");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Handler handler = (Handler) this.c;
                Process.setThreadPriority(10);
                while (true) {
                    try {
                        rq rqVar = (rq) ((ReferenceQueue) this.b).remove(60000L);
                        Message obtainMessage = handler.obtainMessage();
                        if (rqVar != null) {
                            obtainMessage.what = 3;
                            obtainMessage.obj = rqVar.a;
                            handler.sendMessage(obtainMessage);
                        } else {
                            obtainMessage.recycle();
                        }
                    } catch (InterruptedException unused) {
                        return;
                    } catch (Exception e) {
                        handler.post(new ejp(29, e));
                        return;
                    }
                }
            case 1:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    HandshakeCompletedListener handshakeCompletedListener = (HandshakeCompletedListener) entry.getKey();
                    AccessController.doPrivileged(new yq61(3, this, handshakeCompletedListener), (AccessControlContext) entry.getValue());
                }
                return;
            case 2:
                synchronized (((z171) this.c)) {
                    ((ConditionVariable) this.b).open();
                    ((z171) this.c).k();
                    ((z171) this.c).b.getClass();
                }
                return;
            default:
                sh71 sh71Var = ((n671) this.c).g;
                AudioTrack audioTrack = (AudioTrack) this.b;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    return;
                } finally {
                    sh71Var.c();
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbv(z171 z171Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.c = z171Var;
        this.b = conditionVariable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbv(n671 n671Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.c = n671Var;
        this.b = audioTrack;
    }

    public /* synthetic */ cbv(String str) {
        super(str);
    }
}
