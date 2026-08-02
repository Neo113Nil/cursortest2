package defpackage;

import androidx.emoji2.emojipicker.EmojiPickerView;
import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes10.dex */
public final class iun extends GridLayoutManager.b {
    public final /* synthetic */ EmojiPickerView d;

    public iun(EmojiPickerView emojiPickerView) {
        this.d = emojiPickerView;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        ztn ztnVar;
        EmojiPickerView emojiPickerView = this.d;
        ztnVar = emojiPickerView.emojiPickerItems;
        if (ztnVar == null) {
            ztnVar = null;
        }
        int i2 = hun.a[ztnVar.b(i).a.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return emojiPickerView.getEmojiGridColumns();
        }
        return 1;
    }
}
