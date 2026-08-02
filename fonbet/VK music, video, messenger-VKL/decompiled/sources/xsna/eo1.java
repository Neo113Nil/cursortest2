package xsna;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.camera.core.impl.t;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.simplescreen.ScreenContainer;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.music.offline.impl.mediastore.download.service.DownloadService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.mail.libverify.api.VerificationApi;
import ru.ok.gleffects.impl.EffectNativeSink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class eo1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eo1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((ContentResolver) ((ko1) this.c).b.getValue()).unregisterContentObserver((jo1) this.d);
                return;
            case 1:
                we9 we9Var = (we9) this.c;
                vfq0 vfq0Var = (vfq0) this.d;
                androidx.camera.core.impl.t tVar = we9Var.b;
                vfq0Var.toString();
                we9Var.toString();
                try {
                    String str = vfq0Var.e() + vfq0Var.hashCode();
                    androidx.camera.core.impl.r rVar = vfq0Var.k;
                    HashMap hashMap = tVar.a;
                    t.a aVar = (t.a) hashMap.get(str);
                    if (aVar == null) {
                        aVar = new t.a(rVar);
                        hashMap.put(str, aVar);
                    }
                    aVar.c = true;
                    tVar.d(vfq0Var.e() + vfq0Var.hashCode(), vfq0Var.k);
                    we9Var.y();
                    return;
                } catch (NullPointerException unused) {
                    we9Var.toString();
                    return;
                }
            case 2:
                ((DownloadService) this.c).n(((com.vk.music.offline.impl.mediastore.download.service.a) this.d).c.o);
                return;
            case 3:
                ((EffectNativeSink) this.c).lambda$onUsingGesturesChanged$8((String[]) this.d);
                return;
            case 4:
                ((FrameLayout) this.c).addView((VkImageSimple) this.d);
                return;
            case 5:
                ci60 ci60Var = (ci60) this.c;
                RecyclerView.e0 e0Var = (RecyclerView.e0) this.d;
                Iterator<zjf0<ol60>> it = ci60Var.c.iterator();
                while (it.hasNext()) {
                    it.next().b(e0Var);
                }
                return;
            case 6:
                zdh0 zdh0Var = (zdh0) this.c;
                Uri uri = (Uri) this.d;
                zdh0Var.f.lock();
                try {
                    zdh0Var.b(uri);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 7:
                l4o0 l4o0Var = (l4o0) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ?? r0 = l4o0Var.h;
                if (r0 != 0) {
                    r0.n1(arrayList);
                    return;
                }
                return;
            case 8:
                com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) this.c;
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) this.d;
                com.vk.attachpicker.screen.m mVar = new com.vk.attachpicker.screen.m(mediaStoreEntry.f(), pVar.M, pVar.N, pVar.O, new com.vk.attachpicker.screen.q(pVar, mediaStoreEntry), pVar.U);
                pVar.S.u(pVar.z);
                ScreenContainer screenContainer = pVar.f;
                if (screenContainer != null) {
                    screenContainer.d(mVar);
                    return;
                }
                return;
            case 9:
                yads.cq.a((yads.cq) this.c, (Bitmap) this.d);
                return;
            default:
                ((ru.mail.libverify.api.q) this.c).a((VerificationApi.VerificationStateChangedListener) this.d);
                return;
        }
    }
}
