package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class o530 implements pi2, dez {
    public final njd a;
    public final qi2 b;
    public final seu c;
    public final zjr w = new zjr(xfz.b(o530.class.getSimpleName()));

    public o530(njd njdVar, qi2 qi2Var, seu seuVar) {
        this.a = njdVar;
        this.b = qi2Var;
        this.c = seuVar;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.w;
    }

    @Override // defpackage.pi2
    public final void p(tg2 tg2Var, ryh ryhVar) {
        StackTraceElement stackTraceElement;
        String str;
        xh2 a = this.a.a(tg2Var);
        if (a != null) {
            a.a(tg2Var, ryhVar, this);
            return;
        }
        this.b.a(tg2Var, new IllegalArgumentException("Unsupported animation"));
        if (this.c != null) {
            ErrorTypes.ANIMATION_HANDLER_NOT_FOUND.getClass();
            gw00.e(new Pair("animationType", tg2Var.getClass().getName()));
        }
        String type = ErrorTypes.ANIMATION_HANDLER_NOT_FOUND.getType();
        i3y a2 = xfz.a(new Pair("locator", "ModularAnimationPlayer.play"), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Unsupported animation: failed to find correct handler to play animation"), new Pair("animationType", tg2Var.getClass().getName()));
        zjr zjrVar = this.w;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        i3y a3 = xfz.a(new Pair("errorType", type));
        tjr tjrVar2 = tjrVar;
        zjrVar.d(FlexLogLevel.ERROR, "Failed to find correct handler to play animation", xfz.c(a2, a3), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
    }
}
