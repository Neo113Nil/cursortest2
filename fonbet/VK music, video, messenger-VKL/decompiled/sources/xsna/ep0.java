package xsna;

import android.media.ImageWriter;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.proto.okmp.OkmpClient;
import xsna.nw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ep0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ep0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageWriter imageWriter;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) this.c;
                cvk.u(((th instanceof MalformedURLException) || (th instanceof JSONException)) ? R.string.video_wrong_link : R.string.error, false);
                return;
            case 1:
                AudioFocusRequestHelper.muteForever$lambda$6((AudioFocusRequestHelper) this.c);
                return;
            case 2:
                qr5 qr5Var = ((k86) this.c).q;
                qr5Var.getClass();
                UiTracker uiTracker = UiTracker.a;
                qr5Var.b = UiTracker.c();
                ((y1q0) qr5Var.a).c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.STORY_EDITOR), true);
                return;
            case 3:
                ChatClipsReplyFragment chatClipsReplyFragment = (ChatClipsReplyFragment) this.c;
                int i = ChatClipsReplyFragment.T;
                try {
                    chatClipsReplyFragment.tn();
                    s3q0 s3q0Var = s3q0.a;
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 4:
                fzf fzfVar = (fzf) this.c;
                fzfVar.c.setText("");
                fzfVar.c.setSelection(0);
                return;
            case 5:
                t5y0 t5y0Var = (t5y0) this.c;
                synchronized (t5y0Var.c) {
                    try {
                        if (!t5y0Var.d) {
                            t5y0Var.d = true;
                            if (t5y0Var.e == 0 && (imageWriter = t5y0Var.f) != null) {
                                imageWriter.close();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 6:
                c100 c100Var = (c100) this.c;
                jar jarVar = c100Var.d;
                m9r m9rVar = c100Var.a;
                if (jarVar == null) {
                    jarVar = null;
                }
                StringBuilder b = jarVar.c.b();
                File file = c100Var.k;
                if (file == null) {
                    file = null;
                }
                m9rVar.getClass();
                m9r.a(b, file);
                c100Var.h.setLength(0);
                File file2 = c100Var.k;
                if (file2 == null) {
                    file2 = null;
                }
                if (m9r.f(file2)) {
                    File file3 = c100Var.l;
                    if (file3 == null) {
                        file3 = null;
                    }
                    if (m9r.f(file3)) {
                        ExecutorService executorService = c100Var.e;
                        (executorService != null ? executorService : null).execute(c100Var.j);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                nw20.a aVar = (nw20.a) this.c;
                RecyclerView recyclerView = aVar.d.get();
                if (recyclerView == null) {
                    return;
                }
                aVar.b = recyclerView.computeVerticalScrollOffset();
                aVar.l();
                if (aVar.c) {
                    Handler handler = (Handler) aVar.f.getValue();
                    ep0 ep0Var = aVar.g;
                    if (ep0Var == null) {
                        ep0Var = new ep0(aVar, 7);
                        aVar.g = ep0Var;
                    }
                    handler.postDelayed(ep0Var, 16L);
                    return;
                }
                return;
            case 8:
                ((OkmpClient) this.c).stop();
                return;
            case 9:
                ((jr80) this.c).b.invoke();
                return;
            case 10:
                com.vk.story.viewer.impl.presentation.stories.b bVar = (com.vk.story.viewer.impl.presentation.stories.b) this.c;
                bVar.d0 = bVar.getCurrentStoryView();
                return;
            case 11:
                bwt0.p0((View) this.c, true);
                return;
            case 12:
                g8p0.setVisibility$lambda$1$lambda$0((g8p0) this.c);
                return;
            case 13:
                xlv0 xlv0Var = (xlv0) this.c;
                AtomicBoolean atomicBoolean = xlv0Var.d;
                eml emlVar = xlv0Var.g;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (!emlVar.d() && !xlv0Var.e.get()) {
                            arrayList.clear();
                            if (((ArrayBlockingQueue) emlVar.b).drainTo(arrayList, xlv0Var.a.a()) != 0 && !arrayList.isEmpty()) {
                                try {
                                    xlv0Var.h.b(arrayList);
                                } catch (Exception e) {
                                    L.f("VkStatImpl", "Failed to add events to storage", e);
                                }
                            }
                        }
                        atomicBoolean.set(false);
                        if (emlVar.d()) {
                            return;
                        }
                    } catch (Throwable th3) {
                        atomicBoolean.set(false);
                        if (!emlVar.d()) {
                            xlv0Var.d();
                        }
                        throw th3;
                    }
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    atomicBoolean.set(false);
                    if (emlVar.d()) {
                        return;
                    }
                } catch (Exception e2) {
                    L.f("VkStatImpl", "Error in drain loop", e2);
                    atomicBoolean.set(false);
                    if (emlVar.d()) {
                        return;
                    }
                }
                xlv0Var.d();
                return;
            case 14:
                ((yads.qq2) this.c).b();
                return;
            default:
                yads.sw2.a((yads.uw2) this.c);
                return;
        }
    }

    public /* synthetic */ ep0(hp0 hp0Var, Throwable th) {
        this.b = 0;
        this.c = th;
    }
}
