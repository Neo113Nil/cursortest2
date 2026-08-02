package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.a;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.dto.common.Source;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.group.Group;
import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.notifications.core.item.NotificationImage;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter;
import com.vk.search.communities.map.api.router.SearchMapPreviewStateWrapper;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVhOld;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipAlreadyAttachedDialogState;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import kotlin.NoWhenBranchMatchedException;
import xsna.e8v0;
import xsna.g6n0;
import xsna.gv20;
import xsna.h2s0;
import xsna.t44;
import xsna.tfp0;
import xsna.v8v;
import xsna.w8v;
import xsna.zlh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hc1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hc1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        m6a m6aVar;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.catalog2.common.ui.mvp.holder.video.assistant.a aVar = (com.vk.catalog2.common.ui.mvp.holder.video.assistant.a) obj2;
                AiAssistantCardVh aiAssistantCardVh = (AiAssistantCardVh) obj;
                if (aVar instanceof a.f) {
                    ((a.f) aVar).getClass();
                    aiAssistantCardVh.b();
                } else if (aVar instanceof a.g) {
                    ((a.g) aVar).getClass();
                    aiAssistantCardVh.getClass();
                } else if (aVar instanceof a.b) {
                    aiAssistantCardVh.getClass();
                } else if (epx.f(aVar, a.C0511a.a)) {
                    aiAssistantCardVh.getClass();
                } else if (epx.f(aVar, a.c.a)) {
                    aiAssistantCardVh.b();
                } else {
                    if (aVar instanceof a.d) {
                        aiAssistantCardVh.getClass();
                        ((a.d) aVar).getClass();
                        throw null;
                    }
                    if (!(aVar instanceof a.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((a.e) aVar).getClass();
                }
                return s3q0.a;
            case 1:
                gzs gzsVar = (gzs) obj;
                ((vtu) obj2).a(0);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 2:
                ((izs) obj2).invoke(new a.h((BookingServicesScreenState.ServiceWrapper) obj));
                return s3q0.a;
            case 3:
                lca lcaVar = (lca) obj2;
                lcaVar.getClass();
                int layoutPosition = ((tca) obj).getLayoutPosition();
                RecyclerView.o layoutManager = lcaVar.d.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.v()) : null;
                if (valueOf != null && layoutPosition == valueOf.intValue()) {
                    int i2 = layoutPosition - 1;
                    lcaVar.d.scrollToPosition(i2 >= 0 ? i2 : 0);
                }
                return s3q0.a;
            case 4:
                return ((wgb) obj2).s + ": loadNextFromNetwork: load fetched from cache since=" + ((aeb) obj);
            case 5:
                DialogMember dialogMember = (DialogMember) obj;
                tsu tsuVar = ((azb) obj2).k;
                if (tsuVar != null) {
                    xyb xybVar = (xyb) tsuVar.b;
                    if (xybVar.q.f) {
                        xybVar.x.a(dialogMember);
                    }
                }
                return s3q0.a;
            case 6:
                Context context = (Context) obj2;
                hfd hfdVar = new hfd(context);
                hfdVar.setId(R.id.clips_fullscreen_main_overlay_seekbar_preview);
                hfdVar.setPreviewControllerFactory(new gcd(context, (dcd) obj));
                return hfdVar;
            case 7:
                n2k0 n2k0Var = (n2k0) obj;
                izs<? super n2k0, s3q0> izsVar = ((l1g) obj2).d;
                if (izsVar != null) {
                    izsVar.invoke(n2k0Var);
                }
                return s3q0.a;
            case 8:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_dialogs_list_time_dd_MM), ((vlm) obj).f);
            case 9:
                gv20.b bVar = (gv20.b) obj2;
                tvn tvnVar = (tvn) obj;
                StringBuilder sb = new StringBuilder();
                String str = bVar.d;
                sb.append(str);
                sb.append(" · ");
                String str2 = bVar.e;
                sb.append(str2);
                String sb2 = sb.toString();
                bpn0 bpn0Var = tvnVar.s;
                int i3 = tvnVar.p;
                ojo0 ojo0Var = (ojo0) bpn0Var.getValue();
                int i4 = tvnVar.q;
                TextView textView = tvnVar.o;
                float width = textView.getWidth();
                TextPaint paint = textView.getPaint();
                ojo0Var.getClass();
                if (paint.measureText(sb2) > width) {
                    int length = sb2.length();
                    if (1 <= length) {
                        int i5 = 1;
                        int i6 = 0;
                        while (true) {
                            if (paint.measureText(sb2.substring(r1, i5)) >= width) {
                                i6++;
                                r1 = i5 - 1;
                            }
                            if (i5 == sb2.length()) {
                                i6++;
                            }
                            if (i5 != length) {
                                i5++;
                            } else {
                                r1 = i6;
                            }
                        }
                    }
                    if (i4 < r1) {
                        SpannableStringBuilder W5 = tvnVar.W5(str, str2, "\n");
                        textView.setLines(i3);
                        textView.setMaxLines(i3);
                        textView.setText(W5);
                        return s3q0.a;
                    }
                }
                SpannableStringBuilder W52 = tvnVar.W5(str, str2, " · ");
                textView.setLines(i4);
                textView.setMaxLines(i4);
                textView.setText(W52);
                return s3q0.a;
            case 10:
                cpo0 cpo0Var = (cpo0) obj;
                String str3 = ((RestrictionButton) obj2).d;
                if (str3 != null) {
                    cpo0Var.invoke(str3);
                }
                return s3q0.a;
            case 11:
                htp htpVar = (htp) obj2;
                bwt0.p0(htpVar.w, !((atp) obj).e);
                htpVar.A = true;
                return s3q0.a;
            case 12:
                GlobalSearchGroupsCatalogRootVhOld globalSearchGroupsCatalogRootVhOld = (GlobalSearchGroupsCatalogRootVhOld) obj2;
                xyh0 xyh0Var = (xyh0) obj;
                SearchCommunitiesOnMapRouter searchCommunitiesOnMapRouter = (SearchCommunitiesOnMapRouter) globalSearchGroupsCatalogRootVhOld.G.getValue();
                Activity activity = globalSearchGroupsCatalogRootVhOld.b;
                String str4 = globalSearchGroupsCatalogRootVhOld.H.e;
                String str5 = str4 == null ? "" : str4;
                SearchMapPreviewStateWrapper searchMapPreviewStateWrapper = new SearchMapPreviewStateWrapper(xyh0Var.b);
                SearchCommunitiesOnMapRouter.MapEntrypoint mapEntrypoint = SearchCommunitiesOnMapRouter.MapEntrypoint.GlobalSearch;
                String V = globalSearchGroupsCatalogRootVhOld.I.V();
                searchCommunitiesOnMapRouter.a(activity, str5, searchMapPreviewStateWrapper, mapEntrypoint, V == null ? "" : V);
                return s3q0.a;
            case 13:
                GroupCellVh groupCellVh = (GroupCellVh) obj2;
                GroupSubscriptionState groupSubscriptionState = (GroupSubscriptionState) obj;
                Group group = groupCellVh.p;
                if (group != null) {
                    groupCellVh.a(groupSubscriptionState, group);
                }
                return s3q0.a;
            case 14:
                com.vk.im.ui.components.theme_chooser.b bVar2 = (com.vk.im.ui.components.theme_chooser.b) obj2;
                ImSettingsDialogThemeFragment imSettingsDialogThemeFragment = (ImSettingsDialogThemeFragment) obj;
                int i7 = ImSettingsDialogThemeFragment.c0;
                if (bVar2.Z0().a != ThemeChooserState.ListKind.THEME) {
                    bVar2.b1(new acc0(15));
                } else {
                    imSettingsDialogThemeFragment.finish();
                }
                return s3q0.a;
            case 15:
                w920 w920Var = (w920) obj2;
                x8v x8vVar = (x8v) obj;
                gj30 b = w920Var.b.b(new wj30(x8vVar.a, x8vVar.b), Math.min(x8vVar.c, 200));
                gj30 c = w920Var.c();
                c.getClass();
                gj30 gj30Var = new gj30(c);
                w920Var.g(b, Source.NETWORK);
                gj30 c2 = w920Var.c();
                c2.getClass();
                return new v8v.a(new w8v.h(gj30Var, new gj30(c2)));
            case 16:
                ct60 ct60Var = (ct60) obj;
                return new d070((at60) obj2, ct60Var.b, ct60Var.g, ct60Var.f, (ts60) ct60Var.c.W.getValue());
            case 17:
                izs izsVar2 = (izs) obj2;
                snv snvVar = (snv) obj;
                if (!jjc.d().a()) {
                    izsVar2.invoke(snvVar);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 18:
                NotificationImage notificationImage = (NotificationImage) obj2;
                izs izsVar3 = (izs) obj;
                if (!jjc.d().a()) {
                    snv snvVar2 = notificationImage.b;
                    if (snvVar2 != null) {
                        izsVar3.invoke(snvVar2);
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return s3q0.a;
            case 19:
                wh50 wh50Var = (wh50) obj;
                VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) ((wh50) obj2).getValue();
                if (vkOnboardingHighlighter != null) {
                    VkOnboardingHighlighter.e(vkOnboardingHighlighter, false, 5000L, false, null, 12);
                }
                wh50Var.setValue(Boolean.TRUE);
                return s3q0.a;
            case 20:
                gpd0 gpd0Var = (gpd0) obj;
                ((izs) obj2).invoke(new OrderAction.c(gpd0Var.d, gpd0Var.e));
                return s3q0.a;
            case 21:
                int i8 = PollVotersFragment.a0;
                myc0.h((yvj) obj2, null, null, new PollVotersFragment.c((mc90) obj, null), 3);
                return s3q0.a;
            case 22:
                ((izs) obj2).invoke(new t44.d.a(((ClipAlreadyAttachedDialogState) obj).b));
                return s3q0.a;
            case 23:
                ((izs) obj2).invoke(new zlh0.d(((g6n0.a) obj).a));
                return s3q0.a;
            case 24:
                ((epi) obj2).b(new dpi((UIBlockPlaceholder) obj));
                return s3q0.a;
            case 25:
                cl40.a(((vfp0) obj2).c(), MusicHapticEvent.LIGHT);
                ((izs) obj).invoke(tfp0.b.s.b);
                return s3q0.a;
            case 26:
                h2s0.a aVar2 = (h2s0.a) obj2;
                h2s0 h2s0Var = (h2s0) obj;
                HistoryAttach historyAttach = aVar2.m;
                if (historyAttach != null && (m6aVar = h2s0Var.a) != null) {
                    m6aVar.a(aVar2.l, historyAttach);
                }
                return s3q0.a;
            default:
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) obj2;
                gzs gzsVar2 = (gzs) obj;
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.b.b);
                }
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
        }
    }
}
