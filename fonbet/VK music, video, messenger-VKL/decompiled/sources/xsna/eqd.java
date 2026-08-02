package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetChallengeResponseDto;
import com.vk.api.generated.wall.dto.WallGetResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.entrypoints.ui.a;
import com.vk.design.demo.presentation.screens.GroupMode;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vk.music.player.StandalonePlayerActivity;
import com.vk.music.playlist.display.domain.e;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.photos.ui.editalbum.domain.i;
import com.vk.profile.community.details.impl.name_history.c;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVhOld;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.a;
import com.vk.update.core.a;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import xsna.b7d0;
import xsna.d1j;
import xsna.gm50;
import xsna.pfz;
import xsna.qr60;
import xsna.qvq;
import xsna.t3o;
import xsna.tj50;
import xsna.xn50;
import xsna.xxl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class eqd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eqd(Intent intent, khg khgVar) {
        this.b = 5;
        this.c = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 17;
        int i3 = 12;
        int i4 = 16;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                iqd iqdVar = (iqd) obj2;
                CharSequence charSequence = (CharSequence) obj;
                dw20 dw20Var = iqdVar.d;
                if (dw20Var != null) {
                    Context context = iqdVar.b;
                    int length = charSequence.length();
                    dw20Var.sj(length == 0 ? context.getString(R.string.clips_edit_description_title) : l6g.a(length, "/4000"));
                }
                return s3q0.a;
            case 1:
                ((k0e) obj2).f.onCancel();
                return s3q0.a;
            case 2:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj2;
                int i5 = ClipsEntryPointsFragment.i0;
                a.g gVar = a.g.b;
                clipsEntryPointsFragment.getClass();
                xn50.a.c(clipsEntryPointsFragment, gVar);
                return s3q0.a;
            case 3:
                ((u6e) obj2).C(qvq.c.b);
                return s3q0.a;
            case 4:
                ((hjc) obj2).onClick();
                return s3q0.a;
            case 5:
                Intent intent = (Intent) obj2;
                Activity activity = (Activity) obj;
                if (activity instanceof StandalonePlayerActivity) {
                    return s3q0.a;
                }
                if (activity instanceof NavigationDelegateActivity) {
                    ((NavigationDelegateActivity) activity).Y().M(intent);
                } else {
                    Intent intent2 = new Intent(activity, (Class<?>) StandalonePlayerActivity.class);
                    fdi.f(activity, intent2);
                    intent2.addFlags(603979776);
                    activity.startActivity(intent2);
                    activity.overridePendingTransition(R.anim.slide_in, R.anim.noop);
                }
                return s3q0.a;
            case 6:
                ((com.vk.profile.community.details.impl.name_history.b) obj2).T(new c.a.C1556a((Throwable) obj));
                return s3q0.a;
            case 7:
                Triple triple = (Triple) obj;
                WallGetResponseDto wallGetResponseDto = (WallGetResponseDto) triple.i();
                it80 it80Var = (it80) triple.j();
                it80 it80Var2 = (it80) triple.k();
                WallGetResponseDto wallGetResponseDto2 = (WallGetResponseDto) it80Var.a;
                r50 r50Var = ((ouh) obj2).a;
                int count = wallGetResponseDto2 != null ? wallGetResponseDto2.getCount() : 0;
                int count2 = wallGetResponseDto.getCount();
                WallGetResponseDto wallGetResponseDto3 = (WallGetResponseDto) it80Var2.a;
                r50Var.invoke(new d.y(count, count2, wallGetResponseDto3 != null ? wallGetResponseDto3.getCount() : 0));
                return s3q0.a;
            case 8:
                ((t0i) obj2).e.invoke(((o0i) obj).a);
                return s3q0.a;
            case 9:
                com.vk.profile.community.impl.ui.view.a aVar = (com.vk.profile.community.impl.ui.view.a) obj2;
                aVar.f.invoke();
                aVar.e.l();
                return s3q0.a;
            case 10:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.g) obj2).c.invoke(new a.g((i3i) obj));
                return s3q0.a;
            case 11:
                s0j s0jVar = (s0j) obj2;
                f.a.b bVar = (f.a.b) obj;
                if (bVar != null) {
                    s0jVar.T(new d1j.k(bVar.b, bVar.a, bVar.c));
                } else {
                    s0jVar.T(d1j.i.b);
                }
                return s3q0.a;
            case 12:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new x0k((z0k) obj2, null), 3));
            case 13:
                onb0 onb0Var = (onb0) obj;
                b7d0.a invoke = ((nvl) obj2).e.invoke();
                if (invoke != null) {
                    invoke.b0(onb0Var.a);
                }
                return s3q0.a;
            case 14:
                return new xxl.b(((tj50.a) obj).a(new p4f((wxl) obj2, i2), ao8.d));
            case 15:
                ((com.vk.music.playlist.display.domain.b) obj2).T(new e.j((Map) obj));
                return s3q0.a;
            case 16:
                p3o p3oVar = (p3o) obj2;
                t3o t3oVar = (t3o) obj;
                qcy<Object>[] qcyVarArr = p3o.j1;
                if (t3oVar instanceof t3o.b) {
                    FragmentManager parentFragmentManager = p3oVar.getParentFragmentManager();
                    Bundle bundle = new Bundle();
                    bundle.putString("result_donut_teaser", ((t3o.b) t3oVar).a);
                    s3q0 s3q0Var = s3q0.a;
                    parentFragmentManager.k0(bundle, "request_donut_teaser");
                    p3oVar.dismiss();
                } else if (t3oVar.equals(t3o.a.a)) {
                    p3oVar.getParentFragmentManager().k0(Bundle.EMPTY, "request_donut_teaser");
                    p3oVar.dismiss();
                } else {
                    if (!(t3oVar instanceof t3o.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context mo2getContext = p3oVar.mo2getContext();
                    if (mo2getContext != null) {
                        enj.q(((t3o.c) t3oVar).a, 0, mo2getContext);
                    }
                }
                return s3q0.a;
            case 17:
                kzo kzoVar = (kzo) obj2;
                i.a aVar2 = (i.a) obj;
                gm50.a.a(kzoVar, aVar2.b, new s6k(kzoVar, 10));
                gm50.a.a(kzoVar, aVar2.c, new u6k(kzoVar, 5));
                gm50.a.a(kzoVar, aVar2.e, new vam(kzoVar, 7));
                gm50.a.a(kzoVar, aVar2.d, new nvg(kzoVar, i4));
                gm50.a.a(kzoVar, aVar2.a, new tcn(kzoVar, 2));
                gm50.a.a(kzoVar, aVar2.f, new n6f(kzoVar, i2));
                gm50.a.a(kzoVar, aVar2.g, new zqh(kzoVar, i3));
                return s3q0.a;
            case 18:
                ((hx40) obj2).s(((Float) obj).floatValue());
                return s3q0.a;
            case 19:
                ((DialogInterface) obj2).dismiss();
                return s3q0.a;
            case 20:
                ((zak0) ((fxt0) obj2).i).setValue((GroupMode) obj);
                return s3q0.a;
            case 21:
                return (ClipsChallenge) ((e420) obj2).invoke((ShortVideoGetChallengeResponseDto) obj);
            case 22:
                GlobalSearchGroupsCatalogRootVhOld globalSearchGroupsCatalogRootVhOld = (GlobalSearchGroupsCatalogRootVhOld) obj2;
                l3a l3aVar = (l3a) obj;
                if (l3aVar instanceof SearchSpellcheckVh.a.C0525a) {
                    uxh0 uxh0Var = globalSearchGroupsCatalogRootVhOld.r;
                    if (uxh0Var != null) {
                        uxh0Var.X1(((SearchSpellcheckVh.a.C0525a) l3aVar).a, true);
                    }
                } else if (l3aVar instanceof SearchSpellcheckVh.a.b) {
                    String str = ((SearchSpellcheckVh.a.b) l3aVar).a;
                    uxh0 uxh0Var2 = globalSearchGroupsCatalogRootVhOld.r;
                    if (uxh0Var2 != null) {
                        uxh0Var2.X1(str, true);
                    }
                    xda.D(globalSearchGroupsCatalogRootVhOld, str, globalSearchGroupsCatalogRootVhOld.H.g, null, 16);
                } else if (l3aVar instanceof xyh0) {
                    xyh0 xyh0Var = (xyh0) l3aVar;
                    com.vk.catalog2.common.ui.holders.search.b bVar2 = com.vk.catalog2.common.ui.holders.search.b.a;
                    SearchResultsImplVh searchResultsImplVh = globalSearchGroupsCatalogRootVhOld.I;
                    String V = searchResultsImplVh.V();
                    if (V == null) {
                        V = "";
                    }
                    com.vk.catalog2.common.ui.holders.search.b.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP_SHOW_ALL, V);
                    globalSearchGroupsCatalogRootVhOld.L.a(searchResultsImplVh.V(), new hc1(i3, globalSearchGroupsCatalogRootVhOld, xyh0Var));
                }
                return s3q0.a;
            case 23:
                GradientDrawable gradientDrawable = (GradientDrawable) obj2;
                if (((upf0) obj) instanceof pfz.b) {
                    return gradientDrawable;
                }
                return null;
            case 24:
                cvk.w(j03.g(((hou) obj2).k.get(), (Throwable) obj, R.string.error), false);
                return s3q0.a;
            case 25:
                ((c8v) obj2).d1().g(true);
                return s3q0.a;
            case 26:
                Pair pair = (Pair) obj;
                Set set = (Set) pair.d();
                Set set2 = (Set) pair.g();
                io.reactivex.rxjava3.subjects.d<i8w> dVar = ((k8w) obj2).h;
                dVar.onNext(i8w.a(dVar.P0(), null, set, set2, 1));
                return s3q0.a;
            case 27:
                ((com.vk.update.core.a) obj2).j.onNext((a.C1935a) obj);
                return s3q0.a;
            case 28:
                ((dzw) obj2).b.invoke(new qr60.a.d(false));
                return s3q0.a;
            default:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar = ((kbx) obj2).e;
                if (fVar != null) {
                    fVar.e2(a.c.b);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ eqd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
