package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.coachmark.CoachmarkViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.core.tips.Tooltip;
import com.vk.core.tips.c;
import com.vk.dto.hints.Hint;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.l7v;

/* compiled from: VkCatalogHintRenderer.kt */
/* loaded from: classes16.dex */
public final class diu0 implements b7a {
    public static final float d = iah0.b(10.0f);
    public static final int e = 4;
    public static final int f = cn70.b(Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE);
    public final com.vk.catalog2.common.ui.mvp.util.a a;
    public final b5a b;
    public final c7a c;

    /* compiled from: VkCatalogHintRenderer.kt */
    public static final class a implements dcn {
        public final Tooltip.b b;
        public final gzs<s3q0> c;

        public a(com.vk.core.tips.b bVar, gzs gzsVar) {
            this.b = bVar;
            this.c = gzsVar;
        }

        @Override // xsna.dcn
        public final void dismiss() {
            this.c.invoke();
            Tooltip.b bVar = this.b;
            if (bVar != null) {
                bVar.b(true);
            }
        }
    }

    public diu0(com.vk.catalog2.common.ui.mvp.util.a aVar, b5a b5aVar, kl40 kl40Var) {
        this.a = aVar;
        this.b = b5aVar;
        this.c = kl40Var;
    }

    @Override // xsna.b7a
    public final boolean a(String str) {
        return pla.e().b().a(str);
    }

    @Override // xsna.b7a
    public final void b(gzs<String> gzsVar) {
        c7a c7aVar = this.c;
        if (c7aVar != null) {
            c7aVar.b(gzsVar);
        }
    }

    @Override // xsna.b7a
    public final dcn e(Activity activity, Rect rect, String str, com.vk.movika.sdk.base.model.props.d dVar) {
        Activity h = e3m.h(activity);
        if (h == null) {
            return null;
        }
        l7v b = pla.e().b();
        b.getClass();
        l7v.b bVar = new l7v.b(str, b, rect);
        bVar.i = true;
        bVar.g = new aiu0();
        return bVar.j(h);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, xsna.dcn, xsna.diu0$a] */
    @Override // xsna.b7a
    public final dcn f(Context context, Rect rect, UIBlockHint uIBlockHint, final gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        UIBlock uIBlockPlaceholder;
        boolean z;
        Tooltip tooltip;
        CatalogHintType catalogHintType = uIBlockHint.B;
        boolean z2 = uIBlockHint.C;
        String str = uIBlockHint.y;
        Activity h = e3m.h(context);
        if (h != null) {
            boolean z3 = catalogHintType == CatalogHintType.COACHMARK;
            if (!z3 || MusicFeatures.ONBOARDING_COACHMARK.h()) {
                if (catalogHintType != CatalogHintType.HIGHLIGHT && !z3) {
                    l7v b = pla.e().b();
                    b.getClass();
                    l7v.b bVar = new l7v.b(str, b, rect);
                    bVar.i = true;
                    bVar.g = new DialogInterface.OnDismissListener() { // from class: xsna.biu0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            gzs.this.invoke();
                        }
                    };
                    Hint hint = new Hint(uIBlockHint.y, uIBlockHint.z, uIBlockHint.A, null, 8, null);
                    if (bVar.c.b(str) != null) {
                        return bVar.n(h, hint);
                    }
                    return null;
                }
                HashSet hashSet = iah0.a;
                if (fnj.d(h) || iah0.s(h)) {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    CatalogViewHolder coachmarkViewHolder = z3 ? new CoachmarkViewHolder(this.b, new la9(ref$ObjectRef, 2)) : new PlaceholderVh(this.a, false, true, null, new i3u(ref$ObjectRef, 23), R.layout.catalog_placeholder_hint_view, null, 0, 202);
                    if (z3) {
                        uIBlockPlaceholder = uIBlockHint;
                        z = z2;
                    } else {
                        z = z2;
                        uIBlockPlaceholder = new UIBlockPlaceholder(uIBlockHint.b, uIBlockHint.d, uIBlockHint.e, uIBlockHint.f, uIBlockHint.g, uIBlockHint.h, uIBlockHint.Db(), null, uIBlockHint.y, uIBlockHint.z, null, null, uIBlockHint.A, null, null, uIBlockHint.D, null, null, null, null, null, null, uIBlockHint.l, uIBlockHint.p, null, null, 50331648, null);
                    }
                    View k5 = coachmarkViewHolder.k5(e3m.b(h), null, null);
                    coachmarkViewHolder.N6(uIBlockPlaceholder);
                    int i = 20;
                    float f2 = d;
                    if (z3) {
                        c7a c7aVar = this.c;
                        if (c7aVar != null) {
                            c7aVar.a(uIBlockHint);
                        }
                        Tooltip.WindowStyle windowStyle = Tooltip.WindowStyle.FULLSCREEN;
                        int c = dhr0.t.c(R.attr.vk_ui_background_modal);
                        c.d dVar = new c.d(f2);
                        Context context2 = k5.getContext();
                        String str2 = uIBlockHint.z;
                        pla.e().b().getClass();
                        tooltip = new Tooltip(context2, str2, uIBlockHint.A, windowStyle, null, null, new b1y(str), c, 0, null, 1.0f, null, 0, false, null, 0, !z, new rme0(k5, i), null, dVar, new r8i0(this, uIBlockHint, gzsVar2, 1), null, new dce(1, this, uIBlockHint), new za6(gzsVar, uIBlockHint), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, e, null, Integer.valueOf(f), null, null, -1088095440, 14);
                    } else {
                        Tooltip.WindowStyle windowStyle2 = Tooltip.WindowStyle.FULLSCREEN;
                        int c2 = dhr0.t.c(R.attr.vk_ui_background_modal);
                        c.d dVar2 = new c.d(f2);
                        Context context3 = k5.getContext();
                        String str3 = uIBlockHint.z;
                        pla.e().b().getClass();
                        tooltip = new Tooltip(context3, str3, uIBlockHint.A, windowStyle2, null, null, new b1y(str), c2, 0, null, 1.0f, null, 0, true, null, 0, !z, new rme0(k5, i), null, dVar2, null, new ciu0(), null, new ko9(gzsVar, uIBlockHint), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -11216080, 15);
                    }
                    boolean z4 = !z;
                    ?? aVar = new a(Tooltip.l(tooltip, h, new RectF(rect), false, z4, !z3, z4, 196), gzsVar);
                    ref$ObjectRef.element = aVar;
                    return aVar;
                }
            }
        }
        return null;
    }
}
