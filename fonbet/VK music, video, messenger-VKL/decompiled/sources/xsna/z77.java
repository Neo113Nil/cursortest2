package xsna;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.clips.design.view.editor.CorrectionView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.preference.Preference;
import com.vk.donut.design.compose.banner.DonutBannerKt;
import com.vk.donut.design.compose.banner.c;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.im.settings.DarkThemeTimetableFragment;
import com.vk.libvideo.bottomsheet.about.delegate.g0;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.pox0;
import xsna.qis0;
import xsna.uoq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class z77 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z77(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        final Integer num;
        View findViewByPosition;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                a87.b((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) this.c;
                ActionLinks actionLinks = (ActionLinks) obj2;
                aVar.l0 = actionLinks;
                ArrayList arrayList = actionLinks.d;
                int size = arrayList != null ? arrayList.size() : 0;
                aVar.n0 = size;
                CameraUIView cameraUIView = aVar.b;
                cameraUIView.setAttachCollectionSize(size);
                if (size < 1 && aVar.i.G) {
                    cameraUIView.setAttachCollectionSize(1);
                }
                break;
            case 2:
                CorrectionView correctionView = (CorrectionView) this.c;
                FilterType filterType = (FilterType) obj;
                float floatValue = ((Float) obj2).floatValue();
                FilterInfo filterInfo = correctionView.x;
                if (filterInfo != null) {
                    FilterInfo a = FilterInfo.a(filterInfo, filterType.i(), floatValue, null, null, 12);
                    qis0.a aVar2 = correctionView.w;
                    if (aVar2 != null) {
                        aVar2.a(a);
                    }
                    correctionView.x = a;
                }
                break;
            case 3:
                DarkThemeTimetableFragment darkThemeTimetableFragment = (DarkThemeTimetableFragment) this.c;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                nyo0 nyo0Var = darkThemeTimetableFragment.P;
                if (nyo0Var == null) {
                    nyo0Var = null;
                }
                nyo0Var.getClass();
                Preference.F(intValue, "THEME_TIMETABLE", "HOUR_START");
                nyo0 nyo0Var2 = darkThemeTimetableFragment.P;
                (nyo0Var2 != null ? nyo0Var2 : null).getClass();
                Preference.F(intValue2, "THEME_TIMETABLE", "MINUTE_START");
                darkThemeTimetableFragment.eo();
                dhr0.j(dhr0.a, darkThemeTimetableFragment.kn());
                break;
            case 4:
                c.a aVar3 = (c.a) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1601228518, intValue3, -1, "com.vk.donut.design.compose.banner.SubscribedCardContentBenefits.<anonymous> (DonutBanner.kt:834)");
                    }
                    Iterator it = aVar3.a.iterator();
                    while (it.hasNext()) {
                        DonutBannerKt.c((hzn) it.next(), aVar4, 0);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 5:
                cqq cqqVar = (cqq) this.c;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                cpq cpqVar = cqqVar.k;
                final d64 a2 = isiVar.a(new ac0(sj50Var, cpqVar));
                final d64 a3 = isiVar.a(new xb0(sj50Var, cpqVar));
                final d64 a4 = isiVar.a(new yb0(sj50Var, cpqVar));
                final d64 a5 = isiVar.a(new zb0(cpqVar, cqqVar.h, sj50Var));
                isiVar.c = new wzs() { // from class: xsna.mpq
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        rj50 rj50Var = (rj50) obj3;
                        uoq uoqVar = (uoq) obj4;
                        if (uoqVar instanceof uoq.c) {
                            return rj50Var.a(d64.this, uoqVar);
                        }
                        if (uoqVar instanceof uoq.b) {
                            return rj50Var.a(a4, uoqVar);
                        }
                        if (uoqVar instanceof uoq.a) {
                            return rj50Var.a(a3, uoqVar);
                        }
                        if (uoqVar instanceof voq) {
                            return rj50Var.a(a5, uoqVar);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((o0z) this.c).n(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((co20) this.c).c(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 8:
                bf50 bf50Var = (bf50) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                bf50Var.g.setEnabled(booleanValue);
                bf50Var.h.setEnabled(booleanValue2);
                break;
            case 9:
                View view = (View) obj;
                wix wixVar = (wix) obj2;
                cjx cjxVar = ((vq50) this.c).E;
                if (cjxVar == null) {
                    cjxVar = null;
                }
                cjxVar.i(view, wixVar, NativeAdContent.ViewTag.CTA);
                break;
            case 10:
                final NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) this.c;
                final sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = newsfeedCustomFragment2.Z;
                if (recyclerView != null) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    Integer num2 = null;
                    final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    int i = 0;
                    if (sq60Var.e) {
                        num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                            i = findViewByPosition.getTop();
                        }
                        num2 = Integer.valueOf(i);
                    }
                    final Integer num3 = num2;
                    newsfeedCustomFragment2.fo().a().H0(recyclerView, new k50(5, newsfeedCustomFragment2, sq60Var), new Runnable() { // from class: xsna.ff60
                        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Integer num4;
                            LinearLayoutManager linearLayoutManager2;
                            qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                            Integer num5 = num;
                            if (num5 != null && (num4 = num3) != null && (linearLayoutManager2 = linearLayoutManager) != null) {
                                linearLayoutManager2.K(num5.intValue(), num4.intValue());
                            }
                            sq60 sq60Var2 = sq60Var;
                            boolean z = sq60Var2.d;
                            NewsfeedCustomFragment2 newsfeedCustomFragment22 = newsfeedCustomFragment2;
                            if (z) {
                                RecyclerView recyclerView2 = newsfeedCustomFragment22.Z;
                                RecyclerView.o layoutManager2 = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                                LinearLayoutManager linearLayoutManager3 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                                if (linearLayoutManager3 != null) {
                                    linearLayoutManager3.K(0, 0);
                                }
                            }
                            ((o170) newsfeedCustomFragment22.fo().a.V.getValue()).b(newsfeedCustomFragment22.Z);
                            newsfeedCustomFragment22.fo().b().a(sq60Var2.a);
                            ehv ehvVar = (ehv) newsfeedCustomFragment22.fo().e.b;
                            if (ehvVar != null) {
                                ehvVar.r();
                            }
                        }
                    }, sq60Var.a, sq60Var.c);
                    break;
                } else {
                    break;
                }
                break;
            case 11:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) this.c;
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                View view2 = newsfeedSearchFragment.f0;
                if (view2 != null) {
                    view2.setVisibility(booleanValue3 ? 0 : 8);
                }
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = newsfeedSearchFragment.e0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setEnabled(!booleanValue3);
                }
                break;
            case 12:
                ((Activity) this.c).startActivityForResult((Intent) obj, ((Integer) obj2).intValue());
                break;
            case 13:
                yde ydeVar = (yde) this.c;
                Long l = (Long) obj;
                l.getClass();
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ydeVar.invoke(l, bool);
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((hrq0) this.c).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 15:
                g0.a aVar5 = (g0.a) this.c;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1657244470, intValue4, -1, "com.vk.libvideo.bottomsheet.about.delegate.VideoEpisodesDelegate.ViewHolder.<anonymous>.<anonymous> (VideoEpisodesDelegate.kt:76)");
                    }
                    btp btpVar = (btp) ((zak0) aVar5.m).getValue();
                    if (btpVar == null) {
                        aVar6.K(-320908675);
                    } else {
                        aVar6.K(-320908674);
                        qjs0.a(btpVar, null, aVar6, 0);
                    }
                    aVar6.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 16:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1092420563, intValue5, -1, "com.vk.core.compose.component.VkAlert.<anonymous>.<anonymous> (VkAlert.kt:53)");
                    }
                    if (cq.i(0, aVar7, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mnx0.a((pox0.e.a) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ z77(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
