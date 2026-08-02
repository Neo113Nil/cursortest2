package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.api.sdk.exceptions.VKLocalIOException;
import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.exceptions.ApiArgNotFoundException;
import com.vk.im.engine.exceptions.ApiNotImplementedException;
import com.vk.im.engine.exceptions.InvalidCredentialsException;
import com.vk.im.engine.exceptions.attach.AttachUploadCancelledException;
import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.exceptions.JobException;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.InterruptedIOException;
import java.nio.channels.ClosedByInterruptException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.u6x;

/* compiled from: ImInstantJob.kt */
/* loaded from: classes.dex */
public abstract class u4w extends InstantJob {
    public static boolean N(Throwable th) {
        if (!BuildInfo.m()) {
            return false;
        }
        if (!(th instanceof ExecutionException)) {
            return (x19.K(th) || (th instanceof InterruptedException) || (th instanceof InterruptedIOException) || (th instanceof ClosedByInterruptException) || (th instanceof VKLocalIOException) || (th instanceof AttachUploadCancelledException) || (th instanceof ApiNotImplementedException) || (th instanceof InvalidCredentialsException) || (th instanceof ApiArgNotFoundException) || (th instanceof ApiAccessDeniedException)) ? false : true;
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            return N(cause);
        }
        return false;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final void C(Object obj, Map<InstantJob, ? extends InstantJob.a> map, NotificationCompat.h hVar) {
        O((w2w) obj, map, hVar);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final void D(Object obj, NotificationCompat.h hVar) {
        P((w2w) obj, hVar);
    }

    public String F(w2w w2wVar) {
        return null;
    }

    public int G(w2w w2wVar) {
        return 1;
    }

    public int H(w2w w2wVar) {
        return 1;
    }

    public String I(w2w w2wVar) {
        return "";
    }

    public abstract void L(w2w w2wVar, u6x.a aVar);

    public boolean M() {
        return false;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final void h(Object obj) {
        E((w2w) obj);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String k(Object obj) {
        return F((w2w) obj);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final int l(Object obj) {
        return G((w2w) obj);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final int m(Object obj) {
        return H((w2w) obj);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String n(Object obj) {
        return I((w2w) obj);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final void u(Object obj) {
        try {
            J((w2w) obj);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(new JobException("onCancel", th));
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final void v(Object obj, Throwable th) {
        try {
            K((w2w) obj, th);
        } catch (Throwable th2) {
            com.vk.metrics.eventtracking.b.a.q(new JobException(BatchApiRequest.FIELD_NAME_ON_ERROR, th2));
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final void w(Object obj, u6x.a aVar) {
        try {
            L((w2w) obj, aVar);
        } catch (Throwable th) {
            if (N(th)) {
                com.vk.metrics.eventtracking.b.a.a(new JobException("onExecute", th));
            } else {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType = L.LogType.d;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(" onExecute ");
                    L.u(l, logType, new Object[]{m5k.b(th, sb)});
                }
            }
            throw th;
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean z(Object obj) {
        return M();
    }

    public void E(w2w w2wVar) {
    }

    public void J(w2w w2wVar) {
    }

    public void K(w2w w2wVar, Throwable th) {
    }

    public void P(w2w w2wVar, NotificationCompat.h hVar) {
    }

    public void O(w2w w2wVar, Map<InstantJob, ? extends InstantJob.a> map, NotificationCompat.h hVar) {
    }
}
