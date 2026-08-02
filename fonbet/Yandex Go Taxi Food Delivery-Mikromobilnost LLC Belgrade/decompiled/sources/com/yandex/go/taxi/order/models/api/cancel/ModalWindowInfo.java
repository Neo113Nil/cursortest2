package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.sq20;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/ModalWindowInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/d0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ModalWindowInfo {
    public static final d0 Companion = new d0();
    public static final i3y[] f;
    public final String a;
    public final String b;
    public final String c;
    public final ButtonsArrangementDto d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new sq20(25)), kotlin.a.b(lazyThreadSafetyMode, new sq20(26))};
    }

    public /* synthetic */ ModalWindowInfo(int i, String str, String str2, String str3, ButtonsArrangementDto buttonsArrangementDto, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = buttonsArrangementDto;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalWindowInfo)) {
            return false;
        }
        ModalWindowInfo modalWindowInfo = (ModalWindowInfo) obj;
        return jl40.l(this.a, modalWindowInfo.a) && jl40.l(this.b, modalWindowInfo.b) && jl40.l(this.c, modalWindowInfo.c) && this.d == modalWindowInfo.d && jl40.l(this.e, modalWindowInfo.e);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        ButtonsArrangementDto buttonsArrangementDto = this.d;
        return this.e.hashCode() + ((b + (buttonsArrangementDto != null ? buttonsArrangementDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ModalWindowInfo(icon=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", buttonsArrangement=");
        v.append(this.d);
        v.append(", actionButtons=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    public ModalWindowInfo(int i) {
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = EmptyList.a;
    }

    public ModalWindowInfo() {
        this(0);
    }
}
