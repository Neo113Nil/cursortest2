package xsna;

import android.graphics.Canvas;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.dto.stories.model.clickable.ClickableStickers;

/* compiled from: ClickableStickerDTO.kt */
/* loaded from: classes6.dex */
public interface xjc {
    void a(ClickablePoll clickablePoll);

    boolean b(y5p0 y5p0Var, ClickableApp clickableApp);

    void c();

    boolean d(y5p0 y5p0Var, ClickableStickers clickableStickers, float f, float f2, Long l);

    void e(Canvas canvas, ClickableStickers clickableStickers);

    /* compiled from: ClickableStickerDTO.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final xjc STUB = new C4009a();

        public final xjc getSTUB() {
            return STUB;
        }

        /* compiled from: ClickableStickerDTO.kt */
        /* renamed from: xsna.xjc$a$a, reason: collision with other inner class name */
        public static final class C4009a implements xjc {
            @Override // xsna.xjc
            public final boolean b(y5p0 y5p0Var, ClickableApp clickableApp) {
                return false;
            }

            @Override // xsna.xjc
            public final boolean d(y5p0 y5p0Var, ClickableStickers clickableStickers, float f, float f2, Long l) {
                return false;
            }

            @Override // xsna.xjc
            public final void c() {
            }

            @Override // xsna.xjc
            public final void a(ClickablePoll clickablePoll) {
            }

            @Override // xsna.xjc
            public final void e(Canvas canvas, ClickableStickers clickableStickers) {
            }
        }
    }
}
