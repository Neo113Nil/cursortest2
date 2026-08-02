package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.emoji.FastScroller;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: StickersKeyboardView.kt */
/* loaded from: classes6.dex */
public final class sal0 extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public StickersRecyclerView b;
    public com.vk.stickers.keyboard.page.a c;
    public c5l0 d;
    public Window e;
    public FastScroller f;
    public y4l0 g;
    public az1 h;

    /* compiled from: StickersKeyboardView.kt */
    public static final class b extends androidx.recyclerview.widget.v {
        public final boolean a;

        public b(Context context, boolean z) {
            super(context);
            this.a = z;
        }

        @Override // androidx.recyclerview.widget.v
        public final int calculateDyToMakeVisible(View view, int i) {
            return super.calculateDyToMakeVisible(view, i) - (iah0.a(46) - (this.a ? h9l0.i / 2 : 0));
        }

        @Override // androidx.recyclerview.widget.v
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return super.calculateSpeedPerPixel(displayMetrics) * 0.6f;
        }

        @Override // androidx.recyclerview.widget.v
        public final int getVerticalSnapPreference() {
            return -1;
        }
    }

    public final void a() {
        StickersRecyclerView stickersRecyclerView = this.b;
        stickersRecyclerView.getClass();
        if (g2v.d().b().a()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (stickersRecyclerView.isAttachedToWindow()) {
                stickersRecyclerView.f();
            } else {
                stickersRecyclerView.getViewTreeObserver().addOnPreDrawListener(new ecl0(stickersRecyclerView));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i2) {
        int O0;
        com.vk.stickers.keyboard.page.a aVar = this.c;
        StickersRecyclerView stickersRecyclerView = this.b;
        if (i2 != -1) {
            stickersRecyclerView.p = true;
        }
        if (stickersRecyclerView.p) {
            stickersRecyclerView.g();
        }
        RecyclerView.o layoutManager = stickersRecyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        List<? extends hfz> list = aVar.h;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((hfz) it.next()) instanceof hhy) {
                    O0 = (i2 == -3 || (i2 == -1 && aVar.p <= 0)) ? 0 : i2 == -1 ? aVar.O0(-1) : aVar.O0(i2);
                    if (gridLayoutManager == null) {
                        gridLayoutManager.K(O0, 1);
                        return;
                    }
                    return;
                }
            }
        }
        O0 = aVar.O0(i2);
        if (gridLayoutManager == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        this.d.a(false);
    }

    public final az1 getAnchorViewProvider() {
        return this.h;
    }

    public final FastScroller getFastScroller() {
        return this.f;
    }

    public final void setAnchorViewProvider(az1 az1Var) {
        this.h = az1Var;
    }

    public final void setAttachWindow(Window window) {
        this.e = window;
    }

    public final void setContextUser(ContextUser contextUser) {
        com.vk.stickers.keyboard.page.a aVar = this.c;
        aVar.q = contextUser;
        int i2 = 0;
        for (Object obj : aVar.h) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (((hfz) obj) instanceof sfy) {
                aVar.notifyItemChanged(i2);
            }
            i2 = i3;
        }
        this.d.b.setContextUser(contextUser);
    }

    public final void setCurrentUser(gzs<UserId> gzsVar) {
        this.c.t = gzsVar;
    }

    public final void setData(tgy tgyVar) {
        com.vk.stickers.keyboard.page.a aVar = this.c;
        so40 so40Var = aVar.r;
        Context context = aVar.i;
        List<ewp0> list = tgyVar.c;
        List<StickerStockItem> list2 = tgyVar.a;
        List<StickerItem> list3 = tgyVar.d;
        aVar.clear();
        ArrayList arrayList = new ArrayList();
        List<StickerItem> list4 = tgyVar.e;
        if (!list4.isEmpty()) {
            arrayList.add(new sfy(context.getString(R.string.stickers_keyboard_favorites), -3, null, null, null, 60));
            Iterator<StickerItem> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar.L0(it.next(), -3, null, "favourite"));
            }
            aVar.p = arrayList.size();
        }
        if (!list3.isEmpty()) {
            arrayList.add(new sfy(context.getString(R.string.stickers_keyboard_recently_used), -1, null, null, null, 60));
            hhy N0 = com.vk.stickers.keyboard.page.a.N0();
            if (N0 != null) {
                vv20 vv20Var = aVar.s;
                if (vv20Var != null) {
                    vv20Var.invoke();
                }
                arrayList.add(N0);
            }
            Iterator<StickerItem> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(aVar.L0(it2.next(), -1, null, "recent"));
            }
            aVar.o = arrayList.size() - aVar.p;
        }
        vbf0 vbf0Var = tgyVar.h;
        if (vbf0Var != null && vbf0Var.b == -1) {
            aVar.Q0(vbf0Var.a, arrayList, list2);
        }
        if (!list.isEmpty()) {
            UGCChatSettingsModel uGCChatSettingsModel = tgyVar.g;
            for (ewp0 ewp0Var : list) {
                arrayList.add(new yfy(ewp0Var, uGCChatSettingsModel.g, so40Var));
                Iterator<UGCStickerModel> it3 = ewp0Var.c.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new lhy(it3.next()));
                }
            }
        }
        for (StickerStockItem stickerStockItem : tgyVar.b) {
            if (stickerStockItem.k) {
                String string = context.getString(R.string.stickers_keyboard_vmoji);
                int i2 = stickerStockItem.b;
                t6g0 t6g0Var = t6g0.b;
                so40 so40Var2 = so40Var;
                so40Var = so40Var2;
                arrayList.add(new agy(string, i2, stickerStockItem, t6g0.d().s0(), t6g0.d().y(), so40Var2));
                Iterator<StickerItem> it4 = stickerStockItem.g.iterator();
                while (it4.hasNext()) {
                    arrayList.add(aVar.L0(it4.next(), stickerStockItem.b, stickerStockItem, "keyboard"));
                }
            }
        }
        for (StickerStockItem stickerStockItem2 : list2) {
            boolean z = stickerStockItem2.Q;
            String str = stickerStockItem2.B;
            int i3 = stickerStockItem2.b;
            if (!z) {
                arrayList.add(new sfy(stickerStockItem2.d, i3, stickerStockItem2, so40Var, aVar.t, 8));
                if (str != null && str.length() > 0 && (stickerStockItem2.k || stickerStockItem2.l)) {
                    arrayList.add(new qgy(str, i3));
                }
                Iterator<StickerItem> it5 = stickerStockItem2.g.iterator();
                while (it5.hasNext()) {
                    arrayList.add(aVar.L0(it5.next(), i3, stickerStockItem2, "keyboard"));
                }
                if (vbf0Var != null && vbf0Var.b == i3) {
                    aVar.Q0(vbf0Var.a, arrayList, list2);
                }
            }
        }
        aVar.setItems(arrayList);
        aVar.R0();
        setContextUser(tgyVar.f);
    }

    public final void setKeyboardListener(y4l0 y4l0Var) {
        this.b.setKeyboardListener(y4l0Var);
        this.c.m = y4l0Var;
        this.g = y4l0Var;
    }

    public final void setScrollListener(RecyclerView.t tVar) {
        this.b.setScrollListener(tVar);
    }

    /* compiled from: StickersKeyboardView.kt */
    public final class a implements LongtapRecyclerView.a {
        public final StickersRecyclerView a;
        public final com.vk.stickers.keyboard.page.a b;
        public final c5l0 c;

        public a(StickersRecyclerView stickersRecyclerView, com.vk.stickers.keyboard.page.a aVar, c5l0 c5l0Var) {
            this.a = stickersRecyclerView;
            this.b = aVar;
            this.c = c5l0Var;
        }

        @Override // com.vk.stickers.views.LongtapRecyclerView.a
        public final void a() {
            this.c.getClass();
        }

        @Override // com.vk.stickers.views.LongtapRecyclerView.a
        public final void c(View view) {
            ArrayList arrayList;
            int i;
            View b;
            int childAdapterPosition = this.a.getChildAdapterPosition(view);
            com.vk.stickers.keyboard.page.a aVar = this.b;
            List<? extends hfz> list = aVar.h;
            int i2 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((hfz) it.next()) instanceof hhy) {
                        i2 = 1;
                        break;
                    }
                }
            }
            int i3 = childAdapterPosition + i2;
            if (i3 == -1 || (arrayList = aVar.u) == null || (i = aVar.v.get(i3, -1)) == -1) {
                return;
            }
            zal0 a = g2v.d().a();
            sal0 sal0Var = sal0.this;
            Window window = sal0Var.e;
            if (window == null || (b = window.getDecorView()) == null) {
                az1 anchorViewProvider = sal0Var.getAnchorViewProvider();
                b = anchorViewProvider != null ? anchorViewProvider.b() : null;
            }
            a.y(this.c, arrayList, i, b);
        }

        @Override // com.vk.stickers.views.LongtapRecyclerView.a
        public final void b() {
        }
    }
}
