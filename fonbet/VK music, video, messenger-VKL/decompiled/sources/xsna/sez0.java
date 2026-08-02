package xsna;

import android.text.TextUtils;
import xsna.ocz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class sez0 implements wix {
    public final ocz0.a a;
    public final String b;
    public final String c;
    public final String d;
    public final kbz0 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public sez0(ocz0.a aVar) {
        this.a = aVar;
        if (TextUtils.isEmpty(aVar.f)) {
            this.b = null;
        } else {
            this.b = aVar.f;
        }
        if (TextUtils.isEmpty(aVar.c)) {
            this.c = null;
        } else {
            this.c = aVar.c;
        }
        if (TextUtils.isEmpty(aVar.n())) {
            this.d = null;
        } else {
            this.d = aVar.n();
        }
        this.f = aVar.V;
        this.g = aVar.W;
        this.h = aVar.X;
        this.i = aVar.Y;
        kiw kiwVar = aVar.t;
        if (kiwVar != null) {
            this.e = new kbz0(kiwVar);
        } else {
            this.e = null;
        }
    }

    @Override // xsna.wix
    public final String a() {
        return this.h;
    }

    @Override // xsna.wix
    public final String b() {
        return this.d;
    }

    @Override // xsna.wix
    public final String c() {
        return this.i;
    }

    @Override // xsna.wix
    public final String d() {
        return this.f;
    }

    @Override // xsna.wix
    public final String getDescription() {
        return this.c;
    }

    @Override // xsna.wix
    public final String getId() {
        return this.a.U;
    }

    @Override // xsna.wix
    public final kbz0 getImage() {
        return this.e;
    }

    @Override // xsna.wix
    public final String getPrice() {
        return this.g;
    }

    @Override // xsna.wix
    public final String getTitle() {
        return this.b;
    }
}
