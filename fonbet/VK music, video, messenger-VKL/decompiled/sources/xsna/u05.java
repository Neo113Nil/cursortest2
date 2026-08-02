package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragmentInternalComponent;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u05 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u05(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        final Integer num;
        View findViewByPosition;
        int i = this.b;
        Integer num2 = null;
        int i2 = 2;
        int i3 = 0;
        i3 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((f15) obj3).i(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i4 = inc.l1;
                ((inc) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                CoverChooseArguments coverChooseArguments = (CoverChooseArguments) obj3;
                sti stiVar = (sti) obj;
                sl50 sl50Var = (sl50) obj2;
                CoverChooseFragmentInternalComponent.a aVar = CoverChooseFragmentInternalComponent.e;
                if ((coverChooseArguments instanceof CoverChooseArguments.VideoCoverChooseArguments ? (CoverChooseArguments.VideoCoverChooseArguments) coverChooseArguments : null) != null) {
                    stiVar.a(new g0k((CoverChooseArguments.VideoCoverChooseArguments) coverChooseArguments, sl50Var));
                }
                break;
            case 3:
                float floatValue = ((Float) obj2).floatValue();
                ((xlb0) obj).a();
                ((Ref$FloatRef) obj3).element = floatValue;
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((axq) obj3).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                final GeoPostsFragment geoPostsFragment = (GeoPostsFragment) obj3;
                final sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = geoPostsFragment.Z;
                if (recyclerView != null) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (sq60Var.e) {
                        num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                            i3 = findViewByPosition.getTop();
                        }
                        num2 = Integer.valueOf(i3);
                    }
                    ho60 a = geoPostsFragment.eo().a();
                    List<ol60> list = sq60Var.a;
                    c9x c9xVar = sq60Var.c;
                    w9j w9jVar = new w9j(i2, geoPostsFragment, sq60Var);
                    final LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                    final Integer num3 = num2;
                    a.H0(recyclerView, w9jVar, new Runnable() { // from class: xsna.llt
                        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Integer num4;
                            LinearLayoutManager linearLayoutManager3;
                            qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                            Integer num5 = num;
                            if (num5 != null && (num4 = num3) != null && (linearLayoutManager3 = linearLayoutManager2) != null) {
                                linearLayoutManager3.K(num5.intValue(), num4.intValue());
                            }
                            sq60 sq60Var2 = sq60Var;
                            boolean z = sq60Var2.d;
                            GeoPostsFragment geoPostsFragment2 = geoPostsFragment;
                            if (z) {
                                RecyclerView recyclerView2 = geoPostsFragment2.Z;
                                RecyclerView.o layoutManager2 = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                                LinearLayoutManager linearLayoutManager4 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                                if (linearLayoutManager4 != null) {
                                    linearLayoutManager4.K(0, 0);
                                }
                            }
                            ((o170) geoPostsFragment2.eo().a.V.getValue()).b(geoPostsFragment2.Z);
                            geoPostsFragment2.eo().b().a(sq60Var2.a);
                            ehv ehvVar = (ehv) geoPostsFragment2.eo().e.b;
                            if (ehvVar != null) {
                                ehvVar.r();
                            }
                        }
                    }, list, c9xVar);
                    break;
                } else {
                    break;
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((giy) obj3).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((km40) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 8:
                mo60 mo60Var = ((qy60) obj3).f;
                ((sti) obj).a(new ox60((sl50) obj2, mo60Var.v, mo60Var.i0));
                break;
            case 9:
                androidx.compose.foundation.gestures.l lVar = (androidx.compose.foundation.gestures.l) obj3;
                myc0.h(lVar.W1(), null, null, new ihh0(lVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((s0n0) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 11:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.j((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 12:
                VerificationStubFragment verificationStubFragment = (VerificationStubFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i5 = VerificationStubFragment.O;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(453264920, intValue, -1, "com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubFragment.onCreateView.<anonymous>.<anonymous> (VerificationStubFragment.kt:28)");
                    }
                    rrv0.d(null, null, null, null, kai.c(646604093, new p0h(verificationStubFragment, 4), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 13:
                VideoEpisodesFragment videoEpisodesFragment = (VideoEpisodesFragment) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i6 = VideoEpisodesFragment.V;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-526031175, intValue2, -1, "com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment.onCreateContent.<anonymous>.<anonymous>.<anonymous> (VideoEpisodesFragment.kt:111)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(-1359076618, new lk1(videoEpisodesFragment, 11), aVar3), aVar3, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                Alert$Button alert$Button = (Alert$Button) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1854693322, intValue3, -1, "com.vk.core.compose.component.VkAlertOld.<anonymous> (VkAlertOld.kt:81)");
                    }
                    x7u0.a(alert$Button, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ u05(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
