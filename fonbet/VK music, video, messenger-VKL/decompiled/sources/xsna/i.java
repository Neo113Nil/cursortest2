package xsna;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import androidx.media3.exoplayer.audio.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.A9;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.dto.stickers.StickerItem;
import com.vk.log.L;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import xsna.b72;
import xsna.hlw;
import xsna.snw;
import xsna.ub9;
import xsna.we9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        ArrayList arrayList = null;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                A9.a((InterstitialAd) this.c, (A9) this.d);
                return;
            case 1:
                b72.b.a((b72) this.c, (LongSparseArray) this.d);
                return;
            case 2:
                ea2 ea2Var = (ea2) this.c;
                hlw.a aVar = (hlw.a) this.d;
                ea2Var.getClass();
                aVar.d(ea2Var);
                return;
            case 3:
                b.a aVar2 = (b.a) this.c;
                g8l g8lVar = (g8l) this.d;
                androidx.media3.exoplayer.audio.b bVar = aVar2.b;
                String str = y2r0.a;
                bVar.s(g8lVar);
                return;
            case 4:
                ner0 ner0Var = (ner0) this.c;
                BoardTopicViewFragment boardTopicViewFragment = (BoardTopicViewFragment) this.d;
                Pattern pattern = BoardTopicViewFragment.H0;
                u1u0.b(ner0Var);
                boardTopicViewFragment.Bo();
                return;
            case 5:
                we9 we9Var = (we9) this.c;
                ub9.a aVar3 = (ub9.a) this.d;
                if (we9Var.o == null) {
                    if (we9Var.e != we9.e.RELEASED) {
                        we9Var.o = ub9.a(new ca6(we9Var, 2));
                    } else {
                        we9Var.o = snw.c.c;
                    }
                }
                ugz<Void> ugzVar = we9Var.o;
                switch (we9.b.a[we9Var.e.ordinal()]) {
                    case 1:
                    case 2:
                        obr.f(null, we9Var.j == null);
                        we9Var.v(we9.e.RELEASING, true);
                        obr.f(null, we9Var.p());
                        we9Var.n();
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                        boolean a = we9Var.h.a();
                        we9Var.v(we9.e.RELEASING, true);
                        if (a) {
                            obr.f(null, we9Var.p());
                            we9Var.n();
                            break;
                        }
                        break;
                    case 4:
                        we9Var.v(we9.e.RELEASING, true);
                        we9Var.l(false);
                        break;
                    default:
                        Objects.toString(we9Var.e);
                        we9Var.toString();
                        break;
                }
                r0t.f(true, ugzVar, aVar3, xo9.g());
                return;
            case 6:
                Looper looper = (Looper) this.c;
                izs izsVar = (izs) this.d;
                String valueOf = String.valueOf(o25.a().c().b);
                String b = go9.b("clips_active_draft", valueOf);
                String b2 = go9.b("clips_drafts", valueOf);
                synchronized (ClipsDraftPersistentStore.d) {
                    try {
                        if (ClipsDraftPersistentStore.e == null) {
                            try {
                                ClipsDraftPersistentStore.a aVar4 = ClipsDraftPersistentStore.c;
                                List i2 = ClipsDraftPersistentStore.a.i(aVar4, b, new ot(13), null, 12);
                                ClipsDraftPersistentStore.f = i2 != null ? (ClipsDraftVk) j5g.a0(i2) : null;
                                List i3 = ClipsDraftPersistentStore.a.i(aVar4, b2, new pt(17), null, 12);
                                ClipsDraftPersistentStore.Drafts drafts = i3 != null ? (ClipsDraftPersistentStore.Drafts) j5g.a0(i3) : null;
                                ClipsDraftPersistentStore.e = drafts;
                                if (drafts == null) {
                                    ClipsDraftPersistentStore.e = new ClipsDraftPersistentStore.Drafts(arrayList, i, objArr == true ? 1 : 0);
                                }
                                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                                ClipsDraftPersistentStore.Drafts drafts2 = ClipsDraftPersistentStore.e;
                                clipsDraftPersistentStore.getClass();
                                if (ClipsDraftPersistentStore.x(drafts2)) {
                                    ClipsDraftPersistentStore.a.k(aVar4, b2, Collections.singletonList(ClipsDraftPersistentStore.e));
                                }
                                if (!ClipsDraftPersistentStore.A(ClipsDraftPersistentStore.f)) {
                                    ClipsDraftPersistentStore.f = null;
                                    aVar4.b(b);
                                } else if (ClipsDraftPersistentStore.y(ClipsDraftPersistentStore.f)) {
                                    ClipsDraftPersistentStore.a.k(aVar4, b, Collections.singletonList(ClipsDraftPersistentStore.f));
                                }
                            } catch (Throwable th) {
                                ClipsDraftPersistentStore.b.getClass();
                                L.l("ClipsDraftPersistentStore", "Failed to load drafts: " + th);
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (looper != null) {
                    new Handler(looper).post(new ic3(izsVar, 3));
                    return;
                }
                return;
            case 7:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                com.google.firebase.messaging.a aVar5 = FirebaseMessaging.n;
                firebaseMessaging.getClass();
                try {
                    h3u h3uVar = firebaseMessaging.e;
                    h3uVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    Tasks.await(h3uVar.a(h3uVar.c(gi20.b(h3uVar.a), "*", bundle)));
                    com.google.firebase.messaging.a e = FirebaseMessaging.e(firebaseMessaging.d);
                    String f = firebaseMessaging.f();
                    String b3 = gi20.b(firebaseMessaging.a);
                    synchronized (e) {
                        String a2 = com.google.firebase.messaging.a.a(f, b3);
                        SharedPreferences.Editor edit = e.a.edit();
                        edit.remove(a2);
                        edit.commit();
                    }
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
            case 8:
                return;
            default:
                ((q4l0) this.c).q.a0((StickerItem) this.d);
                return;
        }
    }

    public /* synthetic */ i(im50 im50Var, Object obj, lm50 lm50Var) {
        this.b = 8;
        this.c = obj;
        this.d = lm50Var;
    }

    private final void a() {
    }
}
