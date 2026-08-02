package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbYclientsStoryStickerClickItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.api.styles.ServiceStickerStyle;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.hg1;

/* compiled from: StoryServiceItemDelegate.kt */
/* loaded from: classes16.dex */
public final class ddm0 extends wyl0 {
    public final Activity f;
    public final u76 g;
    public final v3l0 h;
    public StoryServiceItemInfo i;
    public boolean j;
    public final Object k;
    public final Object l;

    public ddm0(Activity activity, StickersDrawingViewGroup stickersDrawingViewGroup, u76 u76Var, b96 b96Var, v3l0 v3l0Var) {
        super(stickersDrawingViewGroup, b96Var);
        this.f = activity;
        this.g = u76Var;
        this.h = v3l0Var;
        cck0 cck0Var = new cck0(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, cck0Var);
        Lazy a = msy.a(lazyThreadSafetyMode, new dck0(this, 4));
        this.l = a;
        u76Var.a(new io.reactivex.rxjava3.internal.operators.observable.i0(((fy00) a.getValue()).a(), new hg1.w3()).U(new hg1.v3()).subscribe(new f5y(new qhg0(this, 9), 25)));
    }

    @Override // xsna.wyl0
    public final tyl0 f() {
        bdm0 bdm0Var = new bdm0(this.b.getContext(), this, this.h, this.i);
        bdm0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.cdm0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                b96.c(ddm0.this.c);
            }
        });
        return bdm0Var;
    }

    public final jdm0 i() {
        Object obj;
        nov novVar = this.e;
        jdm0 jdm0Var = novVar instanceof jdm0 ? (jdm0) novVar : null;
        if (jdm0Var != null) {
            return jdm0Var;
        }
        Iterator<T> it = this.b.getCurrentStickers().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((nov) obj) instanceof jdm0) {
                break;
            }
        }
        jdm0 jdm0Var2 = obj instanceof jdm0 ? (jdm0) obj : null;
        if (jdm0Var2 == null) {
            return null;
        }
        return jdm0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void j(edm0 edm0Var) {
        this.e = edm0Var;
        if (edm0Var != null) {
            h(edm0Var);
            return;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, null, null, null, null, 62, null);
        u76 u76Var = this.g;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeSmbYclientsStoryStickerClickItem(Long.valueOf(fkq0.e(u76Var.k3().e).b)), 63), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
        ((cp80) this.k.getValue()).b(this.f, u76Var.k3().e);
    }

    public final void k(StoryServiceItemInfo storyServiceItemInfo, ServiceStickerStyle serviceStickerStyle) {
        jdm0 i = i();
        u76 u76Var = this.g;
        StickersDrawingViewGroup stickersDrawingViewGroup = this.b;
        if (i == null) {
            Context context = stickersDrawingViewGroup.getContext();
            if (serviceStickerStyle == null) {
                serviceStickerStyle = ServiceStickerStyle.Sticker;
            }
            stickersDrawingViewGroup.f(new edm0(context, storyServiceItemInfo, serviceStickerStyle));
            u76Var.o5().e();
            return;
        }
        i.setInfo(storyServiceItemInfo);
        if (serviceStickerStyle != null) {
            edm0 edm0Var = i instanceof edm0 ? (edm0) i : null;
            if (edm0Var != null) {
                edm0Var.setStyle(serviceStickerStyle);
            }
        }
        stickersDrawingViewGroup.invalidate();
        u76Var.p4(i);
        u76Var.o5().i(StoryEditorEvents.EDIT_STICKER);
    }
}
