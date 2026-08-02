package xsna;

import android.content.Context;
import android.view.View;
import com.vk.common.links.LaunchContext;
import com.vk.core.preference.Preference;
import com.vk.dto.gift.GiftItem;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import xsna.t6k;
import xsna.ypq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mmb implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mmb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                mhy.d((nmb) obj2);
                ((sbg) obj).invoke();
                break;
            case 1:
                qtd0 qtd0Var = (qtd0) obj;
                nkr0 nkr0Var = ((t6k.j) obj2).l;
                if (nkr0Var != null) {
                    nkr0Var.c(qtd0Var.G3());
                    break;
                }
                break;
            case 2:
                String str = (String) obj;
                int i2 = ModalPostDonutFragment.W;
                Context mo2getContext = ((ModalPostDonutFragment) obj2).mo2getContext();
                if (mo2getContext != null) {
                    maz.c(xwk.d().e(), mo2getContext, str, LaunchContext.A, null, null, 24);
                    break;
                }
                break;
            case 3:
                ((fr50) obj2).D.sa(new NewsfeedExternalAction.Navigation.n(((MyTargetInternalNativeAdBlsUiDto) obj).i));
                break;
            case 4:
                p570 p570Var = (p570) obj2;
                bfm bfmVar = (bfm) obj;
                int id = view.getId();
                NoiseSuppressorFeature$State noiseSuppressorFeature$State = id == R.id.noise_suppressor_none ? NoiseSuppressorFeature$State.NONE : id == R.id.noise_suppressor_platform ? NoiseSuppressorFeature$State.PLATFORM : id == R.id.noise_suppressor_auto ? NoiseSuppressorFeature$State.AUTO : null;
                if (noiseSuppressorFeature$State != null) {
                    com.vk.voip.ui.c.b.getClass();
                    k570 k570Var = (k570) com.vk.voip.ui.c.x0.getValue();
                    k570Var.c.getClass();
                    qaj0.c(Preference.f("voip_prefs_shared"), "noise-suppressor-state", Integer.valueOf(noiseSuppressorFeature$State.ordinal()));
                    k570Var.e(noiseSuppressorFeature$State);
                    k570Var.a(noiseSuppressorFeature$State);
                    view.post(new vr2(6, p570Var, bfmVar));
                    break;
                }
                break;
            case 5:
                x64 x64Var = (x64) obj;
                DocumentAttachment documentAttachment = (DocumentAttachment) ((su90) obj2).C;
                if (documentAttachment != null) {
                    x64Var.f(documentAttachment);
                    break;
                }
                break;
            default:
                ((ypq0.b) obj2).n.c.x6(((GiftItem) obj).f);
                break;
        }
    }
}
