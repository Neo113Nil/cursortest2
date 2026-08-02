package defpackage;

import kotlin.Pair;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public abstract class fnr0 {
    private final gnr0 flags;

    public static /* synthetic */ zy11 $r8$lambda$DlO2v2UxcaFwT4pGtGp0pNPsSPU() {
        throw null;
    }

    public /* synthetic */ fnr0(int i) {
        this(new gnr0(false));
    }

    public static /* synthetic */ bnr0 tryParse$default(fnr0 fnr0Var, sbx sbxVar, c cVar, wls wlsVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: tryParse");
            return null;
        }
        if ((i & 4) != 0) {
            wlsVar = new i8r0(17);
        }
        return fnr0Var.tryParse(sbxVar, cVar, wlsVar);
    }

    public static final zy11 tryParse$lambda$0() {
        throw null;
    }

    public final gnr0 getFlags() {
        return this.flags;
    }

    public abstract String getJsonKey();

    public abstract String getSharedDataParserType();

    public abstract bnr0 tryParse(sbx sbxVar, b bVar);

    public final bnr0 tryParse(sbx sbxVar, c cVar, wls wlsVar) {
        b bVar = (b) cVar.get(getJsonKey());
        if (bVar == null) {
            return null;
        }
        Pair pair = new Pair(tryParse(sbxVar, bVar), new xez0(System.currentTimeMillis(), System.currentTimeMillis()));
        bnr0 bnr0Var = (bnr0) pair.getFirst();
        xez0 xez0Var = (xez0) pair.getSecond();
        if (bnr0Var != null) {
            wlsVar.invoke(xez0Var, getSharedDataParserType());
        }
        return bnr0Var;
    }

    public fnr0(gnr0 gnr0Var) {
        this.flags = gnr0Var;
    }

    @jxi
    public /* synthetic */ fnr0() {
        this(new gnr0(false));
    }

    public final bnr0 tryParse(sbx sbxVar, c cVar) {
        return tryParse$default(this, sbxVar, cVar, null, 4, null);
    }
}
