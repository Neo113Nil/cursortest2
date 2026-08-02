package com.yandex.go.flex.common.router.web_view;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/router/web_view/OpenWindowParams;", "", "Companion", "Payload", "$serializer", "com/yandex/go/flex/common/router/web_view/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OpenWindowParams {
    public static final c Companion = new c();
    public final Payload a;

    public /* synthetic */ OpenWindowParams(int i, Payload payload) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = payload;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/router/web_view/OpenWindowParams$Payload;", "", "Companion", "$serializer", "com/yandex/go/flex/common/router/web_view/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Payload {
        public static final d Companion = new d();
        public final String a;

        public /* synthetic */ Payload(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public Payload() {
            this.a = "";
        }
    }

    public OpenWindowParams() {
        this.a = null;
    }
}
