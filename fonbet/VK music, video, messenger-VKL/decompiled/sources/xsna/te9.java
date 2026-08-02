package xsna;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.MemoryFile;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.firebase.perf.util.Timer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoModel;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.bzp0;
import xsna.wka;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class te9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ te9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x023b, code lost:
    
        if (r8.b != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239 A[Catch: all -> 0x023e, Exception -> 0x0240, TRY_LEAVE, TryCatch #0 {Exception -> 0x0240, blocks: (B:85:0x022a, B:87:0x0239), top: B:84:0x022a, outer: #6 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList<MemoryFile> arrayList;
        ArrayList<MemoryFile> arrayList2;
        boolean z;
        MediaUtils.e eVar;
        MediaCodec mediaCodec;
        zif0 zif0Var;
        zif0 dhwVar;
        char c = 2;
        boolean z2 = true;
        int i = 0;
        switch (this.b) {
            case 0:
                we9 we9Var = (we9) this.c;
                Collection<vfq0> collection = (Collection) this.d;
                re9 re9Var = we9Var.g;
                try {
                    we9Var.w(collection);
                    return;
                } finally {
                    re9Var.h();
                }
            case 1:
                ArrayList arrayList3 = (ArrayList) this.c;
                wka wkaVar = (wka) this.d;
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    wka.c cVar = (wka.c) it.next();
                    hla hlaVar = cVar.a;
                    int i2 = cVar.b;
                    int i3 = cVar.c;
                    int i4 = cVar.d;
                    int i5 = cVar.e;
                    View view = hlaVar.itemView;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (i7 != 0) {
                        view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    wkaVar.u.add(hlaVar);
                    animate.setDuration(wkaVar.e).setListener(new ala(wkaVar, hlaVar, i6, view, i7, animate)).start();
                }
                arrayList3.clear();
                wkaVar.r.remove(arrayList3);
                return;
            case 2:
                z3k z3kVar = (z3k) this.c;
                com.google.firebase.perf.v1.d b = z3kVar.b((Timer) this.d);
                if (b != null) {
                    z3kVar.a.add(b);
                    return;
                }
                return;
            case 3:
                d8l d8lVar = (d8l) this.c;
                RecorderBase.b bVar = (RecorderBase.b) this.d;
                d8lVar.getClass();
                zna0 zna0Var = (zna0) d8lVar;
                aoa0 aoa0Var = zna0Var.c;
                synchronized (aoa0Var.a) {
                    arrayList = aoa0Var.b;
                }
                if (arrayList.isEmpty() || zna0Var.b) {
                    return;
                }
                bVar.a.f(-1002);
                aoa0 aoa0Var2 = zna0Var.c;
                synchronized (aoa0Var2.a) {
                    arrayList2 = aoa0Var2.b;
                }
                if (arrayList2.size() <= 2 || zna0Var.f == null) {
                    z = false;
                } else {
                    MediaUtils.e eVar2 = zna0Var.h;
                    if (eVar2 != null) {
                        MediaUtils.d dVar = zna0Var.c.d;
                        if (dVar != null) {
                            eVar2.a = dVar.a;
                            eVar2.b = dVar.b;
                        }
                        eVar = eVar2;
                    } else {
                        eVar = null;
                    }
                    try {
                        try {
                            if (eVar != null) {
                                synchronized (zna0Var) {
                                    if (zna0Var.d == null) {
                                        zna0Var.b();
                                        zna0Var.h = eVar;
                                        MediaUtils.d c2 = io9.c(eVar, true);
                                        if (!c2.d()) {
                                            q8l.a.getClass();
                                            try {
                                                mediaCodec = MediaCodec.createEncoderByType("video/avc");
                                            } catch (Exception e) {
                                                e.toString();
                                                mediaCodec = null;
                                            }
                                            zna0Var.d = mediaCodec;
                                            if (mediaCodec != null) {
                                                int i8 = c2.a;
                                                int i9 = c2.b;
                                                int max = Math.max((int) (i8 * i9 * 80 * 0.07d), eVar.c);
                                                q8l.a.getClass();
                                                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i8, i9);
                                                createVideoFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, max);
                                                createVideoFormat.setInteger("frame-rate", (int) 38);
                                                createVideoFormat.setInteger("i-frame-interval", 3);
                                                createVideoFormat.setInteger("max-input-size", 0);
                                                MediaCodec mediaCodec2 = zna0Var.d;
                                                MediaCodecInfo a = q8l.a();
                                                if (a != null) {
                                                    int[] iArr = a.getCapabilitiesForType("video/avc").colorFormats;
                                                    int length = iArr.length;
                                                    int i10 = 0;
                                                    while (i10 < length) {
                                                        int i11 = iArr[i10];
                                                        char c3 = c;
                                                        if (i11 == 19 || i11 == 21) {
                                                            createVideoFormat.setInteger("color-format", i11);
                                                            try {
                                                                mediaCodec2.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                                                                q8l.a.getClass();
                                                                zna0Var.g = createVideoFormat.getInteger("color-format") == 19;
                                                            } catch (Exception e2) {
                                                                e2.toString();
                                                            }
                                                        }
                                                        i10++;
                                                        c = c3;
                                                    }
                                                }
                                                s3q0 s3q0Var = s3q0.a;
                                                zna0Var.c(true);
                                            }
                                        }
                                    }
                                }
                                zna0Var.d.start();
                                zna0Var.b = true;
                                if (zna0Var.a(Math.max((int) Math.ceil(3000.0d / (((r9 * 2) - 2) * 26)), 3), arrayList2)) {
                                    break;
                                }
                                z2 = false;
                                zna0Var.c.a();
                                zna0Var.d();
                                zna0Var.c(false);
                                z = z2;
                            }
                            if (zna0Var.a(Math.max((int) Math.ceil(3000.0d / (((r9 * 2) - 2) * 26)), 3), arrayList2)) {
                            }
                            z2 = false;
                            zna0Var.c.a();
                            zna0Var.d();
                            zna0Var.c(false);
                            z = z2;
                        } catch (Exception e3) {
                            Log.e("zna0", "can't decode " + e3);
                            zna0Var.c.a();
                            zna0Var.d();
                            zna0Var.c(false);
                            z = false;
                        }
                    } catch (Throwable th) {
                        zna0Var.c.a();
                        zna0Var.d();
                        zna0Var.c(false);
                        throw th;
                    }
                    zna0Var.d.start();
                    zna0Var.b = true;
                }
                com.vk.media.recorder.d dVar2 = bVar.a;
                dVar2.r = RecorderBase.State.PREPARED;
                dVar2.a.post(new com.vk.media.recorder.b(dVar2, z));
                return;
            case 4:
                L0.a((L0) this.c, (PluginErrorDetails) this.d);
                return;
            case 5:
                v220 v220Var = (v220) this.c;
                com.google.firebase.perf.v1.b b2 = v220Var.b((Timer) this.d);
                if (b2 != null) {
                    v220Var.b.add(b2);
                    return;
                }
                return;
            case 6:
                s2j0 s2j0Var = (s2j0) this.c;
                View view2 = (View) this.d;
                s2j0Var.p.a(view2.getWidth(), view2.getHeight());
                s2j0Var.q.a(view2.getWidth(), view2.getHeight());
                return;
            case 7:
                qtu0 qtu0Var = (qtu0) this.c;
                bzp0.b bVar2 = (bzp0.b) this.d;
                qtu0Var.getClass();
                qtu0.e(System.currentTimeMillis(), qtu0Var, bVar2);
                return;
            case 8:
                VkMediaPicker vkMediaPicker = (VkMediaPicker) this.c;
                VkMediaPicker.State state = (VkMediaPicker.State) this.d;
                gt10 gt10Var = vkMediaPicker.h;
                if (gt10Var != null) {
                    VkMediaPicker.State.b bVar3 = (VkMediaPicker.State.b) state;
                    ArrayList<yp10> arrayList4 = bVar3.a;
                    VkMediaPicker.State.Footer footer = bVar3.c;
                    ArrayList arrayList5 = new ArrayList();
                    for (yp10 yp10Var : arrayList4) {
                        if (yp10Var instanceof pg9) {
                            pg9 pg9Var = (pg9) yp10Var;
                            if (pg9Var.b) {
                                zif0Var = eg9.a;
                            } else {
                                dhwVar = new og9(pg9Var.a);
                                zif0Var = dhwVar;
                            }
                        } else if (yp10Var instanceof ehw) {
                            dhwVar = new dhw((ehw) yp10Var);
                            zif0Var = dhwVar;
                        } else {
                            zif0Var = yp10Var instanceof fk90 ? ek90.a : yp10Var instanceof isa0 ? hsa0.a : null;
                        }
                        if (zif0Var != null) {
                            arrayList5.add(zif0Var);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(arrayList5);
                    int i12 = VkMediaPicker.i.$EnumSwitchMapping$0[footer.ordinal()];
                    if (i12 == 1) {
                        arrayList6.add(w6s.a);
                    } else if (i12 == 2) {
                        arrayList6.add(k6s.a);
                    } else if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gt10Var.setItems(arrayList6);
                    return;
                }
                return;
            default:
                y7w0 y7w0Var = (y7w0) this.c;
                new q4q0().a(y7w0Var.c, (VmojiProductUnlockInfoModel) this.d, new w7w0(y7w0Var, i));
                return;
        }
    }
}
