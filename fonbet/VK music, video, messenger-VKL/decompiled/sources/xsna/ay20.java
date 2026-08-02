package xsna;

import android.content.Context;
import com.vk.stories.design.view.editor.PipetteColorPicker;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ay20 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Context c;

    public /* synthetic */ ay20(Context context) {
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                dw20.b D0 = new dw20.b(context, null).w0("Dynamic blur").s0("Фон за шитом блюрится каждый кадр").D0(iy20.f(8, context), false);
                D0.getClass();
                D0.d.I1 = true;
                D0.I0(null);
                return s3q0.a;
            default:
                int i2 = PipetteColorPicker.s;
                return Float.valueOf(context.getResources().getDimension(R.dimen.story_text_editor_pipette_indent_by_y));
        }
    }
}
