package com.yandex.payment.sdk.nfcscanner.tools;

import android.app.Activity;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.p;
import com.yandex.payment.sdk.nfcscanner.NfcResult;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.eja1;
import defpackage.ffx;
import defpackage.h2t;
import defpackage.m960;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pc8;
import defpackage.pey;
import defpackage.qv90;
import defpackage.sjh;
import defpackage.tje;
import defpackage.u860;
import defpackage.uyj;
import defpackage.vfc;
import defpackage.w511;
import defpackage.x760;
import defpackage.y22;
import defpackage.zy11;
import java.io.Closeable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class c implements DefaultLifecycleObserver {
    public NfcEnableReceiver A;
    public final r0 B;
    public final n0 C;
    public final a D;
    public final x760 a;
    public final r0 b;
    public final n0 c;
    public Activity w;
    public boolean x;
    public NfcAdapter y;
    public p z;

    /* JADX WARN: Type inference failed for: r4v3, types: [com.yandex.payment.sdk.nfcscanner.tools.a] */
    public c(x760 x760Var) {
        this.a = x760Var;
        r0 c = bvf0.c(m960.c);
        this.b = c;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.c = b;
        this.B = c;
        this.C = b;
        this.D = new NfcAdapter.ReaderCallback() { // from class: com.yandex.payment.sdk.nfcscanner.tools.a
            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag) {
                c cVar = c.this;
                p pVar = cVar.z;
                if (pVar != null) {
                    sjh sjhVar = uyj.a;
                    tje.N(pVar, mdh.b, null, new NfcController$callback$1$1(cVar, tag, null), 2);
                }
            }
        };
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(6:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(8:19|20|21|22|23|(2:25|(1:27))|14|15))(12:28|29|30|31|32|(1:34)|21|22|23|(0)|14|15))(3:44|45|46))(3:55|56|(1:59)(1:58))|47|(2:49|(2:51|52)(10:53|31|32|(0)|21|22|23|(0)|14|15))(9:54|32|(0)|21|22|23|(0)|14|15)))|7|(0)(0)|47|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
    
        r4 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7 A[Catch: all -> 0x005f, TryCatch #3 {all -> 0x005f, blocks: (B:20:0x005a, B:32:0x00fb, B:47:0x00b2, B:49:0x00c7), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, Tag tag, ContinuationImpl continuationImpl) {
        NfcController$handleTag$1 nfcController$handleTag$1;
        ?? r4;
        Closeable closeable;
        Object failure;
        IsoDep isoDep;
        int i;
        pc8 f;
        int i2;
        int i3;
        int i4;
        Closeable closeable2;
        Closeable closeable3;
        cVar.getClass();
        try {
            if (continuationImpl instanceof NfcController$handleTag$1) {
                nfcController$handleTag$1 = (NfcController$handleTag$1) continuationImpl;
                int i5 = nfcController$handleTag$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    nfcController$handleTag$1.label = i5 - Integer.MIN_VALUE;
                    Object obj = nfcController$handleTag$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r4 = nfcController$handleTag$1.label;
                    zy11 zy11Var = zy11.a;
                    if (r4 != 0) {
                        kotlin.b.b(obj);
                        IsoDep isoDep2 = IsoDep.get(tag);
                        r0 r0Var = cVar.b;
                        m960 m960Var = m960.d;
                        nfcController$handleTag$1.L$0 = null;
                        nfcController$handleTag$1.L$1 = isoDep2;
                        nfcController$handleTag$1.I$0 = 0;
                        nfcController$handleTag$1.label = 1;
                        r0Var.emit(m960Var, nfcController$handleTag$1);
                        if (zy11Var == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        isoDep = isoDep2;
                        i = 0;
                    } else {
                        if (r4 != 1) {
                            if (r4 != 2) {
                                if (r4 != 3) {
                                    if (r4 != 4) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    kotlin.b.b(obj);
                                    return zy11Var;
                                }
                                Closeable closeable4 = (Closeable) nfcController$handleTag$1.L$2;
                                kotlin.b.b(obj);
                                closeable3 = closeable4;
                                ooc.g(closeable3, null);
                                failure = zy11Var;
                                if (Result.a(failure) != null) {
                                    nfcController$handleTag$1.L$0 = null;
                                    nfcController$handleTag$1.L$1 = failure;
                                    nfcController$handleTag$1.L$2 = null;
                                    nfcController$handleTag$1.L$3 = null;
                                    nfcController$handleTag$1.L$4 = null;
                                    nfcController$handleTag$1.I$0 = 0;
                                    nfcController$handleTag$1.label = 4;
                                    cVar.b(nfcController$handleTag$1);
                                    if (zy11Var == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return zy11Var;
                            }
                            i4 = nfcController$handleTag$1.I$1;
                            i3 = nfcController$handleTag$1.I$0;
                            closeable = (Closeable) nfcController$handleTag$1.L$2;
                            try {
                                kotlin.b.b(obj);
                                i2 = i4;
                                i = i3;
                                closeable2 = closeable;
                                nfcController$handleTag$1.L$0 = null;
                                nfcController$handleTag$1.L$1 = null;
                                nfcController$handleTag$1.L$2 = closeable2;
                                nfcController$handleTag$1.L$3 = null;
                                nfcController$handleTag$1.L$4 = null;
                                nfcController$handleTag$1.I$0 = i;
                                nfcController$handleTag$1.I$1 = i2;
                                nfcController$handleTag$1.label = 3;
                                cVar.b(nfcController$handleTag$1);
                                closeable3 = closeable2;
                                if (zy11Var == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                ooc.g(closeable3, null);
                                failure = zy11Var;
                                if (Result.a(failure) != null) {
                                }
                                return zy11Var;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    ooc.g(closeable, th2);
                                    throw th3;
                                }
                            }
                        }
                        int i6 = nfcController$handleTag$1.I$0;
                        IsoDep isoDep3 = (IsoDep) nfcController$handleTag$1.L$1;
                        kotlin.b.b(obj);
                        i = i6;
                        isoDep = isoDep3;
                    }
                    isoDep.connect();
                    f = new u860(new h2t(isoDep), cVar.a).f();
                    if (f != null) {
                        i2 = 0;
                        closeable2 = isoDep;
                        nfcController$handleTag$1.L$0 = null;
                        nfcController$handleTag$1.L$1 = null;
                        nfcController$handleTag$1.L$2 = closeable2;
                        nfcController$handleTag$1.L$3 = null;
                        nfcController$handleTag$1.L$4 = null;
                        nfcController$handleTag$1.I$0 = i;
                        nfcController$handleTag$1.I$1 = i2;
                        nfcController$handleTag$1.label = 3;
                        cVar.b(nfcController$handleTag$1);
                        closeable3 = closeable2;
                        if (zy11Var == coroutineSingletons) {
                        }
                        ooc.g(closeable3, null);
                        failure = zy11Var;
                        if (Result.a(failure) != null) {
                        }
                        return zy11Var;
                    }
                    n0 n0Var = cVar.c;
                    NfcResult nfcResult = new NfcResult(f.a, cvu0.v(f.b, "/", "", false));
                    nfcController$handleTag$1.L$0 = null;
                    nfcController$handleTag$1.L$1 = null;
                    nfcController$handleTag$1.L$2 = isoDep;
                    nfcController$handleTag$1.L$3 = null;
                    nfcController$handleTag$1.L$4 = null;
                    nfcController$handleTag$1.I$0 = i;
                    nfcController$handleTag$1.I$1 = 0;
                    nfcController$handleTag$1.I$2 = 0;
                    nfcController$handleTag$1.label = 2;
                    if (n0Var.emit(nfcResult, nfcController$handleTag$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i3 = i;
                    closeable = isoDep;
                    i4 = 0;
                    i2 = i4;
                    i = i3;
                    closeable2 = closeable;
                    nfcController$handleTag$1.L$0 = null;
                    nfcController$handleTag$1.L$1 = null;
                    nfcController$handleTag$1.L$2 = closeable2;
                    nfcController$handleTag$1.L$3 = null;
                    nfcController$handleTag$1.L$4 = null;
                    nfcController$handleTag$1.I$0 = i;
                    nfcController$handleTag$1.I$1 = i2;
                    nfcController$handleTag$1.label = 3;
                    cVar.b(nfcController$handleTag$1);
                    closeable3 = closeable2;
                    if (zy11Var == coroutineSingletons) {
                    }
                    ooc.g(closeable3, null);
                    failure = zy11Var;
                    if (Result.a(failure) != null) {
                    }
                    return zy11Var;
                }
            }
            if (r4 != 0) {
            }
            isoDep.connect();
            f = new u860(new h2t(isoDep), cVar.a).f();
            if (f != null) {
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = r4;
        }
        nfcController$handleTag$1 = new NfcController$handleTag$1(cVar, continuationImpl);
        Object obj2 = nfcController$handleTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r4 = nfcController$handleTag$1.label;
        zy11 zy11Var2 = zy11.a;
    }

    public final zy11 b(ContinuationImpl continuationImpl) {
        NfcAdapter nfcAdapter = this.y;
        this.b.emit((nfcAdapter == null || !nfcAdapter.isEnabled()) ? m960.a : m960.b, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
        Activity requireActivity;
        this.z = eja1.s(peyVar);
        if (peyVar instanceof Activity) {
            requireActivity = (Activity) peyVar;
        } else {
            if (!(peyVar instanceof Fragment)) {
                w511.s("Unsupported LifecycleOwner");
                return;
            }
            requireActivity = ((Fragment) peyVar).requireActivity();
        }
        this.w = requireActivity;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(requireActivity);
        this.y = defaultAdapter;
        boolean z = false;
        x760 x760Var = this.a;
        if (defaultAdapter != null) {
            ((y22) x760Var.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC доступен", "nfc_available"));
        } else {
            ((y22) x760Var.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC недоступен", "nfc_unavailable"));
        }
        NfcAdapter nfcAdapter = this.y;
        if (nfcAdapter != null && nfcAdapter.isEnabled()) {
            z = true;
        }
        NfcEnableReceiver nfcEnableReceiver = new NfcEnableReceiver(z);
        this.A = nfcEnableReceiver;
        nfcEnableReceiver.attachToScope(eja1.s(peyVar));
        Activity activity = this.w;
        if (activity != null) {
            NfcEnableReceiver nfcEnableReceiver2 = this.A;
            if (nfcEnableReceiver2 == null) {
                nfcEnableReceiver2 = null;
            }
            NfcEnableReceiver.Companion.getClass();
            activity.registerReceiver(nfcEnableReceiver2, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
        }
        p pVar = this.z;
        if (pVar != null) {
            tje.N(pVar, null, null, new NfcController$collectNfcHardwareState$1(this, null), 3);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        NfcEnableReceiver nfcEnableReceiver = this.A;
        if (nfcEnableReceiver == null) {
            nfcEnableReceiver = null;
        }
        nfcEnableReceiver.detachFromScope();
        Activity activity = this.w;
        if (activity != null) {
            NfcEnableReceiver nfcEnableReceiver2 = this.A;
            if (nfcEnableReceiver2 == null) {
                nfcEnableReceiver2 = null;
            }
            activity.unregisterReceiver(nfcEnableReceiver2);
        }
        this.y = null;
        this.w = null;
        this.z = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        NfcAdapter nfcAdapter;
        if (!this.x || (nfcAdapter = this.y) == null) {
            return;
        }
        nfcAdapter.enableReaderMode(this.w, this.D, HProv.PP_FAST_CODE, new Bundle(0));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        NfcAdapter nfcAdapter = this.y;
        if (nfcAdapter != null) {
            nfcAdapter.disableReaderMode(this.w);
        }
    }
}
