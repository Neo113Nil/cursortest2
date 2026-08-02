package defpackage;

import flex.trim.memory.MemoryPriority;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class l1m extends fnr0 {
    public final String a;
    public final String b;

    public l1m() {
        super(0);
        this.a = "memoryPriority";
        this.b = "DocumentMemoryPriority";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.a;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.b;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        try {
            return new k1m((MemoryPriority) sbxVar.a(MemoryPriority.Companion.serializer(), bVar));
        } catch (Exception unused) {
            return null;
        }
    }
}
