package sg.bigo.ads.dh;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class p {
    public sg.bigo.ads.di.a B;
    public List<sg.bigo.ads.cv.a> C;

    @Nullable
    public String m;

    @Nullable
    public b n;

    @Nullable
    public String o;

    @Nullable
    public String p;

    @Nullable
    public String q;

    @Nullable
    String r;
    public long s;
    long t;
    long u;
    int v = -1;
    public int w = 0;
    public int x = 0;

    @NonNull
    public final ArrayList<n> a = new ArrayList<>();

    @NonNull
    public final ArrayList<l> b = new ArrayList<>();

    @NonNull
    public final ArrayList<c> c = new ArrayList<>();

    @NonNull
    public final ArrayList<n> d = new ArrayList<>();

    @NonNull
    public final ArrayList<n> f = new ArrayList<>();

    @NonNull
    public final ArrayList<n> e = new ArrayList<>();

    @NonNull
    public final ArrayList<j> g = new ArrayList<>();

    @NonNull
    public final ArrayList<n> i = new ArrayList<>();

    @NonNull
    public final ArrayList<n> h = new ArrayList<>();

    @NonNull
    public final ArrayList<n> j = new ArrayList<>();

    @NonNull
    public final ArrayList<n> k = new ArrayList<>();

    @NonNull
    private final ArrayList<n> D = new ArrayList<>();

    @NonNull
    public final ArrayList<n> l = new ArrayList<>();
    public final List<n> y = new ArrayList();
    public final List<n> z = new ArrayList();
    public final List<a> A = new ArrayList();

    public final void a(@NonNull List<n> list) {
        this.a.addAll(list);
    }

    public final void b(@NonNull List<n> list) {
        this.D.addAll(list);
    }

    public final void c(@NonNull List<n> list) {
        this.l.addAll(list);
    }

    public final void d(@NonNull List<n> list) {
        this.d.addAll(list);
    }

    public final void e(@NonNull List<n> list) {
        this.f.addAll(list);
    }

    public final void f(@NonNull List<n> list) {
        this.e.addAll(list);
    }

    public final void g(@NonNull List<j> list) {
        this.g.addAll(list);
    }

    public final void h(@NonNull List<n> list) {
        this.i.addAll(list);
    }

    public final void i(@NonNull List<n> list) {
        this.h.addAll(list);
    }

    public final void j(@NonNull List<n> list) {
        this.j.addAll(list);
    }

    public final void k(@NonNull List<l> list) {
        this.b.addAll(list);
        Collections.sort(this.b);
    }

    public final void l(@NonNull List<c> list) {
        this.c.addAll(list);
        Collections.sort(this.c);
    }
}
