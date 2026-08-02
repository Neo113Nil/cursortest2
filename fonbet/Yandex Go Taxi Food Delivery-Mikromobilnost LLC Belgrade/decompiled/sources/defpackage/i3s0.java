package defpackage;

import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.shortcuts.impl.ShortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2;
import com.yandex.go.shortcuts.impl.b;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;

/* loaded from: classes13.dex */
public final class i3s0 implements Consumer {
    public final /* synthetic */ ga5 a;
    public final /* synthetic */ Action$TaxiExpectedDestination b;
    public final /* synthetic */ j0s0 c;
    public final /* synthetic */ ShortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2 w;

    public i3s0(b bVar, ga5 ga5Var, Action$TaxiExpectedDestination action$TaxiExpectedDestination, j0s0 j0s0Var, ShortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2 shortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2) {
        this.a = ga5Var;
        this.b = action$TaxiExpectedDestination;
        this.c = j0s0Var;
        this.w = shortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        String str = this.b.c;
        hst hstVar = jst.e;
        Locale locale = Locale.US;
        ga5 ga5Var = this.a;
        xby.l(hstVar, "SUMMARY:TariffClick:Failed", null, th, String.format(locale, "Failed to openExpectedDestination with uri=[%s] and shortcutId=[%s]", Arrays.copyOf(new Object[]{str, ga5Var.getBase().j}, 2)), 2);
        ((k4s0) this.c).a(ga5Var);
        this.w.invoke(zy11.a);
    }
}
