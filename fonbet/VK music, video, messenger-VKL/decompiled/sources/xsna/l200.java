package xsna;

import com.vk.push.common.Logger;

/* compiled from: LoggingWebSocketListener.kt */
/* loaded from: classes5.dex */
public final class l200 extends uhx0 {
    public final Logger b;

    public l200(Logger logger) {
        this.b = logger.createLogger("LoggingWebSocketListener");
    }

    @Override // xsna.uhx0
    public final void onClosed(phx0 phx0Var, int i, String str) {
        Logger.DefaultImpls.warn$default(this.b, com.vk.movika.sdk.base.model.history.b.b(i, "Websocket connection closed with ", " because ", str), null, 2, null);
    }

    @Override // xsna.uhx0
    public final void onClosing(phx0 phx0Var, int i, String str) {
        Logger.DefaultImpls.warn$default(this.b, com.vk.movika.sdk.base.model.history.b.b(i, "Websocket connection start closing with ", " because ", str), null, 2, null);
    }

    @Override // xsna.uhx0
    public final void onFailure(phx0 phx0Var, Throwable th, okhttp3.u uVar) {
        String str = "Websocket connection failed with " + th.getMessage() + " cause " + th.getCause();
        Logger logger = this.b;
        Logger.DefaultImpls.error$default(logger, str, null, 2, null);
        if (uVar != null) {
            Logger.DefaultImpls.error$default(logger, "Websocket received error response with " + uVar.e + " because " + uVar.d, null, 2, null);
        }
    }

    @Override // xsna.uhx0
    public final void onOpen(phx0 phx0Var, okhttp3.u uVar) {
        Logger.DefaultImpls.info$default(this.b, "Websocket connection opened with code = " + uVar.e, null, 2, null);
    }
}
