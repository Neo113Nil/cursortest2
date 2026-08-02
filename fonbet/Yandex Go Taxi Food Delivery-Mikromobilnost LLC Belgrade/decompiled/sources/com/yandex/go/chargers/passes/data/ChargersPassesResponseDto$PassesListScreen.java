package com.yandex.go.chargers.passes.data;

import defpackage.bka;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nba;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassesResponseDto$PassesListScreen", "Lbka;", "Companion", "com/yandex/go/chargers/passes/data/s0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassesResponseDto$PassesListScreen implements bka {
    public static final s0 Companion = new s0();
    public static final i3y[] e;
    public final String a;
    public final FormattedText b;
    public final List c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new nba(23)), kotlin.a.b(lazyThreadSafetyMode, new nba(24))};
    }

    public /* synthetic */ ChargersPassesResponseDto$PassesListScreen(int i, String str, FormattedText formattedText, List list, List list2) {
        this.a = (i & 1) == 0 ? "list" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassesResponseDto$PassesListScreen)) {
            return false;
        }
        ChargersPassesResponseDto$PassesListScreen chargersPassesResponseDto$PassesListScreen = (ChargersPassesResponseDto$PassesListScreen) obj;
        return jl40.l(this.a, chargersPassesResponseDto$PassesListScreen.a) && jl40.l(this.b, chargersPassesResponseDto$PassesListScreen.b) && jl40.l(this.c, chargersPassesResponseDto$PassesListScreen.c) && jl40.l(this.d, chargersPassesResponseDto$PassesListScreen.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
    }

    public final String toString() {
        return vfc.p(xvz.q("PassesListScreen(type=", this.a, ", title=", ", passes=", this.b), this.c, ", bottomButtons=", this.d, Extension.C_BRAKE);
    }

    public ChargersPassesResponseDto$PassesListScreen() {
        FormattedText formattedText = FormattedText.c;
        this.a = "list";
        this.b = formattedText;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
    }
}
