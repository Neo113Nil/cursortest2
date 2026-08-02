package defpackage;

import android.view.View;
import com.yandex.bricks.d;
import com.yandex.messaging.internal.view.input.emojipanel.EmojiView;

/* loaded from: classes15.dex */
public final class ktn extends d implements ptn {
    public final EmojiView R;
    public e1k S;
    public final /* synthetic */ mtn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktn(mtn mtnVar, View view) {
        super(view);
        this.T = mtnVar;
        this.S = e1k.M1;
        EmojiView emojiView = (EmojiView) view.findViewById(e9h0.emoji_view);
        this.R = emojiView;
        emojiView.setOnClickListener(new cmi(16, this));
    }

    @Override // defpackage.ptn
    public final void m(otn otnVar) {
        this.R.setData(otnVar);
    }

    @Override // com.yandex.bricks.d, defpackage.ak6
    public final void onBrickDetach() {
        this.S.close();
        this.S = e1k.M1;
    }

    @Override // com.yandex.bricks.d
    public final boolean t(Object obj, Object obj2) {
        return ((String) obj).equals((String) obj2);
    }
}
