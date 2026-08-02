package xsna;

import android.media.MediaFormat;
import android.net.Uri;
import com.vk.media.pipeline.model.stat.TranscodeType;
import com.vk.media.pipeline.session.transform.task.transcode.TranscodeException;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import com.vk.media.pipeline.utils.MediaMetadataUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.nkp0;
import xsna.rkp0;
import xsna.v6e0;

/* compiled from: Transcode.kt */
/* loaded from: classes3.dex */
public final class cjp0 extends a5o0 {
    public final djp0 g;
    public final s98 h;
    public final nfq i;
    public final jkp0 j;
    public final boolean k;
    public final TranscodeType l;

    public cjp0(csp cspVar, djp0 djp0Var, s98 s98Var, nfq nfqVar, ju4 ju4Var, jkp0 jkp0Var, boolean z) {
        super(cspVar, djp0Var.a, cspVar.c, ju4Var, "Transcode");
        this.g = djp0Var;
        this.h = s98Var;
        this.i = nfqVar;
        this.j = jkp0Var;
        this.k = z;
        boolean z2 = djp0Var.b instanceof v6e0.a;
        boolean z3 = djp0Var.c instanceof v6e0.a;
        TranscodeType transcodeType = (z2 && z3) ? TranscodeType.ALL : (!z2 || z3) ? (z2 || !z3) ? TranscodeType.NONE : TranscodeType.AUDIO_ONLY : TranscodeType.VIDEO_ONLY;
        this.l = transcodeType;
        ((ejp0) ju4Var.a).j = transcodeType;
        ((ErrorStatBuilder) ju4Var.b).l = transcodeType;
    }

    @Override // xsna.a5o0
    public final void b() {
        this.h.b();
    }

    @Override // xsna.a5o0
    public final qpa0 c() {
        qpa0 a;
        super.c();
        csp cspVar = this.a;
        f100 f100Var = cspVar.d;
        jpa0 jpa0Var = cspVar.b;
        ju4 ju4Var = this.d;
        ncl nclVar = new ncl(f100Var, ju4Var, jpa0Var, this.k);
        nfq nfqVar = this.i;
        jkp0 jkp0Var = this.j;
        djp0 djp0Var = this.g;
        s98 s98Var = this.h;
        lv10 lv10Var = new lv10(cspVar, ju4Var, nclVar, djp0Var, s98Var, nfqVar, jkp0Var);
        try {
            try {
                try {
                    lv10Var.c();
                    d((ejp0) ju4Var.a, s98Var);
                    e((ejp0) ju4Var.a, this.g.a);
                    qpa0 a2 = a5o0.a(this, new rkp0.b(this.l), null, 2);
                    lv10Var.b();
                    return a2;
                } catch (TranscodeException e) {
                    a = a5o0.a(this, null, e, 1);
                    lv10Var.b();
                    return a;
                }
            } catch (InterruptedException e2) {
                a = a5o0.a(this, null, e2, 1);
                lv10Var.b();
                return a;
            } catch (Throwable th) {
                a = a5o0.a(this, null, new TranscodeException(th), 1);
                lv10Var.b();
                return a;
            }
        } catch (Throwable th2) {
            lv10Var.b();
            throw th2;
        }
    }

    public final void d(ejp0 ejp0Var, s98 s98Var) {
        int i;
        csp cspVar = this.a;
        try {
            if (((Boolean) this.c.get()).booleanValue()) {
                return;
            }
            List<c7s0> list = s98Var.a;
            Uri a = nkp0.a.a(list);
            tht0 a2 = list.get(0).a();
            cr10 cr10Var = a2 instanceof cr10 ? (cr10) a2 : null;
            if (a != null && cr10Var != null) {
                MediaFormat mediaFormat = cr10Var.o;
                if (!mediaFormat.containsKey(BadConnectionSignaling.KEY_BAD_NET_BITRATE) && (i = MediaMetadataUtils.a(cspVar.a, a).g) > 0) {
                    mediaFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, i);
                }
                ejp0Var.getClass();
                ejp0Var.g = new gr10(mediaFormat);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                tht0 a3 = ((c7s0) it.next()).a();
                cr10 cr10Var2 = a3 instanceof cr10 ? (cr10) a3 : null;
                MediaFormat mediaFormat2 = cr10Var2 != null ? cr10Var2.o : null;
                if (mediaFormat2 != null) {
                    arrayList.add(mediaFormat2);
                }
            }
            ejp0Var.getClass();
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new gr10((MediaFormat) it2.next()));
            }
            ejp0Var.h = arrayList2;
        } catch (Throwable th) {
            f100 f100Var = cspVar.d;
            if (f100Var != null) {
                f100Var.e(this.e, "Failed to analyze single input video params: " + th);
            }
        }
    }

    public final void e(ejp0 ejp0Var, File file) {
        csp cspVar = this.a;
        try {
            if (((Boolean) this.c.get()).booleanValue()) {
                return;
            }
            ejp0Var.i = MediaMetadataUtils.a(cspVar.a, Uri.fromFile(file));
        } catch (Throwable th) {
            f100 f100Var = cspVar.d;
            if (f100Var != null) {
                f100Var.e(this.e, "Failed to analyze transcoded video params: " + th);
            }
        }
    }
}
