package com.yandex.go.shortcuts.models;

import defpackage.dwq0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/models/ShortcutClickInfo;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/models/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ShortcutClickInfo {
    public static final a Companion = new a();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(21)), null, null, null, null};
    public final String a;
    public final ShortcutClickAction b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ ShortcutClickInfo(int i, String str, ShortcutClickAction shortcutClickAction, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = ShortcutClickAction.TAP;
        } else {
            this.b = shortcutClickAction;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortcutClickInfo)) {
            return false;
        }
        ShortcutClickInfo shortcutClickInfo = (ShortcutClickInfo) obj;
        return jl40.l(this.a, shortcutClickInfo.a) && this.b == shortcutClickInfo.b && jl40.l(this.c, shortcutClickInfo.c) && jl40.l(this.d, shortcutClickInfo.d) && jl40.l(this.e, shortcutClickInfo.e) && jl40.l(this.f, shortcutClickInfo.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortcutClickInfo(shortcutId=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", gridId=");
        g8e.D(sb, this.c, ", shortcutType=", this.d, ", promoId=");
        return g8e.r(sb, this.e, ", uuid=", this.f, Extension.C_BRAKE);
    }

    public ShortcutClickInfo(String str, ShortcutClickAction shortcutClickAction, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = shortcutClickAction;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public ShortcutClickInfo() {
        this("", ShortcutClickAction.TAP, "", "", null, "");
    }
}
