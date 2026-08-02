package com.yandex.messaging.internal.view.stickers.panel;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.yandex.bricks.BrickViewLifecycle;
import com.yandex.messaging.internal.storage.stickers.b;
import com.yandex.messaging.internal.view.stickers.AutoSpanGridLayoutManager;
import com.yandex.messaging.internal.view.stickers.StickersView;
import defpackage.e9h0;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.hhs0;
import defpackage.jqr;
import defpackage.kjs0;
import defpackage.l7s0;
import defpackage.mae0;
import defpackage.mdu0;
import defpackage.n5x0;
import defpackage.ocu0;
import defpackage.olh0;
import defpackage.r3k0;
import defpackage.r4z;
import defpackage.u590;
import defpackage.vcu0;
import defpackage.wcu0;
import defpackage.xav;
import defpackage.yfa;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes15.dex */
public final class a extends BrickViewLifecycle {
    public final AutoSpanGridLayoutManager A;
    public vcu0 B;
    public yfa C;
    public final n5x0 D;
    public final View E;
    public final b w;
    public final r4z x;
    public final mdu0 y;
    public final ocu0 z;

    public a(Activity activity, h3y h3yVar, SharedPreferences sharedPreferences, b bVar, mae0 mae0Var, r4z r4zVar) {
        this.w = bVar;
        this.x = r4zVar;
        mdu0 mdu0Var = new mdu0(activity, h3yVar);
        this.y = mdu0Var;
        mdu0Var.w = new r3k0(11, this, sharedPreferences);
        int i = gvg0.emoji_sticker_image_height;
        DisplayMetrics displayMetrics = kjs0.a;
        AutoSpanGridLayoutManager autoSpanGridLayoutManager = new AutoSpanGridLayoutManager(activity, activity.getResources().getDimensionPixelSize(i));
        this.A = autoSpanGridLayoutManager;
        autoSpanGridLayoutManager.h0 = new wcu0(this);
        ocu0 ocu0Var = new ocu0(activity, (xav) h3yVar.get());
        this.z = ocu0Var;
        ocu0Var.w = new hhs0(7, this, activity);
        View inflate = LayoutInflater.from(activity).inflate(olh0.msg_v_emoji_panel_stickers_page, (ViewGroup) null);
        this.E = inflate;
        StickersView stickersView = (StickersView) inflate.findViewById(e9h0.stickers_viewpager);
        stickersView.setAdapter(mdu0Var);
        stickersView.setLayoutManager(autoSpanGridLayoutManager);
        stickersView.setStickerPreviewer(mae0Var);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(gvg0.emoji_panel_padding);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(e9h0.stickers_strip);
        recyclerView.addItemDecoration(new u590(dimensionPixelSize, 0, dimensionPixelSize, 0, 0, 0, 0, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC));
        recyclerView.setAdapter(ocu0Var);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity, 0, false));
        RecyclerView.c itemAnimator = recyclerView.getItemAnimator();
        b1 b1Var = itemAnimator instanceof b1 ? (b1) itemAnimator : null;
        if (b1Var != null) {
            b1Var.g = false;
        }
        this.D = new n5x0(stickersView, recyclerView, new l7s0(this));
        a(inflate);
    }

    @Override // com.yandex.bricks.BrickViewLifecycle, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        e.H(this.b.a(), new jqr(this.w.a(zy11.a), new StickerPanelViewController$onBrickAttach$1(this, null), 3));
    }
}
