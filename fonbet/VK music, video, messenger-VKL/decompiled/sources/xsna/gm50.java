package xsna;

import com.vk.mvi.core.internal.executors.ThreadType;

/* compiled from: MviRenderExtension.kt */
/* loaded from: classes.dex */
public interface gm50 {

    /* compiled from: MviRenderExtension.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T> void a(gm50 gm50Var, yzt0<T> yzt0Var, izs<? super T, s3q0> izsVar) {
            ThreadType.a aVar = ThreadType.Companion;
            ThreadType[] threadTypeArr = {ThreadType.MAIN};
            aVar.getClass();
            ThreadType.a.a(threadTypeArr);
            yzt0Var.b(izsVar, gm50Var.getViewOwner());
        }

        public static <R extends fm50<? extends km50>> void b(gm50 gm50Var, n0u0<R> n0u0Var, izs<? super R, s3q0> izsVar) {
            ThreadType.a aVar = ThreadType.Companion;
            ThreadType[] threadTypeArr = {ThreadType.MAIN};
            aVar.getClass();
            ThreadType.a.a(threadTypeArr);
            n0u0Var.a(izsVar, gm50Var.getViewOwner());
        }
    }

    f5z getViewOwner();
}
