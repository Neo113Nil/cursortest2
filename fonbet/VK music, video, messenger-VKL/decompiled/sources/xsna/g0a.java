package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzay;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.dz9;
import xsna.ehz;
import xsna.f5o0;
import xsna.grf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class g0a extends ssi0 {
    public static final o100 n = new o100("CastSession", null);
    public final Context c;
    public final HashSet d;

    @Nullable
    public final oxz0 e;
    public final CastOptions f;
    public final zzbx g;
    public final hp01 h;

    @Nullable
    public a401 i;

    @Nullable
    public lvf0 j;

    @Nullable
    public CastDevice k;

    @Nullable
    public dz9.a l;

    @Nullable
    public pp01 m;

    public g0a(Context context, String str, @Nullable String str2, CastOptions castOptions, zzbx zzbxVar, hp01 hp01Var) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = castOptions;
        this.g = zzbxVar;
        this.h = hp01Var;
        d001 d001Var = this.a;
        vnv vnvVar = null;
        if (d001Var != null) {
            try {
                vnvVar = d001Var.zzf();
            } catch (RemoteException unused) {
                ssi0.b.b("Unable to call %s on %s.", "getWrappedObject", d001.class.getSimpleName());
            }
        }
        this.e = zzay.zzc(context, castOptions, vnvVar, new ar01(this));
    }

    @Override // xsna.ssi0
    public final void a(boolean z) {
        oxz0 oxz0Var = this.e;
        if (oxz0Var != null) {
            try {
                oxz0Var.zzj(z);
            } catch (RemoteException unused) {
                n.b("Unable to call %s on %s.", "disconnectFromDevice", oxz0.class.getSimpleName());
            }
            d001 d001Var = this.a;
            if (d001Var == null) {
                return;
            }
            try {
                d001Var.K(0);
            } catch (RemoteException unused2) {
                ssi0.b.b("Unable to call %s on %s.", "notifySessionEnded", d001.class.getSimpleName());
            }
        }
    }

    @Override // xsna.ssi0
    public final long b() {
        exc0.e("Must be called from the main thread.");
        lvf0 lvf0Var = this.j;
        if (lvf0Var == null) {
            return 0L;
        }
        return lvf0Var.j() - this.j.d();
    }

    @Override // xsna.ssi0
    public final void d(@Nullable Bundle bundle) {
        this.k = CastDevice.j(bundle);
    }

    @Override // xsna.ssi0
    public final void e(@Nullable Bundle bundle) {
        this.k = CastDevice.j(bundle);
    }

    @Override // xsna.ssi0
    public final void f(@Nullable Bundle bundle) {
        o(bundle);
    }

    @Override // xsna.ssi0
    public final void g(@Nullable Bundle bundle) {
        o(bundle);
    }

    @Override // xsna.ssi0
    public final void h(@Nullable Bundle bundle) {
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice j = CastDevice.j(bundle);
        if (j != null) {
            String str = j.e;
            if (j.equals(this.k)) {
                return;
            }
            boolean z = false;
            if (!TextUtils.isEmpty(str) && ((castDevice2 = this.k) == null || !TextUtils.equals(castDevice2.e, str))) {
                z = true;
            }
            this.k = j;
            n.a("update to device (%s) with name %s", j, true != z ? "unchanged" : "changed");
            if (!z || (castDevice = this.k) == null) {
                return;
            }
            hp01 hp01Var = this.h;
            if (hp01Var != null) {
                hp01.v.c("update Cast device to %s", castDevice);
                hp01Var.o = castDevice;
                hp01Var.b();
            }
            Iterator it = new HashSet(this.d).iterator();
            while (it.hasNext()) {
                ((dz9.c) it.next()).onDeviceNameChanged();
            }
            pp01 pp01Var = this.m;
            if (pp01Var != null) {
                pp01Var.zzd();
            }
        }
    }

    @Nullable
    public final CastDevice j() {
        exc0.e("Must be called from the main thread.");
        return this.k;
    }

    @Nullable
    public final lvf0 k() {
        exc0.e("Must be called from the main thread.");
        return this.j;
    }

    public final void l(final boolean z) throws IOException, IllegalStateException {
        exc0.e("Must be called from the main thread.");
        final a401 a401Var = this.i;
        if (a401Var == null || !a401Var.e()) {
            return;
        }
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: xsna.u201
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ms01 ms01Var = (ms01) obj;
                a401 a401Var2 = a401.this;
                a401Var2.getClass();
                nwz0 nwz0Var = (nwz0) ms01Var.getService();
                double d = a401Var2.l;
                boolean z2 = a401Var2.m;
                ApiMetadata zza = zzff.zza(ms01Var.getContext());
                Parcel zza2 = nwz0Var.zza();
                int i = com.google.android.gms.internal.cast.zzc.zza;
                zza2.writeInt(z ? 1 : 0);
                zza2.writeDouble(d);
                zza2.writeInt(z2 ? 1 : 0);
                com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
                nwz0Var.zzd(8, zza2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        a.e = 8412;
        a401Var.doWrite(a.a());
    }

    public final void m(String str, Task task) {
        o100 o100Var = n;
        oxz0 oxz0Var = this.e;
        if (oxz0Var == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                dz9.a aVar = (dz9.a) task.getResult();
                this.l = aVar;
                if (aVar.getStatus() != null && aVar.getStatus().i()) {
                    o100Var.a("%s() -> success result", str);
                    lvf0 lvf0Var = new lvf0(new zyz0());
                    this.j = lvf0Var;
                    lvf0Var.z(this.i);
                    this.j.t(new ro01(this));
                    this.j.A();
                    this.h.a(this.j, j());
                    ApplicationMetadata e = aVar.e();
                    exc0.i(e);
                    String d = aVar.d();
                    String sessionId = aVar.getSessionId();
                    exc0.i(sessionId);
                    oxz0Var.m(e, d, sessionId, aVar.g());
                    return;
                }
                if (aVar.getStatus() != null) {
                    o100Var.a("%s() -> failure result", str);
                    oxz0Var.e(aVar.getStatus().b);
                    return;
                }
            } else {
                Exception exception = task.getException();
                if (exception instanceof ApiException) {
                    oxz0Var.e(((ApiException) exception).g());
                    return;
                }
            }
            oxz0Var.e(2476);
        } catch (RemoteException unused) {
            o100Var.b("Unable to call %s on %s.", BatchApiRequest.PARAM_NAME_METHODS, oxz0.class.getSimpleName());
        }
    }

    public final void n(int i) {
        hp01 hp01Var = this.h;
        if (hp01Var.q) {
            hp01Var.q = false;
            lvf0 lvf0Var = hp01Var.n;
            if (lvf0Var != null) {
                lvf0Var.y(hp01Var.m);
            }
            AudioManager audioManager = (AudioManager) hp01Var.a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
            hp01Var.c.zzv(null);
            i201 i201Var = hp01Var.h;
            if (i201Var != null) {
                i201Var.b();
            }
            i201 i201Var2 = hp01Var.i;
            if (i201Var2 != null) {
                i201Var2.b();
            }
            MediaSessionCompat mediaSessionCompat = hp01Var.p;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setCallback(null);
                hp01Var.p.setMetadata(new MediaMetadataCompat.Builder().build());
                hp01Var.d(0, null);
            }
            MediaSessionCompat mediaSessionCompat2 = hp01Var.p;
            if (mediaSessionCompat2 != null) {
                mediaSessionCompat2.setActive(false);
                hp01Var.p.release();
                hp01Var.p = null;
            }
            hp01Var.n = null;
            hp01Var.o = null;
            hp01Var.h();
            if (i == 0) {
                hp01Var.j();
            }
        }
        a401 a401Var = this.i;
        if (a401Var != null) {
            f5o0.a a = f5o0.a();
            a.a = nr2.f;
            a.e = 8403;
            a401Var.doWrite(a.a());
            a401Var.d();
            ehz.a<?> aVar = a401Var.registerListener(a401Var.a, "castDeviceControllerListenerKey").b;
            exc0.j(aVar, "Key must not be null");
            a401Var.doUnregisterEventListener(aVar, 8415);
            this.i = null;
        }
        this.k = null;
        lvf0 lvf0Var2 = this.j;
        if (lvf0Var2 != null) {
            lvf0Var2.z(null);
            this.j = null;
        }
    }

    public final void o(@Nullable Bundle bundle) {
        o100 o100Var = ssi0.b;
        d001 d001Var = this.a;
        CastDevice j = CastDevice.j(bundle);
        this.k = j;
        if (j == null) {
            exc0.e("Must be called from the main thread.");
            if (d001Var != null) {
                try {
                    r2 = d001Var.zzm();
                } catch (RemoteException unused) {
                    o100Var.b("Unable to call %s on %s.", "isResuming", d001.class.getSimpleName());
                }
            }
            if (r2) {
                if (d001Var == null) {
                    return;
                }
                try {
                    d001Var.zzt();
                    return;
                } catch (RemoteException unused2) {
                    o100Var.b("Unable to call %s on %s.", "notifyFailedToResumeSession", d001.class.getSimpleName());
                    return;
                }
            }
            if (d001Var == null) {
                return;
            }
            try {
                d001Var.zzq();
                return;
            } catch (RemoteException unused3) {
                o100Var.b("Unable to call %s on %s.", "notifyFailedToStartSession", d001.class.getSimpleName());
                return;
            }
        }
        a401 a401Var = this.i;
        if (a401Var != null) {
            f5o0.a a = f5o0.a();
            a.a = nr2.f;
            a.e = 8403;
            a401Var.doWrite(a.a());
            a401Var.d();
            ehz.a<?> aVar = a401Var.registerListener(a401Var.a, "castDeviceControllerListenerKey").b;
            exc0.j(aVar, "Key must not be null");
            a401Var.doUnregisterEventListener(aVar, 8415);
            this.i = null;
        }
        n.a("Acquiring a connection to Google Play Services for %s", this.k);
        CastDevice castDevice = this.k;
        exc0.i(castDevice);
        Bundle bundle2 = new Bundle();
        CastOptions castOptions = this.f;
        CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.g;
        NotificationOptions notificationOptions = castMediaOptions != null ? castMediaOptions.e : null;
        boolean z = castMediaOptions != null && castMediaOptions.f;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", notificationOptions != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        zzbx zzbxVar = this.g;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", zzbxVar.zzo());
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION", zzbxVar.zzq());
        dz9.b.a aVar2 = new dz9.b.a(castDevice, new vr01(this));
        aVar2.c = bundle2;
        dz9.b bVar = new dz9.b(aVar2);
        Context context = this.c;
        int i = dz9.a;
        a401 a401Var2 = new a401(context, bVar);
        a401Var2.u.add(new dt01(this));
        this.i = a401Var2;
        ehz registerListener = a401Var2.registerListener(a401Var2.a, "castDeviceControllerListenerKey");
        grf0.a a2 = grf0.a();
        v7x v7xVar = new v7x(a401Var2, 8);
        vua0 vua0Var = vua0.d;
        a401Var2.v = 2;
        a2.c = registerListener;
        a2.a = v7xVar;
        a2.b = vua0Var;
        a2.d = new Feature[]{wyz0.a};
        a2.f = 8428;
        a401Var2.doRegisterEventListener(a2.a());
    }
}
