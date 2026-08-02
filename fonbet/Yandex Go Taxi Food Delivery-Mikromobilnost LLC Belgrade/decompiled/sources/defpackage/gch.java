package defpackage;

import android.content.Context;
import com.google.firebase.a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class gch implements e1d {
    public final /* synthetic */ int a;
    public final /* synthetic */ jgg0 b;

    public /* synthetic */ gch(jgg0 jgg0Var, int i) {
        this.a = i;
        this.b = jgg0Var;
    }

    @Override // defpackage.e1d
    public final Object k(yuf0 yuf0Var) {
        FirebaseMessaging lambda$getComponents$0;
        int i = this.a;
        jgg0 jgg0Var = this.b;
        switch (i) {
            case 0:
                return new ich((Context) yuf0Var.a(Context.class), ((a) yuf0Var.a(a.class)).f(), yuf0Var.g(jgg0.a(seu.class)), yuf0Var.d(gnh.class), (Executor) yuf0Var.c(jgg0Var));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(jgg0Var, yuf0Var);
                return lambda$getComponents$0;
        }
    }
}
