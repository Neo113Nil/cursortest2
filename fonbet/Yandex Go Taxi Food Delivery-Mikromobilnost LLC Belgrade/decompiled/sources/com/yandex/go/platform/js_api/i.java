package com.yandex.go.platform.js_api;

import defpackage.j73;
import defpackage.oyr;
import defpackage.tls;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public abstract class i {
    public static final String a(String str, String str2, boolean z) {
        if (z) {
            str2 = oyr.p("generateError(\"", str2, "\")");
        }
        return "handlePromiseResult(\"" + str + "\", \"\", " + str2 + ')';
    }

    public static final String b(String... strArr) {
        return unr0.p("\nfunction stringifyParam(param) {\n  try {\n    if (param === undefined || param === null) return null\n    if (typeof param === \"string\") return param\n    return JSON.stringify(param);\n  } catch (e) {\n    console.log(e)\n    return \"\"\n  }\n}\nfunction createPromise(functionName", strArr.length == 0 ? "" : j73.L(strArr, Extension.FIX_SPACE, Extension.FIX_SPACE, null, 60), ") {\n    var promiseId = createPromiseId(functionName);\n    var promise = new Promise(function (resolve, reject) {\n        this.window.goPlatformPromises[promiseId] = { resolve, reject };\n    });\n    goPlatformNativeApi.invokeCode(functionName, promiseId", strArr.length != 0 ? j73.L(strArr, Extension.FIX_SPACE, Extension.FIX_SPACE, new tls() { // from class: com.yandex.go.platform.js_api.JsScriptisKt$generatePromiseCreationFunction$stringifiedArgs$1
            final /* synthetic */ String $stringifyFunction = "stringifyParam";

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return this.$stringifyFunction + '(' + ((String) obj) + ')';
            }
        }, 28) : "", ")\n    return promise\n}\n");
    }
}
