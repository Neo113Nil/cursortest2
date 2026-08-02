package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.stickers.StickerStockItem;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* compiled from: CopyClipboardTextHelperImpl.kt */
/* loaded from: classes6.dex */
public final class etj implements d4s {
    public final Context b;

    public /* synthetic */ etj(Context context) {
        this.b = context;
    }

    @Override // xsna.d4s
    public void a(h1j h1jVar) {
        cwf cwfVar = new cwf(this.b, null);
        cwfVar.e = h1jVar;
        dwf dwfVar = new dwf(cwfVar.c);
        cwfVar.D0(dwfVar, false);
        cwfVar.c(new jgj(dwfVar, iah0.a(16), 0, 56));
        cwfVar.F0(true);
        cwfVar.u(0);
        cwfVar.x(0);
        cwfVar.I(true);
        d1x c = gu9.c(R.attr.vk_ui_background_contrast_themed, cwfVar.c);
        c.a(e3m.f(R.attr.vk_ui_background_modal, cwfVar.c));
        cwfVar.y(c);
        cwfVar.d.w0 = iah0.a(8);
        dw20 I0 = cwfVar.I0(cwf.f);
        dwfVar.setOnDismissButtonClickListener(new la(I0, 2));
        dwfVar.setOpenProfileClickListener(new mna(1, cwfVar, I0));
    }

    public void b() {
        Intent intent = new Intent("com.vkontakte.android.STICKERS_RELOADED");
        n2i0.a(this.b, hf8.a, intent);
    }

    public void c(StickerStockItem stickerStockItem) {
        Intent intent = new Intent("com.vkontakte.android.STICKERS_UPDATED");
        intent.putExtra(DatabaseHelper.ITEM_COLUMN_NAME, stickerStockItem);
        n2i0.a(this.b, hf8.a, intent);
        y8l0.a.a(new c860(stickerStockItem));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [T, xsna.dw20] */
    @Override // xsna.d4s
    public void e(boolean z, boolean z2, wzf wzfVar) {
        HashSet hashSet = iah0.a;
        Context context = this.b;
        oe80 oe80Var = new oe80(context, z, z2, fnj.c(context));
        oe80Var.h = wzfVar;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Context context2 = oe80Var.c;
        id80 id80Var = new id80(context2, null, 0);
        int i = 1;
        LayoutInflater.from(context2).inflate(R.layout.onboarding_popup, (ViewGroup) id80Var, true);
        ImageView imageView = (ImageView) id80Var.findViewById(R.id.close_button);
        ImageView imageView2 = (ImageView) id80Var.findViewById(R.id.image);
        boolean M = dhr0.M();
        imageView.setImageResource(M ? R.drawable.vk_icon_dismiss_dark_24 : R.drawable.vk_icon_dismiss_24);
        imageView.setOnClickListener(new l44(id80Var, 10));
        imageView2.setImageResource(M ? R.drawable.onboarding_image_dark : R.drawable.onboarding_image_light);
        boolean z3 = oe80Var.g;
        boolean z4 = !z3;
        if (z4) {
            bwt0.d(id80Var, 12.0f, true, true);
        }
        oe80Var.D0(id80Var, false);
        fd80 fd80Var = new fd80(oe80Var.c);
        if (z4) {
            bwt0.d(fd80Var, 12.0f, true, false);
        }
        if (z3) {
            oe80Var.z(fd80Var);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = iah0.a(4);
            fd80Var.setLayoutParams(layoutParams);
            id80Var.addView(fd80Var);
        }
        if (z3) {
        } else {
            oe80Var.O0();
        }
        oe80Var.F0(true);
        oe80Var.x(0);
        oe80Var.I(true);
        if (z3) {
            oe80Var.q(false);
        }
        oe80Var.c0(new DialogInterface.OnKeyListener() { // from class: xsna.ne80
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                if (i2 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                dw20 dw20Var = (dw20) Ref$ObjectRef.this.element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return true;
            }
        });
        if (z3) {
            Drawable a = m33.a(R.drawable.fullscreen_onboarding_bg, oe80Var.c);
            if (a != null) {
            }
        } else {
            id80Var.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, oe80Var.c));
        }
        ref$ObjectRef.element = oe80Var.I0(oe80.i);
        id80Var.setOnDismissListener(new r1x(ref$ObjectRef, i));
        dw20 dw20Var = (dw20) ref$ObjectRef.element;
        boolean z5 = oe80Var.e;
        boolean z6 = oe80Var.f;
        if (z5) {
            fd80Var.a(R.string.followers_mode_onboarding_dismiss_button, new nuv(dw20Var, 17));
            if (z6) {
                wo1 wo1Var = new wo1(11, oe80Var, dw20Var);
                TextView textView = fd80Var.c;
                textView.setVisibility(0);
                textView.setText(R.string.followers_mode_disable_button);
                textView.setOnClickListener(new la(wo1Var, 8));
            }
        } else if (z6) {
            fd80Var.a(R.string.followers_mode_enable_button, new uh3(20, oe80Var, dw20Var));
        } else {
            fd80Var.a(R.string.followers_mode_onboarding_dismiss_button, new tzv(dw20Var, 18));
        }
    }

    public etj() {
        Context context = e43.a;
        this.b = context == null ? null : context;
    }
}
