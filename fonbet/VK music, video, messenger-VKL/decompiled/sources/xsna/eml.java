package xsna;

import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.fragments.chat.ChatFragment;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: DefaultSecureDataGenerator.kt */
/* loaded from: classes15.dex */
public final class eml implements txd, z1y0, ws01 {
    public final Object b;

    public /* synthetic */ eml(Object obj) {
        this.b = obj;
    }

    public static void h(yco ycoVar) {
        ClipsDraftPersistentStore.b.getClass();
        ClipsDraftVk k = ClipsDraftPersistentStore.k();
        if (k != null) {
            k.c.c = ycoVar != null ? new ClipsDraftMusicInfo(ycoVar.a, ycoVar.b, ycoVar.c, ycoVar.d) : null;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.txd
    public void a(pdo pdoVar, gzs gzsVar) {
        io.reactivex.rxjava3.internal.operators.single.b bVar = new io.reactivex.rxjava3.internal.operators.single.b(new yj0(this, pdoVar));
        asu0 asu0Var = asu0.a;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        hg1.i(bVar.q(new io.reactivex.rxjava3.internal.schedulers.d(scheduledExecutorService, true)).m(asu0Var.d()), new vxd(0, gzsVar));
    }

    @Override // xsna.txd
    public void b(final pdo pdoVar, final pdo pdoVar2, final boolean z) {
        ((ScheduledExecutorService) this.b).execute(new Runnable(pdoVar2, this, z) { // from class: xsna.uxd
            public final /* synthetic */ pdo c;
            public final /* synthetic */ boolean d;

            {
                this.d = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z2;
                pdo pdoVar3 = pdo.this;
                yco ycoVar = pdoVar3.b;
                pdo pdoVar4 = this.c;
                yco ycoVar2 = pdoVar4.b;
                ArrayList arrayList = pdoVar4.d;
                ArrayList arrayList2 = pdoVar4.c;
                boolean z3 = true;
                if (epx.f(ycoVar, ycoVar2)) {
                    z2 = false;
                } else {
                    eml.h(ycoVar2);
                    z2 = true;
                }
                if (!pdoVar3.c.equals(arrayList2)) {
                    wxd wxdVar = new wxd(arrayList2, 0);
                    ClipsDraftPersistentStore.b.getClass();
                    ClipsDraftVk k = ClipsDraftPersistentStore.k();
                    if (k != null) {
                        wxdVar.invoke(k);
                    }
                    z2 = true;
                }
                if (!pdoVar3.d.equals(arrayList)) {
                    ClipsDraftPersistentStore.b.getClass();
                    ClipsDraftVk k2 = ClipsDraftPersistentStore.k();
                    if (k2 != null) {
                        k2.b.d = new ArrayList(arrayList);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    z2 = true;
                }
                float f = pdoVar3.g;
                float f2 = pdoVar4.g;
                if (f != f2) {
                    ClipsDraftPersistentStore.b.getClass();
                    ClipsDraftVk k3 = ClipsDraftPersistentStore.k();
                    if (k3 != null) {
                        k3.b.m = f2;
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    z2 = true;
                }
                if (this.d) {
                    e1 e1Var = new e1(pdoVar4, 24);
                    ClipsDraftPersistentStore.b.getClass();
                    ClipsDraftVk k4 = ClipsDraftPersistentStore.k();
                    if (k4 != null) {
                        e1Var.invoke(k4);
                    }
                } else {
                    z3 = z2;
                }
                if (z3) {
                    ClipsDraftPersistentStore.b.getClass();
                    if (ClipsDraftPersistentStore.k() != null) {
                        ClipsDraftPersistentStore.t();
                    }
                }
            }
        });
    }

    public uf7 c() throws IllegalStateException, NoSuchAlgorithmException, UnsupportedEncodingException {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[64];
        secureRandom.nextBytes(bArr);
        q99 q99Var = (q99) this.b;
        String encodeToString = Base64.encodeToString((byte[]) q99Var.invoke(bArr), 11);
        secureRandom.nextBytes(bArr);
        String encodeToString2 = Base64.encodeToString(bArr, 11);
        if (encodeToString2.length() < 43) {
            throw new IllegalStateException("Code verifier is too short.");
        }
        if (encodeToString2.length() > 128) {
            encodeToString2 = encodeToString2.substring(0, 128);
        }
        return new uf7(encodeToString, encodeToString2, Base64.encodeToString((byte[]) q99Var.invoke(encodeToString2.getBytes(emb.d)), 11), "S256");
    }

    public boolean d() {
        return ((ArrayBlockingQueue) this.b).isEmpty();
    }

    public io.reactivex.rxjava3.core.q e(int i, UserId userId) {
        io.reactivex.rxjava3.core.k<Playlist> K = ((pq40) this.b).K(i, userId);
        io.reactivex.rxjava3.internal.operators.maybe.j jVar = new io.reactivex.rxjava3.internal.operators.maybe.j(new IllegalArgumentException("No cached playlist found: " + i + ' ' + userId));
        K.getClass();
        return new io.reactivex.rxjava3.internal.operators.maybe.d0(K, jVar).r();
    }

    @Override // xsna.z1y0
    public void i() {
        kz30 kz30Var = (kz30) this.b;
        mxv mxvVar = kz30Var.c;
        if (!kz30Var.Y && !kz30Var.J().e()) {
            kz30Var.Y = true;
            Dialog Cb = kz30Var.k.Cb();
            fnv0 fnv0Var = fnv0.a;
            if (Cb == null || !Cb.vc()) {
                mxvVar.getClass();
                fnv0Var.h();
            } else {
                mxvVar.getClass();
                fnv0Var.f(kz30Var.e);
            }
        }
        kz30Var.R.postDelayed(new bv9(kz30Var, 6), 160L);
        int i = ify.a;
        if (ify.e(ify.c)) {
            ChatFragment.k kVar = kz30Var.K;
            (kVar != null ? kVar : null).f();
            kz30Var.a0 = true;
        } else {
            ChatFragment.k kVar2 = kz30Var.K;
            (kVar2 != null ? kVar2 : null).e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        kz30Var.S = false;
        kz30Var.J().k();
    }

    @Override // xsna.ws01
    public void zza() {
        ytz0 ytz0Var = (ytz0) this.b;
        ytz0Var.b("split-install-errors", new ezt0(ytz0Var));
    }

    public eml(f8h0 f8h0Var, f8h0 f8h0Var2) {
        this.b = f8h0Var;
    }

    public eml(int i, boolean z) {
        switch (i) {
            case 5:
                this.b = new yd10();
                break;
            default:
                this.b = asu0.a.z(1, "vk-clips-draft-synchronizer");
                break;
        }
    }

    public eml(int i) {
        this.b = new q99(1, new m4j0(), m4j0.class, "hash", "hash$core_release([B)[B", 0, 3);
    }

    public eml(edi ediVar) {
        this.b = new ArrayBlockingQueue(1000);
    }

    @Override // xsna.z1y0
    public void f() {
    }

    @Override // xsna.z1y0
    public void g() {
    }
}
