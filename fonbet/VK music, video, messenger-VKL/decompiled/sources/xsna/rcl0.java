package xsna;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickersPacksChunk;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.dw20;

/* compiled from: StickersRoulettePresenter.kt */
/* loaded from: classes6.dex */
public final class rcl0 implements ocl0 {
    public final StickersRouletteFragment b;
    public final kcl0 c;
    public StickerStockItem e;
    public String f;
    public boolean g;
    public StickersPacksChunk d = new StickersPacksChunk(EmptyList.b, (String) null);
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();

    public rcl0(StickersRouletteFragment stickersRouletteFragment, kcl0 kcl0Var) {
        this.b = stickersRouletteFragment;
        this.c = kcl0Var;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [T, xsna.dw20] */
    @Override // xsna.ocl0
    public final void G1() {
        dw20.a c;
        StickersPacksChunk stickersPacksChunk = this.d;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        StickersRouletteFragment stickersRouletteFragment = this.b;
        Context requireContext = stickersRouletteFragment.requireContext();
        yv20 yv20Var = new yv20(requireContext, null, 0);
        yv20Var.b = new RecyclerPaginatedView(requireContext);
        yv20Var.c = new h890(new xa9(1, yv20Var, yv20.class, "openPackPreview", "openPackPreview(Lcom/vk/dto/stickers/StickerStockItem;)V", 0, 8));
        yv20Var.addView(yv20Var.b);
        RecyclerPaginatedView recyclerPaginatedView = yv20Var.b;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, recyclerPaginatedView).a();
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setAdapter(yv20Var.c);
        yv20Var.addOnAttachStateChangeListener(yv20Var);
        ocl0 ocl0Var = (ocl0) stickersRouletteFragment.S;
        String u5 = ocl0Var != null ? ocl0Var.u5() : null;
        h890 h890Var = yv20Var.c;
        List<StickerStockItem> list = stickersPacksChunk.b;
        h890Var.n0(list);
        c.h hVar = new c.h(yv20Var);
        hVar.i = list.size();
        hVar.l = false;
        String str = stickersPacksChunk.c;
        hVar.k = str;
        hVar.q = true;
        yv20Var.setHelper(com.vk.lists.f.a(hVar, yv20Var.b));
        yv20Var.getHelper().s(str);
        h890 h890Var2 = yv20Var.c;
        if (u5 == null) {
            u5 = "";
        }
        h890Var2.f = u5;
        c = ((dw20.b) new dw20.b(stickersRouletteFragment.requireContext(), tzp0.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 60, null), 2)).D0(yv20Var, false)).b0(new sme0(ref$ObjectRef, 1)).Y(new com.vk.stickers.roulette.a(stickersRouletteFragment)).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
        ref$ObjectRef.element = ((dw20.b) c).w0(stickersRouletteFragment.getResources().getString(R.string.available_packs)).I0(null);
    }

    @Override // xsna.ocl0
    public final void J3(Context context, String str, String str2, Integer num) {
        StickerStockItem stickerStockItem = this.e;
        if (stickerStockItem == null) {
            return;
        }
        this.h.b(bug0.d(rsg0.y0(new iil0(Collections.singletonList(10101), stickerStockItem.c, str2, o25.a().h(), null, null, str, num, 2544), null, null, 3), context, null, 6).subscribe(new cc20(new or50(this, 25), 23), new tk40(new gib0(this, 12), 16)));
    }

    @Override // xsna.ocl0
    public final void M0(obl0 obl0Var, String str, String str2) {
        StickerStockItem stickerStockItem = this.e;
        if (stickerStockItem == null) {
            return;
        }
        if (str != null) {
            stickerStockItem.P = str;
        }
        if (str2 != null) {
            stickerStockItem.O = str2;
        }
        obl0Var.H7(stickerStockItem, new com.vk.movika.tools.controls.seekbar.i(this, 16));
    }

    @Override // xsna.ocl0
    public final void Q0() {
        this.h.b(new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(new oil0("store.getStickersRandomSelectorOptions"), null, null, 3), new m5y(new b140(this, 23), 24), io.reactivex.rxjava3.internal.functions.a.c), new mtb(this, 4)).subscribe(new vk40(new h440(this, 22), 21), new k130(new e9i0(this, 7), 21)));
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.ocl0
    public final void a5(String str) {
        tfx tfxVar = new tfx("store.setStickersRandomSelectorResultViewed", new ggj0(3), new bxj0(2));
        tfx.o(tfxVar, "result_id", str, 0, 0, 12);
        this.h.b(rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe());
    }

    public final void b(nge0 nge0Var) {
        nng0 presenter;
        if (nge0Var != null) {
            JSONObject jSONObject = nge0Var.d;
            Serializer.c<StickerStockItem> cVar = StickerStockItem.CREATOR;
            StickerStockItem a = StickerStockItem.a.a(jSONObject.getJSONObject("pack"));
            jSONObject.getBoolean("is_enabled");
            jSONObject.optString("reason");
            String string = jSONObject.getString("id");
            StickersBonusResult stickersBonusResult = nge0Var.l;
            y9l0.a(new s1l0(a.b));
            this.c.Z(a);
            StickersRouletteFragment stickersRouletteFragment = this.b;
            stickersRouletteFragment.R8((r12 & 1) == 0, (r12 & 2) == 0, (r12 & 4) == 0, (r12 & 8) != 0 ? null : null, (r12 & 16) != 0 ? null : null);
            ztj ztjVar = new ztj(this, a, string, stickersBonusResult, 4);
            stickersRouletteFragment.jo(dhr0.t.c(R.attr.vk_ui_separator_secondary));
            RouletteView rouletteView = stickersRouletteFragment.W;
            if (rouletteView != null) {
                RecyclerView.e0 findViewHolderForAdapterPosition = rouletteView.g.findViewHolderForAdapterPosition(rouletteView.getCurrentPosition());
                b790 b790Var = findViewHolderForAdapterPosition instanceof b790 ? (b790) findViewHolderForAdapterPosition : null;
                if (b790Var != null) {
                    b790Var.V5(false);
                }
            }
            TextView textView = stickersRouletteFragment.U;
            if (textView != null) {
                textView.setEnabled(false);
            }
            RouletteView rouletteView2 = stickersRouletteFragment.W;
            if (rouletteView2 != null && (presenter = rouletteView2.getPresenter()) != null && presenter.W0(a) == -1) {
                int v = rouletteView2.h.v();
                nng0 presenter2 = rouletteView2.getPresenter();
                int k5 = presenter2 != null ? presenter2.k5(v - 1) : 0;
                nng0 presenter3 = rouletteView2.getPresenter();
                if (presenter3 != null) {
                    presenter3.v4(a, k5);
                }
                rouletteView2.h(a);
            }
            RouletteView rouletteView3 = stickersRouletteFragment.W;
            if (rouletteView3 != null) {
                rouletteView3.g.addOnScrollListener(rouletteView3.j);
                nng0 presenter4 = rouletteView3.getPresenter();
                if (presenter4 != null) {
                    presenter4.t1(a);
                }
                rouletteView3.b = ztjVar;
                nng0 presenter5 = rouletteView3.getPresenter();
                if (presenter5 != null) {
                    presenter5.Y4(a);
                }
            }
        }
    }

    @Override // xsna.ocl0
    public final void e() {
        Q0();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        this.h.dispose();
    }

    @Override // xsna.ocl0
    public final String u5() {
        return this.f;
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
