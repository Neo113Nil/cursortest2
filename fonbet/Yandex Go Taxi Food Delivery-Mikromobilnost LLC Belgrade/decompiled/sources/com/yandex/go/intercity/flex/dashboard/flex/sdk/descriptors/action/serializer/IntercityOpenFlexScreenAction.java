package com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer;

import defpackage.gsq0;
import defpackage.kr;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenFlexScreenAction;", "Lkr;", "Companion", "Query", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IntercityOpenFlexScreenAction extends kr {
    public static final a Companion = new a();
    public final Query a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenFlexScreenAction$Query;", "", "Companion", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Query {
        public static final b Companion = new b();
        public final String a;
        public final kotlinx.serialization.json.c b;

        public /* synthetic */ Query(int i, String str, kotlinx.serialization.json.c cVar) {
            if (2 != (i & 2)) {
                qje.Z(i, 2, IntercityOpenFlexScreenAction$Query$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            this.b = cVar;
        }
    }

    public /* synthetic */ IntercityOpenFlexScreenAction(int i, Query query) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = query;
        }
    }

    public IntercityOpenFlexScreenAction() {
        this.a = null;
    }
}
