package xsna;

import androidx.compose.runtime.a;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.silentauth.SilentAuthInfo;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Map;
import kotlin.Pair;
import xsna.koj0;
import xsna.w6v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                x1.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                n2k0 n2k0Var = (n2k0) obj;
                d2g d2gVar = (d2g) obj2;
                wzs<? super Map<n2k0, d2g>, ? super Boolean, s3q0> wzsVar = ((k3g) obj3).e;
                if (wzsVar != null) {
                    wzsVar.invoke(on00.f(new Pair(n2k0Var, d2gVar)), Boolean.TRUE);
                }
                break;
            case 2:
                o1i o1iVar = (o1i) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ExtendedCommunityProfile extendedCommunityProfile = o1iVar.c;
                extendedCommunityProfile.l = booleanValue;
                o1iVar.d.t8(extendedCommunityProfile, false);
                break;
            case 3:
                DraftsListFragment draftsListFragment = (DraftsListFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = DraftsListFragment.Q;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(140331226, intValue, -1, "com.vk.draftslist.impl.ui.DraftsListFragment.onCreateView.<anonymous>.<anonymous> (DraftsListFragment.kt:75)");
                    }
                    draftsListFragment.eo(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 4:
                int intValue2 = ((Integer) obj).intValue();
                ((Integer) obj2).getClass();
                break;
            case 5:
                break;
            case 6:
                izs izsVar = (izs) obj3;
                String str = (String) obj;
                if (str != null) {
                    izsVar.invoke(new OrderAction.ClickSpan(str, obj2));
                }
                break;
            case 7:
                lwc0 lwc0Var = (lwc0) obj3;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                lvc0 lvc0Var = lwc0Var.j;
                isiVar.c = new i8k(isiVar.a(new kvc0(lvc0Var, sj50Var)), isiVar.a(new hvc0(lvc0Var, sj50Var)), isiVar.a(new fvc0(lvc0Var, sj50Var)), isiVar.a(new jvc0(lvc0Var, sj50Var, lwc0Var.f)));
                break;
            case 8:
                koj0.a aVar2 = (koj0.a) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1479844536, intValue3, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.SimilarVideoItemDelegate.ViewHolder.<anonymous>.<anonymous> (SimilarVideoItemDelegate.kt:56)");
                    }
                    AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = (AboutVideoItem.SimilarVideoRedesign) ((zak0) aVar2.m).getValue();
                    ooj0 a = similarVideoRedesign != null ? poj0.a(similarVideoRedesign, aVar2.itemView.getContext(), 640, false) : null;
                    if (a == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        foj0 foj0Var = a.a;
                        int absoluteAdapterPosition = aVar2.getAbsoluteAdapterPosition();
                        boolean y = aVar3.y(aVar2);
                        Object x = aVar3.x();
                        if (y || x == a.C0011a.a) {
                            x = new ejf0(aVar2, 5);
                            aVar3.R(x);
                        }
                        moj0.a(foj0Var, (gzs) x, absoluteAdapterPosition, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((grq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            default:
                w6v0 w6v0Var = (w6v0) obj3;
                wjv0 wjv0Var = (wjv0) ((com.vk.auth.oauth.di.a) w6v0Var.A.getValue()).a(w6v0Var.b, VkOAuthService.MAILRU);
                String str2 = ((SilentAuthInfo) obj2).k;
                new w6v0.d(1, w6v0Var, w6v0.class, "handleSuccessOAuth", "handleSuccessOAuth(Lcom/vk/auth/oauth/OAuthResult$SuccessAuthCode;)V", 0);
                new w6v0.e(1, w6v0Var, w6v0.class, "showError", "showError(Ljava/lang/String;)V", 0);
                wjv0Var.a();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ w1(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
