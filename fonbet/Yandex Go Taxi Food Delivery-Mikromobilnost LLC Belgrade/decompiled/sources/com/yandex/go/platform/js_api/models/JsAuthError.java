package com.yandex.go.platform.js_api.models;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.gsq0;
import defpackage.qje;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsAuthError;", "", "Lcom/yandex/go/platform/js_api/models/ErrorCode;", ErrorResponseData.JSON_ERROR_CODE, "Lcom/yandex/go/platform/js_api/models/ErrorCode;", "getErrorCode", "()Lcom/yandex/go/platform/js_api/models/ErrorCode;", "getErrorCode$annotations", "()V", "", "msg", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "getMsg$annotations", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/a", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsAuthError extends Throwable {
    public static final a Companion = new a();
    public static final KSerializer[] a = {ErrorCode.Companion.serializer(), null};
    private final ErrorCode errorCode;
    private final String msg;

    public /* synthetic */ JsAuthError(int i, ErrorCode errorCode, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, JsAuthError$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.errorCode = errorCode;
        this.msg = str;
    }

    public static final /* synthetic */ void a(JsAuthError jsAuthError, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.e(serialDescriptor, 0, a[0], jsAuthError.errorCode);
        yjdVar.o(serialDescriptor, 1, jsAuthError.msg);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "JsAuthError(errorCode=" + this.errorCode + ')';
    }

    public JsAuthError(ErrorCode errorCode, String str) {
        super(str);
        this.errorCode = errorCode;
        this.msg = str;
    }
}
