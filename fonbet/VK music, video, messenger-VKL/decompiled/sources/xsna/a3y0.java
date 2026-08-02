package xsna;

import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import java.util.List;
import xsna.f3y0;

/* compiled from: WriteView.java */
/* loaded from: classes3.dex */
public final class a3y0 extends StickersView.c {
    public final /* synthetic */ f3y0 c;

    public a3y0(f3y0 f3y0Var) {
        this.c = f3y0Var;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    @Nullable
    public final ContextUser e() {
        return this.c.T.e();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    @NonNull
    public final List<UserId> h() {
        return this.c.T.h();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean i() {
        return his0.s(this.c.n);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void n(int i) {
        this.c.T.n(i);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void o(int i, @NonNull String str, @Nullable ContextUser contextUser) {
        this.c.T.o(i, str, contextUser);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void p(StickerItem stickerItem, int i, String str) {
        f3y0 f3y0Var = this.c;
        if (f3y0Var.T != null) {
            f3y0.c cVar = f3y0Var.W;
            EditText editText = f3y0Var.n;
            f3y0Var.S = "";
            editText.removeTextChangedListener(cVar);
            editText.setText("");
            editText.addTextChangedListener(cVar);
            f3y0Var.T.p(stickerItem, i, str);
        }
        f3y0Var.t.r();
    }
}
