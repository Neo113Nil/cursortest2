package xsna;

import xsna.jyk0;

/* compiled from: NotificationCSatStarsView.kt */
/* loaded from: classes4.dex */
public final class l870 implements jyk0.a {
    @Override // xsna.jyk0.a
    public final int a(jyk0 jyk0Var) {
        return swe0.g(an10.b(jyk0Var.getRating() * (10000 / jyk0Var.getRatingCount())), 0, 10000);
    }
}
