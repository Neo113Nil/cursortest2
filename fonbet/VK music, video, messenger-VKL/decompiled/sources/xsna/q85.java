package xsna;

import android.content.DialogInterface;
import android.text.Layout;
import android.widget.ImageView;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cmo0;
import xsna.cri;
import xsna.dt1;
import xsna.kh00;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q85 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q85(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                jai jaiVar = (jai) this.c;
                rv5 rv5Var = (rv5) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1648959994, intValue, -1, "com.vk.profile.design.compose.header.content.measureMainPlaceable.<anonymous> (AuthorHeaderHeaderContent.kt:352)");
                    }
                    jaiVar.invoke(f370.P(s200.D(txj0.f(q630.a.a, 1.0f), 16), 2.0f), rv5Var, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                List list = (List) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                lzg.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, q630Var);
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                fpi.a((epi) this.d, (jai) this.c, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                k9t.c((String) this.c, (String) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                jai jaiVar2 = (jai) this.c;
                jwy jwyVar = (jwy) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-412824043, intValue2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
                    }
                    jaiVar2.invoke(jwyVar, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((kh00.b) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                Photo photo = (Photo) this.c;
                z520 z520Var = (z520) this.d;
                DialogInterface dialogInterface = (DialogInterface) obj;
                String obj3 = ((CharSequence) obj2).toString();
                UserId userId = photo.e;
                int i = photo.c;
                ci10 ci10Var = new ci10("photos.edit");
                ci10Var.F(userId, "owner_id");
                ci10Var.C(i, "photo_id");
                ci10Var.K("caption", obj3);
                itg0.i(4, hg1.m(rsg0.y0(ci10Var, null, null, 3), z520Var.c, 0L, false, 62), null, new r3e(photo, obj3, z520Var, dialogInterface, 3), new io3(25));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                zc70.c((t770) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                gzs gzsVar = (gzs) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(548739982, intValue3, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollEditorContent.<anonymous> (PollEditorModal.kt:66)");
                    }
                    boolean J = aVar3.J(izsVar);
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new m4i(izsVar, 2);
                        aVar3.R(x);
                    }
                    gzs gzsVar2 = (gzs) x;
                    q630 t = n34.t(ahn.E(q630.a.a, "pollEditorToolbar"), dz5.I(6, 0, aVar3, true), null);
                    Object x2 = aVar3.x();
                    if (x2 == c0012a) {
                        x2 = new sm0(6);
                        aVar3.R(x2);
                    }
                    vpb0.a(0, aVar3, gzsVar, gzsVar2, ahh0.b(t, m4s.C((izs) x2, aVar3, 6), Orientation.Vertical));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((mze0) this.c).co((qtd0) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                cmo0 cmo0Var = (cmo0) this.c;
                ImageView imageView = (ImageView) this.d;
                Layout.Alignment alignment = (Layout.Alignment) obj;
                cmo0Var.f.b = alignment;
                imageView.setImageResource(((Integer) obj2).intValue());
                int i2 = cmo0.b.$EnumSwitchMapping$1[alignment.ordinal()];
                if (i2 == 1) {
                    imageView.setContentDescription(cmo0Var.getContext().getString(R.string.story_accessibility_text_align_center));
                } else if (i2 == 2) {
                    imageView.setContentDescription(cmo0Var.getContext().getString(R.string.story_accessibility_text_align_left));
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    imageView.setContentDescription(cmo0Var.getContext().getString(R.string.story_accessibility_text_align_right));
                }
                cmo0Var.f();
                return s3q0.a;
            default:
                s890 s890Var = (s890) this.d;
                jai jaiVar3 = (jai) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(457886334, intValue4, -1, "com.vk.core.compose.component.VkToolButton.<anonymous>.<anonymous>.<anonymous> (VkToolButton.kt:109)");
                    }
                    q630 C = s200.C(q630.a.a, s890Var);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c = qri.c(aVar4, C);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar5);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, d, cri.a.f);
                    k9q0.w(aVar4, D, cri.a.e);
                    k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar4, cri.a.h);
                    k9q0.w(aVar4, c, cri.a.d);
                    if (er.f(0, aVar4, jaiVar3)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ q85(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ q85(epi epiVar, jai jaiVar, int i) {
        this.b = 2;
        this.d = epiVar;
        this.c = jaiVar;
    }

    public /* synthetic */ q85(s890 s890Var, jai jaiVar) {
        this.b = 11;
        this.d = s890Var;
        this.c = jaiVar;
    }
}
