package com.yandex.go.safety.center.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.mkr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/api/ShareResponse;", "", "Companion", "Message", "$serializer", "com/yandex/go/safety/center/api/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShareResponse {
    public static final k Companion = new k();
    public final boolean a;
    public final Message b;

    public /* synthetic */ ShareResponse(int i, boolean z, Message message) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = message;
        }
    }

    public ShareResponse() {
        this.a = false;
        this.b = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/api/ShareResponse$Message;", "", "Companion", "$serializer", "com/yandex/go/safety/center/api/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Message {
        public static final l Companion = new l();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(3))};
        public final String a;
        public final List b;

        public /* synthetic */ Message(int i, String str, List list) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = list;
            }
        }

        public Message() {
            this.a = null;
            this.b = null;
        }
    }
}
