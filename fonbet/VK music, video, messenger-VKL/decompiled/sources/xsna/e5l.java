package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.ironsource.X3;
import com.vk.core.compose.component.topbar.d;
import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vk.dto.newsfeed.FaveTag;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.k8s;
import xsna.mqq;
import xsna.rfr;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class e5l implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e5l(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                DebugFileManagerFragment debugFileManagerFragment = (DebugFileManagerFragment) this.c;
                String str = (String) this.d;
                izs izsVar = (izs) obj2;
                int incrementAndGet = debugFileManagerFragment.O.incrementAndGet();
                io.reactivex.rxjava3.disposables.b bVar = debugFileManagerFragment.N;
                bVar.e();
                io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new hca(1, (String) obj, str));
                asu0 asu0Var = asu0.a;
                bVar.b(vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new f60(new f5l(incrementAndGet, debugFileManagerFragment, izsVar), 20), new com.vk.im.ui.components.dialogs_list.b(new g5l(incrementAndGet, debugFileManagerFragment, izsVar), 19)));
                break;
            case 1:
                FaveTag faveTag = (FaveTag) this.c;
                Context context = (Context) this.d;
                DialogInterface dialogInterface = (DialogInterface) obj;
                CharSequence charSequence = (CharSequence) obj2;
                if (drm0.p0(charSequence).length() != 0) {
                    String replace = drm0.p0(charSequence).toString().replace('\n', ' ');
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    if (faveTag != null) {
                        int i = faveTag.b;
                        pnq pnqVar = new pnq("fave.editTag");
                        pnqVar.C(i, "id");
                        pnqVar.K("name", replace);
                        ver0.c(context, hg1.m(rsg0.y0(pnqVar, null, null, 3).F(new ji3(new qt0(25), 28)).E(new np3(new np5(9, faveTag, replace), 22), lVar, kVar, kVar), context, 0L, false, 62).subscribe(new c60(new mmf(dialogInterface, 28), 27), new m21(mqq.b.b, 1)));
                    } else {
                        lmq lmqVar = new lmq("fave.addTag");
                        lmqVar.K("name", replace);
                        lmqVar.K(X3.i.L, "front");
                        ver0.c(context, hg1.m(rsg0.y0(lmqVar, null, null, 3).E(new pp3(new vt1(24), 21), lVar, kVar, kVar), context, 0L, false, 62).subscribe(new f60(new eqd(dialogInterface, 19), 26), new com.vk.im.ui.components.dialogs_list.b(new leq(1), 22)));
                    }
                    break;
                } else {
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                ((rfr.b) this.c).a((k8s.a) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                c3e0.b((d3e0) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                kdh0 kdh0Var = (kdh0) this.c;
                izs izsVar2 = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-4209691, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.Root.<anonymous>.<anonymous> (Root.kt:70)");
                    }
                    r8k0.a(kdh0Var.k(), izsVar2, null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((d.c.a) this.c).e((mtk0) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 6:
                gzs gzsVar = (gzs) this.c;
                gzs gzsVar2 = (gzs) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1371272983, intValue2, -1, "com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubScreen.<anonymous> (VerificationStubScreen.kt:37)");
                    }
                    qnr0.c(d370.N(R.string.select_verification_type_title, 0, aVar2), gzsVar, gzsVar2, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((com.vk.ecomm.design.compose.productattaches.c) this.c).c((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ e5l(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
