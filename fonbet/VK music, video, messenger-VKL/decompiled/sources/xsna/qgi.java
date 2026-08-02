package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.ldj0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qgi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qgi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List<Long> list;
        int i = this.b;
        q630.a aVar = q630.a.a;
        r2 = null;
        byte[] bArr = null;
        switch (i) {
            case 0:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(92268059, intValue, -1, "com.vk.ecomm.design.compose.imagegallery.ComposableSingletons$ImageGalleryEditModeCellKt.lambda$92268059.<anonymous> (ImageGalleryEditModeCell.kt:154)");
                }
                q630 E = ahn.E(aVar, "reloadImageButton");
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1329170434, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-RefreshOutline28> (VkIcons.kt:9368)");
                }
                lg90 a = pg90.a(R.drawable.vk_icon_refresh_outline_28, 0, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.image_picker_reload_image_title, 0, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(a, N, E, ylu0Var.getIcon().c, aVar2, 392, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(987968546, intValue2, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.ComposableSingletons$SimilarVideosHorizontalSkeletonDelegateKt.lambda$987968546.<anonymous> (SimilarVideosHorizontalSkeletonDelegate.kt:89)");
                    }
                    q630 F = s200.F(6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar);
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, F);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a2, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    aVar3.K(-1836179404);
                    for (int i2 = 0; i2 < 5; i2++) {
                        soj0.b(0, aVar3);
                        if (i2 < 4) {
                            aVar3.K(-257920092);
                            mq.d(aVar, 12, aVar3, 6);
                        } else {
                            aVar3.K(-261363820);
                            aVar3.j();
                        }
                    }
                    if (gp.d(aVar3)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue3, chatSettings != null ? Boolean.valueOf(chatSettings.h) : null);
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                GroupCallInProgress groupCallInProgress = ((com.vk.im.engine.models.dialogs.b) obj2).A;
                if (groupCallInProgress != null && (list = groupCallInProgress.b) != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    new Serializer.e(new DataOutputStream(byteArrayOutputStream)).a0(list);
                    bArr = byteArrayOutputStream.toByteArray();
                }
                rdi.h(sQLiteStatement2, intValue4, bArr);
                return s3q0.a;
            default:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                aVar5.K(1989094460);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1989094460, intValue5, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.vkUiShimmer.<anonymous> (InterestSkeleton.kt:60)");
                }
                q630 a3 = wdj0.a(q630Var, xx1.D(ldj0.b.a, tjv0.a((tjv0) aVar5.r(ujv0.b), null, 0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 59), aVar5, 64, 0));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return a3;
        }
    }
}
