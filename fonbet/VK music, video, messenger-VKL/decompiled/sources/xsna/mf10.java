package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.markup.view.tools.button.FontButton;

/* compiled from: MarkupFontAdapter.kt */
/* loaded from: classes4.dex */
public final class mf10 extends RecyclerView.e0 {
    public final FontButton l;
    public kzp0 m;

    public mf10(FontButton fontButton, vw4 vw4Var) {
        super(fontButton);
        this.l = fontButton;
        fontButton.setOnClickListener(new amg(3, this, vw4Var));
    }
}
