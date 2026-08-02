package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.profile.user.impl.UserProfileDialogs;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ij9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class vd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vd0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                ComposeView composeView = (ComposeView) this.e;
                ae0 ae0Var = (ae0) this.f;
                wh50Var.setValue(Boolean.FALSE);
                viewGroup.removeView(composeView);
                ae0Var.a.e.invoke();
                return s3q0.a;
            case 1:
                return new fj9((Context) this.c, (ij9.a) this.d, (ij9.b) this.e, (ij9.c) this.f);
            default:
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                qoq0 qoq0Var = (qoq0) this.e;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f;
                userProfileDialogs.getClass();
                UserProfileDialogs.c(fragmentActivity, qoq0Var);
                gzs gzsVar = (gzs) ref$ObjectRef.element;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
        }
    }
}
