package com.yandex.messaging;

import android.os.Parcelable;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0004\u0006\n\r\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\b\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\b\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\b\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/ChatRequest;", "Landroid/os/Parcelable;", "", "uniqueRequestId", "()Ljava/lang/String;", "T", "Lk8b;", "handler", "handle", "(Lk8b;)Ljava/lang/Object;", "Ln8b;", "", "(Ln8b;)I", "Ll8b;", "", "(Ll8b;)Z", "Lm8b;", "Lzy11;", "(Lm8b;)V", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ChatRequest extends Parcelable {
    int handle(n8b handler);

    <T> T handle(k8b handler);

    void handle(m8b handler) throws IOException;

    boolean handle(l8b handler);

    String uniqueRequestId();
}
