package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import com.ironsource.Aa;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vkontakte.android.R;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.tracer.crash.report.CrashDescription;
import ru.ok.tracer.crash.report.CrashLoggerInternal;
import xsna.cwb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        T t;
        switch (this.b) {
            case 0:
                Aa.a((LevelPlayAdInfo) this.c, (LevelPlayAdError) this.d, (Aa) this.e);
                return;
            case 1:
                CrashLoggerInternal.reportCrash$lambda$0((CrashLoggerInternal) this.c, (CrashDescription) this.d, (CountDownLatch) this.e);
                return;
            case 2:
                bzb0 bzb0Var = (bzb0) this.c;
                cwb0.s0 s0Var = (cwb0.s0) this.d;
                final gzs gzsVar = (gzs) this.e;
                Context context = bzb0Var.a;
                CharSequence charSequence = s0Var.b;
                int i = s0Var.c;
                String str = s0Var.d;
                final b410 b410Var = new b410(bzb0Var, 12);
                if (i != 0) {
                    str = context.getString(i);
                }
                ner0 ner0Var = new ner0(context, R.style.VkIm_Dialog_Progress);
                Window window = ner0Var.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(e3m.e(R.attr.im_bg_modal_dialog, context));
                }
                ner0Var.setTitle(charSequence);
                ner0Var.setMessage(str);
                ner0Var.setIndeterminate(true);
                ner0Var.setCancelable(gzsVar != null);
                ner0Var.setCanceledOnTouchOutside(false);
                ner0Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.syb0
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        gzs gzsVar2 = gzs.this;
                        if (gzsVar2 != null) {
                            gzsVar2.invoke();
                        }
                    }
                });
                ner0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.tyb0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        b410.this.invoke();
                    }
                });
                ner0Var.show();
                bzb0Var.e = ner0Var;
                return;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                Activity activity = (Activity) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                try {
                    try {
                        deh0.a.getClass();
                    } catch (Exception e) {
                        l370 l370Var = x290.k;
                        if (l370Var == null) {
                            l370Var = null;
                        }
                        l370Var.v(e);
                        countDownLatch.countDown();
                        t = 0;
                    }
                    ref$ObjectRef.element = t;
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            default:
                yads.vu1.a((yads.vu1) this.c, (Context) this.d, (yads.l00) this.e);
                return;
        }
    }
}
