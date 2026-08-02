package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;

/* compiled from: MarkupColorsAdapter.kt */
/* loaded from: classes4.dex */
public final class if10 extends RecyclerView.e0 {
    public final ColorButton l;
    public jzp0 m;

    public if10(ColorButton colorButton, final uw4 uw4Var) {
        super(colorButton);
        this.l = colorButton;
        colorButton.setOnClickListener(new View.OnClickListener() { // from class: xsna.hf10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jzp0 jzp0Var = if10.this.m;
                if (jzp0Var != null) {
                    uw4Var.invoke(jzp0Var);
                }
            }
        });
    }
}
