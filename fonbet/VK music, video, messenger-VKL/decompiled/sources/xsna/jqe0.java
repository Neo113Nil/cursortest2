package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jqe0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ jqe0(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                new QuestionsListFragment.a().k(this.c);
                return s3q0.a;
            default:
                Drawable a = m33.a(R.drawable.bg_with_shadow_8, this.c);
                if (a instanceof NinePatchDrawable) {
                    return (NinePatchDrawable) a;
                }
                return null;
        }
    }
}
