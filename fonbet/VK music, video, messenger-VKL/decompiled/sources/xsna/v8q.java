package xsna;

import android.content.Context;
import android.widget.Toast;
import com.vk.stories.design.view.editor.PipetteColorPicker;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class v8q implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ v8q(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                Toast.makeText(context, "On click", 0).show();
                return s3q0.a;
            case 1:
                new dw20.b(context, null).w0("Bottom Accessory").s0("Контент скроллится под кнопками с блюром").D0(iy20.f(25, context), false).j0("Готово", new com.vk.movika.sdk.base.model.props.c(21)).V("Отмена", new cy20(0)).I0(null);
                return s3q0.a;
            default:
                int i2 = PipetteColorPicker.s;
                return Float.valueOf(context.getResources().getDimension(R.dimen.story_text_editor_pipette_indent_by_x));
        }
    }

    public /* synthetic */ v8q(iy20 iy20Var, Context context) {
        this.b = 1;
        this.c = context;
    }
}
