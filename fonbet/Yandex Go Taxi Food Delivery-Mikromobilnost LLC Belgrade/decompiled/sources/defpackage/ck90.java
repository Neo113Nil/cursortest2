package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.model.PassItemType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lck90;", "", "Companion", "ak90", "bk90", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ck90 {
    public static final bk90 Companion = new bk90();
    public static final i3y[] p;
    public final String a;
    public final PassItemType b;
    public final String c;
    public final FormattedText d;
    public final FormattedText e;
    public final String f;
    public final FormattedText g;
    public final FormattedText h;
    public final z490 i;
    public final FormattedText j;
    public final boolean k;
    public final Boolean l;
    public final List m;
    public final Double n;
    public final boolean o;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new i3y[]{null, a.b(lazyThreadSafetyMode, new aw80(22)), null, null, null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new aw80(23)), null, null};
    }

    public /* synthetic */ ck90(int i, String str, PassItemType passItemType, String str2, FormattedText formattedText, FormattedText formattedText2, String str3, FormattedText formattedText3, FormattedText formattedText4, z490 z490Var, FormattedText formattedText5, boolean z, Boolean bool, List list, Double d, boolean z2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = passItemType;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i & 16) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = FormattedText.c;
        } else {
            this.g = formattedText3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = formattedText4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = z490Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = formattedText5;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
        this.m = (i & 4096) == 0 ? EmptyList.a : list;
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = d;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z2;
        }
    }

    public ck90() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = formattedText;
        this.e = formattedText;
        this.f = null;
        this.g = formattedText;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = null;
        this.m = EmptyList.a;
        this.n = null;
        this.o = false;
    }
}
