package xsna;

import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.im.engine.models.dialogs.DialogExt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.uub;

/* compiled from: ChatPreviewViewController.kt */
/* loaded from: classes18.dex */
public final class tub extends pgp<vub, rub> {
    public final a1w b;
    public final cau0 c;
    public asm d;
    public AppCompatActivity e;
    public irb f;
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    public tub(a1w a1wVar) {
        this.b = a1wVar;
        this.c = a1wVar.r().h;
    }

    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        uub uubVar = (uub) yn50Var;
        if (!(uubVar instanceof uub.a)) {
            throw new NoWhenBranchMatchedException();
        }
        asm asmVar = this.d;
        if (asmVar != null) {
            uub.a aVar = (uub.a) uubVar;
            asmVar.f(aVar.a, aVar.b);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        irb irbVar;
        vub vubVar = (vub) ao50Var;
        boolean z = vubVar.c;
        if (!z || this.f != null) {
            if (z || (irbVar = this.f) == null) {
                return;
            }
            irbVar.a();
            this.f = null;
            return;
        }
        DialogExt dialogExt = vubVar.a;
        if (dialogExt != null) {
            io.reactivex.rxjava3.core.q<MotionEvent> qVar = vubVar.b;
            AppCompatActivity appCompatActivity = this.e;
            if (appCompatActivity == null) {
                return;
            }
            mxv c = g2v.c();
            zdw zdwVar = i7o0.b;
            zdw zdwVar2 = zdwVar != null ? zdwVar : null;
            a1w a1wVar = this.b;
            irb irbVar2 = new irb(appCompatActivity, c, zdwVar2, dialogExt, a1wVar.q(), ajm.a(dialogExt, this.c, a1wVar.q(), appCompatActivity), new g7(this, 10));
            this.g.b(qVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tf(new sub(irbVar2, new Ref$ObjectRef(), this, 0), 12)));
            this.f = irbVar2;
            irbVar2.f();
        }
    }
}
