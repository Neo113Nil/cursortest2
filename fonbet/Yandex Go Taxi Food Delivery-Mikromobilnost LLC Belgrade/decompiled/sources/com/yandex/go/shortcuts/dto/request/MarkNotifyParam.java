package com.yandex.go.shortcuts.dto.request;

import com.yandex.go.shortcuts.models.ShortcutClickAction;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr00;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/MarkNotifyParam;", "", "Companion", "MarkNotifyItem", "AdditionalProperty", "$serializer", "com/yandex/go/shortcuts/dto/request/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarkNotifyParam {
    public static final d Companion = new d();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(14)), null};
    public final String a;
    public final List b;
    public final String c;

    public /* synthetic */ MarkNotifyParam(int i, String str, String str2, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkNotifyParam)) {
            return false;
        }
        MarkNotifyParam markNotifyParam = (MarkNotifyParam) obj;
        return jl40.l(this.a, markNotifyParam.a) && jl40.l(this.b, markNotifyParam.b) && jl40.l(this.c, markNotifyParam.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(xvz.r("MarkNotifyParam(requestId=", this.a, ", seenCommunications=", this.b, ", screenType="), this.c, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/MarkNotifyParam$AdditionalProperty;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class AdditionalProperty {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ AdditionalProperty(int i, String str, String str2) {
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

        public static final /* synthetic */ void a(AdditionalProperty additionalProperty, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(additionalProperty.a, "")) {
                yjdVar.o(serialDescriptor, 0, additionalProperty.a);
            }
            if (!yjdVar.F() && jl40.l(additionalProperty.b, "")) {
                return;
            }
            yjdVar.o(serialDescriptor, 1, additionalProperty.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdditionalProperty)) {
                return false;
            }
            AdditionalProperty additionalProperty = (AdditionalProperty) obj;
            return jl40.l(this.a, additionalProperty.a) && jl40.l(this.b, additionalProperty.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("AdditionalProperty(name=", this.a, ", value=", this.b, Extension.C_BRAKE);
        }

        public AdditionalProperty(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public AdditionalProperty() {
            this("", "");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/MarkNotifyParam$MarkNotifyItem;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class MarkNotifyItem {
        public static final e Companion = new e();
        public static final i3y[] d;
        public final String a;
        public final ShortcutClickAction b;
        public final List c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new kr00(15)), kotlin.a.b(lazyThreadSafetyMode, new kr00(16))};
        }

        public /* synthetic */ MarkNotifyItem(int i, String str, ShortcutClickAction shortcutClickAction, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = ShortcutClickAction.TAP;
            } else {
                this.b = shortcutClickAction;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public static final /* synthetic */ void b(MarkNotifyItem markNotifyItem, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(markNotifyItem.a, "")) {
                yjdVar.o(serialDescriptor, 0, markNotifyItem.a);
            }
            boolean F = yjdVar.F();
            i3y[] i3yVarArr = d;
            if (F || markNotifyItem.b != ShortcutClickAction.TAP) {
                yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), markNotifyItem.b);
            }
            if (!yjdVar.F() && jl40.l(markNotifyItem.c, EmptyList.a)) {
                return;
            }
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), markNotifyItem.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarkNotifyItem)) {
                return false;
            }
            MarkNotifyItem markNotifyItem = (MarkNotifyItem) obj;
            return jl40.l(this.a, markNotifyItem.a) && this.b == markNotifyItem.b && jl40.l(this.c, markNotifyItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarkNotifyItem(shortcutId=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", additionalProperties=");
            return ly3.s(sb, this.c, Extension.C_BRAKE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MarkNotifyItem() {
            this(7, (String) null, (List) (0 == true ? 1 : 0));
        }

        public MarkNotifyItem(String str, ShortcutClickAction shortcutClickAction, List list) {
            this.a = str;
            this.b = shortcutClickAction;
            this.c = list;
        }

        public /* synthetic */ MarkNotifyItem(int i, String str, List list) {
            this((i & 1) != 0 ? "" : str, ShortcutClickAction.TAP, (i & 4) != 0 ? EmptyList.a : list);
        }
    }

    public MarkNotifyParam(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public MarkNotifyParam() {
        this("", EmptyList.a, null);
    }
}
