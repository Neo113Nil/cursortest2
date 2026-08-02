package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.concurrent.CountDownLatch;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.impl.notifications.RtcNotificationReceiverImpl;
import xsna.hul;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class rml implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rml(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                gds gdsVar = (gds) this.c;
                View view = (View) this.d;
                Rect rect = (Rect) this.e;
                gdsVar.getClass();
                gds.j(rect, view);
                return;
            case 1:
                ((gul) this.c).b.execute(new v9j(1, (Runnable) this.d, (hul.a) this.e));
                return;
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str = (String) this.d;
                try {
                    RemoteUtils.f(iOnDoneCallback, ((RemoteUtils.a) this.e).a(), str);
                    return;
                } catch (BundlerException e) {
                    RemoteUtils.e(iOnDoneCallback, e, str);
                    return;
                } catch (RuntimeException e2) {
                    RemoteUtils.e(iOnDoneCallback, e2, str);
                    throw new RuntimeException(e2);
                }
            case 3:
                ((RtcNotificationReceiverImpl) this.c).b((byte[]) this.d, (RtcFormat) this.e);
                return;
            default:
                ((com.ironsource.sdk.controller.v) this.c).a((Context) this.d, (CountDownLatch) this.e);
                return;
        }
    }
}
