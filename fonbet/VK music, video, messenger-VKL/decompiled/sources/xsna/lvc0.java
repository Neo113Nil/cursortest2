package xsna;

import android.content.Context;

/* compiled from: PostsFromNotificationsMviMappers.kt */
/* loaded from: classes4.dex */
public final class lvc0 implements yt60, dwz0 {
    public final /* synthetic */ int b;
    public final Object c;
    public Object d;
    public Object e;

    public /* synthetic */ lvc0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.yt60
    public zt60 Z() {
        switch (this.b) {
            case 0:
                return (svc0) this.d;
            default:
                return (u4n0) this.d;
        }
    }

    @Override // xsna.yt60
    public au60 d0() {
        switch (this.b) {
            case 0:
                return (iwc0) this.c;
            default:
                return (h5n0) this.c;
        }
    }

    @Override // xsna.yt60
    public xt60 h1() {
        switch (this.b) {
            case 0:
                return (evc0) this.e;
            default:
                return (o4n0) this.e;
        }
    }

    @Override // xsna.dwz0
    public Object zza() {
        return new dc01((ko01) ((dwz0) this.c).zza(), (r501) ((dwz0) this.d).zza(), (Context) ((mbl) ((cbb) this.e).c).b);
    }

    public lvc0() {
        this.b = 1;
        this.c = h5h0.b();
    }
}
