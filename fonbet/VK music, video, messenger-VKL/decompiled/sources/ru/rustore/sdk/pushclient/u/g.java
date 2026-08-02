package ru.rustore.sdk.pushclient.u;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.messaging.NotificationAnalyticsPayload;
import com.vk.push.common.messaging.NotificationPayload;
import com.vk.push.common.messaging.NotificationResourceType;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.push.SendPushesResult;
import com.vk.push.core.utils.ResultExtensionsKt;
import com.vk.push.core.utils.StringExtensionsKt;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.pushclient.v.c;
import xsna.b6l;
import xsna.bay;
import xsna.bdn;
import xsna.bpn0;
import xsna.bpy0;
import xsna.dd70;
import xsna.drm0;
import xsna.epx;
import xsna.go9;
import xsna.gzs;
import xsna.ho8;
import xsna.hpj;
import xsna.i2z0;
import xsna.iay0;
import xsna.j5g;
import xsna.myc0;
import xsna.nvy0;
import xsna.s3q0;
import xsna.s9y0;
import xsna.spj;
import xsna.t870;
import xsna.ui50;
import xsna.wgl;
import xsna.wi50;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* loaded from: classes9.dex */
public final class g implements nvy0 {
    public final iay0 a;
    public final i2z0 b;
    public final bpy0 c;
    public final s9y0 d;
    public final AnalyticsSender e;
    public final CrashReporterRepository f;
    public final hpj g;
    public final wi50 h;
    public final bpn0 i;
    public final ArrayDeque j;

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessageKey(id=");
            sb.append(this.a);
            sb.append(", token=");
            return ho8.a(sb, this.b, ')');
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.MessagesIPCInteractorImpl", f = "MessagesIPCInteractorImpl.kt", l = {116, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE}, m = "handleRemoteMessage")
    public final class b extends ContinuationImpl {
        public g a;
        public RemoteMessage b;
        public /* synthetic */ Object c;
        public int e;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return g.this.h(null, this);
        }
    }

    public static final class c extends Lambda implements gzs<Logger> {
        public final /* synthetic */ Logger a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Logger logger) {
            super(0);
            this.a = logger;
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            return this.a.createLogger("MessagesIPC");
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.MessagesIPCInteractorImpl$onMessagesReceived$1", f = "MessagesIPCInteractorImpl.kt", l = {54, 55}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        public int a;
        public final /* synthetic */ CallingAppIds c;
        public final /* synthetic */ AsyncCallback d;
        public final /* synthetic */ List<RemoteMessage> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CallingAppIds callingAppIds, AsyncCallback asyncCallback, List<RemoteMessage> list, spj<? super d> spjVar) {
            super(2, spjVar);
            this.c = callingAppIds;
            this.d = asyncCallback;
            this.e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return g.this.new d(this.c, this.d, this.e, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:(1:(11:5|6|7|(1:9)|10|(1:12)|13|14|15|16|17)(2:22|23))(1:24))(1:30)|25|(1:27)|7|(0)|10|(0)|13|14|15|16|17) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
        
            ((com.vk.push.common.Logger) r5.b.i.getValue()).error("Messages received result by ipc has failed", r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
        
            if (r6 == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0031, code lost:
        
            if (r6 == r0) goto L17;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a;
            Throwable a2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                kotlin.a.a(obj);
                i2z0 i2z0Var = g.this.b;
                CallingAppIds callingAppIds = this.c;
                this.a = 1;
                a = i2z0Var.a(callingAppIds, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    a = (SendPushesResult) obj;
                    g gVar = g.this;
                    if (!(a instanceof Result.Failure)) {
                        Logger.DefaultImpls.info$default((Logger) gVar.i.getValue(), "Messages receiving is successful", null, 2, null);
                    }
                    g gVar2 = g.this;
                    a2 = Result.a(a);
                    if (a2 != null) {
                        gVar2.f.nonFatalReport(a2, IssueKey.MESSAGE_RECEIVED);
                    }
                    this.d.onResult(ResultExtensionsKt.toAidlResult(a));
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                a = ((Result) obj).d();
            }
            g gVar3 = g.this;
            List<RemoteMessage> list = this.e;
            if (!(a instanceof Result.Failure)) {
                this.a = 2;
                obj = g.g(gVar3, list, this);
            }
            g gVar4 = g.this;
            if (!(a instanceof Result.Failure)) {
            }
            g gVar22 = g.this;
            a2 = Result.a(a);
            if (a2 != null) {
            }
            this.d.onResult(ResultExtensionsKt.toAidlResult(a));
            return s3q0.a;
        }
    }

