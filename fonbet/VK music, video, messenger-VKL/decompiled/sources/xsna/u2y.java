package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dcl0;
import xsna.dw20;
import xsna.gbf0;
import xsna.tzp0;
import xsna.utj;
import xsna.uxm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class u2y implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u2y(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        FrameLayout frameLayout;
        int i = this.b;
        int i2 = 4;
        int i3 = 12;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                ((w2y) obj4).a.z(JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, (Throwable) obj);
                ((ifu0) obj3).dismiss();
                utj.a aVar = new utj.a(activity);
                aVar.g(R.drawable.vk_icon_error_circle_outline_28);
                aVar.l = Integer.valueOf(e3m.f(R.attr.vk_ui_background_negative, activity));
                aVar.n = activity.getString(R.string.vk_confirmation_dialog_something_went_wrong);
                aVar.m();
                break;
            case 1:
                xaf0 xaf0Var = (xaf0) obj4;
                StickerPackRecommendationBlock stickerPackRecommendationBlock = (StickerPackRecommendationBlock) obj3;
                StickerStockItem stickerStockItem = (StickerStockItem) obj2;
                rdf0 rdf0Var = xaf0Var.c;
                final gbf0 gbf0Var = new gbf0(rdf0Var, new cy0(26, xaf0Var, stickerStockItem), xaf0Var.e, xaf0Var.b, xaf0Var.f, "pack_recommendations_all_".concat(stickerPackRecommendationBlock.c));
                final Context context = xaf0Var.d.getContext();
                Boolean bool = stickerStockItem.S;
                String str = stickerPackRecommendationBlock.b;
                gbf0Var.g = str;
                RecyclerPaginatedView recyclerPaginatedView = new RecyclerPaginatedView(context);
                AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
                dVar.f = 1;
                dVar.a();
                recyclerPaginatedView.getRecyclerView().setScrollBarStyle(33554432);
                recyclerPaginatedView.setSwipeRefreshEnabled(false);
                gbf0.a aVar2 = gbf0Var.h;
                recyclerPaginatedView.setAdapter(aVar2);
                RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
                dcl0<hfz> dcl0Var = new dcl0<>(recyclerView, on00.f(new Pair(ndf0.class, new dcl0.a(new wxm(recyclerView, gbf0Var)))), aVar2);
                recyclerView.addOnScrollListener(dcl0Var);
                recyclerView.addOnAttachStateChangeListener(new ibf0(recyclerView, recyclerView, dcl0Var));
                gbf0Var.k = dcl0Var;
                recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new hbf0(recyclerView, gbf0Var));
                int i4 = 20;
                if (epx.f(stickerPackRecommendationBlock.c, "author_packs")) {
                    bd5 bd5Var = new bd5(context);
                    bd5Var.c = new f550(gbf0Var, i4);
                    gbf0Var.i = bd5Var;
                    if (epx.f(bool, Boolean.TRUE)) {
                        bd5 bd5Var2 = gbf0Var.i;
                        if (bd5Var2 == null) {
                            bd5Var2 = null;
                        }
                        bd5Var2.b.setText(context.getString(R.string.stickers_unsubscribe_author));
                        bd5 bd5Var3 = gbf0Var.i;
                        if (bd5Var3 == null) {
                            bd5Var3 = null;
                        }
                        bd5Var3.b.a5(true, Integer.valueOf(R.drawable.vk_icon_notification_check_outline_28));
                    } else {
                        bd5 bd5Var4 = gbf0Var.i;
                        if (bd5Var4 == null) {
                            bd5Var4 = null;
                        }
                        bd5Var4.b.setText(context.getString(R.string.stickers_subscribe_author));
                        bd5 bd5Var5 = gbf0Var.i;
                        if (bd5Var5 == null) {
                            bd5Var5 = null;
                        }
                        bd5Var5.b.a5(true, Integer.valueOf(R.drawable.vk_icon_notification_add_outline_28));
                    }
                    frameLayout = new FrameLayout(context);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.bottomMargin = cn70.b(68);
                    recyclerPaginatedView.setLayoutParams(layoutParams);
                    frameLayout.addView(recyclerPaginatedView);
                    bd5 bd5Var6 = gbf0Var.i;
                    if (bd5Var6 == null) {
                        bd5Var6 = null;
                    }
                    frameLayout.addView(bd5Var6);
                } else {
                    frameLayout = recyclerPaginatedView;
                }
                c.h hVar = new c.h(gbf0Var);
                hVar.i = 20;
                hVar.l = false;
                hVar.m = false;
                hVar.k = stickerPackRecommendationBlock.f;
                com.vk.lists.c a = com.vk.lists.f.a(hVar, recyclerPaginatedView);
                gbf0Var.f = ((dw20.b) ((dw20.b) new dw20.b(context, new tzp0.c.a(gbf0Var, false)).w0(stickerPackRecommendationBlock.d).D0(frameLayout, false)).l(dhr0.t.c(R.attr.vk_ui_background_content)).G0()).c(new a470()).Z(new DialogInterface.OnDismissListener() { // from class: xsna.fbf0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object obj5 = context;
                        boolean z = obj5 instanceof ey50;
                        gbf0 gbf0Var2 = gbf0.this;
                        if (z) {
                            ((ey50) obj5).Y().H(gbf0Var2);
                        }
                        gbf0Var2.j.dispose();
                    }
                }).I0("recommendations_list_" + gbf0Var.g);
                if (context instanceof ey50) {
                    ((ey50) context).Y().S(gbf0Var);
                }
                cbf0 a2 = rdf0Var.a(str);
                if (a2 == null) {
                    a.p(false);
                } else {
                    aVar2.J0(a2);
                    recyclerPaginatedView.f0();
                }
                hg1.a(y9l0.a.subscribe(new qg60(new erh(a, gbf0Var, context, i2), 12)), gbf0Var.f);
                break;
            case 2:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj4;
                View view = (View) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj2;
                String str2 = (String) obj;
                VkContextMenu vkContextMenu = toolbarRedesignVh.u;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                eda edaVar = toolbarRedesignVh.g;
                if (edaVar != null) {
                    Context context2 = view.getContext();
                    String str3 = uIBlockList.b;
                    bpn0 bpn0Var = cqm0.a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    edaVar.e(context2, str3, str2, toolbarRedesignVh);
                }
                break;
            case 3:
                ioq0 ioq0Var = (ioq0) obj4;
                Context context3 = ioq0Var.b;
                View view2 = (View) obj3;
                ImageList imageList = (ImageList) obj2;
                Throwable th = (Throwable) obj;
                if (sp.m(th)) {
                    ImageViewer imageViewer = ioq0Var.h;
                    List singletonList = Collections.singletonList(rwv.c(imageList));
                    bpn0 bpn0Var2 = enj.a;
                    ImageViewer.b(imageViewer, 0, singletonList, e3m.h(context3), new joq0(view2), false, null, 496);
                } else if (th instanceof UserProfileAvatarsInteractor.NoAvatarsException) {
                    edw edwVar = edw.a;
                    edw.g(R.string.vkim_chat_profile_no_photos, context3);
                } else {
                    zk70.e(th);
                }
                break;
            default:
                mov0 mov0Var = (mov0) obj4;
                JsApiMethodType jsApiMethodType = (JsApiMethodType) obj3;
                WebApiApplication webApiApplication = (WebApiApplication) obj2;
                uxm0 uxm0Var = (uxm0) obj;
                if (uxm0Var instanceof uxm0.a) {
                    int i5 = ((uxm0.a) uxm0Var).a;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    io.reactivex.rxjava3.disposables.b bVar = mov0Var.b;
                    io.reactivex.rxjava3.internal.operators.maybe.x k = zq70.D(new pw80(new d630(webApiApplication, i5, 2)), 200L).k(io.reactivex.rxjava3.android.schedulers.a.b());
                    k5j0 k5j0Var = new k5j0(new mcj0(ref$ObjectRef, 27), 21);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.maybe.b0(k, k5j0Var, lVar, lVar, kVar, kVar).subscribe(new onm0(new sc5(ref$ObjectRef, mov0Var, jsApiMethodType, 8), i3), new jgs0(new edd(ref$ObjectRef, mov0Var, jsApiMethodType, 6), i2)));
                } else {
                    mov0Var.c.m(jsApiMethodType, VkAppsErrors.Client.UNKNOWN_ERROR, null, null);
                }
                break;
        }
        return s3q0.a;
    }
}
