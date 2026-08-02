package com.yandex.go.platform.js_api.models;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.qje;
import defpackage.vfc;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsError;", "", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "msg", "getMsg", "getMsg$annotations", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "getCode$annotations", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/g", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsError extends Throwable {
    public static final g Companion = new g();
    private final Integer code;
    private final String msg;
    private final String name;

    public /* synthetic */ JsError(String str, int i, Integer num, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, JsError$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.msg = str2;
        if ((i & 4) == 0) {
            this.code = null;
        } else {
            this.code = num;
        }
    }

    public static final /* synthetic */ void a(JsError jsError, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, jsError.name);
        yjdVar.o(serialDescriptor, 1, jsError.msg);
        if (!yjdVar.F() && jsError.code == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 2, h6w.a, jsError.code);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("JsError(name=");
        sb.append(this.name);
        sb.append(", message=");
        sb.append(this.msg);
        sb.append(", code=");
        return vfc.o(sb, this.code, ')');
    }

    public JsError(String str, String str2) {
        super(str2);
        this.name = str;
        this.msg = str2;
        this.code = null;
    }
}
