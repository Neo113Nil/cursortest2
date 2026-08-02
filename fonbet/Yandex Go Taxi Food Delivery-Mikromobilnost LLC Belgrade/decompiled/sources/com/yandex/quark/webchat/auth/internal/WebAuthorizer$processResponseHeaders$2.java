package com.yandex.quark.webchat.auth.internal;

import android.net.Uri;
import com.yandex.div.state.db.StateEntry;
import com.yandex.quark.webchat.cookie.Cookie$SameSite;
import defpackage.bne;
import defpackage.bvu0;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.meu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.r5z0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.auth.internal.WebAuthorizer$processResponseHeaders$2", f = "WebAuthorizer.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebAuthorizer$processResponseHeaders$2 extends SuspendLambda implements wls {
    final /* synthetic */ meu $headers;
    final /* synthetic */ Uri $webChatUrl;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAuthorizer$processResponseHeaders$2(meu meuVar, b bVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.$headers = meuVar;
        this.this$0 = bVar;
        this.$webChatUrl = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebAuthorizer$processResponseHeaders$2(this.$headers, this.this$0, this.$webChatUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebAuthorizer$processResponseHeaders$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bne bneVar;
        String obj2;
        Date date;
        Object obj3;
        Long m;
        String obj4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<String> g = this.$headers.g("Set-Cookie");
            i3y i3yVar = bne.j;
            ArrayList arrayList = new ArrayList();
            for (String str : g) {
                String str2 = (String) kotlin.collections.a.R(evu0.Y(str, new char[]{';'}, 1, 2));
                if (str2 == null) {
                    str2 = "";
                }
                List Y = evu0.Y(evu0.k0(str2).toString(), new char[]{'='}, 2, 2);
                String str3 = (String) kotlin.collections.a.S(0, Y);
                if (str3 == null || (obj2 = evu0.k0(str3).toString()) == null) {
                    bneVar = null;
                } else {
                    String str4 = (String) kotlin.collections.a.S(1, Y);
                    String obj5 = str4 != null ? evu0.k0(str4).toString() : null;
                    String str5 = obj5 == null ? "" : obj5;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = kotlin.collections.a.J(evu0.Y(str, new char[]{';'}, 0, 6), 1).iterator();
                    while (it.hasNext()) {
                        List Y2 = evu0.Y(evu0.k0((String) it.next()).toString(), new char[]{'='}, 2, 2);
                        String str6 = (String) kotlin.collections.a.S(0, Y2);
                        String lowerCase = (str6 == null || (obj4 = evu0.k0(str6).toString()) == null) ? null : obj4.toLowerCase(Locale.ROOT);
                        if (lowerCase == null) {
                            lowerCase = "";
                        }
                        String str7 = (String) kotlin.collections.a.S(1, Y2);
                        String obj6 = str7 != null ? evu0.k0(str7).toString() : null;
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        if (lowerCase.length() > 0) {
                            linkedHashMap.put(lowerCase, obj6);
                        }
                    }
                    String str8 = (String) linkedHashMap.get("samesite");
                    String lowerCase2 = str8 != null ? str8.toLowerCase(Locale.ROOT) : null;
                    String str9 = (String) linkedHashMap.get("domain");
                    String str10 = (String) linkedHashMap.get(StateEntry.COLUMN_PATH);
                    boolean contains = linkedHashMap.keySet().contains("secure");
                    boolean contains2 = linkedHashMap.keySet().contains("httponly");
                    String str11 = (String) linkedHashMap.get("max-age");
                    r5z0 r5z0Var = (str11 == null || (m = bvu0.m(10, str11)) == null) ? null : new r5z0(m.longValue(), TimeUnit.SECONDS);
                    try {
                        String str12 = (String) linkedHashMap.get("expires");
                        date = str12 != null ? ((SimpleDateFormat) bne.j.getValue()).parse(str12) : null;
                    } catch (ParseException unused) {
                        date = null;
                    }
                    Iterator<E> it2 = Cookie$SameSite.a().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        if (jl40.l(((Cookie$SameSite) obj3).getHeaderValue(), lowerCase2)) {
                            break;
                        }
                    }
                    bneVar = new bne(obj2, str5, date, r5z0Var, str9, str10, contains2, contains, (Cookie$SameSite) obj3);
                }
                if (bneVar != null) {
                    arrayList.add(bneVar);
                }
            }
            a aVar = this.this$0.a;
            qoh h = tje.h(aVar.d, null, null, new AuthorizationCookieManager$setAuthorizationCookies$1(aVar, this.$webChatUrl, arrayList, null), 3);
            this.label = 1;
            Object s = h.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
