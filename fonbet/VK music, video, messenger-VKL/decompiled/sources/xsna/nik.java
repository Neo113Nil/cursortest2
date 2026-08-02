package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.views.ToolButton;

/* compiled from: CropFormatAdapter.kt */
/* loaded from: classes4.dex */
public final class nik extends RecyclerView.e0 {
    public final ToolButton l;
    public typ0 m;

    public nik(ToolButton toolButton, o8 o8Var) {
        super(toolButton);
        this.l = toolButton;
        toolButton.setOnClick(new o9(17, this, o8Var));
    }
}
