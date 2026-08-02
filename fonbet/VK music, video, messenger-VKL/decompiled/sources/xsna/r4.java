package xsna;

import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.vk.archive.impl.ArchiveWithChannelsFragment;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyButtonsView;
import com.vk.money.MoneyTransfersFragment;
import com.vk.money.createtransfer.input.TransferInputFieldView;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vkontakte.android.ui.widget.MenuListView;
import xsna.a2v0;
import xsna.lhu0;
import xsna.zn30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r4 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Card card;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((je0) obj).h(new kzr0(false, true, false, null, true));
                break;
            case 1:
                int i2 = ArchiveWithChannelsFragment.V;
                ((ArchiveWithChannelsFragment) obj).finish();
                break;
            case 2:
                ot9 ot9Var = (ot9) obj;
                ht9 ht9Var = ot9Var.r;
                if (ht9Var != null && (card = (Card) ht9Var.b) != null) {
                    ot9Var.l.d(card, ot9Var.getBindingAdapterPosition());
                    break;
                }
                break;
            case 3:
                u1f u1fVar = (u1f) obj;
                s0t0 s0t0Var = u1fVar.s0;
                if (s0t0Var != null) {
                    s0t0Var.a(u1fVar.L);
                    break;
                }
                break;
            case 4:
                ((MenuListView) obj).b.v0().w1(new PlaybackActionMeta(6, SystemClock.elapsedRealtime()));
                break;
            case 5:
                MoneyTransfersFragment moneyTransfersFragment = (MoneyTransfersFragment) obj;
                if (moneyTransfersFragment.N0.b == 0) {
                    moneyTransfersFragment.U0 = false;
                    moneyTransfersFragment.Mo(1006);
                    break;
                } else {
                    moneyTransfersFragment.Jo();
                    break;
                }
            case 6:
                zn30.a aVar = ((yn30) obj).k;
                if (aVar != null) {
                    aVar.c();
                    break;
                }
                break;
            case 7:
                izs<? super View, s3q0> izsVar = ((MyTargetAdSurveyButtonsView) obj).g;
                if (izsVar != null) {
                    izsVar.invoke(view);
                    break;
                }
                break;
            case 8:
                abe0 abe0Var = (abe0) obj;
                abe0Var.d.a(view.getContext());
                abe0Var.c.removeView(abe0Var.f);
                abe0Var.f = null;
                break;
            case 9:
                int i3 = ReactionsFragment.j0;
                ((ReactionsFragment) obj).s();
                break;
            case 10:
                vzg0 vzg0Var = (vzg0) obj;
                EditText editText = vzg0Var.f1;
                if (editText != null) {
                    editText.clearFocus();
                }
                LinearLayout linearLayout = vzg0Var.g1;
                if (linearLayout != null) {
                    linearLayout.requestFocus();
                }
                ofk0 ofk0Var = vzg0Var.m1;
                Uri.Builder buildUpon = jeq0.g(ofk0Var.f).buildUpon();
                buildUpon.appendQueryParameter("swap_type", "1");
                ofk0Var.c(buildUpon.build(), true);
                break;
            case 11:
                int i4 = TransferInputFieldView.p;
                ((TransferInputFieldView) obj).n1();
                break;
            case 12:
                q4a0.this.f.n(null);
                break;
            case 13:
                ((lhu0.c.a) obj).b.invoke();
                break;
            case 14:
                ((a2v0.c) obj).q.invoke();
                break;
            default:
                fav0 fav0Var = (fav0) obj;
                fav0Var.a.a();
                dw20 dw20Var = fav0Var.b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    break;
                }
                break;
        }
    }
}
