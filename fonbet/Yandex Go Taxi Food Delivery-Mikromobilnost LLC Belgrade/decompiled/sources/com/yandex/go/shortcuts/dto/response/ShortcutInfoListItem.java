package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ShortcutInfoListItem;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/p2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShortcutInfoListItem {
    public static final p2 Companion = new p2();
    public final String a;
    public final String b;

    public /* synthetic */ ShortcutInfoListItem(int i, String str, String str2) {
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

    public static final /* synthetic */ void a(ShortcutInfoListItem shortcutInfoListItem, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(shortcutInfoListItem.a, "")) {
            yjdVar.o(serialDescriptor, 0, shortcutInfoListItem.a);
        }
        if (!yjdVar.F() && jl40.l(shortcutInfoListItem.b, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 1, shortcutInfoListItem.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortcutInfoListItem)) {
            return false;
        }
        ShortcutInfoListItem shortcutInfoListItem = (ShortcutInfoListItem) obj;
        return jl40.l(this.a, shortcutInfoListItem.a) && jl40.l(this.b, shortcutInfoListItem.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ShortcutInfoListItem(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }

    public ShortcutInfoListItem(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public ShortcutInfoListItem() {
        this("", "");
    }
}
