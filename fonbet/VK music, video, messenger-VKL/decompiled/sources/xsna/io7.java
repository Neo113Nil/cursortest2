package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dll0;
import xsna.lx9;
import xsna.rv9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class io7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ io7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        d.b.a b;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((ko7) this.c).b((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((yw9) this.c).e.invoke(new rv9.i.k(((lx9.m) this.d).a, ((Boolean) obj).booleanValue()));
                break;
            case 2:
                izs izsVar = (izs) this.c;
                wfa wfaVar = (wfa) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1080587121, intValue, -1, "com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenView.<anonymous> (CatalogSectionScreenView.kt:30)");
                    }
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new gr7(izsVar, 1);
                        aVar.R(x);
                    }
                    TopBar$Before.e a = e.a.a((gzs) x, null, null, null, null, aVar, 196608, 30);
                    TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(wfaVar.c, null, null, null, null, aVar, 196608, 30), null, null, null, aVar, 14);
                    androidx.compose.runtime.a aVar2 = aVar;
                    e7a e7aVar = wfaVar.d;
                    d.b.a aVar3 = null;
                    com.vk.core.compose.component.topbar.a a3 = null;
                    if (e7aVar == null) {
                        aVar2.K(-990630881);
                    } else {
                        aVar2.K(-990630880);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2015846185, 0, -1, "com.vk.catalog.mvi.section.screen.impl.ui.mainIcon (CatalogSectionScreenView.kt:70)");
                        }
                        lg90 a4 = pg90.a(e7aVar.a, 0, aVar2);
                        String str = e7aVar.b;
                        boolean J2 = aVar2.J(izsVar);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new r0(izsVar, 3);
                            aVar2.R(x2);
                        }
                        d.c.C0760d a5 = d.c.C0760d.a.a(a4, str, (gzs) x2, null, null, null, aVar2, 1572872, 56);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        e7a e7aVar2 = wfaVar.e;
                        if (e7aVar2 == null) {
                            aVar2.K(560604499);
                            aVar2.j();
                            b = null;
                        } else {
                            aVar2.K(560604500);
                            b = vfa.b(e7aVar2, 1, izsVar, aVar2);
                            aVar2.j();
                        }
                        e7a e7aVar3 = wfaVar.f;
                        if (e7aVar3 == null) {
                            aVar2.K(560774131);
                        } else {
                            aVar2.K(560774132);
                            aVar3 = vfa.b(e7aVar3, 2, izsVar, aVar2);
                        }
                        aVar2.j();
                        a3 = d.a.a(a5, b, aVar3, null, aVar2, 24576, 8);
                        aVar2 = aVar2;
                    }
                    aVar2.j();
                    muv0.h(a2, null, null, null, a, null, a3, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8110);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                hwl.g((DeliveryPoint.OpenStatus) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                r6t.a((mc90) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((n030) this.c).b((gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                cx80.b((sx80) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.f((PreviewViewState.c) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                aqh0.d((iph0) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                tkl0.c((dll0.b) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                kol0.a((ool0) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 11:
                clm0 clm0Var = (clm0) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1372296019, intValue2, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.build.<anonymous>.<anonymous> (StoryViewBestFriendsModal.kt:65)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(1494696080, new sg4(5, clm0Var, ref$ObjectRef), aVar4), aVar4, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 12:
                ymn0 ymn0Var = (ymn0) this.c;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.d;
                Float f = (Float) obj;
                float floatValue = f.floatValue();
                Float f2 = (Float) obj2;
                f2.floatValue();
                ((zak0) ymn0Var.g).setValue(f);
                ref$FloatRef.element = floatValue;
                ((zak0) ymn0Var.i).setValue(f2);
                break;
            default:
                ((Integer) obj2).getClass();
                ((dhx0) this.c).c((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ io7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
