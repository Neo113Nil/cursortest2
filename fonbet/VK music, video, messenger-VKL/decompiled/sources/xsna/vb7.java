package xsna;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.vkontakte.android.R;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* loaded from: classes12.dex */
public final class vb7 implements pag0 {
    public final Object b;
    public Object c;

    public vb7() {
        int l;
        String[] strArr = {y8g0.e(R.string.story_question_text_hint_0), y8g0.e(R.string.story_question_text_hint_1), y8g0.e(R.string.story_question_text_hint_2), y8g0.e(R.string.story_question_text_hint_3), y8g0.e(R.string.story_question_text_hint_4), y8g0.e(R.string.story_question_text_hint_5), y8g0.e(R.string.story_question_text_hint_6)};
        xpk xpkVar = new xpk(strArr, new String[]{y8g0.e(R.string.story_question_button_hint_0), y8g0.e(R.string.story_question_button_hint_1), y8g0.e(R.string.story_question_button_hint_2), y8g0.e(R.string.story_question_button_hint_3), y8g0.e(R.string.story_question_button_hint_4), y8g0.e(R.string.story_question_button_hint_5), y8g0.e(R.string.story_question_button_hint_6)}, new y6c(this, 14));
        this.b = xpkVar;
        this.c = "";
        xpkVar.b(strArr[0]);
        do {
            l = qz9.b(System.currentTimeMillis()).l(0, xpkVar.a.length);
        } while (xpkVar.d == l);
        xpkVar.a(l);
    }

    @Override // xsna.yip
    public boolean h(@NonNull Object obj, @NonNull File file, @NonNull au80 au80Var) {
        return ((yb7) this.c).h(new wc7(((BitmapDrawable) ((hag0) obj).get()).getBitmap(), (tc7) this.b), file, au80Var);
    }

    @Override // xsna.pag0
    @NonNull
    public EncodeStrategy j(@NonNull au80 au80Var) {
        return EncodeStrategy.TRANSFORMED;
    }

    public vb7(tc7 tc7Var, yb7 yb7Var) {
        this.b = tc7Var;
        this.c = yb7Var;
    }
}
