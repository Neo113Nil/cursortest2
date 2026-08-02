package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/slot/dto/SlotItemActionDto$OpenComment", "Lcom/yandex/go/slot/dto/b2;", "Companion", "Support", "$serializer", "com/yandex/go/slot/dto/e1", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemActionDto$OpenComment extends b2 {
    public static final e1 Companion = new e1();
    public final Support a;

    public SlotItemActionDto$OpenComment(int i, Support support) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = support;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SlotItemActionDto$OpenComment) && jl40.l(this.a, ((SlotItemActionDto$OpenComment) obj).a);
    }

    public final int hashCode() {
        Support support = this.a;
        if (support == null) {
            return 0;
        }
        return support.hashCode();
    }

    public final String toString() {
        return "OpenComment(support=" + this.a + Extension.C_BRAKE;
    }

    public SlotItemActionDto$OpenComment() {
        this.a = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemActionDto$OpenComment$Support;", "", "Companion", "$serializer", "com/yandex/go/slot/dto/f1", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Support {
        public static final f1 Companion = new f1();
        public final String a;
        public final String b;

        public /* synthetic */ Support(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Support)) {
                return false;
            }
            Support support = (Support) obj;
            return jl40.l(this.a, support.a) && jl40.l(this.b, support.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("Support(buttonText=", this.a, ", url=", this.b, Extension.C_BRAKE);
        }

        public Support() {
            this.a = "";
            this.b = "";
        }
    }
}
