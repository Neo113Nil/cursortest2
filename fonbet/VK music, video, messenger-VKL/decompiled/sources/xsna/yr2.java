package xsna;

import android.net.Uri;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.b;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import io.appmetrica.analytics.impl.C5145rg;
import io.appmetrica.analytics.impl.C5171sg;
import io.appmetrica.analytics.impl.Cg;
import okhttp3.p;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderDispatch;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.re9;
import xsna.sfl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class yr2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yr2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        r1 = new xsna.nl6(6, r3, android.graphics.BitmapFactory.decodeByteArray(r2, 0, r2.length));
        r0 = xsna.xer0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (xsna.epx.f(android.os.Looper.myLooper(), android.os.Looper.getMainLooper()) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        r1.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        ((android.os.Handler) xsna.xer0.b.getValue()).postDelayed(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r0 == null) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        okhttp3.v vVar;
        int i = this.b;
        okhttp3.v vVar2 = null;
        r2 = null;
        r2 = null;
        byte[] bArr = null;
        vVar2 = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AnimojiRenderDispatch.a((AnimojiRenderDispatch) obj2, (CallParticipant.ParticipantId) obj);
                return;
            case 1:
                gg9 gg9Var = (gg9) obj;
                re9.a aVar = ((re9) obj2).r;
                aVar.a.remove(gg9Var);
                aVar.b.remove(gg9Var);
                return;
            case 2:
                sfl.b bVar = (sfl.b) obj2;
                bVar.j = false;
                bVar.e((Uri) obj);
                return;
            case 3:
                androidx.media3.exoplayer.video.a.this.h.onVideoSizeChanged((xgt0) obj);
                return;
            case 4:
                wjf0.c((RecyclerView) obj2, new y3i((com.vk.movika.sdk.base.logic.processor.actions.e) obj, 26));
                return;
            case 5:
                v7i v7iVar = (v7i) obj;
                if (((v7i) obj2).b()) {
                    v7iVar.e();
                    return;
                } else {
                    v7iVar.a(null);
                    return;
                }
            case 6:
                String str = (String) obj2;
                VKCaptchaActivity vKCaptchaActivity = (VKCaptchaActivity) obj;
                int i2 = VKCaptchaActivity.e;
                try {
                    try {
                        p.a aVar2 = new p.a();
                        aVar2.i(str);
                        try {
                            vVar = ((f8f0) new b.a().a().a(aVar2.b())).execute().h;
                            if (vVar != null) {
                                try {
                                    bArr = vVar.bytes();
                                    break;
                                } catch (Exception unused) {
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    vVar2 = vVar;
                                    if (vVar2 != null) {
                                        vVar2.close();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception unused2) {
                    vVar = null;
                    break;
                }
                break;
            case 7:
                FrameLayout frameLayout = (FrameLayout) obj2;
                bir0 bir0Var = (bir0) obj;
                frameLayout.removeView(bir0Var.c);
                frameLayout.setVisibility(4);
                bir0Var.c = null;
                bir0Var.d = null;
                return;
            case 8:
                ((yads.pk0) obj2).b((yads.qk0) obj);
                return;
            default:
                C5145rg.a((C5171sg) obj2, (Cg) obj);
                return;
        }
    }
}
