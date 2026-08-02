package xsna;

import android.os.Trace;
import android.view.View;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachGift;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.inappreview.InAppReviewConditionKey;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.xhv0;

/* compiled from: InAppReviewReporterImpl.kt */
/* loaded from: classes11.dex */
public final class prw implements orw, zuf {
    public static final prw b = new prw();
    public static volatile boolean c;

    public static final Runnable e(final Runnable runnable) {
        if (!ndp0.e()) {
            return runnable;
        }
        final String str = "TracingExecutor " + runnable.getClass().getCanonicalName();
        return new Runnable() { // from class: xsna.qep0
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                ndp0.b(str);
                try {
                    runnable2.run();
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                    Trace.endSection();
                }
            }
        };
    }

    public static final Callable f(final Callable callable) {
        if (!ndp0.e()) {
            return callable;
        }
        final String str = "TracingExecutor " + callable.getClass().getCanonicalName();
        return new Callable() { // from class: xsna.rep0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Callable callable2 = callable;
                ndp0.b(str);
                try {
                    return callable2.call();
                } finally {
                    Trace.endSection();
                }
            }
        };
    }

    public static final void g(lq9 lq9Var, spj spjVar, boolean z) {
        Object obj = lq9.h.get(lq9Var);
        Throwable c2 = lq9Var.c(obj);
        Object failure = c2 != null ? new Result.Failure(c2) : lq9Var.e(obj);
        if (!z) {
            spjVar.resumeWith(failure);
            return;
        }
        mcn mcnVar = (mcn) spjVar;
        ContinuationImpl continuationImpl = mcnVar.f;
        Object obj2 = mcnVar.h;
        kotlin.coroutines.d context = continuationImpl.getContext();
        Object b2 = mqo0.b(context, obj2);
        z2q0<?> c3 = b2 != mqo0.a ? mvj.c(continuationImpl, context, b2) : null;
        try {
            mcnVar.f.resumeWith(failure);
            s3q0 s3q0Var = s3q0.a;
            if (c3 == null || c3.y0()) {
                mqo0.a(context, b2);
            }
        } catch (Throwable th) {
            if (c3 == null || c3.y0()) {
                mqo0.a(context, b2);
            }
            throw th;
        }
    }

    public static void h(f5z f5zVar, String str, String str2) {
        yhv0.a.getClass();
        xhv0.b bVar = new xhv0.b(f5zVar);
        StringBuilder b2 = v1v.b(str, '@');
        b2.append(f5zVar.hashCode());
        String sb = b2.toString();
        CopyOnWriteArraySet<xhv0.b> copyOnWriteArraySet = xhv0.b;
        if (copyOnWriteArraySet.contains(bVar)) {
            par0.a.getClass();
            par0.e("VkSdkUiListenerImpl: addLifecycleOwner was call but lifecycleOwner (" + sb + ") was already add in listener");
            return;
        }
        f5zVar.getLifecycle().addObserver(new xhv0.a());
        copyOnWriteArraySet.add(bVar);
        par0 par0Var = par0.a;
        StringBuilder a = t33.a("VkSdkUiListenerImpl: addLifecycleOwner call and lifecycleOwner (", sb, ") add to listener ");
        if (str2 == null) {
            str2 = "";
        }
        a.append(str2);
        String sb2 = a.toString();
        par0Var.getClass();
        par0.e(sb2);
    }

    @Override // xsna.zuf
    public long C() {
        return System.currentTimeMillis();
    }

    @Override // xsna.orw
    public void a() {
        if (o25.b(o25.a())) {
            return;
        }
        itg0.j(fsk.t().b(InAppReviewConditionKey.SEND_MESSAGE, on00.f(new Pair(InAppReviewConditionKey.KEY_CHECK_COUNTER, Boolean.TRUE))), null, 3);
    }

    @Override // xsna.orw
    public void b() {
        io.reactivex.rxjava3.core.a b2;
        if (o25.b(o25.a())) {
            return;
        }
        b2 = fsk.t().b(InAppReviewConditionKey.CREATE_FOLDER, jgp.b);
        itg0.j(b2, null, 3);
    }

    @Override // xsna.orw
    public void c(Msg msg, Attach attach, boolean z, View view) {
        String str;
        boolean z2 = attach instanceof AttachGift;
        if (z && z2 && BuildInfo.s() && msg.Kb()) {
            zqw t = fsk.t();
            InAppReviewConditionKey inAppReviewConditionKey = InAppReviewConditionKey.OPEN_3_NEW_GIFT_FROM_MESSENGER;
            if (z2) {
                AttachGift attachGift = (AttachGift) attach;
                str = (attachGift.f() || attachGift.d()) ? String.valueOf(msg.Z5()) : String.valueOf(attachGift.getId());
            } else {
                str = "";
            }
            io.reactivex.rxjava3.core.a b2 = t.b(inAppReviewConditionKey, on00.f(new Pair("gift_id_key", str)));
            int i = kwg0.a;
            itg0.b(view, b2.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new hwg0()));
        }
    }

    @Override // xsna.orw
    public void d(List list) {
        io.reactivex.rxjava3.core.a b2;
        io.reactivex.rxjava3.core.a b3;
        if (o25.b(o25.a())) {
            return;
        }
        List<Attach> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Attach attach : list2) {
                if ((attach instanceof AttachVideoMsg) || (attach instanceof AttachAudioMsg)) {
                    b2 = fsk.t().b(InAppReviewConditionKey.SEND_VIDEO_OR_AUDIO_MESSAGES, jgp.b);
                    itg0.j(b2, null, 3);
                    break;
                }
            }
        }
        b3 = fsk.t().b(InAppReviewConditionKey.SEND_MESSAGE, jgp.b);
        itg0.j(b3, null, 3);
    }
}
