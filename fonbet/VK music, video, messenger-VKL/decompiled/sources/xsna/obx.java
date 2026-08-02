package xsna;

/* compiled from: InteractivePlayerLruKeyValueStorage.kt */
/* loaded from: classes3.dex */
public final class obx implements ney<String, lcx> {
    public final a a = new a(50);

    /* compiled from: InteractivePlayerLruKeyValueStorage.kt */
    public final class a extends m900<String, lcx> {
        @Override // xsna.m900
        public final void entryRemoved(boolean z, String str, lcx lcxVar, lcx lcxVar2) {
            lcx lcxVar3 = lcxVar;
            lcx lcxVar4 = lcxVar2;
            if (z) {
                lcxVar3.destroy();
            } else {
                if (lcxVar3.equals(lcxVar4)) {
                    return;
                }
                lcxVar3.destroy();
            }
        }
    }

    @Override // xsna.ney
    public final void clear() {
        this.a.evictAll();
    }

    @Override // xsna.ney
    public final lcx get(String str) {
        return this.a.get(str);
    }

    @Override // xsna.ney
    public final void put(String str, lcx lcxVar) {
        this.a.put(str, lcxVar);
    }
}
