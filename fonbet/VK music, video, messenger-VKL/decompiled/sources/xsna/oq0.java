package xsna;

import android.app.Activity;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.tooling.PreviewActivity;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.hints.Hint;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.ggp0;
import xsna.m8v0;
import xsna.q630;
import xsna.qrd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class oq0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oq0(int i, String str, izs izsVar, q630 q630Var) {
        this.b = 4;
        this.e = str;
        this.c = izsVar;
        this.d = q630Var;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                AdditionalSettingsConfiguration additionalSettingsConfiguration = (AdditionalSettingsConfiguration) obj5;
                izs izsVar = (izs) obj4;
                String str = (String) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(362950976, intValue, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.SignSwitch.<anonymous> (AdditionalSettingsContentView.kt:220)");
                    }
                    q630 E = ahn.E(q630.a.a, "SignAuthorSetting");
                    boolean z = additionalSettingsConfiguration.c;
                    boolean z2 = additionalSettingsConfiguration.f;
                    String N = d370.N(R.string.additional_settings_author_title, 0, aVar);
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == c0012a) {
                        x = new zq0(izsVar, 0);
                        aVar.R(x);
                    }
                    zov0.b(z, N, (izs) x, E, str, z2, false, aVar, 3072, 64);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.settings.g) obj5).j((k97) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((ere) obj5).g((yre) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                NewsComment newsComment = (NewsComment) obj4;
                aa aaVar = (aa) obj3;
                e520 e520Var = (e520) obj2;
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                afg Co = ((CommentThreadFragment) obj5).Co();
                if (Co != null) {
                    ((mdg) Co).f8(e520Var.a, newsComment, aaVar);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                jeo.c(ne7.I(1), (androidx.compose.runtime.a) obj, (String) obj3, (izs) obj4, (q630) obj5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                k2r.b(ne7.I(1), (androidx.compose.runtime.a) obj, (String) obj3, (gzs) obj4, (q630) obj5);
                break;
            case 6:
                String str2 = (String) obj3;
                String str3 = (String) obj5;
                Object[] objArr = (Object[]) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = PreviewActivity.f;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1901447514, intValue2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:128)");
                    }
                    fai.u(str2, str3, aVar2, Arrays.copyOf(objArr, objArr.length));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 7:
                qrd0 qrd0Var = (qrd0) obj5;
                qrd0.f fVar = (qrd0.f) obj4;
                ird0 ird0Var = (ird0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1726882646, intValue3, -1, "com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyVariantsPreviewHolder.onBind.<anonymous>.<anonymous> (ProductPropertyVariantsPreviewHolder.kt:38)");
                    }
                    boolean y = aVar3.y(qrd0Var) | aVar3.y(ird0Var);
                    Object x2 = aVar3.x();
                    if (y || x2 == c0012a) {
                        x2 = new prd0(0, qrd0Var, ird0Var);
                        aVar3.R(x2);
                    }
                    qrd0Var.q6(fVar, (izs) x2, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((vfp0) obj5).h((ggp0.a.C2942a) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                kzq0 kzq0Var = (kzq0) obj5;
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj3;
                ((ClipEditComponent) kzq0Var.c.getValue()).d6().j(bwt0.u((Activity) obj4), (View) obj, clipVideoFile, new sx4(clipVideoFile, (izs) obj2, kzq0Var, 10));
                break;
            default:
                fbx0 fbx0Var = (fbx0) obj5;
                View view = (View) obj4;
                Hint hint = (Hint) obj3;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue() && bool.booleanValue() && !fbx0Var.c) {
                    fbx0Var.c = true;
                    int i3 = m8v0.M;
                    String str4 = hint.c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    m8v0.a.a(view, str4, null, null, null, null, VkTooltip$BalloonPosition.BottomLeft, null, new fuh0(13), new puq0(11), null, null, null, new gqq0(fbx0Var, 14), null, 0, false, null, null, false, null, false, 16768188);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ oq0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ oq0(String str, String str2, Object[] objArr) {
        this.b = 6;
        this.e = str;
        this.d = str2;
        this.c = objArr;
    }

    public /* synthetic */ oq0(String str, q630 q630Var, gzs gzsVar, int i) {
        this.b = 5;
        this.e = str;
        this.d = q630Var;
        this.c = gzsVar;
    }

    public /* synthetic */ oq0(kk50 kk50Var, Object obj, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = kk50Var;
        this.e = obj;
        this.c = izsVar;
    }
}
