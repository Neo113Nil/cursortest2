package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.internal.report.gd;
import com.yandex.passport.internal.report.hd;
import com.yandex.passport.internal.report.id;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.reporters.j1;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.iqn;
import defpackage.ny61;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public final class o implements s {
    public final com.yandex.passport.internal.sloth.webauthn.c a;
    public final j1 b;

    public o(com.yandex.passport.internal.sloth.webauthn.c cVar, j1 j1Var) {
        this.a = cVar;
        this.b = j1Var;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final /* bridge */ /* synthetic */ Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        return b((String) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        WebAuthNAuthPerformer$performCommand$1 webAuthNAuthPerformer$performCommand$1;
        int i;
        Object a;
        Throwable a2;
        String str2;
        if (continuationImpl instanceof WebAuthNAuthPerformer$performCommand$1) {
            webAuthNAuthPerformer$performCommand$1 = (WebAuthNAuthPerformer$performCommand$1) continuationImpl;
            int i2 = webAuthNAuthPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthNAuthPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webAuthNAuthPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthNAuthPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j1 j1Var = this.b;
                    j1Var.getClass();
                    j1Var.h(gd.w);
                    webAuthNAuthPerformer$performCommand$1.L$0 = this;
                    webAuthNAuthPerformer$performCommand$1.label = 1;
                    a = this.a.a(str, webAuthNAuthPerformer$performCommand$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (o) webAuthNAuthPerformer$performCommand$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                boolean z = false;
                if (a2 != null) {
                    String str3 = (String) a;
                    j1 j1Var2 = this.b;
                    try {
                        str2 = new JSONObject(str3).getString("id");
                    } catch (JSONException unused) {
                        str2 = "";
                    }
                    j1Var2.getClass();
                    j1Var2.f(id.w, new com.yandex.passport.internal.report.i(str2, 9, z));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ACSPConstants.STATUS, WriteBlocks.OK);
                    jSONObject.put(Constants.KEY_DATA, str3);
                    return new iqn(new com.yandex.passport.sloth.command.b(jSONObject));
                }
                j1 j1Var3 = this.b;
                j1Var3.getClass();
                j1Var3.f(hd.w, new yd(a2), new ld(a2));
                String message = a2.getMessage();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ACSPConstants.STATUS, "error");
                if (message == null) {
                    message = "null";
                }
                jSONObject2.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, message);
                return new iqn(new com.yandex.passport.sloth.command.b(jSONObject2));
            }
        }
        webAuthNAuthPerformer$performCommand$1 = new WebAuthNAuthPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = webAuthNAuthPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthNAuthPerformer$performCommand$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        boolean z2 = false;
        if (a2 != null) {
        }
    }
}
