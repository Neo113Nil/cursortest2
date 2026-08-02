package defpackage;

import android.view.View;
import android.view.ViewGroup;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import skeletor.render.SkeletonContentView;

/* loaded from: classes9.dex */
public final class bks0 extends gfe {
    public final o530 a;
    public final tls b;
    public yo40 c;
    public final pf90 w = new pf90();
    public final zjr x = new zjr(xfz.b(bks0.class.getSimpleName()));

    public bks0(o530 o530Var, tls tlsVar) {
        this.a = o530Var;
        this.b = tlsVar;
    }

    @Override // defpackage.gfe
    public final boolean b(elc elcVar) {
        return false;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        SkeletonContentView skeletonContentView = new SkeletonContentView(viewGroup.getContext(), null, 0, 6, null);
        skeletonContentView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.c = new yo40(skeletonContentView);
        return skeletonContentView;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.c = null;
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        StackTraceElement stackTraceElement;
        String str;
        tg2 a;
        aks0 aks0Var = (aks0) ((nie) obj).c;
        String str2 = aks0Var.a;
        try {
            this.w.getClass();
            rms0 a2 = pf90.a(str2);
            yo40 yo40Var = this.c;
            if (yo40Var != null) {
                SkeletonContentView skeletonContentView = (SkeletonContentView) yo40Var.a;
                skeletonContentView.setSkeletonProxy(new wls0(str2, a2, this.b));
                zjs0 zjs0Var = aks0Var.b;
                if (zjs0Var == null || (a = zjs0Var.a()) == null) {
                    return;
                }
                this.a.p(a, new ryh(skeletonContentView));
            }
        } catch (Exception e) {
            String type = ErrorTypes.SKELETON_PARSE_ERROR.getType();
            i3y a3 = xfz.a(new Pair("locator", "SkeletonContentController.onUpdateState"), new Pair("cause", e));
            zjr zjrVar = this.x;
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
            i3y a4 = xfz.a(new Pair("errorType", type));
            tjr tjrVar2 = tjrVar;
            zjrVar.d(FlexLogLevel.FAULT, "Failed to parse skeleton", xfz.c(a3, a4), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
            throw e;
        }
    }
}
