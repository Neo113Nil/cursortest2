package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bzp0;
import xsna.dw20;
import xsna.eeu0;

/* compiled from: DefaultCommonApiErrorViewDelegate.kt */
/* loaded from: classes.dex */
public class wcl extends ehg {
    public wcl(Context context) {
        super(context, new ucl());
    }

    @Override // xsna.ehg
    public final void b(bzp0.a aVar) {
        eeu0.a aVar2 = new eeu0.a(this.a);
        aVar2.setTitle(aVar.b());
        aVar2.d(aVar.a());
        aVar2.setPositiveButton(R.string.vk_ok, new vcl(0));
        aVar2.i(this.b);
        aVar2.m();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [T, xsna.dw20] */
    @Override // xsna.ehg
    public void c(bzp0.b bVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        p3h p3hVar = new p3h(ref$ObjectRef, 5);
        Context context = this.a;
        zxs zxsVar = new zxs(context, bVar, p3hVar);
        dw20.b bVar2 = new dw20.b(context);
        cbq.a(bVar2);
        ref$ObjectRef.element = ((dw20.b) bVar2.c(new a470()).I(true).J()).Z(this.b).p(false).D0(zxsVar, true).I0("FullscreenErrorView");
    }
}
