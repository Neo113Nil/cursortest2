package xsna;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.ironsource.C4490p6;
import com.ironsource.Ya;
import com.my.target.common.views.Html5View;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.posting.presentation.articlepicker.ArticlePickerFragment;
import com.vk.posting.presentation.articlepicker.a;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.superapp.vkpay.checkout.feature.pin.success.PinSuccessView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import ru.ok.gleffects.EffectHolder;
import ru.ok.media.AsyncDNSResolver;
import xsna.rye;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class n52 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n52(Html5View.c cVar, String str, String str2) {
        this.b = 10;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.vk.sharing.core.view.f fVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((gzs) obj).invoke();
                return;
            case 1:
                ArticlePickerFragment articlePickerFragment = (ArticlePickerFragment) obj;
                int i2 = ArticlePickerFragment.V;
                a.b bVar = a.b.b;
                articlePickerFragment.getClass();
                xn50.a.c(articlePickerFragment, bVar);
                return;
            case 2:
                AsyncDNSResolver.setComplete$lambda$6((AsyncDNSResolver) obj);
                return;
            case 3:
                List list = (List) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    o7j v = ((vfq0) it.next()).f.v();
                    if (v != null) {
                        v.accept(Collections.unmodifiableList(list));
                    }
                }
                return;
            case 4:
                ynb.m((ynb) obj);
                return;
            case 5:
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) obj;
                int i3 = ClipsInterestsFragment.Y;
                Bundle arguments = clipsInterestsFragment.getArguments();
                String string = arguments != null ? arguments.getString("LOAD_CALLBACK_ARG_KEY") : null;
                if (string != null) {
                    FragmentManager parentFragmentManager = clipsInterestsFragment.getParentFragmentManager();
                    Bundle b = ar.b(-1, string);
                    s3q0 s3q0Var = s3q0.a;
                    parentFragmentManager.k0(b, string);
                    return;
                }
                return;
            case 6:
                rye.b bVar2 = (rye.b) obj;
                bVar2.c = new rye(bVar2.a, new com.vk.movika.sdk.base.ui.t(bVar2, 27));
                return;
            case 7:
                String a = ((xdd) obj).a();
                Regex regex = com.vk.core.files.a.a;
                vhk0.c(a);
                return;
            case 8:
                efl eflVar = (efl) obj;
                if (eflVar.b.isInitialized()) {
                    ((MediaMetadataRetriever) eflVar.b.getValue()).release();
                }
                io.reactivex.rxjava3.core.w wVar = eflVar.c;
                if (wVar != null) {
                    wVar.f();
                    return;
                }
                return;
            case 9:
                ((EffectHolder) obj).lambda$clearMusicInfo$8();
                return;
            case 10:
                ((Html5View.c) obj).getClass();
                return;
            case 11:
                BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) obj;
                if (!baseSharingExternalActivity.G || (fVar = baseSharingExternalActivity.w) == null) {
                    return;
                }
                fVar.t1(null);
                return;
            case 12:
                sr80 sr80Var = (sr80) obj;
                sr80Var.b.dispose();
                ikv0 ikv0Var = sr80Var.c;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                sr80Var.c = null;
                return;
            case 13:
                PinSuccessView pinSuccessView = (PinSuccessView) obj;
                int i4 = PinSuccessView.c;
                pinSuccessView.setVisibility(4);
                gzs<s3q0> gzsVar = pinSuccessView.b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    return;
                }
                return;
            case 14:
                androidx.lifecycle.q qVar = (androidx.lifecycle.q) obj;
                androidx.lifecycle.m mVar = qVar.g;
                if (qVar.c == 0) {
                    qVar.d = true;
                    mVar.c(Lifecycle.Event.ON_PAUSE);
                }
                if (qVar.b == 0 && qVar.d) {
                    mVar.c(Lifecycle.Event.ON_STOP);
                    qVar.e = true;
                    return;
                }
                return;
            case 15:
                ((wmo0) obj).b.getValue();
                return;
            case 16:
                throw ((RuntimeException) obj);
            case 17:
                pcu0 pcu0Var = (pcu0) obj;
                if (o25.a().b()) {
                    pcu0Var.g.getClass();
                    t6g0.d().h();
                    return;
                }
                return;
            case 18:
                Ya.f((Ya) obj);
                return;
            case 19:
                C4490p6.c((C4490p6) obj);
                return;
            default:
                jbz0 jbz0Var = (jbz0) obj;
                jbz0Var.a.removeCallbacks(jbz0Var.b);
                return;
        }
    }

    public /* synthetic */ n52(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
