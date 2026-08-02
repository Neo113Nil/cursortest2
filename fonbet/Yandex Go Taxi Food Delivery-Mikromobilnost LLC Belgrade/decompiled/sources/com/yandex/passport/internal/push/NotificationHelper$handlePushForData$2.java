package com.yandex.passport.internal.push;

import android.os.Bundle;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.qa;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.report.x9;
import com.yandex.passport.internal.report.y9;
import com.yandex.passport.internal.report.yd;
import defpackage.gw00;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qke;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/push/PushPayload;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/push/PushPayload;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.push.NotificationHelper$handlePushForData$2", f = "NotificationHelper.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL, 144}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationHelper$handlePushForData$2 extends SuspendLambda implements wls {
    final /* synthetic */ Bundle $data;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationHelper$handlePushForData$2(h hVar, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$data = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationHelper$handlePushForData$2(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationHelper$handlePushForData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x01a5, code lost:
    
        if (r3 != r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if (r3 == r1) goto L62;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object c;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((Boolean) this.this$0.k.b(com.yandex.passport.internal.flags.q.o0)).booleanValue()) {
                d0 d0Var = this.this$0.m;
                Bundle bundle = this.$data;
                d0Var.getClass();
                String string = bundle.getString("event_name");
                if ((string == null ? false : string.equals("2fa_pictures_am")) && !this.this$0.a.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    d0 d0Var2 = this.this$0.m;
                    Bundle bundle2 = this.$data;
                    d0Var2.getClass();
                    try {
                        String string2 = bundle2.getString("uid");
                        if (string2 == null) {
                            throw new IllegalStateException("missing key uid");
                        }
                        long parseLong = Long.parseLong(string2);
                        String string3 = bundle2.getString("track_id");
                        if (string3 == null) {
                            throw new IllegalStateException("missing key track_id");
                        }
                        String string4 = bundle2.getString("push_id");
                        String string5 = bundle2.getString("platform");
                        String string6 = bundle2.getString("event_name");
                        String string7 = bundle2.getString("push_service");
                        if (string7 == null) {
                            throw new IllegalStateException("missing key push_service");
                        }
                        String string8 = bundle2.getString("title");
                        if (string8 == null) {
                            throw new IllegalStateException("missing key title");
                        }
                        ArrayList b = d0.b(bundle2);
                        String string9 = bundle2.getString("2fa_pictures_expire_at");
                        if (string9 == null) {
                            throw new IllegalStateException("missing key 2fa_pictures_expire_at");
                        }
                        long parseLong2 = Long.parseLong(string9);
                        String string10 = bundle2.getString("2fa_pictures_ttl");
                        if (string10 == null) {
                            throw new IllegalStateException("missing key 2fa_pictures_ttl");
                        }
                        long parseLong3 = Long.parseLong(string10);
                        String string11 = bundle2.getString("country");
                        String string12 = bundle2.getString("city");
                        String string13 = bundle2.getString(ClidProvider.APPLICATION);
                        String string14 = bundle2.getString("os");
                        String string15 = bundle2.getString("user_ip");
                        boolean parseBoolean = Boolean.parseBoolean(bundle2.getString("is_silent"));
                        long c2 = d0.c(bundle2);
                        str = null;
                        int c3 = (int) (d0.c(bundle2) / 1000);
                        String string16 = bundle2.getString("webview_url");
                        if (string16 == null) {
                            throw new IllegalStateException("missing key webview_url");
                        }
                        PicturePayload picturePayload = new PicturePayload(parseLong, string3, string4, string5, string6, string7, string8, b, parseLong2, parseLong3, string11, string12, string13, string14, string15, parseBoolean, c2, c3, string16);
                        h hVar = this.this$0;
                        com.yandex.passport.internal.report.reporters.s0 s0Var = hVar.c;
                        s0Var.getClass();
                        s0Var.e(y9.w, com.yandex.passport.internal.properties.u.R(picturePayload));
                        this.label = 1;
                        c = h.c(hVar, picturePayload, this);
                    } catch (Throwable th) {
                        com.yandex.passport.internal.report.reporters.s0 s0Var2 = d0Var2.a;
                        s0Var2.getClass();
                        s0Var2.f(x9.w, new yd("picture_payload", 15, false), new yd(th));
                        throw th;
                    }
                }
            }
            str = null;
            PushPayload a2 = this.this$0.m.a(this.$data);
            h hVar2 = this.this$0;
            com.yandex.passport.internal.report.reporters.s0 s0Var3 = hVar2.c;
            s0Var3.getClass();
            s0Var3.e(y9.w, com.yandex.passport.internal.properties.u.S(a2));
            this.label = 2;
            a = h.a(hVar2, a2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                str = null;
                a = obj;
                PushPayload pushPayload = (PushPayload) a;
                h hVar3 = this.this$0;
                Bundle bundle3 = this.$data;
                if (pushPayload != null) {
                    u0 u0Var = hVar3.d;
                    long uid = pushPayload.getUid();
                    String pushId = pushPayload.getPushId();
                    String trackId = pushPayload.getTrackId();
                    boolean A = com.yandex.passport.internal.properties.u.A(pushPayload);
                    u0Var.getClass();
                    u0Var.f(qa.w, new jd(Long.valueOf(uid)), new md(pushId, 7), new yd(trackId, 12), new com.yandex.passport.internal.report.i(A, 10));
                    if (com.yandex.passport.internal.properties.u.A(pushPayload)) {
                        e0 e0Var = hVar3.n;
                        e0Var.getClass();
                        Set<String> keySet = bundle3.keySet();
                        int d = gw00.d(tcc.n(keySet, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        for (Object obj2 : keySet) {
                            linkedHashMap.put(obj2, bundle3.getString((String) obj2, str));
                        }
                        MapBuilder k = qke.k(linkedHashMap);
                        if (!k.isEmpty()) {
                            com.yandex.passport.internal.util.storage.a b2 = e0Var.b();
                            b2.x = true;
                            ConcurrentHashMap concurrentHashMap = b2.a;
                            kgx[] kgxVarArr = e0.b;
                            concurrentHashMap.clear();
                            concurrentHashMap.putAll(k);
                            b2.x = false;
                            b2.a();
                        }
                    }
                }
                return pushPayload;
            }
            kotlin.b.b(obj);
            str = null;
            c = obj;
        }
        if (((Boolean) c).booleanValue()) {
            return str;
        }
        PushPayload a22 = this.this$0.m.a(this.$data);
        h hVar22 = this.this$0;
        com.yandex.passport.internal.report.reporters.s0 s0Var32 = hVar22.c;
        s0Var32.getClass();
        s0Var32.e(y9.w, com.yandex.passport.internal.properties.u.S(a22));
        this.label = 2;
        a = h.a(hVar22, a22, this);
    }
}
