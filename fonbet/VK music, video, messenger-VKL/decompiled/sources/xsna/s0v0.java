package xsna;

/* compiled from: VkImageRequestWrapper.kt */
/* loaded from: classes2.dex */
public final class s0v0 implements io.reactivex.rxjava3.functions.e {
    public ae b;
    public boolean c;

    @Override // io.reactivex.rxjava3.functions.e
    public final synchronized void cancel() {
        if (!this.c) {
            this.c = true;
            ae aeVar = this.b;
            if (aeVar != null) {
                aeVar.close();
            }
        }
    }
}
