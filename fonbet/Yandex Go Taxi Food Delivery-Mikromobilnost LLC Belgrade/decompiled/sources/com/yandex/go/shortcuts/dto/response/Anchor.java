package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.x4e;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Anchor;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Anchor {
    public static final a Companion = new a();
    public final float a;
    public final float b;

    public /* synthetic */ Anchor(int i, float f, float f2) {
        if ((i & 1) == 0) {
            this.a = 0.0f;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = 0.0f;
        } else {
            this.b = f2;
        }
    }

    public static final /* synthetic */ void a(Anchor anchor, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || Float.compare(anchor.a, 0.0f) != 0) {
            yjdVar.z(serialDescriptor, 0, anchor.a);
        }
        if (!yjdVar.F() && Float.compare(anchor.b, 0.0f) == 0) {
            return;
        }
        yjdVar.z(serialDescriptor, 1, anchor.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Anchor)) {
            return false;
        }
        Anchor anchor = (Anchor) obj;
        return Float.compare(this.a, anchor.a) == 0 && Float.compare(this.b, anchor.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("Anchor(vertical=", this.a, ", horizontal=", this.b, Extension.C_BRAKE);
    }

    public Anchor(int i) {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    public Anchor() {
        this(0);
    }
}
