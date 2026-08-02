package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.emoji.FastScroller;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.dcl0;
import xsna.sal0.a;

/* compiled from: StickersKeyboardPage.kt */
/* loaded from: classes6.dex */
public final class ral0 implements wdl0 {
    public final Window a;
    public final kr50 b;
    public sal0 c;
    public ArrayList d;
    public List<StickerStockItem> e;
    public List<ewp0> f;
    public List<StickerItem> g;
    public List<StickerItem> h;
    public vbf0 i;
    public ContextUser j;
    public UGCChatSettingsModel k;
    public com.vk.stickers.keyboard.d m;
    public RecyclerView.t n;
    public az1 o;
    public boolean p;
    public ObjectAnimator q;
    public gzs<UserId> l = qal0.b;
    public int r = -3;

    /* compiled from: StickersKeyboardPage.kt */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ral0.this.q = null;
        }
    }

    public ral0(Window window, kr50 kr50Var) {
        this.a = window;
        this.b = kr50Var;
    }

    @Override // xsna.wdl0
    public final View a(Context context) {
        sal0 sal0Var = this.c;
        if (sal0Var != null) {
            return sal0Var;
        }
        sal0 sal0Var2 = new sal0(context, null, 0);
        t6g0 t6g0Var = t6g0.b;
        kcl0 d = t6g0.d();
        if (context instanceof l7s) {
            sal0Var2.setBackgroundColor(e3m.f(R.attr.vk_ui_write_bar_input_border, context));
        } else {
            dhr0.a.e0(R.attr.vk_ui_write_bar_input_border, sal0Var2);
        }
        LayoutInflater.from(context).inflate(R.layout.stickers_keyboard_view, sal0Var2);
        c5l0 c5l0Var = new c5l0(context, new jod(d));
        sal0Var2.d = c5l0Var;
        c5l0Var.b.setMenuListener(new nt8(sal0Var2));
        StickersRecyclerView stickersRecyclerView = (StickersRecyclerView) sal0Var2.findViewById(R.id.rv_stickers);
        sal0Var2.b = stickersRecyclerView;
        FastScroller fastScroller = (FastScroller) sal0Var2.findViewById(R.id.fast_scroller);
        sal0Var2.f = fastScroller;
        int i = 0;
        com.vk.stickers.keyboard.page.a aVar = new com.vk.stickers.keyboard.page.a(context, d.K0(), new e27(0, sal0Var2, sal0.class, "onHintClicked", "onHintClicked()V", i, 1), new u0d(0, sal0Var2, sal0.class, "hideVmojiPromo", "hideVmojiPromo()V", i, 4));
        sal0Var2.c = aVar;
        stickersRecyclerView.setAdapter(aVar);
        stickersRecyclerView.setLongtapListener(sal0Var2.new a(stickersRecyclerView, aVar, c5l0Var));
        FastScroller.c cVar = fastScroller.p;
        RecyclerView recyclerView = fastScroller.n;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(cVar);
        }
        fastScroller.n = stickersRecyclerView;
        stickersRecyclerView.addOnScrollListener(cVar);
        fastScroller.o = aVar;
        fastScroller.setTrackColorAttr(R.attr.vk_ui_icon_tertiary);
        fastScroller.setHandleColorAttr(R.attr.vk_ui_text_accent);
        dcl0.a aVar2 = new dcl0.a(new f2b0(sal0Var2), new av70(15));
        stickersRecyclerView.addOnScrollListener(new dcl0(stickersRecyclerView, pn00.k(new Pair(fhy.class, aVar2), new Pair(bhy.class, aVar2)), aVar));
        kr50 kr50Var = this.b;
        if (((Boolean) kr50Var.invoke()).booleanValue()) {
            stickersRecyclerView.setPadding(0, iah0.a(46), 0, 0);
            stickersRecyclerView.setClipToPadding(false);
        }
        sal0Var2.setCurrentUser(this.l);
        Window window = this.a;
        if (window != null) {
            sal0Var2.setAttachWindow(window);
        }
        com.vk.stickers.keyboard.d dVar = this.m;
        if (dVar != null) {
            sal0Var2.setKeyboardListener(dVar);
        }
        RecyclerView.t tVar = this.n;
        if (tVar != null) {
            sal0Var2.setScrollListener(tVar);
        }
        d(sal0Var2);
        sal0Var2.setAnchorViewProvider(this.o);
        if (sal0Var2.isSelected()) {
            sal0Var2.a();
        }
        if (((Boolean) kr50Var.invoke()).booleanValue()) {
            sal0Var2.f.setPadding(0, this.p ? iah0.a(45) : 0, 0, 0);
        } else {
            sal0Var2.f.setPadding(0, 0, 0, this.p ? iah0.a(45) : 0);
        }
        sal0Var2.b(this.r);
        this.c = sal0Var2;
        return sal0Var2;
    }

    @Override // xsna.wdl0
    public final void b(boolean z) {
        ObjectAnimator ofInt;
        this.p = z;
        sal0 sal0Var = this.c;
        if (sal0Var != null) {
            ObjectAnimator objectAnimator = this.q;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            FastScroller fastScroller = sal0Var.getFastScroller();
            if (((Boolean) this.b.invoke()).booleanValue()) {
                ofInt = ObjectAnimator.ofInt(fastScroller, FastScroller.v, this.p ? iah0.a(45) : 0);
            } else {
                ofInt = ObjectAnimator.ofInt(fastScroller, FastScroller.u, this.p ? iah0.a(45) : 0);
            }
            ofInt.setInterpolator(StickersView.O);
            ofInt.setDuration(200L);
            ofInt.addListener(new a());
            ofInt.start();
            this.q = ofInt;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (com.vk.stickers.keyboard.page.a.N0() == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r1.K(r3, 0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j, UserId userId) {
        sal0 sal0Var = this.c;
        if (sal0Var != null) {
            RecyclerView.o layoutManager = sal0Var.b.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                Iterator<? extends hfz> it = sal0Var.c.h.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    hfz next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.vk.stickers.keyboard.page.BaseKeyboardItem");
                    }
                    rf6 rf6Var = (rf6) next;
                    if (rf6Var instanceof yfy) {
                        ewp0 ewp0Var = ((yfy) rf6Var).b;
                        if (epx.f(ewp0Var.a, userId) && ewp0Var.b == j) {
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        this.r = -7;
    }

    public final void d(sal0 sal0Var) {
        ArrayList arrayList = this.d;
        List<StickerItem> list = this.g;
        List<StickerItem> list2 = this.h;
        UGCChatSettingsModel uGCChatSettingsModel = this.k;
        if (arrayList == null || list == null || list2 == null || uGCChatSettingsModel == null) {
            return;
        }
        List list3 = this.e;
        if (list3 == null) {
            list3 = EmptyList.b;
        }
        List list4 = this.f;
        if (list4 == null) {
            list4 = EmptyList.b;
        }
        sal0Var.setData(new tgy(arrayList, list3, list4, list, list2, this.j, uGCChatSettingsModel, this.i));
    }

    @Override // xsna.wdl0
    public final void onConfigurationChanged(Configuration configuration) {
        sal0 sal0Var = this.c;
        if (sal0Var != null) {
            sal0Var.dispatchConfigurationChanged(configuration);
        }
    }
}
