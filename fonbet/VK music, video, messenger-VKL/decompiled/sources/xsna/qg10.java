package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
import xsna.av20;
import xsna.dw20;

/* compiled from: MaskInfoBottomSheet.kt */
/* loaded from: classes3.dex */
public final class qg10 extends dw20.b {
    public final Mask e;
    public final boolean f;
    public final CameraUIView.d g;
    public final e520 h;
    public final e520 i;
    public final e520 j;
    public final e520 k;
    public final e520 l;
    public final List<e520> m;
    public WeakReference<dw20> n;

    /* compiled from: MaskInfoBottomSheet.kt */
    public static final class a extends s770 {
        public a() {
        }

        @Override // xsna.s770
        public final void m(hkp hkpVar, Object obj, int i) {
            e520 e520Var = (e520) obj;
            ((TextView) hkpVar.f(R.id.action_text)).setText(e520Var.a(qg10.this.c));
            ((ImageView) hkpVar.f(R.id.action_icon)).setImageResource(e520Var.b);
        }

        @Override // xsna.s770
        public final hkp p(View view) {
            hkp hkpVar = new hkp(7);
            View findViewById = view.findViewById(R.id.action_text);
            View findViewById2 = view.findViewById(R.id.action_icon);
            ImageView imageView = (ImageView) findViewById2;
            imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_action_sheet_text));
            imageView.setVisibility(0);
            s3q0 s3q0Var = s3q0.a;
            View findViewById3 = view.findViewById(R.id.action_check_icon);
            f4m.j(findViewById3);
            hkpVar.e(findViewById, findViewById2, findViewById3);
            return hkpVar;
        }
    }

    /* compiled from: MaskInfoBottomSheet.kt */
    public static final class b implements av20.b<e520> {
        public b() {
        }

        @Override // xsna.av20.b
        public final void a(View view, Object obj, int i, wmg wmgVar) {
            String str;
            dw20 dw20Var;
            e520 e520Var = (e520) obj;
            qg10 qg10Var = qg10.this;
            if (epx.f(e520Var, qg10Var.h)) {
                qg10Var.g.a(qg10Var.e, true);
                nf9.b.k(StoryPublishEvent.ADD_TO_FAVORITE);
            } else if (epx.f(e520Var, qg10Var.i)) {
                qg10Var.g.a(qg10Var.e, false);
                nf9.b.k(StoryPublishEvent.REMOVE_FROM_FAVORITE);
            } else if (epx.f(e520Var, qg10Var.j)) {
                if (qg10Var.f) {
                    kbj0.c(nr4.b(), qg10Var.c, "https://" + a0a.d + "/clips/effect/" + qg10Var.e.e + '_' + qg10Var.e.d, false, null, null, false, 120);
                } else {
                    kbj0.c(nr4.b(), qg10Var.c, "https://" + a0a.d + "/mask" + qg10Var.e.e + '_' + qg10Var.e.d, false, null, null, false, 120);
                }
                nf9.b.k(StoryPublishEvent.SHARING);
            } else if (epx.f(e520Var, qg10Var.k)) {
                CameraUIView.d dVar = qg10Var.g;
                MasksWrap masksWrap = CameraUIView.this.b0;
                if (masksWrap != null) {
                    Mask mask = dVar.b;
                    if (fkq0.b(mask.e)) {
                        str = "club" + fkq0.a(mask.e);
                    } else {
                        str = "id" + mask.e;
                    }
                    masksWrap.C("https://" + a0a.d + '/' + str);
                    nf9.b.k(StoryPublishEvent.GO_TO_AUTHOR);
                }
            } else if (epx.f(e520Var, qg10Var.l)) {
                CameraUIView.d dVar2 = qg10Var.g;
                MasksWrap masksWrap2 = CameraUIView.this.b0;
                if (masksWrap2 != null) {
                    masksWrap2.C("https://" + a0a.d + "/masks#/" + dVar2.b.e);
                    nf9.b.k(StoryPublishEvent.OTHER_EFFECTS);
                }
            }
            WeakReference<dw20> weakReference = qg10.this.n;
            if (weakReference == null || (dw20Var = weakReference.get()) == null) {
                return;
            }
            dw20Var.hide();
        }
    }

    public qg10(Context context, Mask mask, boolean z, CameraUIView.d dVar) {
        super(context, null);
        this.e = mask;
        this.f = z;
        this.g = dVar;
        e520 e520Var = new e520(0, R.drawable.vk_icon_favorite_outline_28, R.string.masks_add_to_favorite, 0, false, 0, 0, false, null, 0, null, false, 8176);
        this.h = e520Var;
        e520 e520Var2 = new e520(0, R.drawable.vk_icon_unfavorite_outline_28, R.string.masks_remove_from_favorite, 0, false, 0, 0, false, null, 0, null, false, 8176);
        this.i = e520Var2;
        e520 e520Var3 = new e520(0, R.drawable.vk_icon_share_outline_28, R.string.share, 0, false, 0, 0, false, null, 0, null, false, 8176);
        this.j = e520Var3;
        e520 e520Var4 = new e520(0, R.drawable.vk_icon_user_outline_28, R.string.mask_view_go_to_author, 0, false, 0, 0, false, null, 0, null, false, 8176);
        this.k = e520Var4;
        e520 e520Var5 = new e520(0, R.drawable.vk_icon_masks_outline_28, R.string.masks_go_to_other_authors_masks, 0, false, 0, 0, false, null, 0, null, false, 8176);
        this.l = e520Var5;
        this.m = j5g.V(e43.l(mask.w ? e520Var2 : e520Var, e520Var3, e520Var4, mask.u ? null : e520Var5));
        dhr0.a.getClass();
        u0(dhr0.u().c);
    }

    public final av20<e520> S0() {
        av20.a aVar = new av20.a();
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(this.c));
        aVar.d = new a();
        aVar.e = new b();
        return aVar.b();
    }
}
