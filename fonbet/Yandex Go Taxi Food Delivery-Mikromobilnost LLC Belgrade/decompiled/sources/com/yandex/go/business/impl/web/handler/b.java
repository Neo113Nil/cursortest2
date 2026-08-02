package com.yandex.go.business.impl.web.handler;

import android.content.Context;
import com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1;
import com.yandex.go.business.impl.web.model.JsFilesContent;
import com.yandex.go.business.impl.web.model.JsTextContent;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b {
    public final Context a;

    public b(Context context) {
        this.a = context;
    }

    public final Object a(JsTextContent jsTextContent, JsFilesContent jsFilesContent, YangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1 yangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new JsSharingHandler$share$2(this, jsTextContent, jsFilesContent, null), yangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
