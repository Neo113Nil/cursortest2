package defpackage;

import android.webkit.DownloadListener;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.eatskit.dto.ServiceHeaderMode;
import ru.yandex.taxi.eatskit.widget.splash.EatsKitSplash$ShimmeringSplash;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;

/* loaded from: classes12.dex */
public final class k7w0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final j7w0 d;
    public final i7w0 e;
    public final ma41 f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final zw60 j;
    public final boolean k;
    public final ert0 l;
    public final String m;
    public final DownloadListener n;
    public final fen o;
    public final dy60 p;
    public final List q;
    public final WebViewThemeChangeMode r;
    public final ServiceHeaderMode s;
    public final ly60 t;

    public /* synthetic */ k7w0(String str, boolean z, boolean z2, fl10 fl10Var, i7w0 i7w0Var, h2t h2tVar, int i, boolean z3, zw60 zw60Var, int i2) {
        this(str, z, z2, (i2 & 8) != 0 ? null : fl10Var, (i2 & 16) != 0 ? i7w0.b : i7w0Var, (i2 & 32) != 0 ? ma41.C4 : h2tVar, (i2 & 64) == 0, (i2 & 128) != 0 ? 3 : i, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? null : zw60Var, false, null, "", null, EatsKitSplash$ShimmeringSplash.WebStyle, null, EmptyList.a, WebViewThemeChangeMode.PREFERS_COLOR_SCHEME, ServiceHeaderMode.HEADER_WITH_LOGO, null);
    }

    public k7w0(String str, boolean z, boolean z2, j7w0 j7w0Var, i7w0 i7w0Var, ma41 ma41Var, boolean z3, int i, boolean z4, zw60 zw60Var, boolean z5, gyc gycVar, String str2, aoh aohVar, fen fenVar, dy60 dy60Var, List list, WebViewThemeChangeMode webViewThemeChangeMode, ServiceHeaderMode serviceHeaderMode, e90 e90Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = j7w0Var;
        this.e = i7w0Var;
        this.f = ma41Var;
        this.g = z3;
        this.h = i;
        this.i = z4;
        this.j = zw60Var;
        this.k = z5;
        this.l = gycVar;
        this.m = str2;
        this.n = aohVar;
        this.o = fenVar;
        this.p = dy60Var;
        this.q = list;
        this.r = webViewThemeChangeMode;
        this.s = serviceHeaderMode;
        this.t = e90Var;
    }
}
