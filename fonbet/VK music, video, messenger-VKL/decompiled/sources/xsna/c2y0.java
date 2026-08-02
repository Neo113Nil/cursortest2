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
import java.util.ArrayList;
import xsna.xgy;

/* compiled from: WriteBarWrapper.kt */
/* loaded from: classes17.dex */
public interface c2y0 extends xgy.b {
    void A1(Attachment attachment);

    void B();

    void F();

    void H(com.vk.comments.impl.a aVar, m6a m6aVar);

    void M(View view);

    void N();

    void b(UserId userId, boolean z);

    void c(View.OnKeyListener onKeyListener);

    void d(int i);

    boolean e();

    void f(Runnable runnable, Runnable runnable2);

    EditText getInput();

    ImageView getSendButton();

    CharSequence getText();

    View i();

    ArrayList<Attachment> l();

    void n(boolean z);

    void setAttachLimits(int i);

    void setAutoSuggestPopupListener(StickersView.c cVar);

    void setAutoSuggestTextProvider(lk5 lk5Var);

    void setBottomSheetContainer(ViewGroup viewGroup);

    void setEditTextSelectionChangeListener(wzs<? super Integer, ? super Integer, s3q0> wzsVar);

    void setHidePopup(boolean z);

    void setResultFragment(FragmentImpl fragmentImpl);

    void setText(CharSequence charSequence);

    void t();

    void y(FragmentActivity fragmentActivity);
}
