package xsna;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.vk.android.launcher.icons.IconAlias;
import com.vkontakte.android.R;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.h7u0;

/* compiled from: IconAdapter.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class ipv extends FunctionReferenceImpl implements wzs<View, ymy, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(View view, ymy ymyVar) {
        final View view2 = view;
        final ymy ymyVar2 = ymyVar;
        final jpv jpvVar = (jpv) this.receiver;
        if (!epx.f(ymyVar2, jpvVar.d)) {
            int i = h7u0.p;
            h7u0.a c = h7u0.b.c(view2.getContext());
            c.g0(R.string.launcher_icon_change_dialog_title);
            c.U(R.string.launcher_icon_change_dialog_description);
            c.c0(R.string.continue_, new DialogInterface.OnClickListener() { // from class: xsna.fpv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    final Context context = view2.getContext();
                    final jpv jpvVar2 = jpv.this;
                    jpvVar2.getClass();
                    final AlertDialog create = new AlertDialog.Builder(context).setCancelable(false).setView(LayoutInflater.from(context).inflate(R.layout.layout_icon_change_dialog, (ViewGroup) null, false)).create();
                    Window window = create.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(gu9.a(context));
                    }
                    final ymy ymyVar3 = ymyVar2;
                    jpvVar2.e = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.gpv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            bny.a.getClass();
                            bny.a(context, ymyVar3.e());
                            return s3q0.a;
                        }
                    }).f(1000L, TimeUnit.MILLISECONDS).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new com.vk.im.ui.components.dialogs_list.b(new iou(create, 3), 29)), new io.reactivex.rxjava3.functions.a() { // from class: xsna.hpv
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            create.dismiss();
                            IconAlias e = ymyVar3.e();
                            jpvVar2.getClass();
                            Context context2 = context;
                            context2.startActivity(Intent.makeRestartActivityTask(e.a(context2.getPackageName())).setPackage(context2.getPackageName()));
                        }
                    }).subscribe(new wf1(new o43(23, jpvVar2, ymyVar3), 27));
                }
            });
            c.W(R.string.cancel, null);
            c.m();
        }
        return s3q0.a;
    }
}
