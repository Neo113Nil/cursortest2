package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.yandex.go.vault.flexsdk.shared.VaultPaletteDto;
import com.yandex.go.vault.ui.FlexFullscreenPopupModalView;
import flex.engine.a;
import java.util.Map;

/* loaded from: classes14.dex */
public final class o331 implements o3l0 {
    public final w030 a;
    public final Context b;
    public final a c;
    public final i331 w;
    public final i3m x;

    public o331(w030 w030Var, Context context, a aVar, i331 i331Var, i3m i3mVar) {
        this.a = w030Var;
        this.b = context;
        this.c = aVar;
        this.w = i331Var;
        this.x = i3mVar;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean backward(boolean z, Map map) {
        return this.a.p();
    }

    @Override // defpackage.o3l0
    public final boolean dismiss(boolean z, kr krVar, Map map) {
        this.a.m(FlexFullscreenPopupModalView.class);
        return true;
    }

    @Override // defpackage.o3l0
    public final boolean forward(u1m u1mVar, ywl ywlVar, boolean z, Map map) {
        return false;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean hideOverlay(String str, boolean z, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean overlay(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean showOverlay(String str, ywl ywlVar, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean showPopup(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map, kr krVar) {
        VaultPaletteDto vaultPaletteDto = this.w.c;
        Integer S = q5z.S(vaultPaletteDto != null ? vaultPaletteDto.i : null);
        Context context = this.b;
        int intValue = S != null ? S.intValue() : context.getColor(hpg0.modal_view_background_color);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float b = xw31.b(evg0.slidable_view_card_corner_radius, context);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(evg0.slidable_view_card_corner_radius);
        shapeDrawable.setShape(new RoundRectShape(new float[]{b, b, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        shapeDrawable.getPaint().setColor(intValue);
        this.a.s(new FlexFullscreenPopupModalView(context, this.c, this.x, new vir(z3, shapeDrawable, ywlVar, u1mVar, Integer.valueOf(mqg0.transparent))), true);
        return true;
    }
}
