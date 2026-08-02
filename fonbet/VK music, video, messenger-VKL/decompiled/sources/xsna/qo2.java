package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.google.android.datatransport.Priority;
import com.ironsource.C4405kb;
import com.ironsource.C4462ne;
import com.ironsource.Ce;
import com.ironsource.InterfaceC4441mb;
import com.ironsource.InterfaceC4569te;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.InitializationListener;
import com.unity3d.services.core.properties.SdkProperties;
import com.vk.log.L;
import com.vk.superapp.api.dto.story.WebStoryBox;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import ru.ok.media.PublisherImpl;
import ru.ok.media.api.H264VideoProvider;
import ru.ok.media.video.H264Encoder;
import ru.ok.proto.NetPublisher;
import ru.ok.tensorflow.util.Producer;
import ru.ok.wrapper.AsyncWrapper;
import xsna.fi50;
import xsna.ilq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qo2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qo2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        izs<R, s3q0> izsVar;
        int i = this.b;
        nov novVar = null;
        r2 = null;
        r2 = null;
        r2 = null;
        SQLiteDatabase sQLiteDatabase = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                View view = (View) obj2;
                Runnable runnable = (Runnable) obj;
                cp2.a(view, view.getAlpha(), view.getTranslationY());
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((AsyncWrapper) obj2).lambda$submitTask$0((Producer) obj);
                return;
            case 2:
                Ce.a.a((C4462ne) obj2, (InterfaceC4569te) obj);
                return;
            case 3:
                ((d5k) obj2).a((k1j0) obj);
                return;
            case 4:
                H264Encoder.start$lambda$6((H264Encoder) obj2, (H264VideoProvider.Params) obj);
                return;
            case 5:
                u440 u440Var = (u440) obj2;
                tam0 tam0Var = (tam0) obj;
                u440Var.x7();
                CopyOnWriteArrayList<nov> copyOnWriteArrayList = tam0Var.h.a;
                int i2 = 0;
                while (true) {
                    if (i2 != copyOnWriteArrayList.size()) {
                        if (copyOnWriteArrayList.get(i2) instanceof lo9) {
                            novVar = copyOnWriteArrayList.get(i2);
                        } else {
                            i2++;
                        }
                    }
                }
                if (novVar == null) {
                    tam0 tam0Var2 = u440Var.B0;
                    Object[] objArr = tam0Var2 != null && tam0Var2.c;
                    Object[] objArr2 = (tam0Var2 == null || tam0Var2.c || !tam0Var2.g()) ? false : true;
                    WebStoryBox webStoryBox = u440Var.j.x().e;
                    if (webStoryBox == null || !webStoryBox.Db() || objArr == true || objArr2 == true) {
                        u440Var.v2(u440Var.W7(tam0Var, true));
                        return;
                    }
                    u440Var.L7();
                    mat0 mat0Var = tam0Var.b.get(0);
                    g440 g440Var = (g440) u440Var.s;
                    qx5 qx5Var = new qx5(g440Var.getRequireContext(), mat0Var, u440Var.k0, u440Var.m0, null, u440Var.l0, null, PsExtractor.AUDIO_STREAM);
                    qx5Var.z();
                    if (mat0Var.b() * mat0Var.c() != 0) {
                        bpn0 bpn0Var = z5l0.a;
                        qx5Var.setStickerScale(z5l0.d(mat0Var.c(), mat0Var.b(), g440Var.getLayoutWidth(), g440Var.getLayoutHeight()));
                        qx5Var.setOriginalStickerScale(qx5Var.getStickerScale());
                    }
                    qx5Var.setRemovable(false);
                    qx5Var.setStatic(tam0Var.f);
                    u440Var.v2(qx5Var);
                    return;
                }
                return;
            case 6:
                fi50 fi50Var = (fi50) obj2;
                S s = (S) obj;
                fi50.a<S, R> aVar = fi50Var.c;
                if (aVar != 0 && (izsVar = aVar.a) != 0) {
                    izsVar.invoke((fm50) fi50Var.a.b.getValue());
                }
                fi50Var.d = s;
                return;
            case 7:
                ((PublisherImpl) obj2).lambda$startNetworkMonitor$13((NetPublisher) obj);
                return;
            case 8:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    pop0<j5k> pop0Var = ((q5g0) obj2).h;
                    Priority priority = Priority.HIGHEST;
                    if (pop0Var instanceof vop0) {
                        zop0.a().d.a(((vop0) pop0Var).a.e(priority), 1);
                    } else if (Log.isLoggable("TRuntime.".concat("ForcedSender"), 5)) {
                        String.format("Expected instance of `TransportImpl`, got `%s`.", pop0Var);
                    }
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 9:
                SdkProperties.lambda$notifyInitializationFailed$1((InitializationListener) obj2, (String) obj);
                return;
            case 10:
                jlq0 jlq0Var = (jlq0) obj2;
                Collection<T> collection = ((spp) obj).a;
                if (collection.isEmpty()) {
                    return;
                }
                ilq0.a<T> aVar2 = jlq0Var.c.a;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                try {
                    try {
                        SQLiteDatabase writableDatabase = gr80.b(context).getWritableDatabase();
                        if (writableDatabase != null) {
                            try {
                                writableDatabase.beginTransaction();
                                String tableName = aVar2.getTableName();
                                Iterator it = collection.iterator();
                                while (it.hasNext()) {
                                    writableDatabase.insert(tableName, null, aVar2.c(it.next()));
                                }
                                writableDatabase.setTransactionSuccessful();
                            } catch (Exception e) {
                                e = e;
                                sQLiteDatabase = writableDatabase;
                                com.vk.metrics.eventtracking.b.a.a(e);
                                L.f("vk", "Error writing in " + aVar2.getTableName() + " DB", e);
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.endTransaction();
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase = writableDatabase;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.endTransaction();
                                }
                                throw th;
                            }
                        }
                        if (writableDatabase != null) {
                            writableDatabase.endTransaction();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                return;
            case 11:
                C4405kb.a((C4405kb) obj2, (InterfaceC4441mb) obj);
                return;
            case 12:
                w7z0 w7z0Var = (w7z0) obj2;
                qty0 qty0Var = w7z0Var.h;
                z6z0 z6z0Var = w7z0Var.b;
                w7z0Var.g = thz0.a(z6z0Var, 1, null, qty0Var.getContext());
                w7z0Var.e = new WeakReference(qty0Var);
                ((ProgressBar) obj).setVisibility(8);
                qty0Var.setVisibility(0);
                izy0 izy0Var = w7z0Var.c;
                if (izy0Var != null) {
                    izy0Var.h();
                }
                izy0 b = izy0.b(z6z0Var.b, z6z0Var.a, null);
                w7z0Var.c = b;
                if (w7z0Var.j) {
                    b.f(qty0Var);
                    return;
                }
                return;
            default:
                com.vungle.ads.internal.ui.z.c((com.vungle.ads.internal.ui.z) obj2, (WebView) obj);
                return;
        }
    }
}
