package com.yandex.plus.home.feature.webviews.internal.bridge;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.log.api.LogPriority;
import defpackage.EvgenDiagnostic$WebViewType;
import defpackage.a441;
import defpackage.bt80;
import defpackage.bv80;
import defpackage.bw80;
import defpackage.cs80;
import defpackage.dc20;
import defpackage.dje;
import defpackage.et80;
import defpackage.eu80;
import defpackage.ev80;
import defpackage.evu0;
import defpackage.fs80;
import defpackage.fw80;
import defpackage.hsd0;
import defpackage.hv80;
import defpackage.is80;
import defpackage.it80;
import defpackage.iw80;
import defpackage.ju80;
import defpackage.kv80;
import defpackage.ls80;
import defpackage.lt80;
import defpackage.lw80;
import defpackage.mu80;
import defpackage.mvg;
import defpackage.nv80;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.ow80;
import defpackage.pgz;
import defpackage.ps80;
import defpackage.pt80;
import defpackage.pu80;
import defpackage.pw80;
import defpackage.qv80;
import defpackage.rgo;
import defpackage.rzg;
import defpackage.skd0;
import defpackage.sls;
import defpackage.ss80;
import defpackage.st80;
import defpackage.su80;
import defpackage.tje;
import defpackage.tse;
import defpackage.tv80;
import defpackage.uho;
import defpackage.vio;
import defpackage.vs80;
import defpackage.vt80;
import defpackage.vu80;
import defpackage.w511;
import defpackage.wls;
import defpackage.wv80;
import defpackage.ynv;
import defpackage.ys80;
import defpackage.yt80;
import defpackage.yu80;
import defpackage.znv;
import defpackage.zv80;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.bridge.BasePlusWebMessagesHandler$onMessage$1", f = "BasePlusWebMessagesHandler.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasePlusWebMessagesHandler$onMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $jsonMessage;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlusWebMessagesHandler$onMessage$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$jsonMessage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePlusWebMessagesHandler$onMessage$1(this.this$0, this.$jsonMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlusWebMessagesHandler$onMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ynv ynvVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar = this.this$0.d;
            String str = this.$jsonMessage;
            this.label = 1;
            Object a = aVar.a(str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            pw80 pw80Var = (pw80) obj2;
            com.yandex.plus.home.feature.webviews.internal.container.b bVar = aVar2.o;
            String str2 = aVar2.m;
            hsd0 hsd0Var = aVar2.l;
            PropertyReference0Impl propertyReference0Impl = aVar2.s;
            PlusLogTag plusLogTag = PlusLogTag.JS;
            skd0.b(plusLogTag, "handleOutMessage() outMessage=" + pw80Var);
            if (pw80Var instanceof ju80) {
                aVar2.l((ju80) pw80Var);
            } else if (pw80Var instanceof yt80) {
                aVar2.k((yt80) pw80Var);
            } else if (pw80Var instanceof eu80) {
                aVar2.j((eu80) pw80Var);
            } else if (pw80Var instanceof st80) {
                aVar2.i((st80) pw80Var);
            } else if (pw80Var instanceof ls80) {
                aVar2.c((ls80) pw80Var);
            } else if (pw80Var instanceof is80) {
                aVar2.b((is80) pw80Var);
            } else if (pw80Var instanceof vu80) {
                aVar2.p((vu80) pw80Var);
            } else if (pw80Var instanceof ow80) {
                aVar2.x((ow80) pw80Var);
            } else if (pw80Var instanceof ps80) {
                aVar2.d((ps80) pw80Var);
            } else if (pw80Var instanceof mu80) {
                mu80 mu80Var = (mu80) pw80Var;
                skd0.b(plusLogTag, "handleOptionStatusRequestMessage() outMessage=" + mu80Var);
                tje.N((tse) propertyReference0Impl.get(), aVar2.c, null, new BasePlusWebMessagesHandler$handleOptionStatusRequestMessage$1(aVar2, mu80Var, null), 2);
            } else if (pw80Var instanceof fs80) {
                fs80 fs80Var = (fs80) pw80Var;
                skd0.b(plusLogTag, "handleChangeOptionStatusRequestMessage() outMessage=" + fs80Var);
                tje.N((tse) propertyReference0Impl.get(), aVar2.a, null, new BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1(aVar2, fs80Var, null), 2);
            } else if (pw80Var instanceof iw80) {
                aVar2.w((iw80) pw80Var);
            } else if (pw80Var instanceof lw80) {
                lw80 lw80Var = (lw80) pw80Var;
                sls slsVar = aVar2.k;
                if (slsVar != null) {
                    String str3 = (String) slsVar.invoke();
                    skd0.b(plusLogTag, "get card info from host - handleUserCardRequest() outMessage=" + lw80Var + " cardId=" + str3);
                    String str4 = lw80Var.a;
                    if (str3 != null) {
                        if (evu0.J(str3)) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            ynvVar = new ynv(str3);
                            aVar2.A(new znv(str4, ynvVar));
                        }
                    }
                    ynvVar = null;
                    aVar2.A(new znv(str4, ynvVar));
                }
            } else if (pw80Var instanceof pt80) {
                aVar2.g((pt80) pw80Var);
            } else if (pw80Var instanceof bt80) {
                aVar2.h((bt80) pw80Var);
            } else if (pw80Var instanceof bv80) {
                aVar2.q((bv80) pw80Var);
            } else if (pw80Var instanceof qv80) {
                aVar2.u((qv80) pw80Var);
            } else if (pw80Var instanceof zv80) {
                aVar2.v((zv80) pw80Var);
            } else if (pw80Var instanceof ev80) {
                ev80 ev80Var = (ev80) pw80Var;
                skd0.b(plusLogTag, "handleMetricsEvent() outMessage=" + ev80Var);
                dc20 dc20Var = aVar2.j;
                String str5 = ev80Var.b;
                String str6 = ev80Var.c;
                rgo rgoVar = (rgo) dc20Var.b.getValue();
                if (rgoVar != null) {
                    rgoVar.reportEvent(str5, str6);
                }
            } else if (pw80Var instanceof yu80) {
                aVar2.o((yu80) pw80Var);
            } else if (pw80Var instanceof su80) {
                aVar2.n((su80) pw80Var);
            } else if (pw80Var instanceof nv80) {
                aVar2.t((nv80) pw80Var);
            } else if (pw80Var instanceof ys80) {
                aVar2.e((ys80) pw80Var);
            } else if (pw80Var instanceof pu80) {
                aVar2.m((pu80) pw80Var);
            } else if (pw80Var instanceof fw80) {
                fw80 fw80Var = (fw80) pw80Var;
                skd0.b(plusLogTag, "handleUpdateTargetsState() outMessage=" + fw80Var);
                ((a441) aVar2.p).w(fw80Var.b);
            } else if (pw80Var instanceof wv80) {
                wv80 wv80Var = (wv80) pw80Var;
                skd0.b(plusLogTag, "handleSuccessScreenShown() outMessage=" + wv80Var);
                hsd0Var.b(str2, wv80Var.b);
            } else if (pw80Var instanceof tv80) {
                tv80 tv80Var = (tv80) pw80Var;
                skd0.b(plusLogTag, "handleSuccessScreenButtonTapped() outMessage=" + tv80Var);
                hsd0Var.c(str2, tv80Var.b);
            } else if (pw80Var instanceof vt80) {
                vt80 vt80Var = (vt80) pw80Var;
                skd0.b(plusLogTag, "handleOpenSmart() outMessage=" + vt80Var);
                Object y = nw70.y(vt80Var);
                if (!(y instanceof Result.Failure)) {
                    com.yandex.plus.home.feature.webviews.internal.container.b.b(aVar2.o, (rzg) y, true, null, null, null, null, 60);
                }
                Throwable a2 = Result.a(y);
                if (a2 != null) {
                    skd0.c(plusLogTag, "handleOpenSmart() outMessage=" + vt80Var, a2);
                    aVar2.i.c(vt80Var.b);
                }
            } else if (pw80Var instanceof hv80) {
                aVar2.r((hv80) pw80Var);
            } else if (pw80Var instanceof kv80) {
                aVar2.s((kv80) pw80Var);
            } else if (pw80Var instanceof it80) {
                it80 it80Var = (it80) pw80Var;
                skd0.b(plusLogTag, "handleMiniStoryIsShownEvent() outMessage=" + it80Var);
                aVar2.z(it80Var, "NOT_IMPLEMENTED");
            } else if (pw80Var instanceof et80) {
                aVar2.f((et80) pw80Var);
            } else if (pw80Var instanceof cs80) {
                aVar2.a((cs80) pw80Var);
            } else if (pw80Var instanceof lt80) {
                aVar2.y((lt80) pw80Var);
            } else if (pw80Var instanceof ss80) {
                skd0.b(plusLogTag, "handleDisableSwipeClose() outMessage=" + ((ss80) pw80Var));
                com.yandex.plus.home.feature.webviews.internal.container.a aVar3 = (com.yandex.plus.home.feature.webviews.internal.container.a) bVar;
                pgz pgzVar = aVar3.w;
                LogPriority logPriority = LogPriority.DEBUG;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "WebViewsControllerImpl", "disableSwipeClose()");
                }
                dje l = aVar3.l();
                if (l != null) {
                    l.disableSwipeClose();
                }
            } else if (pw80Var instanceof vs80) {
                skd0.b(plusLogTag, "handleEnableSwipeClose() outMessage=" + ((vs80) pw80Var));
                com.yandex.plus.home.feature.webviews.internal.container.a aVar4 = (com.yandex.plus.home.feature.webviews.internal.container.a) bVar;
                pgz pgzVar2 = aVar4.w;
                LogPriority logPriority2 = LogPriority.DEBUG;
                if (pgzVar2.e(logPriority2)) {
                    pgzVar2.a(logPriority2, "WebViewsControllerImpl", "enableSwipeClose()");
                }
                dje l2 = aVar4.l();
                if (l2 != null) {
                    l2.enableSwipeClose();
                }
            } else if (!(pw80Var instanceof bw80)) {
                w511.b();
                return null;
            }
        }
        String str7 = this.$jsonMessage;
        a aVar5 = this.this$0;
        Throwable a3 = Result.a(obj2);
        if (a3 != null) {
            skd0.c(PlusLogTag.JS, "Parsing message error jsonMessage=" + str7 + ", throwable=" + a3, null);
            vio vioVar = aVar5.i;
            uho uhoVar = vioVar.a;
            EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType = vioVar.b;
            Pair pair = new Pair("js_message", str7);
            String message = a3.getMessage();
            if (message == null) {
                message = "";
            }
            Map i2 = kotlin.collections.b.i(pair, new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, message));
            uhoVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("webview_type", evgenDiagnostic$WebViewType.getEventValue());
            linkedHashMap.put("additional_params", i2);
            linkedHashMap.put("_meta", uho.b(new HashMap()));
            uhoVar.c("Error.WebView.Protocol.Parsing", linkedHashMap);
        }
        return zy11.a;
    }
}
