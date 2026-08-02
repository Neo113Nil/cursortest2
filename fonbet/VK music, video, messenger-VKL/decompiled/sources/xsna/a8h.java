package xsna;

import xsna.jyk0;

/* compiled from: CommunityLevelPaintingProvider.kt */
@ozl
/* loaded from: classes18.dex */
public final class a8h implements jyk0.a {
    @Override // xsna.jyk0.a
    public final int a(jyk0 jyk0Var) {
        return swe0.g(an10.b(jyk0Var.getRating() * (10000 / jyk0Var.getRatingCount())), 0, 10000);
    }
}
