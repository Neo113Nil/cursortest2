package xsna;

import android.graphics.Bitmap;
import com.vkontakte.android.R;

/* compiled from: MultiStoryItem.kt */
/* loaded from: classes16.dex */
public final class h640 extends zif0 {
    public Bitmap a;
    public boolean b;
    public final boolean c;

    public h640(Bitmap bitmap, boolean z, boolean z2) {
        this.a = bitmap;
        this.b = z;
        this.c = z2;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.item_editor_story;
    }
}
