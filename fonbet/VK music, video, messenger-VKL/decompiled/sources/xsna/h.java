package xsna;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.audio.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.A9;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.core.fragments.internal.transition.TransitionAnimation;
import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.reefton.Reef;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.mail.libverify.api.j;
import ru.ok.gleffects.EffectHolder;
import xsna.lze;
import xsna.we9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        String str;
        int i = 0;
        switch (this.b) {
            case 0:
                A9.a((IronSourceError) this.c, (A9) this.d);
                break;
            case 1:
                b.a aVar = (b.a) this.c;
                String str2 = (String) this.d;
                androidx.media3.exoplayer.audio.b bVar = aVar.b;
                String str3 = y2r0.a;
                bVar.l(str2);
                break;
            case 2:
                we9 we9Var = (we9) this.c;
                vfq0 vfq0Var = (vfq0) this.d;
                vfq0Var.toString();
                we9Var.toString();
                we9Var.b.d(vfq0Var.e() + vfq0Var.hashCode(), vfq0Var.k);
                we9Var.u();
                we9Var.y();
                if (we9Var.e == we9.e.OPENED) {
                    we9Var.r();
                    break;
                }
                break;
            case 3:
                xk9 xk9Var = (xk9) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                hts0 hts0Var = xk9Var.S;
                if (hts0Var != null) {
                    hts0Var.i.setStencilBitmap(bitmap, true);
                }
                xk9Var.R = bitmap;
                break;
            case 4:
                lze.d dVar = (lze.d) this.c;
                tze tzeVar = (tze) this.d;
                ClipPreviewInputParams clipPreviewInputParams = dVar.b;
                try {
                    List<ISerializableStickerSDK> list = clipPreviewInputParams.c;
                    Size size = clipPreviewInputParams.d;
                    if (list.isEmpty()) {
                        obj = EmptyList.b;
                    } else {
                        c1f c = new z3l0().c(list, new MediaUtils.d(size));
                        c.f();
                        obj = Collections.singletonList(c);
                    }
                } catch (Throwable th) {
                    L.f("ClipsPublishViewerOverlayFeature", "Failed to retrieve layers with error: ", th);
                    obj = EmptyList.b;
                }
                Object obj2 = obj;
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                swe sweVar = new swe(clipPreviewInputParams, tzeVar, dVar, obj2, 1);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(sweVar);
                break;
            case 5:
                ((EffectHolder) this.c).lambda$setMaskEngineAsset$0((String) this.d);
                break;
            case 6:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                com.google.firebase.messaging.a aVar2 = FirebaseMessaging.n;
                firebaseMessaging.getClass();
                try {
                    vir virVar = firebaseMessaging.b;
                    gi20.b(firebaseMessaging.a);
                    virVar.a();
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 7:
                uic uicVar = ((im50) this.c).e;
                if (uicVar != null) {
                    uicVar.clear();
                    break;
                }
                break;
            case 8:
                File file = (File) this.c;
                com.vk.media.ok.b bVar2 = (com.vk.media.ok.b) this.d;
                if (file == null) {
                    bVar2.G.muteAudio(false);
                    break;
                } else {
                    bVar2.G.muteAudio(true);
                    break;
                }
            case 9:
                ((TransitionAnimation) this.c).s3((qj2) this.d);
                break;
            case 10:
                owl0 owl0Var = (owl0) this.c;
                owl0Var.c = (Reef) this.d;
                ArrayList arrayList = owl0Var.b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                arrayList.clear();
                break;
            case 11:
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                if (!com.vk.voip.ui.c.b.s0() && str4.equals(String.valueOf(com.vk.voip.ui.c.K))) {
                    String[] strArr = s200.g;
                    Long n = arm0.n(str5);
                    if (n != null) {
                        long abs = Math.abs(n.longValue());
                        String obj3 = drm0.p0(strArr[(int) (abs % 105)]).toString();
                        str = obj3 + (abs % 9999);
                    } else {
                        int length = str5.length();
                        int i2 = 3;
                        int i3 = 0;
                        while (true) {
                            if (i < length) {
                                int codePointAt = str5.codePointAt(i);
                                int T = rl3.T(codePointAt, s200.f);
                                if (T < 0) {
                                    L.f("SASMapper", "Cannot find expected emoji in the string ".concat(str5), new Exception("Cannot find expected emoji in the string ".concat(str5)));
                                } else {
                                    i3 += T * ((int) Math.pow(32.0d, i2));
                                    i2--;
                                    i += Character.charCount(codePointAt);
                                }
                            } else if (i2 != -1) {
                                L.f("SASMapper", "Unexpected emojis count in ".concat(str5), new Exception("Unexpected emojis count in ".concat(str5)));
                            } else {
                                str = drm0.p0(strArr[i3 % 105]).toString() + (i3 / 105);
                            }
                        }
                        str = "";
                    }
                    if (!epx.f(com.vk.voip.ui.c.L0, str)) {
                        com.vk.voip.ui.c.L0 = str;
                        com.vk.voip.ui.c.D0();
                        break;
                    }
                }
                break;
            case 12:
                ru.mail.libverify.i.a.a((ru.mail.libverify.i.b) this.c, (j.b) this.d);
                break;
            default:
                yads.rl3.a((ViewGroup) this.c, (View) this.d);
                break;
        }
    }
}
