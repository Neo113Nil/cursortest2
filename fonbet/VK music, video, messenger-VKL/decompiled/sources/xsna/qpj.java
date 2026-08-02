package xsna;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import com.vk.attachpicker.screen.filters.a;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.clips.design.view.filter.CorrectionsView;
import com.vk.dto.common.data.CatalogInfo;
import com.vk.dto.games.GameGenre;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.ecomm.market.good.a;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.games.presentation.fragments.GamesListFragment;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.log.L;
import com.vk.managed_groups.impl.list.h;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ImFeatures;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.ba00;
import xsna.bfs;
import xsna.cs00;
import xsna.ipz;
import xsna.jw00;
import xsna.lbv;
import xsna.t6k;
import xsna.tra0;
import xsna.v8v;
import xsna.y6k;
import xsna.ypt;
import xsna.ytm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class qpj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qpj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SerialDescriptor descriptor;
        List<? extends y900> i;
        int i2 = this.b;
        List<Annotation> list = null;
        int i3 = 24;
        int i4 = 0;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                sfc sfcVar = (sfc) obj;
                KSerializer<T> kSerializer = ((rpj) obj2).b;
                if (kSerializer != null && (descriptor = kSerializer.getDescriptor()) != null) {
                    list = descriptor.getAnnotations();
                }
                if (list == null) {
                    list = EmptyList.b;
                }
                sfcVar.b = list;
                return s3q0.a;
            case 1:
                return CorrectionsView.P4((CorrectionsView) obj2, (lwj) obj);
            case 2:
                ((i3k) obj2).e.invoke();
                return s3q0.a;
            case 3:
                t6k t6kVar = (t6k) obj2;
                y6k.b bVar = t6kVar.h;
                LayoutInflater layoutInflater = t6kVar.j;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
                imFeatures.getClass();
                return com.vk.toggle.b.A.a(imFeatures) ? new wt0(layoutInflater.inflate(R.layout.vkim_new_chat_controls_vh, viewGroup, false), bVar) : new t6k.b(layoutInflater.inflate(R.layout.vkim_new_chat_controls_vh_old, viewGroup, false), bVar);
            case 4:
                return (String) j5g.Y(((Regex) obj2).j(0, (String) obj));
            case 5:
                cfm cfmVar = (cfm) obj2;
                dtk0 dtk0Var = cfmVar.K;
                qtd0 zb = dtk0Var.c.zb(dtk0Var.b.Zb());
                if (zb != null) {
                    mdw g = g2v.c().g();
                    VkImAvatar vkImAvatar = cfmVar.m;
                    ImStoryState imStoryState = dtk0Var.l;
                    imStoryState.getClass();
                    g.a(vkImAvatar, zb, imStoryState == ImStoryState.NEW, MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_DIALOG_HEADER, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT, new l9(14));
                }
                return s3q0.a;
            case 6:
                ((fum) obj2).O(new ytm.f0((Set) obj));
                return s3q0.a;
            case 7:
                DzenArticleFragment dzenArticleFragment = (DzenArticleFragment) obj2;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                g47Var.e(tci.l(dzenArticleFragment.fo()), new cto(new wi3(1, dzenArticleFragment.fo(), bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0, 8)));
                g47Var.a(tci.k(dzenArticleFragment.fo()));
                g47Var.d(new iro(dzenArticleFragment.fo()));
                return s3q0.a;
            case 8:
                fcp fcpVar = (fcp) obj2;
                fcpVar.z = new CodeState.EmailWait(0L, 0L, 0, null, 15, null);
                fcpVar.M0();
                fcpVar.N0();
                return s3q0.a;
            case 9:
                u1c0 u1c0Var = (u1c0) obj;
                return Boolean.valueOf(u1c0Var.c == 241 && u1c0Var.a == ((NewsEntry) obj2));
            case 10:
                com.vk.attachpicker.screen.filters.b bVar2 = (com.vk.attachpicker.screen.filters.b) obj2;
                a.AbstractC0387a abstractC0387a = (a.AbstractC0387a) obj;
                oa oaVar = new oa(22);
                if (abstractC0387a instanceof a.AbstractC0387a.C0388a) {
                    i = com.vk.attachpicker.screen.filters.b.i(((a.AbstractC0387a.C0388a) abstractC0387a).a, bVar2.f, oaVar);
                } else if (abstractC0387a instanceof a.AbstractC0387a.c) {
                    i = com.vk.attachpicker.screen.filters.b.i(((a.AbstractC0387a.c) abstractC0387a).a, bVar2.f, new vam(abstractC0387a, 9));
                } else {
                    if (!(abstractC0387a instanceof a.AbstractC0387a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.vk.attachpicker.screen.filters.b.i(((a.AbstractC0387a.b) abstractC0387a).a, bVar2.f, new qt0(i3));
                }
                bVar2.f = i;
                ba00.a aVar = bVar2.d;
                if (aVar != null) {
                    aVar.a(j5g.u0(i, (Collection) bVar2.e));
                }
                return s3q0.a;
            case 11:
                it80 it80Var = (it80) obj;
                T t = it80Var.a;
                ((bfs.a) obj2).getClass();
                return it80Var;
            case 12:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                q6r0.b((m6r0) obj2);
                return s3q0.a;
            case 13:
                tra0.a.x((tra0.a) obj, (tra0) obj2, 0, 0);
                return s3q0.a;
            case 14:
                GameUnavailableFragment gameUnavailableFragment = (GameUnavailableFragment) obj2;
                qcy<Object>[] qcyVarArr2 = GameUnavailableFragment.W;
                GamesListFragment.e eVar = new GamesListFragment.e(GamesListFragment.class, null, null);
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GAMES_CATEGORY;
                Bundle bundle = eVar.j;
                bundle.putSerializable("GamesListFragment.ref", mobileOfficialAppsCoreNavStat$EventScreen);
                bundle.putParcelable("key_filter", new CatalogInfo(new GameGenre(gameUnavailableFragment.io().m, gameUnavailableFragment.io().l)));
                eVar.k(gameUnavailableFragment.requireContext());
                return s3q0.a;
            case 15:
                ((ypt) obj2).a((ypt.a) obj, new xpt(i4));
                return s3q0.a;
            case 16:
                gmq gmqVar = (gmq) obj;
                gmqVar.s0(gmqVar.X());
                ((a.C0945a) obj2).c.invoke(Integer.valueOf(gmqVar.X() ? -1 : 1));
                return s3q0.a;
            case 17:
                phu phuVar = (phu) obj2;
                return new wns0(phuVar.l, phuVar.i, phuVar.j, phuVar.k, phuVar.m, (ViewGroup) obj);
            case 18:
                ((cbv) obj2).p.onNext(lbv.c.a);
                return s3q0.a;
            case 19:
                gzs gzsVar = (gzs) obj2;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 20:
                ((com.vk.ecomm.design.view.tile.a) obj2).l.invoke();
                return s3q0.a;
            case 21:
                wh50 wh50Var = (wh50) obj2;
                wh50Var.setValue(zbo0.a((zbo0) wh50Var.getValue(), null, null, ((Boolean) obj).booleanValue(), false, false, 27));
                return s3q0.a;
            case 22:
                return new auy((yty) obj2);
            case 23:
                AppCompatEditText appCompatEditText = (AppCompatEditText) obj;
                appCompatEditText.setEnabled(true);
                ((com.vk.newsfeed.common.recycler.holders.b) obj2).C = false;
                Editable text = appCompatEditText.getText();
                if (text != null) {
                    text.clear();
                }
                mhy.j(appCompatEditText);
                appCompatEditText.requestFocus();
                appCompatEditText.setSelection(appCompatEditText.length());
                return s3q0.a;
            case 24:
                float f = ListGroupCallView.o0;
                ((ListGroupCallView) obj2).T4(false);
                return s3q0.a;
            case 25:
                L.j((Throwable) obj, "Error turning off notifications");
                ((com.vk.managed_groups.impl.list.c) obj2).i.b(h.a.a);
                return s3q0.a;
            case 26:
                return new je90((ViewGroup) obj, 16, new hvz((wr00) obj2, 2));
            case 27:
                dt00 dt00Var = (dt00) obj2;
                ct00 ct00Var = dt00Var.q;
                if (ct00Var != null) {
                    dt00Var.l.a(new cs00.n(ct00Var.b));
                }
                return s3q0.a;
            case 28:
                jw00 jw00Var = (jw00) obj;
                io.reactivex.rxjava3.subjects.d<Map<jw00.d, jw00>> dVar = ((lw00) obj2).d;
                Map<jw00.d, jw00> P0 = dVar.P0();
                if (P0 != null) {
                    P0.put(jw00Var.b(), jw00Var);
                }
                dVar.onNext(P0);
                return s3q0.a;
            default:
                w920 w920Var = (w920) obj2;
                ipz ipzVar = (ipz) obj;
                if (ipzVar instanceof ipz.b) {
                    return io.reactivex.rxjava3.core.x.k(new v8v.b(((ipz.b) ipzVar).a));
                }
                if (!(ipzVar instanceof ipz.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ipz.a aVar2 = (ipz.a) ipzVar;
                return new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.v(new gxi(r4 ? 1 : 0, aVar2, w920Var)).l(new fq1(new ju(11, w920Var, aVar2), i3)).q((io.reactivex.rxjava3.core.w) w920Var.n.b).m(asu0.a.c()), new ntb(w920Var, 3)), new gn0(new bi0(i3, aVar2, w920Var), 29));
        }
    }
}
