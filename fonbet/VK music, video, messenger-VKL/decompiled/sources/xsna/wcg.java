package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.ViewGroup;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.acx;
import xsna.as30;
import xsna.c8p;
import xsna.dw20;
import xsna.f3m;
import xsna.ocx;
import xsna.pwh;
import xsna.r69;
import xsna.tj50;
import xsna.tzp0;
import xsna.v1j;
import xsna.xwg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wcg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wcg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        String obj2;
        String str = null;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((NewsComment) ((iag) this.c)).i == ((NewsComment) ((cbg) obj).a).i);
            case 1:
                return new xwg.a(((tj50.a) obj).a(new po1((pwg) this.c, 24), ao8.d));
            case 2:
                ((jwh) this.c).T(new pwh.g((Throwable) obj));
                return s3q0.a;
            case 3:
                ryh ryhVar = (ryh) this.c;
                String str2 = (String) obj;
                dw20 dw20Var = ryhVar.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                maz.c(ryhVar.d.e(), ryhVar.a, str2, new LaunchContext(false, true, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108861), null, null, 24);
                return s3q0.a;
            case 4:
                return ((f1i) this.c).getResources().getString(((VkGroupsSearchParams.CommunityType) obj).j());
            case 5:
                return new k2j((ViewGroup) obj, (nvg) this.c);
            case 6:
                ((lak) this.c).r.invoke(new v1j.t(((Integer) obj).intValue()));
                return s3q0.a;
            case 7:
                g3m g3mVar = (g3m) this.c;
                int c = g3mVar.c();
                int b = g3mVar.b();
                int i2 = g3m.k;
                return new f3m.a(c, b, i2, i2);
            case 8:
                h6n0 h6n0Var = (h6n0) obj;
                thm thmVar = ((shm) this.c).m;
                if (thmVar != null) {
                    thmVar.a(h6n0Var);
                }
                return s3q0.a;
            case 9:
                ((View) obj).setBackgroundColor(((kkm) this.c).f(R.attr.vk_ui_separator_primary));
                return s3q0.a;
            case 10:
                f0p f0pVar = (f0p) this.c;
                f0pVar.getClass();
                boolean z = ((Integer) obj).intValue() == 2;
                f0pVar.Q = !z;
                f0pVar.J0();
                if (!z) {
                    f0pVar.F.notifyDataSetChanged();
                }
                return s3q0.a;
            case 11:
                c8p c8pVar = (c8p) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c8p.b bVar = c8p.n1;
                c8pVar.Tn(booleanValue ? 0 : 8);
                return s3q0.a;
            case 12:
                final ikp ikpVar = (ikp) this.c;
                dw20 dw20Var2 = ikpVar.g;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                jee0 jee0Var = new jee0(bwt0.u(ikpVar.getContext()));
                jjc.g(jee0Var.getAcceptBtn(), new d9j(ikpVar, 5));
                dw20.b B = new dw20.b(bwt0.u(ikpVar.getContext()), new tzp0.c(null, false)).D0(jee0Var, false).B(cn70.c(12), true, false);
                dhr0.a.getClass();
                ikpVar.g = B.u0(dhr0.u().c).F0(true).c(new jgj(jee0Var, 0, 0, 30)).Y(new hkp(ikpVar)).Z(new DialogInterface.OnDismissListener() { // from class: xsna.gkp
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        ikp ikpVar2 = ikp.this;
                        wjp wjpVar = ikpVar2.h;
                        if (wjpVar != null) {
                            wjpVar.k0();
                        }
                        ikpVar2.g = null;
                    }
                }).l(e3m.f(R.attr.vk_ui_background_content, dhr0.s())).I0(fpf0.a(jee0.class).l());
                return s3q0.a;
            case 13:
                ExploreFragment exploreFragment = (ExploreFragment) this.c;
                int i3 = ExploreFragment.h0;
                exploreFragment.io();
                return s3q0.a;
            case 14:
                return v0r.p((v0r) this.c, (Context) obj, "Иван", "Очень длинный текст😀😄😁 комментария, который не помещается в одну строку и должен перенестись на следующую строку для проверки многострочного режима", false, 48);
            case 15:
                return Boolean.valueOf(epx.f(((LaunchForResultInfo) obj).Ab(), ((FragmentEntry) this.c).d));
            case 16:
                evs evsVar = (evs) this.c;
                c4u0 c4u0Var = evsVar.E;
                ocx.d dVar = evsVar.l.n;
                ocx.d.a aVar = ocx.d.a.a;
                if (epx.f(dVar, aVar)) {
                    evsVar.a(acx.i.a);
                } else {
                    r6p0 r6p0Var = bwt0.K(c4u0Var.o) ? evsVar.K : null;
                    if (r6p0Var != null) {
                        ocx.d dVar2 = evsVar.l.n;
                        VkImageSimple vkImageSimple = c4u0Var.d;
                        fp5 fp5Var = (fp5) r6p0Var.f.getValue();
                        fp5Var.getClass();
                        if (!dVar2.equals(aVar) && !dVar2.equals(ocx.d.e.a)) {
                            if (dVar2.equals(ocx.d.b.a)) {
                                i = R.string.you_watching_first_chapter;
                            } else if (dVar2.equals(ocx.d.c.a)) {
                                i = R.string.history_not_available;
                            } else {
                                if (!dVar2.equals(ocx.d.C3449d.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = R.string.backward_limit_reached;
                            }
                            str = fp5Var.a.getString(i);
                        }
                        String str3 = str;
                        if (str3 == null) {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.w, new Object[]{"Can not resolve text for " + dVar2 + ". Skip!"});
                            }
                        } else {
                            r6p0.d(r6p0Var, str3, bwt0.C(vkImageSimple), vkImageSimple, 8388611, cn70.b(4), 200);
                        }
                    }
                }
                return s3q0.a;
            case 17:
                GeoFragment geoFragment = (GeoFragment) this.c;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                yv50 fo = geoFragment.fo();
                fo.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    fo.w((do00) entry.getKey(), ((VisibleStyle) entry.getValue()).b, false);
                }
                return s3q0.a;
            case 18:
                ((kot) this.c).l.invoke(new r69.b(FeatureId.GESTURE_FEEDBACK));
                return s3q0.a;
            case 19:
                su9 su9Var = (su9) this.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (((Boolean) ((FunctionReferenceImpl) su9Var.c).invoke(((b69) obj3).a)).booleanValue()) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 20:
                GlobalSearchWithParamsCatalogRootVh globalSearchWithParamsCatalogRootVh = (GlobalSearchWithParamsCatalogRootVh) this.c;
                ysg0.b.a(globalSearchWithParamsCatalogRootVh.o0());
                globalSearchWithParamsCatalogRootVh.p0(null, true);
                return s3q0.a;
            case 21:
                GoodFragment goodFragment = (GoodFragment) this.c;
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                j03.j(goodFragment.getActivity(), (Throwable) obj);
                return s3q0.a;
            case 22:
                ((jcu) this.c).d.invoke(vbu.b);
                return s3q0.a;
            case 23:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof xiu) && epx.f(((xiu) instantJob).c, ((fpu) this.c).b));
            case 24:
                n6v n6vVar = (n6v) this.c;
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                return (applicationInfo == null || (obj2 = n6vVar.a.getPackageManager().getApplicationLabel(applicationInfo).toString()) == null) ? "" : obj2;
            case 25:
                return na8.a((int) sa30.E(((Float) obj).floatValue(), new k9x(0, 100, 1), new k9x(-50, 50, 1)), ((DashedSeekBar) this.c).getContext().getString(R.string.editor_saturation_full), " ");
            case 26:
                ((as30.a) this.c).c();
                return Boolean.TRUE;
            case 27:
                zrw zrwVar = (zrw) this.c;
                Integer num = (Integer) obj;
                if (num != null) {
                    zrwVar.s.setImageResource(num.intValue());
                }
                return s3q0.a;
            case 28:
                return new com.vk.stickers.keyboard.navigation.f((ViewGroup) obj, ((com.vk.stickers.keyboard.navigation.a) this.c).k);
            default:
                return Boolean.valueOf(((a000) this.c).e);
        }
    }
}
