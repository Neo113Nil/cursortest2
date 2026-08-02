package xsna;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.auth.ui.checkaccess.PasswordCheckInitStructure;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import com.vk.feed.design.view.newsfeed.topbar.FeedTopBar;
import com.vk.sharing.core.view.l;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import xsna.h7u0;
import xsna.wen0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class oa6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oa6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wtx presenter;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                l0c l0cVar = ((com.vk.auth.verification.base.a) obj).p;
                (l0cVar != null ? l0cVar : null).P();
                break;
            case 1:
                BaseDebugTogglesFragment baseDebugTogglesFragment = (BaseDebugTogglesFragment) obj;
                int i3 = BaseDebugTogglesFragment.X;
                e30 e30Var = new e30(baseDebugTogglesFragment, i2);
                int i4 = h7u0.p;
                h7u0.a c = h7u0.b.c(baseDebugTogglesFragment.kn());
                c.h0("Перезапустить приложение?");
                c.a.f = "Текущий процесс будет завершён и запущен заново.";
                c.d0("Cancel", e30Var);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#FFE64646"));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "Restart");
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                c.X(new SpannedString(spannableStringBuilder), e30Var);
                c.m();
                break;
            case 2:
                com.vk.auth.ui.checkaccess.a aVar = (com.vk.auth.ui.checkaccess.a) obj;
                im90 tn = aVar.tn();
                VkAuthPasswordView vkAuthPasswordView = aVar.l;
                if (vkAuthPasswordView == null) {
                    vkAuthPasswordView = null;
                }
                String password = vkAuthPasswordView.getPassword();
                PasswordCheckInitStructure passwordCheckInitStructure = aVar.k;
                if (passwordCheckInitStructure == null) {
                    passwordCheckInitStructure = null;
                }
                tn.getClass();
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                int i5 = 10;
                tn.d.b(mnh0.C(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(wen0.a.a(vdx0Var.a(), null, password, tn.e, 1), new nex(new fju(tn, 18), i5)), new fo1(tn, 6)), (ygg) tn.h.getValue(), new com.vk.libvideo.b(25, tn, passwordCheckInitStructure), new j37(1, tn, im90.class, "handleCheckAccessError", "handleCheckAccessError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0, 8), new ngl(null, null, null, null, null, null, null, new j630(tn, i5), null, null, 895)));
                break;
            case 3:
                ((v39) obj).c.invoke();
                break;
            case 4:
                ntn ntnVar = (ntn) obj;
                x64 x64Var = ntnVar.m;
                if (x64Var != null) {
                    x64Var.c(ntnVar.d);
                    break;
                }
                break;
            case 5:
                int i6 = FeedTopBar.p;
                gzs<s3q0> gzsVar = ((v4r) obj).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 6:
                ((e4w) obj).a();
                break;
            case 7:
                ztx ztxVar = (ztx) obj;
                if (ztxVar.c.isEnabled() && (presenter = ztxVar.getPresenter()) != null) {
                    presenter.p7();
                    break;
                }
                break;
            case 8:
                om90 om90Var = (om90) obj;
                EditText editText = om90Var.f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = om90Var.f;
                    if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        om90Var.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        om90Var.f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        om90Var.f.setSelection(selectionEnd);
                    }
                    om90Var.q();
                    break;
                }
                break;
            case 9:
                mbv0 mbv0Var = ((v1g0) obj).l.b;
                if (mbv0Var != null) {
                    mbv0Var.p3();
                    break;
                }
                break;
            case 10:
                com.vk.sharing.core.view.f fVar = (com.vk.sharing.core.view.f) obj;
                l.a aVar2 = fVar.D;
                if (aVar2 != null) {
                    aVar2.O2(fVar.A1());
                    break;
                }
                break;
            case 11:
                gtj0 gtj0Var = (gtj0) obj;
                x64 x64Var2 = gtj0Var.F;
                if (x64Var2 != null) {
                    x64Var2.c(gtj0Var.C);
                    break;
                }
                break;
            case 12:
                gzs<s3q0> gzsVar2 = ((VideoCatalogHeaderDebrandedVh) obj).c;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            default:
                uzv0 uzv0Var = ((zzv0) obj).b;
                if (uzv0Var != null) {
                    uzv0Var.b(SystemClock.elapsedRealtime(), true);
                    break;
                }
                break;
        }
    }
}
