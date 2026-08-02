package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.ironsource.B5;
import com.vk.core.exceptions.DisposableException;
import com.vk.dto.common.ImageSizeKey;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import xsna.b9a0;
import xsna.ea6;
import xsna.l6w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fo1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fo1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.disposables.b) this.c).dispose();
                return;
            case 1:
                ((ea6.a) this.c).d.getClass();
                return;
            case 2:
                ((d7w) this.c).c(l6w.b.h.a);
                return;
            case 3:
                vf20 vf20Var = (vf20) this.c;
                r920 r920Var = vf20Var.a;
                io.reactivex.rxjava3.subjects.d<Boolean> dVar = vf20Var.h;
                if (r920Var.e()) {
                    dVar.onNext(Boolean.TRUE);
                    return;
                } else if (vf20Var.b.h.get()) {
                    dVar.onNext(Boolean.TRUE);
                    return;
                } else {
                    dVar.onNext(Boolean.FALSE);
                    return;
                }
            case 4:
                Context context = (Context) this.c;
                try {
                    Paint paint = new Paint(1);
                    paint.setSubpixelText(true);
                    cko0.a(paint, context, R.attr.vk_ui_typography_paragraph_normal);
                    float f = -paint.getFontMetrics().ascent;
                    Bitmap createBitmap = Bitmap.createBitmap(64, 64, Bitmap.Config.ALPHA_8);
                    try {
                        Canvas canvas = new Canvas(createBitmap);
                        for (char c = 'A'; c < '['; c = (char) (c + 1)) {
                            g170.a(canvas, f, paint, c);
                        }
                        for (char c2 = 'a'; c2 < '{'; c2 = (char) (c2 + 1)) {
                            g170.a(canvas, f, paint, c2);
                        }
                        char c3 = 1040;
                        while (true) {
                            if (c3 >= 1072) {
                                for (char c4 = 1072; c4 < 1104; c4 = (char) (c4 + 1)) {
                                    g170.a(canvas, f, paint, c4);
                                }
                                for (char c5 = ImageSizeKey.SIZE_KEY_UNDEFINED; c5 < ':'; c5 = (char) (c5 + 1)) {
                                    g170.a(canvas, f, paint, c5);
                                }
                                Character[] chArr = {Character.valueOf(JwtParser.SEPARATOR_CHAR), ',', '!', '?', '@', '#', '%', '&', '(', ')', '-', '+', Character.valueOf(B5.U), '/', '\\', 8470, ' ', '[', ']'};
                                for (int i = 0; i < 19; i++) {
                                    g170.a(canvas, f, paint, chArr[i].charValue());
                                }
                                createBitmap.recycle();
                                return;
                            }
                            g170.a(canvas, f, paint, c3);
                            c3 = (char) (c3 + 1);
                        }
                    } catch (Throwable th) {
                        createBitmap.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    L.i(th2);
                    return;
                }
            case 5:
                yp80 yp80Var = (yp80) this.c;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    return;
                }
                return;
            case 6:
                ((im90) this.c).b.r();
                return;
            case 7:
                ((com.vk.photos.root.photoflow.presentation.b) this.c).h.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.album_details_photo_delete_success), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, null, 32)));
                return;
            default:
                com.vk.superapp.widget_settings.p004new.b bVar = (com.vk.superapp.widget_settings.p004new.b) this.c;
                if (bVar.m.decrementAndGet() == 0) {
                    bVar.l.e();
                    bVar.e.onNext(Boolean.FALSE);
                    return;
                }
                return;
        }
    }
}
