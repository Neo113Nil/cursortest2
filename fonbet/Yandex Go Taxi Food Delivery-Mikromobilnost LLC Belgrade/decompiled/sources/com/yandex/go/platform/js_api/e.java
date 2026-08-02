package com.yandex.go.platform.js_api;

import com.yandex.auth.LegacyAccountType;
import defpackage.cms;
import defpackage.iyw;
import defpackage.jms;
import defpackage.mdh;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class e implements iyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ JsNativeApi b;

    public /* synthetic */ e(JsNativeApi jsNativeApi, int i) {
        this.a = i;
        this.b = jsNativeApi;
    }

    @Override // defpackage.iyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        JsNativeApi jsNativeApi = this.b;
        switch (i) {
            case 0:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$openNewWebLinkCallback$1(jsNativeApi, str, null, strArr), 3);
                break;
            case 1:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$navigateToFeature$1(jsNativeApi, str, null, strArr), 3);
                break;
            case 2:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$openLinkInBrowserCallback$1(jsNativeApi, str, null, strArr), 3);
                break;
            case 3:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$dropOtherWindowsCallback$1(jsNativeApi, str, null), 3);
                break;
            case 4:
                tse tseVar = jsNativeApi.b;
                sjh sjhVar = uyj.a;
                tje.N(tseVar, mdh.b, null, new JsNativeApi$getUserInfo$1(jsNativeApi, str, null), 2);
                break;
            case 5:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$getDeviceId$1(jsNativeApi, str, null), 3);
                break;
            case 6:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$getUUID$1(jsNativeApi, str, null), 3);
                break;
            case 7:
                tse tseVar2 = jsNativeApi.b;
                sjh sjhVar2 = uyj.a;
                tje.N(tseVar2, mdh.b, null, new JsNativeApi$updateSession$1(jsNativeApi, str, null), 2);
                break;
            case 8:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$checkNeedProfile$1(jsNativeApi, str, null), 3);
                break;
            case 9:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$bindCard$1(jsNativeApi, str, null, strArr), 3);
                break;
            case 10:
                if (strArr.length != 0) {
                    tje.N(jsNativeApi.b, null, null, new JsNativeApi$requestPermission$1(jsNativeApi, str, null, strArr), 3);
                    break;
                } else {
                    jsNativeApi.f("goplatform.private.systemPermissions.request", str, "permission required");
                    break;
                }
            case 11:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$unbindCard$1(jsNativeApi, str, null, strArr), 3);
                break;
            case 12:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$verifyCard$1(jsNativeApi, str, null, strArr), 3);
                break;
            case 13:
                tse tseVar3 = jsNativeApi.b;
                sjh sjhVar3 = uyj.a;
                tje.N(tseVar3, mdh.b, null, new JsNativeApi$readFromStorage$1(jsNativeApi, str, null, strArr), 2);
                break;
            case 14:
                tse tseVar4 = jsNativeApi.b;
                sjh sjhVar4 = uyj.a;
                tje.N(tseVar4, mdh.b, null, new JsNativeApi$saveToStorage$1(jsNativeApi, str, null, strArr), 2);
                break;
            case 15:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$selectContacts$1(jsNativeApi, str, null), 3);
                break;
            case 16:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$inAppReviewRequest$1(jsNativeApi, str, null), 3);
                break;
            case 17:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$forceUpdate$1(jsNativeApi, str, null), 3);
                break;
            case 18:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$openSettingsMenu$1(jsNativeApi, str, null), 3);
                break;
            case 19:
                tse tseVar5 = jsNativeApi.b;
                sjh sjhVar5 = uyj.a;
                tje.N(tseVar5, mdh.b, null, new JsNativeApi$getPushToken$1(jsNativeApi, str, null), 2);
                break;
            case 20:
                if (strArr.length != 0) {
                    tse tseVar6 = jsNativeApi.b;
                    sjh sjhVar6 = uyj.a;
                    tje.N(tseVar6, mdh.b, null, new JsNativeApi$setGeoPoint$1(jsNativeApi, str, null, strArr), 2);
                    break;
                } else {
                    jsNativeApi.f("goplatform.private.setGeoPoint", str, "setGeoPoint params is empty");
                    break;
                }
            case 21:
                tse tseVar7 = jsNativeApi.b;
                sjh sjhVar7 = uyj.a;
                tje.N(tseVar7, mdh.b, null, new JsNativeApi$getAuthToken$1(jsNativeApi, str, null), 2);
                break;
            case 22:
                tse tseVar8 = jsNativeApi.b;
                sjh sjhVar8 = uyj.a;
                tje.N(tseVar8, o400.a, null, new JsNativeApi$closePage$1(jsNativeApi, null), 2);
                break;
            case 23:
                tse tseVar9 = jsNativeApi.b;
                sjh sjhVar9 = uyj.a;
                tje.N(tseVar9, mdh.b, null, new JsNativeApi$login$1(jsNativeApi, str, null), 2);
                break;
            case 24:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$getAccountType$1(jsNativeApi, str, null), 3);
                break;
            case 25:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$upgradePhonishAccount$1(jsNativeApi, str, null, strArr), 3);
                break;
            case 26:
                tse tseVar10 = jsNativeApi.b;
                sjh sjhVar10 = uyj.a;
                tje.N(tseVar10, mdh.b, null, new JsNativeApi$logout$1(jsNativeApi, str, null), 2);
                break;
            case 27:
                tse tseVar11 = jsNativeApi.b;
                sjh sjhVar11 = uyj.a;
                tje.N(tseVar11, mdh.b, null, new JsNativeApi$bindPhone$1(jsNativeApi, str, null, strArr), 2);
                break;
            default:
                tje.N(jsNativeApi.b, null, null, new JsNativeApi$webViewReadyCallback$1(jsNativeApi, str, null, strArr), 3);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 9:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 10:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 11:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 12:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 13:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 14:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 15:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 16:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 17:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 18:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 19:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 20:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 21:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 22:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 23:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 24:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 25:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 26:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 27:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return getFunctionDelegate().equals(((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "openNewWebLinkCallback", "openNewWebLinkCallback(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "navigateToFeature", "navigateToFeature(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "openLinkInBrowserCallback", "openLinkInBrowserCallback(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 3:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "dropOtherWindowsCallback", "dropOtherWindowsCallback(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 4:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "getUserInfo", "getUserInfo(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 5:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "getDeviceId", "getDeviceId(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 6:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "getUUID", "getUUID(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 7:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "updateSession", "updateSession(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 8:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "checkNeedProfile", "checkNeedProfile(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 9:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "bindCard", "bindCard(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 10:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "requestPermission", "requestPermission(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 11:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "unbindCard", "unbindCard(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 12:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "verifyCard", "verifyCard(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 13:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "readFromStorage", "readFromStorage(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 14:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "saveToStorage", "saveToStorage(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 15:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "selectContacts", "selectContacts(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 16:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "inAppReviewRequest", "inAppReviewRequest(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 17:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "forceUpdate", "forceUpdate(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 18:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "openSettingsMenu", "openSettingsMenu(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 19:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "getPushToken", "getPushToken(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 20:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "setGeoPoint", "setGeoPoint(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 21:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "getAuthToken", "getAuthToken(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 22:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "closePage", "closePage(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 23:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, LegacyAccountType.STRING_LOGIN, "login(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 24:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "getAccountType", "getAccountType(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 25:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "upgradePhonishAccount", "upgradePhonishAccount(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 26:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "logout", "logout(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 27:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "bindPhone", "bindPhone(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, JsNativeApi.class, "webViewReadyCallback", "webViewReadyCallback(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
