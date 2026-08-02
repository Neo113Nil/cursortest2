package xsna;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import xsna.dh6;
import xsna.isc;
import xsna.xtc;

/* compiled from: ClipEditSdkRouterImpl.kt */
/* loaded from: classes17.dex */
public final class auc implements xtc {
    public final irk0 a;

    public auc(irk0 irk0Var) {
        this.a = irk0Var;
    }

    @Override // xsna.xtc
    public final void a(ClipEditSdkItem clipEditSdkItem, xtc.a aVar, izs<? super ClipEditSdkItem, s3q0> izsVar, wzs<? super View, ? super izs<? super Boolean, s3q0>, s3q0> wzsVar) {
        FragmentManager fragmentManager = aVar.b;
        fragmentManager.l0("clip_edit_result", aVar.c, new ztc(aVar, izsVar));
        Context context = aVar.a;
        a aVar2 = new a();
        new isc.a(context, clipEditSdkItem, wzsVar, this.a, aVar.d, aVar2).H0(fragmentManager, "edit_bs");
    }

    /* compiled from: ClipEditSdkRouterImpl.kt */
    public static final class a implements dh6.a {
        @Override // xsna.dh6.a
        public final void a() {
        }

        @Override // xsna.dh6.a
        public final void b() {
        }
    }
}