    public g(iay0 iay0Var, i2z0 i2z0Var, bpy0 bpy0Var, s9y0 s9y0Var, AnalyticsSender analyticsSender, CrashReporterRepository crashReporterRepository, Logger logger) {
        this.a = iay0Var;
        this.b = i2z0Var;
        this.c = bpy0Var;
        this.d = s9y0Var;
        this.e = analyticsSender;
        this.f = crashReporterRepository;
        bdn bdnVar = bdn.a;
        this.g = zvj.a(wgl.c);
        this.h = bay.a();
        this.i = new bpn0(new c(logger));
        this.j = new ArrayDeque(10);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(5:(2:3|(8:5|6|7|(1:(1:(1:(8:12|13|14|(3:17|(2:19|20)(1:22)|15)|23|24|25|26)(2:28|29))(18:30|31|32|33|34|35|(12:38|39|40|(1:42)(1:56)|43|(1:45)(1:55)|46|(2:51|52)|53|54|52|36)|57|58|(1:60)|61|62|14|(1:15)|23|24|25|26))(1:71))(1:79)|72|73|(15:75|34|35|(1:36)|57|58|(0)|61|62|14|(1:15)|23|24|25|26)|20))|72|73|(0)|20)|83|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0085, code lost:
    
        if (r1.b(r3) == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0120, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
    
        r5 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0149 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:13:0x0041, B:15:0x0143, B:17:0x0149, B:24:0x0161, B:39:0x00d9, B:60:0x0130), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #1 {all -> 0x00f2, blocks: (B:35:0x00bd, B:36:0x00c8, B:38:0x00ce, B:40:0x00e1, B:42:0x00ed, B:43:0x00f7, B:45:0x0101, B:46:0x0107, B:48:0x0113, B:53:0x011c, B:58:0x0122, B:61:0x013a), top: B:34:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130 A[Catch: all -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:13:0x0041, B:15:0x0143, B:17:0x0149, B:24:0x0161, B:39:0x00d9, B:60:0x0130), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum g(g gVar, List list, ContinuationImpl continuationImpl) {
        h hVar;
        CoroutineSingletons coroutineSingletons;
        ?? r5;
        ui50 ui50Var;
        ui50 ui50Var2;
        List list2;
        Object a2;
        g gVar2;
        List list3;
        ui50 ui50Var3;
        List t0;
        Iterator it;
        List list4;
        g gVar3 = gVar;
        gVar3.getClass();
        try {
            if (continuationImpl instanceof h) {
                hVar = (h) continuationImpl;
                int i = hVar.g;
                if ((i & Integer.MIN_VALUE) != 0) {
                    hVar.g = i - Integer.MIN_VALUE;
                    Object obj = hVar.e;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r5 = hVar.g;
                    if (r5 != 0) {
                        kotlin.a.a(obj);
                        ui50Var2 = gVar3.h;
                        hVar.a = gVar3;
                        list2 = list;
                        hVar.b = list2;
                        hVar.c = ui50Var2;
                        hVar.g = 1;
                    } else {
                        if (r5 != 1) {
                            if (r5 != 2) {
                                if (r5 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                list4 = hVar.d;
                                it = (Iterator) hVar.c;
                                ui50 ui50Var4 = (ui50) hVar.b;
                                gVar2 = hVar.a;
                                kotlin.a.a(obj);
                                r5 = ui50Var4;
                                while (it.hasNext()) {
                                    RemoteMessage remoteMessage = (RemoteMessage) it.next();
                                    hVar.a = gVar2;
                                    hVar.b = r5;
                                    hVar.c = it;
                                    hVar.d = list4;
                                    hVar.g = 3;
                                    if (gVar2.h(remoteMessage, hVar) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                Logger.DefaultImpls.info$default((Logger) gVar2.i.getValue(), "Handled " + list4.size() + " messages", null, 2, null);
                                s3q0 s3q0Var = s3q0.a;
                                r5.c(null);
                                return SendPushesResult.OK;
                            }
                            ui50 ui50Var5 = (ui50) hVar.c;
                            list3 = (List) hVar.b;
                            g gVar4 = hVar.a;
                            try {
                                kotlin.a.a(obj);
                                gVar2 = gVar4;
                                ui50Var3 = ui50Var5;
                                try {
                                    String str = (String) obj;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : list3) {
                                        String token = ((RemoteMessage) obj2).getToken();
                                        Logger logger = (Logger) gVar2.i.getValue();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Received for token ");
                                        sb.append(token != null ? StringExtensionsKt.hideSensitive(token) : null);
                                        sb.append(", current token = ");
                                        sb.append(str != null ? StringExtensionsKt.hideSensitive(str) : null);
                                        Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
                                        if (token != null && !token.equals(str)) {
                                        }
                                        arrayList.add(obj2);
                                    }
                                    t0 = j5g.t0(list3, j5g.S0(arrayList));
                                    if (!t0.isEmpty()) {
                                        gVar2.e.send(new ru.rustore.sdk.pushclient.d.d(str, t0));
                                    }
                                    it = arrayList.iterator();
                                    list4 = arrayList;
                                    r5 = ui50Var3;
                                    while (it.hasNext()) {
                                    }
                                    Logger.DefaultImpls.info$default((Logger) gVar2.i.getValue(), "Handled " + list4.size() + " messages", null, 2, null);
                                    s3q0 s3q0Var2 = s3q0.a;
                                    r5.c(null);
                                    return SendPushesResult.OK;
                                } catch (Throwable th) {
                                    th = th;
                                    ui50Var5 = ui50Var3;
                                    ui50Var = ui50Var5;
                                    ui50Var.c(null);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                ui50Var = ui50Var5;
                                ui50Var.c(null);
                                throw th;
                            }
                        }
                        ui50 ui50Var6 = (ui50) hVar.c;
                        list2 = (List) hVar.b;
                        g gVar5 = hVar.a;
                        kotlin.a.a(obj);
                        ui50Var2 = ui50Var6;
                        gVar3 = gVar5;
                    }
                    Logger.DefaultImpls.info$default((Logger) gVar3.i.getValue(), "Receive " + list2.size() + " messages", null, 2, null);
                    s9y0 s9y0Var = gVar3.d;
                    hVar.a = gVar3;
                    hVar.b = list2;
                    hVar.c = ui50Var2;
                    hVar.g = 2;
                    a2 = s9y0Var.a(hVar);
                    if (a2 != coroutineSingletons) {
                        gVar2 = gVar3;
                        list3 = list2;
                        ui50Var3 = ui50Var2;
                        obj = a2;
                        String str2 = (String) obj;
                        ArrayList arrayList2 = new ArrayList();
                        while (r11.hasNext()) {
                        }
                        t0 = j5g.t0(list3, j5g.S0(arrayList2));
                        if (!t0.isEmpty()) {
                        }
                        it = arrayList2.iterator();
                        list4 = arrayList2;
                        r5 = ui50Var3;
                        while (it.hasNext()) {
                        }
                        Logger.DefaultImpls.info$default((Logger) gVar2.i.getValue(), "Handled " + list4.size() + " messages", null, 2, null);
                        s3q0 s3q0Var22 = s3q0.a;
                        r5.c(null);
                        return SendPushesResult.OK;
                    }
                    return coroutineSingletons;
                }
            }
            Logger.DefaultImpls.info$default((Logger) gVar3.i.getValue(), "Receive " + list2.size() + " messages", null, 2, null);
            s9y0 s9y0Var2 = gVar3.d;
            hVar.a = gVar3;
            hVar.b = list2;
            hVar.c = ui50Var2;
            hVar.g = 2;
            a2 = s9y0Var2.a(hVar);
            if (a2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            ui50Var = ui50Var2;
            ui50Var.c(null);
            throw th;
        }
        hVar = new h(gVar3, continuationImpl);
        Object obj3 = hVar.e;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r5 = hVar.g;
        if (r5 != 0) {
        }
    }

    @Override // xsna.nvy0
    public final void b(CallingAppIds callingAppIds, List<RemoteMessage> list, AsyncCallback asyncCallback) {
        myc0.h(this.g, null, null, new d(callingAppIds, asyncCallback, list, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01af, code lost:
    
        if (r2.a(r1, r9) != r3) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(RemoteMessage remoteMessage, ContinuationImpl continuationImpl) {
        b bVar;
        int i;
        NotificationPayload notificationPayload;
        g gVar;
        Pair pair;
        String title;
        RemoteMessage remoteMessage2 = remoteMessage;
        if (continuationImpl instanceof b) {
            bVar = (b) continuationImpl;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar2.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    String messageId = remoteMessage2.getMessageId();
                    a aVar = new a(messageId, remoteMessage2.getToken());
                    ArrayDeque arrayDeque = this.j;
                    boolean contains = arrayDeque.contains(aVar);
                    bpn0 bpn0Var = this.i;
                    if (contains) {
                        Logger.DefaultImpls.warn$default((Logger) bpn0Var.getValue(), go9.b("Received duplicate message with id: ", messageId), null, 2, null);
                        return s3q0.a;
                    }
                    if (arrayDeque.size() >= 10) {
                        Logger.DefaultImpls.debug$default((Logger) bpn0Var.getValue(), "Remove last message from recently received", null, 2, null);
                        arrayDeque.remove();
                    }
                    arrayDeque.add(aVar);
                    RemoteMessage.Notification notification = remoteMessage2.getNotification();
                    if (notification != null && (title = notification.getTitle()) != null) {
                        String str = !drm0.N(title) ? title : null;
                        if (str != null) {
                            String body = notification.getBody();
                            String icon = notification.getIcon();
                            String color = notification.getColor();
                            Uri imageUrl = notification.getImageUrl();
                            notificationPayload = new NotificationPayload(str, body, icon, color, imageUrl != null ? imageUrl.toString() : null, notification.getChannelId(), notification.getClickAction(), remoteMessage2.getClickActionType());
                            if (notificationPayload != null) {
                                bpy0 bpy0Var = this.c;
                                Logger logger = bpy0Var.f;
                                String channelId = notificationPayload.getChannelId();
                                if (channelId == null || drm0.N(channelId)) {
                                    String str2 = ((c.a) bpy0Var.d.b.getValue()).c;
                                    if (str2 == null || drm0.N(str2)) {
                                        Context context = bpy0Var.a;
                                        NotificationChannel notificationChannel = new NotificationChannel("ru.mail.vkpns.default_notification_channel", context.getString(R.string.vkpns_default_notification_channel_name), 3);
                                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                                        if (notificationManager != null) {
                                            notificationManager.createNotificationChannel(notificationChannel);
                                        }
                                        Logger.DefaultImpls.info$default(logger, "Using default channel", null, 2, null);
                                        pair = new Pair("ru.mail.vkpns.default_notification_channel", NotificationResourceType.DEFAULT_SDK);
                                    } else {
                                        Logger.DefaultImpls.info$default(logger, "Using channel from manifest: ".concat(str2), null, 2, null);
                                        pair = new Pair(str2, NotificationResourceType.MANIFEST);
                                    }
                                } else {
                                    Logger.DefaultImpls.info$default(logger, "Using channel from payload: " + notificationPayload.getChannelId(), null, 2, null);
                                    pair = new Pair(notificationPayload.getChannelId(), NotificationResourceType.PAYLOAD);
                                }
                                String str3 = (String) pair.i();
                                dd70 dd70Var = bpy0Var.c;
                                if (dd70Var.b.areNotificationsEnabled()) {
                                    NotificationChannel notificationChannel2 = dd70Var.b.getNotificationChannel(str3);
                                    t870 t870Var = notificationChannel2 != null ? new t870(notificationChannel2) : null;
                                    if (t870Var == null || t870Var.a != 0) {
                                        int hashCode = UUID.randomUUID().hashCode();
                                        NotificationAnalyticsPayload notificationAnalyticsPayload = NotificationAnalyticsPayload.Companion.toNotificationAnalyticsPayload(remoteMessage2);
                                        bVar2.a = this;
                                        bVar2.b = remoteMessage2;
                                        bVar2.e = 1;
                                        if (bpy0Var.a(notificationPayload, hashCode, pair, notificationAnalyticsPayload, bVar2) != coroutineSingletons) {
                                            gVar = this;
                                        }
                                        return coroutineSingletons;
                                    }
                                }
                            }
                            gVar = this;
                            iay0 iay0Var = gVar.a;
                            bVar2.a = null;
                            bVar2.b = null;
                            bVar2.e = 2;
                        }
                    }
                    notificationPayload = null;
                    if (notificationPayload != null) {
                    }
                    gVar = this;
                    iay0 iay0Var2 = gVar.a;
                    bVar2.a = null;
                    bVar2.b = null;
                    bVar2.e = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    remoteMessage2 = bVar2.b;
                    gVar = bVar2.a;
                    kotlin.a.a(obj);
                }
                gVar.e.send(new ru.rustore.sdk.pushclient.d.c(remoteMessage2));
                iay0 iay0Var22 = gVar.a;
                bVar2.a = null;
                bVar2.b = null;
                bVar2.e = 2;
            }
        }
        bVar = new b(continuationImpl);
        b bVar22 = bVar;
        Object obj2 = bVar22.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar22.e;
        if (i != 0) {
        }
        gVar.e.send(new ru.rustore.sdk.pushclient.d.c(remoteMessage2));
        iay0 iay0Var222 = gVar.a;
        bVar22.a = null;
        bVar22.b = null;
        bVar22.e = 2;
    }

    @Override // com.vk.push.core.IPCInteractor
    public final void onDestroy() {
        Logger.DefaultImpls.info$default((Logger) this.i.getValue(), "onDestroy", null, 2, null);
        zvj.c(this.g, null);
    }
}
