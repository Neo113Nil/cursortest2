package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import xsna.qn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ex0 implements wut0, z960, io.reactivex.rxjava3.core.a0, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ex0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wut0
    public vut0 create(Context context) {
        return new fx0(((hx0) this.c).a.create(((View) this.d).getContext()));
    }

    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        ArrayList arrayList = (ArrayList) this.c;
        defpackage.o oVar = (defpackage.o) this.d;
        b520 b520Var = (b520) j5g.b0(i, arrayList);
        if (b520Var != null) {
            oVar.invoke(b520Var);
        }
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        switch (this.b) {
            case 2:
                qn60 qn60Var = (qn60) this.c;
                qn60.b[] bVarArr = (qn60.b[]) this.d;
                Object f = qn60Var.f((qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                if (!(f instanceof Result.Failure)) {
                    yVar.onSuccess((qn60.c) f);
                }
                Throwable a = Result.a(f);
                if (a != null) {
                    yVar.onError(a);
                    break;
                }
                break;
            default:
                kotlin.coroutines.d dVar = (kotlin.coroutines.d) this.c;
                ?? r1 = (SuspendLambda) this.d;
                kotlin.coroutines.d a2 = mvj.a(EmptyCoroutineContext.b, dVar, true);
                xll xllVar = bdn.b;
                if (a2 != xllVar && a2.get(c.a.b) == null) {
                    a2 = a2.plus(xllVar);
                }
                vvg0 vvg0Var = new vvg0(a2, yVar);
                yVar.a(new zsg0(vvg0Var));
                vvg0Var.w0(CoroutineStart.DEFAULT, vvg0Var, r1);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ex0(kotlin.coroutines.d dVar, wzs wzsVar) {
        this.b = 3;
        this.c = dVar;
        this.d = (SuspendLambda) wzsVar;
    }
}
