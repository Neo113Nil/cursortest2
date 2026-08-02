package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.markup.view.tools.button.PipetteButton;

/* compiled from: MarkupPipetteAdapter.kt */
/* loaded from: classes4.dex */
public final class rf10 extends RecyclerView.e0 {
    public final PipetteButton l;
    public xzp0 m;

    public rf10(PipetteButton pipetteButton, o99 o99Var) {
        super(pipetteButton);
        this.l = pipetteButton;
        pipetteButton.setOnClickListener(new qf10(0, this, o99Var));
    }
}
