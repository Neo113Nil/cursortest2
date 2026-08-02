package androidx.emoji2.emojipicker;

import android.content.Context;
import defpackage.btn;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;

/* loaded from: classes10.dex */
public final class c extends btn {
    public final /* synthetic */ EmojiPickerView a;
    public final /* synthetic */ Context b;

    public c(EmojiPickerView emojiPickerView, Context context) {
        this.a = emojiPickerView;
        this.b = context;
    }

    @Override // defpackage.btn
    public final void a(Throwable th) {
    }

    @Override // defpackage.btn
    public final void b() {
        tse tseVar;
        EmojiPickerView.Companion.getClass();
        EmojiPickerView.emojiCompatLoaded = true;
        EmojiPickerView emojiPickerView = this.a;
        tseVar = emojiPickerView.scope;
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b, null, new EmojiPickerView$2$onInitialized$1(this.b, emojiPickerView, null), 2);
    }
}
