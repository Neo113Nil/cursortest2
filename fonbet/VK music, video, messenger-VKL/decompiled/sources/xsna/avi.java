package xsna;

import okio.ByteString;

/* compiled from: CompositeWebSocketListener.kt */
/* loaded from: classes5.dex */
public final class avi extends uhx0 {
    public final uhx0[] b;

    public avi(uhx0... uhx0VarArr) {
        this.b = uhx0VarArr;
    }

    @Override // xsna.uhx0
    public final void onClosed(phx0 phx0Var, int i, String str) {
        for (uhx0 uhx0Var : this.b) {
            uhx0Var.onClosed(phx0Var, i, str);
        }
    }

    @Override // xsna.uhx0
    public final void onClosing(phx0 phx0Var, int i, String str) {
        for (uhx0 uhx0Var : this.b) {
            uhx0Var.onClosed(phx0Var, i, str);
        }
    }

    @Override // xsna.uhx0
    public final void onFailure(phx0 phx0Var, Throwable th, okhttp3.u uVar) {
        for (uhx0 uhx0Var : this.b) {
            uhx0Var.onFailure(phx0Var, th, uVar);
        }
    }

    @Override // xsna.uhx0
    public final void onMessage(phx0 phx0Var, String str) {
        for (uhx0 uhx0Var : this.b) {
            uhx0Var.onMessage(phx0Var, str);
        }
    }

    @Override // xsna.uhx0
    public final void onOpen(phx0 phx0Var, okhttp3.u uVar) {
        for (uhx0 uhx0Var : this.b) {
            uhx0Var.onOpen(phx0Var, uVar);
        }
    }

    @Override // xsna.uhx0
    public final void onMessage(phx0 phx0Var, ByteString byteString) {
        for (uhx0 uhx0Var : this.b) {
            uhx0Var.onMessage(phx0Var, byteString);
        }
    }
}
