package com.yandex.go.shortcuts.dto.response.nestedbutton;

import com.yandex.go.dto.response.m1;
import com.yandex.go.dto.response.q1;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.rk50;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xx;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/nestedbutton/NestedButton;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/nestedbutton/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NestedButton {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(8)), null};
    public final q1 a;
    public final String b;
    public final String c;
    public final NestedButtonTypes d;
    public final boolean e;

    public /* synthetic */ NestedButton(int i, q1 q1Var, String str, String str2, NestedButtonTypes nestedButtonTypes, boolean z) {
        this.a = (i & 1) == 0 ? m1.INSTANCE : q1Var;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = NestedButtonTypes.TRAIL_BUTTON;
        } else {
            this.d = nestedButtonTypes;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    public static final /* synthetic */ void b(NestedButton nestedButton, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(nestedButton.a, m1.INSTANCE)) {
            yjdVar.e(serialDescriptor, 0, xx.f, nestedButton.a);
        }
        if (yjdVar.F() || !jl40.l(nestedButton.b, "")) {
            yjdVar.o(serialDescriptor, 1, nestedButton.b);
        }
        if (yjdVar.F() || !jl40.l(nestedButton.c, "")) {
            yjdVar.o(serialDescriptor, 2, nestedButton.c);
        }
        if (yjdVar.F() || nestedButton.d != NestedButtonTypes.TRAIL_BUTTON) {
            yjdVar.e(serialDescriptor, 3, (KSerializer) f[3].getValue(), nestedButton.d);
        }
        if (yjdVar.F() || nestedButton.e) {
            yjdVar.n(serialDescriptor, 4, nestedButton.e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NestedButton)) {
            return false;
        }
        NestedButton nestedButton = (NestedButton) obj;
        return jl40.l(this.a, nestedButton.a) && jl40.l(this.b, nestedButton.b) && jl40.l(this.c, nestedButton.c) && this.d == nestedButton.d && this.e == nestedButton.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NestedButton(action=");
        sb.append(this.a);
        sb.append(", altText=");
        sb.append(this.b);
        sb.append(", imageTag=");
        sb.append(this.c);
        sb.append(", nestedButtonTypes=");
        sb.append(this.d);
        sb.append(", isSeparatorHidden=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public NestedButton() {
        m1 m1Var = m1.INSTANCE;
        NestedButtonTypes nestedButtonTypes = NestedButtonTypes.TRAIL_BUTTON;
        this.a = m1Var;
        this.b = "";
        this.c = "";
        this.d = nestedButtonTypes;
        this.e = false;
    }
}
