package com.yandex.go.platform.web_api;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/web_api/JsExternalNavigationInfo;", "", "Companion", "$serializer", "com/yandex/go/platform/web_api/a", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsExternalNavigationInfo {
    public static final a Companion = new a();
    public static final KSerializer[] c = {NavigationType.Companion.serializer(), null};
    public final NavigationType a;
    public final String b;

    public /* synthetic */ JsExternalNavigationInfo(int i, NavigationType navigationType, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, JsExternalNavigationInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = navigationType;
        this.b = str;
    }

    public JsExternalNavigationInfo(NavigationType navigationType, String str) {
        this.a = navigationType;
        this.b = str;
    }
}
