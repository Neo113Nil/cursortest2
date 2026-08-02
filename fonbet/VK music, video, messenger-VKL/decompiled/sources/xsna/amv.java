package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.stickers.autosuggest.QuickStickerSuggestState;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: IAutoSuggestStickersPopupWindow.kt */
/* loaded from: classes5.dex */
public interface amv {
    boolean c();

    void d();

    void disable();

    void e(QuickStickerSuggestState quickStickerSuggestState);

    void enable();

    void g();

    void h(boolean z);

    void i();

    AtomicBoolean isEnabled();

    void j();

    void k(ojf0 ojf0Var);

    void l(View view);

    void m(jzb0 jzb0Var);

    int n();

    void q();

    void r();

    void s(boolean z);

    void setAutoSuggestTextProvider(lk5 lk5Var);

    void setBottomSheetContainer(ViewGroup viewGroup);

    void t(int i);

    void u();

    void w(StickersDictionaryItem stickersDictionaryItem);
}
