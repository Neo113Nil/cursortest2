package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.stickers.keyboard.StickersView;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;

/* compiled from: MarketItemWriteBarWrapper.kt */
/* loaded from: classes17.dex */
public final class d510 implements c2y0 {
    public final WriteBar b;

    public d510(WriteBar writeBar) {
        this.b = writeBar;
    }

    @Override // xsna.c2y0
    public final void A1(Attachment attachment) {
        this.b.A1(attachment);
    }

    @Override // xsna.c2y0
    public final void B() {
        this.b.B();
    }

    @Override // xsna.xgy.b
    public final void E(boolean z, xgy xgyVar) {
        this.b.E(z, xgyVar);
    }

    @Override // xsna.c2y0
    public final void F() {
        this.b.F();
    }

    @Override // xsna.c2y0
    public final void H(com.vk.comments.impl.a aVar, m6a m6aVar) {
        WriteBar writeBar = this.b;
        writeBar.setWriteBarSendListener(aVar);
        writeBar.setWriteBarStickersListener(m6aVar);
    }

    @Override // xsna.c2y0
    public final void M(View view) {
        this.b.M(view);
    }

    @Override // xsna.c2y0
    public final void N() {
        this.b.N();
    }

    @Override // xsna.c2y0
    public final void b(UserId userId, boolean z) {
        this.b.b(userId, true);
    }

    @Override // xsna.c2y0
    public final void c(View.OnKeyListener onKeyListener) {
        this.b.P.add(onKeyListener);
    }

    @Override // xsna.c2y0
    public final void d(int i) {
        WriteBar writeBar = this.b;
        writeBar.getState().g = i;
        writeBar.p0();
    }

    @Override // xsna.c2y0
    public final boolean e() {
        return this.b.e();
    }

    @Override // xsna.c2y0
    public final void f(Runnable runnable, Runnable runnable2) {
        this.b.f(runnable, runnable2);
    }

    @Override // xsna.c2y0
    public final EditText getInput() {
        return this.b.getInput();
    }

    @Override // xsna.c2y0
    public final ImageView getSendButton() {
        return this.b.getSendButton();
    }

    @Override // xsna.c2y0
    public final CharSequence getText() {
        return this.b.getText();
    }

    @Override // xsna.c2y0
    public final View i() {
        return this.b.getEmojiAnchor();
    }

    @Override // xsna.c2y0
    public final ArrayList<Attachment> l() {
        return this.b.getAttachments();
    }

    @Override // xsna.c2y0
    public final void n(boolean z) {
        this.b.n(false);
    }

    @Override // xsna.xgy.b
    public final void q(xgy xgyVar) {
        this.b.q(xgyVar);
    }

    @Override // xsna.c2y0
    public final void setAttachLimits(int i) {
        this.b.setAttachLimits(2);
    }

    @Override // xsna.c2y0
    public final void setAutoSuggestPopupListener(StickersView.c cVar) {
        this.b.setAutoSuggestPopupListener(cVar);
    }

    @Override // xsna.c2y0
    public final void setAutoSuggestTextProvider(lk5 lk5Var) {
        this.b.setAutoSuggestTextProvider(lk5Var);
    }

    @Override // xsna.c2y0
    public final void setBottomSheetContainer(ViewGroup viewGroup) {
        this.b.setBottomSheetContainer(viewGroup);
    }

    @Override // xsna.c2y0
    public final void setEditTextSelectionChangeListener(wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        this.b.setEditTextSelectionChangeListener(wzsVar);
    }

    @Override // xsna.c2y0
    public final void setHidePopup(boolean z) {
        this.b.setHidePopup(true);
    }

    @Override // xsna.c2y0
    public final void setResultFragment(FragmentImpl fragmentImpl) {
        this.b.setResultFragment(fragmentImpl);
    }

    @Override // xsna.c2y0
    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // xsna.c2y0
    public final void t() {
        this.b.t();
    }

    @Override // xsna.c2y0
    public final void y(FragmentActivity fragmentActivity) {
        int i = WriteBar.h0;
        this.b.S(fragmentActivity, null);
    }

    @Override // xsna.xgy.b
    public final void D() {
    }
}
