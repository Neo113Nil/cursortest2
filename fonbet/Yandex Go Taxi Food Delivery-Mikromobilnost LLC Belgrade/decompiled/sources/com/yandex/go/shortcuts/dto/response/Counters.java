package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.hxe;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Counters;", "", "Companion", "com/yandex/go/shortcuts/dto/response/p", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Counters {
    public static final p Companion = new p();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(7))};
    public static final Counters c = new Counters(0);
    public final List a;

    public /* synthetic */ Counters(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public static final /* synthetic */ void c(Counters counters, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && jl40.l(counters.a, EmptyList.a)) {
            return;
        }
        yjdVar.e(serialDescriptor, 0, (KSerializer) b[0].getValue(), counters.a);
    }

    /* renamed from: b, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Counters) && jl40.l(this.a, ((Counters) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Counters(items=", Extension.C_BRAKE, this.a);
    }

    public Counters(int i) {
        this.a = EmptyList.a;
    }

    public Counters() {
        this(0);
    }
}
