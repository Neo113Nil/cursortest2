package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.z8n;

/* compiled from: DiscoverSimilarFeedMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class a9n implements au60<z8n> {
    public static z8n b(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new z8n.a.b((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new u8n((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new y8n((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new v8n((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new x8n((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new w8n((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new t8n((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new z8n.b.a((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.au60
    public final /* bridge */ /* synthetic */ z8n a(ds60 ds60Var) {
        return b(ds60Var);
    }
}
