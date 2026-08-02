package com.yandex.go.platform.js_api.contact;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/platform/js_api/contact/ContactSelectionError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "UriIsNull", "UserCancellation", "Lcom/yandex/go/platform/js_api/contact/ContactSelectionError$UriIsNull;", "Lcom/yandex/go/platform/js_api/contact/ContactSelectionError$UserCancellation;", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ContactSelectionError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/platform/js_api/contact/ContactSelectionError$UriIsNull;", "Lcom/yandex/go/platform/js_api/contact/ContactSelectionError;", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UriIsNull extends ContactSelectionError {
        public static final UriIsNull a = new UriIsNull("Uri cannot be null");
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/platform/js_api/contact/ContactSelectionError$UserCancellation;", "Lcom/yandex/go/platform/js_api/contact/ContactSelectionError;", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UserCancellation extends ContactSelectionError {
        public static final UserCancellation a = new UserCancellation("Contact selection cancelled");
    }
}
