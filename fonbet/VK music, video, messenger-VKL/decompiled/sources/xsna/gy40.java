package xsna;

import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes3.dex */
public final class gy40 implements gzs<s3q0> {
    public final /* synthetic */ rv40 b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ rv40 e;
    public final /* synthetic */ MusicPlayerPersistentBottomSheet f;
    public final /* synthetic */ int g;

    public gy40(rv40 rv40Var, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, rv40 rv40Var2, MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet, int i) {
        this.b = rv40Var;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = rv40Var2;
        this.f = musicPlayerPersistentBottomSheet;
        this.g = i;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        rv40 rv40Var = this.b;
        int measuredWidth = rv40Var.getMeasuredWidth();
        int measuredHeight = rv40Var.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            int a = iah0.a(48);
            rv40 rv40Var2 = this.e;
            rv40Var2.setY(this.f.getBottom() - (((measuredHeight + this.g) + e3m.a(R.dimen.music_modern_small_player_height, rv40Var2.getContext())) + a));
        }
        return s3q0.a;
    }
}
