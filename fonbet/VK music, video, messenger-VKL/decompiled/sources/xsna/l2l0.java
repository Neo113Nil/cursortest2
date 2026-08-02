package xsna;

import android.app.Application;
import com.google.android.gms.internal.measurement.zzof;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.preference.Preference;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: StickerBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class l2l0 implements q701, hx2, v180 {
    public static final jai b = new jai(-1578284643, new k3i(3), false);
    public static final l2l0 c = new l2l0();
    public static final /* synthetic */ l2l0 d = new l2l0();

    public l2l0(Application application) {
        String s;
        new ArrayList();
        Preference.a.getClass();
        Preference.w(application);
        s = Preference.s("com.vk.superapp.core.host", "vk_sak_core_host", new String());
        String a = cqm0.a(s);
        if (a != null) {
            a0a.d = a;
        }
    }

    public static long f(w2w w2wVar, MsgFromUser msgFromUser) {
        int i;
        ArrayList arrayList = msgFromUser.H;
        int i2 = 0;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((Attach) it.next()) instanceof AttachVideo) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        ArrayList<Attach> arrayList2 = msgFromUser.H;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            for (Attach attach : arrayList2) {
                if ((attach instanceof AttachImage) || (attach instanceof AttachDoc) || (attach instanceof AttachAudioMsg)) {
                    i2++;
                    if (i2 < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
        }
        return (w2wVar.getConfig().v * i2) + (w2wVar.getConfig().w * i) + w2wVar.getConfig().p;
    }

    public static final void g(long j) {
        gno0[] gno0VarArr = fno0.b;
        if ((j & 1095216660480L) == 0) {
            wzw.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void h(long j, long j2) {
        gno0[] gno0VarArr = fno0.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            wzw.a("Cannot perform operation for Unspecified type.");
        }
        if (gno0.a(fno0.c(j), fno0.c(j2))) {
            return;
        }
        wzw.a("Cannot perform operation for " + ((Object) gno0.b(fno0.c(j))) + " and " + ((Object) gno0.b(fno0.c(j2))));
    }

    public static final long i(double d2) {
        return n((float) d2, 8589934592L);
    }

    public static final long j(double d2) {
        return n((float) d2, 4294967296L);
    }

    public static final long k(float f) {
        return n(f, 4294967296L);
    }

    public static final long l(int i) {
        return n(i, 4294967296L);
    }

    public static final boolean m(dhw0 dhw0Var) {
        return !dhw0Var.r() && fkq0.c(dhw0Var.M) && dhw0Var.O;
    }

    public static final long n(float f, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        gno0[] gno0VarArr = fno0.b;
        return floatToRawIntBits;
    }

    public static final q630 o(q630 q630Var, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? q630Var : rdu.c(q630Var, f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 524284);
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        cvk.w(((JSONObject) obj).toString(), false);
    }

    @Override // xsna.hx2
    public void e(VKApiExecutionException vKApiExecutionException) {
        cvk.w(vKApiExecutionException.toString(), false);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzof.zzd());
    }

    @Override // xsna.v180
    public void c() {
    }

    @Override // xsna.v180
    public void a(int i) {
    }

    @Override // xsna.v180
    public void d(int i, boolean z) {
    }
}
