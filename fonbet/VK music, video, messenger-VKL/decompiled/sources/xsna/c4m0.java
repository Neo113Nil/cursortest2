package xsna;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Handler;
import com.vk.dto.geo.GeoLocation;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.location.common.LocationCommon;
import com.vk.permission.PermissionHelper;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.h90;
import xsna.t3m0;
import xsna.tvo;

/* compiled from: StoryGeoStickerDelegate.kt */
/* loaded from: classes16.dex */
public final class c4m0 implements t3m0.a, tvo.a, nht, h90.a {
    public final Activity b;
    public final StickersDrawingViewGroup c;
    public final b96 d;
    public final u76 e;
    public j1k0 f;
    public final Handler g = new Handler();
    public final s8g0 h;
    public dw20 i;

    public c4m0(Activity activity, StickersDrawingViewGroup stickersDrawingViewGroup, u76 u76Var, b96 b96Var) {
        this.b = activity;
        this.c = stickersDrawingViewGroup;
        this.d = b96Var;
        this.e = u76Var;
        q90 q90Var = new q90(activity, null);
        dhr0.a.getClass();
        Context E = dhr0.E();
        ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, E), e3m.f(R.attr.vk_ui_text_subhead, E));
        PermissionHelper.a.getClass();
        this.h = new s8g0(q90Var, null, ey90Var, new yx90(R.string.geo_sticker_location_restrictions_title, 14, PermissionHelper.h, PermissionHelper.i, true), new qbc0(this, 18), null, null, null, null, null);
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        this.h.K0(i, strArr);
    }

    public final d4m0 a(GeoLocation geoLocation) {
        String str = geoLocation.i;
        if (str == null) {
            str = "";
        }
        String str2 = geoLocation.k;
        String str3 = str2 == null ? "" : str2;
        u76 u76Var = this.e;
        com.vk.stickers.api.styles.a b = u76Var.t0().b(null, new c7l0(u76Var.b7()));
        int i = geoLocation.b;
        Integer valueOf = Integer.valueOf(geoLocation.d);
        if (str.length() > 27) {
            str = erm0.D0(27, str).concat("…");
        }
        return new d4m0(str, str3, b, i, valueOf);
    }

    @Override // xsna.t3m0.a
    public final void b() {
        this.g.post(new o93(this, 22));
    }

    @Override // xsna.t3m0.a
    public final void c() {
        LocationCommon.a.getClass();
        Activity activity = this.b;
        if (!LocationCommon.b(activity)) {
            new AlertDialog.Builder(activity).setTitle(R.string.location_disabled_title).setMessage(R.string.location_disabled).setPositiveButton(R.string.open_settings, new hj7(1, activity, new b6f0(this, 9))).setNegativeButton(R.string.cancel, new z1z(new kld0(this, 11), 1)).show();
        } else {
            if (!LocationCommon.a(activity)) {
                this.h.c(false);
                return;
            }
            j1k0 j1k0Var = this.f;
            if (j1k0Var != null) {
                j1k0Var.invoke();
            }
        }
    }

    @Override // xsna.t3m0.a
    public final void d(GeoLocation geoLocation) {
        dw20 dw20Var = this.i;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        z3m0 z3m0Var = null;
        this.i = null;
        this.f = null;
        StickersDrawingViewGroup stickersDrawingViewGroup = this.c;
        Iterator<nov> it = stickersDrawingViewGroup.getCurrentStickers().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            nov next = it.next();
            if (next instanceof z3m0) {
                z3m0Var = (z3m0) next;
                break;
            }
        }
        if (z3m0Var == null) {
            stickersDrawingViewGroup.f(new z3m0(a(geoLocation)));
        } else {
            z3m0Var.t(a(geoLocation));
            stickersDrawingViewGroup.invalidate();
        }
        this.d.f();
        this.e.o5().e();
    }

    @Override // xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.h.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        this.h.pc(i, list);
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        this.h.wi(i, list);
        if (i == 14) {
            this.e.o5().i(StoryEditorEvents.GEO_ACCESS_DECLINE);
        }
    }
}
