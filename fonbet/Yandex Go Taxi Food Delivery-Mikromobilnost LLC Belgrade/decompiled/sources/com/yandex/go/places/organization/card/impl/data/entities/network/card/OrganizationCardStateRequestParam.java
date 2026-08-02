package com.yandex.go.places.organization.card.impl.data.entities.network.card;

import defpackage.gsq0;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationCardStateRequestParam;", "", "Companion", "PermalinkStateParam", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/card/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardStateRequestParam {
    public static final d Companion = new d();
    public final zzs a;
    public final String b;
    public final c c;
    public final String d;
    public final PermalinkStateParam e;

    public /* synthetic */ OrganizationCardStateRequestParam(int i, zzs zzsVar, String str, c cVar, String str2, PermalinkStateParam permalinkStateParam) {
        this.a = (i & 1) == 0 ? zzs.f : zzsVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = cVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = permalinkStateParam;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationCardStateRequestParam$PermalinkStateParam;", "", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/card/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PermalinkStateParam {
        public static final e Companion = new e();
        public final String a;
        public final Boolean b;

        public /* synthetic */ PermalinkStateParam(int i, String str, Boolean bool) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
        }

        public PermalinkStateParam(String str, Boolean bool) {
            this.a = str;
            this.b = bool;
        }

        public PermalinkStateParam() {
            this(null, null);
        }
    }

    public OrganizationCardStateRequestParam(zzs zzsVar, String str, ModeContext$Delivery modeContext$Delivery, String str2, PermalinkStateParam permalinkStateParam) {
        this.a = zzsVar;
        this.b = str;
        this.c = modeContext$Delivery;
        this.d = str2;
        this.e = permalinkStateParam;
    }

    public OrganizationCardStateRequestParam() {
        this(zzs.f, null, null, null, null);
    }
}
