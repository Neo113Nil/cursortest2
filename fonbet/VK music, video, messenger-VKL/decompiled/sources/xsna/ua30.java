package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.donut.design.compose.banner.DonutBannerKt;
import com.vk.donut.design.compose.banner.DonutBannerSkeletonContent;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.data.VKList;
import com.vk.profile.user.impl.domain.donut.state.DonutBannerDonutType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.Tensorflow;
import xsna.hyn;
import xsna.pox0;
import xsna.q630;
import xsna.voq0;
import xsna.vos;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ua30 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ua30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VKList vKList;
        androidx.compose.runtime.a aVar;
        gzs gzsVar;
        DonutBannerSkeletonContent donutBannerSkeletonContent;
        DonutBannerSkeletonContent.Type type;
        switch (this.b) {
            case 0:
                xvy xvyVar = (xvy) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar2.K(-500772957);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-500772957, intValue, -1, "com.vk.video.utils.motionlayout.compose.interop.nestedscroll.motionLayoutNestedScroll.<anonymous> (MotionLayoutNestedScrollComposeModifier.kt:32)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(100141346, 0, -1, "com.vk.video.utils.motionlayout.compose.interop.nestedscroll.rememberLazyListNestedScrollConnection (MotionLayoutNestedScrollComposeModifier.kt:17)");
                }
                View view = (View) aVar2.r(AndroidCompositionLocals_androidKt.f);
                view.setTag("compose_nested_scroll_source");
                j160 z = fz5.z(view, aVar2, 0);
                boolean J = aVar2.J(xvyVar) | aVar2.J(z);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new kvy(xvyVar, z);
                    aVar2.R(x);
                }
                kvy kvyVar = (kvy) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 t = n34.t(q630Var, kvyVar, null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return t;
            case 1:
                eps epsVar = (eps) this.c;
                List list = (List) obj;
                List list2 = (List) obj2;
                List list3 = (List) obj3;
                VKList<zxq0> vKList2 = epsVar.b;
                vos.b bVar = epsVar.c;
                VKList vKList3 = null;
                if (vKList2 != null) {
                    vKList = new VKList(vKList2.i(), vKList2.k());
                    vKList.n(vKList2.j());
                    vKList.addAll(list);
                } else {
                    vKList = null;
                }
                VKList<zxq0> vKList4 = epsVar.a;
                if (vKList4 != null) {
                    vKList3 = new VKList(vKList4.i(), vKList4.k());
                    vKList3.n(vKList4.j());
                    vKList3.addAll(list2);
                }
                VKFromList vKFromList = new VKFromList(bVar.a.i());
                vKFromList.addAll(list3);
                return new cps(vKList3, vKList, new ass(vKFromList, bVar.b));
            case 2:
                Integer num = (Integer) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1679550395, intValue2, -1, "com.vk.fullscreenvideo.top.Message.<anonymous> (TopControls.kt:99)");
                }
                if (num != null) {
                    aVar3.K(-883141955);
                    String N = d370.N(num.intValue(), 0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, q630.a.a, l5g.d, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.s0, aVar3, Tensorflow.FRAME_WIDTH, 0, 8120);
                    aVar = aVar3;
                } else {
                    aVar = aVar3;
                    aVar.K(-886934681);
                }
                aVar.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 3:
                izs izsVar = (izs) this.c;
                hyn hynVar = (hyn) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= (intValue3 & 8) == 0 ? aVar4.J(hynVar) : aVar4.y(hynVar) ? 4 : 2;
                }
                if (aVar4.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(35267521, intValue3, -1, "com.vk.profile.user.impl.ui.adapter.holders.DonutBannerContent.<anonymous> (UserProfileDonutBannerViewHolder.kt:84)");
                    }
                    boolean z2 = hynVar instanceof hyn.c;
                    q630.a aVar5 = q630.a.a;
                    if (z2) {
                        aVar4.K(-1612184064);
                        List<DonutBannerDonutType> list4 = ((hyn.c) hynVar).a;
                        if (list4.size() == 1) {
                            int i = voq0.a.$EnumSwitchMapping$0[((DonutBannerDonutType) j5g.Y(list4)).ordinal()];
                            if (i == 1) {
                                type = DonutBannerSkeletonContent.Type.Regular;
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                type = DonutBannerSkeletonContent.Type.Goals;
                            }
                            donutBannerSkeletonContent = new DonutBannerSkeletonContent.a(type);
                        } else {
                            donutBannerSkeletonContent = DonutBannerSkeletonContent.b.a;
                        }
                        com.vk.donut.design.compose.banner.b.g(donutBannerSkeletonContent, txj0.f(aVar5, 1.0f), aVar4, 48, 0);
                        aVar4.j();
                    } else if (hynVar instanceof hyn.b) {
                        aVar4.K(-1611433430);
                        pwn pwnVar = ((hyn.b) hynVar).a;
                        int i2 = intValue3;
                        String str = pwnVar.a;
                        String str2 = pwnVar.b;
                        String str3 = pwnVar.c;
                        com.vk.donut.design.compose.banner.a aVar6 = pwnVar.d;
                        q630 f = txj0.f(aVar5, 1.0f);
                        gvw gvwVar = pwnVar.e;
                        String str4 = pwnVar.f;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        gzs gzsVar2 = null;
                        if (str4 == null) {
                            aVar4.K(-1610173932);
                            aVar4.j();
                            gzsVar = null;
                        } else {
                            aVar4.K(-1610173931);
                            boolean J2 = aVar4.J(izsVar) | aVar4.J(str4);
                            Object x2 = aVar4.x();
                            if (J2 || x2 == c0012a) {
                                x2 = new q2m0(5, izsVar, str4);
                                aVar4.R(x2);
                            }
                            gzsVar = (gzs) x2;
                            aVar4.j();
                        }
                        String str5 = pwnVar.g;
                        if (str5 == null) {
                            aVar4.K(-1609760392);
                        } else {
                            aVar4.K(-1609760391);
                            boolean J3 = aVar4.J(izsVar) | aVar4.J(str5);
                            Object x3 = aVar4.x();
                            if (J3 || x3 == c0012a) {
                                x3 = new rp1(23, izsVar, str5);
                                aVar4.R(x3);
                            }
                            gzsVar2 = (gzs) x3;
                        }
                        aVar4.j();
                        int i3 = i2 & 14;
                        boolean J4 = (i3 == 4 || ((i2 & 8) != 0 && aVar4.y(hynVar))) | aVar4.J(izsVar);
                        Object x4 = aVar4.x();
                        if (J4 || x4 == c0012a) {
                            x4 = new mk(23, hynVar, izsVar);
                            aVar4.R(x4);
                        }
                        gzs gzsVar3 = (gzs) x4;
                        boolean J5 = (i3 == 4 || ((i2 & 8) != 0 && aVar4.y(hynVar))) | aVar4.J(izsVar);
                        Object x5 = aVar4.x();
                        if (J5 || x5 == c0012a) {
                            x5 = new com.vk.movika.sdk.base.ui.r0(28, hynVar, izsVar);
                            aVar4.R(x5);
                        }
                        DonutBannerKt.d(str, str2, aVar6, gzsVar3, (gzs) x5, f, str3, gvwVar, false, gzsVar, gzsVar2, null, aVar4, 196608, 2304);
                        aVar4.j();
                    } else {
                        if (!(hynVar instanceof hyn.a)) {
                            throw alb0.c(-467647410, aVar4);
                        }
                        aVar4.K(-1609517692);
                        voq0.b(48, aVar4, izsVar, txj0.f(aVar5, 1.0f));
                        aVar4.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                pox0.e.a.C3525a c3525a = (pox0.e.a.C3525a) this.c;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar7.J(spg0Var) ? 4 : 2;
                }
                if (aVar7.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-414832565, intValue4, -1, "com.vk.community.design.compose.widget.matches.TeamB.<anonymous> (WidgetMatches.kt:96)");
                    }
                    mnx0.g(c3525a.a, aVar7, 0);
                    mnx0.h(spg0Var, c3525a.b, 5, aVar7, intValue4 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
        }
    }
}
