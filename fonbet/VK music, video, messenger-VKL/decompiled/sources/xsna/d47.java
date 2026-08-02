package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SnippetStyle;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.ads.AdsItemAction;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.hz0;
import xsna.nz0;
import xsna.wk50;
import xsna.xw0;

/* compiled from: BindingActionApplier.kt */
/* loaded from: classes17.dex */
public final class d47 implements oj50<nz0, AdsItemAction, AdsItemPatch> {
    public final f4z a;
    public final su b;
    public final ojh0 c;
    public final iw0 d;
    public final ax0 e;
    public final hih0 f;

    public d47(f4z f4zVar, su suVar, ojh0 ojh0Var, iw0 iw0Var, ax0 ax0Var, hih0 hih0Var) {
        this.a = f4zVar;
        this.b = suVar;
        this.c = ojh0Var;
        this.d = iw0Var;
        this.e = ax0Var;
        this.f = hih0Var;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        nz0 nz0Var = (nz0) km50Var;
        AdsItemAction adsItemAction = (AdsItemAction) kj50Var;
        if (adsItemAction instanceof AdsItemAction.a) {
            AdsItemAction.a aVar2 = (AdsItemAction.a) adsItemAction;
            if (!(aVar2 instanceof AdsItemAction.a.C0643a)) {
                if (!(aVar2 instanceof AdsItemAction.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.b.e();
                aVar.b(AdsItemPatch.b.C0649b.b);
                return;
            }
            AdsItemAction.a.C0643a c0643a = (AdsItemAction.a.C0643a) adsItemAction;
            wp50 wp50Var = c0643a.h;
            SdkClipVideoFile sdkClipVideoFile = c0643a.b;
            this.f.Tf(wp50Var == null);
            if (nz0Var instanceof nz0.b) {
                b(aVar, c0643a);
                return;
            }
            if (!(nz0Var instanceof nz0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!epx.f(((nz0.a) nz0Var).b.b, sdkClipVideoFile.r1())) {
                b(aVar, c0643a);
                return;
            }
            hw0 a = this.d.a(sdkClipVideoFile);
            aVar.b(new AdsItemPatch.b.a.C0648b(a));
            this.a.b(new xw0.f(a.a()));
        }
    }

    public final void b(wk50.a aVar, AdsItemAction.a.C0643a c0643a) {
        ojh0 ojh0Var;
        ActionLinkSnippet actionLinkSnippet;
        SnippetStyle snippetStyle;
        hw0 a = this.d.a(c0643a.b);
        SdkActionLink m1 = a.a.m1();
        Integer num = null;
        ActionLinkSnippet actionLinkSnippet2 = m1 != null ? m1.g : null;
        String a2 = actionLinkSnippet2 != null ? actionLinkSnippet2.h.a(300) : null;
        ojh0 ojh0Var2 = this.c;
        Bitmap b = ojh0Var2.b(a2);
        hz0.a aVar2 = c0643a.g.a;
        aVar.b(new AdsItemPatch.b.a.C0647a(a, c0643a.c, c0643a.d, c0643a.e, c0643a.f, aVar2.a && !aVar2.b, aVar2.c, ((Boolean) this.e.invoke()).booleanValue(), c0643a.h));
        aVar.b.e();
        if (b != null || a2 == null) {
            ojh0Var = ojh0Var2;
        } else {
            ojh0Var = ojh0Var2;
            a7f0.a.e(aVar, ojh0Var2.c(Uri.parse(a2)), null, new j9(aVar, 12), new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 9), null, 9);
        }
        if (m1 != null && (actionLinkSnippet = m1.g) != null && (snippetStyle = actionLinkSnippet.i) != null) {
            num = snippetStyle.b;
        }
        if (num == null) {
            ru.a(aVar, a.e, ojh0Var, this.b, new b47(aVar, 0));
        }
        this.a.b(new xw0.f(a.a()));
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
