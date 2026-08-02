package xsna;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.b38;

/* compiled from: BotKeyboardVc.kt */
/* loaded from: classes2.dex */
public final class h38 {
    public final LayoutInflater a;
    public final RecyclerView.u b;
    public boolean c = true;
    public BotKeyboard d = com.vk.im.engine.models.conversations.a.a;
    public b38 e = b38.a.a;
    public View f;
    public RecyclerView g;
    public a38 h;
    public Integer i;

    /* compiled from: BotKeyboardVc.kt */
    public static final class a extends GridLayoutManager.c {
        public final BotKeyboard d;

        public a(BotKeyboard botKeyboard) {
            this.d = botKeyboard;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            BotKeyboard botKeyboard = this.d;
            List<List<BotButton>> list = botKeyboard.f;
            int i2 = 0;
            int size = list.get(0).size();
            while (i > size - 1) {
                i2++;
                size += list.get(i2).size();
            }
            return ((Number) botKeyboard.h.getValue()).intValue() / list.get(i2).size();
        }
    }

    public h38(LayoutInflater layoutInflater, RecyclerView.u uVar) {
        this.a = layoutInflater;
        this.b = uVar;
    }

    public final void a(BotKeyboard botKeyboard) {
        this.c = false;
        a38 a38Var = this.h;
        if (a38Var == null) {
            a38Var = null;
        }
        a38Var.e = botKeyboard.g;
        a38Var.notifyDataSetChanged();
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            recyclerView = null;
        }
        this.a.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(((Number) botKeyboard.h.getValue()).intValue());
        gridLayoutManager.x = new a(botKeyboard);
        recyclerView.setLayoutManager(gridLayoutManager);
        if (botKeyboard.d) {
            this.f.setBackground(null);
            RecyclerView recyclerView2 = this.g;
            RecyclerView recyclerView3 = recyclerView2 != null ? recyclerView2 : null;
            float f = 4;
            recyclerView3.setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void b() {
        LayoutInflater layoutInflater = this.a;
        View inflate = layoutInflater.inflate(R.layout.vkim_bot_keyboard, (ViewGroup) null);
        a38 a38Var = new a38(layoutInflater);
        a38Var.f = this.e;
        a38Var.notifyDataSetChanged();
        a38Var.e = this.d.g;
        a38Var.notifyDataSetChanged();
        if (a38Var.g) {
            a38Var.g = false;
            a38Var.notifyDataSetChanged();
        }
        Integer num = this.i;
        if (num != null) {
            a38Var.d = num.intValue();
            a38Var.notifyDataSetChanged();
        }
        this.h = a38Var;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.vkim_bot_keyboard);
        this.g = recyclerView;
        layoutInflater.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(((Number) this.d.h.getValue()).intValue());
        gridLayoutManager.x = new a(this.d);
        gridLayoutManager.l = true;
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setRecycledViewPool(this.b);
        RecyclerView recyclerView3 = this.g;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        a38 a38Var2 = this.h;
        if (a38Var2 == null) {
            a38Var2 = null;
        }
        recyclerView3.setAdapter(a38Var2);
        RecyclerView recyclerView4 = this.g;
        (recyclerView4 != null ? recyclerView4 : null).addOnLayoutChangeListener(new g38(this, 0));
        this.f = inflate;
    }

    public final void c(BotKeyboard botKeyboard) {
        ArrayList arrayList = botKeyboard.g;
        boolean z = botKeyboard.d;
        if (epx.f(this.d, botKeyboard)) {
            return;
        }
        if (this.f == null) {
            this.d = botKeyboard;
            return;
        }
        if (!this.c && !z) {
            BotKeyboard botKeyboard2 = this.d;
            botKeyboard2.getClass();
            boolean z2 = true;
            if (botKeyboard2 != botKeyboard) {
                if (BotKeyboard.class.equals(BotKeyboard.class) && epx.f(botKeyboard2.b, botKeyboard.b) && botKeyboard2.c == botKeyboard.c && botKeyboard2.d == z && botKeyboard2.e == botKeyboard.e) {
                    Iterator it = botKeyboard2.g.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        Parcelable parcelable = (BotButton) next;
                        if (parcelable instanceof BotButton.a ? ((BotButton.a) parcelable).Ga(arrayList.get(i)) : epx.f(parcelable, arrayList.get(i))) {
                            i = i2;
                        }
                    }
                }
                z2 = false;
                break;
            }
            if (!z2) {
                RecyclerView recyclerView = this.g;
                RecyclerView recyclerView2 = recyclerView != null ? recyclerView : null;
                com.vk.newsfeed.common.recycler.holders.attachments.a aVar = new com.vk.newsfeed.common.recycler.holders.attachments.a(6, this, botKeyboard);
                ViewPropertyAnimator animate = recyclerView2.animate();
                animate.cancel();
                animate.scaleX(0.95f).scaleY(0.95f).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(75L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new i38(recyclerView2, aVar)).start();
                this.d = botKeyboard;
            }
        }
        a(botKeyboard);
        this.d = botKeyboard;
    }
}
