package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.ComposeView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.channels.impl.comments.g;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.CheckLinkResponse;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.polls.Poll;
import com.vk.dto.stickers.StickerSuggestion;
import com.vk.folders.impl.configure.d;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.photos.ui.editalbum.domain.PrivacySettingData;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.pushes.receivers.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import com.vk.superapp.common.js.bridge.api.events.ShowSlidesSheet$Response;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.drz;
import xsna.egp0;
import xsna.f8a;
import xsna.h7u0;
import xsna.k4i;
import xsna.kyh;
import xsna.mp90;
import xsna.mwa;
import xsna.n5p;
import xsna.tlo0;
import xsna.uje;
import xsna.us2;
import xsna.wk50;
import xsna.x89;
import xsna.x8a0;
import xsna.xo90;
import xsna.yvn0;
import xsna.zi3;
import xsna.zp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tn0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tn0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Window window;
        com.vk.core.view.components.spinner.c cVar;
        ActionLink actionLink;
        int i = 3;
        int i2 = 0;
        Throwable th = null;
        int i3 = 1;
        switch (this.b) {
            case 0:
                un0 un0Var = (un0) this.c;
                vn0 vn0Var = (vn0) this.d;
                final c2l0 c2l0Var = un0Var.l;
                final int i4 = vn0Var.c;
                List<StickerSuggestion> list = vn0Var.d;
                Context context = c2l0Var.b;
                View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_suggest_add_dialog, (ViewGroup) null);
                final EditText editText = (EditText) inflate.findViewById(R.id.edit);
                TextView textView = (TextView) inflate.findViewById(R.id.warning);
                View findViewById = inflate.findViewById(R.id.save);
                findViewById.setEnabled(false);
                textView.setVisibility(0);
                textView.setText(R.string.stickers_suggest_add_dialog_min);
                jno0.c(textView, R.attr.vk_ui_text_secondary);
                editText.addTextChangedListener(new b2l0(c2l0Var, list, textView, findViewById));
                editText.requestFocus();
                int i5 = h7u0.p;
                h7u0.a a = h7u0.b.a(context);
                a.f = inflate;
                a.a0(new DialogInterface.OnDismissListener() { // from class: xsna.z1l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        EditText editText2 = editText;
                        editText2.clearFocus();
                        mhy.d(editText2);
                        dhr0.a.d(c2l0Var);
                    }
                });
                c2l0Var.e = a.m();
                jjc.g(findViewById, new izs() { // from class: xsna.a2l0
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        Editable text = editText.getText();
                        c2l0 c2l0Var2 = c2l0.this;
                        c2l0Var2.getClass();
                        String a2 = c2l0.a(text);
                        p8l0 p8l0Var = new p8l0("store.addStickerSuggestion");
                        int i6 = i4;
                        p8l0Var.C(i6, "sticker_id");
                        p8l0Var.K("word", a2);
                        hg1.b(c2l0Var2.c, hg1.m(rsg0.y0(p8l0Var, null, null, 3), c2l0Var2.b, 0L, false, 62).subscribe(new rkz(new os40(c2l0Var2, i6, a2), 23), new bqs(new gxj0(1), 26)));
                        return s3q0.a;
                    }
                });
                dhr0.a.a(c2l0Var);
                return s3q0.a;
            case 1:
                ((dv1) this.c).d.b((String) this.d, (Throwable) obj);
                return s3q0.a;
            case 2:
                pt2 pt2Var = (pt2) this.c;
                Runnable runnable = (Runnable) this.d;
                pt2Var.X0(new x89.a((s89) obj, null, null, EmptyList.b));
                if (runnable != null) {
                    runnable.run();
                }
                return s3q0.a;
            case 3:
                rh3 rh3Var = (rh3) this.c;
                rh3Var.o.b(new zi3.g(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_delete_photos_error), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new cg1(i3, rh3Var, (Set) this.d), null, 32)));
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 4:
                Map map = (Map) this.c;
                azl azlVar = (azl) this.d;
                wgo wgoVar = (wgo) obj;
                for (Map.Entry entry : map.entrySet()) {
                    wgoVar.a(entry.getKey(), azlVar.I0(((pco) entry.getValue()).b));
                }
                return s3q0.a;
            case 5:
                final mm50 mm50Var = (mm50) this.c;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(mm50Var), new CatalogLegacyBlockImpl.a(1, ((CatalogLegacyBlockImpl) this.d).e, s2a.class, "map", "map(Lcom/vk/catalog/mvi/block/CatalogBlockState;)Lcom/vk/catalog/mvi/block/CatalogBlockViewState;", 0));
                g47Var.a(tci.k(mm50Var));
                g47Var.d(new xy() { // from class: xsna.j8a
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        mm50.this.b(new f8a.a((q1a) lj50Var));
                    }
                });
                return s3q0.a;
            case 6:
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                return com.vk.channels.impl.comments.g.a(gVar, com.vk.channels.impl.comments.b.s((com.vk.channels.impl.comments.b) this.c, (mwa.a) this.d, false, 3), null, gVar.c != null ? new g.b(g.b.a.C0535b.a) : null, false, 2);
            case 7:
                dpd dpdVar = (dpd) this.c;
                Throwable th2 = (Throwable) obj;
                int b = dpdVar.b((NewsComment) this.d);
                ListDataSet<cbg> listDataSet = dpdVar.a;
                if (b >= 0) {
                    listDataSet.c(b).d = Boolean.FALSE;
                    listDataSet.d(b);
                }
                if (th2 instanceof VKApiExecutionException) {
                    Context context2 = e43.a;
                    j03.i(context2 != null ? context2 : null, (VKApiExecutionException) th2);
                }
                return s3q0.a;
            case 8:
                us2 us2Var = (us2) this.c;
                izs izsVar = (izs) this.d;
                int intValue = ((Integer) obj).intValue();
                us2.d dVar = (us2.d) j5g.a0(us2Var.b(intValue, intValue));
                if (epx.f(dVar != null ? dVar.d : null, "rules")) {
                    izsVar.invoke(uje.d.b);
                }
                return s3q0.a;
            case 9:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) this.c;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d((wk50.a) this.d, false);
                aVar.c.b(kyh.a.o.a);
                return s3q0.a;
            case 10:
                ((ComposeView) this.c).setContentDescription(((k4i) ((k4i.a) this.d).m).g.d);
                qgi0.r((tgi0) obj, "COMMUNITY_TRUST_MARK_ITEM");
                return s3q0.a;
            case 11:
                ((com.vk.photos.ui.editalbum.domain.c) this.c).T(new e.g(new PrivacySettingData(((a.i) this.d).b, (String) obj)));
                return s3q0.a;
            case 12:
                n5p n5pVar = (n5p) this.c;
                n5p.a aVar2 = (n5p.a) this.d;
                gzs gzsVar = (gzs) obj;
                dnp0 dnp0Var = new dnp0();
                dnp0Var.c(new jta());
                dnp0Var.c(new wra());
                FrameLayout frameLayout = n5pVar.a;
                SetBuilder setBuilder = new SetBuilder();
                int childCount = frameLayout.getChildCount();
                while (i2 < childCount) {
                    setBuilder.add(frameLayout.getChildAt(i2));
                    i2++;
                }
                dnp0Var.c(new a5p(izi0.k(setBuilder.d(), frameLayout)));
                dnp0Var.c(new biq());
                dnp0Var.excludeChildren(R.id.layout_editor_workspace_overlay, true);
                dnp0Var.e(300L);
                dnp0Var.addListener(new imp0(new eg1(6, aVar2, gzsVar)));
                zmp0.a(n5pVar.b, dnp0Var);
                aVar2.a.invoke();
                return s3q0.a;
            case 13:
                drz.a aVar3 = (drz.a) this.c;
                com.vk.folders.impl.configure.d dVar2 = (com.vk.folders.impl.configure.d) this.d;
                ayr ayrVar = (ayr) obj;
                Set<Long> set = ayrVar.h;
                Set<Long> set2 = ayrVar.i;
                LinkedHashMap linkedHashMap = new LinkedHashMap(ayrVar.e);
                List<Dialog> k = ((xrm) aVar3.a).b.k();
                f1e0 f1e0Var = new f1e0();
                Iterator<T> it = k.iterator();
                while (it.hasNext()) {
                    ijm.b((Dialog) it.next(), f1e0Var);
                }
                SetBuilder h = f1e0Var.h();
                dVar2.l.a(h);
                List<Dialog> k2 = ((xrm) aVar3.a).b.k();
                jgp jgpVar = jgp.b;
                ArrayList arrayList = new ArrayList(c5g.u(h, 10));
                Iterator it2 = h.iterator();
                while (((MapBuilder.d) it2).hasNext()) {
                    arrayList.add(Long.valueOf(((Peer) ((MapBuilder.e) it2).next()).b));
                }
                linkedHashMap.putAll(com.vk.folders.impl.configure.d.w(k2, jgpVar, j5g.S0(arrayList), ayrVar.j));
                return ayr.a(ayrVar, d.a.a(linkedHashMap, ayrVar.f, ayrVar.i, ayrVar.h, ayrVar.a, Boolean.FALSE, null, ayrVar.d, com.vk.folders.impl.configure.b.a(dVar2.h), ayrVar.g, dVar2.m, dVar2.p), dVar2.s(ayrVar.d, ayrVar.c, com.vk.folders.impl.configure.d.u(linkedHashMap, ayrVar.f, set2, set), com.vk.folders.impl.configure.d.v(set, set2)), false, null, linkedHashMap, null, null, null, null, null, false, 16364);
            case 14:
                xls xlsVar = (xls) this.c;
                wls wlsVar = (wls) this.d;
                String str = xlsVar.b.b;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.HIDE, null), 3);
                iid0Var.f = c;
                iid0Var.g = b2;
                iid0Var.q();
                wlsVar.l.a(xlsVar.b);
                return s3q0.a;
            case 15:
                InteractivePollStickerView interactivePollStickerView = (InteractivePollStickerView) this.c;
                Poll poll = (Poll) this.d;
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar2 = interactivePollStickerView.l;
                cVar2.d.clear();
                UserId userId = poll.c;
                int i6 = poll.b;
                boolean z = poll.j;
                InteractivePollStickerView.b bVar = cVar2.a;
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar3 = cVar2.c;
                dVar3.b();
                dVar3.f(true);
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.f fVar = cVar2.b;
                kdn kdnVar = new kdn(cVar2, 13);
                z3i z3iVar = new z3i(cVar2, 22);
                fVar.a.b(rsg0.D0(new aub0(i6, userId, bVar.a, bVar.b, z)).subscribe(new hu50(new xld(fVar, kdnVar, z3iVar, i), 8), new wnt(new reo(1, z3iVar), 20)));
                return s3q0.a;
            case 16:
                su10 su10Var = (su10) this.c;
                Context context3 = (Context) this.d;
                int intValue2 = ((Integer) obj).intValue();
                su10Var.s = intValue2;
                VkMediaPicker vkMediaPicker = su10Var.r;
                if (vkMediaPicker != null) {
                    vkMediaPicker.setAlbums(new VkMediaPicker.a(new wow(su10Var.g), intValue2));
                }
                su10Var.g(context3);
                return s3q0.a;
            case 17:
                ((fb50) this.c).c.h((hyg0) obj, (ufb0) this.d);
                return s3q0.a;
            case 18:
                dlv dlvVar = (dlv) this.c;
                u1c0 u1c0Var = (u1c0) this.d;
                bs60 bs60Var = (bs60) dlvVar.b;
                Integer g = i7o0.g(bs60Var.s, new ebx(u1c0Var, 14));
                if (g != null) {
                    int intValue3 = g.intValue();
                    for (int i7 = intValue3 + 1; e43.h(bs60Var.s) >= i7; i7++) {
                        Object b0 = j5g.b0(i7, bs60Var.s);
                        z1c0 z1c0Var = b0 instanceof z1c0 ? (z1c0) b0 : null;
                        u1c0 u1c0Var2 = z1c0Var != null ? z1c0Var.h : null;
                        if (u1c0Var2 != null && epx.f(u1c0Var2.b, u1c0Var.b) && !bs60Var.k.contains(Integer.valueOf(u1c0Var2.c))) {
                        }
                        i2 = i7 - intValue3;
                    }
                    i2 = i7 - intValue3;
                }
                return Integer.valueOf(i2);
            case 19:
                Context context4 = (Context) this.c;
                Intent intent = (Intent) this.d;
                c.a aVar4 = com.vk.pushes.receivers.c.b;
                c.a.f(context4, intent, true);
                return s3q0.a;
            case 20:
                ((tgp0) obj).k((ur4) this.c, (Throwable) this.d);
                return s3q0.a;
            case 21:
                de80 de80Var = (de80) this.c;
                b33 b33Var = (b33) this.d;
                de80Var.o1 = true;
                defpackage.n0 n0Var = de80Var.n1;
                if (n0Var != null) {
                    n0Var.a.X0(ShowSlidesSheet$Response.Data.Action.REJECT, Integer.valueOf(de80Var.h1));
                }
                b33Var.dismiss();
                return s3q0.a;
            case 22:
                ((bp90) this.c).t.a(new mp90.b.a.c(((xo90.a.c) ((xo90.a) this.d)).a));
                return s3q0.a;
            case 23:
                m8a0 m8a0Var = (m8a0) this.c;
                z8a0 z8a0Var = (z8a0) this.d;
                Context context5 = z8a0Var.f;
                x8a0 x8a0Var = (x8a0) obj;
                int i8 = m8a0.v1;
                if (x8a0Var instanceof x8a0.a) {
                    m8a0Var.Qn(true);
                    m8a0Var.hide();
                    m8a0Var.i1 = true;
                } else if (x8a0Var instanceof x8a0.c) {
                    ((oga0) m8a0Var.t1.getValue()).f(m8a0Var.requireContext(), ((x8a0.c) x8a0Var).a.a());
                } else if (x8a0Var.equals(x8a0.d.a)) {
                    z8a0Var.i.p(false);
                } else if (x8a0Var.equals(x8a0.b.a)) {
                    int i9 = z8a0Var.k - 1;
                    z8a0Var.k = i9;
                    if (i9 == 0 && (cVar = z8a0Var.l) != null) {
                        qv20.b(cVar);
                    }
                } else if (x8a0Var.equals(x8a0.e.a)) {
                    if (z8a0Var.k == 0) {
                        com.vk.core.view.components.spinner.c e = qv20.e(context5, Integer.valueOf(R.string.rx_loading));
                        e.setCancelable(false);
                        e.show();
                        z8a0Var.l = e;
                    }
                    z8a0Var.k++;
                } else {
                    if (!(x8a0Var instanceof x8a0.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    android.app.Dialog dialog = m8a0Var.s;
                    x8a0.f fVar2 = (x8a0.f) x8a0Var;
                    if (dialog != null && (window = dialog.getWindow()) != null) {
                        fVar2.a.a(context5, z8a0Var.e).d(window);
                    }
                }
                return s3q0.a;
            case 24:
                return (List) ((wzs) this.c).invoke((o940) obj, ((Ref$ObjectRef) this.d).element);
            case 25:
                Recomposer recomposer = (Recomposer) this.c;
                Throwable th3 = (Throwable) this.d;
                Throwable th4 = (Throwable) obj;
                synchronized (recomposer.c) {
                    if (th3 != null) {
                        if (th4 != null) {
                            try {
                                Throwable th5 = th4 instanceof CancellationException ? null : th4;
                                if (th5 != null) {
                                    mnh0.d(th3, th5);
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        th = th3;
                    }
                    recomposer.e = th;
                    recomposer.u.setValue(Recomposer.State.ShutDown);
                }
                return s3q0.a;
            case 26:
                ((v0i0) this.c).p.invoke(((zp0.b.C4193b) this.d).d, UserProfileDialogs.ItemCallPlace.SECONDARY_HOLDER);
                return s3q0.a;
            case 27:
                dm0 dm0Var = (dm0) this.c;
                Context context6 = (Context) this.d;
                CheckLinkResponse checkLinkResponse = (CheckLinkResponse) obj;
                if (!checkLinkResponse.b || (actionLink = checkLinkResponse.d) == null) {
                    String str2 = checkLinkResponse.c;
                    if (str2 == null) {
                        str2 = context6.getString(R.string.error);
                    }
                    cvk.w(str2, false);
                } else {
                    dm0Var.b(actionLink);
                }
                return s3q0.a;
            case 28:
                List list2 = (List) this.c;
                izs izsVar2 = (izs) this.d;
                wow wowVar = new wow(list2);
                ((nvy) obj).e(list2.size(), new yvn0.c(new d230(15), wowVar), new yvn0.d(wowVar), new jai(802480018, new yvn0.e(wowVar, izsVar2), true));
                return s3q0.a;
            default:
                ((xfp0) this.c).V(egp0.a.C2808a.b, (MusicTrack) this.d);
                return s3q0.a;
        }
    }

    public /* synthetic */ tn0(kw70 kw70Var, ur4 ur4Var, Throwable th) {
        this.b = 20;
        this.c = ur4Var;
        this.d = th;
    }
}
