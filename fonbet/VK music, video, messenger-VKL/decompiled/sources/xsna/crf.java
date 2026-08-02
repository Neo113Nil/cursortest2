package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e3m;
import xsna.n9q0;
import xsna.osf;
import xsna.uuf;
import xsna.uyh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class crf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ crf(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj3;
                int i2 = ClipsWrapperFragment.Q0;
                uuf.f items = ((uuf.j) obj2).getItems();
                RectF o = zjq.o(((wuf) obj).getTopBar().getTitleRect());
                Rect rect = new Rect();
                o.roundOut(rect);
                List<wrf> items2 = items.getItems();
                int b = items.b();
                xuf xufVar = clipsWrapperFragment.G0;
                if (xufVar != null) {
                    osf osfVar = (osf) clipsWrapperFragment.m0.getValue();
                    VkTopBar topBar = xufVar.getTopBar();
                    osf.a aVar = new osf.a(new mrf(clipsWrapperFragment), topBar, items2, b, new nrf(clipsWrapperFragment), rect);
                    osfVar.getClass();
                    if (osfVar.a) {
                        Context context = topBar.getContext();
                        dhr0.a.getClass();
                        l7s l7sVar = new l7s(context, dhr0.u().c);
                        VkContextMenu vkContextMenu = osfVar.b;
                        e3m.a aVar2 = e3m.a;
                        int color = l7sVar.getColor(R.color.vk_sky_300);
                        topBar.getContext();
                        e.c cVar = new e.c(null, rect, topBar, color, 1);
                        cVar.e = l7sVar;
                        cVar.g = m33.a(R.drawable.vk_icon_check_circle_on_20, l7sVar);
                        cVar.k = true;
                        cVar.v = R.layout.actions_clips_popup_item;
                        cVar.n = 0;
                        cVar.h = Integer.valueOf(iah0.a(14));
                        int i3 = 8;
                        cVar.i = Integer.valueOf(iah0.a(8));
                        Iterator it = j5g.W0(items2).iterator();
                        while (true) {
                            ztw ztwVar = (ztw) it;
                            if (ztwVar.b.hasNext()) {
                                xtw xtwVar = (xtw) ztwVar.next();
                                wrf wrfVar = (wrf) xtwVar.b;
                                CharSequence a = wrfVar.b().a(l7sVar);
                                Integer d = wrfVar.d();
                                VkContextMenu.c.d(cVar, a.toString(), d != null ? m33.a(d.intValue(), l7sVar) : null, xtwVar.a == aVar.d, new ig1(i3, aVar, wrfVar), 24);
                                cVar.g(R.attr.vk_ui_icon_accent_themed);
                            } else {
                                if (vkContextMenu != null) {
                                    vkContextMenu.b();
                                }
                                osfVar.b = cVar.l(false);
                            }
                        }
                    }
                }
                break;
            case 1:
                ((izs) obj3).invoke(new lqx((String) obj2, ((uyh0.a.c) obj).b));
                break;
            case 2:
                w3c0 w3c0Var = (w3c0) obj3;
                w3c0Var.D.sa(new NewsfeedExternalAction.Navigation.u(w3c0Var.itemView.getContext(), (zjt) obj2, (NewsEntry) obj, w3c0Var.u, w3c0Var.v, MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick.EntryPoint.HEADER_MODAL_PHOTO));
                break;
            case 3:
                n9q0.a aVar3 = (n9q0.a) obj3;
                u6c0 u6c0Var = (u6c0) obj2;
                s6c0 s6c0Var = (s6c0) obj;
                if (aVar3 instanceof n9q0.a.b) {
                    ArrayList arrayList = u6c0Var.g;
                    StringBuilder sb = new StringBuilder();
                    n9q0.a.b bVar = (n9q0.a.b) aVar3;
                    sb.append(bVar.a);
                    sb.append(bVar.d);
                    sb.append('_');
                    sb.append(bVar.c);
                    arrayList.add(sb.toString());
                    if (arrayList.size() == s6c0Var.e) {
                        ((q9q0) u6c0Var.h.getValue()).a();
                        Uri parse = Uri.parse(u6c0Var.d);
                        String queryParameter = parse.getQueryParameter("attachments");
                        ArrayList u0 = j5g.u0(arrayList, queryParameter != null ? drm0.c0(queryParameter, new String[]{StringUtils.COMMA}, 0, 6) : EmptyList.b);
                        Uri.Builder builder = new Uri.Builder();
                        for (String str : parse.getQueryParameterNames()) {
                            if (epx.f(str, "attachments") || epx.f(str, "upload_attachments")) {
                                builder.appendQueryParameter("attachments", j5g.g0(u0, StringUtils.COMMA, null, null, 0, null, 62));
                            } else {
                                builder.appendQueryParameter(str, parse.getQueryParameter(str));
                            }
                        }
                        u6c0Var.d = builder.build().toString();
                        com.vk.movika.sdk.base.ui.p pVar = new com.vk.movika.sdk.base.ui.p(16, u6c0Var, s6c0Var);
                        u6c0Var.f = pVar;
                        pVar.invoke();
                    }
                } else {
                    u6c0Var.getClass();
                    u6c0.a(u6c0Var, 3);
                    u6c0Var.g.clear();
                    ((q9q0) u6c0Var.h.getValue()).a();
                }
                break;
            case 4:
                izs izsVar = (izs) obj2;
                gzs gzsVar = (gzs) obj;
                Fragment w0 = ((iok0) obj3).w0();
                if (w0 != null) {
                    izsVar.invoke(w0);
                } else {
                    gzsVar.invoke();
                    xgx0.a.getClass();
                    xgx0.g("can't route on empty fragment!");
                }
                break;
            default:
                s2x0 s2x0Var = (s2x0) obj3;
                View view = (View) obj2;
                s2x0Var.getClass();
                bwt0.j(view, new jbo(s2x0Var, view, (String) obj, 7));
                break;
        }
        return s3q0.a;
    }
}
