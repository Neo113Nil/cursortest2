package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nsn implements io.reactivex.rxjava3.core.s, h9l, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nsn(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new cuh0((xk40) this.c, (NewsfeedRouter) this.d);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, xsna.fki0] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                com.vk.notifications.dnd.impl.a aVar = (com.vk.notifications.dnd.impl.a) this.d;
                final ssn ssnVar = new ssn();
                final ij8 ij8Var = new ij8(10, rVar, aVar);
                final j3 j3Var = new j3(10, aVar, rVar);
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                h7u0.a aVar2 = new h7u0.a(context);
                Integer[] numArr = ssnVar.b;
                ArrayList arrayList = new ArrayList(numArr.length);
                for (Integer num : numArr) {
                    arrayList.add(context.getResources().getString(num.intValue()));
                }
                aVar2.T((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: xsna.psn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Long[] lArr = ssn.this.a;
                        if (i < 0 || i >= lArr.length) {
                            j3Var.invoke();
                        }
                        ref$BooleanRef.element = true;
                        ij8Var.invoke(lArr[i]);
                    }
                });
                aVar2.a0(new DialogInterface.OnDismissListener() { // from class: xsna.qsn
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (Ref$BooleanRef.this.element) {
                            return;
                        }
                        j3Var.invoke();
                    }
                });
                aVar2.a.n = new DialogInterface.OnCancelListener() { // from class: xsna.rsn
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        if (Ref$BooleanRef.this.element) {
                            return;
                        }
                        j3Var.invoke();
                    }
                };
                aVar2.f0(R.string.dnd_time_chooser_title);
                aVar2.m();
                break;
            default:
                ((Ref$ObjectRef) this.d).element = new fki0(rVar, (Context) this.c);
                break;
        }
    }

    public /* synthetic */ nsn(Context context, Ref$ObjectRef ref$ObjectRef) {
        this.b = 2;
        this.d = ref$ObjectRef;
        this.c = context;
    }
}
