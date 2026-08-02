package com.yandex.go.flex.common.actions.create_order;

import defpackage.gsq0;
import defpackage.kr;
import kotlin.Metadata;
import kotlinx.serialization.json.c;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/actions/create_order/SendOrderDraftAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/flex/common/actions/create_order/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SendOrderDraftAction extends kr {
    public static final a Companion = new a();
    public final c a;
    public final String b;
    public final String c;

    public /* synthetic */ SendOrderDraftAction(int i, String str, String str2, c cVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = cVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public SendOrderDraftAction() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
