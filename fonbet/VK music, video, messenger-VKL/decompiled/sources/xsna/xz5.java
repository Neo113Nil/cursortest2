package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.balance.BalanceFragment;
import com.vk.channels.impl.post_settings.e;
import com.vk.clips.tool.view.nps.internal.moreless.MoreLessFeedbackView;
import com.vk.core.view.components.radio.VkRadioItem;
import com.vk.debug.ui.dev.DebugDevHintsFragment;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.e3m;
import xsna.f0p;
import xsna.ptw0;
import xsna.uyd0;
import xsna.xn50;
import xsna.zw00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class xz5 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xz5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                SwitchCompat switchCompat = ((BalanceFragment) obj).d0;
                (switchCompat != null ? switchCompat : null).toggle();
                break;
            case 1:
                w6d w6dVar = (w6d) obj;
                Activity L = blk.L(w6dVar.a);
                if (L != null) {
                    w6dVar.j.a(L, new defpackage.r(w6dVar, 26));
                    break;
                }
                break;
            case 2:
                int i2 = DebugDevHintsFragment.W;
                ((DebugDevHintsFragment) obj).finish();
                break;
            case 3:
                f0p.d dVar = (f0p.d) obj;
                f0p.this.B.F1(!r11.g1());
                dVar.c();
                break;
            case 4:
                int i3 = MarketEditAlbumCoverFragment.c0;
                xn50.a.c((MarketEditAlbumCoverFragment) obj, new zw00.c.C4206c());
                break;
            case 5:
                MoreLessFeedbackView moreLessFeedbackView = (MoreLessFeedbackView) obj;
                ImageView imageView = moreLessFeedbackView.b;
                ImageView imageView2 = moreLessFeedbackView.c;
                int i4 = 10;
                if (epx.f(view, imageView)) {
                    rkt rktVar = new rkt(moreLessFeedbackView, i4);
                    Context context = moreLessFeedbackView.getContext();
                    e3m.a aVar = e3m.a;
                    Drawable a = m33.a(R.drawable.vk_icon_thumbs_down_28, context);
                    sjo.b(a, context.getColor(R.color.vk_white), PorterDuff.Mode.SRC_IN);
                    imageView.setImageDrawable(a);
                    imageView.animate().setDuration(150L).scaleX(0.9f).scaleY(0.9f).setListener(new v830(imageView, rktVar)).start();
                } else if (epx.f(view, imageView2)) {
                    nuv nuvVar = new nuv(moreLessFeedbackView, i4);
                    Context context2 = moreLessFeedbackView.getContext();
                    e3m.a aVar2 = e3m.a;
                    Drawable a2 = m33.a(R.drawable.vk_icon_thumbs_up_28, context2);
                    sjo.b(a2, context2.getColor(R.color.vk_white), PorterDuff.Mode.SRC_IN);
                    imageView2.setImageDrawable(a2);
                    imageView2.animate().setDuration(150L).scaleX(0.9f).scaleY(0.9f).setListener(new v830(imageView2, nuvVar)).start();
                }
                imageView.setOnClickListener(null);
                imageView2.setOnClickListener(null);
                break;
            case 6:
                gzs gzsVar = (gzs) obj;
                int i5 = uj40.d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 7:
                h2a0 h2a0Var = (h2a0) obj;
                int i6 = h2a0.j1;
                ((d2a0) h2a0Var.i1.getValue()).b(h2a0Var.Yn());
                bx2 e = e370.e(new ufx("account.markActualizePhone", new lr(false), new pn(false)));
                String string = h2a0Var.requireArguments().getString("arg_token");
                e.n = string != null ? string : "";
                e.o = null;
                int i7 = 6;
                h2a0Var.g1.b(hg1.i(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(rdx0.p(e).m(io.reactivex.rxjava3.android.schedulers.a.b()), new q440(new gj80(h2a0Var, 2), 9)), new lx6(h2a0Var, i7)), new g9b(h2a0Var, i7)), new e420(19)));
                break;
            case 8:
                com.vk.photogallery.c cVar = (com.vk.photogallery.c) obj;
                ArrayList a3 = cVar.l.getSelectionState().a();
                a7u0 a7u0Var = cVar.b;
                EditText editText = cVar.q;
                a7u0Var.a(editText.getText().toString(), a3);
                editText.setText("");
                cVar.b();
                break;
            case 9:
                wda0 wda0Var = (wda0) obj;
                pk30 pk30Var = wda0Var.g;
                if (pk30Var != null) {
                    AttachImage attachImage = wda0Var.j;
                    pk30Var.O(attachImage != null ? attachImage : null);
                    break;
                }
                break;
            case 10:
                cqb0.m((cqb0) obj);
                break;
            case 11:
                ((com.vk.channels.impl.post_settings.f) obj).O(e.f.b);
                break;
            case 12:
                ((cqc0) obj).X0(PostingVisibilityMode.FRIENDS);
                break;
            case 13:
                uyd0 uyd0Var = (uyd0) ((uyd0.a) obj).m;
                if (uyd0Var != null && (runnable = uyd0Var.l) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                ((izs) obj).invoke(view);
                break;
            case 15:
                Object obj2 = ((x2v0) obj).o;
                ((u2v0) (obj2 != null ? obj2 : null)).R();
                break;
            case 16:
                int i8 = VkRadioItem.e;
                ((VkRadioItem) obj).toggle();
                break;
            case 17:
                ((cuw0) obj).c.invoke(ptw0.c.b);
                break;
            default:
                qyw0 qyw0Var = (qyw0) obj;
                qyw0Var.c.invoke(ScheduledVideoMuteOption.DisabledOnJoin);
                dw20 dw20Var = qyw0Var.i;
                if (dw20Var != null) {
                    dw20Var.tn();
                    break;
                }
                break;
        }
    }
}
