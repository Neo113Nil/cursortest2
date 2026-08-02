package defpackage;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import java.util.Map;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class bhr {
    public final Map a;
    public final AppCompatActivity b;
    public final ViewGroup c;
    public final OkHttpClient d;
    public final lir e;
    public final boolean f;
    public final boolean g;
    public final k5c h;
    public final String i;
    public final String j;
    public final Map k;
    public final jir l;
    public final FragmentManager m;
    public final Map n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final wb8 r;

    public bhr(Map map, AppCompatActivity appCompatActivity, ViewGroup viewGroup, OkHttpClient okHttpClient, lir lirVar, boolean z, boolean z2, k5c k5cVar, String str, String str2, Map map2, jir jirVar, FragmentManager fragmentManager, Map map3, String str3, boolean z3, wb8 wb8Var, int i) {
        FragmentManager fragmentManager2 = (i & 4096) != 0 ? null : fragmentManager;
        String str4 = (i & 16384) == 0 ? str3 : null;
        boolean z4 = (32768 & i) == 0;
        boolean z5 = (i & 65536) == 0 ? z3 : false;
        this.a = map;
        this.b = appCompatActivity;
        this.c = viewGroup;
        this.d = okHttpClient;
        this.e = lirVar;
        this.f = z;
        this.g = z2;
        this.h = k5cVar;
        this.i = str;
        this.j = str2;
        this.k = map2;
        this.l = jirVar;
        this.m = fragmentManager2;
        this.n = map3;
        this.o = str4;
        this.p = z4;
        this.q = z5;
        this.r = wb8Var;
    }
}
