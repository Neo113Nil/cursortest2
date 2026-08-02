package defpackage;

import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public final class mid extends eid {
    public final sbx c;
    public int d;

    public mid(xrw xrwVar, sbx sbxVar) {
        super(xrwVar);
        this.c = sbxVar;
    }

    @Override // defpackage.eid
    public final void a() {
        this.a = true;
        this.d++;
    }

    @Override // defpackage.eid
    public final void b() {
        this.a = false;
        h("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            h(this.c.a.g);
        }
    }

    @Override // defpackage.eid
    public final void c() {
        if (this.a) {
            this.a = false;
        } else {
            b();
        }
    }

    @Override // defpackage.eid
    public final void k() {
        e(HexString.CHAR_SPACE);
    }

    @Override // defpackage.eid
    public final void l() {
        this.d--;
    }
}
