package com.yandex.quark.js.implementation.webView.internal;

import android.webkit.JavascriptInterface;
import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.js.event.i;
import com.yandex.quark.js.implementation.common.CapabilityMessageClassNotFoundException;
import com.yandex.quark.utils.Disposable;
import defpackage.b64;
import defpackage.ffo;
import defpackage.h38;
import defpackage.hba1;
import defpackage.i3y;
import defpackage.ifo;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jyj0;
import defpackage.ks1;
import defpackage.lfo;
import defpackage.lyj0;
import defpackage.mfo;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.pzt0;
import defpackage.sb2;
import defpackage.syj0;
import defpackage.w511;
import defpackage.z83;
import defpackage.zcx;
import defpackage.zhg0;
import defpackage.zwf0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class a implements zhg0, mfo {
    public final zwf0 a;
    public final ike b;
    public final h38 c;
    public final zcx w;
    public final CopyOnWriteArraySet x = new CopyOnWriteArraySet();
    public volatile kotlinx.coroutines.channels.a y;
    public pzt0 z;

    public a(zwf0 zwf0Var, ike ikeVar, h38 h38Var, zcx zcxVar) {
        this.a = zwf0Var;
        this.b = ikeVar;
        this.c = h38Var;
        this.w = zcxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        r0.a("EventHandlerBridge", defpackage.b64.l("Failed to handle event with type = ", r3, ru.CryptoPro.JCP.tools.CertReader.Extension.COLON_SPACE, r4), r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, i iVar, ContinuationImpl continuationImpl) {
        EventHandlerBridge$handleEvent$1 eventHandlerBridge$handleEvent$1;
        int i;
        i iVar2;
        Iterator it;
        zwf0 zwf0Var = aVar.a;
        if (continuationImpl instanceof EventHandlerBridge$handleEvent$1) {
            eventHandlerBridge$handleEvent$1 = (EventHandlerBridge$handleEvent$1) continuationImpl;
            int i2 = eventHandlerBridge$handleEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eventHandlerBridge$handleEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eventHandlerBridge$handleEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eventHandlerBridge$handleEvent$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    syj0 b = aVar.c.b(iVar);
                    if (!(b instanceof lyj0)) {
                        if (!(b instanceof jyj0)) {
                            w511.b();
                            return null;
                        }
                        Throwable th = (Throwable) ((jyj0) b).a;
                        if (th instanceof CapabilityMessageClassNotFoundException) {
                            String b2 = iVar.b();
                            String message = th.getMessage();
                            zwf0Var.e("EventHandlerBridge", b64.l("Failed to handle event[", b2, "]: ", message != null ? message : ""));
                            return zy11Var;
                        }
                        String b3 = iVar.b();
                        String message2 = th.getMessage();
                        zwf0Var.f("EventHandlerBridge", b64.l("Failed to handle event[", b3, "]: ", message2 != null ? message2 : ""));
                        return zy11Var;
                    }
                    iVar2 = (i) ((lyj0) b).a;
                    it = aVar.x.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) eventHandlerBridge$handleEvent$1.L$1;
                    iVar2 = (i) eventHandlerBridge$handleEvent$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th2) {
                        String b4 = iVar2.b();
                        String message3 = th2.getMessage();
                        if (message3 == null) {
                        }
                        zwf0Var.a("EventHandlerBridge", b64.l("Failed to handle event with type = ", b4, Extension.COLON_SPACE, ""), th2);
                    }
                }
                while (it.hasNext()) {
                    ifo ifoVar = (ifo) it.next();
                    if (ifoVar.c(iVar2)) {
                        eventHandlerBridge$handleEvent$1.L$0 = iVar2;
                        eventHandlerBridge$handleEvent$1.L$1 = it;
                        eventHandlerBridge$handleEvent$1.label = 1;
                        if (ifoVar.g(iVar2, eventHandlerBridge$handleEvent$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11Var;
            }
        }
        eventHandlerBridge$handleEvent$1 = new EventHandlerBridge$handleEvent$1(aVar, continuationImpl);
        Object obj2 = eventHandlerBridge$handleEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eventHandlerBridge$handleEvent$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11Var2;
    }

    @Override // defpackage.mfo
    public final Disposable a(ifo ifoVar) {
        this.x.add(ifoVar);
        return new ks1(4, this, ifoVar);
    }

    @Override // defpackage.zhg0
    public final void d(QuarkJsState quarkJsState) {
        int i = lfo.a[quarkJsState.ordinal()];
        if (i == 1) {
            kotlinx.coroutines.channels.a a = sb2.a(Integer.MAX_VALUE, null, null, 6);
            this.y = a;
            this.z = jl40.D(this.b, "handle-js-events", new EventHandlerBridge$startHandling$1(a, this, null));
            return;
        }
        if (i == 2) {
            pzt0 pzt0Var = this.z;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.z = null;
            kotlinx.coroutines.channels.a aVar = this.y;
            if (aVar != null) {
                aVar.l(null);
            }
            this.y = null;
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            w511.b();
            return;
        }
        pzt0 pzt0Var2 = this.z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.z = null;
        kotlinx.coroutines.channels.a aVar2 = this.y;
        if (aVar2 != null) {
            aVar2.l(null);
        }
        this.y = null;
        this.x.clear();
    }

    @JavascriptInterface
    public final void handleEvent(String str, String str2) {
        i3y i3yVar = i.c;
        syj0 e = hba1.e(str, str2, this.w);
        if (!(e instanceof lyj0)) {
            if (!(e instanceof jyj0)) {
                w511.b();
                return;
            } else {
                this.a.f("EventHandlerBridge", b64.l("Failed to create event ", str, Extension.COLON_SPACE, ((ffo) ((jyj0) e).a).a()));
                return;
            }
        }
        i iVar = (i) ((lyj0) e).a;
        kotlinx.coroutines.channels.a aVar = this.y;
        if (aVar == null) {
            z83.i();
        } else {
            aVar.d(iVar);
            ni9 ni9Var = oi9.b;
        }
    }
}
