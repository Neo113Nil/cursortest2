package sg.bigo.ads.dl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.u;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.dk.f;
import sg.bigo.ads.dl.b;

/* loaded from: classes9.dex */
public final class a implements sg.bigo.ads.dk.a {
    final ViewGroup a;

    @NonNull
    public b b;
    public InterfaceC2479a c;
    private final b.a d = new b.a() { // from class: sg.bigo.ads.dl.a.1
        @Override // sg.bigo.ads.dl.b.a
        public final void a() {
            InterfaceC2479a interfaceC2479a = a.this.c;
            if (interfaceC2479a != null) {
                interfaceC2479a.a();
            }
            b b = a.this.b();
            v.a(b, a.this.a, null, -1);
            b.setVPAIDEvenListener(a.this.b.getVPAIDEvenListener());
            b.setLayoutParams(a.this.b.getLayoutParams());
            v.b(a.this.b);
            a.this.b = b;
        }
    };
    private final Context e;
    private final String f;
    private final int g;
    private final int h;
    private final f i;
    private final String j;
    private final int k;
    private u l;

    /* renamed from: sg.bigo.ads.dl.a$a, reason: collision with other inner class name */
    public interface InterfaceC2479a {
        void a();
    }

    public a(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull String str, int i, int i2, @NonNull f fVar, @Nullable String str2, int i3, u uVar) {
        this.e = context;
        this.a = viewGroup;
        this.f = str;
        this.g = i;
        this.h = i2;
        this.i = fVar;
        this.j = str2;
        this.k = i3;
        this.l = uVar;
        b b = b();
        this.b = b;
        v.a(b, viewGroup, null, 0);
    }

    @Override // sg.bigo.ads.ak.a
    public final void a() {
        this.b.a("window.vpaidwrapper.pauseAd()");
    }

    public final b b() {
        b bVar = new b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        bVar.setOnRenderProcessGoneListener(this.d);
        return bVar;
    }
}
